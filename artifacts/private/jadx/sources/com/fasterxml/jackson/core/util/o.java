package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f102852a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<SoftReference<com.fasterxml.jackson.core.util.a>, Boolean> f102853b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReferenceQueue<com.fasterxml.jackson.core.util.a> f102854c = new ReferenceQueue<>();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f102855a = new o();

        private a() {
        }
    }

    o() {
    }

    public static o a() {
        return a.f102855a;
    }

    private void c() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f102854c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f102853b.remove(softReference);
            }
        }
    }

    public int b() {
        int i10;
        synchronized (this.f102852a) {
            try {
                c();
                Iterator<SoftReference<com.fasterxml.jackson.core.util.a>> it = this.f102853b.keySet().iterator();
                i10 = 0;
                int i11 = 3 >> 0;
                while (it.hasNext()) {
                    it.next().clear();
                    i10++;
                }
                this.f102853b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public SoftReference<com.fasterxml.jackson.core.util.a> d(com.fasterxml.jackson.core.util.a aVar) {
        SoftReference<com.fasterxml.jackson.core.util.a> softReference = new SoftReference<>(aVar, this.f102854c);
        this.f102853b.put(softReference, Boolean.TRUE);
        c();
        return softReference;
    }
}
