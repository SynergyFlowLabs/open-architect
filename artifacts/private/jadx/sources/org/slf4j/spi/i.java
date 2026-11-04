package org.slf4j.spi;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final i f339756a = new i();

    private i() {
    }

    public static f b() {
        return f339756a;
    }

    @Override // org.slf4j.spi.f
    public void a(String str) {
    }

    @Override // org.slf4j.spi.f
    public f c(Throwable th2) {
        return b();
    }

    @Override // org.slf4j.spi.f
    public f d(String str, Supplier<Object> supplier) {
        return b();
    }

    @Override // org.slf4j.spi.f
    public f e(Object obj) {
        return b();
    }

    @Override // org.slf4j.spi.f
    public f f(Supplier<String> supplier) {
        return this;
    }

    @Override // org.slf4j.spi.f
    public void g(String str, Object obj) {
    }

    @Override // org.slf4j.spi.f
    public void h() {
    }

    @Override // org.slf4j.spi.f
    public void i(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.spi.f
    public void j(Supplier<String> supplier) {
    }

    @Override // org.slf4j.spi.f
    public void k(String str, Object... objArr) {
    }

    @Override // org.slf4j.spi.f
    public f l(Supplier<?> supplier) {
        return b();
    }

    @Override // org.slf4j.spi.f
    public f m(org.slf4j.h hVar) {
        return b();
    }

    @Override // org.slf4j.spi.f
    public f n(String str) {
        return this;
    }

    @Override // org.slf4j.spi.f
    public f o(String str, Object obj) {
        return b();
    }
}
