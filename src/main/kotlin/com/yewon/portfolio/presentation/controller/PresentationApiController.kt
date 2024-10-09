package com.yewon.portfolio.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")

class PresentationApiController {

    @GetMapping("/test")
//    @RequestMapping(method = [RequestMethod.GET], name = "/test") 위와 같음
    fun test(): String {
        return "OK"
    }

}