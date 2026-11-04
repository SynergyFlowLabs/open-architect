package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Feature f105903a;

    @g6.a
    public a0(@NonNull Feature feature) {
        this.f105903a = feature;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f105903a));
    }
}
