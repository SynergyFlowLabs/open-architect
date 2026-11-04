package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public interface ga<E> extends ha<E>, ca<E> {
    ga<E> J2();

    ga<E> T2(@b9 E upperBound, x boundType);

    ga<E> b4(@b9 E lowerBound, x boundType);

    @Override // com.google.common.collect.ca
    Comparator<? super E> comparator();

    @Override // com.google.common.collect.q8
    Set<q8.a<E>> entrySet();

    @fj.a
    q8.a<E> firstEntry();

    @Override // com.google.common.collect.q8, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @fj.a
    q8.a<E> lastEntry();

    @Override // com.google.common.collect.ha, com.google.common.collect.q8
    NavigableSet<E> o();

    @fj.a
    q8.a<E> pollFirstEntry();

    @fj.a
    q8.a<E> pollLastEntry();

    ga<E> x3(@b9 E lowerBound, x lowerBoundType, @b9 E upperBound, x upperBoundType);
}
