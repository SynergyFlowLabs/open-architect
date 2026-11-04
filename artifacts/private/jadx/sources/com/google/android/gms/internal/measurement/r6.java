package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class r6 extends qb implements zc {
    private static final r6 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        r6 r6Var = new r6();
        zzf = r6Var;
        qb.t(r6.class, r6Var);
    }

    private r6() {
    }

    public static q6 E() {
        return (q6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", o6.f108711a, "zze", s6.f108798a});
        }
        if (i11 == 3) {
            return new r6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new q6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int G() {
        int iA = p6.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = t6.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void I(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void J(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
