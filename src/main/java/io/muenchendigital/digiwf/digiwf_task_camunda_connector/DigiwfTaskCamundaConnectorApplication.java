package io.muenchendigital.digiwf.digiwf_task_camunda_connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import pro.taskana.adapter.configuration.AdapterConfiguration;
import pro.taskana.adapter.configuration.AdapterSpringContextProvider;

@SpringBootApplication
@EnableScheduling
@Import({AdapterConfiguration.class})
@ComponentScan("pro.taskana")
public class DigiwfTaskCamundaConnectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigiwfTaskCamundaConnectorApplication.class, args);
    }

}
