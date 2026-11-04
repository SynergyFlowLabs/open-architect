package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n103#2,4:110\n103#2,4:114\n1863#3,2:118\n1863#3,2:120\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n47#1:110,4\n50#1:114,4\n60#1:118,2\n67#1:120,2\n*E\n"})
public final class t0 extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40888c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<androidx.compose.ui.viewinterop.b, androidx.compose.ui.node.l0> f40889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap<androidx.compose.ui.node.l0, androidx.compose.ui.viewinterop.b> f40890b;

    public t0(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        this.f40889a = new HashMap<>();
        this.f40890b = new HashMap<>();
    }

    public final void a(@NotNull androidx.compose.ui.viewinterop.b bVar, @NotNull Canvas canvas) {
        bVar.draw(canvas);
    }

    @Nullable
    public Void b(@Nullable int[] iArr, @Nullable Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return true;
    }

    @NotNull
    public final HashMap<androidx.compose.ui.viewinterop.b, androidx.compose.ui.node.l0> getHolderToLayoutNode() {
        return this.f40889a;
    }

    @NotNull
    public final HashMap<androidx.compose.ui.node.l0, androidx.compose.ui.viewinterop.b> getLayoutNodeToHolder() {
        return this.f40890b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @e.a({"MissingSuperCall"})
    public void onDescendantInvalidated(@NotNull View view, @NotNull View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (androidx.compose.ui.viewinterop.b bVar : this.f40889a.keySet()) {
            bVar.layout(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            s0.a.g("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            s0.a.g("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator<T> it = this.f40889a.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.b) it.next()).I();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @e.a({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            androidx.compose.ui.node.l0 l0Var = this.f40889a.get(childAt);
            if (childAt.isLayoutRequested() && l0Var != null) {
                int i11 = 7 << 0;
                androidx.compose.ui.node.l0.U1(l0Var, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
