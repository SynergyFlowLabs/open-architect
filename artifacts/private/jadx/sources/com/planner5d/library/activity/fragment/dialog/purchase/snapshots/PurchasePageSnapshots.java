package com.planner5d.library.activity.fragment.dialog.purchase.snapshots;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import com.planner5d.library.databinding.n2;
import com.planner5d.library.databinding.q7;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.t;
import fd.n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePageSnapshots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePageSnapshots.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/snapshots/PurchasePageSnapshots\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n22#2,7:152\n12#2,6:159\n28#2:165\n257#3,2:166\n257#3,2:168\n257#3,2:170\n257#3,2:172\n13409#4,2:174\n1863#5,2:176\n*S KotlinDebug\n*F\n+ 1 PurchasePageSnapshots.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/snapshots/PurchasePageSnapshots\n*L\n31#1:152,7\n32#1:159,6\n32#1:165\n68#1:166,2\n69#1:168,2\n77#1:170,2\n78#1:172,2\n84#1:174,2\n138#1:176,2\n*E\n"})
public final class PurchasePageSnapshots extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f132765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f132767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f132768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n2 f132769e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132770a;

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
            f132770a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, h.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((h) this.receiver).d0();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePageSnapshots.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/snapshots/PurchasePageSnapshots\n*L\n1#1,28:1\n31#2:29\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePageSnapshots.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePageSnapshots() {
        t3 t3Var = t3.f229751a;
        this.f132765a = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new c(), new t3.b(this), null, 8, null);
        this.f132766b = new i2(j1.d(h.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132767c = com.planner5d.library.services.network.f.f224463a.f(this);
    }

    private final h A() {
        return (h) this.f132766b.getValue();
    }

    private final void B(String str) {
        t tVar = this.f132768d;
        n2 n2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        n2 n2Var2 = this.f132769e;
        if (n2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var2 = null;
        }
        LinearLayout purchaseRendersList = n2Var2.f159390e;
        Intrinsics.checkNotNullExpressionValue(purchaseRendersList, "purchaseRendersList");
        purchaseRendersList.setVisibility(8);
        n2 n2Var3 = this.f132769e;
        if (n2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var3 = null;
        }
        TextView purchaseRendersErrorMessage = n2Var3.f159388c;
        Intrinsics.checkNotNullExpressionValue(purchaseRendersErrorMessage, "purchaseRendersErrorMessage");
        purchaseRendersErrorMessage.setVisibility(0);
        n2 n2Var4 = this.f132769e;
        if (n2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            n2Var = n2Var4;
        }
        TextView textView = n2Var.f159388c;
        if (str == null) {
            str = ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0]));
        }
        textView.setText(str);
        z().f(new b(A()));
    }

    private final void C(fd.g[] gVarArr) {
        t tVar = this.f132768d;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        n2 n2Var = this.f132769e;
        if (n2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var = null;
        }
        LinearLayout purchaseRendersList = n2Var.f159390e;
        Intrinsics.checkNotNullExpressionValue(purchaseRendersList, "purchaseRendersList");
        purchaseRendersList.setVisibility(0);
        n2 n2Var2 = this.f132769e;
        if (n2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var2 = null;
        }
        TextView purchaseRendersErrorMessage = n2Var2.f159388c;
        Intrinsics.checkNotNullExpressionValue(purchaseRendersErrorMessage, "purchaseRendersErrorMessage");
        purchaseRendersErrorMessage.setVisibility(8);
        if (gVarArr.length == 0) {
            B(null);
            return;
        }
        n2 n2Var3 = this.f132769e;
        if (n2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var3 = null;
        }
        n2Var3.f159390e.removeAllViews();
        for (final fd.g gVar : gVarArr) {
            n2 n2Var4 = this.f132769e;
            if (n2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                n2Var4 = null;
            }
            LinearLayout linearLayout = n2Var4.f159390e;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            com.planner5d.library.activity.fragment.dialog.purchase.g gVar2 = new com.planner5d.library.activity.fragment.dialog.purchase.g(contextRequireContext, null, 0, 6, null);
            gVar2.x(gVar, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PurchasePageSnapshots.D(this.f132776a, gVar);
                }
            });
            linearLayout.addView(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(PurchasePageSnapshots purchasePageSnapshots, fd.g gVar) {
        com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarY = purchasePageSnapshots.y();
        s sVarRequireActivity = purchasePageSnapshots.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        f0VarY.n0(gVar, sVarRequireActivity);
        return Unit.f312394a;
    }

    private final void E() {
        n2 n2Var = this.f132769e;
        n2 n2Var2 = null;
        if (n2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var = null;
        }
        n2Var.f159389d.setSizesChangedCallback(new Function2() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PurchasePageSnapshots.F(this.f132772a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        n1.a(this, A().a0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePageSnapshots.G(this.f132773a, (Pair) obj);
            }
        });
        n1.a(this, A().Y(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePageSnapshots.H(this.f132774a, ((Boolean) obj).booleanValue());
            }
        });
        n2 n2Var3 = this.f132769e;
        if (n2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            n2Var2 = n2Var3;
        }
        n2Var2.f159389d.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(PurchasePageSnapshots purchasePageSnapshots, int i10, int i11) {
        purchasePageSnapshots.A().b0(new Point(i10, i11));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(PurchasePageSnapshots purchasePageSnapshots, Pair pair) {
        n2 n2Var = null;
        if (pair != null) {
            n2 n2Var2 = purchasePageSnapshots.f132769e;
            if (n2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                n2Var = n2Var2;
            }
            n2Var.f159389d.k((Bitmap) pair.getFirst(), (Bitmap) pair.getSecond());
        } else {
            n2 n2Var3 = purchasePageSnapshots.f132769e;
            if (n2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                n2Var = n2Var3;
            }
            n2Var.f159389d.j();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(PurchasePageSnapshots purchasePageSnapshots, boolean z10) {
        n2 n2Var = purchasePageSnapshots.f132769e;
        if (n2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var = null;
        }
        n2Var.f159389d.setLoading(z10);
        return Unit.f312394a;
    }

    private final void I() {
        n2 n2Var = this.f132769e;
        if (n2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2Var = null;
        }
        t tVar = new t(n2Var.f159391f);
        this.f132768d = tVar;
        tVar.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
        n1.a(this, A().Z(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.snapshots.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePageSnapshots.J(this.f132775a, (com.planner5d.library.activity.fragment.dialog.purchase.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(PurchasePageSnapshots purchasePageSnapshots, com.planner5d.library.activity.fragment.dialog.purchase.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f132770a[it.b().ordinal()];
        if (i10 == 1) {
            t tVar = purchasePageSnapshots.f132768d;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                tVar = null;
            }
            tVar.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePageSnapshots.B(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePageSnapshots.C(it.a());
        }
        return Unit.f312394a;
    }

    private final void K() {
        for (n nVar : CollectionsKt.listOf((Object[]) new n[]{new n(com.planner5d.library.f.h.f167743qa, com.planner5d.library.f.s.kx, com.planner5d.library.f.s.fx), new n(com.planner5d.library.f.h.f167819ua, com.planner5d.library.f.s.nx, com.planner5d.library.f.s.ix), new n(com.planner5d.library.f.h.f167800ta, com.planner5d.library.f.s.mx, com.planner5d.library.f.s.hx), new n(com.planner5d.library.f.h.f167838va, com.planner5d.library.f.s.ox, com.planner5d.library.f.s.jx), new n(com.planner5d.library.f.h.f167762ra, com.planner5d.library.f.s.lx, com.planner5d.library.f.s.gx)})) {
            n2 n2Var = null;
            View viewInflate = View.inflate(getContext(), com.planner5d.library.f.m.U8, null);
            q7 q7VarA = q7.a(viewInflate);
            q7VarA.f159579c.setImageResource(nVar.g());
            q7VarA.f159580d.setText(viewInflate.getContext().getText(nVar.h()));
            q7VarA.f159578b.setText(viewInflate.getContext().getText(nVar.f()));
            n2 n2Var2 = this.f132769e;
            if (n2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                n2Var = n2Var2;
            }
            n2Var.f159387b.addView(viewInflate);
        }
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.f0 y() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132765a.getValue();
    }

    private final com.planner5d.library.services.network.b z() {
        return (com.planner5d.library.services.network.b) this.f132767c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n2 n2VarA = n2.a(inflater.inflate(com.planner5d.library.f.m.G2, viewGroup, false));
        this.f132769e = n2VarA;
        if (n2VarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n2VarA = null;
        }
        NestedScrollView root = n2VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        I();
        E();
        K();
    }
}
