package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes14.dex */
public class n implements a<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f336989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f336990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f336991c;

    public <T> n(T t10, T t11, s sVar) {
        this.f336989a = t10;
        this.f336990b = t11;
        this.f336991c = new d(t10, t11, sVar);
    }

    private boolean a(Field field) {
        if (field.getName().indexOf(36) == -1 && !Modifier.isTransient(field.getModifiers())) {
            return !Modifier.isStatic(field.getModifiers());
        }
        return false;
    }

    private void b(Class<?> cls) {
        for (Field field : org.apache.commons.lang3.reflect.b.a(cls)) {
            if (a(field)) {
                try {
                    this.f336991c.g(field.getName(), org.apache.commons.lang3.reflect.b.p(field, this.f336989a, true), org.apache.commons.lang3.reflect.b.p(field, this.f336990b, true));
                } catch (IllegalAccessException e10) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e10.getMessage());
                }
            }
        }
    }

    @Override // org.apache.commons.lang3.builder.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e build() {
        if (this.f336989a.equals(this.f336990b)) {
            return this.f336991c.build();
        }
        b(this.f336989a.getClass());
        return this.f336991c.build();
    }
}
