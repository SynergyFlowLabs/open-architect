package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: loaded from: classes13.dex */
public interface PermissionRequest {
    void attach(@p0 PermissionResultListener permissionResultListener);

    void detach();

    void handleResult(@NonNull String[] strArr, @NonNull int[] iArr);

    void request(ScreenAction screenAction, int i10);
}
