package com.planner5d.library.uploadplan.view;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.k3;
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
@SourceDebugExtension({"SMAP\nUploadPlanUploadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanUploadFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanUploadFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n16#2:104\n1#3:105\n*S KotlinDebug\n*F\n+ 1 UploadPlanUploadFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanUploadFragment\n*L\n29#1:104\n*E\n"})
public final class UploadPlanUploadFragment extends UploadPlanBaseFragment implements com.planner5d.library.widget.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ie.k f230875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230876f;

    @ij.a
    public com.planner5d.library.model.manager.config.j featureConfigManager;

    @ij.a
    public ia.b paywallStrategy;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230877a;

        static {
            int[] iArr = new int[y0.a.values().length];
            try {
                iArr[y0.a.Crop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f230877a = iArr;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230878a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230878a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230878a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230878a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanUploadFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanUploadFragment\n*L\n1#1,16:1\n29#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanUploadFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230880a;

        public d(com.planner5d.library.view.b bVar) {
            this.f230880a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230880a;
        }
    }

    public UploadPlanUploadFragment() {
        com.planner5d.library.uploadplan.application.g.a aVar = com.planner5d.library.uploadplan.application.g.f230718b;
        Function0 function0 = null;
        this.f230876f = new i2(j1.d(y0.class), new c(), new d(aVar.a()), function0, 8, null);
        aVar.a().m(this);
    }

    private final y0 C() {
        return (y0) this.f230876f.getValue();
    }

    private final Unit D(y0.a aVar, Uri uri) {
        return y((aVar == null ? -1 : a.f230877a[aVar.ordinal()]) == 1 ? new Pair<>(UploadPlanImageCropFragment.class, new com.planner5d.library.services.utility.i().i(com.planner5d.library.services.r.uri, uri).t(com.planner5d.library.services.r.method, C().b0()).a()) : null);
    }

    static /* synthetic */ Unit E(UploadPlanUploadFragment uploadPlanUploadFragment, y0.a aVar, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uri = null;
        }
        return uploadPlanUploadFragment.D(aVar, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(UploadPlanUploadFragment uploadPlanUploadFragment, y0.b bVar) {
        com.planner5d.library.activity.helper.ui.d.f(uploadPlanUploadFragment, new com.planner5d.library.activity.helper.ui.b(bVar.a(), null, true));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(UploadPlanUploadFragment uploadPlanUploadFragment, Pair pair) {
        if (pair != null) {
            uploadPlanUploadFragment.D((y0.a) pair.getFirst(), (Uri) pair.getSecond());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(UploadPlanUploadFragment uploadPlanUploadFragment, View view) {
        if (uploadPlanUploadFragment.getFeatureConfigManager$P5D_Library_UploadPlan_release().a(com.planner5d.library.model.manager.config.f.AiMoney)) {
            uploadPlanUploadFragment.I();
        } else {
            uploadPlanUploadFragment.J();
        }
    }

    private final void I() {
        if (C().f0()) {
            C().j0();
            return;
        }
        ia.b paywallStrategy$P5D_Library_UploadPlan_release = getPaywallStrategy$P5D_Library_UploadPlan_release();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        paywallStrategy$P5D_Library_UploadPlan_release.c(new com.planner5d.library.activity.fragment.dialog.r(childFragmentManager), com.planner5d.library.model.manager.config.purchaseplacement.b.a.plan_recognitions, y3.c.upload_plan, null);
    }

    private final void J() {
        if (C().g0()) {
            C().j0();
            return;
        }
        ia.b paywallStrategy$P5D_Library_UploadPlan_release = getPaywallStrategy$P5D_Library_UploadPlan_release();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        paywallStrategy$P5D_Library_UploadPlan_release.c(new com.planner5d.library.activity.fragment.dialog.r(childFragmentManager), com.planner5d.library.model.manager.config.purchaseplacement.b.a.upload_plan, y3.c.upload_plan, null);
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.j getFeatureConfigManager$P5D_Library_UploadPlan_release() {
        com.planner5d.library.model.manager.config.j jVar = this.featureConfigManager;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final ia.b getPaywallStrategy$P5D_Library_UploadPlan_release() {
        ia.b bVar = this.paywallStrategy;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallStrategy");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        C().l0(e4.a.back);
        return false;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ie.k kVarC = ie.k.c(inflater);
        this.f230875e = kVarC;
        C().k0(e4.c.f216886a.a(getArguments()));
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(he.b.s.f284047g1, new Object[0]));
        C().d0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanUploadFragment.F(this.f231177a, (y0.b) obj);
            }
        }));
        C().c0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanUploadFragment.G(this.f231179a, (Pair) obj);
            }
        }));
        kVarC.f287168f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanUploadFragment.H(this.f231187a, view);
            }
        });
        ConstraintLayout constraintLayoutB = kVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ie.k kVar = this.f230875e;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVar = null;
        }
        kVar.f287164b.f287207c.A();
    }

    public final void setFeatureConfigManager$P5D_Library_UploadPlan_release(@NotNull com.planner5d.library.model.manager.config.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.featureConfigManager = jVar;
    }

    public final void setPaywallStrategy$P5D_Library_UploadPlan_release(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }
}
