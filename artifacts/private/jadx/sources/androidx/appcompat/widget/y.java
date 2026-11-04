package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class y extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f11657b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11658a;

    public y(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.S4, i10, i11);
        if (j1VarG.C(i.a.m.V4)) {
            b(j1VarG.a(i.a.m.V4, false));
        }
        setBackgroundDrawable(j1VarG.h(i.a.m.T4));
        j1VarG.I();
    }

    private void b(boolean z10) {
        if (f11657b) {
            this.f11658a = z10;
        } else {
            androidx.core.widget.p.c(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f11657b && this.f11658a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f11657b && this.f11658a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public y(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @androidx.annotation.g1 int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f11657b && this.f11658a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
