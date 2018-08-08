<!DOCTYPE html>
<html>
	<head>		
		<meta name="layout" content="main"/>
		<title>Multiply String</title>
	</head>
	<h1>Multiply String</h1>
	<g:form  >
		<label>String: </label>
        <g:textField name="string" /><br/>
        <label>Number: </label>
        <g:textField name="number" /><br/>
        <label>Result: ${answer} </label>
        <br/>
        <g:actionSubmit value="Multiplify" action="multString"/>
        
	</g:form>
</html>