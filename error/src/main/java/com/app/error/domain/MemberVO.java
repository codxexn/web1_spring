package com.app.error.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class MemberVO implements Serializable {
    private String id;
    private String pw;
}
