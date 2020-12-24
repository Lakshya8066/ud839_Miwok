package com.example.android.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Default translation for the word
    private String mMiwokTralation;
    //Contains the image resource id
    private int mImageResourceId=-1;
    //contains the resource id of the associated audio file
    private int mAudioResourceId;

    /*
    Get default translation of the word
     */
    public Word(String defaultTranslation, String miwoktranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTralation = miwoktranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation, String miwoktranslation, int ResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTralation = miwoktranslation;
        mImageResourceId=ResourceId;
        mAudioResourceId=audioResourceId;
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

    public int getAudioResourceId() {return mAudioResourceId; }
}
