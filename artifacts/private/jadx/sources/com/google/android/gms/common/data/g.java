package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class g<T extends SafeParcelable> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f106386c = {"data"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcelable.Creator f106387b;

    @g6.a
    public g(@NonNull DataHolder dataHolder, @NonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f106387b = creator;
    }

    @g6.a
    public static <T extends SafeParcelable> void c(@NonNull DataHolder.a aVar, @NonNull T t10) {
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", parcelObtain.marshall());
        aVar.c(contentValues);
        parcelObtain.recycle();
    }

    @NonNull
    @g6.a
    public static DataHolder.a l() {
        return DataHolder.O1(f106386c);
    }

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @NonNull
    @g6.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        DataHolder dataHolder = (DataHolder) w.r(this.f106379a);
        byte[] bArrE2 = dataHolder.e2("data", i10, dataHolder.s2(i10));
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrE2, 0, bArrE2.length);
        parcelObtain.setDataPosition(0);
        T t10 = (T) this.f106387b.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return t10;
    }
}
