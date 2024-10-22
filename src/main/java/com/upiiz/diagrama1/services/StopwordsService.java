package com.upiiz.diagrama1.services;

import com.upiiz.diagrama1.models.Stopwords;
import com.upiiz.diagrama1.repositories.StopwordsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopwordsService {
    StopwordsRepository stopwordsRepository;

    public StopwordsService(StopwordsRepository stopwordsRepository) {
        this.stopwordsRepository = stopwordsRepository;
    }

    public List<Stopwords> getAllStopwords(){
        return stopwordsRepository.getStopwords();
    }

    public Stopwords getStopwordById(Long id){
        return stopwordsRepository.obtenerStopwordPorId(id);
    }

    public Stopwords guardarStopword(Stopwords stopword){
        return stopwordsRepository.guardar(stopword);
    }

    public Stopwords updateStopword(Stopwords stopword){
        return stopwordsRepository.actualizar(stopword);
    }

    public void deleteStopword(Long id){
        stopwordsRepository.eliminar(id);
    }
}
