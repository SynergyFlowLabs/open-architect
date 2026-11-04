package com.planner5d.library.project.fragment.aidesigner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.model.manager.payments.b0;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.f3;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.c0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nAiFlowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiFlowFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiFlowFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,90:1\n16#2:91\n*S KotlinDebug\n*F\n+ 1 AiFlowFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiFlowFragment\n*L\n31#1:91\n*E\n"})
public final class AiFlowFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nd.b f223676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f223677b;

    @ij.a
    public b0 superwallUseCase;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223678a;

        static {
            int[] iArr = new int[m.a.values().length];
            try {
                iArr[m.a.Paywall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.a.Furnisher.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.a.Styler.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.a.Decorator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f223678a = iArr;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f223679a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f223679a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f223679a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f223679a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AiFlowFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiFlowFragment\n*L\n1#1,16:1\n31#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AiFlowFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f223681a;

        public d(com.planner5d.library.view.b bVar) {
            this.f223681a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f223681a;
        }
    }

    public AiFlowFragment() {
        com.planner5d.library.project.application.c.a aVar = com.planner5d.library.project.application.c.f223658b;
        aVar.a().i(this);
        Function0 function0 = null;
        this.f223677b = new i2(j1.d(m.class), new c(), new d(aVar.a()), function0, 8, null);
    }

    private final m w() {
        return (m) this.f223677b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(AiFlowFragment aiFlowFragment) {
        aiFlowFragment.w().c0(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AiFlowFragment aiFlowFragment, View view) {
        aiFlowFragment.w().c0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(AiFlowFragment aiFlowFragment, m.a aVar) {
        if (aVar != null) {
            aiFlowFragment.w().V();
            aiFlowFragment.navigate(aVar);
        }
        return Unit.f312394a;
    }

    @NotNull
    public final b0 getSuperwallUseCase$P5D_Library_Project_release() {
        b0 b0Var = this.superwallUseCase;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("superwallUseCase");
        return null;
    }

    public final void navigate(@NotNull m.a target) {
        Pair pair;
        Intrinsics.checkNotNullParameter(target, "target");
        int i10 = a.f223678a[target.ordinal()];
        if (i10 == 1) {
            b0 superwallUseCase$P5D_Library_Project_release = getSuperwallUseCase$P5D_Library_Project_release();
            s sVarRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            b0.a.a(superwallUseCase$P5D_Library_Project_release, sVarRequireActivity, childFragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_designer_b, null, new Function0() { // from class: com.planner5d.library.project.fragment.aidesigner.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AiFlowFragment.x(this.f223699a);
                }
            }, 8, null);
            return;
        }
        if (i10 == 2) {
            pair = new Pair(StatisticsEventAiDesigner.g.furnisher, Integer.valueOf(k.c().e()));
        } else if (i10 == 3) {
            pair = new Pair(StatisticsEventAiDesigner.g.styler, Integer.valueOf(k.b().e()));
        } else {
            if (i10 != 4) {
                throw new k0();
            }
            pair = new Pair(StatisticsEventAiDesigner.g.decorator, Integer.valueOf(k.a().e()));
        }
        StatisticsEventAiDesigner.g gVar = (StatisticsEventAiDesigner.g) pair.component1();
        int iIntValue = ((Number) pair.component2()).intValue();
        int i11 = 0 << 0;
        StatisticsEventAiDesigner.EventData eventDataJ = StatisticsEventAiDesigner.EventData.j(g3.f216952a.a(getArguments()), null, gVar, null, null, null, null, null, 125, null);
        w().i(StatisticsEventAiDesigner.a.onboarding_completed, eventDataJ);
        androidx.navigation.fragment.f.a(this).c0(iIntValue, new f3(getArguments(), eventDataJ).a());
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        w().U(StatisticsEventAiDesigner.a.back);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        w().b0(g3.f216952a.a(getArguments()));
        com.planner5d.library.activity.helper.ui.d.h(this, new k3(w().a0(), new Object[0]));
        nd.b bVarC = nd.b.c(inflater);
        this.f223676a = bVarC;
        bVarC.f332756c.setText(getString(w().Z()));
        bVarC.f332757d.setDataSource(w().W());
        bVarC.f332755b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.project.fragment.aidesigner.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiFlowFragment.y(this.f223697a, view);
            }
        });
        w().X().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.project.fragment.aidesigner.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiFlowFragment.z(this.f223698a, (m.a) obj);
            }
        }));
        ConstraintLayout root = bVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        nd.b bVar = this.f223676a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        bVar.f332757d.l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        nd.b bVar = this.f223676a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        bVar.f332757d.h();
    }

    public final void setSuperwallUseCase$P5D_Library_Project_release(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.superwallUseCase = b0Var;
    }
}
