<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ssm test</title>
</head>
<script>

    function selectUserById() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        }
        var index_num = document.getElementById("index_s").value;
        document.getElementById("delete").innerHTML = index_num;
        xmlhttp.open("POST", "baseUser/showBaseUser.id", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("id=" + index_num);
    }

    function selectUserByName() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                document.getElementById("test").innerHTML = xmlhttp.responseText;
            }
        }
        var index_num = document.getElementById("index_name").value;
        document.getElementById("delete").innerHTML = index_num;
        xmlhttp.open("POST", "baseUser/showBaseUser.name", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("name=" + index_num);
    }

</script>
<body>
<p id="test">Hello World!</p>
<p id="delete">just a test</p>
<p>
    <input type="number" id="index_s" value="2"/>
    <button type="button" onclick="selectUserById()">onclick test</button>
</p>

<p>
    <input type="text" id="index_name" value="..."/>
    <input type="button" onclick="selectUserByName()" value="select user"/>
</p>


</body>
</html>