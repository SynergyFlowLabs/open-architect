package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f130198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f130199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f130200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130202f;

    h(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.d(this.f130198b, sb2);
        q.d(this.f130199c, sb2);
        q.d(this.f130200d, sb2);
        q.c(this.f130201e, sb2);
        q.c(this.f130202f, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f130200d;
    }

    public String f() {
        return this.f130202f;
    }

    public String[] g() {
        return this.f130199c;
    }

    @Deprecated
    public String h() {
        String[] strArr = this.f130198b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String i() {
        return androidx.core.net.c.f48012b;
    }

    public String j() {
        return this.f130201e;
    }

    public String[] k() {
        return this.f130198b;
    }

    h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(r.EMAIL_ADDRESS);
        this.f130198b = strArr;
        this.f130199c = strArr2;
        this.f130200d = strArr3;
        this.f130201e = str;
        this.f130202f = str2;
    }
}
