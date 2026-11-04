package io.customer.messaginginapp.gist.presentation.engine;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface EngineWebViewListener {
    void bootstrapped();

    void error();

    void routeChanged(@NotNull String str);

    void routeError(@NotNull String str);

    void routeLoaded(@NotNull String str);

    void sizeChanged(double d10, double d11);

    void tap(@NotNull String str, @NotNull String str2, boolean z10);
}
