package com.traininglaura.stock.configuration.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ExceptionCodeResponse {
    private String message;
    private Integer code;
    private String status;
    private String timestamp;

}
