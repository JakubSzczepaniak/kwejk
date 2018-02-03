package pl.projekt.kwejk.repository;

import pl.projekt.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifRespository {

    private static List<Gif> ALL_GIFS = new ArrayList<>();

    static {
        ALL_GIFS.add(new Gif("android-explosion"));
        ALL_GIFS.add(new Gif("ben-mike"));
        ALL_GIFS.add(new Gif("book-dominos"));
        ALL_GIFS.add(new Gif("compiler-hot"));
        ALL_GIFS.add(new Gif("cowboy-coder"));
        ALL_GIFS.add(new Gif("infinite-andrew"));



    }
        public List<Gif> findAll(){
        return ALL_GIFS;

    }
}
