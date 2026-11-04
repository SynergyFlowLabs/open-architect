package com.google.firebase.analytics;

import androidx.annotation.p0;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
final class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f120732a;

    f(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f120732a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @p0
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f120732a.k().g();
    }
}
