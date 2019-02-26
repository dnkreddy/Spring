IOC : Bean Scopes
 xml:
 scope = "singleton | prototype"
 Annotation:
 @Bean
@Scope(value="singleton")
  Needs to see about scope attribute of bean tag.
   - singleton
   - prototype
   - request
   - session
   - global-session : equal to session in portlet applications
   
- Default scope is singleton