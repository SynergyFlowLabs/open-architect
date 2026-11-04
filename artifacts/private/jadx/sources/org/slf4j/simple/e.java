package org.slf4j.simple;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
public class e implements org.slf4j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentMap<String, org.slf4j.c> f339742a = new ConcurrentHashMap();

    public e() {
        b.C0();
    }

    @Override // org.slf4j.a
    public org.slf4j.c a(String str) {
        org.slf4j.c cVar = this.f339742a.get(str);
        if (cVar != null) {
            return cVar;
        }
        b bVar = new b(str);
        org.slf4j.c cVarPutIfAbsent = this.f339742a.putIfAbsent(str, bVar);
        return cVarPutIfAbsent == null ? bVar : cVarPutIfAbsent;
    }

    void b() {
        this.f339742a.clear();
    }
}
