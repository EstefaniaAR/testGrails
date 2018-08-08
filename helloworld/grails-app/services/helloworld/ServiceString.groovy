package helloworld

class ServiceString 
{

	def String substractString(string1,string2)
	{
		return string1 - string2
	}
	
	def String addString(string1,string2)
	{
		return string1+string2
	}

	def String multiplyString(string1,number)
	{
		return string1*number;
	}
	def String replaceString(String string1,String regex,String rep)
	{
		return string1.replaceAll(regex,rep)
	}
	
	def String padding(String string1,int pad,direction,String strPad)
	{
		if(direction.equals('left'))
			return string1.padLeft(pad,strPad)
		else
			return string1.padRight(pad,strPad)
	}
	
	
}
