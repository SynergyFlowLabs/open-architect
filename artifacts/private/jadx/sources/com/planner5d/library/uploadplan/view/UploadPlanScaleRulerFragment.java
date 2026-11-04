package com.planner5d.library.uploadplan.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.uploadplan.view.dialog.ResultLostDialog;
import com.planner5d.library.uploadplan.view.dialog.ScalingHelpDialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUploadPlanScaleRulerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanScaleRulerFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleRulerFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,129:1\n16#2:130\n257#3,2:131\n*S KotlinDebug\n*F\n+ 1 UploadPlanScaleRulerFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleRulerFragment\n*L\n32#1:130\n58#1:131,2\n*E\n"})
public final class UploadPlanScaleRulerFragment extends UploadPlanBaseFragment implements com.planner5d.library.activity.helper.ui.a {

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String f230854e = com.planner5d.library.services.r.cm.f224891a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f230856g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230857a;

        static {
            int[] iArr = new int[h0.a.values().length];
            try {
                iArr[h0.a.Feed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.a.ScaleIntro.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f230857a = iArr;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230858a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230858a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230858a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230858a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanScaleRulerFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleRulerFragment\n*L\n1#1,16:1\n32#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanScaleRulerFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230860a;

        public d(com.planner5d.library.view.b bVar) {
            this.f230860a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230860a;
        }
    }

    public UploadPlanScaleRulerFragment() {
        com.planner5d.library.uploadplan.application.g.a aVar = com.planner5d.library.uploadplan.application.g.f230718b;
        this.f230855f = new i2(j1.d(h0.class), new c(), new d(aVar.a()), null, 8, null);
        aVar.a().l(this);
    }

    private final void H(final h0.a aVar) {
        getDialogLauncher$P5D_Library_UploadPlan_release().c(ResultLostDialog.class).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.uploadplan.view.f0
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                UploadPlanScaleRulerFragment.I(this.f231025a, aVar, (Boolean) obj);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, h0.a aVar, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            uploadPlanScaleRulerFragment.K(aVar);
        }
    }

    private final h0 J() {
        return (h0) this.f230855f.getValue();
    }

    private final void K(h0.a aVar) {
        Pair pair;
        int i10 = aVar == null ? -1 : a.f230857a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f131538b.j();
                J().i0(e4.a.back);
                new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.method, J().Y()).a();
            }
            pair = null;
        } else {
            pair = Intrinsics.areEqual(this.f230856g, "feed") ? new Pair(FeedFragment.class, null) : new Pair(ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i(getArguments()).t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a());
        }
        if (pair != null) {
            com.planner5d.library.activity.fragment.x.g(this.f131538b, new com.planner5d.library.activity.helper.event.content.c((Class) pair.getFirst(), (Bundle) pair.getSecond(), com.planner5d.library.activity.helper.event.content.e.SlideLeft), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(ie.n nVar, Bitmap bitmap) {
        nVar.f287197i.setImageBitmap(bitmap);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, ie.n nVar, int i10, int i11, int i12, int i13) {
        uploadPlanScaleRulerFragment.J().d0(i10, i11, i12, i13, nVar.f287197i.getWidth());
        if (i10 + i12 + i11 + i13 != 0) {
            nVar.f287192d.setEnabled(true);
        } else {
            uploadPlanScaleRulerFragment.J().i0(e4.a.set_up_ruler);
            TextView hintMove = nVar.f287196h;
            Intrinsics.checkNotNullExpressionValue(hintMove, "hintMove");
            hintMove.setVisibility(8);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, h0.a aVar) {
        uploadPlanScaleRulerFragment.K(aVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, View view) {
        uploadPlanScaleRulerFragment.getDialogLauncher$P5D_Library_UploadPlan_release().c(ScalingHelpDialog.class).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, View view) {
        uploadPlanScaleRulerFragment.H(h0.a.ScaleIntro);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, View view) {
        uploadPlanScaleRulerFragment.H(h0.a.Feed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(UploadPlanScaleRulerFragment uploadPlanScaleRulerFragment, View view) {
        uploadPlanScaleRulerFragment.f131538b.f(new com.planner5d.library.activity.helper.event.content.c(UploadPlanScaleUnitsFragment.class, new com.planner5d.library.services.utility.i().o(com.planner5d.library.services.r.rulerPoints, new float[]{uploadPlanScaleRulerFragment.J().b0().f180480a, uploadPlanScaleRulerFragment.J().b0().f180481b, uploadPlanScaleRulerFragment.J().a0().f180480a, uploadPlanScaleRulerFragment.J().a0().f180481b}).a(), com.planner5d.library.activity.helper.event.content.e.SlideLeft), true);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher$P5D_Library_UploadPlan_release() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(false).N(false).A(he.b.f.f281409m1).H(true).z(he.b.f.f281409m1).G(false).y(he.b.f.f281409m1).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ie.n nVarC = ie.n.c(inflater);
        J().f0(e4.c.f216886a.a(getArguments()));
        this.f230856g = new com.planner5d.library.services.utility.j(getArguments()).t(com.planner5d.library.services.r.source, "my_projects");
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(he.b.s.f284047g1, new Object[0]));
        J().X().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanScaleRulerFragment.L(nVarC, (Bitmap) obj);
            }
        }));
        nVarC.f287192d.setEnabled(false);
        nVarC.f287197i.setHandler(new pj.o() { // from class: com.planner5d.library.uploadplan.view.z
            @Override // pj.o
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return UploadPlanScaleRulerFragment.M(this.f231251a, nVarC, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        });
        J().c0();
        J().Z().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanScaleRulerFragment.N(this.f230883a, (h0.a) obj);
            }
        }));
        nVarC.f287193e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleRulerFragment.O(this.f230896a, view);
            }
        });
        nVarC.f287190b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleRulerFragment.P(this.f230907a, view);
            }
        });
        nVarC.f287191c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleRulerFragment.Q(this.f230909a, view);
            }
        });
        nVarC.f287192d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleRulerFragment.R(this.f231022a, view);
            }
        });
        ConstraintLayout root = nVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setDialogLauncher$P5D_Library_UploadPlan_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }
}
