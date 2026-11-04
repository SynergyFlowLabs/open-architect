package org.slf4j.simple;

import org.slf4j.helpers.l;
import org.slf4j.spi.g;
import org.slf4j.spi.j;

/* JADX INFO: loaded from: classes14.dex */
public class f implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f339743d = "2.0.99";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.slf4j.a f339744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.slf4j.b f339745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f339746c;

    @Override // org.slf4j.spi.j
    public org.slf4j.a a() {
        return this.f339744a;
    }

    @Override // org.slf4j.spi.j
    public org.slf4j.b b() {
        return this.f339745b;
    }

    @Override // org.slf4j.spi.j
    public g c() {
        return this.f339746c;
    }

    @Override // org.slf4j.spi.j
    public String d() {
        return f339743d;
    }

    @Override // org.slf4j.spi.j
    public void initialize() {
        this.f339744a = new e();
        this.f339745b = new org.slf4j.helpers.d();
        this.f339746c = new l();
    }
}
