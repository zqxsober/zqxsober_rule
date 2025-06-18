# 📌 基于规则引擎 RuleEngine 二开📌

#### 业务逻辑实现不再依赖于代码开发，可零代码实现复杂业务逻辑。

### 技术文档

简单使用：...  
详细文档：http://ruleengine.cn/doc

### 技术栈/版本介绍：

- 所涉及的相关的技术有：
    - SpringBoot 2.2.11
    - RabbitMQ
    - Redis、Redisson
    - MySQL 5.7.9
    - Mybatis-plus
    - Maven 3.3
    - Swagger

### 规则如何调用

通过在 http://ruleengine.cn 配置规则，配置完成后我们就可以调用接口来执行引擎中的规则了

```
POST http://ruleserver.cn/ruleEngine/generalRule/execute
Content-Type: application/json

{
      "code": "phoneRuletest",
      "workspaceCode": "default",
      "accessKeyId": "略", 
      "accessKeySecret": "略",
      "param": {
            "phone": "13400000000"
      }
}
```

现在我们让此使用方式更加简单易用！ 调用规则方项目pom.xml文件引入以下依赖

```pom
    <dependency>
        <groupId>cn.ruleengine</groupId>
        <artifactId>rule-engine-client</artifactId>
        <version>2.0</version>
    </dependency>
```

现在你就已经学会了如何使用，更多使用方式敬请期待！

### 如果觉得本项目对您有任何一点帮助，请点右上角 "Star" 支持一下， 并向您的基友、同事们宣传一下吧，谢谢！

