package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes14.dex */
public class s implements org.slf4j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile boolean f339674a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, r> f339675b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue<org.slf4j.event.g> f339676c = new LinkedBlockingQueue<>();

    @Override // org.slf4j.a
    public synchronized org.slf4j.c a(String str) {
        r rVar;
        try {
            rVar = this.f339675b.get(str);
            if (rVar == null) {
                rVar = new r(str, this.f339676c, this.f339674a);
                this.f339675b.put(str, rVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return rVar;
    }

    public void b() {
        this.f339675b.clear();
        this.f339676c.clear();
    }

    public LinkedBlockingQueue<org.slf4j.event.g> c() {
        return this.f339676c;
    }

    public List<String> d() {
        return new ArrayList(this.f339675b.keySet());
    }

    public List<r> e() {
        return new ArrayList(this.f339675b.values());
    }

    public void f() {
        this.f339674a = true;
    }
}
