package xdx.note.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = {"xdx.note.authority.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class XdxNoteAuthorityApp {

    public static void main(String[] args) {
        SpringApplication.run(XdxNoteAuthorityApp.class, args);
    }




}
