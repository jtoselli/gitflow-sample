package com.rappipay.gitflow.demo.model.repository

import com.rappipay.gitflow.demo.model.Demo
import org.springframework.stereotype.Repository

@Repository
class DemoRepository {
    fun findById(id: Int): Demo? = if(id > 1000) null else Demo(id, name = "name $id")
}