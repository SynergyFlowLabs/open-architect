package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class p8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p8 f109256c = new p8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f109257d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f109259b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t8 f109258a = new z7();

    private p8() {
    }

    public static p8 a() {
        return f109256c;
    }

    public final s8 b(Class cls) {
        j7.c(cls, "messageType");
        s8 s8Var = (s8) this.f109259b.get(cls);
        if (s8Var != null) {
            return s8Var;
        }
        s8 s8VarA = this.f109258a.a(cls);
        j7.c(cls, "messageType");
        s8 s8Var2 = (s8) this.f109259b.putIfAbsent(cls, s8VarA);
        return s8Var2 == null ? s8VarA : s8Var2;
    }
}
