package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class p0 extends com.google.android.gms.common.api.internal.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f111009b;

    private p0(com.google.android.gms.common.api.internal.n nVar) {
        super(nVar);
        this.f111009b = new ArrayList();
        this.f106121a.j("TaskOnStopCallback", this);
    }

    public static p0 m(Activity activity) {
        p0 p0Var;
        com.google.android.gms.common.api.internal.n nVarC = com.google.android.gms.common.api.internal.m.c(activity);
        synchronized (nVarC) {
            try {
                p0Var = (p0) nVarC.b("TaskOnStopCallback", p0.class);
                if (p0Var == null) {
                    p0Var = new p0(nVarC);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0Var;
    }

    @Override // com.google.android.gms.common.api.internal.m
    @androidx.annotation.l0
    public final void l() {
        synchronized (this.f111009b) {
            try {
                Iterator it = this.f111009b.iterator();
                while (it.hasNext()) {
                    k0 k0Var = (k0) ((WeakReference) it.next()).get();
                    if (k0Var != null) {
                        k0Var.h();
                    }
                }
                this.f111009b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(k0 k0Var) {
        synchronized (this.f111009b) {
            try {
                this.f111009b.add(new WeakReference(k0Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
