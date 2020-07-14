package ph.co.nogi.sso.application.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application")
@Data
public class ApplicationProperties {

    private Integer serviceId;
    private String[] allowedOrigins;

}
