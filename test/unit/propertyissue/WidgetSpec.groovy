package propertyissue

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Widget)
class WidgetSpec extends Specification {

    void "test persistentProperties"() {
        when:
        def obj = new Widget()

        then:
        !obj.validate()

        and:
        obj.errors.getFieldError('someClass').code == 'nullable'
    }
}
