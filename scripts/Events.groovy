eventCreateWarStart = { warName, stagingDir ->
    // Determine the location of the external configs
    def env = System.getenv()
    def dir = env['PRIV_CONF'] ?: env['HOME'] + '/.grails/priv_conf'

    // Update the status
    event("StatusUpdate", ["Adding production configuration file to WAR..."])
    
    // Copy the config file into place in WEB-INF
    ant.copy(file: "${dir}/${grailsAppName}-config.groovy", tofile: "${stagingDir}/WEB-INF/classes/external-config.groovy", overwrite: true, preservelastmodified: true)
}
