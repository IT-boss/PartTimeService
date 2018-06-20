<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Rejister</title>
</head>
<script>
    function userRegister() {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                if (xmlhttp.responseText == "true") {
                    document.getElementById("test").innerHTML = "success!";
                } else if (xmlhttp.responseText == "false") {
                    document.getElementById("test").innerHTML = "failed!";
                } else if (xmlhttp.responseText == "error") {
                    document.getElementById("test").innerHTML = "error!";
                }
            }
        }
        var name = document.getElementById("name").value;
        var psw = document.getElementById("password").value;
        var gender = document.getElementById("gender").value;
        var barth = document.getElementById("borthday").value;
        var email = document.getElementById("email").value;

        xmlhttp.open("POST", "baseUser/insertUser", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("username=" + name + "&password=" + psw + "&gender=" + gender + "&borthday=" + barth + "&email=" + email);
    }
</script>
<body>

<p id="test"> Register</p>

<p><span>username:</span><input type="text" id="name"></p>
<p><span>password:</span><input type="text" id="password"></p>
<p><span>gender  :</span><input type="text" id="gender"></p>
<p><span>borthday:</span><input type="date" id="borthday"></p>
<p><span>email   :</span><input type="text" id="email"></p>

<p><input type="button" value="submit" onclick="userRegister()"></p>

</body>
</html>
