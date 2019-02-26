LifeCycle:
   1. Does not exist
   2. Instantiated - creating Object
   3. Dependencies are injected
   4. Injects id or name of bean if Bean implements BeanNameAware
   5. Injects BeanFactory if bean implements BeanFactoryAware Interface
   6. Injects ApplicationContext if bean implements ApplicationContexxtAware
   7. calls postProcessBeforeInitialization() if BeanPostProcessor exist
   8. calls afterProertiesSet() if bean implements IntializingBean
   9. cusom Init method - XML conf or @postConstruct
   10. INITIALIZED
   11. calls postProcessAfterInitialization() if BeanPostProcessor exist
   12 SERVICED
   11.DESTROY 
        calls destroy method if bean implements Disposbale Bean
        calls custom destroy method in XML or @PreDestroy 