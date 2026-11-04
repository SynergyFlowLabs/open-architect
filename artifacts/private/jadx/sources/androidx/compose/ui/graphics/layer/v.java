package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f38012a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Method f38013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f38014c;

    private v() {
    }

    @e.a({"BanUncheckedReflection"})
    private final Canvas c(Surface surface) throws IllegalAccessException, InvocationTargetException {
        Method methodD = d();
        if (methodD == null) {
            return surface.lockCanvas(null);
        }
        Object objInvoke = methodD.invoke(surface, null);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) objInvoke;
    }

    @e.a({"BanUncheckedReflection"})
    private final Method d() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = f38013b;
                if (f38014c) {
                    method = method2;
                } else {
                    f38014c = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    f38013b = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                f38013b = null;
            }
        }
        return method;
    }

    public final boolean a() {
        return true;
    }

    @w0(22)
    @NotNull
    public final Canvas b(@NotNull Surface surface) {
        return w.f38016a.a(surface);
    }
}
