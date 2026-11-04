package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class k6 extends qb implements zc {
    private static final k6 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        k6 k6Var = new k6();
        zzk = k6Var;
        qb.t(k6.class, k6Var);
    }

    private k6() {
    }

    public static j6 L() {
        return (j6) zzk.p();
    }

    public static k6 M() {
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new k6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new j6(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean J() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzj;
    }

    final /* synthetic */ void N(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    final /* synthetic */ void O(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }

    final /* synthetic */ void P(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }

    final /* synthetic */ void Q(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    final /* synthetic */ void R(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    final /* synthetic */ void S(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    final /* synthetic */ void T(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }
}
