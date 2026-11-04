package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d8 extends qb implements zc {
    private static final d8 zzd;
    private zb zzb = qb.z();

    static {
        d8 d8Var = new d8();
        zzd = d8Var;
        qb.t(d8.class, d8Var);
    }

    private d8() {
    }

    public static d8 G() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", f8.class});
        }
        if (i11 == 3) {
            return new d8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new c8(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List E() {
        return this.zzb;
    }

    public final int F() {
        return this.zzb.size();
    }
}
