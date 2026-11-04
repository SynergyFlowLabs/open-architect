package io.customer.messaginginapp.ui.bridge;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface ModalInAppMessageViewCallback extends InAppMessageViewCallback {

    public static final class DefaultImpls {
        public static void onViewSizeChanged(@NotNull ModalInAppMessageViewCallback modalInAppMessageViewCallback, int i10, int i11) {
            InAppMessageViewCallback.DefaultImpls.onViewSizeChanged(modalInAppMessageViewCallback, i10, i11);
        }
    }
}
