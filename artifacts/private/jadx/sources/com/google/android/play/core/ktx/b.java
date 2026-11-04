package com.google.android.play.core.ktx;

import com.google.android.play.core.install.InstallState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
final class b implements com.google.android.play.core.install.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.google.android.play.core.install.b f114923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<b, Unit> f114924b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull com.google.android.play.core.install.b listener, @NotNull Function1<? super b, Unit> disposeAction) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(disposeAction, "disposeAction");
        this.f114923a = listener;
        this.f114924b = disposeAction;
    }

    @NotNull
    public final Function1<b, Unit> b() {
        return this.f114924b;
    }

    @NotNull
    public final com.google.android.play.core.install.b c() {
        return this.f114923a;
    }

    @Override // f7.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(@NotNull InstallState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f114923a.a(state);
        int iC = state.c();
        if (iC == 0 || iC == 11 || iC == 5 || iC == 6) {
            this.f114924b.invoke(this);
        }
    }
}
