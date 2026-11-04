package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> implements Comparable<b<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Type f102758a;

    protected b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        }
        this.f102758a = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(b<T> bVar) {
        return 0;
    }

    public Type k() {
        return this.f102758a;
    }
}
