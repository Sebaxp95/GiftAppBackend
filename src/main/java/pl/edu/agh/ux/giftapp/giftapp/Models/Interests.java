package pl.edu.agh.ux.giftapp.giftapp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Interests {
    private List<String> interestsForAll;
    //Map user -> his interests? Is it necessary?
}
