package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected final Status f105904a;

    public b(@NonNull Status status) {
        super(status.b2() + ": " + (status.e2() != null ? status.e2() : ""));
        this.f105904a = status;
    }

    @NonNull
    public Status a() {
        return this.f105904a;
    }

    public int b() {
        return this.f105904a.b2();
    }

    @p0
    @Deprecated
    public String c() {
        return this.f105904a.e2();
    }
}
