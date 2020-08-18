package com.zhuinden.sparkexperiment;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Owner on 2017. 03. 29..
 */
@Data
public class Word implements Serializable {
    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
