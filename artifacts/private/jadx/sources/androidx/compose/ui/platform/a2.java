package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public class a2 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40279b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40280a;

    public a2(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        setTag(androidx.compose.ui.d0.b.J, Boolean.TRUE);
    }

    public final void a(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull View view, long j10) {
        super.drawChild(androidx.compose.ui.graphics.c.d(k0Var), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((p4) childAt).x()) {
                this.f40280a = true;
                try {
                    super.dispatchDraw(canvas);
                    this.f40280a = false;
                    return;
                } catch (Throwable th2) {
                    this.f40280a = false;
                    throw th2;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f40280a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
