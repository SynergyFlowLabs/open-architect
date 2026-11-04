package com.planner5d.library.activity.helper.ui;

import androidx.lifecycle.c0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull o0 provider) {
        super(provider);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.c0
    @NotNull
    public c0.b d() {
        return super.d();
    }

    @Override // androidx.lifecycle.q0
    public void o(@NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (d() != c0.b.DESTROYED) {
            super.o(event);
        }
    }

    @Override // androidx.lifecycle.q0
    public void v(@NotNull c0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (d() != c0.b.DESTROYED) {
            super.v(state);
        }
    }
}
