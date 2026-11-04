package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes3.dex */
class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p f74530a = new q();

    q() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float fT = u1.T(childAt);
                if (fT > f10) {
                    f10 = fT;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.p
    public void a(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.p
    public void b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(p3.a.c.f340756a) == null) {
            Float fValueOf = Float.valueOf(u1.T(view));
            u1.U1(view, e(recyclerView, view) + 1.0f);
            view.setTag(p3.a.c.f340756a, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.p
    public void c(@NonNull View view) {
        Object tag = view.getTag(p3.a.c.f340756a);
        if (tag instanceof Float) {
            u1.U1(view, ((Float) tag).floatValue());
        }
        view.setTag(p3.a.c.f340756a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.p
    public void d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f10, float f11, int i10, boolean z10) {
    }
}
