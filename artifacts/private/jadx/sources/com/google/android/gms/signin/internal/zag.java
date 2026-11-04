package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends AbstractSafeParcelable implements v {
    public static final Parcelable.Creator<zag> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGrantedScopes", id = 1)
    private final List f110941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getToken", id = 2)
    @p0
    private final String f110942b;

    @SafeParcelable.b
    public zag(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @p0 String str) {
        this.f110941a = list;
        this.f110942b = str;
    }

    @Override // com.google.android.gms.common.api.v
    public final Status t() {
        return this.f110942b != null ? Status.f105886f : Status.f105890j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f110941a;
        int iA = i6.b.a(parcel);
        i6.b.a0(parcel, 1, list, false);
        i6.b.Y(parcel, 2, this.f110942b, false);
        i6.b.b(parcel, iA);
    }
}
