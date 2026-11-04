package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.s5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class ComposeView extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40271c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Function2<androidx.compose.runtime.c0, Integer, Unit>> f40272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40273b;

    static final class a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f40275b = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            ComposeView.this.Content(c0Var, androidx.compose.runtime.t4.a(this.f40275b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @oj.j
    public ComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(420213850);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> value = this.f40272a.getValue();
            if (value == null) {
                c0VarR.E(-1238798753);
            } else {
                c0VarR.E(98586082);
                value.invoke(c0VarR, 0);
            }
            c0VarR.A();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f40273b;
    }

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public final void setContent(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f40273b = true;
        this.f40272a.setValue(function2);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    @oj.j
    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @oj.j
    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40272a = d7.g(null, null, 2, null);
    }
}
