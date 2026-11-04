package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ModuleInstallIntentResponseCreator")
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 1)
    @p0
    private final PendingIntent f106729a;

    @SafeParcelable.b
    @g6.a
    public ModuleInstallIntentResponse(@SafeParcelable.e(id = 1) @p0 PendingIntent pendingIntent) {
        this.f106729a = pendingIntent;
    }

    @p0
    public PendingIntent O1() {
        return this.f106729a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, O1(), i10, false);
        i6.b.b(parcel, iA);
    }
}
