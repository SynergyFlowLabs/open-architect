package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class n7 extends qb implements zc {
    private static final n7 zzf;
    private int zzb;
    private int zzd = 1;
    private zb zze = qb.z();

    static {
        n7 n7Var = new n7();
        zzf = n7Var;
        qb.t(n7.class, n7Var);
    }

    private n7() {
    }

    public static l7 E() {
        return (l7) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", m7.f108679a, "zze", a7.class});
        }
        if (i11 == 3) {
            return new n7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void F(a7 a7Var) {
        a7Var.getClass();
        zb zbVar = this.zze;
        if (!zbVar.a()) {
            this.zze = qb.A(zbVar);
        }
        this.zze.add(a7Var);
    }
}
