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

#### 单一职责原则
```
定义：不要存在多于一个导致类变更的原因
一个类/接口/方法只负责一项职责
优点：降低类的复杂度、提高类的可读性，提高系统的可维护性、降低变更引起的风险
```