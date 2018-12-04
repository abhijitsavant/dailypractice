
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>
	<form action="savefile" method="post" enctype="multipart/form-data">
		Select File: <input type="file" name="file" /> <input type="submit"
			value="Upload File" />
	</form>
	<h1>Upload Success</h1>  
<img src="${filename}"/> 
</body>
</html>
