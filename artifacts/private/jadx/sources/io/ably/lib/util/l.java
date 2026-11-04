package io.ably.lib.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f288247a = new ArrayList();

    public l(T... tArr) {
        for (T t10 : tArr) {
            this.f288247a.add(t10);
        }
    }

    public synchronized void g(T t10) {
        this.f288247a.add(t10);
    }

    public synchronized void h() {
        this.f288247a.clear();
    }

    protected synchronized List<T> i() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new ArrayList(this.f288247a);
    }

    public synchronized boolean j() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f288247a.isEmpty();
    }

    public synchronized void k(T t10) {
        this.f288247a.remove(t10);
    }

    public synchronized int l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f288247a.size();
    }
}
