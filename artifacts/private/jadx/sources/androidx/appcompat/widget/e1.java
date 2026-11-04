package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11258a = "ThemeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f11259b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f11260c = {-16842910};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f11261d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f11262e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f11263f = {R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f11264g = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f11265h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f11266i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[] f11267j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f11268k = new int[1];

    private e1() {
    }

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i.a.m.S0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(i.a.m.f286535g3)) {
                view.getClass().toString();
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @NonNull
    public static ColorStateList b(int i10, int i11) {
        return new ColorStateList(new int[][]{f11260c, f11267j}, new int[]{i11, i10});
    }

    public static int c(@NonNull Context context, int i10) {
        ColorStateList colorStateListF = f(context, i10);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f11260c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, i10, typedValueG.getFloat());
    }

    public static int d(@NonNull Context context, int i10) {
        int[] iArr = f11268k;
        iArr[0] = i10;
        j1 j1VarF = j1.F(context, null, iArr);
        try {
            return j1VarF.c(0, 0);
        } finally {
            j1VarF.I();
        }
    }

    static int e(@NonNull Context context, int i10, float f10) {
        int iD = d(context, i10);
        return androidx.core.graphics.h.D(iD, Math.round(Color.alpha(iD) * f10));
    }

    @androidx.annotation.p0
    public static ColorStateList f(@NonNull Context context, int i10) {
        int[] iArr = f11268k;
        iArr[0] = i10;
        j1 j1VarF = j1.F(context, null, iArr);
        try {
            ColorStateList colorStateListD = j1VarF.d(0);
            j1VarF.I();
            return colorStateListD;
        } catch (Throwable th2) {
            j1VarF.I();
            throw th2;
        }
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f11259b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
