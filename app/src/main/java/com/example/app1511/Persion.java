package com.example.app1511;

import android.os.Parcel;
import android.os.Parcelable;

public class Persion implements Parcelable {
    String name;
    int age ;
    public Persion (String name , Integer age){
        this.name = name;
        this.age = age;
    }

    protected Persion(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    public static final Creator<Persion> CREATOR = new Creator<Persion>() {
        @Override
        public Persion createFromParcel(Parcel in) {
            return new Persion(in);
        }

        @Override
        public Persion[] newArray(int size) {
            return new Persion[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}
