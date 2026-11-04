package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class aa extends e7 implements i8 {
    private static final aa zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        aa aaVar = new aa();
        zzb = aaVar;
        e7.z(aa.class, aaVar);
    }

    private aa() {
    }

    static /* synthetic */ void D(aa aaVar, za zaVar) {
        zaVar.getClass();
        aaVar.zzf = zaVar;
        aaVar.zze = 2;
    }

    static /* synthetic */ void E(aa aaVar, vb vbVar) {
        vbVar.getClass();
        aaVar.zzf = vbVar;
        aaVar.zze = 3;
    }

    static /* synthetic */ void F(aa aaVar, int i10) {
        aaVar.zzg = i10 - 1;
        aaVar.zzd |= 1;
    }

    public static y9 G() {
        return (y9) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", x9.f109436a, za.class, vb.class, fb.class});
        }
        if (i11 == 3) {
            return new aa();
        }
        z9 z9Var = null;
        if (i11 == 4) {
            return new y9(z9Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
