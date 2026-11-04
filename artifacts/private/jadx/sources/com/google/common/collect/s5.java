package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class s5<E> extends o5<E> implements SortedSet<E> {
    protected s5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.v4
    protected boolean S0(@fj.a Object object) {
        try {
            if (q5.i1(comparator(), tailSet(object).first(), object) == 0) {
                return true;
            }
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.v4
    protected boolean X0(@fj.a Object object) {
        try {
            Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (q5.i1(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    @fj.a
    public Comparator<? super E> comparator() {
        return L0().comparator();
    }

    @Override // java.util.SortedSet
    @b9
    public E first() {
        return L0().first();
    }

    public SortedSet<E> headSet(@b9 E toElement) {
        return L0().headSet(toElement);
    }

    @Override // java.util.SortedSet
    @b9
    public E last() {
        return L0().last();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.o5
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedSet<E> i1();

    protected SortedSet<E> q1(@b9 E fromElement, @b9 E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }

    public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
        return L0().subSet(fromElement, toElement);
    }

    public SortedSet<E> tailSet(@b9 E fromElement) {
        return L0().tailSet(fromElement);
    }
}
