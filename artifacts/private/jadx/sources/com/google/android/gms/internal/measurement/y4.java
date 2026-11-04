package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 extends qb implements zc {
    private static final y4 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        y4 y4Var = new y4();
        zzg = y4Var;
        qb.t(y4.class, y4Var);
    }

    private y4() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", d5.f108357a, "zze", b5.f108294a, "zzf", i5.f108563a});
        }
        if (i11 == 3) {
            return new y4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new x4(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int F() {
        int iA = f5.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        int iA = c5.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = j5.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
