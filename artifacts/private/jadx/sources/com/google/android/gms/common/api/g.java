package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class g implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f105917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105918b;

    @com.google.android.gms.common.internal.a0
    @g6.a
    public g(@NonNull Status status, boolean z10) {
        this.f105917a = (Status) com.google.android.gms.common.internal.w.s(status, "Status must not be null");
        this.f105918b = z10;
    }

    public boolean a() {
        return this.f105918b;
    }

    public final boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f105917a.equals(gVar.f105917a) && this.f105918b == gVar.f105918b;
    }

    public final int hashCode() {
        return ((this.f105917a.hashCode() + 527) * 31) + (this.f105918b ? 1 : 0);
    }

    @Override // com.google.android.gms.common.api.v
    @NonNull
    public Status t() {
        return this.f105917a;
    }
}
