package com.google.android.gms.internal.measurement;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class w0 extends d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f108935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f108936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f108937e;

    /* synthetic */ w0(String str, boolean z10, int i10, t0 t0Var, u0 u0Var, int i11, byte[] bArr) {
        this.f108935c = str;
        this.f108936d = i10;
        this.f108937e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final String a() {
        return this.f108935c;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final t0 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final u0 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final int e() {
        return this.f108936d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            if (this.f108935c.equals(d1Var.a())) {
                d1Var.b();
                int i10 = this.f108936d;
                int iE = d1Var.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    d1Var.c();
                    d1Var.d();
                    int i11 = this.f108937e;
                    int iF = d1Var.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final int f() {
        return this.f108937e;
    }

    public final int hashCode() {
        int iHashCode = this.f108935c.hashCode() ^ 1000003;
        int i10 = this.f108936d;
        int i11 = 5 << 0;
        if (i10 == 0) {
            throw null;
        }
        int i12 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f108937e != 0) {
            return (i12 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f108936d;
        String str2 = AbstractJsonLexerKt.NULL;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.f108937e == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.f108935c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
