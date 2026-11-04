package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class i5 extends e7 implements i8 {
    private static final i5 zzb;
    private int zzd;
    private String zze = "";

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        e7.z(i5.class, i5Var);
    }

    private i5() {
    }

    public static h5 C() {
        return (h5) zzb.o();
    }

    static /* synthetic */ void E(i5 i5Var, String str) {
        i5Var.zzd |= 1;
        i5Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        int i12 = 7 & 2;
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        int i13 = i12 << 3;
        if (i11 == 3) {
            return new i5();
        }
        j5 j5Var = null;
        int i14 = 7 | 0;
        if (i11 == 4) {
            return new h5(j5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
