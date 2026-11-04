package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopeUri", id = 2)
    private final String f105884b;

    @SafeParcelable.b
    Scope(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        com.google.android.gms.common.internal.w.m(str, "scopeUri must not be null or empty");
        this.f105883a = i10;
        this.f105884b = str;
    }

    @NonNull
    @g6.a
    public String O1() {
        return this.f105884b;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f105884b.equals(((Scope) obj).f105884b);
        }
        return false;
    }

    public int hashCode() {
        return this.f105884b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f105884b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f105883a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.Y(parcel, 2, O1(), false);
        i6.b.b(parcel, iA);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
