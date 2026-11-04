package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private static Method f48087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static Constructor<UserHandle> f48088b;

    @w0(24)
    private static class a {
        private a() {
        }

        @NonNull
        static UserHandle a(int i10) {
            return UserHandle.getUserHandleForUid(i10);
        }
    }

    private s0() {
    }

    private static Method a() throws NoSuchMethodException {
        if (f48087a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f48087a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f48087a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f48088b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f48088b = declaredConstructor;
            int i10 = 1 << 1;
            declaredConstructor.setAccessible(true);
        }
        return f48088b;
    }

    @NonNull
    public static UserHandle c(int i10) {
        return a.a(i10);
    }
}
