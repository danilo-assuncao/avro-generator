package com.dassuncao.avro.generator;

import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvroGeneratorTest {

    @Test
    public void test_avro_generator_using_user_sample() throws JsonMappingException {

        // Arrange
        final String avrin = "{\n" +
                "   \"type\":\"record\",\n" +
                "   \"name\":\"UserSample\",\n" +
                "   \"namespace\":\"com.dassuncao.avro.generator\",\n" +
                "   \"fields\":[\n" +
                "      {\n" +
                "         \"name\":\"features\",\n" +
                "         \"type\":[\n" +
                "            \"null\",\n" +
                "            {\n" +
                "               \"type\":\"array\",\n" +
                "               \"items\":{\n" +
                "                  \"type\":\"record\",\n" +
                "                  \"name\":\"UserFeaturesSample\",\n" +
                "                  \"namespace\":\"com.dassuncao.avro.generator.UserSample$\",\n" +
                "                  \"fields\":[\n" +
                "                     {\n" +
                "                        \"name\":\"active\",\n" +
                "                        \"type\":[\n" +
                "                           \"null\",\n" +
                "                           \"boolean\"\n" +
                "                        ]\n" +
                "                     },\n" +
                "                     {\n" +
                "                        \"name\":\"feature\",\n" +
                "                        \"type\":[\n" +
                "                           \"null\",\n" +
                "                           \"string\"\n" +
                "                        ]\n" +
                "                     }\n" +
                "                  ]\n" +
                "               }\n" +
                "            }\n" +
                "         ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"name\":\"lastAccess\",\n" +
                "         \"type\":[\n" +
                "            \"null\",\n" +
                "            \"string\"\n" +
                "         ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"name\":\"name\",\n" +
                "         \"type\":[\n" +
                "            \"null\",\n" +
                "            \"string\"\n" +
                "         ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"name\":\"password\",\n" +
                "         \"type\":[\n" +
                "            \"null\",\n" +
                "            \"string\"\n" +
                "         ]\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        final String avrinFormatted = avrin
                .replace(System.lineSeparator(), "")
                .replaceAll("\\s+", "");

        // Act
        final String result = new AvroGenerator().generateAvroSchema();

        // Assert
        assertEquals(result, avrinFormatted);
    }
}