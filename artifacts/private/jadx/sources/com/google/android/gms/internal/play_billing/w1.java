package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends k0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w1 f109372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w1 f109373c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient r1 f109374a;

    static {
        int i10 = r1.f109296c;
        f109372b = new w1(o2.f109239f);
        f109373c = new w1(r1.w(l2.a()));
    }

    w1(r1 r1Var) {
        this.f109374a = r1Var;
    }

    static w1 a() {
        return f109373c;
    }

    public static w1 b() {
        return f109372b;
    }

    @Override // com.google.android.gms.internal.play_billing.n2
    public final /* bridge */ /* synthetic */ Set h() {
        return this.f109374a.isEmpty() ? u2.f109345i : new v2(this.f109374a, k2.f109158a);
    }
}
