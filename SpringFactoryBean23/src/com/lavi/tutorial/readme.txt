A FactoryBean is a bean which produce object of another bean.

Ex : JNDIObjectFactoryBean is a factory bean,
it produces an object of Datasource.

To create Factory bean is spring framework, our class should implement an interface 
called Factory Bean.
FactoryBean interface has 3 abstract methods ,
so we should override 3 abstract methods.