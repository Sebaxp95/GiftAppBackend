package pl.edu.agh.ux.giftapp.giftapp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FormItem {
    private Product product;
    private List<User> usersVote;
}
