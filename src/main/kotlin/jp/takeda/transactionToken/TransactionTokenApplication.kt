package jp.takeda.transactionToken

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TransactionTokenApplication

fun main(args: Array<String>) {
    SpringApplication.run(TransactionTokenApplication::class.java, *args)
}
