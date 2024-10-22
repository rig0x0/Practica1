package com.upiiz.diagrama1.repositories;

import com.upiiz.diagrama1.models.Stopwords;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StopwordsRepository {
    private List<Stopwords> stopwords = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Stopwords guardar(Stopwords stopword){
        stopword.setId(id.incrementAndGet());
        stopwords.add(stopword);
        return stopword;
    }

    public List<Stopwords> getStopwords(){
        return stopwords;
    }

    public Stopwords obtenerStopwordPorId(Long id){
        return stopwords.stream().filter(stopwords -> stopwords.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        stopwords.removeIf(stopwords -> stopwords.getId().equals(id));
    }

    public Stopwords actualizar(Stopwords stopword){
        eliminar(stopword.getId());
        stopwords.add(stopword);
        return stopword;
    }
}
