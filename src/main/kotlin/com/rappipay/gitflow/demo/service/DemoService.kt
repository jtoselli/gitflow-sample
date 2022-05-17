package com.rappipay.gitflow.demo.service

import com.rappipay.demo.response.DemoResponse
import com.rappipay.gitflow.demo.request.DemoRequest

interface DemoService {
    fun getDemo(id: Int): DemoResponse?
    fun saveDemo(demo: DemoRequest?): DemoResponse?
}