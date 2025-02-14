package module4;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

public class AExercise {
    public static void execute() {
        VideoGame wiiSportsGame = new VideoGame();
        wiiSportsGame.setName("Wii Sports");
        wiiSportsGame.setPrice(8.99);
        wiiSportsGame.setCategory("racing");

        System.out.println(wiiSportsGame.getCategory());
        System.out.println(wiiSportsGame.getName());
        System.out.println(wiiSportsGame.getPrice());
    }

    static class VideoGame {
        private String _name;
        private String _price;
        private String _category;

        private final Locale _locale = Locale.forLanguageTag("en-US");
        private final HashMap<String, String> _categoryMap = new HashMap<>();

        public VideoGame() {
            _buidCategoryMap();
        }

        private void _buidCategoryMap() {
            _categoryMap.put("action", "ACTION.");
            _categoryMap.put("rpg", "RPG.");
            _categoryMap.put("adventure", "ADVENTURE.");
            _categoryMap.put("racing", "RACING.");
        }

        public String getName() {
            return _name;
        }

        public String getPrice() {
            return _price;
        }

        public String getCategory() {
            return _category;
        }

        public void setName(String name) {
            _name = name;
        }

        public void setPrice(double price) {
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(_locale);
            int _minPriceAllowed = 10;
            if(price < _minPriceAllowed) {
                _price = numberFormat.format(_minPriceAllowed);
                return;
            }
            _price = numberFormat.format(price);
        }

        public void setCategory(String category) {
            if(_categoryMap.containsKey(category.toLowerCase().trim())) {
                _category = _categoryMap.get(category);
                return;
            }

            System.out.println("Categoy " + category + " not found");
        }

    }

}
