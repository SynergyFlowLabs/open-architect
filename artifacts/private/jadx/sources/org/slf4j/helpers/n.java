package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
abstract class n implements org.slf4j.c, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339644b = 7535258609338176893L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f339645a;

    n() {
    }

    @Override // org.slf4j.c
    public String getName() {
        return this.f339645a;
    }

    protected Object readResolve() throws ObjectStreamException {
        return org.slf4j.e.l(getName());
    }
}
