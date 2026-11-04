package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f116042a = com.google.api.client.util.a.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Field, a> f116043b = com.google.api.client.util.a.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f116044c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<?> f116045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<Object> f116046b = new ArrayList<>();

        a(Class<?> cls) {
            this.f116045a = cls;
        }

        void a(Class<?> cls, Object obj) {
            h0.a(cls == this.f116045a);
            this.f116046b.add(obj);
        }

        Object b() {
            return q0.o(this.f116046b, this.f116045a);
        }
    }

    public b(Object obj) {
        this.f116044c = obj;
    }

    public void a(String str, Class<?> cls, Object obj) {
        a aVar = this.f116042a.get(str);
        if (aVar == null) {
            aVar = new a(cls);
            this.f116042a.put(str, aVar);
        }
        aVar.a(cls, obj);
    }

    public void b(Field field, Class<?> cls, Object obj) {
        a aVar = this.f116043b.get(field);
        if (aVar == null) {
            aVar = new a(cls);
            this.f116043b.put(field, aVar);
        }
        aVar.a(cls, obj);
    }

    public void c() {
        for (Map.Entry<String, a> entry : this.f116042a.entrySet()) {
            ((Map) this.f116044c).put(entry.getKey(), entry.getValue().b());
        }
        for (Map.Entry<Field, a> entry2 : this.f116043b.entrySet()) {
            r.m(entry2.getKey(), this.f116044c, entry2.getValue().b());
        }
    }
}
