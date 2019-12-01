package com.basic.gof_code.abstractfactorygof;

public class SqlServerDepartment implements IDepartment {
    @Override
    public int Insert(Department department) {
        System.out.println("成功向SqlServer中插入一条数据:" + department.toString());
        return 1;
    }

    @Override
    public Department getDepartment(int id) {
        Department department = new Department();
        department.setId(121);
        department.setName("宿舍");
        System.out.println("成功查出一条数据SqlServer:" + department.toString());
        return department;
    }
}
