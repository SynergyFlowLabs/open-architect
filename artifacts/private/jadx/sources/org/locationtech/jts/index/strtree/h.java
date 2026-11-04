package org.locationtech.jts.index.strtree;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class h implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f338458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f338459b;

    public h(Object obj, Object obj2) {
        this.f338458a = obj;
        this.f338459b = obj2;
    }

    public Object a() {
        return this.f338459b;
    }

    @Override // org.locationtech.jts.index.strtree.c
    public Object getBounds() {
        return this.f338458a;
    }
}
