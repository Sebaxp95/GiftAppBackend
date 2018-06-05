package pl.edu.agh.ux.giftapp.giftapp.Controllers;


import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.edu.agh.ux.giftapp.giftapp.Models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@Getter
public class Database {
    private List<Purchase> purchases;
    private List<Product> products;

    public Database() {
        this.purchases = new ArrayList<>();
        this.products = new ArrayList<>();
        products.add(new Product("Gra kraby na fali", 120.0, "www.google.pl", "www.google.pl", 72));
        products.add(new Product("Komputer 64 GB", 5499.0, "www.google.pl", "www.google.pl", 12));

        ChatMessage chatMessage = new ChatMessage("Wiadomosc", new User("Tomek"), LocalDateTime.now());
        FormItem formItem = new FormItem(new Product("Poduszka dla samotnych", 125.0, "www.google.pl", "www.google.pl", 100),
                Collections.singletonList(new User("Zosia")));
        Interests interests = new Interests(Arrays.asList("Planszowki", "Komputery", "Książki"));
        PurchaseDetails purchaseDetails = new PurchaseDetails(Collections.singletonList(formItem),
                Collections.singletonList(chatMessage),
                interests,
                Arrays.asList(new User("Zosia"), new User("Tomek"), new User("Ktoś")));

        purchases.add(new Purchase("Urodziny Marty", LocalDateTime.now().plusDays(2L), "Otwarty", purchaseDetails));
        purchases.add(new Purchase("Urodziny Romkka", LocalDateTime.now().plusDays(3L), "Zamkniety", purchaseDetails));
    }
}
