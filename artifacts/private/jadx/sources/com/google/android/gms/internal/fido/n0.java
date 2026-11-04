package com.google.android.gms.internal.fido;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f108027a = n0.class.getClassLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f108028b = 0;

    private n0() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList b(Parcel parcel) {
        return parcel.readArrayList(f108027a);
    }

    public static void c(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
