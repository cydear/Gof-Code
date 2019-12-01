package com.basic.gof_code.abstractfactorygof;

public abstract class AbstractFactory {
    //public final static String DB = "com.basic.gof_code.abstractfactorygof.SqlServerFactory";
    public final static String DB = "com.basic.gof_code.abstractfactorygof.AccessFactory";

    public static AbstractFactory createFactory() {
        try {
            Class clazz = Class.forName(DB);
            return (AbstractFactory) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract IUser createUser();

    public abstract IDepartment createDepartment();
}
