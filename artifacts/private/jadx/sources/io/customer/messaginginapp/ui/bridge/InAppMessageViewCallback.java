package io.customer.messaginginapp.ui.bridge;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface InAppMessageViewCallback {

    public static final class DefaultImpls {
        public static void onViewSizeChanged(@NotNull InAppMessageViewCallback inAppMessageViewCallback, int i10, int i11) {
        }
    }

    void onViewSizeChanged(int i10, int i11);
}
