package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 {
    public static g2 a(g2 g2Var) {
        if ((g2Var instanceof j2) || (g2Var instanceof h2)) {
            return g2Var;
        }
        return g2Var instanceof Serializable ? new h2(g2Var) : new j2(g2Var);
    }

    public static g2 b(Object obj) {
        return new k2(obj);
    }
}
