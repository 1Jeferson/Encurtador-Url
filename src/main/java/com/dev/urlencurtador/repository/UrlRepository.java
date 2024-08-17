package com.dev.urlencurtador.repository;

import com.dev.urlencurtador.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
