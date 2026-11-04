package com.planner5d.library.contest.view.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.contest.view.c0;
import com.planner5d.library.contest.view.n;
import com.planner5d.library.contest.view.u;
import com.planner5d.library.contest.view.z;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.q;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import db.j;
import ef.g;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.x;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestDetailsFragment.kt\ncom/planner5d/library/contest/view/detail/ContestDetailsFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,157:1\n16#2:158\n257#3,2:159\n*S KotlinDebug\n*F\n+ 1 ContestDetailsFragment.kt\ncom/planner5d/library/contest/view/detail/ContestDetailsFragment\n*L\n37#1:158\n107#1:159,2\n*E\n"})
public final class ContestDetailsFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f153510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f153511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f153512c;

    @ij.a
    public x2 configuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private fb.a f153513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private u f153514e;

    @ij.a
    public w featureConfigManager;

    @ij.a
    public p0 formatter;

    @ij.a
    public q imageManager;

    @ij.a
    public o1 languageManager;

    @ij.a
    public c2 messageManager;

    public static final class a implements c0.b {

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.detail.ContestDetailsFragment$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.detail.ContestDetailsFragment$createContestListener$1$onClickParticipate$1", f = "ContestDetailsFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        static final class C1523a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ContestDetailsFragment f153517b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Contest f153518c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1523a(ContestDetailsFragment contestDetailsFragment, Contest contest, kotlin.coroutines.d<? super C1523a> dVar) {
                super(2, dVar);
                this.f153517b = contestDetailsFragment;
                this.f153518c = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1523a(this.f153517b, this.f153518c, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0059  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C1523a c1523a;
                Exception exc;
                String message;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f153516a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    try {
                        z zVarZ = this.f153517b.z();
                        Contest contest = this.f153518c;
                        this.f153516a = 1;
                        c1523a = this;
                        try {
                            if (z.z0(zVarZ, contest, null, null, c1523a, 4, null) == objL) {
                                return objL;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            c2 messageManager$P5D_Library_Contest_release = c1523a.f153517b.getMessageManager$P5D_Library_Contest_release();
                            int i11 = com.planner5d.library.contest.e.r.I3;
                            message = exc.getMessage();
                            if (message == null) {
                                message = c1523a.f153517b.getString(com.planner5d.library.contest.e.r.Xv);
                                Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                            }
                            messageManager$P5D_Library_Contest_release.c(new ErrorMessageException(i11, message));
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c1523a = this;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.m(obj);
                    } catch (Exception e12) {
                        exc = e12;
                        c1523a = this;
                        c2 messageManager$P5D_Library_Contest_release2 = c1523a.f153517b.getMessageManager$P5D_Library_Contest_release();
                        int i12 = com.planner5d.library.contest.e.r.I3;
                        message = exc.getMessage();
                        if (message == null) {
                            message = c1523a.f153517b.getString(com.planner5d.library.contest.e.r.Xv);
                            Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                        }
                        messageManager$P5D_Library_Contest_release2.c(new ErrorMessageException(i12, message));
                    }
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1523a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void a(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z zVarZ = ContestDetailsFragment.this.z();
            s sVarRequireActivity = ContestDetailsFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            zVarZ.G0(sVarRequireActivity, contest);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void b(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void c() {
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void d(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z.N0(ContestDetailsFragment.this.z(), contest, null, null, 4, null);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void e(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            z.s0(ContestDetailsFragment.this.z(), contest, null, null, 4, null);
        }

        @Override // com.planner5d.library.contest.view.c0.b
        public void f(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            k.f(androidx.lifecycle.p0.a(ContestDetailsFragment.this), null, null, new C1523a(ContestDetailsFragment.this, contest, null), 3, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.detail.ContestDetailsFragment$onResume$1", f = "ContestDetailsFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153519a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestDetailsFragment.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153519a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z zVarZ = ContestDetailsFragment.this.z();
                s sVarRequireActivity = ContestDetailsFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
                this.f153519a = 1;
                if (zVarZ.H0(sVarRequireActivity, this) == objL) {
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
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153521a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153521a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153521a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153521a.invoke(obj);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.detail.ContestDetailsFragment$setupSwipeRefresh$1$1", f = "ContestDetailsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwipeRefreshLayout f153524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SwipeRefreshLayout swipeRefreshLayout, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f153524c = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestDetailsFragment.this.new d(this.f153524c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153522a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z zVarZ = ContestDetailsFragment.this.z();
            Context contextRequireContext = ContestDetailsFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            zVarZ.I0(contextRequireContext);
            this.f153524c.setRefreshing(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestDetailsFragment.kt\ncom/planner5d/library/contest/view/detail/ContestDetailsFragment\n*L\n1#1,16:1\n37#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestDetailsFragment.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153526a;

        public f(com.planner5d.library.view.b bVar) {
            this.f153526a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153526a;
        }
    }

    public ContestDetailsFragment() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        this.f153510a = new i2(j1.d(z.class), new e(), new f(c1517a.a()), null, 8, null);
        this.f153511b = new t();
        c1517a.a().p(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ContestDetailsFragment contestDetailsFragment, View view) {
        androidx.navigation.fragment.f.a(contestDetailsFragment).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(ContestDetailsFragment contestDetailsFragment, j jVar, z.c cVar) {
        u uVar = contestDetailsFragment.f153514e;
        if (uVar != null) {
            uVar.a();
        }
        Intrinsics.checkNotNull(jVar);
        Intrinsics.checkNotNull(cVar);
        contestDetailsFragment.f153514e = contestDetailsFragment.x(jVar, cVar);
        h0 h0VarA = contestDetailsFragment.f153511b.a();
        if (cVar.h()) {
            h0VarA.p(contestDetailsFragment.getString(com.planner5d.library.contest.e.r.Nu), true);
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(ContestDetailsFragment contestDetailsFragment, List list) {
        fb.a aVar = contestDetailsFragment.f153513d;
        if (aVar != null) {
            Intrinsics.checkNotNull(list);
            aVar.j(list);
        }
        return Unit.f312394a;
    }

    private final void D(final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setEnabled(true);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.contest.view.detail.d
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                ContestDetailsFragment.E(this.f153531a, swipeRefreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(ContestDetailsFragment contestDetailsFragment, SwipeRefreshLayout swipeRefreshLayout) {
        k.f(androidx.lifecycle.p0.a(contestDetailsFragment), null, null, contestDetailsFragment.new d(swipeRefreshLayout, null), 3, null);
    }

    private final u x(j jVar, z.c cVar) {
        boolean zA = getFeatureConfigManager$P5D_Library_Contest_release().a(com.planner5d.library.model.manager.config.f.ContestsSharing);
        h hVar = this.f153512c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        ImageView contestImage = jVar.f269821f;
        Intrinsics.checkNotNullExpressionValue(contestImage, "contestImage");
        TextView contestRemainingTime = jVar.f269825j;
        Intrinsics.checkNotNullExpressionValue(contestRemainingTime, "contestRemainingTime");
        TextView contestName = jVar.f269822g;
        Intrinsics.checkNotNullExpressionValue(contestName, "contestName");
        TextView contestRequirements = jVar.f269826k;
        Intrinsics.checkNotNullExpressionValue(contestRequirements, "contestRequirements");
        TextView contestButtonParticipate = jVar.f269819d;
        Intrinsics.checkNotNullExpressionValue(contestButtonParticipate, "contestButtonParticipate");
        TextView contestButtonVote = jVar.f269820e;
        Intrinsics.checkNotNullExpressionValue(contestButtonVote, "contestButtonVote");
        TextView contestShareExplanation = jVar.f269827l;
        Intrinsics.checkNotNullExpressionValue(contestShareExplanation, "contestShareExplanation");
        u uVar = new u(hVar, contestImage, contestRemainingTime, contestName, contestRequirements, contestButtonParticipate, contestButtonVote, null, null, null, contestShareExplanation, zA);
        n nVar = (n) CollectionsKt.firstOrNull((List) cVar.f());
        if (nVar == null) {
            return uVar;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        uVar.n(contextRequireContext, nVar.a(), nVar.c(), nVar.b(), nVar.d(), getFormatter$P5D_Library_Contest_release(), getLanguageManager$P5D_Library_Contest_release(), getImageManager$P5D_Library_Contest_release(), y());
        RecyclerView contestPrizePrizes = jVar.f269824i;
        Intrinsics.checkNotNullExpressionValue(contestPrizePrizes, "contestPrizePrizes");
        boolean z10 = true;
        if (zA && nVar.d()) {
            z10 = false;
        }
        contestPrizePrizes.setVisibility(z10 ? 0 : 8);
        return uVar;
    }

    private final a y() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z z() {
        return (z) this.f153510a.getValue();
    }

    @NotNull
    public final x2 getConfiguration$P5D_Library_Contest_release() {
        x2 x2Var = this.configuration;
        if (x2Var != null) {
            return x2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ProjectEntry.configuration);
        return null;
    }

    @NotNull
    public final w getFeatureConfigManager$P5D_Library_Contest_release() {
        w wVar = this.featureConfigManager;
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
    public final q getImageManager$P5D_Library_Contest_release() {
        q qVar = this.imageManager;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @NotNull
    public final o1 getLanguageManager$P5D_Library_Contest_release() {
        o1 o1Var = this.languageManager;
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
        this.f153512c = new h.a().a(this);
        View viewInflate = inflater.inflate(com.planner5d.library.contest.e.l.f151322w0, viewGroup, false);
        final j jVarA = j.a(viewInflate);
        u1.j2(jVarA.f269818c, new g(0, 1, null));
        jVarA.f269817b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.detail.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestDetailsFragment.A(this.f153527a, view);
            }
        });
        SwipeRefreshLayout contestSwipeRefresh = jVarA.f269828m;
        Intrinsics.checkNotNullExpressionValue(contestSwipeRefresh, "contestSwipeRefresh");
        D(contestSwipeRefresh);
        this.f153511b.b(jVarA.f269823h);
        z().u0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.contest.view.detail.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestDetailsFragment.B(this.f153528a, jVarA, (z.c) obj);
            }
        }));
        RecyclerView recyclerView = jVarA.f269824i;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        fb.a aVar = new fb.a(contextRequireContext, getConfiguration$P5D_Library_Contest_release());
        this.f153513d = aVar;
        recyclerView.setAdapter(aVar);
        z().x0().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.contest.view.detail.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestDetailsFragment.C(this.f153530a, (List) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        u uVar = this.f153514e;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        k.f(androidx.lifecycle.p0.a(this), null, null, new b(null), 3, null);
    }

    public final void setConfiguration$P5D_Library_Contest_release(@NotNull x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "<set-?>");
        this.configuration = x2Var;
    }

    public final void setFeatureConfigManager$P5D_Library_Contest_release(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.featureConfigManager = wVar;
    }

    public final void setFormatter$P5D_Library_Contest_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setImageManager$P5D_Library_Contest_release(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.imageManager = qVar;
    }

    public final void setLanguageManager$P5D_Library_Contest_release(@NotNull o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<set-?>");
        this.languageManager = o1Var;
    }

    public final void setMessageManager$P5D_Library_Contest_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }
}
