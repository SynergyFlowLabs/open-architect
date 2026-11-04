package com.google.vr.sdk.base;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.cardboard.a0;
import com.google.vr.cardboard.b0;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f127588d = "HeadMountedDisplayManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f127589a = new h(c(), b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f127590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f127591c;

    public i(Context context) {
        this.f127590b = context;
        this.f127591c = b0.a(context);
    }

    private g b() {
        return new g(this.f127591c.d());
    }

    private m c() {
        Display displayD = d();
        m mVarA = m.a(displayD, this.f127591c.c());
        return mVarA != null ? mVarA : new m(displayD);
    }

    private Display d() {
        return ((WindowManager) this.f127590b.getSystemService("window")).getDefaultDisplay();
    }

    public void a() {
        this.f127591c.close();
    }

    public h e() {
        return this.f127589a;
    }

    public void f() {
    }

    public void g() {
        com.google.vr.sdk.proto.nano.a.c cVarD = this.f127591c.d();
        g gVar = cVarD != null ? new g(cVarD) : null;
        if (gVar != null && !gVar.equals(this.f127589a.a())) {
            this.f127589a.c(gVar);
        }
        com.google.vr.sdk.proto.nano.b.a aVarC = this.f127591c.c();
        m mVarA = aVarC != null ? m.a(d(), aVarC) : null;
        if (mVarA != null && !mVarA.equals(this.f127589a.b())) {
            this.f127589a.d(mVarA);
        }
    }

    public boolean h(g gVar) {
        if (gVar == null || gVar.equals(this.f127589a.a())) {
            return false;
        }
        this.f127589a.c(gVar);
        this.f127591c.g(gVar.D());
        return true;
    }

    public boolean i(m mVar) {
        if (mVar == null || mVar.equals(this.f127589a.b())) {
            return false;
        }
        this.f127589a.d(mVar);
        return true;
    }
}
