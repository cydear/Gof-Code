package com.basic.gof_code.abstractfactorygof;

public class SqlServerUser implements IUser {
    @Override
    public int insert(User user) {
        System.out.println("成功向SqlServer中插入一条数据:" + user.toString());
        return 1;
    }

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(100);
        user.setName("tom");
        System.out.println("成功查出一条数据SqlServer:" + user.toString());
        return user;
    }
}
