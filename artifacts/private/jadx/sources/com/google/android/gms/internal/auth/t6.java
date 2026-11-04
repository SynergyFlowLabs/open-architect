package com.google.android.gms.internal.auth;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 extends t3 implements x4 {
    private static final t6 zzb;
    private x3 zzd = t3.e();

    static {
        t6 t6Var = new t6();
        zzb = t6Var;
        t3.k(t6.class, t6Var);
    }

    private t6() {
    }

    public static t6 r(byte[] bArr) throws a4 {
        return (t6) t3.d(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.t3
    protected final Object o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t3.g(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new t6();
        }
        int i12 = 3 ^ 4;
        r6 r6Var = null;
        if (i11 == 4) {
            return new s6(r6Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List s() {
        return this.zzd;
    }
}
