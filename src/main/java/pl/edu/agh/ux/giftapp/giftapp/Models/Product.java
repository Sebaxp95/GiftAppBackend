package pl.edu.agh.ux.giftapp.giftapp.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private String url;
    private String imageUrl;
    private int popularity;
}
