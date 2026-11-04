package com.planner5d.library.widget;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.planner5d.library.model.manager.f2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Use WallSchemaViewV2. Remove this after old design editor is not needed.")
public final class a2 extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f249575c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextView[] f249576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f249577b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.WallSchemaView$setLabels$1", f = "WallSchemaView.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f249578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2 f249579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a2 f249580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f249581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f249582e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2 f2Var, a2 a2Var, double d10, double d11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f249579b = f2Var;
            this.f249580c = a2Var;
            this.f249581d = d10;
            this.f249582e = d11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f249579b, this.f249580c, this.f249581d, this.f249582e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f249578a;
            if (i10 == 0) {
                ResultKt.m(obj);
                f2 f2Var = this.f249579b;
                this.f249578a = 1;
                obj = f2Var.k(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            com.planner5d.library.model.metricunit.a aVar = (com.planner5d.library.model.metricunit.a) obj;
            a2 a2Var = this.f249580c;
            Spanned spannedD = com.planner5d.library.services.textspan.b.d(a2Var.getContext().getString(com.planner5d.library.f.s.gH, aVar.g(), this.f249579b.d(this.f249581d, aVar).toString()));
            Intrinsics.checkNotNullExpressionValue(spannedD, "fromHtml(...)");
            Spanned spannedD2 = com.planner5d.library.services.textspan.b.d(this.f249580c.getContext().getString(com.planner5d.library.f.s.dH, aVar.g(), this.f249579b.d(this.f249582e, aVar).toString()));
            Intrinsics.checkNotNullExpressionValue(spannedD2, "fromHtml(...)");
            a2Var.c(spannedD, spannedD2);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a2(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        this.f249576a[0].setText(charSequence);
        this.f249576a[1].setText(charSequence2);
    }

    public final void b(double d10, double d11, @NotNull f2 manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        kotlinx.coroutines.k.f(this.f249577b, null, null, new a(manager, this, d11, d10, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u2.t(this.f249577b.getCoroutineContext(), null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249577b = kotlinx.coroutines.t0.a(q3.c(null, 1, null).plus(com.planner5d.library.services.utility.s.f229729a.a()));
        View.inflate(context, com.planner5d.library.f.m.f168856u9, this);
        ((ImageView) findViewById(com.planner5d.library.f.j.Jd)).setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.Rb, null));
        this.f249576a = new TextView[]{findViewById(com.planner5d.library.f.j.Zf), findViewById(com.planner5d.library.f.j.Xf)};
    }
}
