package com.basic.gof_code.abstractfactorygof;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.createFactory();

        IUser userDal = factory.createUser();
        User user = new User();
        user.setId(1000);
        user.setName("LiLei");
        userDal.insert(user);

        userDal.getUser(100);

        IDepartment departmentDal = factory.createDepartment();
        Department department = new Department();
        department.setName("Lily");
        department.setId(200);
        departmentDal.Insert(department);

        departmentDal.getDepartment(10000);
    }
}
