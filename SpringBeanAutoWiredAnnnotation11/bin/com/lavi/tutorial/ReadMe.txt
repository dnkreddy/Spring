1. Needs to enable context namespace
2. Needs to add <context:annotation-config/> in cfg file.
3. Needs to add javaee.jar and javax-inject.jar files to the path.

@Autowired - by default it is autowire by type
required= true then container looks for dependency exist or not before
creating bean.


