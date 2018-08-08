<!DOCTYPE html>
<html>
	<head>		
		<meta name="layout" content="main"/>
		<title>Form String</title>
	</head>
	<h1>Add String</h1>
	<g:form  action="addString">
		<label>String 1: </label>
        <g:textField name="string1" value="${string1}"/><br/>
        <label>String 2: </label>
        <g:textField name="string2" value="${string2}"/><br/>
        <g:actionSubmit value="Add"/>
	</g:form>
</html>