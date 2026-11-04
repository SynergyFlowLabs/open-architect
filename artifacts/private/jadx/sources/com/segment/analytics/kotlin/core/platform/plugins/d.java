package com.segment.analytics.kotlin.core.platform.plugins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public static final void a(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull String token) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        c cVar = (c) aVar.r(j1.d(c.class));
        if (cVar != null) {
            cVar.m(token);
        } else {
            aVar.j(new c(token));
        }
    }
}
