package com.dutta.hritwik.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record Content(
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        java.time.LocalDateTime dateCreated,
        LocalDate dateUpdated,
        String url
) {
}
