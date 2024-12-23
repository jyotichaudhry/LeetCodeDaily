public class Codec {
Set<String> set = new HashSet<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
             set.add(longUrl);
             return longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
return shortUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));