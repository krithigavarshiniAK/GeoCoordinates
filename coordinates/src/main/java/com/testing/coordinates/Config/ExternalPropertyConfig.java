package com.testing.coordinates.Config;

import com.testing.coordinates.hibernate.InstitutionTerminalConfig;
import com.testing.coordinates.hibernate.TerminalDetails;
import ogs.switchon.common.hibernate_loader.HibernateSessionFactoryHelper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class ExternalPropertyConfig {
    @Bean
    public TerminalDetails terminalDetails() {
        return new TerminalDetails();
    }

    @Bean
    public InstitutionTerminalConfig institutionTerminalConfig(){
        return new InstitutionTerminalConfig();
    }

    public ExternalPropertyConfig() {
        System.out.println("ExternalPropertyConfig bean is being created. 2");
        loadProperties();
    }

    public void loadProperties() {
        Properties properties = new Properties();
        try (InputStream is = HibernateSessionFactoryHelper.class.getClassLoader().getResourceAsStream("SwitchPropertiesDev.txt")) {
            if (is != null) {
                //System.out.println("Inside if..");
                properties.setProperty("encrypt", "false");
                properties.load(is);
                //properties.forEach((key, value) -> System.out.println(key + ": " + value));
            } else {
                throw new RuntimeException("Property file not found");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties", e);
        }
        //System.out.println("Out of try catch");
        HibernateSessionFactoryHelper.loadProperties(properties,"com.testing.coordinates.hibernate");
        System.out.println("properties are loaded......");
    }
}
