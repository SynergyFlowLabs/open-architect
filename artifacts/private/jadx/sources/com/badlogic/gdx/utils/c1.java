package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c1 f95253c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h1 f95254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f95255b;

    public static c1 a() {
        if (f95253c == null) {
            f95253c = new c1();
        }
        return f95253c;
    }

    public <T> void b(b<T> bVar) {
        if (this.f95255b == null) {
            this.f95255b = new l();
        }
        this.f95255b.c(bVar.f95173a, 0, bVar.f95174b);
    }

    public <T> void c(b<T> bVar, Comparator<? super T> comparator) {
        if (this.f95254a == null) {
            this.f95254a = new h1();
        }
        this.f95254a.c(bVar.f95173a, comparator, 0, bVar.f95174b);
    }

    public <T> void d(T[] tArr) {
        if (this.f95255b == null) {
            this.f95255b = new l();
        }
        this.f95255b.c(tArr, 0, tArr.length);
    }

    public <T> void e(T[] tArr, int i10, int i11) {
        if (this.f95255b == null) {
            this.f95255b = new l();
        }
        this.f95255b.c(tArr, i10, i11);
    }

    public <T> void f(T[] tArr, Comparator<? super T> comparator) {
        if (this.f95254a == null) {
            this.f95254a = new h1();
        }
        this.f95254a.c(tArr, comparator, 0, tArr.length);
    }

    public <T> void g(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        if (this.f95254a == null) {
            this.f95254a = new h1();
        }
        this.f95254a.c(tArr, comparator, i10, i11);
    }
}
