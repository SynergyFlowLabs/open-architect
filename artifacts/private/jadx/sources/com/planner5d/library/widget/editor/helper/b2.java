package com.planner5d.library.widget.editor.helper;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s("javax.inject.Singleton")
public final class b2 implements dagger.internal.h<a2> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b2 f256202a = new b2();

        private a() {
        }
    }

    public static b2 a() {
        return a.f256202a;
    }

    public static a2 c() {
        return new a2();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a2 get() {
        return c();
    }
}
