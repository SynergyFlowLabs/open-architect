package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
public class d implements org.slf4j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, org.slf4j.h> f339627a = new ConcurrentHashMap();

    @Override // org.slf4j.b
    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        return this.f339627a.containsKey(str);
    }

    @Override // org.slf4j.b
    public org.slf4j.h b(String str) {
        org.slf4j.h hVarPutIfAbsent;
        if (str == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        org.slf4j.h cVar = this.f339627a.get(str);
        return (cVar != null || (hVarPutIfAbsent = this.f339627a.putIfAbsent(str, (cVar = new c(str)))) == null) ? cVar : hVarPutIfAbsent;
    }

    @Override // org.slf4j.b
    public boolean c(String str) {
        return (str == null || this.f339627a.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.b
    public org.slf4j.h d(String str) {
        return new c(str);
    }
}
