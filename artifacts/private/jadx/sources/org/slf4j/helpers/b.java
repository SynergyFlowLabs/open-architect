package org.slf4j.helpers;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class b implements org.slf4j.spi.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f339618a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal<Map<String, String>> f339619b = new a();

    class a extends InheritableThreadLocal<Map<String, String>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }

    @Override // org.slf4j.spi.g
    public void a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.f339619b.get();
        if (map == null) {
            map = new HashMap<>();
            this.f339619b.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.g
    public String b(String str) {
        return this.f339618a.c(str);
    }

    @Override // org.slf4j.spi.g
    public void c(String str, String str2) {
        this.f339618a.d(str, str2);
    }

    @Override // org.slf4j.spi.g
    public void clear() {
        Map<String, String> map = this.f339619b.get();
        if (map != null) {
            map.clear();
            this.f339619b.remove();
        }
    }

    @Override // org.slf4j.spi.g
    public Map<String, String> d() {
        Map<String, String> map = this.f339619b.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // org.slf4j.spi.g
    public void e(Map<String, String> map) {
        this.f339619b.set(map != null ? new HashMap(map) : null);
    }

    @Override // org.slf4j.spi.g
    public Deque<String> f(String str) {
        return this.f339618a.b(str);
    }

    @Override // org.slf4j.spi.g
    public void g(String str) {
        this.f339618a.a(str);
    }

    @Override // org.slf4j.spi.g
    public String get(String str) {
        Map<String, String> map = this.f339619b.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public Set<String> h() {
        Map<String, String> map = this.f339619b.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // org.slf4j.spi.g
    public void remove(String str) {
        Map<String, String> map = this.f339619b.get();
        if (map != null) {
            map.remove(str);
        }
    }
}
