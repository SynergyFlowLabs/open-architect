package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f130208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f130209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final char f130210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f130211j;

    public h0(String str, String str2, String str3, String str4, String str5, String str6, int i10, char c10, String str7) {
        super(r.VIN);
        this.f130203b = str;
        this.f130204c = str2;
        this.f130205d = str3;
        this.f130206e = str4;
        this.f130207f = str5;
        this.f130208g = str6;
        this.f130209h = i10;
        this.f130210i = c10;
        this.f130211j = str7;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(this.f130204c);
        sb2.append(' ');
        sb2.append(this.f130205d);
        sb2.append(' ');
        sb2.append(this.f130206e);
        sb2.append('\n');
        String str = this.f130207f;
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        sb2.append(this.f130209h);
        sb2.append(' ');
        sb2.append(this.f130210i);
        sb2.append(' ');
        sb2.append(this.f130211j);
        sb2.append('\n');
        return sb2.toString();
    }

    public String e() {
        return this.f130207f;
    }

    public int f() {
        return this.f130209h;
    }

    public char g() {
        return this.f130210i;
    }

    public String h() {
        return this.f130211j;
    }

    public String i() {
        return this.f130203b;
    }

    public String j() {
        return this.f130208g;
    }

    public String k() {
        return this.f130205d;
    }

    public String l() {
        return this.f130206e;
    }

    public String m() {
        return this.f130204c;
    }
}
