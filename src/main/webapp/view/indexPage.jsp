<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Accueil</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../static/css/index.css">
</head>
<body>
    <!-- Title with new font-family-->
    <h1>Quizz.io</h1>
    <div class="container">
        <div class="row vertical-offset-400">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form accept-charset="utf-8" action="/login" role="form" class="form-signin">
                            <fieldset>
                                <label class="panel-login">
                                    <div class="login_result"></div>
                                </label>
                                <input class="form-control" placeholder="login" id="username" name="username" type="text">
                                <br><br>
                                <input class="btn btn-lg btn-success btn-block" type="submit" id="login" value="Jouer">
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
