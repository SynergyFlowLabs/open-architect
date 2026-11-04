package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f125250a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f125250a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f125250a.getAnnotation(cls);
    }

    public Collection<Annotation> b() {
        return Arrays.asList(this.f125250a.getAnnotations());
    }

    public Class<?> c() {
        return this.f125250a.getType();
    }

    public Type d() {
        return this.f125250a.getGenericType();
    }

    public Class<?> e() {
        return this.f125250a.getDeclaringClass();
    }

    public String f() {
        return this.f125250a.getName();
    }

    public boolean g(int i10) {
        return (this.f125250a.getModifiers() & i10) != 0;
    }

    public String toString() {
        return this.f125250a.toString();
    }
}
