package com.basic.gof_code.abstractfactorygof;

public class SqlServerFactory extends AbstractFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
