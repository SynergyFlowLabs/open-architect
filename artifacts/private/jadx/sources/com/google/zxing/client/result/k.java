package com.google.zxing.client.result;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f130224q = "KG";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f130225r = "LB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f130231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f130232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f130233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f130234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f130235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f130236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f130237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f130238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f130239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map<String, String> f130240p;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(r.PRODUCT);
        this.f130226b = str;
        this.f130227c = str2;
        this.f130228d = str3;
        this.f130229e = str4;
        this.f130230f = str5;
        this.f130231g = str6;
        this.f130232h = str7;
        this.f130233i = str8;
        this.f130234j = str9;
        this.f130235k = str10;
        this.f130236l = str11;
        this.f130237m = str12;
        this.f130238n = str13;
        this.f130239o = str14;
        this.f130240p = map;
    }

    private static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int u(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return String.valueOf(this.f130226b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!e(this.f130227c, kVar.f130227c) || !e(this.f130228d, kVar.f130228d) || !e(this.f130229e, kVar.f130229e) || !e(this.f130230f, kVar.f130230f) || !e(this.f130232h, kVar.f130232h) || !e(this.f130233i, kVar.f130233i) || !e(this.f130234j, kVar.f130234j) || !e(this.f130235k, kVar.f130235k) || !e(this.f130236l, kVar.f130236l) || !e(this.f130237m, kVar.f130237m) || !e(this.f130238n, kVar.f130238n) || !e(this.f130239o, kVar.f130239o) || !e(this.f130240p, kVar.f130240p)) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    public String f() {
        return this.f130232h;
    }

    public String g() {
        return this.f130233i;
    }

    public String h() {
        return this.f130229e;
    }

    public int hashCode() {
        return u(this.f130240p) ^ (((((((((((u(this.f130227c) ^ u(this.f130228d)) ^ u(this.f130229e)) ^ u(this.f130230f)) ^ u(this.f130232h)) ^ u(this.f130233i)) ^ u(this.f130234j)) ^ u(this.f130235k)) ^ u(this.f130236l)) ^ u(this.f130237m)) ^ u(this.f130238n)) ^ u(this.f130239o));
    }

    public String i() {
        return this.f130231g;
    }

    public String j() {
        return this.f130237m;
    }

    public String k() {
        return this.f130239o;
    }

    public String l() {
        return this.f130238n;
    }

    public String m() {
        return this.f130227c;
    }

    public String n() {
        return this.f130230f;
    }

    public String o() {
        return this.f130226b;
    }

    public String p() {
        return this.f130228d;
    }

    public Map<String, String> q() {
        return this.f130240p;
    }

    public String r() {
        return this.f130234j;
    }

    public String s() {
        return this.f130236l;
    }

    public String t() {
        return this.f130235k;
    }
}
