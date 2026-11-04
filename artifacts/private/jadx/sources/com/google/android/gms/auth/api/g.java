package com.google.android.gms.auth.api;

import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f105424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    protected String f105425b;

    public g() {
        this.f105424a = Boolean.FALSE;
    }

    @a0
    public final g a(String str) {
        this.f105425b = str;
        return this;
    }

    @a0
    public g(h hVar) {
        this.f105424a = Boolean.FALSE;
        h.b(hVar);
        this.f105424a = Boolean.valueOf(hVar.f105428b);
        this.f105425b = hVar.f105429c;
    }
}
