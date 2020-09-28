var ws = null;
var iswaiting = false;
var username;
var timeleftforquestion;
var clicked;

$(function(){
    if (ws === null) {
        openWebSocket();
    }

    var loading = $('#loadbar').hide();
    $(document)
        .ajaxStart(function () {
            loading.show();
        }).ajaxStop(function () {
        loading.hide();
    });

    $("label.btn").on('click',function () {
        if (!clicked) {
            var choice = $(this).find('input:radio').val();

            $('#loadbar').show();
            $('#quiz').fadeOut();
            setTimeout(function () {
                $("#answer").html($(this).checking(choice));
                $('#quiz').show();
                $('#loadbar').fadeOut();
                /* something else */
            }, 1500);
        }
    });
    checkResponse();
});

function setUsername(newUsername){
    username = newUsername;
}

function setQuestionLib(content) {
    var questionlib = document.getElementById('questionlib');
    var rep1 = document.getElementById('rep1');
    var rep2 = document.getElementById('rep2');
    var rep3 = document.getElementById('rep3');
    var rep4 = document.getElementById('rep4');
    var questionnum = document.getElementById("qid");

    var replist = content.data.split(";")
    questionlib.innerHTML = replist[1];
    rep1.innerHTML = replist[2];
    rep2.innerHTML = replist[3];
    rep3.innerHTML = replist[4];
    rep4.innerHTML = replist[5];
    $ans = replist[6];

    questionnum.innerHTML = replist[7];
}

function waitCurrentIsOver() {
    iswaiting = true;
    var questionlib = document.getElementById('questionlib');
    questionlib.innerHTML = 'waiting next question';
    $('#quiz').hide();
}

function stopWaiting() {
    iswaiting = false;
    $('#loadbar').show();
    setTimeout(function(){
        $('#quiz').show();
        $('#loadbar').fadeOut();
        $( "#answer" ).html();
        $('#quiz .active').removeClass("active");
    }, 100);
    progress(20, 20, $('#progressBar'))
}

function openWebSocket() {
    var url = 'ws://localhost:8082/ws';
    ws = new WebSocket(url);
    ws.onopen = function () {
        ws.send('name ' + username)
    };

    ws.onclose = function () {
    }
    ws.onmessage = function(content) {
        if(content.data === 'wait'){
            waitCurrentIsOver();
        }
        if (content.data.startsWith("ranks")) {
            updateRanking(content.data)
        }
        if(content.data.startsWith("quest")) {
            if (iswaiting) {
                stopWaiting();
            }
            clicked = false;
            setQuestionLib(content)
            progress(20, 20, $('#progressBar'));
        }
        if(content.data === 'end'){
            $('#quiz').hide();
            $(location).attr('href', 'http://localhost:8082/leaderboard')
        }
    }
}

function updateRanking(data){
    var dataTable = data.split(":");
    var lb = document.getElementById("leaderboard");
    lb.innerHTML = '';
    for (var i = 1; i < dataTable.length-1; i++){
        var para = document.createElement("p");
        var node = document.createTextNode(dataTable[i]);
        para.appendChild(node);
        if (i === 1){
            para.style.fontWeight = "900";
        }
        lb.appendChild(para);
    }
}

function progress(timeleft, timetotal, $element) {
    timeleftforquestion = timeleft;
    var progressBarWidth = timeleft * $element.width() / timetotal;
    $element.find('div').css('background-color', '#07ff2b');

    $element.find('div').animate({ width: progressBarWidth }, 500).html(timeleft%60);
    if(timeleft > 0) {
        var timeout_token = setTimeout(function() {
            progress(timeleft - 1, timetotal, $element);
        }, 1000);
    }
    if(timeleft > 0 && timeleft < 10){
        $element.find('div').css('background-color', '#ffc033');
    }

    if(timeleft > 0 && timeleft < 5){
        $element.find('div').css('background-color', '#FF6600');
    }

    if(timeleft === 0){
        $('#quiz').hide();
        $('#loadbar').show();
        setTimeout(function(){
            $("#quiz .btn").css('background-color', "#428bca");
            $('#quiz').show();
            $('#loadbar').fadeOut();
            $( "#answer" ).html();
            $('#quiz .active').removeClass("active");
        }, 500);
    }

};

function checkResponse() {
    $.fn.checking = function (ck) {
        if (!clicked) {
            clicked = true;
            if (ck != $ans)
                $("#quiz .active").css('background-color', "red");
        else {
                $("#quiz .active").css('background-color', "green");
                ws.send('correct ' + timeleftforquestion);
            }
        }
    };
}

function sleep(miliseconds) {
    var currentTime = new Date().getTime();

    while (currentTime + miliseconds >= new Date().getTime()) {
    }
}