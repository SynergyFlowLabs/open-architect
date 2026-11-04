package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f76220b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f76221a;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0770a implements Comparator<int[]> {
        C0770a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f76220b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f76221a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int iV = this.f76221a.V();
        if (iV == 0) {
            return true;
        }
        boolean z10 = this.f76221a.Q2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iV, 2);
        for (int i12 = 0; i12 < iV; i12++) {
            View viewU = this.f76221a.U(i12);
            if (viewU == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewU.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f76220b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = viewU.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = viewU.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = viewU.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewU.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C0770a());
        for (int i13 = 1; i13 < iV; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[iV - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int iV = this.f76221a.V();
        for (int i10 = 0; i10 < iV; i10++) {
            if (c(this.f76221a.U(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f76221a.V() <= 1) && b();
    }
}
