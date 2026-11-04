package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1 f106110a;

    protected k1(j1 j1Var) {
        this.f106110a = j1Var;
    }

    protected abstract void a();

    public final void b(m1 m1Var) {
        m1Var.f106123a.lock();
        try {
            if (m1Var.f106133k == this.f106110a) {
                a();
            }
            Lock lock = m1Var.f106123a;
        } finally {
            m1Var.f106123a.unlock();
        }
    }
}
