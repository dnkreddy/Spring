This is called as Lookup method injection.
Suppose we have two spring beans, where one is singleton bean and other is 
prototype.
Singleton bean has depence on prototype bean.
Dependency injectin will not work when singleton bean want multiple objects of 
prototype bean.In such case go for Method Injection.