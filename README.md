# Gof-Code
23种设计模式学习和总结

##简单工厂

理解：抽象功能至顶层接口，各子功能通过实现顶层接口实现各自功能。创建静态工厂类，通过不同类型创建不同的实现类型。用到继承，封装，多态。
概述：简单工厂模式又叫静态工厂方法模式，它定义了一个具体的工厂类负责创建一些类的实例。

#优点：
1. 客户端不需要再负责对象的创建，从而明确了各个类的职责。
2. 客户端只需要使用类，工厂来负责创建具体实现类即可。

简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类。对于客户端来说，去除了与具体产品的依赖。

#缺点：
静态类负责所有对象的创建，如果有新的对象增加或者某些对象的创建方式不同，需要频繁需改工厂类，不利于后期维护。

作用：简单工厂模式只能解决对象创建问题，工厂本身需要包含所有创建类型的条件。


##策略模式

定义：它定义了算法家族，分别封装起来，让他们之间乐意互相替换，此模式让算法的变化，不会影响到适应算法的客户。

#策略模式的思考
策略模式是定义一系列的算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少各种算法类与孙发之间的耦合。

策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。继承有助于析取出这些算法中的公共功能。

策略模式优点是简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试。

总结：策略模式封装变化

#实用场景
策略模式就是用来封装算法，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同业务规则，就可以考虑实用策略模式处理这种变化的可能性。

##装饰模式

定义：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活。

核心实现类

扩展类 --》 使用多个扩展方法和核心进行组合

装饰模式是为已有功能动态地添加更多功能的一种方式

##代理模式

定义：为其他对象提供一种代理以控制这个对象访问

理解：隐藏真实对象的实现，代理对象就是真实对象的代表。使用代理模式可以在访问真实对象实加一些权限校验等。

#代理模式分类

远程代理：也就是一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。

虚拟代理：是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。

安全代理：用来控制真实对象的访问权限。

智能索引：是指当调用真实的对象时，代理处理另外一些事。

##工厂方法

定义：一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。

工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现具体实现类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。
想要加功能，本来是改工厂类的，而现在是修改客户端。
简单工厂违背了 开放 -封闭 原则

# 简单工厂就解决了违背开放封闭原则，又保持了封装对象创建过程的优点

##原型模式

定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节。

浅拷贝：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象。

深拷贝：深复制把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。

#特点：
1. clone对象不会执行对象的构造方法
2. 由原型对象自身创建目标对象，也就是说，对象创建这一动作发自原型对象本身。
3. 目标对象时原型对象的一个克隆，也就是说，通过原型模式创建的对象，不仅仅与原型对象具有相同的结构，还与原型对象具有相同的值。
4. 根据对象克隆深度层次的不同，有浅度克隆与深度克隆。

#使用场景：

在初始化的信息不发生变化的情况下，克隆是最好的办法，这既隐藏了对象的创建细节，又对性能是大大的提高。

1. 在创建对象的时候，我们不只是希望被创建的对象继承其积累的基本结构，还希望继承原型对象的数据。
2. 希望对目标对象的修改不影响既有的原型对象（深度克隆的时候可以完全互不影响）。
3. 隐藏克隆操作的细节，很多时候，对对象本身的克隆需要涉及到类本身的数据细节。
4. 类初始化需要消化非常多的资源，这个资源包括数据，硬件资源等。
5. 通过new产生一个对象需要非常繁琐的数据数据准备货访问权限，则可以使用原型模式。
6. 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值，可以考虑使用原型模式拷贝多个对象供调用者使用。
   在实际项目中，原型模式很少单独出现，一般是和工厂模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给
   调用者。原型模式先产生出一个包含大量共有信息的类，然后通过clone拷贝出副本，修正细节信息，简历一个完整的个性对象
   

##模板方法模式

定义：定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。

#特点
1. 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势。
2. 模板方法模式就是提供一个很好的代码复用平台。

#使用场景
1. 当不变的和可变的行为在方法的子类实现中混合在一起的时候，不变的行为就会在子类中重复出现。可以通过模板方法模式把这些
   行为搬移到单一的地方，这样就帮助子类拜托重复的不变行为的纠缠。
   
#优缺点

模板方法多个子类有公共的方法，并且逻辑基本相同时，重复的算法，可以把核心算法设计为模板方法，周边的相关细节功能由各个子类实现。

优点：
1. 封装不变部分，扩展可变部分。
2. 提取公共部分代码，便于维护。
3. 行为有父类控制，子类实现。

缺点：
1. 容易带来代码阅读的难度。


