package com.sample.seungdols

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
  scanBasePackages = ["com.sample.seungdols"],
  exclude = [
    MybatisAutoConfiguration::class
  ]
)
class MybatisoNeatedApplication

fun main(args: Array<String>) {
  runApplication<MybatisoNeatedApplication>()
}
