package com.spharosacademy.jpa.project.spharosmvcandjpa.코드로배우는스프링부트.whatisboot.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class SampleDTO {

    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;

}
