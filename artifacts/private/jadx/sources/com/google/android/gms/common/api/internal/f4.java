package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class f4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f106025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f106026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ g4 f106027c;

    f4(g4 g4Var, m mVar, String str) {
        this.f106025a = mVar;
        this.f106026b = str;
        this.f106027c = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        g4 g4Var = this.f106027c;
        if (g4Var.f106036b > 0) {
            m mVar = this.f106025a;
            if (g4Var.f106037c != null) {
                bundle = g4Var.f106037c.getBundle(this.f106026b);
            } else {
                bundle = null;
            }
            mVar.g(bundle);
        }
        if (this.f106027c.f106036b >= 2) {
            this.f106025a.k();
        }
        if (this.f106027c.f106036b >= 3) {
            this.f106025a.i();
        }
        if (this.f106027c.f106036b >= 4) {
            this.f106025a.l();
        }
        if (this.f106027c.f106036b >= 5) {
            this.f106025a.h();
        }
    }
}
