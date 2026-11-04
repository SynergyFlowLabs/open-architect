package androidx.core.telephony;

import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f48205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f48206b;

    @w0(23)
    private static class a {
        private a() {
        }

        @a1("android.permission.READ_PHONE_STATE")
        @e.a({"MissingPermission"})
        @p0
        static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.telephony.b$b, reason: collision with other inner class name */
    @w0(26)
    private static class C0403b {
        private C0403b() {
        }

        @a1("android.permission.READ_PHONE_STATE")
        @e.a({"MissingPermission"})
        @p0
        static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @w0(30)
    private static class c {
        private c() {
        }

        static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private b() {
    }

    @a1("android.permission.READ_PHONE_STATE")
    @e.a({"MissingPermission"})
    @p0
    public static String a(@NonNull TelephonyManager telephonyManager) {
        return C0403b.a(telephonyManager);
    }

    @e.a({"SoonBlockedPrivateApi"})
    public static int b(@NonNull TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f48206b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f48206b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f48206b.invoke(telephonyManager, null);
            if (num != null && num.intValue() != -1) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return Integer.MAX_VALUE;
    }
}
