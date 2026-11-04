package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f105668a = 1;

    @NonNull
    @g6.a
    public a a(@p0 Object obj) {
        this.f105668a = (this.f105668a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @g6.a
    public int b() {
        return this.f105668a;
    }

    @NonNull
    public final a c(boolean z10) {
        this.f105668a = (this.f105668a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
