package com.dutta.hritwik.contentcalendar.model;

import java.time.LocalDate;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        java.time.LocalDateTime dateCreated,
        LocalDate dateUpdated,
        String url
) {
}
