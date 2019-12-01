package com.basic.gof_code.abstractfactorygof;

public class AccessFactory extends AbstractFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
