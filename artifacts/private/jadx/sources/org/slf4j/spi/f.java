package org.slf4j.spi;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public interface f {
    void a(String str);

    @org.slf4j.helpers.e
    f c(Throwable th2);

    @org.slf4j.helpers.e
    f d(String str, Supplier<Object> supplier);

    @org.slf4j.helpers.e
    f e(Object obj);

    @org.slf4j.helpers.e
    f f(Supplier<String> supplier);

    void g(String str, Object obj);

    void h();

    void i(String str, Object obj, Object obj2);

    void j(Supplier<String> supplier);

    void k(String str, Object... objArr);

    @org.slf4j.helpers.e
    f l(Supplier<?> supplier);

    @org.slf4j.helpers.e
    f m(org.slf4j.h hVar);

    @org.slf4j.helpers.e
    f n(String str);

    @org.slf4j.helpers.e
    f o(String str, Object obj);
}
