package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class s extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f24825h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f24826i = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private b0 f24829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Boolean f24830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Long f24831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Runnable f24832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f24833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f24823f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24824g = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final int[] f24827j = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final int[] f24828k = new int[0];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(@NotNull Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        b0 b0Var = new b0(z10);
        setBackground(b0Var);
        this.f24829a = b0Var;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f24832d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f24831c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f24827j : f24828k;
            b0 b0Var = this.f24829a;
            if (b0Var != null) {
                b0Var.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.setRippleState$lambda$2(this.f24822a);
                }
            };
            this.f24832d = runnable2;
            postDelayed(runnable2, f24826i);
        }
        this.f24831c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(s sVar) {
        b0 b0Var = sVar.f24829a;
        if (b0Var != null) {
            b0Var.setState(f24828k);
        }
        sVar.f24832d = null;
    }

    public final void b(@NotNull androidx.compose.foundation.interaction.l.b bVar, boolean z10, long j10, int i10, long j11, float f10, @NotNull Function0<Unit> function0) {
        if (this.f24829a == null || !Intrinsics.areEqual(Boolean.valueOf(z10), this.f24830b)) {
            c(z10);
            this.f24830b = Boolean.valueOf(z10);
        }
        b0 b0Var = this.f24829a;
        Intrinsics.checkNotNull(b0Var);
        this.f24833e = function0;
        f(j10, i10, j11, f10);
        if (z10) {
            b0Var.setHotspot(n0.g.q(bVar.a()), n0.g.s(bVar.a()));
        } else {
            b0Var.setHotspot(b0Var.getBounds().centerX(), b0Var.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f24833e = null;
        Runnable runnable = this.f24832d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f24832d;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            b0 b0Var = this.f24829a;
            if (b0Var != null) {
                b0Var.setState(f24828k);
            }
        }
        b0 b0Var2 = this.f24829a;
        if (b0Var2 == null) {
            return;
        }
        b0Var2.setVisible(false, false);
        unscheduleDrawable(b0Var2);
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            d();
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, int i10, long j11, float f10) {
        b0 b0Var = this.f24829a;
        if (b0Var == null) {
            return;
        }
        b0Var.c(i10);
        b0Var.b(j11, f10);
        Rect rect = new Rect(0, 0, kotlin.math.b.L0(n0.n.t(j10)), kotlin.math.b.L0(n0.n.m(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        b0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        Function0<Unit> function0 = this.f24833e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
