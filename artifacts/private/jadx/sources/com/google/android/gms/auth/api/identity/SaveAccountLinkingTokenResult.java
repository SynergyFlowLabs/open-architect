package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SaveAccountLinkingTokenResultCreator")
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 1)
    @p0
    private final PendingIntent f105530a;

    @SafeParcelable.b
    public SaveAccountLinkingTokenResult(@SafeParcelable.e(id = 1) @p0 PendingIntent pendingIntent) {
        this.f105530a = pendingIntent;
    }

    @p0
    public PendingIntent O1() {
        return this.f105530a;
    }

    public boolean T1() {
        return this.f105530a != null;
    }

    public boolean equals(@p0 Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return com.google.android.gms.common.internal.u.b(this.f105530a, ((SaveAccountLinkingTokenResult) obj).f105530a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105530a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, O1(), i10, false);
        i6.b.b(parcel, iA);
    }
}
