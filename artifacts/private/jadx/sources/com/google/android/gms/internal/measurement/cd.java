package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class cd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yc f108331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vd f108332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f108333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cb f108334d;

    private cd(vd vdVar, cb cbVar, yc ycVar) {
        this.f108332b = vdVar;
        this.f108333c = ycVar instanceof nb;
        this.f108334d = cbVar;
        this.f108331a = ycVar;
    }

    static cd c(vd vdVar, cb cbVar, yc ycVar) {
        return new cd(vdVar, cbVar, ycVar);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final Object a() {
        yc ycVar = this.f108331a;
        return ycVar instanceof qb ? ((qb) ycVar).m() : ycVar.b().Oc();
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final int b(Object obj) {
        int iH = ((qb) obj).zzc.h();
        return this.f108333c ? iH + ((nb) obj).zzb.g() : iH;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final boolean d(Object obj) {
        return ((nb) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final int e(Object obj) {
        int iHashCode = ((qb) obj).zzc.hashCode();
        return this.f108333c ? (iHashCode * 53) + ((nb) obj).zzb.f108447a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void f(Object obj, ie ieVar) throws IOException {
        Iterator itC = ((nb) obj).zzb.c();
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            fb fbVar = (fb) entry.getKey();
            if (fbVar.h() != he.MESSAGE || fbVar.m() || fbVar.j()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof ec) {
                ieVar.A(fbVar.a(), ((ec) entry).a().c());
            } else {
                ieVar.A(fbVar.a(), entry.getValue());
            }
        }
        ((qb) obj).zzc.f(ieVar);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void g(Object obj, Object obj2) {
        ld.d(this.f108332b, obj, obj2);
        if (this.f108333c) {
            ld.c(this.f108334d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void h(Object obj) {
        this.f108332b.b(obj);
        this.f108334d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void i(Object obj, byte[] bArr, int i10, int i11, fa faVar) throws IOException {
        qb qbVar = (qb) obj;
        if (qbVar.zzc == wd.a()) {
            qbVar.zzc = wd.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final boolean j(Object obj, Object obj2) {
        if (!((qb) obj).zzc.equals(((qb) obj2).zzc)) {
            return false;
        }
        if (this.f108333c) {
            return ((nb) obj).zzb.equals(((nb) obj2).zzb);
        }
        return true;
    }
}
