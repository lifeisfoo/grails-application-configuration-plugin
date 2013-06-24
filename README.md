# Application Configuration plugin for Grails
Avoid to create again a Conf class to get/put key->value runtime application configuration information.

## Usage
### Import
```
import net.forkwait.Conf
```
Import only where you use it

### Put/Get
After the plugin was installed a Conf class will be available to store and retrieve strings:
```
Conf.valuePut("header","Welcome to this company website!")
def websiteHeader = Conf.valueGet("header")
```
or
```
def websiteHeader = Conf.valueGet("header", "default value if isn't present")
```
You can store integer, duble, etc and converting them after get. Also objects in json format...everything you want.
If the single parameter get is used and the key isn't present, null is returned. The put operation return the inserted value.

## Future
* Caching level
* list/edit view
* transaction on put

## Author and License
Alessandro Miliucci <lifeisfoo@gmail.com>, Apache License
