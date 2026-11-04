package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getType", id = 2)
    private int f105658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBundle", id = 3)
    private Bundle f105659c;

    @SafeParcelable.b
    GoogleSignInOptionsExtensionParcelable(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) Bundle bundle) {
        this.f105657a = i10;
        this.f105658b = i11;
        this.f105659c = bundle;
    }

    @g6.a
    public int O1() {
        return this.f105658b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f105657a);
        i6.b.F(parcel, 2, O1());
        i6.b.k(parcel, 3, this.f105659c, false);
        i6.b.b(parcel, iA);
    }

    public GoogleSignInOptionsExtensionParcelable(@NonNull com.google.android.gms.auth.api.signin.d dVar) {
        this(1, dVar.a(), dVar.b());
    }
}
