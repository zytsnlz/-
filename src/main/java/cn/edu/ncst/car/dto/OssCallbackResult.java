package cn.edu.ncst.car.dto;

import lombok.Data;

@Data
public class OssCallbackResult {
    private String filename;
    private String size;
    private String mimeType;
    private String width;
    private String height;
}
