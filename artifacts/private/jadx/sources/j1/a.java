package j1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f307208a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f307209b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f307210c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f307211d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f307212e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f307213f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f307214g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f307215h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f307216i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f307217j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f307218k = 32;

    private a() {
    }

    @NonNull
    public static String a(int i10) {
        if (i10 == 1) {
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
        }
        if (i10 == 2) {
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        if (i10 != 4) {
            return i10 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
    }

    @NonNull
    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        while (i10 > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i10);
            i10 &= ~iNumberOfTrailingZeros;
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sb2.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sb2.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sb2.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sb2.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sb2.append("FEEDBACK_GENERIC");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @p0
    public static String c(int i10) {
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i10 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i10 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i10 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i10 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    @v0(expression = "info.getCapabilities()")
    @Deprecated
    public static int d(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @v0(expression = "info.loadDescription(packageManager)")
    @p0
    @Deprecated
    public static String e(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
