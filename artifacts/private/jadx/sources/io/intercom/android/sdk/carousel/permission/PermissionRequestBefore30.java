package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener();
    protected final PermissionManager permissionManager;

    @p0
    private PermissionResultListener permissionResultListener;

    private static final class NullPermissionResultListener implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void requestBackgroundLocationPermission() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedPermanently() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedTemporarily() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showGranted() {
        }
    }

    PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    private void handleRequestResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void attach(@p0 PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void detach() {
        this.permissionResultListener = null;
    }

    @NonNull
    PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener = this.permissionResultListener;
        return permissionResultListener == null ? this.nullListener : permissionResultListener;
    }

    protected void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    protected void handleRequest(List<String> list, int i10) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i10);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void handleResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void request(ScreenAction screenAction, int i10) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (validPermissions.isEmpty()) {
            return;
        }
        handleRequest(validPermissions, i10);
    }
}
