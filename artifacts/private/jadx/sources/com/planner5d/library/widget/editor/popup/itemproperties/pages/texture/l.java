package com.planner5d.library.widget.editor.popup.itemproperties.pages.texture;

import android.content.Context;
import android.util.Pair;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import com.planner5d.library.databinding.c1;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.y;
import com.planner5d.library.services.utility.y1;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.colorpicker.ColorPickerCompact;
import com.planner5d.library.widget.e1;
import com.planner5d.library.widget.preloader.t;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextureSettingsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextureSettingsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/texture/TextureSettingsView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n299#2,2:223\n299#2,2:225\n299#2,2:227\n299#2,2:229\n299#2,2:231\n299#2,2:233\n299#2,2:235\n299#2,2:237\n299#2,2:239\n257#2,2:241\n257#2,2:243\n257#2,2:245\n257#2,2:247\n257#2,2:249\n257#2,2:251\n257#2,2:253\n257#2,2:256\n257#2,2:258\n1#3:255\n*S KotlinDebug\n*F\n+ 1 TextureSettingsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/texture/TextureSettingsView\n*L\n139#1:223,2\n140#1:225,2\n141#1:227,2\n142#1:229,2\n143#1:231,2\n150#1:233,2\n151#1:235,2\n152#1:237,2\n153#1:239,2\n158#1:241,2\n159#1:243,2\n166#1:245,2\n172#1:247,2\n176#1:249,2\n182#1:251,2\n191#1:253,2\n213#1:256,2\n76#1:258,2\n*E\n"})
public final class l extends ScrollView implements e1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f257751g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f257752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1 f257753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.widget.editor.popup.properties.view.c> f257754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f257755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f257756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f257757f;

    public static final class a implements ColorPickerCompact.a {
        a() {
        }

        @Override // com.planner5d.library.widget.colorpicker.ColorPickerCompact.a
        public void a(int i10) {
            l.this.f257752a.h0(Integer.valueOf(i10));
            l.this.f257752a.X();
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257759a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257759a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f257759a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257759a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class c extends com.planner5d.library.services.rx.e<com.planner5d.library.model.b> {
        c() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.b color) {
            Intrinsics.checkNotNullParameter(color, "color");
            l.this.getBinding().f158790c.setColor(color.a());
            l.this.f257752a.h0(Integer.valueOf(color.a()));
            l.this.f257752a.X();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, @NotNull o viewModel, @NotNull o0 lifecycleOwner) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f257752a = viewModel;
        c1 c1VarB = c1.b(LayoutInflater.from(context), this);
        setFillViewport(true);
        Intrinsics.checkNotNullExpressionValue(c1VarB, "apply(...)");
        this.f257753b = c1VarB;
        this.f257754c = new ArrayList();
        this.f257755d = true;
        this.f257756e = new t();
        setupPreloader(lifecycleOwner);
        viewModel.a0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.l(this.f257740a, (ze.b) obj);
            }
        }));
        c1VarB.f158795h.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.c
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                l.o(this.f257742a, bigDecimal, z10);
            }
        });
        c1VarB.f158794g.setOnSliderChangeListener(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.p(this.f257743a, ((Integer) obj).intValue());
            }
        });
        c1VarB.f158791d.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.e
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                l.q(this.f257744a, bigDecimal, z10);
            }
        });
        c1VarB.f158796i.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.f
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                l.r(this.f257745a, bigDecimal, z10);
            }
        });
        w.g(kotlinx.coroutines.flow.k.c0(w.a(viewModel.b0()), 1000L), null, 0L, 3, null).k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.s(this.f257746a, (ze.c) obj);
            }
        }));
        viewModel.Y().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.t(this.f257747a, (List) obj);
            }
        }));
        viewModel.a0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.u(this.f257748a, (ze.b) obj);
            }
        }));
        c1VarB.f158789b.f159899f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                l.m(this.f257749a, compoundButton, z10);
            }
        });
        c1VarB.f158789b.f159897d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                l.n(this.f257750a, compoundButton, z10);
            }
        });
        c1VarB.f158790c.setColorChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l lVar, ze.b bVar) {
        lVar.f257752a.c0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, CompoundButton compoundButton, boolean z10) {
        if (lVar.f257757f) {
            lVar.f257752a.o0(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l lVar, CompoundButton compoundButton, boolean z10) {
        if (lVar.f257757f) {
            lVar.f257752a.i0(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l lVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        lVar.f257752a.n0(Float.valueOf(value.floatValue() / 100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(l lVar, int i10) {
        lVar.f257752a.m0(Float.valueOf(i10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(l lVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        lVar.f257752a.j0(Float.valueOf(value.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(l lVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        lVar.f257752a.p0(Float.valueOf(value.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(l lVar, ze.c cVar) {
        if (cVar != null) {
            lVar.f257752a.g0(cVar);
            y yVarG = cVar.g();
            float f10 = cVar.f();
            float fE = cVar.e();
            boolean z10 = false;
            int i10 = 5 << 1;
            if (cVar.d() == com.planner5d.library.engine.rendering.util.i.NoRepeat) {
                z10 = true;
            }
            lVar.w(yVarG, f10, fE, z10, cVar.a() == com.planner5d.library.engine.rendering.util.f.BottomLeft, cVar.c(), cVar.h());
            lVar.f257753b.f158790c.setColor(cVar.b());
        }
        return Unit.f312394a;
    }

    private final void setColorGroups(List<? extends Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>> list) {
        com.planner5d.library.widget.editor.popup.properties.view.c cVar;
        Iterator<com.planner5d.library.widget.editor.popup.properties.view.c> it = this.f257754c.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>> pair = list.get(i10);
            if (i10 < this.f257754c.size()) {
                cVar = this.f257754c.get(i10);
            } else {
                List<com.planner5d.library.widget.editor.popup.properties.view.c> list2 = this.f257754c;
                com.planner5d.library.widget.editor.popup.properties.view.c cVar2 = new com.planner5d.library.widget.editor.popup.properties.view.c(getContext());
                list2.add(cVar2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh);
                this.f257753b.f158793f.addView(cVar2, layoutParams);
                int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167166o3);
                cVar2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                cVar2.j().subscribe((Subscriber<? super com.planner5d.library.model.b>) new c());
                cVar = cVar2;
            }
            cVar.setVisibility(0);
            com.planner5d.library.widget.editor.popup.properties.view.c cVar3 = cVar;
            com.planner5d.library.model.c cVar4 = (com.planner5d.library.model.c) pair.first;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cVar3.setTitle(cVar4.a(context));
            cVar3.setColors((List) pair.second);
        }
    }

    private final void setupPreloader(o0 o0Var) {
        this.f257756e.b(this.f257753b.f158792e).g(Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.Xn))).h(Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166273bi)));
        this.f257752a.Z().k(o0Var, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.x(this.f257741a, (com.planner5d.library.widget.editor.popup.itemproperties.x) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(l lVar, List list) {
        Intrinsics.checkNotNull(list);
        lVar.setColorGroups(list);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(l lVar, ze.b bVar) {
        LinearLayout root = lVar.f257753b.f158789b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility((bVar != null ? bVar.h() : null) instanceof ItemPr ? 0 : 8);
        return Unit.f312394a;
    }

    private final void w(y yVar, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        if (yVar == null) {
            NumberInputView textureScale = this.f257753b.f158795h;
            Intrinsics.checkNotNullExpressionValue(textureScale, "textureScale");
            textureScale.setVisibility(8);
            SliderViewV2 textureRotation = this.f257753b.f158794g;
            Intrinsics.checkNotNullExpressionValue(textureRotation, "textureRotation");
            textureRotation.setVisibility(8);
            LinearLayout root = this.f257753b.f158789b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(8);
            NumberInputView textureHorizontalShift = this.f257753b.f158791d;
            Intrinsics.checkNotNullExpressionValue(textureHorizontalShift, "textureHorizontalShift");
            textureHorizontalShift.setVisibility(8);
            NumberInputView textureVerticalShift = this.f257753b.f158796i;
            Intrinsics.checkNotNullExpressionValue(textureVerticalShift, "textureVerticalShift");
            textureVerticalShift.setVisibility(8);
            return;
        }
        ze.b bVarF = this.f257752a.a0().f();
        if ((bVarF != null ? bVarF.h() : null) instanceof ItemPr) {
            this.f257757f = false;
            if (z10) {
                this.f257753b.f158789b.f159899f.setChecked(true);
                TextView textureAlignmentTitle = this.f257753b.f158789b.f159898e;
                Intrinsics.checkNotNullExpressionValue(textureAlignmentTitle, "textureAlignmentTitle");
                textureAlignmentTitle.setVisibility(8);
                RadioGroup textureAlignment = this.f257753b.f158789b.f159895b;
                Intrinsics.checkNotNullExpressionValue(textureAlignment, "textureAlignment");
                textureAlignment.setVisibility(8);
                NumberInputView textureScale2 = this.f257753b.f158795h;
                Intrinsics.checkNotNullExpressionValue(textureScale2, "textureScale");
                textureScale2.setVisibility(8);
                SliderViewV2 textureRotation2 = this.f257753b.f158794g;
                Intrinsics.checkNotNullExpressionValue(textureRotation2, "textureRotation");
                textureRotation2.setVisibility(8);
                this.f257757f = true;
                return;
            }
            this.f257753b.f158789b.f159900g.setChecked(true);
            TextView textureAlignmentTitle2 = this.f257753b.f158789b.f159898e;
            Intrinsics.checkNotNullExpressionValue(textureAlignmentTitle2, "textureAlignmentTitle");
            textureAlignmentTitle2.setVisibility(0);
            RadioGroup textureAlignment2 = this.f257753b.f158789b.f159895b;
            Intrinsics.checkNotNullExpressionValue(textureAlignment2, "textureAlignment");
            textureAlignment2.setVisibility(0);
            this.f257753b.f158789b.f159897d.setChecked(z11);
            this.f257753b.f158789b.f159896c.setChecked(!z11);
            this.f257757f = true;
        }
        NumberInputView numberInputView = this.f257753b.f158795h;
        Intrinsics.checkNotNull(numberInputView);
        numberInputView.setVisibility(0);
        numberInputView.Q(com.planner5d.library.f.s.IA, "%");
        long j10 = -999;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        long j11 = 999;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        numberInputView.setRange(new Range<>(bigDecimalValueOf, bigDecimalValueOf2));
        NumberInputView.S(numberInputView, y1.d(f10), false, 2, null);
        SliderViewV2 sliderViewV2 = this.f257753b.f158794g;
        Intrinsics.checkNotNull(sliderViewV2);
        sliderViewV2.setVisibility(0);
        sliderViewV2.E((int) f11, false);
        NumberInputView numberInputView2 = this.f257753b.f158791d;
        Intrinsics.checkNotNull(numberInputView2);
        numberInputView2.setVisibility(0);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(j11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
        numberInputView2.setRange(new Range<>(bigDecimalValueOf3, bigDecimalValueOf4));
        numberInputView2.Q(com.planner5d.library.f.s.sF, "%");
        numberInputView2.R(new BigDecimal(String.valueOf(f12)), false);
        NumberInputView numberInputView3 = this.f257753b.f158796i;
        Intrinsics.checkNotNull(numberInputView3);
        numberInputView3.setVisibility(0);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
        numberInputView3.setRange(new Range<>(bigDecimalValueOf5, bigDecimalValueOf6));
        numberInputView3.Q(com.planner5d.library.f.s.yF, "%");
        numberInputView3.R(new BigDecimal(String.valueOf(f13)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(l lVar, com.planner5d.library.widget.editor.popup.itemproperties.x xVar) {
        if (xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.c) {
            lVar.f257756e.a().p(lVar.getContext().getString(com.planner5d.library.f.s.qn), true);
        } else {
            if (!(xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.b) && !(xVar instanceof com.planner5d.library.widget.editor.popup.itemproperties.x.a)) {
                throw new k0();
            }
            lVar.f257756e.a().b();
        }
        return Unit.f312394a;
    }

    @NotNull
    public final c1 getBinding() {
        return this.f257753b;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.f257755d && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.f257755d && super.onTouchEvent(motionEvent);
    }

    public final void setOnChoseColorListener(@Nullable View.OnClickListener onClickListener) {
        this.f257753b.f158790c.setOnPreviewClickListener(onClickListener);
    }

    @Override // com.planner5d.library.widget.e1
    public void setScrollingEnabled(boolean z10) {
        this.f257755d = z10;
    }
}
