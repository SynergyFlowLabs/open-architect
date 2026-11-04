package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s3 implements dagger.internal.h<hd.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q3 f148266a;

    public s3(q3 q3Var) {
        this.f148266a = q3Var;
    }

    public static s3 a(q3 q3Var) {
        return new s3(q3Var);
    }

    public static hd.b c(q3 q3Var) {
        return (hd.b) dagger.internal.p.f(q3Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public hd.b get() {
        return c(this.f148266a);
    }
}
