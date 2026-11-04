package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 extends e7 implements i8 {
    private static final f5 zzb;
    private i7 zzd = e7.u();

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        e7.z(f5.class, f5Var);
    }

    private f5() {
    }

    public static e5 C() {
        return (e5) zzb.o();
    }

    static /* synthetic */ void E(f5 f5Var, Iterable iterable) {
        i7 i7Var = f5Var.zzd;
        if (!i7Var.h()) {
            int size = i7Var.size();
            f5Var.zzd = i7Var.e(size + size);
        }
        n5.h(iterable, f5Var.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", d5.class});
        }
        if (i11 == 3) {
            return new f5();
        }
        g5 g5Var = null;
        if (i11 == 4) {
            return new e5(g5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
