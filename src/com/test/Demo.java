package com.test;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

    @Test
    public void test1(){

        //将数组转换成集合的
        List<Employee> employees = Arrays.asList(
                new Employee("张三",23,3333.33),
                new Employee("李四",24,4444.44),
                new Employee("王五",25,5555.55),
                new Employee("赵六",26,6666.66),
                new Employee("田七",27,7777.77)
        );

        MyPredicate<Employee> e = new FilterEmployeeByAge();
        System.out.println(filterEmployees(employees,e));
    }



    //
    @Test
    //优化方式二 ： 使用匿名内部类  这样的好处是不要创建一个额外的 策略类
    public void test2(){

        List<Employee> employees = Arrays.asList(
                new Employee("张三",23,3333.33),
                new Employee("李四",24,4444.44),
                new Employee("王五",25,5555.55),
                new Employee("赵六",26,6666.66),
                new Employee("田七",27,7777.77)
        );

        List<Employee> list = filterEmployees(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() > 5000;
            }
        });
        for (Employee emp:list) {

            System.out.println(emp);
        }
    }

    public List<Employee> filterEmployees(List<Employee>list, MyPredicate<Employee>mp){
        List<Employee>emps = new ArrayList<>();
        for(Employee emp : list){
            if(mp.test(emp)){  //调用相应的过滤器
                emps.add(emp);
            }
        }
        return emps;
    }

    //优化方式三-使用Lambda表达式
    @Test
    public void test3(){
        List<Employee> employees = Arrays.asList(
                new Employee("张三",23,3333.33),
                new Employee("李四",24,4444.44),
                new Employee("王五",25,5555.55),
                new Employee("赵六",26,6666.66),
                new Employee("田七",27,7777.77)
        );

        List<Employee> list = filterEmployees(employees,(employee) -> employee.getSalary()>5000);
//        for (Employee emp:list) {
//
//            System.out.println(emp);
//        }
        list.forEach(System.out::println);
    }
    //优化方式四-使用Stream-API
    @Test
    public void test4(){
        List<Employee> employees = Arrays.asList(
                new Employee("张三",23,3333.33),
                new Employee("李四",24,4444.44),
                new Employee("王五",25,5555.55),
                new Employee("赵六",26,6666.66),
                new Employee("田七",27,7777.77)
        );
        employees.stream().filter( (e) -> e.getSalary() < 4000 ).limit(2).forEach(System.out::println);
        System.out.println("------------------");
        employees.stream().map(Employee::getName).forEach(System.out::println); //打印所有的名字
    }

@Test
    public void test5(){

    List<Employee> employees = Arrays.asList(
            new Employee("张三",23,3333.33),
            new Employee("李四",24,4444.44),
            new Employee("王五",25,5555.55),
            new Employee("赵六",26,6666.66),
            new Employee("田七",27,7777.77)
    );
    Collections.sort(employees,(x,y) ->{
        if(x.getAge() == y.getAge()){
            return x.getName().compareTo(y.getName());
        }else{
            return Integer.compare(x.getAge(),y.getAge());
        }
    });
    for (Employee emp: employees) {
        System.out.println(emp);
    }



    }

    //语法格式(一) 对象::实例方法名
    @Test
    public void test6(){
        //普通写法
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("hello !");
        System.out.println(con);
        System.out.println("----------------------");
        //更简单的写法
        Consumer<String>con2 = System.out::println;
        con2.accept("hello ! ");
        System.out.println(con2);

        System.out.println("----------------------111");

        Employee emp = new Employee("zx",23,5555);

        Supplier<String> sup = () -> emp.getName();
        System.out.println(sup.get());

        //简写
        Supplier<String>sup2 = emp::getName;
        System.out.println(sup2.get());
    }



}
