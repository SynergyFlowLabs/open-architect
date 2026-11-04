package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48646a = "ViewParentCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f48647b;

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        static boolean b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private d2() {
    }

    private static int[] a() {
        int[] iArr = f48647b;
        if (iArr == null) {
            f48647b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f48647b;
    }

    @androidx.annotation.v0(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @Deprecated
    public static void b(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
    }

    public static boolean c(@NonNull ViewParent viewParent, @NonNull View view, float f10, float f11, boolean z10) {
        try {
            return a.a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean d(@NonNull ViewParent viewParent, @NonNull View view, float f10, float f11) {
        try {
            return a.b(viewParent, view, f10, f11);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void e(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        f(viewParent, view, i10, i11, iArr, 0);
    }

    public static void f(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (viewParent instanceof x0) {
            ((x0) viewParent).q(view, i10, i11, iArr, i12);
        } else if (i12 == 0) {
            try {
                a.c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void g(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13) {
        i(viewParent, view, i10, i11, i12, i13, 0, a());
    }

    public static void h(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        i(viewParent, view, i10, i11, i12, i13, i14, a());
    }

    public static void i(@NonNull ViewParent viewParent, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (viewParent instanceof y0) {
            ((y0) viewParent).s(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        boolean z10 = false | true;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof x0) {
            ((x0) viewParent).o(view, i10, i11, i12, i13, i14);
        } else if (i14 == 0) {
            try {
                a.d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void j(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        k(viewParent, view, view2, i10, 0);
    }

    public static void k(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof x0) {
            ((x0) viewParent).l(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.e(viewParent, view, view2, i10);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean l(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10) {
        return m(viewParent, view, view2, i10, 0);
    }

    public static boolean m(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i10, int i11) {
        if (viewParent instanceof x0) {
            return ((x0) viewParent).t(view, view2, i10, i11);
        }
        if (i11 == 0) {
            try {
                return a.f(viewParent, view, view2, i10);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
        return false;
    }

    public static void n(@NonNull ViewParent viewParent, @NonNull View view) {
        o(viewParent, view, 0);
    }

    public static void o(@NonNull ViewParent viewParent, @NonNull View view, int i10) {
        if (viewParent instanceof x0) {
            ((x0) viewParent).m(view, i10);
        } else if (i10 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    @androidx.annotation.v0(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
