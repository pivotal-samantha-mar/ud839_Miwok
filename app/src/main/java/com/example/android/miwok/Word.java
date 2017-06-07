package com.example.android.miwok;

/**
 * Created by pivotal on 2017-06-06.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /**Image */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = - 1;

    /** Constructor phrases */
    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation =miwokTranslation;

    }

    /** Constructor with images */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /** Get default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }


}
