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
        foo.put("name","Mike")
        foo.put("age",32)
        foo.put("sex", "Yes, often please.")
        return foo
    }
}
