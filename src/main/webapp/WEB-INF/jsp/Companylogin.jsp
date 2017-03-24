<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/favicon.ico">

    <title>登录</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        .container {
            width: 400px;
            padding: 15px;
            margin-top: 50px;
            border-radius: 20px;
            -moz-border-radius: 20px;
            -webkit-border-radius: 20px;
            background-color: rgba(0, 255, 1, 0.18);
        }

        .form-signin {
            max-width:360px;
            padding: 0 15px 15px 15px;
            margin:0 auto;
        }

        .form-signin .form-signin-heading,

        .form-signin .form-control{
            position: relative;
            height:auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }

        .form-signin .form-control:focus{
            z-index: 2;
        }

        .form-signin input[type="email"]{
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form-signin input[type="password"]{
            margin-bottom:10px;
            border-top-left-radius: 0;
            border-bottom-right-radius: 0;
        }

        .bbutton{
            height: 44.8333px;
        }

        .bbutton .login{
            float: left;
            width: 140px;
        }
        .bbutton .register{
            width: 140px;
            float: right;
        }


        .footer{
            text-align: center;
        }

        .footer-fixed-bottom{
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            clear: both;
        }

        .personLogin{
            float: left;
        }
    </style>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div>
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <img alt="Brand" src="images/favicon.ico">
            </a>
        </div>
        <div>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="index.jsp">回到主页&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container" align="center">
    <form name="loginForm" class="form-signin" action="" method="post">
        <h3 class="form-signin-heading"><span class="glyphicon glyphicon-user" aria-hidden="false"></span>请登录</h3>

        <label for="inputEmail" class="sr-only">电子邮件</label>
        <input type="email" id="inputEmail" name="username" class="form-control" placeholder="电子邮件" required autofocus>

        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="密码" required>

        <a href="Users_login.jsp" class="personLogin">切换到个人登陆</a><div>&nbsp</div>
        <div class="bbutton">
            <input class="btn btn-lg btn-primary login" type="submit" value="登录" onclick="">
            <a class="btn btn-lg btn-primary register" href="register.jsp" type="button">注册</a>
        </div>

    </form>

</div> <!-- /container -->

<footer class="panel-footer footer footer-fixed-bottom">
    <!-- Footnotes -->
    <div id="wyu-footer-column">
        <!-- Toolbar -->
        <div id="wyu-footer-notes">
            <div class="addr">
                <p>版权所有&copy;五邑大学&nbsp;&nbsp;
                    地址：广东江门市东成村22号&nbsp;&nbsp;
                    邮编：529020&nbsp;&nbsp;
                    五邑大学党政办：(0750)3296113&nbsp;&nbsp;
                    传真：(0750)3358395&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    粤ICP备15096031号</p>
                <p><a href="#" target="_self">招生咨询</a>&nbsp;&nbsp;全日制本科招生咨询：(0750)3296263，3296265&nbsp;&nbsp;
                    网络管理中心：(0750)3296114&nbsp;&nbsp;
                    校长信箱：<a href="mailto:wyuxfyx@126.com">wyuxfyx@126.com</a></p>
            </div>
        </div>
        <!-- /Toolbar -->
    </div>
    <!-- /Footnotes -->
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>