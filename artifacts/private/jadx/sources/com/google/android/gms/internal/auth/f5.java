package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class f5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f5 f107634c = new f5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f107636b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j5 f107635a = new o4();

    private f5() {
    }

    public static f5 a() {
        return f107634c;
    }

    public final i5 b(Class cls) {
        z3.c(cls, "messageType");
        i5 i5Var = (i5) this.f107636b.get(cls);
        if (i5Var != null) {
            return i5Var;
        }
        i5 i5VarA = this.f107635a.a(cls);
        z3.c(cls, "messageType");
        i5 i5Var2 = (i5) this.f107636b.putIfAbsent(cls, i5VarA);
        return i5Var2 == null ? i5VarA : i5Var2;
    }
}
