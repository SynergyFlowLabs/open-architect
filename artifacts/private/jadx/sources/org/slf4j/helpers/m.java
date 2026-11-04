package org.slf4j.helpers;

/* JADX INFO: loaded from: classes14.dex */
public class m implements org.slf4j.spi.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f339640d = "2.0.99";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.slf4j.a f339641a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.slf4j.b f339642b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.slf4j.spi.g f339643c = new l();

    @Override // org.slf4j.spi.j
    public org.slf4j.a a() {
        return this.f339641a;
    }

    @Override // org.slf4j.spi.j
    public org.slf4j.b b() {
        return this.f339642b;
    }

    @Override // org.slf4j.spi.j
    public org.slf4j.spi.g c() {
        return this.f339643c;
    }

    @Override // org.slf4j.spi.j
    public String d() {
        return f339640d;
    }

    @Override // org.slf4j.spi.j
    public void initialize() {
    }
}
