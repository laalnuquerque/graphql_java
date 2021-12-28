package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQl implements GraphQLQueryResolver {

    @Autowired
    private ClienteRepository clienteRep;
    public String hello(){
        return "Hello filho";
    }

    public int soma(int a, int b){
        return a+b;
    }

    public Cliente cliente(Long id){

        return clienteRep.findById(id).orElse(null);
    }

    public List<Cliente> clientes(){
        return clienteRep.findAll();
    }
}
