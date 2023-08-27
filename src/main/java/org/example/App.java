package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws Exception {
        // JSON字符串
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        // 创建ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // 解析JSON字符串为JsonNode对象
        JsonNode jsonNode = objectMapper.readTree(jsonString);

        // 从JsonNode中获取数据
        String name = jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();
        String city = jsonNode.get("city").asText();

        // 打印解析结果
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}