package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import com.planner5d.library.databinding.e2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
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
@SourceDebugExtension({"SMAP\nPurchasePageDesignGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePageDesignGenerator.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/PurchasePageDesignGenerator\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n22#2,7:100\n12#2,6:107\n28#2:113\n1#3:114\n*S KotlinDebug\n*F\n+ 1 PurchasePageDesignGenerator.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/PurchasePageDesignGenerator\n*L\n30#1:100,7\n31#1:107,6\n31#1:113\n*E\n"})
public final class PurchasePageDesignGenerator extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e2 f132531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f132532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f132533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f132534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f132535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f132536f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132537a;

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
            f132537a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, g.class, "update", "update()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((g) this.receiver).d0();
        }
    }

    static final class c<T> implements kotlinx.coroutines.flow.j {
        c() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(g.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            PurchasePageDesignGenerator.this.x().k(bVar.d());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 PurchasePageDesignGenerator.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/designgenerator/PurchasePageDesignGenerator\n*L\n1#1,28:1\n30#2:29\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            Fragment fragmentRequireParentFragment = PurchasePageDesignGenerator.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment.getViewModelStore();
        }
    }

    public PurchasePageDesignGenerator() {
        t3 t3Var = t3.f229751a;
        this.f132532b = new i2(j1.d(com.planner5d.library.activity.fragment.dialog.purchase.f0.class), new d(), new t3.b(this), null, 8, null);
        this.f132533c = new i2(j1.d(g.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132534d = com.planner5d.library.services.network.f.f224463a.f(this);
        this.f132536f = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PurchasePageDesignGenerator.w();
            }
        });
    }

    private final g A() {
        return (g) this.f132533c.getValue();
    }

    private final void B(String str) {
        timber.log.b.f381052a.d("Failed to get products. Error:" + str, new Object[0]);
        t tVar = this.f132535e;
        e2 e2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        e2 e2Var2 = this.f132531a;
        if (e2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var2 = null;
        }
        e2Var2.f158887d.setVisibility(8);
        e2 e2Var3 = this.f132531a;
        if (e2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var3 = null;
        }
        e2Var3.f158890g.setVisibility(0);
        e2 e2Var4 = this.f132531a;
        if (e2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e2Var = e2Var4;
        }
        e2Var.f158890g.setText(str != null ? str : ErrorMessageException.getError(getContext(), new ErrorMessageException(com.planner5d.library.f.s.f169490va, new String[0])));
        z().f(new b(A()));
        A().Y(str);
    }

    private final void C(fd.g[] gVarArr, String str) {
        timber.log.b.f381052a.a("Loaded " + gVarArr.length + " products.", new Object[0]);
        t tVar = this.f132535e;
        e2 e2Var = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloader");
            tVar = null;
        }
        tVar.a().b();
        if (gVarArr.length != 0) {
            e2 e2Var2 = this.f132531a;
            if (e2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e2Var2 = null;
            }
            e2Var2.f158887d.setVisibility(0);
            e2 e2Var3 = this.f132531a;
            if (e2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                e2Var = e2Var3;
            }
            e2Var.f158890g.setVisibility(8);
            A().Z(gVarArr, str);
            return;
        }
        e2 e2Var4 = this.f132531a;
        if (e2Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var4 = null;
        }
        e2Var4.f158887d.setVisibility(8);
        e2 e2Var5 = this.f132531a;
        if (e2Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var5 = null;
        }
        e2Var5.f158890g.setVisibility(0);
        e2 e2Var6 = this.f132531a;
        if (e2Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e2Var = e2Var6;
        }
        e2Var.f158890g.setText("Couldn't find products");
    }

    private final void D() {
        e2 e2Var = this.f132531a;
        if (e2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var = null;
        }
        t tVar = new t(e2Var.f158888e);
        this.f132535e = tVar;
        tVar.a().j(false).g(Integer.valueOf(androidx.core.content.d.g(requireContext(), R.color.transparent))).h(Integer.valueOf(androidx.core.content.d.g(requireContext(), com.planner5d.library.f.C1549f.f166418hh)));
    }

    private final void E(final String str) {
        e2 e2Var = this.f132531a;
        e2 e2Var2 = null;
        if (e2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2Var = null;
        }
        e2Var.f158887d.setAdapter(x());
        e2 e2Var3 = this.f132531a;
        if (e2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e2Var2 = e2Var3;
        }
        e2Var2.f158889f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchasePageDesignGenerator.F(this.f132575a, view);
            }
        });
        n1.a(this, A().W(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PurchasePageDesignGenerator.G(this.f132576a, str, (com.planner5d.library.activity.fragment.dialog.purchase.e) obj);
            }
        });
        l1.c(l1.f225303a, this, A().getUiState(), null, new c(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(PurchasePageDesignGenerator purchasePageDesignGenerator, View view) {
        fd.g gVarX = purchasePageDesignGenerator.A().X();
        if (gVarX != null) {
            com.planner5d.library.activity.fragment.dialog.purchase.f0 f0VarY = purchasePageDesignGenerator.y();
            s sVarRequireActivity = purchasePageDesignGenerator.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            f0VarY.n0(gVarX, sVarRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(PurchasePageDesignGenerator purchasePageDesignGenerator, String str, com.planner5d.library.activity.fragment.dialog.purchase.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = a.f132537a[it.b().ordinal()];
        if (i10 == 1) {
            t tVar = purchasePageDesignGenerator.f132535e;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloader");
                tVar = null;
                int i11 = 7 | 0;
            }
            tVar.a().a(com.planner5d.library.f.s.vn, true);
        } else if (i10 == 2) {
            purchasePageDesignGenerator.B(it.c());
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            purchasePageDesignGenerator.C(it.a(), str);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.b w() {
        return new com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.b x() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.b) this.f132536f.getValue();
    }

    private final com.planner5d.library.activity.fragment.dialog.purchase.f0 y() {
        return (com.planner5d.library.activity.fragment.dialog.purchase.f0) this.f132532b.getValue();
    }

    private final com.planner5d.library.services.network.b z() {
        return (com.planner5d.library.services.network.b) this.f132534d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        e2 e2VarC = e2.c(inflater);
        this.f132531a = e2VarC;
        if (e2VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e2VarC = null;
        }
        FrameLayout root = e2VarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        D();
        int iC = new com.planner5d.library.services.utility.j(getArguments()).c(r.designGeneratorRoomStylesSelected, 0);
        String quantityString = getResources().getQuantityString(com.planner5d.library.f.q.f168937d, iC, Integer.valueOf(iC));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        E(quantityString);
    }
}
