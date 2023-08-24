package com.dutta.hritwik.contentcalendar.repository;

import com.dutta.hritwik.contentcalendar.model.Content;
import com.dutta.hritwik.contentcalendar.model.Status;
import com.dutta.hritwik.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(contentItem -> contentItem.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content newContent = new Content(1, "My First Blog Post", "My first blog post",
                Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");

        contentList.add(newContent);
    }

    public void save(Content content) {
        contentList.removeIf(contentItem -> contentItem.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().anyMatch(content -> content.id() == id);
    }

    public void delete(Integer id) {
        contentList.removeIf(contentItem -> contentItem.id().equals(id));
    }

}
