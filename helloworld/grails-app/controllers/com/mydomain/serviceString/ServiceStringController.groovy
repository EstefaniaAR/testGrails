package com.mydomain.serviceString

import helloworld.ServiceString
import helloworld.StringDomain

class ServiceStringController 
{

	def index()
	{
	}
	
    def serviceString() 
	{
	}
	
	def addStringForm()
	{
	}
	
	def addString(String string1,String string2)
	{
		ServiceString svc = new ServiceString()
		render (view:'addStringForm', model:[answer:svc.addString(string1, string2)])
	}
	def substStringForm()
	{
		
	}
	def substString(String string1,String string2)
	{
		ServiceString svc = new ServiceString()
		render (view:'substStringForm', model:[answer:svc.substractString(string1, string2)])
	}
	def multStringForm()
	{
		
	}
	def multString(String string,int number)
	{
		ServiceString svc = new ServiceString()
		render (view:'multStringForm', model:[answer:svc.multiplyString(string, number)])
	}
}
