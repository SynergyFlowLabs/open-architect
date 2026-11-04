package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public interface h<T> {
    boolean a();

    T[] b();

    boolean c();

    io.ably.lib.http.f.c<h<T>> current();

    io.ably.lib.http.f.c<h<T>> first();

    boolean hasNext();

    boolean isLast();

    io.ably.lib.http.f.c<h<T>> next();
}
