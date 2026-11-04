package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130152c;

    public b0(String str, String str2) {
        super(r.TEXT);
        this.f130151b = str;
        this.f130152c = str2;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return this.f130151b;
    }

    public String e() {
        return this.f130152c;
    }

    public String f() {
        return this.f130151b;
    }
}
