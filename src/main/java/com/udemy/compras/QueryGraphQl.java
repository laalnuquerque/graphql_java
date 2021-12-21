package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQl implements GraphQLResolver {
    public String hello(){
        return "Hello filho";
    }

}
