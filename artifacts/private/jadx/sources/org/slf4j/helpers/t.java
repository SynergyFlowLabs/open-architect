package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class t implements org.slf4j.spi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f339677a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.slf4j.b f339678b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.slf4j.spi.g f339679c = new b();

    @Override // org.slf4j.spi.j
    public org.slf4j.a a() {
        return this.f339677a;
    }

    @Override // org.slf4j.spi.j
    public org.slf4j.b b() {
        return this.f339678b;
    }

    @Override // org.slf4j.spi.j
    public org.slf4j.spi.g c() {
        return this.f339679c;
    }

    @Override // org.slf4j.spi.j
    public String d() {
        throw new UnsupportedOperationException();
    }

    public s e() {
        return this.f339677a;
    }

    @Override // org.slf4j.spi.j
    public void initialize() {
    }
}
