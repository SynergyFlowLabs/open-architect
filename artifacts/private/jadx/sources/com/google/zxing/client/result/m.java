package com.google.zxing.client.result;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f130241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f130242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f130243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130244e;

    m(double d10, double d11, double d12, String str) {
        super(r.GEO);
        this.f130241b = d10;
        this.f130242c = d11;
        this.f130243d = d12;
        this.f130244e = str;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f130241b);
        sb2.append(", ");
        sb2.append(this.f130242c);
        if (this.f130243d > 0.0d) {
            sb2.append(", ");
            sb2.append(this.f130243d);
            sb2.append(ni.f.f333367d);
        }
        if (this.f130244e != null) {
            sb2.append(" (");
            sb2.append(this.f130244e);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public double e() {
        return this.f130243d;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:");
        sb2.append(this.f130241b);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.f130242c);
        if (this.f130243d > 0.0d) {
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(this.f130243d);
        }
        if (this.f130244e != null) {
            sb2.append('?');
            sb2.append(this.f130244e);
        }
        return sb2.toString();
    }

    public double g() {
        return this.f130241b;
    }

    public double h() {
        return this.f130242c;
    }

    public String i() {
        return this.f130244e;
    }
}
