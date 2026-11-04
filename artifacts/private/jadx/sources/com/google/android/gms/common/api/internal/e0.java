package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.l1(otherwise = 2)
final class e0 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f106003b;

    private e0(n nVar) {
        super(nVar);
        this.f106003b = new ArrayList();
        this.f106121a.j("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ e0 m(Activity activity) {
        e0 e0Var;
        synchronized (activity) {
            try {
                n nVarC = m.c(activity);
                e0Var = (e0) nVarC.b("LifecycleObserverOnStop", e0.class);
                if (e0Var == null) {
                    e0Var = new e0(nVarC);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void o(Runnable runnable) {
        try {
            this.f106003b.add(runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    @androidx.annotation.l0
    public final void l() {
        List list;
        synchronized (this) {
            try {
                list = this.f106003b;
                this.f106003b = new ArrayList();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
