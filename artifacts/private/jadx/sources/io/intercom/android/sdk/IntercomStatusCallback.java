package io.intercom.android.sdk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface IntercomStatusCallback {
    void onFailure(@NotNull IntercomError intercomError);

    void onSuccess();
}
