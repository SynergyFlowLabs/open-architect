package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f49137a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f49138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f49139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f49140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f49141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Field f49142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f49143g;

    @w0(23)
    static class a {
        private a() {
        }

        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    private p() {
    }

    public static boolean a(@NonNull PopupWindow popupWindow) {
        return a.a(popupWindow);
    }

    public static int b(@NonNull PopupWindow popupWindow) {
        return a.b(popupWindow);
    }

    public static void c(@NonNull PopupWindow popupWindow, boolean z10) {
        a.c(popupWindow, z10);
    }

    public static void d(@NonNull PopupWindow popupWindow, int i10) {
        a.d(popupWindow, i10);
    }

    @v0(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @Deprecated
    public static void e(@NonNull PopupWindow popupWindow, @NonNull View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
