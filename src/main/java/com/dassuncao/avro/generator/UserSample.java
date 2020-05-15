package com.dassuncao.avro.generator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSample {

    private String name;

    private String password;

    private String lastAccess;

    private List<UserFeaturesSample> features;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserFeaturesSample {

        private Boolean active;

        private String feature;
    }
}
