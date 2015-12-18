// src/integration-test/groovy/demo/DemoSpec.groovy
package demo

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
class DemoSpec extends Specification {

    @Rollback
    def "test toUpperCase"() {
        given:
        def result = value.toUpperCase()

        expect:
        result == expectedResult

        where:
        value          | expectedResult
        'King Crimson' | 'KING CRIMSON'
        'Riverside'    | 'RIVERSIDE'
    }
}
