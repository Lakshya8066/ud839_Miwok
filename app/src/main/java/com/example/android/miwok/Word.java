package com.example.android.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Default translation for the word
    private String mMiwokTralation;
    /*
    Get default translation of the word
     */
    public Word(String defaultTranslation, String miwoktranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTralation = miwoktranslation;
    }
    /*
    Get Miwok translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTralation;
    }
}
