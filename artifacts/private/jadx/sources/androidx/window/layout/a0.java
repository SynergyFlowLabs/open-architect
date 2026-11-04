package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a0 f76376b = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f76377c;

    static {
        String simpleName = a0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f76377c = simpleName;
    }

    private a0() {
    }

    @e.a({"BanUncheckedReflection"})
    @w0(28)
    private final DisplayCutout i(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    private final int j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void l(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.z
    @NotNull
    public y c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new y(Build.VERSION.SDK_INT >= 30 ? e.f76378a.a(activity) : h(activity));
    }

    @Override // androidx.window.layout.z
    @NotNull
    public y d(@NotNull Activity activity) {
        Rect rect;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = e.f76378a.b(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "display");
            Point pointK = k(display);
            rect = new Rect(0, 0, pointK.x, pointK.y);
        }
        return new y(rect);
    }

    @w0(14)
    @NotNull
    public final Rect e(@NotNull Activity activity) {
        int i10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        Point pointK = k(defaultDisplay);
        Rect rect = new Rect();
        int i11 = pointK.x;
        if (i11 == 0 || (i10 = pointK.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i11;
        rect.bottom = i10;
        return rect;
    }

    @w0(24)
    @NotNull
    public final Rect f(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f76375a.a(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point pointK = k(defaultDisplay);
            int iJ = j(activity);
            int i10 = rect.bottom;
            if (i10 + iJ == pointK.y) {
                rect.bottom = i10 + iJ;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iJ == pointK.x) {
                rect.right = i11 + iJ;
            }
        }
        return rect;
    }

    @e.a({"BanUncheckedReflection", "BlockedPrivateApi"})
    @w0(28)
    @NotNull
    public final Rect g(@NotNull Activity activity) {
        DisplayCutout displayCutoutI;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f76375a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException unused) {
            l(activity, rect);
        } catch (NoSuchFieldException unused2) {
            l(activity, rect);
        } catch (NoSuchMethodException unused3) {
            l(activity, rect);
        } catch (InvocationTargetException unused4) {
            l(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        f fVar = f.f76379a;
        Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
        fVar.a(currentDisplay, point);
        a aVar = a.f76375a;
        if (!aVar.a(activity)) {
            int iJ = j(activity);
            int i10 = rect.bottom;
            if (i10 + iJ == point.y) {
                rect.bottom = i10 + iJ;
            } else {
                int i11 = rect.right;
                if (i11 + iJ == point.x) {
                    rect.right = i11 + iJ;
                } else if (rect.left == iJ) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (displayCutoutI = i(currentDisplay)) != null) {
            int i12 = rect.left;
            g gVar = g.f76380a;
            if (i12 == gVar.b(displayCutoutI)) {
                rect.left = 0;
            }
            if (point.x - rect.right == gVar.c(displayCutoutI)) {
                rect.right += gVar.c(displayCutoutI);
            }
            if (rect.top == gVar.d(displayCutoutI)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == gVar.a(displayCutoutI)) {
                rect.bottom += gVar.a(displayCutoutI);
            }
        }
        return rect;
    }

    @e.a({"BanUncheckedReflection", "BlockedPrivateApi"})
    @w0(29)
    @NotNull
    public final Rect h(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException unused) {
            return g(activity);
        } catch (NoSuchFieldException unused2) {
            return g(activity);
        } catch (NoSuchMethodException unused3) {
            return g(activity);
        } catch (InvocationTargetException unused4) {
            return g(activity);
        }
    }

    @l1
    @w0(14)
    @NotNull
    public final Point k(@NotNull Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        f.f76379a.a(display, point);
        return point;
    }
}
