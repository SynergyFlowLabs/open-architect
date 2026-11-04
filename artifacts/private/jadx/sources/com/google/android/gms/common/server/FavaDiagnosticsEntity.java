package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import i6.b;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FavaDiagnosticsEntityCreator")
@g6.a
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(id = 2)
    public final String f106827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    public final int f106828c;

    @SafeParcelable.b
    public FavaDiagnosticsEntity(@SafeParcelable.e(id = 1) int i10, @NonNull @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i11) {
        this.f106826a = i10;
        this.f106827b = str;
        this.f106828c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f106826a;
        int iA = b.a(parcel);
        b.F(parcel, 1, i11);
        b.Y(parcel, 2, this.f106827b, false);
        b.F(parcel, 3, this.f106828c);
        b.b(parcel, iA);
    }

    @g6.a
    public FavaDiagnosticsEntity(@NonNull String str, int i10) {
        this.f106826a = 1;
        this.f106827b = str;
        this.f106828c = i10;
    }
}
