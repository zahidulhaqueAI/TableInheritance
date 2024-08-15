package com.demo.singleclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("inheritance")
@Getter
@Setter
@NoArgsConstructor
public class PropertyReader {

    private String type;

}
