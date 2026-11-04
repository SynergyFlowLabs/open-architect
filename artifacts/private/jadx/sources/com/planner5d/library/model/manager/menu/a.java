package com.planner5d.library.model.manager.menu;

import androidx.compose.runtime.internal.w0;
import androidx.navigation.c2;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.activity.fragment.profile.q;
import com.planner5d.library.application.d;
import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.s;
import ed.c;
import ed.e;
import ij.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@f
public final class a implements x1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f192178i = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f192179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t0 f192180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d f192181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ed.a f192182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f192183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final z1 f192184h;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.menu.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.menu.ProfileMenuManager$getList$2", f = "ProfileMenuManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1598a extends o implements Function2<s0, kotlin.coroutines.d<? super ArrayList<c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f192185a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f192187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1598a(id.a aVar, kotlin.coroutines.d<? super C1598a> dVar) {
            super(2, dVar);
            this.f192187c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1598a(this.f192187c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f192185a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ArrayList arrayList = new ArrayList();
            a aVar = a.this;
            id.a aVar2 = this.f192187c;
            if (aVar.C()) {
                boolean zO = aVar.f192180d.o(aVar2);
                arrayList.add(new e(com.planner5d.library.f.s.Dx));
                arrayList.add(aVar.w(aVar2, zO));
                arrayList.add(aVar.y(zO));
                arrayList.add(aVar.A(zO));
                if (aVar.f192183g.a(com.planner5d.library.model.manager.config.f.AiMoney)) {
                    arrayList.add(aVar.v(zO));
                }
            }
            arrayList.add(new e(com.planner5d.library.f.s.f169348pd));
            arrayList.add(aVar.z());
            arrayList.add(aVar.r());
            arrayList.add(new e(com.planner5d.library.f.s.tt));
            if (aVar.C()) {
                arrayList.add(aVar.u());
                arrayList.add(aVar.x());
            }
            arrayList.add(aVar.t());
            arrayList.addAll(aVar.f192182f.get());
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super ArrayList<c>> dVar) {
            return ((C1598a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.application.b application, @NotNull t0 userPurchases, @NotNull d configuration, @NotNull ed.a additionalProfileMenuItems, @NotNull j featureConfigManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(additionalProfileMenuItems, "additionalProfileMenuItems");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f192179c = application;
        this.f192180d = userPurchases;
        this.f192181e = configuration;
        this.f192182f = additionalProfileMenuItems;
        this.f192183g = featureConfigManager;
        this.f192184h = s.f229729a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b A(boolean z10) {
        return new ed.b(com.planner5d.library.f.h.f167801tb, com.planner5d.library.f.s.zF, E(), Integer.valueOf(q(true)), null, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C() {
        return (this.f192181e.t() || this.f192181e.b() == com.planner5d.library.model.payments.paymentmethod.e.a.None) ? false : true;
    }

    private final String D(id.a aVar) {
        if (this.f192180d.d(aVar)) {
            String string = this.f192179c.getString(com.planner5d.library.f.s.rG);
            Intrinsics.checkNotNull(string);
            return string;
        }
        int iK = this.f192180d.K(aVar);
        if (iK > 0) {
            String quantityString = this.f192179c.getResources().getQuantityString(com.planner5d.library.f.q.f168940g, iK, Integer.valueOf(iK));
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        String string2 = this.f192179c.getString(com.planner5d.library.f.s.Ey);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    private final String E() {
        String string = this.f192179c.getString(com.planner5d.library.f.s.rG);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String p(int i10, int i11) {
        if (i11 > 0) {
            String string = this.f192179c.getResources().getString(i10, Integer.valueOf(i11));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = this.f192179c.getString(com.planner5d.library.f.s.sy);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    private final int q(boolean z10) {
        return z10 ? com.planner5d.library.f.C1549f.f166657rh : com.planner5d.library.f.C1549f.Th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b r() {
        int i10 = com.planner5d.library.f.h.f167572h9;
        int i11 = com.planner5d.library.f.s.S;
        c2 c2VarA = q.a();
        Intrinsics.checkNotNullExpressionValue(c2VarA, "toAbout(...)");
        return new ed.b(i10, i11, null, null, ed.d.b.a(ed.d.b.b(c2VarA)), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b t() {
        int i10 = com.planner5d.library.f.h.R6;
        int i11 = com.planner5d.library.f.s.hp;
        c2 c2VarC = q.c();
        Intrinsics.checkNotNullExpressionValue(c2VarC, "toManageData(...)");
        return new ed.b(i10, i11, null, null, ed.d.b.a(ed.d.b.b(c2VarC)), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b u() {
        int i10 = com.planner5d.library.f.h.Z8;
        int i11 = com.planner5d.library.f.s.pt;
        c2 c2VarD = q.d();
        Intrinsics.checkNotNullExpressionValue(c2VarD, "toOrdersHistory(...)");
        return new ed.b(i10, i11, null, null, ed.d.b.a(ed.d.b.b(c2VarD)), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b v(boolean z10) {
        c2 c2VarB;
        int i10 = com.planner5d.library.f.h.f167454ba;
        int i11 = com.planner5d.library.f.s.Ov;
        String strE = z10 ? E() : p(com.planner5d.library.f.s.Hv, this.f192180d.G());
        Integer numValueOf = Integer.valueOf(q(z10 || this.f192180d.G() > 0));
        if (z10) {
            c2VarB = null;
        } else {
            c2 c2VarH = q.h();
            Intrinsics.checkNotNullExpressionValue(c2VarH, "toPurchasePagePlanRecognitions(...)");
            c2VarB = ed.d.b.b(c2VarH);
        }
        return new ed.b(i10, i11, strE, numValueOf, c2VarB != null ? ed.d.b.a(c2VarB) : null, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b w(id.a aVar, boolean z10) {
        ed.d dVarA;
        boolean zB = this.f192180d.b(aVar);
        int i10 = com.planner5d.library.f.h.f167573ha;
        int i11 = z10 ? com.planner5d.library.f.s.Qu : com.planner5d.library.f.s.qu;
        String strD = D(aVar);
        Integer numValueOf = Integer.valueOf(q(this.f192180d.K(aVar) > 0 || zB || z10));
        if (z10) {
            dVarA = null;
        } else if (this.f192183g.a(com.planner5d.library.model.manager.config.f.ProAndroid)) {
            c2 c2VarB = q.b();
            Intrinsics.checkNotNullExpressionValue(c2VarB, "toComparePlans(...)");
            dVarA = ed.d.b.a(ed.d.b.b(c2VarB));
        } else {
            dVarA = ed.d.a.a(ed.d.a.b(PurchasePagePremiumReview.class));
        }
        return new ed.b(i10, i11, strD, numValueOf, dVarA, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b x() {
        int i10 = com.planner5d.library.f.h.f167724pa;
        int i11 = com.planner5d.library.f.s.mw;
        c2 c2VarG = q.g();
        Intrinsics.checkNotNullExpressionValue(c2VarG, "toPromoCode(...)");
        int i12 = 3 & 0;
        return new ed.b(i10, i11, null, null, ed.d.b.a(ed.d.b.b(c2VarG)), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b y(boolean z10) {
        c2 c2VarB;
        int i10 = com.planner5d.library.f.h.Ma;
        int i11 = z10 ? com.planner5d.library.f.s.Gu : com.planner5d.library.f.s.MC;
        String strE = z10 ? E() : p(com.planner5d.library.f.s.Hv, this.f192180d.Q());
        Integer numValueOf = Integer.valueOf(q(z10 || this.f192180d.Q() > 0));
        if (z10) {
            c2VarB = null;
        } else {
            c2 c2VarI = q.i();
            Intrinsics.checkNotNullExpressionValue(c2VarI, "toPurchasePageSnapshots(...)");
            c2VarB = ed.d.b.b(c2VarI);
        }
        return new ed.b(i10, i11, strE, numValueOf, c2VarB != null ? ed.d.b.a(c2VarB) : null, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ed.b z() {
        return new ed.b(com.planner5d.library.f.h.V7, com.planner5d.library.f.s.f168984ac, null, null, ed.d.a.a(ed.d.a.b(la.b.class)), false, 32, null);
    }

    @Nullable
    public final Object B(@Nullable id.a aVar, @NotNull kotlin.coroutines.d<? super List<? extends c>> dVar) {
        return i.h(this.f192184h, new C1598a(aVar, null), dVar);
    }
}
