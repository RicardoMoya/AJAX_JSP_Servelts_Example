<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX JSP Servelts</title>
<script src="http://code.jquery.com/jquery-latest.js">
	
</script>
<script>
	$(document).ready(function() {
		$('#submit').click(function(event) {
			var nombreVar = $('#nombre').val();
			var apellidoVar = $('#apellido').val();
			var edadVar = $('#edad').val();
			$.post('ActionServlet', {
				nombre : nombreVar,
				apellido: apellidoVar,
				edad: edadVar
			}, function(responseText) {
				$('#tabla').html(responseText);
			});
		});
	});
</script>
</head>
<body>
	<h2>Ejemplo de AJAX con JSP y Servelts</h2>
	<form id="form1">
		Nombre:<input type="text" id="nombre" /> <br>
		Apellido: <input type="text" id="apellido" /> <br>
		Edad: <input type="text" id="edad" /> <br>
		<input type="button" id="submit" value="A�adir" /> 
	</form>
	<br>
	<div id="tabla"></div>
</body>
</html>