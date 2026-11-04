package com.facebook.login;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public enum p {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f101525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f101526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f101527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f101528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f101529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f101530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f101531g;

    p(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f101525a = z10;
        this.f101526b = z11;
        this.f101527c = z12;
        this.f101528d = z13;
        this.f101529e = z14;
        this.f101530f = z15;
        this.f101531g = z16;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        p[] pVarArrValuesCustom = values();
        return (p[]) Arrays.copyOf(pVarArrValuesCustom, pVarArrValuesCustom.length);
    }

    public final boolean l() {
        return this.f101529e;
    }

    public final boolean n() {
        return this.f101528d;
    }

    public final boolean o() {
        return this.f101530f;
    }

    public final boolean p() {
        return this.f101525a;
    }

    public final boolean q() {
        return this.f101531g;
    }

    public final boolean r() {
        return this.f101526b;
    }

    public final boolean s() {
        return this.f101527c;
    }
}
