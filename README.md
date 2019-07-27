### 设计模式

### UML类图
子类，父类
```
定义子类时需要通过extends关键字指定父类
子类一定知道父类定义，父类并不知道子类的定义
只有知道对方信息才能指向对方
所以箭头方向是从子类指向父类
```

继承，实现
```
继承：实线，is a
实现：虚线，接口
```

关联，依赖
```
依赖：表示一种使用关系，一个类需要借助另一个类来实现功能，一般是一个类使用另一个类作为参数使用，或作为返回值。
关联：表示一个类对象和另一个类对象有关联，通常一个类中有另一个类对象作为属性。
```

聚合，组合
```
聚合：整体和局部的关系，两者有着独立的生命周期，是has a的关系，弱关系。
组合：整体与局部的关系，和聚合的关系相比，关系更加强烈，两者有着相同的生命周期，contains a的关系，强关系。

组合常见数字表达及含义，假设有A类和B类，数字标记在A类侧
0..1    ：0或1个实例
0..*    ：0或多个实例
1..1    ：1个实例
1       ：只能有1个实例
1..*    ：至少有1个实例
```
<img src="http://flowerman.cc/design-pattern/1.png" width = 100% />

### 设计原则
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

### 模式
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
    对象适配器
    类适配器
相关设计模式：
    适配器模式与外观模式：适配器复用原有的接口，外观定义新的接口
```

#### 享元
```
定义：提供了减少对象数量从而改善应用所需的对象结构的方式
运用共享技术有效地支持大量细粒度的对象
类型：结构型
适用场景：
    常常应用于系统底层的开发，以便解决系统的性能问题
    系统有大量相似对象、需要缓冲池的场景
优点：
    减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
    减少内存之外的其它资源占用
享元：
    关注内/外部状态、关注线程安全问题
    使系统、程序的逻辑复杂化
享元-扩展
    内部状态
    外部状态
享元-相关设计模式
    享元模式和代理模式
    享元模式和单例模式

```

#### 组合
```
定义：将对象则和成树形结构以表示"部分-整体"的层次结构
组合模式使客户端对单个对象和组合对象保持一致的方式处理
类型：结构型
适用场景：
    希望客户端可以忽略组合对象于单个对象的差异时
    处理一个树形结构时
优点：
    清楚的定义分层次的复杂对象，表示对象的全部或部分层次
    让客户端忽略了层次的差异，方便对整个层次结构进行控制
    简化客户端代码
    符合开闭原则
缺点：
    限制类型时会较为复杂
    使设计变得更加抽象
组合-相关设计模式
    组合模式和访问者模式：使用访问者模式访问组合模式中的递归机构
```

#### 桥接
```
定义：将抽象部分于它的具体实现部分分离，使它们都可以独立地变化
通过组合的方式建立两个类之间联系，而不是继承
类型：结构型
适用场景：
    抽象和具体实现之间增加更多的灵活性
    一个类存在两个(或多个)独立变化的维度，且这两个(或多个)维度都需要独立进行扩展
    不希望使用继承，或因为多继承导致系统类的个数剧增
优点：
    分离抽象部分及其具体实现部分
    提高了系统的可扩展性
    符合开闭原则
    符合合成复用原则
缺点：
    增加了系统的理解与设计难度
    需要正确地识别出系统中两个独立变化的维度
桥接-相关设计模式：
    桥接模式和组合模式：组合模式强调部分和整体间的组合，桥接模式强调平行级别上不同类的组合
    桥接模式和适配器模式：共同点，让两个东西配合工作，不同点，适配器模式改变已有接口，桥接模式分离抽象
```

#### 代理
```
定义：为其它对象提供一种代理，以控制对这个对象的访问
代理对象在客户端和目标对象之间起到中介的作用
类型：结构性
适用场景：
    保护目标对象
    增强目标对象
优点：
    代理模式能将代理对象与真实被调用的目标对象分离
    一定程度上降低了系统的耦合度，扩展性好
    保护目标对象
    增强目标对象
缺点：
    代理模式会造成系统设计中类的数目增加
    在客户端和目标对象增加了一个代理对象，会造成请求处理速度变慢
    增加系统的复杂度
扩展：
    静态代理
    动态代理
    CGLib代理（关注final）
Spring代理选择-扩展：
    当Bean有实现接口时，Spring就会用JDK的动态代理
    当Bean没有实现接口时，Spring使用CGLib
    可以强制使用Cglib
代理-相关设计模式：
    代理模式和装饰着模式：装饰者模式是给对象加上行为，代理模式是控制访问，增强对象行为
    代理模式和适配器模式：适配器模式改变对象的接口，代理模式不改便代理类的接口

```

#### 模版方法
```
定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
类型：行为型
适用场景：
    一次性实现一个算法的不变的部分，并将可变的行为留 给子类来实现
    个子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
优点：
    提高复用性
    提高扩展性
    符合开闭原则
缺点：
    类的数目增加
    增加了系统实现的复杂度
    继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍
扩展：
    钩子方法：子类可以在必要时提供扩展，是模版对子类的进一步开放和扩展
相关设计模式：
模版方法模式和工厂方法模式：工厂方法是模版方法的一种特殊实现
模版方法模式和策略模式：两者都有封装算法，区别在于策略模式使不同的算法可以相互替换，并且不影响应用层客户端的使用，
    而模版方法模式是针对定义一个算法的流程，将一些不太一样的具体实现步骤交给子类实现
    策略模式可以改变算法流程，模版方法模式不改变算法流程，两者可以相互替换
```

#### 迭代器
```
定义：提供了一种方法，顺序访问一个集合对象中的各个元素，而又不暴露对象的内部表示
类型：行为型
适用场景：
    访问一个集合对象的内容而无需暴露它的内部表示
    为遍历不同的集合结构提供一个统一的接口
优点：
    分离了集合对象的遍历行为
缺点：
    类的个数成对增加
相关设计模式：
迭代器模式和访问者模式：都是迭代访问集合中的各个元素，不同访问者模式中扩展开放的部分在作用于对象的操作上，迭代器在集合的种类上
```

#### 策略
```
定义：定义了算法家族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化不会影响到使用算法的用户。
if...else...
类型：行为型
适用场景：
    系统有很多类，而它们的区别仅仅在于它们的行为不同
    一个系统需要动态地在几种算法中选择一种
优点：
    开闭原则
    避免使用多重条件转移语句
    提高算法的保密性和安全性
缺点：
    客户端必须知道所有的策略类，并自行决定使用哪一个策略类
    产生很多策略类
相关设计模式：
    策略模式和工厂模式：工厂是创建型，策略是行为型
    工厂模式接受指令，创建出符合要求的具体对象，策略模式接受已经创建好的对象，从而实现不同的行为
    策略模式和状态模式：策略模式客户端需要知道到底选择哪个一策略，状态模式不需要关系具体的状态，那些状态会互相转换
```

#### 解释器
```
定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
为了解释一种语言，而为语言创建的解释器
类型：行为型
适用场景：
    某个特定类型问题发生频率足够高
优点：
    语法由很多类表示，容易改变及扩展此"语言"
缺点：
    当语法规则数目太多时，增加了系统复杂度
相关设计模式
    解释器模式和适配器模式：适配器模式预先不知道适配的规则，解释器需要先写规则，再根据规则进行解释
```
 
 
#### 观察者
```
定义：定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者(观察者)都会收到通知并更新
类型：行为型
适用场景：关联行为场景，建立一套出发机制
优点：
    观察者和被观察者之间建立了一个抽象的耦合
    观察者模式支持广播通信
缺点：
    观察者之间有过多的细节依赖、提高时间消耗及程序复杂度
    使用要得当，要避免循环调用
``` 


#### 备忘录
```
定义：保存一个对象的某种状态，以便在适当的时候恢复对象，“后悔药”。
类型：行为型
适用场景：
    保存及恢复数据相关业务场景
    后悔的时候，即想恢复到之前的状态
优点：
    为用户提供一种可恢复机制
    存档信息的封装
缺点：
    资源占用
相关设计模式：
    备忘录模式和状态模式：备忘录模式中用实例表示状态，而在状态模式中用类表示状态
```