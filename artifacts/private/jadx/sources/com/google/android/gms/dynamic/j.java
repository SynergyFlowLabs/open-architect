package com.google.android.gms.dynamic;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f107024a;

    j(a aVar) {
        this.f107024a = aVar;
    }

    @Override // com.google.android.gms.dynamic.g
    public final void a(e eVar) {
        this.f107024a.f107015a = eVar;
        Iterator it = this.f107024a.f107017c.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(this.f107024a.f107015a);
        }
        this.f107024a.f107017c.clear();
        boolean z10 = true & false;
        this.f107024a.f107016b = null;
    }
}
