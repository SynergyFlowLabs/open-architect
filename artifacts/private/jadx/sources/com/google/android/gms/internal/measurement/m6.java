package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends qb implements zc {
    private static final m6 zzh;
    private int zzb;
    private int zzd;
    private p7 zze;
    private p7 zzf;
    private boolean zzg;

    static {
        m6 m6Var = new m6();
        zzh = m6Var;
        qb.t(m6.class, m6Var);
    }

    private m6() {
    }

    public static l6 L() {
        return (l6) zzh.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new m6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l6(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final p7 G() {
        p7 p7Var = this.zze;
        return p7Var == null ? p7.N() : p7Var;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final p7 I() {
        p7 p7Var = this.zzf;
        return p7Var == null ? p7.N() : p7Var;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final boolean K() {
        return this.zzg;
    }

    final /* synthetic */ void M(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void N(p7 p7Var) {
        p7Var.getClass();
        this.zze = p7Var;
        this.zzb |= 2;
    }

    final /* synthetic */ void O(p7 p7Var) {
        this.zzf = p7Var;
        this.zzb |= 4;
    }

    final /* synthetic */ void P(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
