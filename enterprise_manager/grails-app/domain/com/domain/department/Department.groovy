package com.domain.department

import com.domain.employee.Employee
import groovy.transform.ToString

@ToString
class Department 
{
	Long id
	String description
	
	
    static constraints = {
    }
	
}
