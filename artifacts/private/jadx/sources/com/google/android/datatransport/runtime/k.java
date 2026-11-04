package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
@y5.e
abstract class k {
    k() {
    }

    @e.a({"ThreadPoolCreation"})
    @y5.f
    @ij.f
    static Executor a() {
        return new p(Executors.newSingleThreadExecutor());
    }
}
