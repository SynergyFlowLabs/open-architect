package io.customer.messaginginapp.ui.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface InAppHostViewDelegate {
    void addView(@NotNull EngineWebViewDelegate engineWebViewDelegate);

    @NotNull
    EngineWebViewDelegate createEngineWebViewInstance();

    boolean isVisible();

    void post(@NotNull Function0<Unit> function0);

    void removeView(@NotNull EngineWebViewDelegate engineWebViewDelegate);

    void setVisible(boolean z10);
}
