package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z1 extends y1 implements NavigableSet, y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Comparator f109455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.a
    transient z1 f109456d;

    z1(Comparator comparator) {
        this.f109455c = comparator;
    }

    static v2 F(Comparator comparator) {
        if (g2.f109126a.equals(comparator)) {
            return v2.f109361f;
        }
        int i10 = r1.f109296c;
        return new v2(o2.f109239f, comparator);
    }

    abstract z1 A(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final z1 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f109455c.compare(obj, obj2) <= 0) {
            return C(obj, z10, obj2, z11);
        }
        throw new IllegalArgumentException();
    }

    abstract z1 C(Object obj, boolean z10, Object obj2, boolean z11);

    abstract z1 D(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: G */
    public abstract a3 descendingIterator();

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @fj.a
    public Object ceiling(Object obj) {
        obj.getClass();
        return a2.a(D(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.y2
    public final Comparator comparator() {
        return this.f109455c;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        z1 z1Var = this.f109456d;
        if (z1Var != null) {
            return z1Var;
        }
        z1 z1VarW = w();
        this.f109456d = z1VarW;
        z1VarW.f109456d = this;
        return z1VarW;
    }

    public Object first() {
        return iterator().next();
    }

    @fj.a
    public Object floor(Object obj) {
        obj.getClass();
        return e2.a(A(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return A(obj, false);
    }

    @fj.a
    public Object higher(Object obj) {
        obj.getClass();
        return a2.a(D(obj, false), null);
    }

    public Object last() {
        return descendingIterator().next();
    }

    @fj.a
    public Object lower(Object obj) {
        obj.getClass();
        return e2.a(A(obj, false).descendingIterator(), null);
    }

    @Override // com.google.android.gms.internal.play_billing.y1, com.google.android.gms.internal.play_billing.m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: m */
    public abstract a3 iterator();

    @Override // java.util.NavigableSet
    @fj.a
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @fj.a
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return D(obj, true);
    }

    abstract z1 w();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return A(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return D(obj, z10);
    }
}
