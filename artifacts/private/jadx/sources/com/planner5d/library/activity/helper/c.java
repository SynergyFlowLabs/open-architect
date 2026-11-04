package com.planner5d.library.activity.helper;

import androidx.appcompat.app.d;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
@dagger.internal.r
@dagger.internal.s
public final class c<T extends androidx.appcompat.app.d> implements dagger.internal.h<b<T>> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f136702a = new c();

        private a() {
        }
    }

    public static <T extends androidx.appcompat.app.d> c<T> a() {
        return a.f136702a;
    }

    public static <T extends androidx.appcompat.app.d> b<T> c() {
        return new b<>();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b<T> get() {
        return c();
    }
}
