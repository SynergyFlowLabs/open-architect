package com.planner5d.library.activity.fragment.dialog.purchase;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.f1;
import androidx.annotation.p0;
import com.planner5d.library.services.exceptions.ErrorMessageException;

/* JADX INFO: loaded from: classes6.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f132582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.k f132583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.f f132585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Throwable f132586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f132587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f132588g;

    public e0(Long l10, fd.k kVar, @f1 int i10, fd.f fVar, boolean z10) {
        this.f132582a = l10;
        this.f132584c = z10;
        this.f132583b = kVar;
        this.f132587f = i10;
        this.f132585d = fVar;
        this.f132588g = false;
        this.f132586e = null;
    }

    public String a(Context context) {
        String strA = this.f132585d.a();
        return strA != null ? context.getString(com.planner5d.library.f.s.D2, strA) : context.getString(com.planner5d.library.f.s.vw);
    }

    public Throwable b() {
        return this.f132586e;
    }

    @p0
    public Long c() {
        return this.f132582a;
    }

    public fd.f d() {
        return this.f132585d;
    }

    public String e(Context context) {
        return context.getString(this.f132587f);
    }

    public fd.k f() {
        return this.f132583b;
    }

    public boolean g() {
        return this.f132584c;
    }

    public boolean h() {
        return this.f132586e != null;
    }

    public boolean i() {
        return this.f132588g;
    }

    public Bundle j(Context context) {
        com.planner5d.library.services.utility.i iVarM = new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.canCloseDialog, this.f132584c).j(com.planner5d.library.services.r.type, this.f132583b.q()).f(com.planner5d.library.services.r.message, this.f132587f).m(com.planner5d.library.services.r.finished, this.f132588g);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.product;
        fd.f fVar = this.f132585d;
        com.planner5d.library.services.utility.i iVarH = iVarM.h(rVar, fVar == null ? null : fVar.s());
        Long l10 = this.f132582a;
        if (l10 != null) {
            iVarH.g(com.planner5d.library.services.r.paymentId, l10.longValue());
        }
        Throwable th2 = this.f132586e;
        if (th2 != null) {
            String error = ErrorMessageException.getError(context, th2);
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.error;
            if (error == null) {
                error = this.f132586e.getMessage();
            }
            iVarH.j(rVar2, error);
        }
        return iVarH.a();
    }

    public e0(Long l10, fd.k kVar, fd.f fVar) {
        this.f132582a = l10;
        this.f132583b = kVar;
        this.f132586e = null;
        this.f132587f = 0;
        this.f132588g = true;
        this.f132584c = true;
        this.f132585d = fVar;
    }

    public e0(Long l10, fd.k kVar, fd.f fVar, Throwable th2) {
        this.f132582a = l10;
        this.f132583b = kVar;
        this.f132586e = th2;
        this.f132587f = 0;
        this.f132588g = true;
        this.f132584c = true;
        this.f132585d = fVar;
    }

    public e0(Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        long jD = jVar.d(com.planner5d.library.services.r.paymentId, 0L);
        this.f132582a = jD == 0 ? null : Long.valueOf(jD);
        Bundle bundleH = jVar.h(com.planner5d.library.services.r.product, null);
        this.f132583b = fd.k.l(jVar.t(com.planner5d.library.services.r.type, null));
        String strT = jVar.t(com.planner5d.library.services.r.error, null);
        this.f132586e = strT == null ? null : new Exception(strT);
        this.f132587f = jVar.c(com.planner5d.library.services.r.message, 0);
        this.f132588g = jVar.f(com.planner5d.library.services.r.finished, false);
        this.f132584c = jVar.f(com.planner5d.library.services.r.canCloseDialog, false);
        this.f132585d = bundleH != null ? new fd.f(bundleH) : null;
    }
}
