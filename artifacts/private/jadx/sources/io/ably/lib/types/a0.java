package io.ably.lib.types;

/* JADX INFO: loaded from: classes13.dex */
public interface a0<T> {
    boolean a();

    T[] b();

    boolean c();

    a0<T> current() throws a;

    a0<T> first() throws a;

    boolean hasNext();

    boolean isLast();

    a0<T> next() throws a;
}
