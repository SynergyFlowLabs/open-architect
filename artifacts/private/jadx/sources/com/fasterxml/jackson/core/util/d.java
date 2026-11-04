package com.fasterxml.jackson.core.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class d extends e.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f102798e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f102799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f102800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f102801h = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f102802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f102804d;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f102799f = property;
        f102800g = new d("  ", property);
    }

    public d() {
        this("  ", f102799f);
    }

    @Override // com.fasterxml.jackson.core.util.e.c, com.fasterxml.jackson.core.util.e.b
    public void a(com.fasterxml.jackson.core.h hVar, int i10) throws IOException {
        hVar.G2(this.f102804d);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.f102803c;
        while (true) {
            char[] cArr = this.f102802b;
            if (length <= cArr.length) {
                hVar.L2(cArr, 0, length);
                return;
            } else {
                hVar.L2(cArr, 0, cArr.length);
                length -= this.f102802b.length;
            }
        }
    }

    public String b() {
        return this.f102804d;
    }

    public String c() {
        return new String(this.f102802b, 0, this.f102803c);
    }

    public d d(String str) {
        return str.equals(c()) ? this : new d(str, this.f102804d);
    }

    public d e(String str) {
        return str.equals(this.f102804d) ? this : new d(c(), str);
    }

    @Override // com.fasterxml.jackson.core.util.e.c, com.fasterxml.jackson.core.util.e.b
    public boolean isInline() {
        return false;
    }

    public d(String str, String str2) {
        this.f102803c = str.length();
        this.f102802b = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.f102802b, length);
            length += str.length();
        }
        this.f102804d = str2;
    }
}
