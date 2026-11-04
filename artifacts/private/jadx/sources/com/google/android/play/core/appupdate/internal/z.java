package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class z extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f114861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f114862c;

    z(c0 c0Var, IBinder iBinder) {
        this.f114862c = c0Var;
        this.f114861b = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        this.f114862c.f114821a.f114835m = k.k(this.f114861b);
        d0.q(this.f114862c.f114821a);
        this.f114862c.f114821a.f114829g = false;
        Iterator it = this.f114862c.f114821a.f114826d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f114862c.f114821a.f114826d.clear();
    }
}
