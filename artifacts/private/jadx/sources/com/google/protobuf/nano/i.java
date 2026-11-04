package com.google.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f126208a = new b();

    private static class b implements c {
        private b() {
        }

        @Override // com.google.protobuf.nano.i.c
        public <K, V> Map<K, V> a(Map<K, V> map) {
            return map == null ? new HashMap() : map;
        }
    }

    public interface c {
        <K, V> Map<K, V> a(Map<K, V> map);
    }

    private i() {
    }

    public static c a() {
        return f126208a;
    }

    static void b(c cVar) {
        f126208a = cVar;
    }
}
