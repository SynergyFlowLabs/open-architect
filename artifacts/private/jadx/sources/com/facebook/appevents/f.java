package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<a, h0> f98864a = new HashMap<>();

    private final synchronized h0 e(a aVar) {
        try {
            h0 h0Var = this.f98864a.get(aVar);
            if (h0Var == null) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                Context contextN = com.facebook.g0.n();
                com.facebook.internal.c cVarF = com.facebook.internal.c.f99760f.f(contextN);
                if (cVarF != null) {
                    h0Var = new h0(cVarF, q.f99234b.f(contextN));
                }
            }
            if (h0Var == null) {
                return null;
            }
            this.f98864a.put(aVar, h0Var);
            return h0Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(@NotNull a accessTokenAppIdPair, @NotNull e appEvent) {
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            h0 h0VarE = e(accessTokenAppIdPair);
            if (h0VarE != null) {
                h0VarE.b(appEvent);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(@Nullable g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        try {
            for (Map.Entry<a, List<e>> entry : g0Var.c()) {
                h0 h0VarE = e(entry.getKey());
                if (h0VarE != null) {
                    Iterator<e> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        h0VarE.b(it.next());
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final synchronized h0 c(@NotNull a accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f98864a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int iD;
        try {
            Iterator<h0> it = this.f98864a.values().iterator();
            iD = 0;
            while (it.hasNext()) {
                iD += it.next().d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iD;
    }

    @NotNull
    public final synchronized Set<a> f() {
        Set<a> setKeySet;
        setKeySet = this.f98864a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
