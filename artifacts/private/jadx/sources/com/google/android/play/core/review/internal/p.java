package com.google.android.play.core.review.internal;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f114956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f114957c;

    p(r rVar, IBinder iBinder) {
        this.f114956b = iBinder;
        this.f114957c = rVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        this.f114957c.f114959a.f114973m = e.k(this.f114956b);
        t.q(this.f114957c.f114959a);
        this.f114957c.f114959a.f114967g = false;
        Iterator it = this.f114957c.f114959a.f114964d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f114957c.f114959a.f114964d.clear();
    }
}
