package com.dicoding.konversisuhu;

import android.os.Parcel;
import android.os.Parcelable;

public class Konversi implements Parcelable {
    private String hasilKonversi;

    public String getHasilKonversi() {
        return hasilKonversi;
    }

    public void setHasilKonversi(String hasilKonversi) {
        this.hasilKonversi = hasilKonversi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hasilKonversi);
    }

    public Konversi() {
    }

    protected Konversi(Parcel in) {
        this.hasilKonversi = in.readString();
    }

    public static final Parcelable.Creator<Konversi> CREATOR = new Parcelable.Creator<Konversi>() {
        @Override
        public Konversi createFromParcel(Parcel source) {
            return new Konversi(source);
        }

        @Override
        public Konversi[] newArray(int size) {
            return new Konversi[size];
        }
    };
}
