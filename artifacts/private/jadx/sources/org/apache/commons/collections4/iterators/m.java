package org.apache.commons.collections4.iterators;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public class m<E> extends a<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final org.apache.commons.collections4.q0 f335834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListIterator f335835b;

    static {
        m mVar = new m();
        f335834a = mVar;
        f335835b = mVar;
    }

    protected m() {
    }

    public static <E> ListIterator<E> b() {
        return f335835b;
    }

    public static <E> org.apache.commons.collections4.q0<E> c() {
        return f335834a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ void add(Object obj) {
        super.add(obj);
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ Object next() {
        return super.next();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ Object previous() {
        return super.previous();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.iterators.a
    public /* bridge */ /* synthetic */ void set(Object obj) {
        super.set(obj);
    }
}
