package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f109251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p6 f109252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p6 f109253d = new p6(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f109254e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f109255a;

    p6() {
        this.f109255a = new HashMap();
    }

    public static p6 a() {
        p6 p6Var = f109252c;
        if (p6Var != null) {
            return p6Var;
        }
        synchronized (p6.class) {
            try {
                p6 p6Var2 = f109252c;
                if (p6Var2 != null) {
                    return p6Var2;
                }
                int i10 = p8.f109257d;
                p6 p6VarB = y6.b(p6.class);
                f109252c = p6VarB;
                return p6VarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d7 b(h8 h8Var, int i10) {
        return (d7) this.f109255a.get(new o6(h8Var, i10));
    }

    p6(boolean z10) {
        this.f109255a = Collections.EMPTY_MAP;
    }
}
