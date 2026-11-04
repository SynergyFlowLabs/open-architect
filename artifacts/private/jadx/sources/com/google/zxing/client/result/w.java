package com.google.zxing.client.result;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f130268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f130269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130271e;

    public w(String str, String str2, String str3, String str4) {
        super(r.SMS);
        this.f130268b = new String[]{str};
        this.f130269c = new String[]{str2};
        this.f130270d = str3;
        this.f130271e = str4;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f130268b, sb2);
        q.c(this.f130270d, sb2);
        q.c(this.f130271e, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f130271e;
    }

    public String[] f() {
        return this.f130268b;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sms:");
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f130268b.length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(this.f130268b[i10]);
            String[] strArr = this.f130269c;
            if (strArr != null && strArr[i10] != null) {
                sb2.append(";via=");
                sb2.append(this.f130269c[i10]);
            }
        }
        boolean z11 = this.f130271e != null;
        boolean z12 = this.f130270d != null;
        if (z11 || z12) {
            sb2.append('?');
            if (z11) {
                sb2.append("body=");
                sb2.append(this.f130271e);
            }
            if (z12) {
                if (z11) {
                    sb2.append(kotlin.text.b0.f313279d);
                }
                sb2.append("subject=");
                sb2.append(this.f130270d);
            }
        }
        return sb2.toString();
    }

    public String h() {
        return this.f130270d;
    }

    public String[] i() {
        return this.f130269c;
    }

    public w(String[] strArr, String[] strArr2, String str, String str2) {
        super(r.SMS);
        this.f130268b = strArr;
        this.f130269c = strArr2;
        this.f130270d = str;
        this.f130271e = str2;
    }
}
