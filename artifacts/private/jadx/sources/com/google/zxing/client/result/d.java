package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f130156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f130157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f130159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f130160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f130161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f130162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f130163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f130164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String[] f130165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f130166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f130167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f130168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f130169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String[] f130170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String[] f130171q;

    public d(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f130156b, sb2);
        q.d(this.f130157c, sb2);
        q.c(this.f130158d, sb2);
        q.c(this.f130169o, sb2);
        q.c(this.f130167m, sb2);
        q.d(this.f130165k, sb2);
        q.d(this.f130159e, sb2);
        q.d(this.f130161g, sb2);
        q.c(this.f130163i, sb2);
        q.d(this.f130170p, sb2);
        q.c(this.f130168n, sb2);
        q.d(this.f130171q, sb2);
        q.c(this.f130164j, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f130166l;
    }

    public String[] f() {
        return this.f130165k;
    }

    public String g() {
        return this.f130168n;
    }

    public String[] h() {
        return this.f130162h;
    }

    public String[] i() {
        return this.f130161g;
    }

    public String[] j() {
        return this.f130171q;
    }

    public String k() {
        return this.f130163i;
    }

    public String[] l() {
        return this.f130156b;
    }

    public String[] m() {
        return this.f130157c;
    }

    public String n() {
        return this.f130164j;
    }

    public String o() {
        return this.f130167m;
    }

    public String[] p() {
        return this.f130159e;
    }

    public String[] q() {
        return this.f130160f;
    }

    public String r() {
        return this.f130158d;
    }

    public String s() {
        return this.f130169o;
    }

    public String[] t() {
        return this.f130170p;
    }

    public d(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(r.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
        this.f130156b = strArr;
        this.f130157c = strArr2;
        this.f130158d = str;
        this.f130159e = strArr3;
        this.f130160f = strArr4;
        this.f130161g = strArr5;
        this.f130162h = strArr6;
        this.f130163i = str2;
        this.f130164j = str3;
        this.f130165k = strArr7;
        this.f130166l = strArr8;
        this.f130167m = str4;
        this.f130168n = str5;
        this.f130169o = str6;
        this.f130170p = strArr9;
        this.f130171q = strArr10;
    }
}
