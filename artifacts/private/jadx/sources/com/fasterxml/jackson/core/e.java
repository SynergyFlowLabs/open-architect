package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes4.dex */
public enum e {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f102303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102304c;

    e(String str, boolean z10, int i10) {
        this.f102302a = str;
        this.f102303b = z10;
        this.f102304c = i10;
    }

    public int k() {
        return this.f102304c;
    }

    public String l() {
        return this.f102302a;
    }

    public boolean n() {
        return this.f102303b;
    }
}
