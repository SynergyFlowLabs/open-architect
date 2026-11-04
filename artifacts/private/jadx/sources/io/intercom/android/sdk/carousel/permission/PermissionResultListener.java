package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.w0;

/* JADX INFO: loaded from: classes13.dex */
public interface PermissionResultListener {
    @w0(api = 30)
    void requestBackgroundLocationPermission();

    void showDeniedPermanently();

    void showDeniedTemporarily();

    void showGranted();
}
