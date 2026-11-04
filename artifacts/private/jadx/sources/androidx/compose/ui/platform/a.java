package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1#2:452\n*E\n"})
public abstract class a extends ViewGroup {
    public static final int $stable = 8;

    @Nullable
    private WeakReference<androidx.compose.runtime.p0> cachedViewTreeCompositionContext;

    @Nullable
    private androidx.compose.runtime.o0 composition;
    private boolean creatingComposition;

    @Nullable
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;

    @Nullable
    private androidx.compose.runtime.p0 parentContext;

    @Nullable
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0313a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        C0313a() {
            super(2);
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                int i11 = 7 ^ 1;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
            }
            a.this.Content(c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @oj.j
    public a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    private final androidx.compose.runtime.p0 c(androidx.compose.runtime.p0 p0Var) {
        androidx.compose.runtime.p0 p0Var2 = g(p0Var) ? p0Var : null;
        if (p0Var2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(p0Var2);
        }
        return p0Var;
    }

    private final void e() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = f5.c(this, h(), androidx.compose.runtime.internal.w.c(-656146368, true, new C0313a()));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private final boolean g(androidx.compose.runtime.p0 p0Var) {
        return !(p0Var instanceof androidx.compose.runtime.c5) || ((androidx.compose.runtime.c5) p0Var).L0().getValue().compareTo(androidx.compose.runtime.c5.e.ShuttingDown) > 0;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @androidx.compose.ui.t
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final androidx.compose.runtime.p0 h() {
        androidx.compose.runtime.p0 p0Var;
        androidx.compose.runtime.p0 p0VarC = this.parentContext;
        if (p0VarC == null) {
            androidx.compose.runtime.p0 p0VarD = c5.d(this);
            androidx.compose.runtime.p0 p0Var2 = null;
            p0VarC = p0VarD != null ? c(p0VarD) : null;
            if (p0VarC == null) {
                WeakReference<androidx.compose.runtime.p0> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (p0Var = weakReference.get()) != null && g(p0Var)) {
                    p0Var2 = p0Var;
                }
                return p0Var2 == null ? c(c5.h(this)) : p0Var2;
            }
        }
        return p0VarC;
    }

    private final void setParentContext(androidx.compose.runtime.p0 p0Var) {
        if (this.parentContext != p0Var) {
            this.parentContext = p0Var;
            boolean z10 = false;
            if (p0Var != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            androidx.compose.runtime.o0 o0Var = this.composition;
            if (o0Var != null) {
                o0Var.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public abstract void Content(@Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view) {
        e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void disposeComposition() {
        androidx.compose.runtime.o0 o0Var = this.composition;
        if (o0Var != null) {
            o0Var.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        f();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(@Nullable androidx.compose.runtime.p0 p0Var) {
        setParentContext(p0Var);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.x1) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(@NotNull k4 k4Var) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = k4Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @oj.j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10) {
        e();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams, boolean z10) {
        e();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @oj.j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        int i11 = 7 ^ 1;
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = k4.f40600a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, int i11) {
        e();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, i10, layoutParams);
    }
}
