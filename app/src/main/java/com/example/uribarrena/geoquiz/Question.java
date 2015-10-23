package com.example.uribarrena.geoquiz;

/**
 * Created by uribarrena on 5/10/15.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question (int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
