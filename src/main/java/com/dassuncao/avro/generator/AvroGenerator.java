package com.dassuncao.avro.generator;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;

public class AvroGenerator {

    public String generateAvroSchema() throws JsonMappingException {
        final var mapper = new ObjectMapper(new AvroFactory());
        final var visitor = new AvroSchemaGenerator();
        mapper.acceptJsonFormatVisitor(UserSample.class, visitor);
        return visitor.getGeneratedSchema().getAvroSchema().toString();
    }
}
