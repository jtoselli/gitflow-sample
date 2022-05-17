package com.rappipay.gitflow.demo.service

import com.rappipay.demo.response.DemoResponse
import com.rappipay.gitflow.demo.model.Demo

fun Demo.toDemoResponse() = DemoResponse(id, name)