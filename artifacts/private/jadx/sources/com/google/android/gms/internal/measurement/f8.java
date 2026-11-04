package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f8 extends qb implements zc {
    private static final f8 zzf;
    private int zzb;
    private String zzd = "";
    private zb zze = qb.z();

    static {
        f8 f8Var = new f8();
        zzf = f8Var;
        qb.t(f8.class, f8Var);
    }

    private f8() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", m8.class});
        }
        if (i11 == 3) {
            return new f8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new e8(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }
}
