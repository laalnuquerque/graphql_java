package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLResolver{
    public String hello(){
        return "Hello GraphQl";
    }
}
