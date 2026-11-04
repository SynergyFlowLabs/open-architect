package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class oh extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h8 f108723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108724d;

    public oh(h8 h8Var) {
        super("require");
        this.f108724d = new HashMap();
        this.f108723c = h8Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        p pVar;
        f6.a("require", 1, list);
        String strH = e5Var.a((p) list.get(0)).h();
        Map map = this.f108724d;
        if (map.containsKey(strH)) {
            return (p) map.get(strH);
        }
        Map map2 = this.f108723c.f108482a;
        if (map2.containsKey(strH)) {
            try {
                pVar = (p) ((Callable) map2.get(strH)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strH)));
            }
        } else {
            pVar = p.S1;
        }
        if (pVar instanceof j) {
            this.f108724d.put(strH, (j) pVar);
        }
        return pVar;
    }
}
