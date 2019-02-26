1. While developing web applications if we want to support for multiple
language ,then needs to write varous message bundles.
2. write message bundles to support multuple language
   basename_languagecode.properties
   basename_languagecode_countrycode.properties
 3. Access the properties of message bundles using following
    methods of ApplicationContext.
    context.getMessage("user.required",new Object[]{},Lcocale.US)