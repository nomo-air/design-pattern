#### 开闭原则
```
定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭
用抽象构建框架，用实现扩展细节
优点：提高软件系统的可复用性及可维护性
```

#### 依赖倒置原则 
```
定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象
抽象不应该依赖细节；细节应该依赖抽象
针对接口编程，不要针对实现编程
优点：可以减少类的耦合性、提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险
```

#### 接口隔离原则
```
定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口
一个类对一个类的依赖不应该建立在最小的接口上
建立单一接口，不要建立庞大臃肿的接口
尽量细化接口，接口中的方法尽量少
注意适度原则，一定要适度
优点：符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性
```

#### 迪米特原则（迪米特法则，最少知道原则）
```  
 定义：一个对象应该对其它对象保持最少的了解。又叫最少知道原则
 尽量降低类与类之间的耦合
 优点：降低类之间的耦合
 强调只和朋友交流，不和陌生人说话
 朋友：出现在成员变量、方法的输入、输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于朋友类。
```

#### 里氏替换原则
```
定义：如果对每一个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有对象o1都替换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类
定义扩展：一个软件实体如果适用一个父类的话，那一定适用于其子类，所有引用父类的地方必须能透明的使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变
引申意义：子类可以扩展父类的功能，但不能改变父类原有的功能
含义1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
含义2：子类中可以增加自己特有的方法
含义3：当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类方法的输入参数更宽松
含义4：当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输入/返回值）要比父类更严格或者相等
优点1：约束继承泛滥，开闭原则的一种体现
优点2：加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性。降低需求变更时引入的风险
```

#### 合成(组合)/聚合复用原则
```
定义：尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的
聚合has-A和组合contains-A
优点：可以是系统更灵活，降低类与类之间的耦合度，一个类的变化对其它类造成的影响相对较少
```

#### 简单工厂
```
定义与类型
定义：由一个工厂对象决定创建出哪一种产品类的实例
类型：创建型，但不属于GOF23种设计模式

适用场景
工厂类负责创建的对象比较少
客户端(应用层)只知道传入工厂类的参数对于如何创建对象(逻辑)不关心

优点
只需要传入一个正确的参数，就可以获取你所需要的对象而无须知道其创建细节

缺点
工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背开闭原则
```

#### 工厂方法
```
定义：定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
类型：创建型 
适用场景：
    创建对象需要大量重复的代码
    客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
    一个类通过其子类来指定创建哪个对象
优点：用户只需要关心所需产品对应的工厂，无须关心创建细节，加入新产品符合开闭原则，提高可扩展性
缺点：类的个数容易过多，增加复杂度，增加了系统的抽象性和理解难度
```

#### 抽象工厂
```
定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
无须指定它们具体的类
类型：创建型
适用场景：
    客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
    强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量的重复代码
    提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现
优点：
    具体产品在应用层代码隔离，无须关心创建细节
    将一个系列的产品族同一到一起创建
缺点：
    规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
    增加了系统的抽象性和理解难度
```

#### 建造者
```
定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
用户只需要指定需要构造的类型就可以得到它们，建造过程及细节不需要知道
类型：创建型
适用场景：
    如果一个对象有非常复杂的内部结构(很多属性)
    想把复杂对象的创建和使用分离
优点：
    封装性好，创建和使用分离
    扩展性好、建造类之间独立、一定程度上解耦
缺点：
    产生多余的Builder对象
    产品内部发生变化，建造者都要修改，成本较大
```

#### 单例
```
定义：保证一个类仅有一个实例，并提供一个全局访问点
类型：创建型
适用场景：想确保任何情况下都绝对只有一个实例
优点：
    在内存里只有一个实例，减少了内存开销
    可以避免对资源的多重占用
    设置全局访问点，严格控制访问
缺点：
    没有接口，扩展困难
重点：
    私有构造器
    线程安全
    延迟加载
    序列化和反序列化安全
    反射
```

#### 原型
```
定义：指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
不需要知道任何创建细节，不调用构造函数
类型：创建类
适用场景：
    类初始化消耗较多资源
    new产生的一个对象需要非常频繁的过程（数据准备、访问权限等）
    构造函数比较复杂
    循环体中产生大量对象时
优点：
    原型模式性能比直接new一个对象性能高
    简化创建过程
缺点：
    必须配备克隆方法
    对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
    深拷贝、浅拷贝要运用得当
扩展：
    深克隆
    浅克隆
```

#### 外观
```
定义：又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
外观模式定义了一个高层接口，让子系统更容易使用
类型：结构型
适用场景：
    子系统越来越复杂，增加外观模式提供简单调用接口
    构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
优点：
    简化了调用过程，无需了解深入子系统，防止带来风险
    减少系统依赖、松散耦合
    更好的划分访问层次
    符合迪米特法则，即最少知道原则
缺点：
    增加子系统、扩展子系统行为容易引入风险
    不符合开闭原则 
相关设计模式：
    外观模式和中介者模式：外观模式关注外界与子系统的交互，中介者模式关注子系统内部之间的交互
    外观模式和单例模式：可以把外观模式中的外观对象做成结合单例模式使用
    外观模式和抽象工厂模式：外观类可以通过抽象工厂获取子系统的实例，这样子系统可以将内部对外观类进行屏蔽
```

#### 装饰者
```
定义：在不改变原有对象的基础之上，将功能附加到对象上
提供了比继承更有弹性的代替方案（扩展原有对象功能）
类型：结构型
使用场景：
    扩展一个类的功能或给一个类添加附加职责
    动态的给一个对象添加功能，这些功能可以再动态的撤销
优点：
    继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
    通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
    符合开闭原则
缺点：
    会出现更多的代码，更多的类，增加程序复杂性
    动态装饰时，多层装饰时会更复杂
```

#### 适配器
```
定义：将一个类的接口转换成客户期望的另一个接口
使原本接口不兼容的类可以一起工作
类型：结构型
适用场景：
    已经存在的类，它的方法和需求不匹配时(方法结果相同或相似)
    不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能类似而接口不相同情况下的解决方案
优点：
    能提高类的透明性和复用，现有的类复用但不需要改变
    目标类和适配器类解耦，提高程序扩展性
    符合开闭原则
缺点：
    适配器编写过程需要全面考虑，可能会增加系统的复杂性
    增加系统代码可读的难度
适配器-扩展
    对象
相关设计模式：
    适配器模式与外观模式：适配器复用原有的接口，外观定义新的接口
```