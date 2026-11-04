package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 extends qb implements zc {
    private static final a7 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        a7 a7Var = new a7();
        zzf = a7Var;
        qb.t(a7.class, a7Var);
    }

    private a7() {
    }

    public static z6 E() {
        return (z6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new a7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void G(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
