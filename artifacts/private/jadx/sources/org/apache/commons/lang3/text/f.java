package org.apache.commons.lang3.text;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class f<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f<String> f337299a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f<String> f337300b = new c();

    static class b<V> extends f<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, V> f337301c;

        b(Map<String, V> map) {
            this.f337301c = map;
        }

        @Override // org.apache.commons.lang3.text.f
        public String a(String str) {
            V v10;
            Map<String, V> map = this.f337301c;
            if (map != null && (v10 = map.get(str)) != null) {
                return v10.toString();
            }
            return null;
        }
    }

    private static class c extends f<String> {
        private c() {
        }

        @Override // org.apache.commons.lang3.text.f
        public String a(String str) {
            if (str.length() <= 0) {
                return null;
            }
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    protected f() {
    }

    public static <V> f<V> b(Map<String, V> map) {
        return new b(map);
    }

    public static f<?> c() {
        return f337299a;
    }

    public static f<String> d() {
        return f337300b;
    }

    public abstract String a(String str);
}
