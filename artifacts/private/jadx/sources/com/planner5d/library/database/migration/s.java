package com.planner5d.library.database.migration;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b> f154082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<h> f154083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p> f154084c;

    public s(ij.c<b> migration30To31Provider, ij.c<h> migration39To40Provider, ij.c<p> migration49To50Provider) {
        this.f154082a = migration30To31Provider;
        this.f154083b = migration39To40Provider;
        this.f154084c = migration49To50Provider;
    }

    public static s a(ij.c<b> migration30To31Provider, ij.c<h> migration39To40Provider, ij.c<p> migration49To50Provider) {
        return new s(migration30To31Provider, migration39To40Provider, migration49To50Provider);
    }

    public static r c(fg.e<b> migration30To31, h migration39To40, p migration49To50) {
        return new r(migration30To31, migration39To40, migration49To50);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(dagger.internal.g.a(this.f154082a), this.f154083b.get(), this.f154084c.get());
    }
}
