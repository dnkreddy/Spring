-In case of autowire byType ,the spring container checks whether 
any bean instance running in the container whose Type is 
same as bean property Type or not.

Here we have 3 cases:
1. When no bean is found with matching data type 
then bean property will not be injected
2. When exactly one bean is found with matching Data type
 then it will be injected.
3.When two or more beans are fond with matching data type then
 exception will be thrown like no Unique bean defined.
 
 Flow:
  -Bean will be instantiated using default constructor.
  -Dependent Bean instances will be detected using bean data type.
  -Detected bean instance will be injected through setter injection.