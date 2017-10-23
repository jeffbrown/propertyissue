package propertyissue

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class WidgetSpec extends Specification implements DomainUnitTest<Widget> {


    void "test persistentProperties"() {
        when:
        def obj = new Widget()

        then:
        !obj.validate()

        and:
        obj.errors.getFieldError('someClass').code == 'nullable'
    }
}
