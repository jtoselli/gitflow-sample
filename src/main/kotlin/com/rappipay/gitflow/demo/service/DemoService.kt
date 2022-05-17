package com.rappipay.gitflow.demo.service

import com.rappipay.demo.response.DemoResponse

interface DemoService {
    fun getDemo(id: Int): DemoResponse?
}