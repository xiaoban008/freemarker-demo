<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freeMaker测试页</title>
    <!--引入bootstrap样式-->
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <ul class="nav nav-tabs">
        <li role="presentation" class="active"><a href="#">主页</a></li>
        <li role="presentation"><a href="#">修饰用</a></li>
        <li role="presentation"><a href="#">测试啦</a></li>
    </ul>
    <hr>
    <div class="title">hello ${name}!</div>
    <hr>
    <h3>列表测试</h3>
    <ul class="list-unstyled">
        <#list names as item>
            <li class="col">${item}</li>
        </#list>
    </ul>
</div>
<div class="footer text-center">
    2021 ${name}!
</div>
</body>
</html>