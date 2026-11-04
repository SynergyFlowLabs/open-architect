package com.google.api.client.http;

import com.google.api.client.util.n0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f115592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f115593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f115594e;

    public e(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    public static e g(String str, String str2) {
        return new e(str, n0.a(str2));
    }

    @Override // com.google.api.client.http.m
    public boolean a() {
        return true;
    }

    @Override // com.google.api.client.http.b
    public InputStream d() {
        return new ByteArrayInputStream(this.f115592c, this.f115593d, this.f115594e);
    }

    @Override // com.google.api.client.http.m
    public long getLength() {
        return this.f115594e;
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e e(boolean z10) {
        return (e) super.e(z10);
    }

    @Override // com.google.api.client.http.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e f(String str) {
        return (e) super.f(str);
    }

    public e(String str, byte[] bArr, int i10, int i11) {
        super(str);
        this.f115592c = (byte[]) com.google.api.client.util.h0.d(bArr);
        com.google.api.client.util.h0.c(i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length));
        this.f115593d = i10;
        this.f115594e = i11;
    }
}
