package at.ac.tgm.mpolat.Model;

import java.util.ArrayList;

public class Rechtschreibtrainer {

    /**
     * @author Muhammed Enes Polat
     * @version 18.09.2024
     *
     */

    private ArrayList<WoldPicturePair> pairList;
    private int selectePairIndex = 0;
    private int rightCounter = 0;
    private int falseCounter = 0;
    private int answerCounter = 0;

    public Rechtschreibtrainer() {

    }

    public Rechtschreibtrainer(ArrayList<WoldPicturePair> pairList) {
        this.pairList = pairList;
    }

    public int selectPair(int index){

    }

    public int selcetRandomPair(){

    }

    public boolean checkAnswer(String answer){

    }

    public void setPairList(ArrayList<WoldPicturePair> pairList) {
        this.pairList = pairList;
    }

    public void setSelectePairIndex(int selectePairIndex) {
        this.selectePairIndex = selectePairIndex;
    }

    public void setRightCounter(int rightCounter) {
        this.rightCounter = rightCounter;
    }

    public ArrayList<WoldPicturePair> getPairList() {
        return pairList;
    }

    public WoldPicturePair getSelectedPair() {
        return pairList.get(selectePairIndex);
    }

    public int getRightCounter() {
        return rightCounter;
    }

    public int getFalseCounter() {
        return falseCounter;
    }

    public int getAnswerCounter() {
        return answerCounter;
    }

}

