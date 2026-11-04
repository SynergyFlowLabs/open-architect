package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130274d;

    public z(String str, String str2, String str3) {
        super(r.TEL);
        this.f130272b = str;
        this.f130273c = str2;
        this.f130274d = str3;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        q.c(this.f130272b, sb2);
        q.c(this.f130274d, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f130272b;
    }

    public String f() {
        return this.f130273c;
    }

    public String g() {
        return this.f130274d;
    }
}
