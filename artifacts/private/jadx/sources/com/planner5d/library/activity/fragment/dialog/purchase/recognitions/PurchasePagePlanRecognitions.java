package com.planner5d.library.activity.fragment.dialog.purchase.recognitions;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import com.planner5d.library.activity.fragment.projects.z0;
import com.planner5d.library.databinding.f2;
import com.planner5d.library.databinding.q7;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.CompareImagesView;
import com.planner5d.library.widget.preloader.t;
import fd.g;
import fd.n;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePlanRecognitions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePlanRecognitions.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/recognitions/PurchasePagePlanRecognitions\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n22#2,7:128\n12#2,6:135\n28#2:141\n1#3:142\n257#4,2:143\n257#4,2:145\n257#4,2:147\n257#4,2:149\n13409#5,2:151\n1863#6,2:153\n*S KotlinDebug\n*F\n+ 1 PurchasePagePlanRecognitions.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/recognitions/PurchasePagePlanRecognitions\n*L\n32#1:128,7\n33#1:135,6\n33#1:141\n70#1:143,2\n71#1:145,2\n79#1:147,2\n80#1:149,2\n86#1:151,2\n113#1:153,2\n*E\n"})
public final class PurchasePagePlanRecognitions extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f132741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f132743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f132744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f2 f132745e;

    @ij.a
    @f
    @Nullable
    public z0 uploadPlanViewProvider;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132746a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.dialog.purchase.a.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.a.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f132746a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, d.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((d) this.receiver).W();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePagePlanRecognitions.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/recognitions/PurchasePagePlanRecognitions\n*L\n1#1,28:1\n32#2:29\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePagePlanRecognitions.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePagePlanRecognitions() {
        t3 t3Var = t3.f229751a;
        this.f132741a = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new c(), new t3.b(this), null, 8, null);
        this.f132742b = new i2(j1.d(d.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132743c = com.planner5d.library.services.network.f.f224463a.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(PurchasePagePlanRecognitions purchasePagePlanRecognitions, g gVar) {
        com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarV = purchasePagePlanRecognitions.v();
        s sVarRequireActivity = purchasePagePlanRecognitions.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        f0VarV.n0(gVar, sVarRequireActivity);
        return Unit.f312394a;
    }

    private final void B() {
        z0 z0Var = this.uploadPlanViewProvider;
        if (z0Var != null) {
            int iG = z0Var.g();
            LayoutInflater layoutInflater = getLayoutInflater();
            f2 f2Var = this.f132745e;
            f2 f2Var2 = null;
            if (f2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f2Var = null;
            }
            View viewInflate = layoutInflater.inflate(iG, (ViewGroup) f2Var.f158955b, false);
            if (viewInflate == null) {
                return;
            }
            ((CompareImagesView) viewInflate.findViewById(com.planner5d.library.f.j.Jd)).A();
            f2 f2Var3 = this.f132745e;
            if (f2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                f2Var2 = f2Var3;
            }
            f2Var2.f158955b.addView(viewInflate);
        }
    }

    private final void C() {
        f2 f2Var = this.f132745e;
        if (f2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var = null;
        }
        t tVar = new t(f2Var.f158959f);
        this.f132744d = tVar;
        tVar.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        n1.a(viewLifecycleOwner, x().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.recognitions.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePagePlanRecognitions.D(this.f132748a, (com.planner5d.library.activity.fragment.dialog.purchase.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(PurchasePagePlanRecognitions purchasePagePlanRecognitions, com.planner5d.library.activity.fragment.dialog.purchase.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f132746a[it.b().ordinal()];
        if (i10 == 1) {
            t tVar = purchasePagePlanRecognitions.f132744d;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                tVar = null;
            }
            tVar.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePagePlanRecognitions.y(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePagePlanRecognitions.z(it.a());
        }
        return Unit.f312394a;
    }

    private final void E() {
        for (n nVar : CollectionsKt.listOf(new n(com.planner5d.library.f.h.f167434aa, com.planner5d.library.f.s.ex, com.planner5d.library.f.s.dx))) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i10 = com.planner5d.library.f.m.U8;
            f2 f2Var = this.f132745e;
            f2 f2Var2 = null;
            if (f2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f2Var = null;
            }
            View viewInflate = layoutInflaterFrom.inflate(i10, (ViewGroup) f2Var.f158956c, false);
            q7 q7VarA = q7.a(viewInflate);
            q7VarA.f159579c.setImageResource(nVar.g());
            q7VarA.f159580d.setText(viewInflate.getContext().getText(nVar.h()));
            q7VarA.f159578b.setText(viewInflate.getContext().getText(nVar.f()));
            f2 f2Var3 = this.f132745e;
            if (f2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                f2Var2 = f2Var3;
            }
            f2Var2.f158956c.addView(viewInflate);
        }
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.f0 v() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132741a.getValue();
    }

    private final com.planner5d.library.services.network.b w() {
        return (com.planner5d.library.services.network.b) this.f132743c.getValue();
    }

    private final d x() {
        return (d) this.f132742b.getValue();
    }

    private final void y(String str) {
        t tVar = this.f132744d;
        f2 f2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        f2 f2Var2 = this.f132745e;
        if (f2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var2 = null;
        }
        LinearLayout purchaseList = f2Var2.f158958e;
        Intrinsics.checkNotNullExpressionValue(purchaseList, "purchaseList");
        purchaseList.setVisibility(8);
        f2 f2Var3 = this.f132745e;
        if (f2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var3 = null;
        }
        TextView purchaseErrorMessage = f2Var3.f158957d;
        Intrinsics.checkNotNullExpressionValue(purchaseErrorMessage, "purchaseErrorMessage");
        purchaseErrorMessage.setVisibility(0);
        f2 f2Var4 = this.f132745e;
        if (f2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            f2Var = f2Var4;
        }
        TextView textView = f2Var.f158957d;
        if (str == null) {
            str = ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0]));
        }
        textView.setText(str);
        w().f(new b(x()));
    }

    private final void z(g[] gVarArr) {
        t tVar = this.f132744d;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        f2 f2Var = this.f132745e;
        if (f2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var = null;
        }
        LinearLayout purchaseList = f2Var.f158958e;
        Intrinsics.checkNotNullExpressionValue(purchaseList, "purchaseList");
        purchaseList.setVisibility(0);
        f2 f2Var2 = this.f132745e;
        if (f2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var2 = null;
        }
        TextView purchaseErrorMessage = f2Var2.f158957d;
        Intrinsics.checkNotNullExpressionValue(purchaseErrorMessage, "purchaseErrorMessage");
        purchaseErrorMessage.setVisibility(8);
        if (gVarArr.length == 0) {
            y(null);
            return;
        }
        f2 f2Var3 = this.f132745e;
        if (f2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            f2Var3 = null;
        }
        f2Var3.f158958e.removeAllViews();
        for (final g gVar : gVarArr) {
            f2 f2Var4 = this.f132745e;
            if (f2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                f2Var4 = null;
            }
            LinearLayout linearLayout = f2Var4.f158958e;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            com.planner5d.library.activity.fragment.dialog.purchase.g gVar2 = new com.planner5d.library.activity.fragment.dialog.purchase.g(contextRequireContext, null, 0, 6, null);
            gVar2.x(gVar, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.recognitions.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PurchasePagePlanRecognitions.A(this.f132749a, gVar);
                }
            });
            linearLayout.addView(gVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.application.b.f142455c.a().G1(this);
        f2 f2VarC = f2.c(inflater);
        this.f132745e = f2VarC;
        ScrollView root = f2VarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C();
        B();
        E();
    }
}
