package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 extends qb implements zc {
    private static final b8 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        b8 b8Var = new b8();
        zzj = b8Var;
        qb.t(b8.class, b8Var);
    }

    private b8() {
    }

    public static a8 P() {
        return (a8) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new b8();
        }
        byte[] bArr = null;
        boolean z10 = false;
        if (i11 == 4) {
            return new a8(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final long F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final float M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzb & 32) != 0;
    }

    public final double O() {
        return this.zzi;
    }

    final /* synthetic */ void Q(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void T() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    final /* synthetic */ void U(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    final /* synthetic */ void W(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    final /* synthetic */ void X() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
