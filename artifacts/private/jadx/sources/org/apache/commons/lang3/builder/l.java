package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes14.dex */
public class l extends m {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final long f336985l3 = 1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f336986m3 = 2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f336987k3 = 2;

    public l() {
        i1();
    }

    private void i1() {
        P0("{" + System.lineSeparator() + ((Object) j1(this.f336987k3)));
        O0("," + System.lineSeparator() + ((Object) j1(this.f336987k3)));
        N0(System.lineSeparator() + ((Object) j1(this.f336987k3 + (-2))) + "}");
        R0("[" + System.lineSeparator() + ((Object) j1(this.f336987k3)));
        U0("," + System.lineSeparator() + ((Object) j1(this.f336987k3)));
        Q0(System.lineSeparator() + ((Object) j1(this.f336987k3 + (-2))) + "]");
    }

    private StringBuilder j1(int i10) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false & false;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(" ");
        }
        return sb2;
    }

    @Override // org.apache.commons.lang3.builder.m, org.apache.commons.lang3.builder.s
    public void C(StringBuffer stringBuffer, String str, Object obj) {
        if (org.apache.commons.lang3.m.T(obj.getClass()) || String.class.equals(obj.getClass()) || !h1(obj.getClass())) {
            super.C(stringBuffer, str, obj);
            return;
        }
        this.f336987k3 += 2;
        i1();
        stringBuffer.append(o.z0(obj, this));
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void H(StringBuffer stringBuffer, String str, byte[] bArr) {
        this.f336987k3 += 2;
        i1();
        super.H(stringBuffer, str, bArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void I(StringBuffer stringBuffer, String str, char[] cArr) {
        this.f336987k3 += 2;
        i1();
        super.I(stringBuffer, str, cArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void J(StringBuffer stringBuffer, String str, double[] dArr) {
        this.f336987k3 += 2;
        i1();
        super.J(stringBuffer, str, dArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void J0(StringBuffer stringBuffer, String str, Object obj) {
        this.f336987k3 += 2;
        i1();
        super.J0(stringBuffer, str, obj);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void K(StringBuffer stringBuffer, String str, float[] fArr) {
        this.f336987k3 += 2;
        i1();
        super.K(stringBuffer, str, fArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void L(StringBuffer stringBuffer, String str, int[] iArr) {
        this.f336987k3 += 2;
        i1();
        super.L(stringBuffer, str, iArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void M(StringBuffer stringBuffer, String str, long[] jArr) {
        this.f336987k3 += 2;
        i1();
        super.M(stringBuffer, str, jArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void N(StringBuffer stringBuffer, String str, Object[] objArr) {
        this.f336987k3 += 2;
        i1();
        super.N(stringBuffer, str, objArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void O(StringBuffer stringBuffer, String str, short[] sArr) {
        this.f336987k3 += 2;
        i1();
        super.O(stringBuffer, str, sArr);
        this.f336987k3 -= 2;
        i1();
    }

    @Override // org.apache.commons.lang3.builder.s
    protected void P(StringBuffer stringBuffer, String str, boolean[] zArr) {
        this.f336987k3 += 2;
        i1();
        super.P(stringBuffer, str, zArr);
        this.f336987k3 -= 2;
        i1();
    }
}
