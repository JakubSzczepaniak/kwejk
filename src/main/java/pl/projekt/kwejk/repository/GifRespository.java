package pl.projekt.kwejk.repository;


import pl.projekt.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GifRespository {


    private static List<Gif> ALL_GIFS = new ArrayList<>();

    static {
        ALL_GIFS.add(new Gif("android-explosion", true));
        ALL_GIFS.add(new Gif("ben-and-mike", true));
        ALL_GIFS.add(new Gif("book-dominos", false));
        ALL_GIFS.add(new Gif("compiler-bot", false));
        ALL_GIFS.add(new Gif("cowboy-coder", false));
        ALL_GIFS.add(new Gif("infinite-andrew", false));
    }

    public List<Gif> findAll() {
        return ALL_GIFS;
    }

    public static List<Gif> findFavorites() {
        return ALL_GIFS.stream().filter(p -> p.isFavorite()).collect(Collectors.toList());
    }
}