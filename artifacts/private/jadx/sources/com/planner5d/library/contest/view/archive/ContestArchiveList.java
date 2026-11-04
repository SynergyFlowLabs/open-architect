package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.contest.view.z;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.u2;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.m0;
import com.planner5d.library.widget.x1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestArchiveList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestArchiveList.kt\ncom/planner5d/library/contest/view/archive/ContestArchiveList\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,166:1\n16#2:167\n257#3,2:168\n257#3,2:170\n*S KotlinDebug\n*F\n+ 1 ContestArchiveList.kt\ncom/planner5d/library/contest/view/archive/ContestArchiveList\n*L\n42#1:167\n158#1:168,2\n162#1:170,2\n*E\n"})
public final class ContestArchiveList extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f153389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f153390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x1 f153391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f153392d;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private db.i f153393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f153394f;

    @ij.a
    public p0 formatter;

    @ij.a
    public com.planner5d.library.services.q imageManager;

    @ij.a
    public o1 languageManager;

    @ij.a
    public c2 messageManager;

    @ij.a
    public w userAuthorization;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.archive.ContestArchiveList$join$1", f = "ContestArchiveList.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153395a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f153397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Contest contest, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f153397c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestArchiveList.this.new a(this.f153397c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153395a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    z zVarX = ContestArchiveList.this.x();
                    Contest contest = this.f153397c;
                    r rVar = r.completedList;
                    db.i iVar = ContestArchiveList.this.f153393e;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar = null;
                    }
                    u2 scrollPosition = iVar.f269813c.getScrollPosition();
                    this.f153395a = 1;
                    if (zVarX.y0(contest, rVar, scrollPosition, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Exception e10) {
                c2 messageManager$P5D_Library_Contest_release = ContestArchiveList.this.getMessageManager$P5D_Library_Contest_release();
                int i11 = com.planner5d.library.contest.e.r.I3;
                String message = e10.getMessage();
                if (message == null) {
                    message = ContestArchiveList.this.getString(com.planner5d.library.contest.e.r.Xv);
                    Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                }
                messageManager$P5D_Library_Contest_release.c(new ErrorMessageException(i11, message));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.archive.ContestArchiveList$onCreateView$1$1$1", f = "ContestArchiveList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153398a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestArchiveList.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153398a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z zVarX = ContestArchiveList.this.x();
            Context contextRequireContext = ContestArchiveList.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            zVarX.I0(contextRequireContext);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c implements com.planner5d.library.contest.view.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ db.i f153401b;

        c(db.i iVar) {
            this.f153401b = iVar;
        }

        @Override // com.planner5d.library.contest.view.o
        public void a(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            ContestArchiveList.this.x().r0(contest, r.completedList, this.f153401b.f269813c.getScrollPosition());
        }

        @Override // com.planner5d.library.contest.view.o
        public void b(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            ContestArchiveList.this.y(contest);
        }

        @Override // com.planner5d.library.contest.view.o
        public void c(Contest contest) {
            Intrinsics.checkNotNullParameter(contest, "contest");
            ContestArchiveList.this.x().K0(contest, androidx.navigation.fragment.f.a(ContestArchiveList.this));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.archive.ContestArchiveList$onResume$1", f = "ContestArchiveList.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153402a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestArchiveList.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153402a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z zVarX = ContestArchiveList.this.x();
                s sVarRequireActivity = ContestArchiveList.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
                this.f153402a = 1;
                if (zVarX.H0(sVarRequireActivity, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class e implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153404a;

        e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153404a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153404a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153404a.invoke(obj);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.archive.ContestArchiveList$setupSwipeRefresh$1$1", f = "ContestArchiveList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153405a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwipeRefreshLayout f153407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SwipeRefreshLayout swipeRefreshLayout, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f153407c = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ContestArchiveList.this.new f(this.f153407c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            z zVarX = ContestArchiveList.this.x();
            Context contextRequireContext = ContestArchiveList.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            zVarX.I0(contextRequireContext);
            this.f153407c.setRefreshing(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestArchiveList.kt\ncom/planner5d/library/contest/view/archive/ContestArchiveList\n*L\n1#1,16:1\n42#2:17\n*E\n"})
    public static final class g implements Function0<l2> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestArchiveList.this.getViewModelStore();
        }
    }

    public static final class h implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153409a;

        public h(com.planner5d.library.view.b bVar) {
            this.f153409a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153409a;
        }
    }

    public ContestArchiveList() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        Function0 function0 = null;
        this.f153389a = new i2(j1.d(z.class), new g(), new h(c1517a.a()), function0, 8, null);
        this.f153391c = new x1();
        this.f153394f = com.planner5d.library.util.navigation.uiview.f.c(this);
        c1517a.a().o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(ContestArchiveList contestArchiveList, com.planner5d.library.contest.view.archive.h hVar, db.i iVar, m0 m0Var, z.c cVar) {
        contestArchiveList.D(cVar.l());
        com.planner5d.library.util.navigation.uiview.c.a.a(contestArchiveList.w(), cVar.j(), null, false, 6, null);
        hVar.k(cVar.g());
        hVar.l(cVar.j());
        m0Var.o(!cVar.j());
        hVar.notifyDataSetChanged();
        if (!contestArchiveList.f153392d && !cVar.g().isEmpty()) {
            contestArchiveList.f153392d = true;
            Bundle bundleH = new com.planner5d.library.services.utility.j(contestArchiveList.getArguments()).h(r.scrollPosition, null);
            if (bundleH != null) {
                iVar.f269813c.d2(new u2(bundleH));
            }
        }
        iVar.f269815e.setEnabled(!cVar.j());
        return Unit.f312394a;
    }

    private final void B(final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setEnabled(true);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.contest.view.archive.g
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                ContestArchiveList.C(this.f153427a, swipeRefreshLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(ContestArchiveList contestArchiveList, SwipeRefreshLayout swipeRefreshLayout) {
        int i10 = 2 >> 0;
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(contestArchiveList), null, null, contestArchiveList.new f(swipeRefreshLayout, null), 3, null);
    }

    private final void D(boolean z10) {
        if (z10) {
            x1 x1Var = this.f153391c;
            db.i iVar = this.f153393e;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            View viewB = x1Var.b(iVar.f269812b);
            if (viewB != null) {
                viewB.setVisibility(0);
                TextView textView = (TextView) viewB.findViewById(com.planner5d.library.contest.e.i.f150882i3);
                if (textView != null) {
                    textView.setText(com.planner5d.library.contest.e.r.B5);
                }
            }
        } else {
            View viewA = this.f153391c.a();
            if (viewA != null) {
                viewA.setVisibility(8);
            }
        }
    }

    private final com.planner5d.library.util.navigation.uiview.c w() {
        return (com.planner5d.library.util.navigation.uiview.c) this.f153394f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z x() {
        return (z) this.f153389a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Contest contest) {
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(this), null, null, new a(contest, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(ContestArchiveList contestArchiveList, Integer num) {
        int i10 = 0 >> 0;
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(contestArchiveList), null, null, contestArchiveList.new b(null), 3, null);
        return Unit.f312394a;
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

    @NotNull
    public final w getUserAuthorization$P5D_Library_Contest_release() {
        w wVar = this.userAuthorization;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @e.a({"NotifyDataSetChanged"})
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f153390b = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        final db.i iVarA = db.i.a(inflater.inflate(com.planner5d.library.contest.e.l.f151314u0, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(iVarA, "bind(...)");
        p0 formatter$P5D_Library_Contest_release = getFormatter$P5D_Library_Contest_release();
        o1 languageManager$P5D_Library_Contest_release = getLanguageManager$P5D_Library_Contest_release();
        com.planner5d.library.services.q imageManager$P5D_Library_Contest_release = getImageManager$P5D_Library_Contest_release();
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f153390b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        final com.planner5d.library.contest.view.archive.h hVar2 = new com.planner5d.library.contest.view.archive.h(formatter$P5D_Library_Contest_release, languageManager$P5D_Library_Contest_release, imageManager$P5D_Library_Contest_release, hVar, getUserAuthorization$P5D_Library_Contest_release(), new c(iVarA), null, 64, null);
        iVarA.f269813c.setHasFixedSize(true);
        iVarA.f269813c.setAdapter(hVar2);
        Context context = iVarA.f269813c.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final m0 m0Var = new m0(context, 0, 0, 0, 0, 0, 0, 0, null, v.g.f44098r, null);
        iVarA.f269813c.n(m0Var);
        SwipeRefreshLayout contestSwipeRefresh = iVarA.f269815e;
        Intrinsics.checkNotNullExpressionValue(contestSwipeRefresh, "contestSwipeRefresh");
        B(contestSwipeRefresh);
        iVarA.f269814d.j();
        v1.b bVar = com.planner5d.library.services.m0.f224432e;
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        bVar.k(viewLifecycleOwner, new e(new Function1() { // from class: com.planner5d.library.contest.view.archive.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestArchiveList.z(this.f153422a, (Integer) obj);
            }
        }));
        x().u0().k(getViewLifecycleOwner(), new e(new Function1() { // from class: com.planner5d.library.contest.view.archive.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestArchiveList.A(this.f153423a, hVar2, iVarA, m0Var, (z.c) obj);
            }
        }));
        this.f153393e = iVarA;
        ConstraintLayout constraintLayoutB = iVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i10 = 3 & 0;
        kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(this), null, null, new d(null), 3, null);
    }

    public final void setDialogLauncher$P5D_Library_Contest_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setFormatter$P5D_Library_Contest_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setImageManager$P5D_Library_Contest_release(@NotNull com.planner5d.library.services.q qVar) {
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

    public final void setUserAuthorization$P5D_Library_Contest_release(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.userAuthorization = wVar;
    }
}
