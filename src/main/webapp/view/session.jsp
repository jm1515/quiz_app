<%
    String username = (String) request.getAttribute("username");
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Session</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="../static/js/default.js"></script>
    <link rel="stylesheet" href="../static/css/session.css">
</head>
<body>
<div id="progressBar">
    <div class="bar"></div>
</div>
<div class="container-fluid bg-info">
    <div class="col-xs-2 ranking-players">
        <div class="modal-content classement">
            <div class="modal-header">
                <h3>LeaderBoard</h3>
            </div>
            <div class="modal-body" id="leaderboard">
            </div>
        </div>
    </div>
    <div class="col-xs-5 modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3><span class="label label-warning" id="qid"></span> <span class="question-entitled" id="questionlib"> </span></h3>
            </div>
            <div class="modal-body">
                <div class="col-xs-3 col-xs-offset-5">
                    <div id="loadbar" style="display: none;">
                        <div class="blockG" id="rotateG_01"></div>
                        <div class="blockG" id="rotateG_02"></div>
                        <div class="blockG" id="rotateG_03"></div>
                        <div class="blockG" id="rotateG_04"></div>
                        <div class="blockG" id="rotateG_05"></div>
                        <div class="blockG" id="rotateG_06"></div>
                        <div class="blockG" id="rotateG_07"></div>
                        <div class="blockG" id="rotateG_08"></div>
                    </div>
                </div>

                <form action="/dataSession">
                    <div class="quiz" id="quiz" data-toggle="buttons">
                        <label onclick="" class="element-animation1 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="1"><span class="response-Entitled-1" id="rep1"></span></label>
                        <label onclick="" class="element-animation2 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="2"><span class="response-Entitled-2" id="rep2"></span></label>
                        <label onclick="" class="element-animation3 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="3"><span class="response-Entitled-3" id="rep3"></span></label>
                        <label onclick="" class="element-animation4 btn btn-lg btn-primary btn-block"><span class="btn-label"><i class="glyphicon glyphicon-chevron-right"></i></span> <input type="radio" name="q_answer" value="4"><span class="response-Entitled-4" id="rep4"></span></label>
                    </div>
                </form>
            </div>
            <div class="modal-footer text-muted">
                <span id="answer"></span>
            </div>
        </div>
    </div>
</div>
</body>


<script type="text/javascript">
    setUsername('<%= username%>');
</script>

</html>
