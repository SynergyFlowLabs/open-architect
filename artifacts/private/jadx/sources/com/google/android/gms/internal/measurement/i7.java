package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 extends qb implements zc {
    private static final i7 zzh;
    private int zzb;
    private zb zzd = qb.z();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        i7 i7Var = new i7();
        zzh = i7Var;
        qb.t(i7.class, i7Var);
    }

    private i7() {
    }

    public static f7 L() {
        return (f7) zzh.p();
    }

    public static f7 M(i7 i7Var) {
        mb mbVarP = zzh.p();
        mbVarP.s(i7Var);
        return (f7) mbVarP;
    }

    private final void U() {
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
            return qb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", k7.class, "zze", "zzf", "zzg", h7.f108481a});
        }
        if (i11 == 3) {
            return new i7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new f7(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final k7 G(int i10) {
        return (k7) this.zzd.get(i10);
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    final /* synthetic */ void N(int i10, k7 k7Var) {
        k7Var.getClass();
        U();
        this.zzd.set(i10, k7Var);
    }

    final /* synthetic */ void O(k7 k7Var) {
        k7Var.getClass();
        U();
        this.zzd.add(k7Var);
    }

    final /* synthetic */ void P(Iterable iterable) {
        U();
        ba.i(iterable, this.zzd);
    }

    final /* synthetic */ void Q() {
        this.zzd = qb.z();
    }

    final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
