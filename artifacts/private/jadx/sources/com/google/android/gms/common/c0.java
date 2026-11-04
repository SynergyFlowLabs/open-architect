package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class c0 extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Callable f106353g;

    /* synthetic */ c0(Callable callable, d0 d0Var) {
        super();
        this.f106353g = callable;
    }

    @Override // com.google.android.gms.common.e0
    final String a() {
        try {
            return (String) this.f106353g.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
