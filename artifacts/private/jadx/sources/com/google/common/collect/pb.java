package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
final class pb<E> extends r8.m<E> implements ga<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f117966f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient pb<E> f117967e;

    pb(ga<E> delegate) {
        super(delegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.r8.m, com.google.common.collect.j5
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public ga<E> i1() {
        return (ga) super.i1();
    }

    @Override // com.google.common.collect.ga
    public ga<E> J2() {
        pb<E> pbVar = this.f117967e;
        if (pbVar == null) {
            pbVar = new pb<>(i1().J2());
            pbVar.f117967e = this;
            this.f117967e = pbVar;
        }
        return pbVar;
    }

    @Override // com.google.common.collect.ga
    public ga<E> T2(@b9 E upperBound, x boundType) {
        return r8.C(i1().T2(upperBound, boundType));
    }

    @Override // com.google.common.collect.ga
    public ga<E> b4(@b9 E lowerBound, x boundType) {
        return r8.C(i1().b4(lowerBound, boundType));
    }

    @Override // com.google.common.collect.ga, com.google.common.collect.ca
    public Comparator<? super E> comparator() {
        return i1().comparator();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> firstEntry() {
        return i1().firstEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> lastEntry() {
        return i1().lastEntry();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ga
    @fj.a
    public q8.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ga
    public ga<E> x3(@b9 E lowerBound, x lowerBoundType, @b9 E upperBound, x upperBoundType) {
        return r8.C(i1().x3(lowerBound, lowerBoundType, upperBound, upperBoundType));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.r8.m
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> y1() {
        return z9.P(i1().o());
    }

    @Override // com.google.common.collect.r8.m, com.google.common.collect.j5, com.google.common.collect.q8
    public NavigableSet<E> o() {
        return (NavigableSet) super.o();
    }
}
