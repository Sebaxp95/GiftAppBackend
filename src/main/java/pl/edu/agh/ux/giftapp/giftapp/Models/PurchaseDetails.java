package pl.edu.agh.ux.giftapp.giftapp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PurchaseDetails {
    private List<FormItem> formItems;
    private List<ChatMessage> chatMessages;
    private Interests interests;
    private List<User> users;
}
