package paju.personal.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class TweetDto {
    private UUID id;
    private String text;
    private String username;
}
