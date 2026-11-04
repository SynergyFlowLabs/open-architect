package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "PrfExtensionCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @SafeParcelable.c(getter = "getEvaluationPoints", id = 1)
    private final byte[][] f107303a;

    @SafeParcelable.b
    public zzai(@NonNull @SafeParcelable.e(id = 1) byte[][] bArr) {
        com.google.android.gms.common.internal.w.a(bArr != null);
        com.google.android.gms.common.internal.w.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            com.google.android.gms.common.internal.w.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            com.google.android.gms.common.internal.w.a(bArr[i11] != null);
            int length = bArr[i11].length;
            com.google.android.gms.common.internal.w.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f107303a = bArr;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.f107303a, ((zzai) obj).f107303a);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f107303a) {
            iC ^= com.google.android.gms.common.internal.u.c(bArr);
        }
        return iC;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.n(parcel, 1, this.f107303a, false);
        i6.b.b(parcel, iA);
    }
}
