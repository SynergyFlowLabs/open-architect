package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f130219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f130221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f130222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f130223i;

    public j0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(80);
        q.c(this.f130216b, sb2);
        q.c(this.f130217c, sb2);
        q.c(this.f130218d, sb2);
        q.c(Boolean.toString(this.f130219e), sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f130221g;
    }

    public String f() {
        return this.f130222h;
    }

    public String g() {
        return this.f130220f;
    }

    public String h() {
        return this.f130217c;
    }

    public String i() {
        return this.f130218d;
    }

    public String j() {
        return this.f130223i;
    }

    public String k() {
        return this.f130216b;
    }

    public boolean l() {
        return this.f130219e;
    }

    public j0(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, null, null, null, null);
    }

    public j0(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7) {
        super(r.WIFI);
        this.f130216b = str2;
        this.f130217c = str;
        this.f130218d = str3;
        this.f130219e = z10;
        this.f130220f = str4;
        this.f130221g = str5;
        this.f130222h = str6;
        this.f130223i = str7;
    }
}
