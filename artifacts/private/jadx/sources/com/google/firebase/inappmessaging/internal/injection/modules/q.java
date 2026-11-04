package com.google.firebase.inappmessaging.internal.injection.modules;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f122791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f122792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f122793c;

    public q(@NonNull @d8.c Executor executor, @NonNull @d8.a Executor executor2, @NonNull @d8.b Executor executor3) {
        this.f122793c = executor;
        this.f122791a = executor2;
        this.f122792b = executor3;
    }

    @NonNull
    @q8.e
    @d8.a
    @ij.f
    public Executor a() {
        return this.f122791a;
    }

    @NonNull
    @q8.e
    @d8.b
    @ij.f
    public Executor b() {
        return this.f122792b;
    }

    @NonNull
    @q8.e
    @d8.c
    @ij.f
    public Executor c() {
        return this.f122793c;
    }
}
