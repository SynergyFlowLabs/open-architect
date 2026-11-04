package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "BeginSignInResultCreator")
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 1)
    private final PendingIntent f105502a;

    @SafeParcelable.b
    public BeginSignInResult(@NonNull @SafeParcelable.e(id = 1) PendingIntent pendingIntent) {
        this.f105502a = (PendingIntent) com.google.android.gms.common.internal.w.r(pendingIntent);
    }

    @NonNull
    public PendingIntent O1() {
        return this.f105502a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, O1(), i10, false);
        i6.b.b(parcel, iA);
    }
}
