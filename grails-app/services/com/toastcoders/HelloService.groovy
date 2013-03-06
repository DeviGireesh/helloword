package com.toastcoders

class HelloService {

    def myFancyHello() {
        return "Hello World!"
    }

    def myFancyHello(def msg) {
        return msg
    }

    def getMapData() {
        def foo = [:]
        foo.put("name","mike")
        foo.put("age",32)
        foo.put("sex", "yes, often please")
        return foo
    }
}
