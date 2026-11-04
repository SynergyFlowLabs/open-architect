package org.locationtech.jts.noding;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f338556a;

    public c(Collection collection) {
        this.f338556a = new j(collection);
    }

    public x a() {
        return this.f338556a;
    }

    public boolean b(Collection collection) {
        return c(collection, new s());
    }

    public boolean c(Collection collection, s sVar) {
        this.f338556a.a(collection, sVar);
        return sVar.d();
    }
}
