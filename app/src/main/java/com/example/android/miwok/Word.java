package com.example.android.miwok;

/**
 * Created by pivotal on 2017-06-06.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Constructor */
    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation =miwokTranslation;

    }

    /** Get default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


}
