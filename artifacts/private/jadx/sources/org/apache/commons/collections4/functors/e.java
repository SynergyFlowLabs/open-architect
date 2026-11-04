package org.apache.commons.collections4.functors;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e<E> implements org.apache.commons.collections4.h<E> {
    @Override // org.apache.commons.collections4.h
    public void a(E e10) {
        try {
            b(e10);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Throwable th2) {
            throw new org.apache.commons.collections4.q(th2);
        }
    }

    protected abstract void b(E e10) throws Throwable;
}
