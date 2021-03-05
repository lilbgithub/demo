package example

import spock.lang.Specification

class ExampleTest extends Specification {

    def 'test greeting'(){
        given: 'example object'
        Example example = new Example();

        when: 'i call greet function'
        String result = example.greet();

        then:'expected result'
        result == "hello"
    }
}
