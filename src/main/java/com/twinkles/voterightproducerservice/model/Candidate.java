package com.twinkles.voterightproducerservice.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "AppUser")
@Data
@Builder
public class Candidate {
    private String id;
    private String fullName;
    private Party party;
    private VoteCategory voteCategory;
    private long voteCount;
}
