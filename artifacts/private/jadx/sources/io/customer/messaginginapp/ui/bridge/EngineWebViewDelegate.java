package io.customer.messaginginapp.ui.bridge;

import android.view.View;
import io.customer.messaginginapp.gist.data.model.engine.EngineWebConfiguration;
import io.customer.messaginginapp.gist.presentation.engine.EngineWebViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface EngineWebViewDelegate {
    void bringToFront();

    @Nullable
    EngineWebViewListener getListener();

    @NotNull
    View getView();

    void releaseResources();

    void setAlpha(float f10);

    void setListener(@Nullable EngineWebViewListener engineWebViewListener);

    void setup(@NotNull EngineWebConfiguration engineWebConfiguration);

    void stopLoading();
}
