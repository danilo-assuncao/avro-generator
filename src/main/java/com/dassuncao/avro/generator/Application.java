package com.dassuncao.avro.generator;

import com.fasterxml.jackson.databind.JsonMappingException;

public class Application {

    public static void main(String[] args) throws JsonMappingException {
        System.out.println("SCHEMA ===> " + new AvroGenerator().generateAvroSchema());
    }
}
