package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 extends qb implements zc {
    private static final i8 zzf;
    private int zzb;
    private zb zzd = qb.z();
    private d8 zze;

    static {
        i8 i8Var = new i8();
        zzf = i8Var;
        qb.t(i8.class, i8Var);
    }

    private i8() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", m8.class, "zze"});
        }
        if (i11 == 3) {
            return new i8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g8(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List E() {
        return this.zzd;
    }

    public final d8 F() {
        d8 d8Var = this.zze;
        return d8Var == null ? d8.G() : d8Var;
    }
}
