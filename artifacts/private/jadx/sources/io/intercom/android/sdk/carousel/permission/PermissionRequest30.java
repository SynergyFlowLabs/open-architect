package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.w0;
import io.intercom.android.sdk.carousel.PermissionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@w0(api = 30)
class PermissionRequest30 extends PermissionRequestBefore30 {
    PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    private boolean askForBackgroundPermission(List<String> list) {
        return isLocationPermission(list) && isBackgroundPermissionInManifest();
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        return this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2;
    }

    private boolean isBackgroundPermissionInManifest() {
        return !this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty();
    }

    private boolean isLocationPermission(List<String> list) {
        return list.contains("android.permission.ACCESS_COARSE_LOCATION") || list.contains("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    protected void handleGranted(String[] strArr) {
        if (!askForBackgroundPermission(Arrays.asList(strArr))) {
            getListener().showGranted();
        } else if (isBackgroundPermissionDeniedPermanently()) {
            getListener().showDeniedPermanently();
        } else {
            getListener().requestBackgroundLocationPermission();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    protected void handleRequest(List<String> list, int i10) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, i10);
    }
}
