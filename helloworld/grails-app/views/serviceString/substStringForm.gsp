<!DOCTYPE html>
<html>
	<head>		
		<meta name="layout" content="main"/>
		<title>Substract String</title>
	</head>
	<h1>Substract String</h1>
	<g:form  >
		<label>String 1: </label>
        <g:textField name="string1" /><br/>
        <label>String 2: </label>
        <g:textField name="string2" /><br/>
        <label>Result: ${answer} </label>
        <br/>
        <g:actionSubmit value="Substract" action="substString"/>
        
	</g:form>
</html>