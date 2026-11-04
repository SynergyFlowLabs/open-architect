package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class v9 extends e7 implements i8 {
    private static final v9 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private fa zzh;

    static {
        v9 v9Var = new v9();
        zzb = v9Var;
        e7.z(v9.class, v9Var);
    }

    private v9() {
    }

    public static v9 D(byte[] bArr, p6 p6Var) throws l7 {
        return (v9) e7.s(zzb, bArr, p6Var);
    }

    static /* synthetic */ void E(v9 v9Var, fa faVar) {
        faVar.getClass();
        v9Var.zzh = faVar;
        v9Var.zzd |= 2;
    }

    static /* synthetic */ void F(v9 v9Var, za zaVar) {
        zaVar.getClass();
        v9Var.zzf = zaVar;
        v9Var.zze = 4;
    }

    static /* synthetic */ void G(v9 v9Var, int i10) {
        v9Var.zzg = i10 - 1;
        v9Var.zzd |= 1;
    }

    public static t9 H() {
        return (t9) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", x9.f109436a, "zzh", za.class});
        }
        if (i11 == 3) {
            return new v9();
        }
        u9 u9Var = null;
        if (i11 == 4) {
            return new t9(u9Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
