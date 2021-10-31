package com.flowengine.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {
    protected final Log logger = LogFactory.getLog(getClass());

    @Bean
    public AuditorAware<String> auditorProvider() {

        /*
          if you are using spring security, you can get the currently logged username with following code segment.
          SecurityContextHolder.getContext().getAuthentication().getName()
         */
        if (SecurityContextHolder.getContext().getAuthentication() != null)
            return () -> Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName());
        else
        {
            logger.info("anonymoususer");
            return () -> Optional.ofNullable("anonymoususer");
        }
    }
}
