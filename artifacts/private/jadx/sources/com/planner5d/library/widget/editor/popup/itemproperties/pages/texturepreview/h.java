package com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.databinding.b8;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.editor.editor3d.compatibility.GLTextureView;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextureAddPreviewView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextureAddPreviewView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/texturepreview/TextureAddPreviewView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,141:1\n216#2,2:142\n216#2,2:144\n*S KotlinDebug\n*F\n+ 1 TextureAddPreviewView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/texturepreview/TextureAddPreviewView\n*L\n84#1:142,2\n101#1:144,2\n*E\n"})
public final class h extends ScrollView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f257785j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f257786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private vb.a f257787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b8 f257788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.o f257789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ValueAnimator f257790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f257791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f257792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f257793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f257794i;

    public static final class a implements vb.e {
        a() {
        }

        @Override // vb.e
        public vb.c a(vb.a application, vb.b config) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(config, "config");
            com.planner5d.library.engine.i iVarD0 = h.this.f257786a.d0();
            b8 b8Var = h.this.f257788c;
            if (b8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                b8Var = null;
            }
            GLTextureView textureAddPreviewSpinning3DShape = b8Var.f158768c;
            Intrinsics.checkNotNullExpressionValue(textureAddPreviewSpinning3DShape, "textureAddPreviewSpinning3DShape");
            return iVarD0.a(application, config, new com.planner5d.library.widget.editor.editor3d.compatibility.e(textureAddPreviewSpinning3DShape, h.this.f257786a.c0()));
        }
    }

    public static final class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), h.this.getResources().getDimension(com.planner5d.library.f.g.Xg));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull n viewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f257786a = viewModel;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(5000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f257790e = valueAnimatorOfFloat;
        this.f257791f = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.n(this.f257778a);
            }
        });
        this.f257788c = b8.a(View.inflate(context, com.planner5d.library.f.m.f168779n9, this));
        com.planner5d.library.engine.o oVarA = viewModel.i0().a(context, new gc.f(), new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.h(this.f257779a);
            }
        });
        this.f257789d = oVarA;
        this.f257787b = viewModel.d0().c(context, oVarA, o(), new a());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.i(this.f257780a, valueAnimator);
            }
        });
        b8 b8Var = this.f257788c;
        b8 b8Var2 = null;
        if (b8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var = null;
        }
        NumberInputView numberInputView = b8Var.f158772g;
        numberInputView.Q(com.planner5d.library.f.s.IA, "%");
        numberInputView.setLabelSize(com.planner5d.library.f.g.K3);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        NumberInputView.S(numberInputView, bigDecimalValueOf, false, 2, null);
        numberInputView.L(true);
        b8 b8Var3 = this.f257788c;
        if (b8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var3 = null;
        }
        b8Var3.f158772g.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.e
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                h.j(this.f257781a, bigDecimal, z10);
            }
        });
        b8 b8Var4 = this.f257788c;
        if (b8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var4 = null;
        }
        b8Var4.f158771f.setOnSliderChangeListener(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.k(this.f257782a, ((Integer) obj).intValue());
            }
        });
        for (Map.Entry<com.planner5d.library.engine.o.a, ImageView> entry : getButtons().entrySet()) {
            final com.planner5d.library.engine.o.a key = entry.getKey();
            ImageView value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            value.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.a(this.f257783a, key, view);
                }
            });
        }
        setPreviewType(com.planner5d.library.engine.o.a.CUBE);
        b8 b8Var5 = this.f257788c;
        if (b8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var5 = null;
        }
        b8Var5.f158768c.setClipToOutline(true);
        b8 b8Var6 = this.f257788c;
        if (b8Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            b8Var2 = b8Var6;
        }
        b8Var2.f158768c.setOutlineProvider(new b());
    }

    public static void a(h hVar, com.planner5d.library.engine.o.a aVar, View view) {
        hVar.setPreviewType(aVar);
    }

    private final Map<com.planner5d.library.engine.o.a, ImageView> getButtons() {
        return (Map) this.f257791f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.engine.a h(h hVar) {
        vb.a aVar = hVar.f257787b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationGdx");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(h hVar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.planner5d.library.engine.o oVar = hVar.f257789d;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        oVar.d(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(h hVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        hVar.f257789d.T(Intrinsics.areEqual(value, BigDecimal.ZERO) ? 100.0f : value.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(h hVar, int i10) {
        hVar.f257789d.F0(i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map n(h hVar) {
        com.planner5d.library.engine.o.a aVar = com.planner5d.library.engine.o.a.CUBE;
        b8 b8Var = hVar.f257788c;
        b8 b8Var2 = null;
        if (b8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var = null;
        }
        Pair pair = TuplesKt.to(aVar, b8Var.f158769d);
        com.planner5d.library.engine.o.a aVar2 = com.planner5d.library.engine.o.a.GRID;
        b8 b8Var3 = hVar.f257788c;
        if (b8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var3 = null;
        }
        Pair pair2 = TuplesKt.to(aVar2, b8Var3.f158770e);
        com.planner5d.library.engine.o.a aVar3 = com.planner5d.library.engine.o.a.SPHERE;
        b8 b8Var4 = hVar.f257788c;
        if (b8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            b8Var2 = b8Var4;
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to(aVar3, b8Var2.f158773h));
    }

    private final vb.b o() {
        vb.b bVar = new vb.b();
        bVar.f385710a = 8;
        bVar.f385711b = 8;
        bVar.f385712c = 8;
        bVar.f385713d = 8;
        bVar.f385716g = 2;
        bVar.f385714e = 24;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar, Bitmap bitmap, View view) {
        hVar.f257786a.o0(bitmap);
    }

    private final void setPreviewType(com.planner5d.library.engine.o.a aVar) {
        this.f257789d.c1(aVar);
        for (Map.Entry<com.planner5d.library.engine.o.a, ImageView> entry : getButtons().entrySet()) {
            com.planner5d.library.engine.o.a key = entry.getKey();
            ImageView value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            ImageView imageView = value;
            com.planner5d.library.widget.drawable.c.f254258a.i(imageView.getDrawable(), key == aVar ? Integer.valueOf(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.Mh)) : null);
            imageView.setSelected(key == aVar);
        }
    }

    private final void setRendering(boolean z10) {
        vb.a aVar = null;
        if (z10) {
            if (!this.f257792g) {
                this.f257790e.start();
                vb.a aVar2 = this.f257787b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationGdx");
                } else {
                    aVar = aVar2;
                }
                aVar.l();
            }
        } else if (this.f257792g) {
            this.f257790e.cancel();
            vb.a aVar3 = this.f257787b;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationGdx");
            } else {
                aVar = aVar3;
            }
            aVar.d();
        }
        this.f257792g = z10;
    }

    public final boolean getActive() {
        return this.f257794i;
    }

    public final boolean getResumed() {
        return this.f257793h;
    }

    public final void setActive(boolean z10) {
        this.f257794i = z10;
        setRendering(this.f257793h && z10);
    }

    public final void setBitmap(@Nullable final Bitmap bitmap) {
        b8 b8Var = this.f257788c;
        if (b8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            b8Var = null;
        }
        b8Var.f158774i.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.p(this.f257776a, bitmap, view);
            }
        });
        this.f257789d.L1(bitmap);
    }

    public final void setResumed(boolean z10) {
        this.f257793h = z10;
        setRendering(z10 && this.f257794i);
    }
}
