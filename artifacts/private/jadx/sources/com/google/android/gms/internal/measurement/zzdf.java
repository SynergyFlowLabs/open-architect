package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ScionActivityInfoCreator")
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    public final int f109035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    @androidx.annotation.p0
    public final String f109036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    @androidx.annotation.p0
    public final Intent f109037c;

    @SafeParcelable.b
    public zzdf(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @androidx.annotation.p0 String str, @SafeParcelable.e(id = 3) @androidx.annotation.p0 Intent intent) {
        this.f109035a = i10;
        this.f109036b = str;
        this.f109037c = intent;
    }

    public static zzdf O1(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.f109035a == zzdfVar.f109035a && Objects.equals(this.f109036b, zzdfVar.f109036b) && Objects.equals(this.f109037c, zzdfVar.f109037c);
    }

    public final int hashCode() {
        return this.f109035a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f109035a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        int i12 = 2 << 0;
        i6.b.Y(parcel, 2, this.f109036b, false);
        i6.b.S(parcel, 3, this.f109037c, i10, false);
        i6.b.b(parcel, iA);
    }
}
