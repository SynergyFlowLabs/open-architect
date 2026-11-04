package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class gd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final gd f108450c = new gd();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f108451d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f108453b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kd f108452a = new pc();

    private gd() {
    }

    public static gd a() {
        return f108450c;
    }

    public final jd b(Class cls) {
        ac.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f108453b;
        jd jdVar = (jd) concurrentMap.get(cls);
        if (jdVar != null) {
            return jdVar;
        }
        jd jdVarA = this.f108452a.a(cls);
        ac.a(cls, "messageType");
        jd jdVar2 = (jd) concurrentMap.putIfAbsent(cls, jdVarA);
        return jdVar2 != null ? jdVar2 : jdVarA;
    }
}
