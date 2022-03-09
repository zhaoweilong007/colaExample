# COLA架构 example

使用cola生成demo

```shell
mvn archetype:generate  -DgroupId=com.alibaba.demo -DartifactId=demoWeb -Dversion=1.0.0-SNAPSHOT -Dpackage=com.alibaba.demo -DarchetypeArtifactId=cola-framework-archetype-web -DarchetypeGroupId=com.alibaba.cola -DarchetypeVersion=4.0.0
```

进入demo，执行

```shell
mvn install
```