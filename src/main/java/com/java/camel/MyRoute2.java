package com.java.camel;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute2 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	//from("file:C://inputFolder2?noop=true").to("file:C://outputFolder2");
        from("direct:http://localhost:8080/mongoSelect")
                .to("mongodb:myDb?database=customerDb2&collection=customer&operation=findAll");
        from("direct:http://localhost:8080/mongoInsert")
                .to("mongodb:myDb?database=customerDb2&collection=customer&operation=insert");
    }
}
