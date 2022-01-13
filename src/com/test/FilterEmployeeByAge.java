package com.test;

public class FilterEmployeeByAge implements MyPredicate<Employee>  {
    @Override
    public boolean test(Employee employee) {
        return  employee.getAge() > 25;
    }


}
