package com.planner5d.library.activity.fragment.messages;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class g extends f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134493c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f134494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<b2.a> f134495b;

    @ij.a
    public g(@NotNull b2 manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f134494a = manager;
        this.f134495b = manager.q();
    }

    public final void U(@NotNull u message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f134494a.d(message);
    }

    @NotNull
    public final androidx.lifecycle.w0<b2.a> V() {
        return this.f134495b;
    }
}
