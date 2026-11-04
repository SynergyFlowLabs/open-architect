package com.planner5d.library.activity.fragment.profile;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import androidx.navigation.c2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.activity.fragment.dialog.purchase.premiumold.PurchasePagePremiumBenefits;
import com.planner5d.library.activity.fragment.dialog.purchase.recognitions.PurchasePagePlanRecognitions;
import com.planner5d.library.activity.fragment.dialog.purchase.snapshots.PurchasePageSnapshots;
import com.planner5d.library.activity.fragment.dialog.purchase.textures.PurchasePageTextures;
import com.planner5d.library.databinding.k1;
import com.planner5d.library.databinding.p1;
import com.planner5d.library.model.manager.statistics.events.n2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.textview.ButtonTextView;
import com.planner5d.library.widget.textview.TextViewWithLine;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileFragment.kt\ncom/planner5d/library/activity/fragment/profile/ProfileFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,283:1\n12#2,6:284\n28#2:290\n257#3,2:291\n257#3,2:293\n257#3,2:295\n257#3,2:297\n257#3,2:299\n257#3,2:301\n257#3,2:303\n257#3,2:305\n257#3,2:307\n257#3,2:309\n299#3,2:311\n257#3,2:313\n257#3,2:315\n*S KotlinDebug\n*F\n+ 1 ProfileFragment.kt\ncom/planner5d/library/activity/fragment/profile/ProfileFragment\n*L\n49#1:284,6\n49#1:290\n74#1:291,2\n100#1:293,2\n107#1:295,2\n114#1:297,2\n191#1:299,2\n192#1:301,2\n266#1:303,2\n268#1:305,2\n269#1:307,2\n270#1:309,2\n271#1:311,2\n160#1:313,2\n161#1:315,2\n*E\n"})
public final class ProfileFragment extends Fragment implements DialogInterface.OnDismissListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k1 f134500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f134501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f134502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f134503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f134504e;

    @ij.a
    public com.planner5d.library.activity.fragment.x navigator;

    @ij.a
    public ia.b paywallStrategy;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f134506i;

        a(float f10) {
            this.f134506i = f10;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            dispose();
            k1 k1Var = ProfileFragment.this.f134500a;
            if (k1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                k1Var = null;
            }
            k1Var.f159217g.f159482d.a(com.planner5d.library.f.h.f167667ma, this.f134506i);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            k1 k1Var = ProfileFragment.this.f134500a;
            if (k1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                k1Var = null;
            }
            k1Var.f159217g.f159482d.b(bitmap, this.f134506i);
        }
    }

    static final class b<T> implements kotlinx.coroutines.flow.j {
        b() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(id.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            ProfileFragment.this.j0(aVar);
            return Unit.f312394a;
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134508a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134508a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f134508a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134508a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class d extends w {
        d() {
        }

        @Override // com.planner5d.library.activity.fragment.profile.w
        public boolean f() {
            x.c cVarF = ProfileFragment.this.K().c0().f();
            return cVarF != null && cVarF.f();
        }

        @Override // com.planner5d.library.activity.fragment.profile.w
        public void g() {
            ProfileFragment.this.T();
        }
    }

    public static final class e implements u.b {
        e() {
        }

        @Override // com.planner5d.library.activity.fragment.profile.u.b
        public void a(ed.b item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ed.d dVarD = item.d();
            if (dVarD instanceof ed.d.a) {
                ProfileFragment.this.M(((ed.d.a) dVarD).h());
            } else if (dVarD instanceof ed.d.b) {
                androidx.navigation.fragment.f.a(ProfileFragment.this).m0(((ed.d.b) dVarD).h());
            } else if (dVarD != null) {
                throw new k0();
            }
        }
    }

    /* synthetic */ class f extends g0 implements Function1<List<? extends ed.c>, Unit> {
        f(Object obj) {
            super(1, obj, u.class, "setList", "setList(Ljava/util/List;)V", 0);
        }

        public final void X(List<? extends ed.c> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((u) this.receiver).h(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ed.c> list) {
            X(list);
            return Unit.f312394a;
        }
    }

    public ProfileFragment() {
        t3 t3Var = t3.f229751a;
        this.f134501b = new i2(j1.d(x.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134502c = new com.planner5d.library.widget.preloader.t();
        com.planner5d.library.application.b.f142455c.a().w2(this);
    }

    private final void H(ButtonTextView buttonTextView) {
        if (K().j0()) {
            buttonTextView.setVisibility(0);
            buttonTextView.setBackground(androidx.core.content.res.i.g(buttonTextView.getResources(), com.planner5d.library.f.h.f167890y5, null));
            buttonTextView.setText(getString(com.planner5d.library.f.s.AG));
            buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileFragment.I(this.f134705a, view);
                }
            });
            return;
        }
        if (!K().k0()) {
            buttonTextView.setVisibility(8);
            return;
        }
        buttonTextView.setVisibility(0);
        buttonTextView.setBackground(androidx.core.content.res.i.g(buttonTextView.getResources(), com.planner5d.library.f.h.C5, null));
        buttonTextView.setText(getString(com.planner5d.library.f.s.Su));
        buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.J(this.f134706a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(ProfileFragment profileFragment, View view) {
        profileFragment.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ProfileFragment profileFragment, View view) {
        profileFragment.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x K() {
        return (x) this.f134501b.getValue();
    }

    private final void L(id.a aVar) {
        float dimension = getResources().getDimension(com.planner5d.library.f.g.f167181oi);
        x xVarK = K();
        int i10 = (int) dimension;
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f134503d;
        k1 k1Var = null;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(new a(dimension));
        Intrinsics.checkNotNullExpressionValue(aVarC, "register(...)");
        xVarK.h0(i10, aVarC, aVar);
        Integer numB0 = K().b0();
        if (numB0 != null) {
            int iIntValue = numB0.intValue();
            k1 k1Var2 = this.f134500a;
            if (k1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                k1Var = k1Var2;
            }
            k1Var.f159216f.scrollTo(0, iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Class<?> cls) {
        if (!Intrinsics.areEqual(cls, PurchasePagePremiumReview.class) && !Intrinsics.areEqual(cls, PurchasePagePremiumBenefits.class)) {
            if (Intrinsics.areEqual(cls, PurchasePageSnapshots.class)) {
                V(com.planner5d.library.model.manager.config.purchaseplacement.b.a.snapshots);
                return;
            }
            if (Intrinsics.areEqual(cls, PurchasePageTextures.class)) {
                V(com.planner5d.library.model.manager.config.purchaseplacement.b.a.textures);
                return;
            }
            if (Intrinsics.areEqual(cls, PurchasePagePlanRecognitions.class)) {
                V(com.planner5d.library.model.manager.config.purchaseplacement.b.a.plan_recognitions);
                return;
            }
            if (!Intrinsics.areEqual(cls, la.b.class)) {
                i0(cls);
                return;
            }
            x xVarK = K();
            androidx.fragment.app.s sVarRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            xVarK.q0(sVarRequireActivity);
            return;
        }
        W();
    }

    private final void N() {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarB = K().p0() ? q.l().b(Boolean.TRUE) : q.k();
        Intrinsics.checkNotNull(c2VarB);
        kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.activity.fragment.profile.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProfileFragment.O((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(ProfileFragment profileFragment, View view) {
        n2.f217166b.l0();
        profileFragment.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(ProfileFragment profileFragment, View view) {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(profileFragment);
        c2 c2VarM = q.m();
        Intrinsics.checkNotNullExpressionValue(c2VarM, "toSignUpOptions(...)");
        kVar.d(w0VarA, c2VarM, new Function2() { // from class: com.planner5d.library.activity.fragment.profile.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProfileFragment.R((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(ProfileFragment profileFragment, View view) {
        profileFragment.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarF = q.f();
        Intrinsics.checkNotNullExpressionValue(c2VarF, "toProfileEdit(...)");
        kVar.d(w0VarA, c2VarF, new Function2() { // from class: com.planner5d.library.activity.fragment.profile.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProfileFragment.U((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        n2.f217166b.open();
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    private final void V(com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar) {
        ia.b paywallStrategy$P5D_Library_release = getPaywallStrategy$P5D_Library_release();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        paywallStrategy$P5D_Library_release.c(new com.planner5d.library.activity.fragment.dialog.r(childFragmentManager), aVar, y3.c.profile, null);
    }

    private final void W() {
        if (!K().o0()) {
            V(com.planner5d.library.model.manager.config.purchaseplacement.b.a.profile);
            return;
        }
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        c2 c2VarB = q.b();
        Intrinsics.checkNotNullExpressionValue(c2VarB, "toComparePlans(...)");
        kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.activity.fragment.profile.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProfileFragment.X((androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    private final void Y(boolean z10) {
        k1 k1Var = this.f134500a;
        k1 k1Var2 = null;
        if (k1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1Var = null;
        }
        ConstraintLayout profileAuthenticationLayout = k1Var.f159212b.f159170e;
        Intrinsics.checkNotNullExpressionValue(profileAuthenticationLayout, "profileAuthenticationLayout");
        profileAuthenticationLayout.setVisibility(!z10 ? 0 : 8);
        k1 k1Var3 = this.f134500a;
        if (k1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            k1Var2 = k1Var3;
        }
        TextView profileChangeUserButton = k1Var2.f159213c;
        Intrinsics.checkNotNullExpressionValue(profileChangeUserButton, "profileChangeUserButton");
        profileChangeUserButton.setVisibility(z10 ? 0 : 8);
    }

    private final void Z() {
        com.planner5d.library.services.utility.y3.f229862a.l(this).addMenuProvider(new d(), getViewLifecycleOwner());
    }

    private final void a0() {
        com.planner5d.library.widget.preloader.t tVar = this.f134502c;
        k1 k1Var = this.f134500a;
        if (k1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1Var = null;
        }
        tVar.b(k1Var.f159214d);
        androidx.lifecycle.c2.f(androidx.lifecycle.c2.h(K().c0(), new Function1() { // from class: com.planner5d.library.activity.fragment.profile.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.b0((x.c) obj);
            }
        })).k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.c0(this.f134704a, (x.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x.b b0(x.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(ProfileFragment profileFragment, x.b bVar) {
        if (bVar.g()) {
            k1 k1Var = profileFragment.f134500a;
            k1 k1Var2 = null;
            if (k1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                k1Var = null;
            }
            ConstraintLayout profileAuthenticationLayout = k1Var.f159212b.f159170e;
            Intrinsics.checkNotNullExpressionValue(profileAuthenticationLayout, "profileAuthenticationLayout");
            profileAuthenticationLayout.setVisibility(8);
            k1 k1Var3 = profileFragment.f134500a;
            if (k1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                k1Var2 = k1Var3;
            }
            TextView profileChangeUserButton = k1Var2.f159213c;
            Intrinsics.checkNotNullExpressionValue(profileChangeUserButton, "profileChangeUserButton");
            profileChangeUserButton.setVisibility(8);
        } else {
            x.c cVarF = profileFragment.K().c0().f();
            boolean z10 = false;
            if (cVarF != null && cVarF.f()) {
                z10 = true;
            }
            profileFragment.Y(z10);
        }
        h0 h0VarA = profileFragment.f134502c.a();
        if (bVar.e()) {
            h0VarA.p(profileFragment.getString(com.planner5d.library.f.s.gF), true);
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    private final void d0() {
        androidx.lifecycle.c2.f(androidx.lifecycle.c2.h(K().c0(), new Function1() { // from class: com.planner5d.library.activity.fragment.profile.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ProfileFragment.e0((x.c) obj));
            }
        })).k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.f0(this.f134707a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(x.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.h().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(ProfileFragment profileFragment, Boolean bool) {
        if (bool.booleanValue()) {
            com.planner5d.library.services.utility.y3.f229862a.l(profileFragment).invalidateMenu();
        }
        return Unit.f312394a;
    }

    private final void g0() {
        this.f134504e = new u(new e());
        k1 k1Var = this.f134500a;
        u uVar = null;
        if (k1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1Var = null;
        }
        RecyclerView recyclerView = k1Var.f159215e;
        u uVar2 = this.f134504e;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
            uVar2 = null;
        }
        recyclerView.setAdapter(uVar2);
        k1 k1Var2 = this.f134500a;
        if (k1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1Var2 = null;
        }
        k1Var2.f159215e.setNestedScrollingEnabled(false);
        androidx.lifecycle.w0 w0VarF = androidx.lifecycle.c2.f(androidx.lifecycle.c2.h(K().c0(), new Function1() { // from class: com.planner5d.library.activity.fragment.profile.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileFragment.h0((x.c) obj);
            }
        }));
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        u uVar3 = this.f134504e;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuAdapter");
        } else {
            uVar = uVar3;
        }
        w0VarF.k(viewLifecycleOwner, new c(new f(uVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h0(x.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.g();
    }

    private final void i0(Class<?> cls) {
        if (FragmentController.class.isAssignableFrom(cls)) {
            com.planner5d.library.activity.fragment.x navigator$P5D_Library_release = getNavigator$P5D_Library_release();
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out com.planner5d.library.activity.fragment.FragmentController>");
            navigator$P5D_Library_release.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) cls, (Bundle) null), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(id.a aVar) {
        String str;
        L(aVar);
        boolean z10 = (aVar == null || K().n0()) ? false : true;
        k1 k1Var = this.f134500a;
        if (k1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1Var = null;
            int i10 = 7 << 0;
        }
        TextView textView = k1Var.f159217g.f159483e;
        if (aVar == null || (str = aVar.f287076b) == null) {
            str = "";
        }
        textView.setText(str);
        TextView proBadge = k1Var.f159217g.f159480b;
        Intrinsics.checkNotNullExpressionValue(proBadge, "proBadge");
        proBadge.setVisibility(K().l0() ? 0 : 8);
        ButtonTextView profileUpgradeToPremiumButton = k1Var.f159217g.f159484f;
        Intrinsics.checkNotNullExpressionValue(profileUpgradeToPremiumButton, "profileUpgradeToPremiumButton");
        H(profileUpgradeToPremiumButton);
        ConstraintLayout root = k1Var.f159217g.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(z10 ? 0 : 8);
        ConstraintLayout profileAuthenticationFinish = k1Var.f159212b.f159167b;
        Intrinsics.checkNotNullExpressionValue(profileAuthenticationFinish, "profileAuthenticationFinish");
        profileAuthenticationFinish.setVisibility(z10 ? 0 : 8);
        TextViewWithLine profileAuthenticationOr = k1Var.f159212b.f159172g;
        Intrinsics.checkNotNullExpressionValue(profileAuthenticationOr, "profileAuthenticationOr");
        profileAuthenticationOr.setVisibility(z10 ? 0 : 8);
        TextView profileAuthenticationLoginButton = k1Var.f159212b.f159171f;
        Intrinsics.checkNotNullExpressionValue(profileAuthenticationLoginButton, "profileAuthenticationLoginButton");
        profileAuthenticationLoginButton.setVisibility(K().n0() ? 8 : 0);
        K().s0();
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.x getNavigator$P5D_Library_release() {
        com.planner5d.library.activity.fragment.x xVar = this.navigator;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
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

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f134503d = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        k1 k1VarC = k1.c(inflater);
        this.f134500a = k1VarC;
        if (k1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k1VarC = null;
        }
        Z();
        a0();
        p1 p1Var = k1VarC.f159217g;
        p1Var.f159483e.setText(K().i0());
        TextView profileEmail = p1Var.f159481c;
        Intrinsics.checkNotNullExpressionValue(profileEmail, "profileEmail");
        profileEmail.setVisibility(K().f0().length() > 0 ? 0 : 8);
        p1Var.f159481c.setText(K().f0());
        g0();
        d0();
        k1VarC.f159213c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.P(this.f134557a, view);
            }
        });
        com.planner5d.library.databinding.j1 j1Var = k1VarC.f159212b;
        j1Var.f159168c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.Q(this.f134558a, view);
            }
        });
        j1Var.f159171f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.S(this.f134703a, view);
            }
        });
        l1.c(l1.f225303a, this, K().g0(), null, new b(), 2, null);
        FrameLayout root = k1VarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@Nullable DialogInterface dialogInterface) {
        j0(K().d0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f134500a != null) {
            x xVarK = K();
            k1 k1Var = this.f134500a;
            if (k1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                k1Var = null;
            }
            xVarK.t0(Integer.valueOf(k1Var.f159216f.getScrollY()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        L(null);
    }

    public final void setNavigator$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.navigator = xVar;
    }

    public final void setPaywallStrategy$P5D_Library_release(@NotNull ia.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.paywallStrategy = bVar;
    }
}
