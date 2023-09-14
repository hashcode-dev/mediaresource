package org.supershine.mediaresource.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.supershine.mediaresource.model.MediaResource;

public interface MediaRepository extends MongoRepository<MediaResource, String> {
}
