package com.example.shorturl.repo;

import com.example.shorturl.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    public Link findLinkByShortenedLink(String shortUrl);
}
