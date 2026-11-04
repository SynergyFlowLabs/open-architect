package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 extends qb implements zc {
    private static final w6 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        w6 w6Var = new w6();
        zzf = w6Var;
        qb.t(w6.class, w6Var);
    }

    private w6() {
    }

    public static v6 I() {
        return (v6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new w6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new v6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final long H() {
        return this.zze;
    }

    final /* synthetic */ void J(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void K(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
