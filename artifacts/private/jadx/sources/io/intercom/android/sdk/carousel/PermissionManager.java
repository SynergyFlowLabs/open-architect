package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.core.app.b;
import androidx.core.content.d;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PermissionManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final Twig twig = LumberMill.getLogger();
    private final Activity activity;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionStatus {
        public static final int DENIED_TEMPORARILY = 1;
        public static final int GRANTED = 0;
        public static final int NEVER_ASKED_OR_DENIED_PERMANENTLY = 2;
    }

    public PermissionManager(Activity activity) {
        this.activity = activity;
    }

    public boolean anyPermissionPermanentlyDeniedInResult(String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (iArr[i10] == -1 && !b.S(this.activity, strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public int getPermissionStatus(String str) {
        if (d.a(this.activity, str) == 0) {
            return 0;
        }
        return b.S(this.activity, str) ? 1 : 2;
    }

    public List<String> permissionsExistInManifest(List<String> list) {
        ArrayList arrayList = new ArrayList();
        List<String> listPermissionsInManifest = permissionsInManifest();
        for (String str : list) {
            if (listPermissionsInManifest.contains(str)) {
                BACKGROUND_LOCATION_PERMISSION.equals(str);
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public boolean permissionsGranted(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (getPermissionStatus(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @l1
    List<String> permissionsInManifest() {
        try {
            return Arrays.asList(this.activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e10) {
            twig.internal("Package name is unknown, error: " + e10.getMessage());
            return new ArrayList();
        }
    }

    public void requestPermissions(@NonNull String[] strArr, @g0(from = 0) int i10) {
        b.M(this.activity, strArr, i10);
    }
}
