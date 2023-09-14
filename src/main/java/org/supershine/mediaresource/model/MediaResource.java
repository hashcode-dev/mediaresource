package org.supershine.mediaresource.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("media_resource")
@Getter
@Setter
@AllArgsConstructor
public class MediaResource {

    @Id
    private String id;
    private String imageUrl;
}
