package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getButtonSize", id = 2)
    private final int f106690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getColorScheme", id = 3)
    private final int f106691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopes", id = 4)
    @androidx.annotation.p0
    @Deprecated
    private final Scope[] f106692d;

    @SafeParcelable.b
    zax(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) @androidx.annotation.p0 Scope[] scopeArr) {
        this.f106689a = i10;
        this.f106690b = i11;
        this.f106691c = i12;
        this.f106692d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f106689a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f106690b);
        i6.b.F(parcel, 3, this.f106691c);
        i6.b.c0(parcel, 4, this.f106692d, i10, false);
        i6.b.b(parcel, iA);
    }
}
