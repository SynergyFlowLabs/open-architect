package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0<TResult> f99326a = new b0<>();

    @NotNull
    public final b0<TResult> a() {
        return this.f99326a;
    }

    public final void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void c(@Nullable Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void d(@Nullable TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean e() {
        return this.f99326a.h0();
    }

    public final boolean f(@Nullable Exception exc) {
        return this.f99326a.i0(exc);
    }

    public final boolean g(@Nullable TResult tresult) {
        return this.f99326a.j0(tresult);
    }
}
