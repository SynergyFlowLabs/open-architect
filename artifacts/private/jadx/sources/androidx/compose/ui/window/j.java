package androidx.compose.ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.l2;
import androidx.core.view.u1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,705:1\n407#1,12:711\n85#2:706\n117#2,2:707\n105#3:709\n105#3:710\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n401#1:711,12\n248#1:706\n248#1:707,2\n324#1:709\n325#1:710\n*E\n"})
final class j extends androidx.compose.ui.platform.a implements l, b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f42934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f42935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42939f;

    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n1#1,705:1\n407#2,12:706\n407#2,12:718\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout$1\n*L\n266#1:706,12\n272#1:718,12\n*E\n"})
    public static final class a extends l2.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.l2.b
        public g3 e(g3 g3Var, List<l2> list) {
            j jVar = j.this;
            if (!jVar.f42937d) {
                View childAt = jVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, jVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, jVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return g3Var.x(iMax, iMax2, iMax3, iMax4);
                }
            }
            return g3Var;
        }

        @Override // androidx.core.view.l2.b
        public l2.a f(l2 l2Var, l2.a aVar) {
            j jVar = j.this;
            if (!jVar.f42937d) {
                View childAt = jVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, jVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, jVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return aVar.c(androidx.core.graphics.j.d(iMax, iMax2, iMax3, iMax4));
                }
            }
            return aVar;
        }
    }

    static final class b extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(2);
            this.f42942b = i10;
        }

        public final void c(c0 c0Var, int i10) {
            j.this.Content(c0Var, t4.a(this.f42942b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public j(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        this.f42934a = window;
        this.f42935b = d7.g(h.f42928a.a(), null, 2, null);
        u1.j2(this, this);
        u1.G2(this, new a());
    }

    private final Function2<c0, Integer, Unit> getContent() {
        return (Function2) this.f42935b.getValue();
    }

    private final <T> T j(T t10, pj.o<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> oVar) {
        if (!this.f42937d) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return oVar.invoke(Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(iMax3), Integer.valueOf(iMax4));
            }
        }
        return t10;
    }

    private final void setContent(Function2<? super c0, ? super Integer, Unit> function2) {
        this.f42935b.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable c0 c0Var, int i10) {
        int i11;
        c0 c0VarR = c0Var.R(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:432)");
            }
            getContent().invoke(c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(i10));
        }
    }

    @Override // androidx.core.view.b1
    @NotNull
    public g3 b(@NotNull View view, @NotNull g3 g3Var) {
        if (!this.f42937d) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return g3Var.x(iMax, iMax2, iMax3, iMax4);
            }
        }
        return g3Var;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f42939f;
    }

    @Override // androidx.compose.ui.window.l
    @NotNull
    public Window getWindow() {
        return this.f42934a;
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i14 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i15 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnMeasure$ui_release(int i10, int i11) {
        int iMin;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int i13 = (mode != Integer.MIN_VALUE || this.f42936c || this.f42937d || getWindow().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i14 = size - paddingLeft;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = i13 - paddingTop;
        if (i15 >= 0) {
            i12 = i15;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (!this.f42937d && childAt.getMeasuredHeight() + paddingTop > size2 && getWindow().getAttributes().height == -2) {
            getWindow().addFlags(Integer.MIN_VALUE);
            if (!this.f42936c) {
                getWindow().setLayout(-1, -1);
            }
        }
    }

    public final boolean k(@NotNull MotionEvent motionEvent) {
        View childAt;
        int iL0;
        float x10 = motionEvent.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = getChildAt(0)) != null) {
                int left = getLeft() + childAt.getLeft();
                int width = childAt.getWidth() + left;
                int top = getTop() + childAt.getTop();
                int height = childAt.getHeight() + top;
                int iL1 = kotlin.math.b.L0(motionEvent.getX());
                if (left <= iL1 && iL1 <= width && top <= (iL0 = kotlin.math.b.L0(motionEvent.getY())) && iL0 <= height) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void l(@NotNull p0 p0Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f42939f = true;
        createComposition();
    }

    public final void m(boolean z10, boolean z11) {
        boolean z12 = (this.f42938e && z10 == this.f42936c && z11 == this.f42937d) ? false : true;
        this.f42936c = z10;
        this.f42937d = z11;
        if (z12) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i10 = 3 & (-2);
            int i11 = z10 ? -2 : -1;
            if (i11 == attributes.width && this.f42938e) {
                return;
            }
            getWindow().setLayout(i11, -2);
            this.f42938e = true;
        }
    }
}
