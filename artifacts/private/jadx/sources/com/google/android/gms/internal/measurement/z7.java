package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends qb implements zc {
    private static final z7 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        z7 z7Var = new z7();
        zzg = z7Var;
        qb.t(z7.class, z7Var);
    }

    private z7() {
    }

    public static s7 F() {
        return (s7) zzg.p();
    }

    public static z7 G() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", x7.f108965a, "zze", t7.f108866a, "zzf", v7.f108915a});
        }
        if (i11 == 3) {
            return new z7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new s7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final u7 E() {
        u7 u7VarB = u7.b(this.zze);
        if (u7VarB == null) {
            u7VarB = u7.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
        }
        return u7VarB;
    }

    final /* synthetic */ void H(u7 u7Var) {
        this.zze = u7Var.a();
        this.zzb |= 2;
    }

    public final int J() {
        int iA = y7.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        int iA = w7.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void L(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void M(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
