<!DOCTYPE html>
<html>
	<head>		
		<meta name="layout" content="main"/>
		<title>Form String</title>
	</head>
	<h1>Add String</h1>
	<g:form  >
		<label>String 1: </label>
        <g:textField name="string1" /><br/>
        <label>String 2: </label>
        <g:textField name="string2" /><br/>
        <label>Result: ${answer} </label>
        <g:actionSubmit value="Add" action="addString"/>
        
	</g:form>
</html>