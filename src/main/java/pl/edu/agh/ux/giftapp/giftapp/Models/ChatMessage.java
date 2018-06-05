package pl.edu.agh.ux.giftapp.giftapp.Models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ChatMessage {
    private String message;
    private User user;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime time;
}
