package com.digiv.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse<T> {

    private Integer code;

    private String status;

    private T data;

}
