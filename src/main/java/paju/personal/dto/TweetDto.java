package paju.personal.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TweetDto {
    private UUID id;
    private String text;
    private String username;
}
