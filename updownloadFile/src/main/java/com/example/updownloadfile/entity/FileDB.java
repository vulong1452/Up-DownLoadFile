package com.example.updownloadfile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "uploadfile")
@NoArgsConstructor
public class FileDB {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;


    private String name;

    private String type;

    //BLOB dùng để lưu trữ dữ liệu nhị phân.
    @Lob //LOB là kiểu dữ liệu để lưu trữ dữ liệu đối tượng lớn.
    private byte[] data;

    public FileDB(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
