package pl.edu.agh.ux.giftapp.giftapp.Models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Purchase {
    private String name;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime eventTime;
    private String status;
    private PurchaseDetails purchaseDetails;
}
