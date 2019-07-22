package org.shisen.web.commn.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * <pre>
 * Description  错误页面配置
 * </pre>
 *
 * @author shishi
 */
@Configuration
public class ErrorPageConfig {

    @Bean
    public ErrorPageRegistrar errorPageRegistrar() {
        return registry -> {
            registry.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/sen.html"));
            registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/sen.html"));
        };
    }
}
