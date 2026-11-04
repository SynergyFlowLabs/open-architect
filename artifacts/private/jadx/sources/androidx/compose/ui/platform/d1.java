package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(29)
final class d1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d1 f40391b = new d1();

    private d1() {
    }

    @Override // androidx.compose.ui.platform.z0
    @e.a({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public Rect a(@NotNull Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if ((e10 instanceof NoSuchFieldException) || (e10 instanceof NoSuchMethodException) || (e10 instanceof IllegalAccessException) || (e10 instanceof InvocationTargetException)) {
                return c1.f40327b.a(activity);
            }
            throw e10;
        }
    }
}
