package com.google.api.client.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public final class d {
    private d() {
    }

    public static boolean a(k0 k0Var, c cVar) throws InterruptedException, IOException {
        long jA = cVar.a();
        if (jA == -1) {
            return false;
        }
        k0Var.e(jA);
        return true;
    }
}
