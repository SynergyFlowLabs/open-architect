package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class sb extends e7 implements i8 {
    private static final sb zzb;
    private int zzd;
    private int zze;

    static {
        sb sbVar = new sb();
        zzb = sbVar;
        e7.z(sb.class, sbVar);
    }

    private sb() {
    }

    public static sb C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", qb.f109292a});
        }
        if (i11 == 3) {
            return new sb();
        }
        rb rbVar = null;
        if (i11 == 4) {
            return new pb(rbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
