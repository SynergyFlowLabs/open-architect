package com.google.android.datatransport.runtime;

import androidx.annotation.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f103584a = "ForcedSender";

    private m() {
    }

    @e.a({"DiscouragedApi"})
    @m1
    public static void a(com.google.android.datatransport.l<?> lVar, com.google.android.datatransport.h hVar) {
        if (!(lVar instanceof u)) {
            z5.a.i(f103584a, "Expected instance of `TransportImpl`, got `%s`.", lVar);
        } else {
            w.c().e().l(((u) lVar).d().f(hVar), 1);
        }
    }
}
