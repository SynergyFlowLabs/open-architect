package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class d5 extends e7 implements i8 {
    private static final d5 zzb;
    private int zzd;
    private i5 zze;
    private i5 zzf;
    private int zzg;

    static {
        d5 d5Var = new d5();
        zzb = d5Var;
        e7.z(d5.class, d5Var);
    }

    private d5() {
    }

    public static c5 C() {
        return (c5) zzb.o();
    }

    static /* synthetic */ void E(d5 d5Var, i5 i5Var) {
        i5Var.getClass();
        d5Var.zze = i5Var;
        d5Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", l5.a()});
        }
        if (i11 == 3) {
            return new d5();
        }
        g5 g5Var = null;
        if (i11 == 4) {
            return new c5(g5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
