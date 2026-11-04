package org.apache.commons.lang3.builder;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<T> extends uk.e<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336886d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f336887b = (Type) org.apache.commons.lang3.s.r(org.apache.commons.lang3.reflect.g.C(getClass(), c.class).get(c.class.getTypeParameters()[0]), Object.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f336888c;

    protected c(String str) {
        this.f336888c = str;
    }

    public final String p() {
        return this.f336888c;
    }

    public final Type q() {
        return this.f336887b;
    }

    @Override // java.util.Map.Entry
    public final T setValue(T t10) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }

    @Override // uk.e
    public final String toString() {
        return String.format("[%s: %s, %s]", this.f336888c, k(), l());
    }
}
