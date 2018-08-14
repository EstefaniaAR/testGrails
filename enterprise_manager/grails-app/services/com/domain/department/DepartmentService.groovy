package com.domain.department

import grails.gorm.services.Service

@Service(Department)
interface DepartmentService {

    Department get(Serializable id)

    List<Department> list(Map args)

    Long count()

    void delete(Serializable id)

    Department save(Department department)

}