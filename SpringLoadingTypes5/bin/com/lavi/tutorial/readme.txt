IOC : Bean loading strategies - Bean configured in XML or java based configuration
can be loaded in two ways.
  - Eager loading or Aggressive Loading
  - Lazy loading
  xml:
  lazy-init="true | false"
  Annotation:
  @Lazy(value=true)
  BeanFactory - By default it is lazy laoding
  ApplicationContext - Be default it is Eager Loading, we can make it as
  Lazy loading by specifying lazy-init="true" and we specify bean scope
  is prototype then that bean also loaded lazily.
  
   