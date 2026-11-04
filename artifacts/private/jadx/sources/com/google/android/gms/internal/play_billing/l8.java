package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class l8 implements s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8 f109196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f9 f109197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f109198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q6 f109199d;

    private l8(f9 f9Var, q6 q6Var, h8 h8Var) {
        this.f109197b = f9Var;
        this.f109198c = h8Var instanceof b7;
        this.f109199d = q6Var;
        this.f109196a = h8Var;
    }

    static l8 i(f9 f9Var, q6 q6Var, h8 h8Var) {
        return new l8(f9Var, q6Var, h8Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final int a(Object obj) {
        int iHashCode = ((e7) obj).zzc.hashCode();
        return this.f109198c ? (iHashCode * 53) + ((b7) obj).zzb.f109364a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void b(Object obj) {
        this.f109197b.a(obj);
        this.f109199d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final int c(Object obj) {
        int iB = ((e7) obj).zzc.b();
        if (this.f109198c) {
            iB += ((b7) obj).zzb.c();
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final boolean d(Object obj) {
        return ((b7) obj).zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void e(Object obj, s9 s9Var) throws IOException {
        Iterator itE = ((b7) obj).zzb.e();
        while (itE.hasNext()) {
            Map.Entry entry = (Map.Entry) itE.next();
            u6 u6Var = (u6) entry.getKey();
            if (u6Var.h() != r9.MESSAGE || u6Var.j() || u6Var.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof n7) {
                s9Var.w(u6Var.a(), ((n7) entry).a().b());
            } else {
                s9Var.w(u6Var.a(), entry.getValue());
            }
        }
        ((e7) obj).zzc.k(s9Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void f(Object obj, Object obj2) {
        u8.u(this.f109197b, obj, obj2);
        if (this.f109198c) {
            u8.t(this.f109199d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final boolean g(Object obj, Object obj2) {
        if (!((e7) obj).zzc.equals(((e7) obj2).zzc)) {
            return false;
        }
        if (this.f109198c) {
            return ((b7) obj).zzb.equals(((b7) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final void h(Object obj, byte[] bArr, int i10, int i11, r5 r5Var) throws IOException {
        e7 e7Var = (e7) obj;
        if (e7Var.zzc == g9.c()) {
            e7Var.zzc = g9.f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.s8
    public final Object j() {
        h8 h8Var = this.f109196a;
        return h8Var instanceof e7 ? ((e7) h8Var).r() : h8Var.e().R();
    }
}
