package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130262c;

    s(String str) {
        this(str, str);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        return this.f130261b;
    }

    public String e() {
        return this.f130262c;
    }

    public String f() {
        return this.f130261b;
    }

    s(String str, String str2) {
        super(r.PRODUCT);
        this.f130261b = str;
        this.f130262c = str2;
    }
}
