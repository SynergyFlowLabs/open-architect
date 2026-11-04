package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f75682a = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75683b = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f75684c = {f75682a, f75683b};

    private static int d(@androidx.annotation.p0 u0 u0Var, int i10) {
        int[] iArr;
        if (u0Var == null || (iArr = (int[]) u0Var.f75775a.get(f75683b)) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.q0
    public void a(@NonNull u0 u0Var) {
        View view = u0Var.f75776b;
        Integer numValueOf = (Integer) u0Var.f75775a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        u0Var.f75775a.put(f75682a, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        u0Var.f75775a.put(f75683b, iArr);
    }

    @Override // androidx.transition.q0
    @androidx.annotation.p0
    public String[] b() {
        return f75684c;
    }

    public int e(@androidx.annotation.p0 u0 u0Var) {
        Integer num;
        if (u0Var == null || (num = (Integer) u0Var.f75775a.get(f75682a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(@androidx.annotation.p0 u0 u0Var) {
        return d(u0Var, 0);
    }

    public int g(@androidx.annotation.p0 u0 u0Var) {
        return d(u0Var, 1);
    }
}
