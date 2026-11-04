package com.planner5d.library.activity.fragment.snapshots;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i2;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.ImageSlider;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nImproveSnapshotWithAi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImproveSnapshotWithAi.kt\ncom/planner5d/library/activity/fragment/snapshots/ImproveSnapshotWithAi\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n12#2,6:177\n28#2:183\n1#3:184\n327#4,4:185\n257#4,2:189\n257#4,2:191\n257#4,2:193\n*S KotlinDebug\n*F\n+ 1 ImproveSnapshotWithAi.kt\ncom/planner5d/library/activity/fragment/snapshots/ImproveSnapshotWithAi\n*L\n56#1:177,6\n56#1:183\n93#1:185,4\n169#1:189,2\n170#1:191,2\n171#1:193,2\n*E\n"})
public final class ImproveSnapshotWithAi extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f135877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f135878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Pair<String, String> f135879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f135880h;

    @ij.a
    public com.planner5d.library.model.manager.y0 imageManager;

    @ij.a
    public c2 messageManager;

    @ij.a
    public ia.b paywallStrategy;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135881a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135881a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f135881a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135881a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<Bitmap, Unit> {
        b(Object obj) {
            super(1, obj, ImageSlider.class, "setLeftSlideImage", "setLeftSlideImage(Landroid/graphics/Bitmap;)V", 0);
        }

        public final void X(Bitmap bitmap) {
            ((ImageSlider) this.receiver).setLeftSlideImage(bitmap);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            X(bitmap);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements Function1<Bitmap, Unit> {
        c(Object obj) {
            super(1, obj, ImageSlider.class, "setRightSlideImage", "setRightSlideImage(Landroid/graphics/Bitmap;)V", 0);
        }

        public final void X(Bitmap bitmap) {
            ((ImageSlider) this.receiver).setRightSlideImage(bitmap);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            X(bitmap);
            return Unit.f312394a;
        }
    }

    public ImproveSnapshotWithAi() {
        t3 t3Var = t3.f229751a;
        this.f135878f = new i2(j1.d(h.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f135879g = TuplesKt.to("ai_improve_before", "ai_improve_after");
        this.f135880h = new AtomicInteger(0);
        com.planner5d.library.application.b.f142455c.a().t1(this);
    }

    private final Long F() {
        Long lValueOf = Long.valueOf(new com.planner5d.library.services.utility.j(getArguments()).d(com.planner5d.library.services.r.id, -1L));
        if (lValueOf.longValue() != -1) {
            return lValueOf;
        }
        return null;
    }

    private final h G() {
        return (h) this.f135878f.getValue();
    }

    private final void H(final ImageSlider imageSlider, String str, int i10, int i11, final Function1<? super Bitmap, Unit> function1) {
        com.planner5d.library.model.manager.y0 imageManager$P5D_Library_release = getImageManager$P5D_Library_release();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f135877e;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        imageManager$P5D_Library_release.k(str, i10, i11, hVar.c(new com.planner5d.library.activity.fragment.dialog.purchase.snapshots.h.a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImproveSnapshotWithAi.I(function1, this, imageSlider, (Bitmap) obj);
            }
        })), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Function1 function1, ImproveSnapshotWithAi improveSnapshotWithAi, ImageSlider imageSlider, Bitmap bitmap) {
        function1.invoke(bitmap);
        if (improveSnapshotWithAi.f135880h.incrementAndGet() == TuplesKt.toList(improveSnapshotWithAi.f135879g).size()) {
            imageSlider.setLoading(false);
            imageSlider.h();
        }
        return Unit.f312394a;
    }

    private final void J(final long j10) {
        ia.b paywallStrategy$P5D_Library_release = getPaywallStrategy$P5D_Library_release();
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        paywallStrategy$P5D_Library_release.b(new com.planner5d.library.activity.fragment.dialog.r(supportFragmentManager), com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_renders, y3.c.ai_renders, null, new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImproveSnapshotWithAi.K(this.f135915a, j10, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(ImproveSnapshotWithAi improveSnapshotWithAi, long j10, boolean z10) {
        if (improveSnapshotWithAi.G().c0()) {
            improveSnapshotWithAi.G().d0(j10, false);
        }
        return Unit.f312394a;
    }

    private final void L(ButtonTextView buttonTextView, final long j10) {
        buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.snapshots.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImproveSnapshotWithAi.M(this.f136002a, j10, view);
            }
        });
        G().Y().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImproveSnapshotWithAi.N(this.f136004a, j10, (h.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(ImproveSnapshotWithAi improveSnapshotWithAi, long j10, View view) {
        h.f0(improveSnapshotWithAi.G(), j10, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(ImproveSnapshotWithAi improveSnapshotWithAi, long j10, h.a aVar) {
        if (Intrinsics.areEqual(aVar, h.a.b.f136017b)) {
            improveSnapshotWithAi.J(j10);
        } else if (aVar instanceof h.a.C1496a) {
            improveSnapshotWithAi.getMessageManager$P5D_Library_release().c(((h.a.C1496a) aVar).a());
        } else {
            if (!Intrinsics.areEqual(aVar, h.a.c.f136019b)) {
                throw new kotlin.k0();
            }
            com.planner5d.library.activity.fragment.x.g(improveSnapshotWithAi.f131538b, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.snapshotsList).a()), false, 2, null);
        }
        return Unit.f312394a;
    }

    private final void O(View view, final TextView textView) {
        com.planner5d.library.widget.d.f(new com.planner5d.library.widget.d(), view, requireActivity().getOnBackPressedDispatcher(), 0, 0, new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImproveSnapshotWithAi.P(textView, this, (View) obj);
            }
        }, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(TextView textView, ImproveSnapshotWithAi improveSnapshotWithAi, View backButton) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = backButton.getBottom() + improveSnapshotWithAi.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Hh);
        textView.setLayoutParams(marginLayoutParams);
        return Unit.f312394a;
    }

    private final void Q(final ImageSlider imageSlider) {
        imageSlider.setLoading(true);
        imageSlider.setSizesChangedCallback(new Function2() { // from class: com.planner5d.library.activity.fragment.snapshots.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ImproveSnapshotWithAi.R(this.f135982a, imageSlider, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(ImproveSnapshotWithAi improveSnapshotWithAi, ImageSlider imageSlider, int i10, int i11) {
        com.planner5d.library.services.bitmaploader.target.h hVar = improveSnapshotWithAi.f135877e;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        hVar.e();
        improveSnapshotWithAi.H(imageSlider, improveSnapshotWithAi.f135879g.getFirst(), i10, i11, new b(imageSlider));
        improveSnapshotWithAi.H(imageSlider, improveSnapshotWithAi.f135879g.getSecond(), i10, i11, new c(imageSlider));
        return Unit.f312394a;
    }

    private final void S(final ButtonTextView buttonTextView, final ImageView imageView, final TextView textView, final CircularProgressIndicator circularProgressIndicator) {
        G().a0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.snapshots.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImproveSnapshotWithAi.T(buttonTextView, this, imageView, textView, circularProgressIndicator, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(ButtonTextView buttonTextView, ImproveSnapshotWithAi improveSnapshotWithAi, ImageView imageView, TextView textView, CircularProgressIndicator circularProgressIndicator, Boolean bool) {
        buttonTextView.setEnabled((bool.booleanValue() || Intrinsics.areEqual(improveSnapshotWithAi.G().Y().f(), h.a.c.f136019b)) ? false : true);
        imageView.setVisibility(!bool.booleanValue() ? 0 : 8);
        textView.setVisibility(!bool.booleanValue() ? 0 : 8);
        circularProgressIndicator.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.f312394a;
    }

    @NotNull
    public final com.planner5d.library.model.manager.y0 getImageManager$P5D_Library_release() {
        com.planner5d.library.model.manager.y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @NotNull
    public final c2 getMessageManager$P5D_Library_release() {
        c2 c2Var = this.messageManager;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy$P5D_Library_release() {
        ia.b bVar = this.paywallStrategy;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).N(false).F(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.databinding.a1 a1VarD = com.planner5d.library.databinding.a1.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(a1VarD, "inflate(...)");
        Long lF = F();
        if (lF != null) {
            this.f135877e = new com.planner5d.library.services.bitmaploader.target.h.a().a(getViewLifecycleOwner());
            ConstraintLayout root = a1VarD.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            TextView title = a1VarD.f158684i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            O(root, title);
            ImageSlider slider = a1VarD.f158682g;
            Intrinsics.checkNotNullExpressionValue(slider, "slider");
            Q(slider);
            ButtonTextView action = a1VarD.f158677b;
            Intrinsics.checkNotNullExpressionValue(action, "action");
            L(action, lF.longValue());
            ButtonTextView action2 = a1VarD.f158677b;
            Intrinsics.checkNotNullExpressionValue(action2, "action");
            ImageView actionIcon = a1VarD.f158678c;
            Intrinsics.checkNotNullExpressionValue(actionIcon, "actionIcon");
            TextView actionTitle = a1VarD.f158680e;
            Intrinsics.checkNotNullExpressionValue(actionTitle, "actionTitle");
            CircularProgressIndicator actionPreloader = a1VarD.f158679d;
            Intrinsics.checkNotNullExpressionValue(actionPreloader, "actionPreloader");
            S(action2, actionIcon, actionTitle, actionPreloader);
        } else {
            getMessageManager$P5D_Library_release().e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.f169344p9, new Object[0]), new com.planner5d.library.model.u.a[0]));
            this.f131538b.j();
        }
        ConstraintLayout root2 = a1VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    public final void setImageManager$P5D_Library_release(@NotNull com.planner5d.library.model.manager.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }

    public final void setMessageManager$P5D_Library_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }

    public final void setPaywallStrategy$P5D_Library_release(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }
}
