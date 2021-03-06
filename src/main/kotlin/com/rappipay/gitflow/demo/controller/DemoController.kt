package com.rappipay.demo.controller

import com.rappipay.demo.response.DemoResponse
import com.rappipay.gitflow.demo.controller.exception.NotFoundException
import com.rappipay.gitflow.demo.request.DemoRequest
import com.rappipay.gitflow.demo.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val service: DemoService
) {

    @GetMapping("/{id}")
    fun getDemo(@PathVariable id: Int): DemoResponse = service.getDemo(id) ?: throw NotFoundException()

    @PostMapping("/")
    fun saveDemo(@RequestBody demoRequest: DemoRequest?) = service.saveDemo(demoRequest)

    @GetMapping("/version")
    fun getVersion() = "version 2"
}