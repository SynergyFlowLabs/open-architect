package com.google.zxing.common;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f130312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<byte[]> f130315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f130317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f130318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f130319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f130320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f130321j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f130315d;
    }

    public String b() {
        return this.f130316e;
    }

    public Integer c() {
        return this.f130318g;
    }

    public Integer d() {
        return this.f130317f;
    }

    public int e() {
        return this.f130313b;
    }

    public Object f() {
        return this.f130319h;
    }

    public byte[] g() {
        return this.f130312a;
    }

    public int h() {
        return this.f130320i;
    }

    public int i() {
        return this.f130321j;
    }

    public String j() {
        return this.f130314c;
    }

    public boolean k() {
        return this.f130320i >= 0 && this.f130321j >= 0;
    }

    public void l(Integer num) {
        this.f130318g = num;
    }

    public void m(Integer num) {
        this.f130317f = num;
    }

    public void n(int i10) {
        this.f130313b = i10;
    }

    public void o(Object obj) {
        this.f130319h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f130312a = bArr;
        this.f130313b = bArr == null ? 0 : bArr.length * 8;
        this.f130314c = str;
        this.f130315d = list;
        this.f130316e = str2;
        this.f130320i = i11;
        this.f130321j = i10;
    }
}
