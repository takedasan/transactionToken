package jp.takeda.transactionToken.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.handler.MappedInterceptor
import org.terasoluna.gfw.web.token.transaction.TransactionTokenInterceptor
import org.terasoluna.gfw.web.token.transaction.TransactionTokenRequestDataValueProcessor
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.beans.factory.annotation.Autowired

@Configuration
open class WebMvcConfig() : WebMvcConfigurerAdapter() {

    @Bean
    open fun transactionTokenInterceptor(): TransactionTokenInterceptor {
        return TransactionTokenInterceptor()
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(transactionTokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/resources/**")
                .excludePathPatterns("/**/*.html")
    }
}