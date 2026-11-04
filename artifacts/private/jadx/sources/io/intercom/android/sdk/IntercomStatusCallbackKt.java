package io.intercom.android.sdk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomStatusCallbackKt {

    @NotNull
    private static final IntercomStatusCallback noStatusCallback = new IntercomStatusCallback() { // from class: io.intercom.android.sdk.IntercomStatusCallbackKt$noStatusCallback$1
        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onFailure(IntercomError intercomError) {
            Intrinsics.checkNotNullParameter(intercomError, "intercomError");
        }

        @Override // io.intercom.android.sdk.IntercomStatusCallback
        public void onSuccess() {
        }
    };

    @NotNull
    public static final IntercomStatusCallback getNoStatusCallback() {
        return noStatusCallback;
    }
}
