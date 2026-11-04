package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y6 extends qb implements zc {
    private static final y6 zzj;
    private int zzb;
    private zb zzd = qb.z();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        y6 y6Var = new y6();
        zzj = y6Var;
        qb.t(y6.class, y6Var);
    }

    private y6() {
    }

    public static x6 O() {
        return (x6) zzj.p();
    }

    private final void Z() {
        zb zbVar = this.zzd;
        if (zbVar.a()) {
            return;
        }
        this.zzd = qb.A(zbVar);
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", c7.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new y6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new x6(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final c7 G(int i10) {
        return (c7) this.zzd.get(i10);
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final long J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final long L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 8) != 0;
    }

    public final int N() {
        return this.zzh;
    }

    final /* synthetic */ void P(int i10, c7 c7Var) {
        c7Var.getClass();
        Z();
        this.zzd.set(i10, c7Var);
    }

    final /* synthetic */ void Q(c7 c7Var) {
        c7Var.getClass();
        Z();
        this.zzd.add(c7Var);
    }

    final /* synthetic */ void R(Iterable iterable) {
        Z();
        ba.i(iterable, this.zzd);
    }

    final /* synthetic */ void S() {
        this.zzd = qb.z();
    }

    final /* synthetic */ void T(int i10) {
        Z();
        this.zzd.remove(i10);
    }

    final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void V(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    final /* synthetic */ void W(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    final /* synthetic */ void X(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
