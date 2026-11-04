package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends qb implements zc {
    private static final r4 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private l4 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        r4 r4Var = new r4();
        zzj = r4Var;
        qb.t(r4.class, r4Var);
    }

    private r4() {
    }

    public static q4 M() {
        return (q4) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new r4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new q4(bArr);
        }
        int i12 = 1 ^ 5;
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final l4 H() {
        l4 l4Var = this.zzf;
        return l4Var == null ? l4.M() : l4Var;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 32) != 0;
    }

    public final boolean L() {
        return this.zzi;
    }

    final /* synthetic */ void N(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
