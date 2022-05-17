package com.rappipay.gitflow.demo.service

import com.rappipay.gitflow.demo.model.repository.DemoRepository
import org.springframework.stereotype.Service

@Service
private class DefaultDemoService(private val demoRepository: DemoRepository) : DemoService {
    override fun getDemo(id: Int) = demoRepository.findById(id)?.toDemoResponse()
}