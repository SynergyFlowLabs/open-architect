package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes4.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105845a;

    public GooglePlayServicesManifestException(int i10, @NonNull String str) {
        super(str);
        this.f105845a = i10;
    }

    public int a() {
        return this.f105845a;
    }

    public int b() {
        return g.f106410a;
    }
}
