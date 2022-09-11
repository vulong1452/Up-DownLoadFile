package com.example.updownloadfile.response;

import lombok.Data;

@Data
public class FileDBResponse {
    private String name;
    private String url;
    private String type;
    private long size;

    public FileDBResponse(String name, String url, String type, long size) {
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
    }
}
