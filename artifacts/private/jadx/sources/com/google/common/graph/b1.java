package com.google.common.graph;

import com.google.common.collect.o5;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class b1<E> extends o5<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.s0<Boolean> f118587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<E> f118588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.base.s0<String> f118589c;

    private b1(Set<E> delegate, com.google.common.base.s0<Boolean> validator, com.google.common.base.s0<String> errorMessage) {
        this.f118588b = delegate;
        this.f118587a = validator;
        this.f118589c = errorMessage;
    }

    public static final <E> b1<E> n1(Set<E> delegate, com.google.common.base.s0<Boolean> validator, com.google.common.base.s0<String> errorMessage) {
        return new b1<>((Set) com.google.common.base.j0.E(delegate), (com.google.common.base.s0) com.google.common.base.j0.E(validator), (com.google.common.base.s0) com.google.common.base.j0.E(errorMessage));
    }

    private void q1() {
        if (!this.f118587a.get().booleanValue()) {
            throw new IllegalStateException(this.f118589c.get());
        }
    }

    @Override // com.google.common.collect.o5, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f118588b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.o5, com.google.common.collect.v4
    public Set<E> i1() {
        q1();
        return this.f118588b;
    }
}
