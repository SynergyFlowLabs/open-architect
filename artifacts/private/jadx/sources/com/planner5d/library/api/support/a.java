package com.planner5d.library.api.support;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements w {
    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        d0 d0VarRequest = chain.request();
        d0.a aVarN = d0VarRequest.n();
        String strA = pe.f.f345646a.a(d0VarRequest.q().a0());
        if (strA != null) {
            aVarN.n("Authorization", strA);
        }
        return chain.c(aVarN.b());
    }
}
