package com.planner5d.library.contest.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.planner5d.library.activity.fragment.list.o1;
import com.planner5d.library.contest.view.dialog.ContestSuggestDialog;
import com.planner5d.library.contest.view.rules.ContestRulesDialog;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.m0;
import com.planner5d.library.widget.x1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestFragment.kt\ncom/planner5d/library/contest/view/ContestFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,208:1\n16#2:209\n257#3,2:210\n257#3,2:212\n*S KotlinDebug\n*F\n+ 1 ContestFragment.kt\ncom/planner5d/library/contest/view/ContestFragment\n*L\n47#1:209\n194#1:210,2\n198#1:212,2\n*E\n"})
public final class ContestFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f153337a;

    @ij.a
    public o1 actionsObserve;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f153338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x1 f153339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private db.i f153340d;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f153341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f153342f;

    @ij.a
    public com.planner5d.library.model.manager.w featureConfigManager;

    @ij.a
    public p0 formatter;

    @ij.a
    public com.planner5d.library.services.q imageManager;

    @ij.a
    public com.planner5d.library.model.manager.o1 languageManager;

    @ij.a
    public c2 messageManager;

    public static final class a implements c0.b {

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.ContestFragment$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestFragment$createContestAdapter$1$onClickParticipate$1", f = "ContestFragment.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.G1}, m = "invokeSuspend", n = {}, s = {})
        static final class C1522a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ContestFragment f153345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Contest f153346c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1522a(ContestFragment contestFragment, Contest contest, kotlin.coroutines.d<? super C1522a> dVar) {
                super(2, dVar);
                this.f153345b = contestFragment;
                this.f153346c = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1522a(this.f153345b, this.f153346c, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x005d  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C1522a c1522a;
                Exception exc;
                String message;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f153344a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        z zVarD = this.f153345b.D();
                        Contest contest = this.f153346c;
                        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.currentList;
                        this.f153344a = 1;
                        c1522a = this;
                        try {
                            if (z.z0(zVarD, contest, rVar, null, c1522a, 4, null) == objL) {
                                return objL;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            c2 messageManager$P5D_Library_Contest_release = c1522a.f153345b.getMessageManager$P5D_Library_Contest_release();
                            int i11 = com.planner5d.library.contest.e.r.I3;
                            message = exc.getMessage();
                            if (message == null) {
                                message = c1522a.f153345b.getString(com.planner5d.library.contest.e.r.Xv);
                                Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                            }
                            messageManager$P5D_Library_Contest_release.c(new ErrorMessageException(i11, message));
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c1522a = this;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.m(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        c1522a = this;
                        c2 messageManager$P5D_Library_Contest_release2 = c1522a.f153345b.getMessageManager$P5D_Library_Contest_release();
                        int i12 = com.planner5d.library.contest.e.r.I3;
                        message = exc.getMessage();
                        if (message == null) {
                            message = c1522a.f153345b.getString(com.planner5d.library.contest.e.r.Xv);
                            Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                        }
                        messageManager$P5D_Library_Contest_release2.c(new ErrorMessageException(i12, message));
                    }
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1522a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void a(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z zVarD = ContestFragment.this.D();
            androidx.fragment.app.s sVarRequireActivity = ContestFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            zVarD.G0(sVarRequireActivity, contest);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void b(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            ContestFragment.this.I();
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void c() {
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void d(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z.N0(ContestFragment.this.D(), contest, com.planner5d.library.services.r.currentList, null, 4, null);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void e(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z.s0(ContestFragment.this.D(), contest, com.planner5d.library.services.r.currentList, null, 4, null);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void f(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(ContestFragment.this), null, null, new C1522a(ContestFragment.this, contest, null), 3, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestFragment$onCreateView$1$1$1", f = "ContestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153347a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestFragment.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153347a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z zVarD = ContestFragment.this.D();
            Context contextRequireContext = ContestFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            zVarD.I0(contextRequireContext);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestFragment$onResume$1", f = "ContestFragment.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153349a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestFragment.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153349a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z zVarD = ContestFragment.this.D();
                androidx.fragment.app.s sVarRequireActivity = ContestFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
                this.f153349a = 1;
                if (zVarD.H0(sVarRequireActivity, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153351a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153351a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f153351a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153351a.invoke(obj);
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

    public static final class e extends com.planner5d.library.contest.helper.a {
        e() {
        }

        @Override // com.planner5d.library.contest.helper.a
        public boolean f() {
            return true;
        }

        @Override // com.planner5d.library.contest.helper.a
        public void g() {
            ContestFragment.this.K();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestFragment$setupSwipeRefresh$1$1", f = "ContestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153353a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwipeRefreshLayout f153355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SwipeRefreshLayout swipeRefreshLayout, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f153355c = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestFragment.this.new f(this.f153355c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153353a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z zVarD = ContestFragment.this.D();
            Context contextRequireContext = ContestFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            zVarD.I0(contextRequireContext);
            this.f153355c.setRefreshing(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestFragment.kt\ncom/planner5d/library/contest/view/ContestFragment\n*L\n1#1,16:1\n47#2:17\n*E\n"})
    public static final class g implements Function0<l2> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestFragment.this.getViewModelStore();
        }
    }

    public static final class h implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153357a;

        public h(com.planner5d.library.view.b bVar) {
            this.f153357a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153357a;
        }
    }

    public ContestFragment() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        Function0 function0 = null;
        this.f153337a = new i2(j1.d(z.class), new g(), new h(c1517a.a()), function0, 8, null);
        this.f153339c = new x1();
        this.f153341e = com.planner5d.library.services.network.f.f224463a.f(this);
        this.f153342f = com.planner5d.library.util.navigation.uiview.f.c(this);
        c1517a.a().l(this);
    }

    private final c0 A() {
        p0 formatter$P5D_Library_Contest_release = getFormatter$P5D_Library_Contest_release();
        com.planner5d.library.model.manager.o1 languageManager$P5D_Library_Contest_release = getLanguageManager$P5D_Library_Contest_release();
        com.planner5d.library.services.q imageManager$P5D_Library_Contest_release = getImageManager$P5D_Library_Contest_release();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f153338b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        return new c0(formatter$P5D_Library_Contest_release, languageManager$P5D_Library_Contest_release, imageManager$P5D_Library_Contest_release, hVar, getFeatureConfigManager$P5D_Library_Contest_release().a(com.planner5d.library.model.manager.config.f.ContestsSharing), new a());
    }

    private final com.planner5d.library.util.navigation.uiview.c B() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f153342f.getValue();
    }

    private final com.planner5d.library.services.network.b C() {
        return (com.planner5d.library.services.network.b) this.f153341e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z D() {
        return (z) this.f153337a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(ContestFragment contestFragment, Integer num) {
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(contestFragment), null, null, contestFragment.new b(null), 3, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(ContestFragment contestFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            contestFragment.getDialogLauncher$P5D_Library_Contest_release().c(ContestSuggestDialog.class).g();
            contestFragment.D().A0();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(ContestFragment contestFragment, z.c cVar) {
        com.planner5d.library.util.navigation.uiview.c.a.a(contestFragment.B(), cVar.j(), null, false, 6, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(ContestFragment contestFragment) {
        contestFragment.getMessageManager$P5D_Library_Contest_release().f();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(this);
        androidx.navigation.c2 c2VarB = g0.b();
        Intrinsics.checkNotNullExpressionValue(c2VarB, "toSingleContestFragment(...)");
        kVar.d(w0VarA, c2VarB, new Function2() { // from class: com.planner5d.library.contest.view.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ContestFragment.J((androidx.navigation.w0) obj, (androidx.navigation.c2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.navigation.w0 runIfDirectionsAvailable, androidx.navigation.c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        getDialogLauncher$P5D_Library_Contest_release().c(ContestRulesDialog.class).g();
    }

    @e.a({"NotifyDataSetChanged"})
    private final void L() {
        final c0 c0VarA = A();
        db.i iVar = this.f153340d;
        db.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f269813c.setAdapter(c0VarA);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i10 = com.planner5d.library.contest.e.f.Af;
        final m0 m0Var = new m0(contextRequireContext, 0, 0, 0, 0, i10, i10, 0, null, 414, null);
        db.i iVar3 = this.f153340d;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar3;
        }
        iVar2.f269813c.n(m0Var);
        D().u0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestFragment.M(this.f153706a, c0VarA, m0Var, (z.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(ContestFragment contestFragment, c0 c0Var, m0 m0Var, z.c cVar) {
        contestFragment.Q(cVar.k());
        c0Var.m(cVar.f());
        c0Var.n(cVar.j());
        c0Var.l(cVar.i());
        m0Var.o(!cVar.j());
        c0Var.notifyDataSetChanged();
        db.i iVar = contestFragment.f153340d;
        db.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f269815e.setEnabled(!cVar.j());
        db.i iVar3 = contestFragment.f153340d;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar3;
        }
        LinearProgressIndicator linearProgressIndicator = iVar2.f269814d;
        if (cVar.i()) {
            linearProgressIndicator.q();
        } else {
            linearProgressIndicator.j();
        }
        return Unit.f312394a;
    }

    private final void N() {
        y3.f229862a.l(this).addMenuProvider(new e(), getViewLifecycleOwner());
    }

    private final void O(final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setEnabled(true);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.contest.view.k
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                ContestFragment.P(this.f153711a, swipeRefreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(ContestFragment contestFragment, SwipeRefreshLayout swipeRefreshLayout) {
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(contestFragment), null, null, contestFragment.new f(swipeRefreshLayout, null), 3, null);
    }

    private final void Q(boolean z10) {
        if (z10) {
            x1 x1Var = this.f153339c;
            db.i iVar = this.f153340d;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            View viewB = x1Var.b(iVar.f269812b);
            if (viewB != null) {
                viewB.setVisibility(0);
                TextView textView = (TextView) viewB.findViewById(com.planner5d.library.contest.e.i.f150882i3);
                if (textView != null) {
                    textView.setText(com.planner5d.library.contest.e.r.C5);
                }
            }
        } else {
            View viewA = this.f153339c.a();
            if (viewA != null) {
                viewA.setVisibility(8);
            }
        }
    }

    @NotNull
    public final o1 getActionsObserve$P5D_Library_Contest_release() {
        o1 o1Var = this.actionsObserve;
        if (o1Var != null) {
            return o1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionsObserve");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher$P5D_Library_Contest_release() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.w getFeatureConfigManager$P5D_Library_Contest_release() {
        com.planner5d.library.model.manager.w wVar = this.featureConfigManager;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final p0 getFormatter$P5D_Library_Contest_release() {
        p0 p0Var = this.formatter;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.q getImageManager$P5D_Library_Contest_release() {
        com.planner5d.library.services.q qVar = this.imageManager;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.o1 getLanguageManager$P5D_Library_Contest_release() {
        com.planner5d.library.model.manager.o1 o1Var = this.languageManager;
        if (o1Var != null) {
            return o1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageManager");
        return null;
    }

    @NotNull
    public final c2 getMessageManager$P5D_Library_Contest_release() {
        c2 c2Var = this.messageManager;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f153338b = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        db.i iVarC = db.i.c(inflater);
        Intrinsics.checkNotNullExpressionValue(iVarC, "inflate(...)");
        N();
        SwipeRefreshLayout contestSwipeRefresh = iVarC.f269815e;
        Intrinsics.checkNotNullExpressionValue(contestSwipeRefresh, "contestSwipeRefresh");
        O(contestSwipeRefresh);
        v1.b bVar = com.planner5d.library.services.m0.f224432e;
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        bVar.k(viewLifecycleOwner, new d(new Function1() { // from class: com.planner5d.library.contest.view.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestFragment.E(this.f153701a, (Integer) obj);
            }
        }));
        D().v0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestFragment.F(this.f153703a, (Boolean) obj);
            }
        }));
        D().u0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestFragment.G(this.f153705a, (z.c) obj);
            }
        }));
        getActionsObserve$P5D_Library_Contest_release().a(D().t0(), this);
        this.f153340d = iVarC;
        L();
        db.i iVar = this.f153340d;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        ConstraintLayout constraintLayoutB = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        C().f(new Function0() { // from class: com.planner5d.library.contest.view.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContestFragment.H(this.f153713a);
            }
        });
    }

    public final void setActionsObserve$P5D_Library_Contest_release(@NotNull o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<set-?>");
        this.actionsObserve = o1Var;
    }

    public final void setDialogLauncher$P5D_Library_Contest_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setFeatureConfigManager$P5D_Library_Contest_release(@NotNull com.planner5d.library.model.manager.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.featureConfigManager = wVar;
    }

    public final void setFormatter$P5D_Library_Contest_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setImageManager$P5D_Library_Contest_release(@NotNull com.planner5d.library.services.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.imageManager = qVar;
    }

    public final void setLanguageManager$P5D_Library_Contest_release(@NotNull com.planner5d.library.model.manager.o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<set-?>");
        this.languageManager = o1Var;
    }

    public final void setMessageManager$P5D_Library_Contest_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }
}
