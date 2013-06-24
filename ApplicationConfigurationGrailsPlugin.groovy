class ApplicationConfigurationGrailsPlugin {
	def version = "0.1"
	def grailsVersion = "1.3.7 > *"

	def title = "Application Configuration Plugin"
	def author = "Alessandro Miliucci"
	def authorEmail = "lifeisfoo@gmail.com"
	def description = 'Exposes a Conf class to get/set string values based on string keys: Conf.valueGet("website-header")'

	def documentation = "https://github.com/lifeisfoo/grails-application-configuration-plugin"

	def license = "APACHE"
	def issueManagement = [ system: "github", url: "https://github.com/lifeisfoo/grails-application-configuration-plugin/issues" ]
	def scm = [ url: "https://github.com/lifeisfoo/grails-application-configuration-plugin" ]
}
