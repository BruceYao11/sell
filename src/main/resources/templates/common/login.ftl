<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" style="max-width:330px;margin:100px auto" action="/sell/seller/common/check" method="post">
                <h2>欢迎登录</h2>
                <div class="form-group">
                    <label for="exampleInputEmail1">用户名</label><input type="text" class="form-control" name="sellerId" />
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" name="password" />
                </div>
                <button type="submit" class="btn btn-block">登录</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>