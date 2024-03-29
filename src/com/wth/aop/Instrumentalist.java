package com.wth.aop;

/**
 * Created by wth on 2019/7/24.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("演奏"+song);
        instrument.play();

    }
}
