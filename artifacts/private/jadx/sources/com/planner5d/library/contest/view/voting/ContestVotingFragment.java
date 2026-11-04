package com.planner5d.library.contest.view.voting;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.p0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.contest.view.dialog.ContestVotingCongratsDialog;
import com.planner5d.library.model.a0;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.u;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.menu.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestVotingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingFragment.kt\ncom/planner5d/library/contest/view/voting/ContestVotingFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n16#2:262\n1557#3:263\n1628#3,3:264\n1557#3:267\n1628#3,3:268\n1872#3,3:271\n1863#3:274\n1864#3:277\n1872#3,2:278\n1874#3:282\n1863#3:283\n1864#3:286\n1872#3,3:287\n1872#3,3:290\n1872#3,3:293\n1872#3,2:296\n1874#3:299\n257#4,2:275\n257#4,2:280\n257#4,2:284\n1#5:298\n*S KotlinDebug\n*F\n+ 1 ContestVotingFragment.kt\ncom/planner5d/library/contest/view/voting/ContestVotingFragment\n*L\n48#1:262\n86#1:263\n86#1:264,3\n87#1:267\n87#1:268,3\n133#1:271,3\n146#1:274\n146#1:277\n154#1:278,2\n154#1:282\n165#1:283\n165#1:286\n173#1:287,3\n198#1:290,3\n222#1:293,3\n101#1:296,2\n101#1:299\n147#1:275,2\n156#1:280,2\n166#1:284,2\n*E\n"})
public final class ContestVotingFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f153828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<ContestVotingItemView> f153829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<CircularProgressIndicator> f153830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<com.planner5d.library.services.bitmaploader.target.k> f153831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<com.planner5d.library.services.bitmaploader.target.k> f153832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private db.l f153833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f0 f153834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f153835l;

    @ij.a
    public o1 languageManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final f0 f153836m;

    @ij.a
    public c2 messageManager;

    @ij.a
    public com.planner5d.library.services.utility.c2 networkStateUtility;

    @ij.a
    public l3 statisticsEventContests;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153837a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153837a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153837a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153837a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestVotingFragment.kt\ncom/planner5d/library/contest/view/voting/ContestVotingFragment\n*L\n1#1,16:1\n48#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestVotingFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153839a;

        public c(com.planner5d.library.view.b bVar) {
            this.f153839a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153839a;
        }
    }

    public static final class d extends com.planner5d.library.services.bitmaploader.target.g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f153840i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ContestVotingFragment f153841j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AtomicInteger atomicInteger, ContestVotingFragment contestVotingFragment, com.planner5d.library.services.bitmaploader.target.a aVar) {
            super(aVar);
            this.f153840i = atomicInteger;
            this.f153841j = contestVotingFragment;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            h(null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.g, com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            int iIncrementAndGet = this.f153840i.incrementAndGet();
            List list = this.f153841j.f153829f;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemViews");
                list = null;
            }
            if (iIncrementAndGet == list.size()) {
                this.f153841j.O().r0();
            }
        }
    }

    public ContestVotingFragment() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        this.f153828e = new i2(j1.d(m.class), new b(), new c(c1517a.a()), null, 8, null);
        this.f153834k = g0.c(new Function0() { // from class: com.planner5d.library.contest.view.voting.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(ContestVotingFragment.J(this.f153861a));
            }
        });
        this.f153836m = com.planner5d.library.services.network.f.f224463a.f(this);
        c1517a.a().s(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long J(ContestVotingFragment contestVotingFragment) {
        return contestVotingFragment.requireActivity().getResources().getInteger(com.planner5d.library.contest.e.j.f151199z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(ContestVotingFragment contestVotingFragment, Activity activity, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Intrinsics.checkNotNullParameter(menuItem, "<unused var>");
        contestVotingFragment.O().u0(null);
    }

    private final void L() {
        new ContestVotingCongratsDialog().show(getChildFragmentManager(), "contest_voting_congrats_dialog");
        O().g0();
    }

    private final long M() {
        return ((Number) this.f153834k.getValue()).longValue();
    }

    private final com.planner5d.library.services.network.b N() {
        return (com.planner5d.library.services.network.b) this.f153836m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m O() {
        return (m) this.f153828e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(ContestVotingFragment contestVotingFragment, db.l lVar, long j10, com.planner5d.library.contest.c cVar) {
        contestVotingFragment.requireActivity().invalidateOptionsMenu();
        if (cVar instanceof com.planner5d.library.contest.c.b) {
            contestVotingFragment.Y(false);
        } else if (cVar instanceof com.planner5d.library.contest.c.h) {
            contestVotingFragment.c0();
        } else if (cVar instanceof com.planner5d.library.contest.c.f) {
            contestVotingFragment.a0(contestVotingFragment.O().f0().f());
        } else if (cVar instanceof com.planner5d.library.contest.c.C1518c) {
            contestVotingFragment.U();
        } else if (cVar instanceof com.planner5d.library.contest.c.a) {
            Context context = lVar.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            contestVotingFragment.R(context, ((com.planner5d.library.contest.c.a) cVar).a(), Long.valueOf(j10));
        } else if (cVar instanceof com.planner5d.library.contest.c.g) {
            contestVotingFragment.L();
        } else if (cVar instanceof com.planner5d.library.contest.c.i) {
            contestVotingFragment.Y(false);
            List<ContestVotingItemView> list = contestVotingFragment.f153829f;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemViews");
                list = null;
            }
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
                Integer numA = ((com.planner5d.library.contest.c.i) cVar).a();
                contestVotingItemView.f(numA != null ? Boolean.valueOf(numA.intValue() == i10) : null, null, null);
                i10 = i11;
            }
        } else if (cVar instanceof com.planner5d.library.contest.c.j) {
            contestVotingFragment.V(contestVotingFragment.O().f0().f(), ((com.planner5d.library.contest.c.j) cVar).a());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(db.l lVar, ContestVotingFragment contestVotingFragment, a0 a0Var) {
        lVar.f269842g.setText(a0Var != null ? a0Var.a(contestVotingFragment.getLanguageManager$P5D_Library_Contest_release().a(contestVotingFragment.getContext())) : null);
        return Unit.f312394a;
    }

    private final void R(Context context, ErrorMessageException errorMessageException, final Long l10) {
        final u uVar = new u(u.c.ContestError, errorMessageException.toMessage().c(), new u.a(u.f222819h, (Function0<Unit>) new Function0() { // from class: com.planner5d.library.contest.view.voting.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContestVotingFragment.T(this.f153852a);
            }
        }));
        getMessageManager$P5D_Library_Contest_release().e(uVar);
        if (l10 == null || !ErrorMessageException.isWithCode(errorMessageException, com.planner5d.library.contest.e.r.S8)) {
            return;
        }
        N().f(new Function0() { // from class: com.planner5d.library.contest.view.voting.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContestVotingFragment.S(this.f153854a, uVar, l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(ContestVotingFragment contestVotingFragment, u uVar, Long l10) {
        contestVotingFragment.getMessageManager$P5D_Library_Contest_release().d(uVar);
        contestVotingFragment.O().s0(l10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(ContestVotingFragment contestVotingFragment) {
        contestVotingFragment.O().m0();
        return Unit.f312394a;
    }

    private final void U() {
        l3 statisticsEventContests$P5D_Library_Contest_release = getStatisticsEventContests$P5D_Library_Contest_release();
        String str = O().b0().uid;
        List<CircularProgressIndicator> list = null;
        statisticsEventContests$P5D_Library_Contest_release.L0(str != null ? Long.valueOf(Long.parseLong(str)) : null, l3.a.contests_voting_start, null);
        Y(true);
        List<ContestVotingItemView> list2 = this.f153829f;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list2 = null;
        }
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
            contestVotingItemView.setVisibility(0);
            contestVotingItemView.setAlpha(0.0f);
            contestVotingItemView.setScaleX(0.4f);
            contestVotingItemView.setScaleY(0.4f);
            contestVotingItemView.setRotation((i10 == 0 ? 1 : -1) * 30.0f);
            contestVotingItemView.animate().setDuration(M()).setStartDelay(((long) i10) * 100).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).rotation(0.0f).setListener(null).start();
            i10 = i11;
        }
        List<CircularProgressIndicator> list3 = this.f153830g;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloaders");
        } else {
            list = list3;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((CircularProgressIndicator) it.next()).setVisibility(8);
        }
    }

    private final void V(final eb.d dVar, Integer num) {
        String strA;
        List<eb.c> listH;
        List<ContestVotingItemView> list = this.f153829f;
        db.l lVar = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list = null;
        }
        final int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
            eb.c cVar = (dVar == null || (listH = dVar.h()) == null) ? null : listH.get(i10);
            Boolean boolValueOf = Boolean.valueOf(num != null && num.intValue() == i10);
            if (cVar == null || (strA = cVar.a()) == null) {
                strA = "";
            }
            contestVotingItemView.f(boolValueOf, new k3(strA), new k3(com.planner5d.library.contest.e.r.f151535g4, Integer.valueOf((int) Math.rint((cVar != null ? cVar.c() : 0.0f) * 100))));
            List<com.planner5d.library.services.bitmaploader.target.k> list2 = this.f153832i;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemViewsAvatarSlots");
                list2 = null;
            }
            list2.get(i10).b(contestVotingItemView.e()).c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.contest.view.voting.i
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return ContestVotingFragment.W(dVar, i10, this, aVar);
                }
            }).i();
            i10 = i11;
        }
        db.l lVar2 = this.f153833j;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            lVar = lVar2;
        }
        final ContestVotingProgressView contestVotingProgressView = lVar.f269837b;
        contestVotingProgressView.setVisibility(0);
        contestVotingProgressView.a(new Function0() { // from class: com.planner5d.library.contest.view.voting.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContestVotingFragment.X(contestVotingProgressView, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d W(eb.d dVar, int i10, ContestVotingFragment contestVotingFragment, com.planner5d.library.services.bitmaploader.target.a aVar) {
        List<eb.c> listH;
        eb.c cVar = (dVar == null || (listH = dVar.h()) == null) ? null : listH.get(i10);
        m mVarO = contestVotingFragment.O();
        Intrinsics.checkNotNull(aVar);
        return mVarO.k0(cVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(ContestVotingProgressView contestVotingProgressView, ContestVotingFragment contestVotingFragment) {
        contestVotingProgressView.setVisibility(4);
        contestVotingFragment.O().t0();
        return Unit.f312394a;
    }

    private final void Y(boolean z10) {
        List<ContestVotingItemView> list = this.f153829f;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list = null;
        }
        final int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
            if (z10) {
                contestVotingItemView.setEnabled(true);
                contestVotingItemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.voting.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContestVotingFragment.Z(this.f153872a, i10, view);
                    }
                });
            } else {
                contestVotingItemView.setOnClickListener(null);
                contestVotingItemView.setEnabled(false);
                contestVotingItemView.setFocusable(false);
                contestVotingItemView.setFocusableInTouchMode(false);
                contestVotingItemView.setClickable(false);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(ContestVotingFragment contestVotingFragment, int i10, View view) {
        contestVotingFragment.O().u0(Integer.valueOf(i10));
    }

    private final void a0(final eb.d dVar) {
        final int i10 = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Y(false);
        List<ContestVotingItemView> list = this.f153829f;
        db.l lVar = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list = null;
        }
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
            contestVotingItemView.f(null, null, null);
            List<com.planner5d.library.services.bitmaploader.target.k> list2 = this.f153831h;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemViewsSlots");
                list2 = null;
            }
            list2.get(i10).b(new d(atomicInteger, this, contestVotingItemView.d())).c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.contest.view.voting.d
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return ContestVotingFragment.b0(this.f153857a, dVar, i10, aVar);
                }
            }).i();
            i10 = i11;
        }
        db.l lVar2 = this.f153833j;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            lVar = lVar2;
        }
        ContestVotingProgressView contestVotingProgressView = lVar.f269837b;
        contestVotingProgressView.c();
        contestVotingProgressView.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d b0(ContestVotingFragment contestVotingFragment, eb.d dVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        List<eb.b> listG;
        m mVarO = contestVotingFragment.O();
        eb.b bVar = (dVar == null || (listG = dVar.g()) == null) ? null : listG.get(i10);
        Intrinsics.checkNotNull(aVar);
        return mVarO.l0(bVar, aVar);
    }

    private final void c0() {
        List<ContestVotingItemView> list = this.f153829f;
        List<CircularProgressIndicator> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list = null;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ContestVotingItemView contestVotingItemView = (ContestVotingItemView) obj;
            contestVotingItemView.setAlpha(1.0f);
            contestVotingItemView.setScaleX(1.0f);
            contestVotingItemView.setScaleY(1.0f);
            ViewPropertyAnimator viewPropertyAnimatorRotation = contestVotingItemView.animate().setDuration(M()).setStartDelay(((long) i10) * 100).alpha(0.0f).scaleX(0.4f).scaleY(0.4f).rotation((i10 == 0 ? -1 : 1) * 30.0f);
            if (i10 == 0) {
                viewPropertyAnimatorRotation.withEndAction(new Runnable() { // from class: com.planner5d.library.contest.view.voting.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContestVotingFragment.d0(this.f153853a);
                    }
                });
            }
            viewPropertyAnimatorRotation.start();
            i10 = i11;
        }
        List<CircularProgressIndicator> list3 = this.f153830g;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preloaders");
        } else {
            list2 = list3;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((CircularProgressIndicator) it.next()).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ContestVotingFragment contestVotingFragment) {
        contestVotingFragment.O().n0();
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
    public final com.planner5d.library.services.utility.c2 getNetworkStateUtility$P5D_Library_Contest_release() {
        com.planner5d.library.services.utility.c2 c2Var = this.networkStateUtility;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("networkStateUtility");
        return null;
    }

    @NotNull
    public final l3 getStatisticsEventContests$P5D_Library_Contest_release() {
        l3 l3Var = this.statisticsEventContests;
        if (l3Var != null) {
            return l3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsEventContests");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).B(com.planner5d.library.contest.e.C1519e.Lm).C(com.planner5d.library.contest.e.C1519e.Vf).A(com.planner5d.library.contest.e.C1519e.Vf).z(com.planner5d.library.contest.e.C1519e.Vf).H(true).G(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f153835l = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        final db.l lVarC = db.l.c(inflater);
        Intrinsics.checkNotNullExpressionValue(lVarC, "inflate(...)");
        setHasOptionsMenu(true);
        this.f153829f = CollectionsKt.listOf((Object[]) new ContestVotingItemView[]{lVarC.f269838c, lVarC.f269840e});
        this.f153830g = CollectionsKt.listOf((Object[]) new CircularProgressIndicator[]{lVarC.f269839d, lVarC.f269841f});
        List<ContestVotingItemView> list = this.f153829f;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list = null;
        }
        List<ContestVotingItemView> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ContestVotingItemView contestVotingItemView : list2) {
            com.planner5d.library.services.bitmaploader.target.h hVar = this.f153835l;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar = null;
            }
            arrayList.add(new com.planner5d.library.services.bitmaploader.target.k(hVar, p0.a(this)));
        }
        this.f153831h = arrayList;
        List<ContestVotingItemView> list3 = this.f153829f;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemViews");
            list3 = null;
        }
        List<ContestVotingItemView> list4 = list3;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (ContestVotingItemView contestVotingItemView2 : list4) {
            com.planner5d.library.services.bitmaploader.target.h hVar2 = this.f153835l;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar2 = null;
            }
            arrayList2.add(new com.planner5d.library.services.bitmaploader.target.k(hVar2, p0.a(this)));
        }
        this.f153832i = arrayList2;
        Y(false);
        final long jD = new com.planner5d.library.services.utility.j(getArguments()).d(r.contestUid, -1L);
        O().d0().k(this, new a(new Function1() { // from class: com.planner5d.library.contest.view.voting.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestVotingFragment.P(this.f153862a, lVarC, jD, (com.planner5d.library.contest.c) obj);
            }
        }));
        O().c0().k(this, new a(new Function1() { // from class: com.planner5d.library.contest.view.voting.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestVotingFragment.Q(lVarC, this, (a0) obj);
            }
        }));
        O().s0(Long.valueOf(jD));
        this.f153833j = lVarC;
        ConstraintLayout constraintLayoutB = lVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public final void setLanguageManager$P5D_Library_Contest_release(@NotNull o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<set-?>");
        this.languageManager = o1Var;
    }

    public final void setMessageManager$P5D_Library_Contest_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }

    public final void setNetworkStateUtility$P5D_Library_Contest_release(@NotNull com.planner5d.library.services.utility.c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.networkStateUtility = c2Var;
    }

    public final void setStatisticsEventContests$P5D_Library_Contest_release(@NotNull l3 l3Var) {
        Intrinsics.checkNotNullParameter(l3Var, "<set-?>");
        this.statisticsEventContests = l3Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @Nullable
    protected com.planner5d.library.widget.menu.l t(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String string = getString(com.planner5d.library.contest.e.r.Fr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, string.length(), 0);
        return new com.planner5d.library.widget.menu.l(inflater, menu, com.planner5d.library.contest.e.m.f151338b, null, 8, null).b(com.planner5d.library.contest.e.i.K0).p(spannableString).q(Intrinsics.areEqual(O().d0().f(), com.planner5d.library.contest.c.C1518c.f148481b)).b(new p() { // from class: com.planner5d.library.contest.view.voting.e
            @Override // com.planner5d.library.widget.menu.p
            public final void a(Activity activity, MenuItem menuItem) {
                ContestVotingFragment.K(this.f153860a, activity, menuItem);
            }
        });
    }
}
