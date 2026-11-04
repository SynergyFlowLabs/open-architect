package org.locationtech.jts.noding;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected t f338566a;

    public d0() {
    }

    @Override // org.locationtech.jts.noding.n
    public abstract void a(Collection collection);

    @Override // org.locationtech.jts.noding.n
    public abstract Collection b();

    public void c(t tVar) {
        this.f338566a = tVar;
    }

    public d0(t tVar) {
        c(tVar);
    }
}
