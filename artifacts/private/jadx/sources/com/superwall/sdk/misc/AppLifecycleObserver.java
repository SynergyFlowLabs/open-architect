package com.superwall.sdk.misc;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AppLifecycleObserver implements DefaultLifecycleObserver {

    @NotNull
    private final k0<Boolean> _isInBackground;

    @NotNull
    private final z0<Boolean> isInBackground;

    public AppLifecycleObserver() {
        k0<Boolean> k0VarA = b1.a(Boolean.TRUE);
        this._isInBackground = k0VarA;
        this.isInBackground = k.n(k0VarA);
    }

    @NotNull
    public final z0<Boolean> isInBackground() {
        return this.isInBackground;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        this._isInBackground.setValue(Boolean.FALSE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this._isInBackground.setValue(Boolean.TRUE);
    }
}
