package com.example.shorturl.repo;

import com.example.shorturl.model.Link;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link, Long> {
}
