package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.t;
import java.util.ArrayList;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePagePremiumReview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePagePremiumReview.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumReview\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n22#2,7:168\n12#2,6:175\n28#2:181\n257#3,2:182\n257#3,2:184\n257#3,2:186\n257#3,2:188\n257#3,2:190\n257#3,2:192\n3829#4:194\n4344#4,2:195\n37#5,2:197\n1#6:199\n*S KotlinDebug\n*F\n+ 1 PurchasePagePremiumReview.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumReview\n*L\n44#1:168,7\n45#1:175,6\n45#1:181\n117#1:182,2\n118#1:184,2\n124#1:186,2\n129#1:188,2\n130#1:190,2\n138#1:192,2\n142#1:194\n142#1:195,2\n143#1:197,2\n*E\n"})
public class PurchasePagePremiumReview extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f132649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f132651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f132652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.planner5d.library.activity.fragment.dialog.purchase.premium.b f132653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c f132654f;

    @ij.a
    public p0 formatter;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private View f132655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private View f132656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private View f132657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private View f132658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private RecyclerView f132659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private TextView f132660l;

    @ij.a
    public t1 logRecordManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final j2.c f132661m;

    @ij.a
    public c2 networkStateUtility;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132662a;

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
            f132662a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, p.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((p) this.receiver).W();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePagePremiumReview.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchasePagePremiumReview\n*L\n1#1,28:1\n44#2:29\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePagePremiumReview.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePagePremiumReview() {
        t3 t3Var = t3.f229751a;
        this.f132649a = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new c(), new t3.b(this), null, 8, null);
        this.f132650b = new i2(j1.d(p.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132651c = com.planner5d.library.services.network.f.f224463a.f(this);
        this.f132652d = new t();
        this.f132654f = com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Standard;
        this.f132661m = t3Var.b(this);
    }

    private final com.planner5d.library.services.network.b A() {
        return (com.planner5d.library.services.network.b) this.f132651c.getValue();
    }

    private final p B() {
        return (p) this.f132650b.getValue();
    }

    private final boolean D(fd.g[] gVarArr) {
        for (fd.g gVar : gVarArr) {
            if (gVar.f275144a.o() && gVar.f275146c && gVar.f275144a.r()) {
                enableTrial(true);
                return true;
            }
        }
        enableTrial(false);
        return false;
    }

    private final void G(String str) {
        this.f132652d.a().b();
        RecyclerView recyclerView = this.f132659k;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TextView textView = this.f132660l;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f132660l;
        if (textView2 != null) {
            if (str == null) {
                str = ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0]));
            }
            textView2.setText(str);
        }
        if (!getNetworkStateUtility().d(getContext())) {
            A().f(new b(B()));
        }
        View view = this.f132655g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final void H(fd.g[] gVarArr) {
        this.f132652d.a().b();
        RecyclerView recyclerView = this.f132659k;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        TextView textView = this.f132660l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (gVarArr.length == 0) {
            G(null);
            return;
        }
        L(gVarArr);
        RecyclerView recyclerView2 = this.f132659k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(y());
        }
        View view = this.f132655g;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(PurchasePagePremiumReview purchasePagePremiumReview, View view) {
        fd.g gVarJ = purchasePagePremiumReview.y().j();
        if (gVarJ != null) {
            com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarZ = purchasePagePremiumReview.z();
            s sVarRequireActivity = purchasePagePremiumReview.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarZ.n0(gVarJ, sVarRequireActivity);
        }
    }

    private final void J(String str) {
        com.planner5d.library.legal.application.e.f180321b.a().j().a(getActivity(), str);
    }

    private final void L(fd.g[] gVarArr) {
        String strC;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (fd.g gVar : gVarArr) {
            fd.i iVarK = gVar.f275144a.k();
            if (((iVarK == null || (strC = iVarK.c()) == null) ? false : StringsKt.V2(strC, com.planner5d.library.services.r.commercial.f224891a, false, 2, null)) == E()) {
                arrayList.add(gVar);
            }
        }
        fd.g[] gVarArr2 = (fd.g[]) CollectionsKt.take(arrayList, 3).toArray(new fd.g[0]);
        com.planner5d.library.activity.fragment.dialog.purchase.premium.b bVarY = y();
        if (D(gVarArr2) && F()) {
            z10 = true;
        }
        bVarY.p(gVarArr2, z10);
    }

    private final void M() {
        this.f132652d.b(this.f132656h);
        this.f132652d.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
        n1.a(this, B().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePagePremiumReview.N(this.f132696a, (com.planner5d.library.activity.fragment.dialog.purchase.e) obj);
            }
        });
        View view = this.f132657i;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PurchasePagePremiumReview.O(this.f132697a, view2);
                }
            });
        }
        View view2 = this.f132658j;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PurchasePagePremiumReview.P(this.f132698a, view3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(PurchasePagePremiumReview purchasePagePremiumReview, com.planner5d.library.activity.fragment.dialog.purchase.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f132662a[it.b().ordinal()];
        if (i10 == 1) {
            purchasePagePremiumReview.f132652d.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePagePremiumReview.G(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePagePremiumReview.H(it.a());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(PurchasePagePremiumReview purchasePagePremiumReview, View view) {
        purchasePagePremiumReview.J(com.planner5d.library.api.f.a().f142276n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(PurchasePagePremiumReview purchasePagePremiumReview, View view) {
        purchasePagePremiumReview.J(com.planner5d.library.api.f.a().f142277o);
    }

    private final void x(View view) {
        this.f132655g = view.findViewById(com.planner5d.library.f.j.Ko);
        this.f132656h = view.findViewById(com.planner5d.library.f.j.Ro);
        this.f132657i = view.findViewById(com.planner5d.library.f.j.bp);
        this.f132658j = view.findViewById(com.planner5d.library.f.j.Po);
        this.f132659k = (RecyclerView) view.findViewById(com.planner5d.library.f.j.Oo);
        this.f132660l = (TextView) view.findViewById(com.planner5d.library.f.j.No);
    }

    @NotNull
    protected com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c C() {
        return this.f132654f;
    }

    protected boolean E() {
        return false;
    }

    protected boolean F() {
        return false;
    }

    protected final void K(@NotNull com.planner5d.library.activity.fragment.dialog.purchase.premium.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f132653e = bVar;
    }

    protected final void Q() {
        com.planner5d.library.activity.fragment.dialog.purchase.e eVarF = B().V().f();
        if ((eVarF != null ? eVarF.b() : null) == com.planner5d.library.activity.fragment.dialog.purchase.a.Success) {
            L(eVarF.a());
        }
    }

    public void enableTrial(boolean z10) {
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.z
    @NotNull
    public j2.c getDefaultViewModelProviderFactory() {
        return this.f132661m;
    }

    @NotNull
    public final p0 getFormatter$P5D_Library_release() {
        p0 p0Var = this.formatter;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    @NotNull
    public final t1 getLogRecordManager() {
        t1 t1Var = this.logRecordManager;
        if (t1Var != null) {
            return t1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logRecordManager");
        return null;
    }

    @NotNull
    public final c2 getNetworkStateUtility() {
        c2 c2Var = this.networkStateUtility;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkStateUtility");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.D2, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        x(view);
        com.planner5d.library.application.b.f142455c.a().a1(this);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        K(new com.planner5d.library.activity.fragment.dialog.purchase.premium.b(context, getFormatter$P5D_Library_release(), getLogRecordManager(), C()));
        View view2 = this.f132655g;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.premium.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PurchasePagePremiumReview.I(this.f132699a, view3);
                }
            });
        }
        M();
    }

    public final void setFormatter$P5D_Library_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setLogRecordManager(@NotNull t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<set-?>");
        this.logRecordManager = t1Var;
    }

    public final void setNetworkStateUtility(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.networkStateUtility = c2Var;
    }

    @NotNull
    protected final com.planner5d.library.activity.fragment.dialog.purchase.premium.b y() {
        com.planner5d.library.activity.fragment.dialog.purchase.premium.b bVar = this.f132653e;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    protected final com.planner5d.library.activity.fragment.dialog.purchase.f0 z() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132649a.getValue();
    }
}
