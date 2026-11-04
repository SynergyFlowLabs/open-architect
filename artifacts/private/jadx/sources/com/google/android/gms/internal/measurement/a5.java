package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends qb implements zc {
    private static final a5 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        a5 a5Var = new a5();
        zzf = a5Var;
        qb.t(a5.class, a5Var);
    }

    private a5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            vb vbVar = d5.f108357a;
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", vbVar, "zze", vbVar});
        }
        if (i11 == 3) {
            return new a5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z4(bArr);
        }
        if (i11 == 5) {
            return zzf;
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
        int iA = f5.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
