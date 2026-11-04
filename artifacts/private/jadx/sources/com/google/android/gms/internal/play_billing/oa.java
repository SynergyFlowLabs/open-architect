package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class oa extends e7 implements i8 {
    private static final oa zzb;
    private int zzd;
    private int zzf;
    private fa zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private h7 zzg = e7.t();
    private i7 zzh = e7.u();

    static {
        oa oaVar = new oa();
        zzb = oaVar;
        e7.z(oa.class, oaVar);
    }

    private oa() {
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", ma.f109228a, "zzg", ja.f109154a, "zzh", lb.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new oa();
        }
        na naVar = null;
        if (i11 == 4) {
            return new la(naVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
