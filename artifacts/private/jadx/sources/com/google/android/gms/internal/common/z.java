package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f107998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f107999b;

    private z(Class cls, @androidx.annotation.p0 Object obj) {
        this.f107998a = cls;
        this.f107999b = obj;
    }

    public static z a(Class cls, @androidx.annotation.p0 Object obj) {
        return new z(cls, obj);
    }

    public final Class b() {
        return this.f107998a;
    }

    @androidx.annotation.p0
    public final Object c() {
        return this.f107999b;
    }
}
