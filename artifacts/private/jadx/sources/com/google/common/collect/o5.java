package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public abstract class o5<E> extends v4<E> implements Set<E> {
    protected o5() {
    }

    @Override // com.google.common.collect.v4
    protected boolean Y0(Collection<?> collection) {
        return z9.I(this, (Collection) com.google.common.base.j0.E(collection));
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@fj.a Object object) {
        return object == this || L0().equals(object);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return L0().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v4
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Set<E> i1();

    protected boolean k1(@fj.a Object object) {
        return z9.g(this, object);
    }

    protected int m1() {
        return z9.k(this);
    }
}
