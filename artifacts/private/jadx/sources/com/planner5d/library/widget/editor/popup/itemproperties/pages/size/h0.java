package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import android.content.Context;
import android.util.Range;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.databinding.d8;
import com.planner5d.library.widget.ButtonWallResizeV2;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.b2;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSizeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/SizeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,200:1\n1#2:201\n1863#3,2:202\n1863#3,2:204\n176#4,2:206\n176#4,2:208\n257#4,2:210\n257#4,2:212\n257#4,2:214\n257#4,2:216\n*S KotlinDebug\n*F\n+ 1 SizeView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/SizeView\n*L\n53#1:202,2\n69#1:204,2\n81#1:206,2\n101#1:208,2\n121#1:210,2\n132#1:212,2\n140#1:214,2\n145#1:216,2\n*E\n"})
public final class h0 extends NestedScrollView {

    @NotNull
    private static final b L3 = new b(null);
    public static final int M3 = 8;

    @Deprecated
    public static final long N3 = 1000;

    @NotNull
    private final NumberInputView A3;

    @NotNull
    private final NumberInputView B3;

    @NotNull
    private final d8 C3;

    @NotNull
    private final NumberInputView D3;

    @NotNull
    private final NumberInputView E3;

    @NotNull
    private final NumberInputView F3;

    @NotNull
    private final NumberInputView G3;

    @NotNull
    private final NumberInputView H3;

    @NotNull
    private final NumberInputView I3;

    @NotNull
    private final SliderViewV2 J3;

    @NotNull
    private final SliderViewV2 K3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NotNull
    private final k0 f257432x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private final LinearLayout f257433y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final b2 f257434z3;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<k0.c, Unit> {
        a(Object obj) {
            super(1, obj, h0.class, "refreshValues", "refreshValues(Lcom/planner5d/library/widget/editor/popup/itemproperties/pages/size/SizeViewModel$SizeAndPositionConfig;)V", 0);
        }

        public final void X(k0.c p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((h0) this.receiver).S0(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k0.c cVar) {
            X(cVar);
            return Unit.f312394a;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements SliderViewV2.c {
        c() {
        }

        @Override // com.planner5d.library.widget.SliderViewV2.c
        public void a() {
        }

        @Override // com.planner5d.library.widget.SliderViewV2.c
        public void b(int i10) {
            h0.this.f257432x3.I1();
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257436a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257436a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f257436a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257436a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull Context context, @NotNull o0 lifecycleOwner, @NotNull k0 viewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f257432x3 = viewModel;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout);
        this.f257433y3 = linearLayout;
        this.f257434z3 = N0();
        Iterator<T> it = viewModel.Z0().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.w0) it.next()).q(lifecycleOwner);
        }
        this.f257432x3.Z0().clear();
        this.A3 = H0(true, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.z0(this.f257732a, (BigDecimal) obj);
            }
        });
        d8 d8VarD = d8.d(LayoutInflater.from(context), this, false);
        this.C3 = d8VarD;
        final ButtonWallResizeV2 buttonWallResizeV2 = d8VarD.f158867b;
        buttonWallResizeV2.setActive(1);
        Intrinsics.checkNotNullExpressionValue(buttonWallResizeV2, "apply(...)");
        this.B3 = H0(true, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.A0(this.f257408a, buttonWallResizeV2, (BigDecimal) obj);
            }
        });
        this.f257433y3.addView(d8VarD.getRoot());
        int i10 = 6 & 0;
        this.D3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.B0(this.f257412a, (BigDecimal) obj);
            }
        }, 1, null);
        this.E3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.C0(this.f257422a, (BigDecimal) obj);
            }
        }, 1, null);
        this.F3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.D0(this.f257424a, (BigDecimal) obj);
            }
        }, 1, null);
        this.G3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.E0(this.f257426a, (BigDecimal) obj);
            }
        }, 1, null);
        this.H3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.v0(this.f257428a, (BigDecimal) obj);
            }
        }, 1, null);
        this.I3 = I0(this, false, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.w0(this.f257430a, (BigDecimal) obj);
            }
        }, 1, null);
        this.J3 = M0(com.planner5d.library.f.h.Ra, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.x0(this.f257733a, ((Integer) obj).intValue());
            }
        });
        this.K3 = M0(com.planner5d.library.f.h.Qa, new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.y0(this.f257734a, ((Integer) obj).intValue());
            }
        });
        this.f257432x3.p1().k(lifecycleOwner, new d(new a(this)));
        Iterator<T> it2 = this.f257432x3.Z0().iterator();
        while (it2.hasNext()) {
            androidx.lifecycle.w.g(kotlinx.coroutines.flow.k.d0(androidx.lifecycle.w.a((androidx.lifecycle.w0) it2.next()), new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(h0.g0((Function0) obj));
                }
            }), null, 0L, 3, null).k(lifecycleOwner, new d(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.i0((Function0) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(h0 h0Var, ButtonWallResizeV2 buttonWallResizeV2, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.O1(it, Integer.valueOf(buttonWallResizeV2.getActive()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.W1(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.L1(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.K1(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.R1(it);
        return Unit.f312394a;
    }

    private final NumberInputView H0(boolean z10, final Function1<? super BigDecimal, Unit> function1) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NumberInputView numberInputView = new NumberInputView(context, null, 0, 6, null);
        int dimensionPixelSize = numberInputView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        numberInputView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (z10) {
            final c1 c1Var = new c1();
            numberInputView.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.v
                @Override // com.planner5d.library.widget.NumberInputView.b
                public final void a(BigDecimal bigDecimal, boolean z11) {
                    h0.J0(function1, c1Var, bigDecimal, z11);
                }
            });
            this.f257432x3.Z0().add(c1Var);
        } else {
            numberInputView.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.w
                @Override // com.planner5d.library.widget.NumberInputView.b
                public final void a(BigDecimal bigDecimal, boolean z11) {
                    h0.L0(function1, bigDecimal, z11);
                }
            });
        }
        this.f257433y3.addView(numberInputView);
        return numberInputView;
    }

    static /* synthetic */ NumberInputView I0(h0 h0Var, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h0Var.H0(z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(final Function1 function1, c1 c1Var, final BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (z10) {
            function1.invoke(value);
        } else {
            c1Var.o(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.K0(function1, value);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K0(Function1 function1, BigDecimal bigDecimal) {
        function1.invoke(bigDecimal);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(Function1 function1, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        function1.invoke(value);
    }

    private final SliderViewV2 M0(@androidx.annotation.v int i10, Function1<? super Integer, Unit> function1) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SliderViewV2 sliderViewV2 = new SliderViewV2(context, null, 0, 6, null);
        int dimensionPixelSize = sliderViewV2.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        sliderViewV2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        sliderViewV2.C(com.planner5d.library.f.s.tA, Integer.valueOf(i10));
        sliderViewV2.setUnits("°");
        sliderViewV2.setMax(CropImageOptions.S3);
        sliderViewV2.setOnSliderChangeListener(function1);
        sliderViewV2.setTouchListener(new c());
        this.f257433y3.addView(sliderViewV2);
        return sliderViewV2;
    }

    private final b2 N0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b2 b2Var = new b2(context, null, 0, 6, null);
        b2Var.setBackgroundColor(androidx.core.content.d.g(b2Var.getContext(), com.planner5d.library.f.C1549f.f166825yh));
        this.f257433y3.addView(b2Var);
        return b2Var;
    }

    private final void O0(NumberInputView numberInputView, boolean z10, boolean z11, @f1 int i10, com.planner5d.library.model.metricunit.a aVar, Range<BigDecimal> range, BigDecimal bigDecimal) {
        numberInputView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            numberInputView.L(z11);
            numberInputView.setMetricUnit(aVar);
            numberInputView.P(i10, aVar);
            numberInputView.setRange(range);
            numberInputView.R(bigDecimal, false);
        }
    }

    private final void P0(SliderViewV2 sliderViewV2, boolean z10, int i10) {
        sliderViewV2.setVisibility(z10 ? 0 : 8);
        if (z10) {
            sliderViewV2.G(i10, false);
        }
    }

    private final void Q0(k0.c cVar) {
        O0(this.G3, this.f257432x3.B1(), cVar.I(), com.planner5d.library.f.s.T, cVar.F(), cVar.x(), cVar.S());
        O0(this.H3, this.f257432x3.z1(), cVar.G(), com.planner5d.library.f.s.nu, cVar.F(), cVar.H(), cVar.Q());
        O0(this.I3, this.f257432x3.A1(), cVar.G(), com.planner5d.library.f.s.ou, cVar.F(), cVar.H(), cVar.R());
    }

    private final void R0(k0.c cVar) {
        O0(this.A3, cVar.K(), true, com.planner5d.library.f.s.lH, cVar.F(), cVar.N(), cVar.M());
        O0(this.B3, cVar.E(), true, com.planner5d.library.f.s.fH, cVar.F(), cVar.D(), cVar.C());
        boolean zD1 = this.f257432x3.D1();
        O0(this.D3, zD1, cVar.I(), com.planner5d.library.f.s.NH, cVar.F(), cVar.H(), cVar.P());
        O0(this.E3, zD1, cVar.I(), com.planner5d.library.f.s.f169324od, cVar.F(), cVar.H(), cVar.B());
        O0(this.F3, this.f257432x3.v1(), cVar.I(), com.planner5d.library.f.s.I5, cVar.F(), cVar.H(), cVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(k0.c cVar) {
        b2 b2Var = this.f257434z3;
        b2Var.setVisibility(cVar.J() ? 0 : 8);
        if (cVar.J() && cVar.O() != null && cVar.L() != null) {
            BigDecimal bigDecimalO = cVar.O();
            BigDecimal bigDecimalL = cVar.L();
            String strG = cVar.F().g();
            Intrinsics.checkNotNullExpressionValue(strG, "getTitleForSize(...)");
            b2Var.a(bigDecimalO, bigDecimalL, strG);
        }
        ConstraintLayout root = this.C3.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(cVar.J() ? 0 : 8);
        P0(this.J3, cVar.z(), this.f257432x3.n1());
        P0(this.K3, cVar.y(), this.f257432x3.m1());
        R0(cVar);
        Q0(cVar);
    }

    public static long g0(Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 1000L;
    }

    public static Unit i0(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.P1(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.Q1(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(h0 h0Var, int i10) {
        h0Var.f257432x3.U1(i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y0(h0 h0Var, int i10) {
        h0Var.f257432x3.T1(i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(h0 h0Var, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h0Var.f257432x3.V1(it);
        return Unit.f312394a;
    }
}
