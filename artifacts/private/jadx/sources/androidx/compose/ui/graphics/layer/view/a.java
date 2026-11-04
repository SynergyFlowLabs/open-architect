package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.a3;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.layer.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38015a;

    public a(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(a3.a.f37524a, Boolean.TRUE);
    }

    public final void a(@NotNull k0 k0Var, @NotNull View view, long j10) {
        super.drawChild(androidx.compose.ui.graphics.c.d(k0Var), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
            if (((x) childAt).c()) {
                this.f38015a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f38015a = false;
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f38015a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] iArr, @Nullable Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    @e.a({"MissingSuperCall"})
    public void requestLayout() {
    }
}
