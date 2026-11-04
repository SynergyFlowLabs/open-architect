package com.planner5d.library.activity.fragment.dialog.purchase.textures;

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
import com.planner5d.library.activity.fragment.dialog.purchase.e;
import com.planner5d.library.databinding.o2;
import com.planner5d.library.databinding.q7;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.network.f;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchasePageTextures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePageTextures.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/textures/PurchasePageTextures\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n22#2,7:128\n12#2,6:135\n28#2:141\n13409#3,2:142\n1863#4,2:144\n*S KotlinDebug\n*F\n+ 1 PurchasePageTextures.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/textures/PurchasePageTextures\n*L\n28#1:128,7\n29#1:135,6\n29#1:141\n88#1:142,2\n112#1:144,2\n*E\n"})
public final class PurchasePageTextures extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f132800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f132802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f132803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o2 f132804e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132805a;

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
            f132805a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, com.planner5d.library.activity.fragment.dialog.purchase.textures.c.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((com.planner5d.library.activity.fragment.dialog.purchase.textures.c) this.receiver).W();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePageTextures.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/textures/PurchasePageTextures\n*L\n1#1,28:1\n28#2:29\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePageTextures.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePageTextures() {
        t3 t3Var = t3.f229751a;
        this.f132800a = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new c(), new t3.b(this), null, 8, null);
        this.f132801b = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.textures.c.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132802c = f.f224463a.f(this);
    }

    private final void A(g[] gVarArr) {
        if (gVarArr.length == 0) {
            y(null);
            return;
        }
        o2 o2Var = this.f132804e;
        if (o2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2Var = null;
        }
        o2Var.f159434f.removeAllViews();
        for (final g gVar : gVarArr) {
            o2 o2Var2 = this.f132804e;
            if (o2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o2Var2 = null;
            }
            LinearLayout linearLayout = o2Var2.f159434f;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            com.planner5d.library.activity.fragment.dialog.purchase.g gVar2 = new com.planner5d.library.activity.fragment.dialog.purchase.g(contextRequireContext, null, 0, 6, null);
            gVar2.x(gVar, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.textures.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PurchasePageTextures.B(this.f132808a, gVar);
                }
            });
            linearLayout.addView(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(PurchasePageTextures purchasePageTextures, g gVar) {
        com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarV = purchasePageTextures.v();
        s sVarRequireActivity = purchasePageTextures.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        f0VarV.n0(gVar, sVarRequireActivity);
        return Unit.f312394a;
    }

    private final void C() {
        o2 o2Var = this.f132804e;
        if (o2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2Var = null;
        }
        t tVar = new t(o2Var.f159435g);
        this.f132803d = tVar;
        tVar.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
    }

    private final void D() {
        n1.a(this, x().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.textures.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePageTextures.E(this.f132807a, (e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(PurchasePageTextures purchasePageTextures, e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f132805a[it.b().ordinal()];
        if (i10 == 1) {
            t tVar = purchasePageTextures.f132803d;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                tVar = null;
            }
            tVar.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePageTextures.y(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePageTextures.z(it.a());
        }
        return Unit.f312394a;
    }

    private final void F() {
        for (n nVar : CollectionsKt.listOf((Object[]) new n[]{new n(com.planner5d.library.f.h.f167819ua, com.planner5d.library.f.s.xx, com.planner5d.library.f.s.vx), new n(com.planner5d.library.f.h.f167781sa, com.planner5d.library.f.s.wx, com.planner5d.library.f.s.ux)})) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i10 = com.planner5d.library.f.m.U8;
            o2 o2Var = this.f132804e;
            o2 o2Var2 = null;
            if (o2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                o2Var = null;
            }
            View viewInflate = layoutInflaterFrom.inflate(i10, (ViewGroup) o2Var.f159431c, false);
            q7 q7VarA = q7.a(viewInflate);
            q7VarA.f159579c.setImageResource(nVar.g());
            q7VarA.f159580d.setText(viewInflate.getContext().getText(nVar.h()));
            q7VarA.f159578b.setText(viewInflate.getContext().getText(nVar.f()));
            int dimensionPixelSize = viewInflate.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Bi);
            viewInflate.setPadding(dimensionPixelSize, viewInflate.getPaddingTop(), dimensionPixelSize, viewInflate.getPaddingBottom());
            o2 o2Var3 = this.f132804e;
            if (o2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                o2Var2 = o2Var3;
            }
            o2Var2.f159431c.addView(viewInflate);
        }
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.f0 v() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132800a.getValue();
    }

    private final com.planner5d.library.services.network.b w() {
        return (com.planner5d.library.services.network.b) this.f132802c.getValue();
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.textures.c x() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.textures.c) this.f132801b.getValue();
    }

    private final void y(String str) {
        t tVar = this.f132803d;
        o2 o2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        o2 o2Var2 = this.f132804e;
        if (o2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2Var2 = null;
        }
        o2Var2.f159434f.setVisibility(8);
        o2 o2Var3 = this.f132804e;
        if (o2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2Var3 = null;
        }
        o2Var3.f159432d.setVisibility(0);
        o2 o2Var4 = this.f132804e;
        if (o2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o2Var = o2Var4;
        }
        TextView textView = o2Var.f159432d;
        if (str == null) {
            str = ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0]));
        }
        textView.setText(str);
        w().f(new b(x()));
    }

    private final void z(g[] gVarArr) {
        t tVar = this.f132803d;
        o2 o2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        o2 o2Var2 = this.f132804e;
        if (o2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2Var2 = null;
        }
        o2Var2.f159434f.setVisibility(0);
        o2 o2Var3 = this.f132804e;
        if (o2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            o2Var = o2Var3;
        }
        o2Var.f159432d.setVisibility(8);
        A(gVarArr);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o2 o2VarA = o2.a(inflater.inflate(com.planner5d.library.f.m.H2, viewGroup, false));
        this.f132804e = o2VarA;
        if (o2VarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o2VarA = null;
        }
        ScrollView root = o2VarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C();
        D();
        F();
    }
}
