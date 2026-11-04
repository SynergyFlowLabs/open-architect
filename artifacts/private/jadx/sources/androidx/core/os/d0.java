package androidx.core.os;

import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f48034a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f48035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static boolean f48036c;

        private a() {
        }

        @e.a({"DiscouragedPrivateApi"})
        static boolean a(int i10) {
            try {
                synchronized (f48034a) {
                    try {
                        if (!f48036c) {
                            f48036c = true;
                            f48035b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Method method = f48035b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i10));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static boolean a(int i10) {
            return Process.isApplicationUid(i10);
        }
    }

    private d0() {
    }

    public static boolean a(int i10) {
        return b.a(i10);
    }
}
