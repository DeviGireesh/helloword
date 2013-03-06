package com.toastcoders

class YourmomController {
    def helloService

    def index() { 
        return ["myMessage": helloService.myFancyHello()]
    }

    def seemap() {
        return ["myMapData":helloService.getMapData()]
    }
}
