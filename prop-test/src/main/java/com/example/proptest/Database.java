package com.example.proptest;

import lombok.Data;
import java.util.List;

@Data
public class Database {
    private String name;
    private String version;
    private List<String> roles;
}
