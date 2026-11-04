package com.airbnb.lottie.model;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.collection.d1;
import com.airbnb.lottie.k;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f88538b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1<String, k> f88539a = new d1<>(20);

    @l1
    g() {
    }

    public static g c() {
        return f88538b;
    }

    public void a() {
        this.f88539a.d();
    }

    @p0
    public k b(@p0 String str) {
        if (str == null) {
            return null;
        }
        return this.f88539a.f(str);
    }

    public void d(@p0 String str, k kVar) {
        if (str == null) {
            return;
        }
        this.f88539a.j(str, kVar);
    }

    public void e(int i10) {
        this.f88539a.m(i10);
    }
}
