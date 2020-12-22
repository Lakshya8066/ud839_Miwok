package com.example.android.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Default translation for the word
    private String mMiwokTralation;
    //Contains the image resource id
    private int mImageResourceId=-1;

    /*
    Get default translation of the word
     */
    public Word(String defaultTranslation, String miwoktranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTralation = miwoktranslation;
    }
    public Word(String defaultTranslation, String miwoktranslation, int ResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTralation = miwoktranslation;
        mImageResourceId=ResourceId;
    }

    /*
    Get Miwok translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTralation;
    }

    public int getImageResourceId() {return mImageResourceId; }
}
