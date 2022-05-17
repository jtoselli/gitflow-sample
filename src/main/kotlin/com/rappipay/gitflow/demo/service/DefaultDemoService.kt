package com.rappipay.gitflow.demo.service

import com.rappipay.demo.response.DemoResponse
import com.rappipay.gitflow.demo.model.repository.DemoRepository
import com.rappipay.gitflow.demo.request.DemoRequest
import org.springframework.stereotype.Service

@Service
private class DefaultDemoService(private val demoRepository: DemoRepository) : DemoService {
    override fun getDemo(id: Int) = demoRepository.findById(id)?.toDemoResponse()
    override fun saveDemo(demo: DemoRequest): DemoResponse {
        TODO("Not yet implemented")
    }
}