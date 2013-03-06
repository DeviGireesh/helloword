#Hello World

### Grails app Hello Wrold Example

This is a simple grails application that shows off how to pass data from a service to a view and render it.
You will also find a nice way of having an external config file. Check out the Events.groovy file in the scripts dir,
and also the bottom 3 lines in the Config.groovy file.

### External Config
To use the external config stuff you will need to create a folder and place properly named config files in it. Depending on
where you choose to place the folder. It will look for ~/.grails/priv_conf/ and it not found will look for an environment variable
called PRIV_CONF.


As an example:

    Application Name: helloWorld
    Config file name: helloWorld-config.groovy
    Config file location: ~/.grails/priv_conf/helloWorld-config.groovy

