package com.simprints.libsimprints;

import android.os.Parcel;
import android.os.Parcelable;

public class Identification implements Parcelable {

    private String guid;
    private float confidence;

    /**
     * Empty constructor
     */
    public Identification() {

    }

    /**
     * This constructor creates a new identification
     *
     * @param guid
     * @param confidence
     */
    public Identification(String guid, float confidence) {
        this.guid = guid;
        this.confidence = confidence;
    }

    protected Identification(Parcel in) {
        guid = in.readString();
        confidence = in.readFloat();
    }

    public static final Creator<Identification> CREATOR = new Creator<Identification>() {
        @Override
        public Identification createFromParcel(Parcel in) {
            return new Identification(in);
        }

        @Override
        public Identification[] newArray(int size) {
            return new Identification[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.guid);
        dest.writeFloat(this.confidence);
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public float getConfidence() {
        return confidence;
    }

    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }
}
