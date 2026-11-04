package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f49427a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static l f49428b = null;

    static {
        int i10 = 5 & 0;
    }

    private m() {
    }

    @p0
    public static <T extends e0> T a(@NonNull View view) {
        return (T) b(view, f49428b);
    }

    @p0
    public static <T extends e0> T b(@NonNull View view, l lVar) {
        T t10 = (T) h(view);
        if (t10 != null) {
            return t10;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int iE = f49427a.e((String) tag);
        if (iE != 0) {
            return (T) f49427a.c(lVar, view, iE);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    static <T extends e0> T c(l lVar, View view, int i10) {
        return (T) f49427a.c(lVar, view, i10);
    }

    static <T extends e0> T d(l lVar, View[] viewArr, int i10) {
        return (T) f49427a.d(lVar, viewArr, i10);
    }

    private static <T extends e0> T e(l lVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return (T) c(lVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) d(lVar, viewArr, i11);
    }

    @p0
    public static String f(int i10) {
        return f49427a.b(i10);
    }

    @p0
    public static <T extends e0> T g(@NonNull View view) {
        while (view != null) {
            T t10 = (T) e0.w(view);
            if (t10 != null) {
                return t10;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @p0
    public static <T extends e0> T h(@NonNull View view) {
        return (T) e0.w(view);
    }

    @p0
    public static l i() {
        return f49428b;
    }

    public static <T extends e0> T j(@NonNull LayoutInflater layoutInflater, int i10, @p0 ViewGroup viewGroup, boolean z10) {
        return (T) k(layoutInflater, i10, viewGroup, z10, f49428b);
    }

    public static <T extends e0> T k(@NonNull LayoutInflater layoutInflater, int i10, @p0 ViewGroup viewGroup, boolean z10, @p0 l lVar) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) e(lVar, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : (T) c(lVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static <T extends e0> T l(@NonNull Activity activity, int i10) {
        return (T) m(activity, i10, f49428b);
    }

    public static <T extends e0> T m(@NonNull Activity activity, int i10, @p0 l lVar) {
        activity.setContentView(i10);
        return (T) e(lVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i10);
    }

    public static void n(@p0 l lVar) {
        f49428b = lVar;
    }
}
