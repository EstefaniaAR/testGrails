package com.domain.employee
import com.domain.department.Department

class Employee {
	Long id
	String name
	String lastName
	String salary
	
	Department department
	
    static constraints =
	 {
		    }
}
