<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
    <div align="center">
        <form action ="saveCar">
         <label for = "nome">Nome:</label><br/>
         <input type = "text" name = "nome"/><br/><br/>
         
         <label for = "ano">Ano:</label><br/>
         <input type = "text" name = "ano"/><br/><br/>
         
         <label for = "cambio">Cambio:</label><br/>
         <input type = "text" name = "cambio"/><br/><br/>
         
         <input type = "submit" value = "Enviar"/>
      </form>
    </div>
</body>
</html>