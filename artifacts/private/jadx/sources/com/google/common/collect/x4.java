package com.google.common.collect;

import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
public abstract class x4<E> extends n5<E> implements Deque<E> {
    protected x4() {
    }

    @Override // java.util.Deque
    public void addFirst(@b9 E e10) {
        i1().addFirst(e10);
    }

    @Override // java.util.Deque
    public void addLast(@b9 E e10) {
        i1().addLast(e10);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return i1().descendingIterator();
    }

    @Override // java.util.Deque
    @b9
    public E getFirst() {
        return i1().getFirst();
    }

    @Override // java.util.Deque
    @b9
    public E getLast() {
        return i1().getLast();
    }

    @Override // java.util.Deque
    @z7.a
    public boolean offerFirst(@b9 E e10) {
        return i1().offerFirst(e10);
    }

    @Override // java.util.Deque
    @z7.a
    public boolean offerLast(@b9 E e10) {
        return i1().offerLast(e10);
    }

    @Override // java.util.Deque
    @fj.a
    public E peekFirst() {
        return i1().peekFirst();
    }

    @Override // java.util.Deque
    @fj.a
    public E peekLast() {
        return i1().peekLast();
    }

    @Override // java.util.Deque
    @z7.a
    @fj.a
    public E pollFirst() {
        return i1().pollFirst();
    }

    @Override // java.util.Deque
    @z7.a
    @fj.a
    public E pollLast() {
        return i1().pollLast();
    }

    @Override // java.util.Deque
    @z7.a
    @b9
    public E pop() {
        return i1().pop();
    }

    @Override // java.util.Deque
    public void push(@b9 E e10) {
        i1().push(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.n5
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Deque<E> L0();

    @Override // java.util.Deque
    @z7.a
    @b9
    public E removeFirst() {
        return i1().removeFirst();
    }

    @Override // java.util.Deque
    @z7.a
    public boolean removeFirstOccurrence(@fj.a Object o10) {
        return i1().removeFirstOccurrence(o10);
    }

    @Override // java.util.Deque
    @z7.a
    @b9
    public E removeLast() {
        return i1().removeLast();
    }

    @Override // java.util.Deque
    @z7.a
    public boolean removeLastOccurrence(@fj.a Object o10) {
        return i1().removeLastOccurrence(o10);
    }
}
