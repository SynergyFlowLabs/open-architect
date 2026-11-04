package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.u;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public final class c implements com.google.android.gms.common.api.a.d.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final c f105151b = new c(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f105152a;

    /* synthetic */ c(Bundle bundle, j jVar) {
        this.f105152a = bundle;
    }

    @NonNull
    public final Bundle a() {
        return new Bundle(this.f105152a);
    }

    public final boolean equals(@p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return u.a(this.f105152a, ((c) obj).f105152a);
        }
        return false;
    }

    public final int hashCode() {
        return u.c(this.f105152a);
    }
}
