package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 extends qb implements zc {
    private static final p7 zzg;
    private yb zzb = qb.x();
    private yb zzd = qb.x();
    private zb zze = qb.z();
    private zb zzf = qb.z();

    static {
        p7 p7Var = new p7();
        zzg = p7Var;
        qb.t(p7.class, p7Var);
    }

    private p7() {
    }

    public static o7 M() {
        return (o7) zzg.p();
    }

    public static p7 N() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", w6.class, "zzf", r7.class});
        }
        if (i11 == 3) {
            return new p7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new o7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List E() {
        return this.zzb;
    }

    public final int F() {
        return this.zzb.size();
    }

    public final List G() {
        return this.zzd;
    }

    public final int H() {
        return this.zzd.size();
    }

    public final List I() {
        return this.zze;
    }

    public final int J() {
        return this.zze.size();
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        return this.zzf.size();
    }

    final /* synthetic */ void O(Iterable iterable) {
        yb ybVar = this.zzb;
        if (!ybVar.a()) {
            this.zzb = qb.y(ybVar);
        }
        ba.i(iterable, this.zzb);
    }

    final /* synthetic */ void P() {
        this.zzb = qb.x();
    }

    final /* synthetic */ void Q(Iterable iterable) {
        yb ybVar = this.zzd;
        if (!ybVar.a()) {
            this.zzd = qb.y(ybVar);
        }
        ba.i(iterable, this.zzd);
    }

    final /* synthetic */ void R() {
        this.zzd = qb.x();
    }

    final /* synthetic */ void S(Iterable iterable) {
        zb zbVar = this.zze;
        if (!zbVar.a()) {
            this.zze = qb.A(zbVar);
        }
        ba.i(iterable, this.zze);
    }

    final /* synthetic */ void T() {
        this.zze = qb.z();
    }

    final /* synthetic */ void U(Iterable iterable) {
        zb zbVar = this.zzf;
        if (!zbVar.a()) {
            this.zzf = qb.A(zbVar);
        }
        ba.i(iterable, this.zzf);
    }

    final /* synthetic */ void V() {
        this.zzf = qb.z();
    }
}
