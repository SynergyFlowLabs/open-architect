package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 1)
    private final int f106730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getShouldUnregisterListener", id = 2)
    private final boolean f106731b;

    @g6.a
    public ModuleInstallResponse(int i10) {
        this(i10, false);
    }

    public boolean O1() {
        return this.f106730a == 0;
    }

    public int T1() {
        return this.f106730a;
    }

    public final boolean b2() {
        return this.f106731b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, T1());
        i6.b.g(parcel, 2, this.f106731b);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    public ModuleInstallResponse(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10) {
        this.f106730a = i10;
        this.f106731b = z10;
    }
}
