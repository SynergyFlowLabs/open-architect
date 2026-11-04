package com.google.vr.sdk.deps;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
class r2 extends k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final byte[] f129563d;

    r2(byte[] bArr) {
        super((byte) 0);
        bArr.getClass();
        this.f129563d = bArr;
    }

    @Override // com.google.vr.sdk.deps.k2
    public final boolean F() {
        int iJ = J();
        return i6.h(this.f129563d, iJ, v() + iJ);
    }

    protected int J() {
        return 0;
    }

    @Override // com.google.vr.sdk.deps.k2
    public byte c(int i10) {
        return this.f129563d[i10];
    }

    @Override // com.google.vr.sdk.deps.k2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k2) && v() == ((k2) obj).v()) {
            if (v() == 0) {
                return true;
            }
            if (!(obj instanceof r2)) {
                return obj.equals(this);
            }
            r2 r2Var = (r2) obj;
            int iG = G();
            int iG2 = r2Var.G();
            if (iG != 0 && iG2 != 0 && iG != iG2) {
                return false;
            }
            int iV = v();
            if (iV > r2Var.v()) {
                int iV2 = v();
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Length too large: ");
                sb2.append(iV);
                sb2.append(iV2);
                throw new IllegalArgumentException(sb2.toString());
            }
            if (iV > r2Var.v()) {
                int iV3 = r2Var.v();
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("Ran off end of other: 0");
                sb3.append(", ");
                sb3.append(iV);
                sb3.append(", ");
                sb3.append(iV3);
                throw new IllegalArgumentException(sb3.toString());
            }
            byte[] bArr = this.f129563d;
            byte[] bArr2 = r2Var.f129563d;
            int iJ = J() + iV;
            int iJ2 = J();
            int iJ3 = r2Var.J();
            while (iJ2 < iJ) {
                if (bArr[iJ2] != bArr2[iJ3]) {
                    return false;
                }
                iJ2++;
                iJ3++;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.vr.sdk.deps.k2
    protected final int i(int i10, int i11, int i12) {
        return k3.a(i10, this.f129563d, J(), i12);
    }

    @Override // com.google.vr.sdk.deps.k2
    public final k2 k(int i10, int i11) {
        int iA = k2.A(i10, i11, v());
        return iA == 0 ? k2.f129465b : new o2(this.f129563d, J() + i10, iA);
    }

    @Override // com.google.vr.sdk.deps.k2
    protected final String r(Charset charset) {
        return new String(this.f129563d, J(), v(), charset);
    }

    @Override // com.google.vr.sdk.deps.k2
    final void s(j2 j2Var) throws IOException {
        j2Var.a(this.f129563d, J(), v());
    }

    @Override // com.google.vr.sdk.deps.k2
    protected void t(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f129563d, 0, bArr, 0, i12);
    }

    @Override // com.google.vr.sdk.deps.k2
    byte u(int i10) {
        return this.f129563d[i10];
    }

    @Override // com.google.vr.sdk.deps.k2
    public int v() {
        return this.f129563d.length;
    }
}
