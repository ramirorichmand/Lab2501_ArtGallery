public class Artwork {
        private String title;
        private Artist artist;
        private double price;
        private String nft;

        public Artwork(String title, Artist artist, double price, String nft) {
            this.title = title;
            this.artist = artist;
            this.price = price;
            this.nft = nft;
        }

        public String getTitle() {
            return title;
        }

        public Artist getArtist() {
            return artist;
        }

        public double getPrice() {
            return price;
        }

        public String getNft() {
            return nft;
        }
    }
    

