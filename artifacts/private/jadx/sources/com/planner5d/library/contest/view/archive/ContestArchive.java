package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.u;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.preloader.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
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
@SourceDebugExtension({"SMAP\nContestArchive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestArchive.kt\ncom/planner5d/library/contest/view/archive/ContestArchive\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,219:1\n16#2:220\n1#3:221\n774#4:222\n865#4,2:223\n257#5,2:225\n257#5,2:227\n*S KotlinDebug\n*F\n+ 1 ContestArchive.kt\ncom/planner5d/library/contest/view/archive/ContestArchive\n*L\n45#1:220\n122#1:222\n122#1:223,2\n143#1:225,2\n146#1:227,2\n*E\n"})
public final class ContestArchive extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f153380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f153381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private db.h f153382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f153383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private m f153384e;

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

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ContestParticipantView f153385h;

        a(ContestParticipantView contestParticipantView) {
            this.f153385h = contestParticipantView;
            contestParticipantView.setAvatar(com.planner5d.library.contest.e.g.f150555mc);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void b(boolean z10) {
            if (z10) {
                return;
            }
            this.f153385h.setAvatar((Bitmap) null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            this.f153385h.setAvatar(bitmap);
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153386a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153386a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153386a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153386a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestArchive.kt\ncom/planner5d/library/contest/view/archive/ContestArchive\n*L\n1#1,16:1\n45#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestArchive.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153388a;

        public d(com.planner5d.library.view.b bVar) {
            this.f153388a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153388a;
        }
    }

    public ContestArchive() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        this.f153380a = new i2(j1.d(n.class), new c(), new d(c1517a.a()), null, 8, null);
        this.f153381b = new t();
        c1517a.a().n(this);
    }

    private final void A(List<eb.a> list, boolean z10) {
        db.h hVar = this.f153382c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar = null;
        }
        ViewGroup.LayoutParams layoutParams = hVar.f269810t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = z10 ? -getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150340yf) : 0;
        }
        y3 y3Var = y3.f229862a;
        db.h hVar2 = this.f153382c;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar2 = null;
        }
        RoundedCornersLayout contestArchiveWinnersTable = hVar2.f269810t;
        Intrinsics.checkNotNullExpressionValue(contestArchiveWinnersTable, "contestArchiveWinnersTable");
        y3Var.e(contestArchiveWinnersTable, com.planner5d.library.contest.e.C1519e.Lm, com.planner5d.library.contest.e.f.He, com.planner5d.library.contest.e.C1519e.f149783wg, com.planner5d.library.contest.e.f.f150340yf, com.planner5d.library.contest.e.f.A1);
        db.h hVar3 = this.f153382c;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar3 = null;
        }
        hVar3.f269809s.removeAllViews();
        for (eb.a aVar : list) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContestParticipantView contestParticipantView = new ContestParticipantView(contextRequireContext, null, 0, 6, null);
            contestParticipantView.setContestPlace(aVar.n());
            contestParticipantView.setUserName(aVar.m());
            contestParticipantView.setVotesRateRatio(aVar.p());
            a aVar2 = new a(contestParticipantView);
            com.planner5d.library.services.bitmaploader.target.h hVar4 = this.f153383d;
            if (hVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar4 = null;
            }
            hVar4.c(aVar2);
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150326y1);
            getImageManager$P5D_Library_Contest_release().b(aVar.q(), dimensionPixelSize, dimensionPixelSize, aVar2, -3L);
            db.h hVar5 = this.f153382c;
            if (hVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hVar5 = null;
            }
            hVar5.f269809s.addView(contestParticipantView, new ViewGroup.LayoutParams(-1, -2));
            if (list.indexOf(aVar) != list.size() - 1) {
                db.h hVar6 = this.f153382c;
                if (hVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    hVar6 = null;
                }
                hVar6.f269809s.addView(new Space(requireContext()), new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.Df)));
            }
        }
    }

    private final n B() {
        return (n) this.f153380a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(ContestArchive contestArchive, com.planner5d.library.contest.c cVar) {
        m mVar;
        if (cVar instanceof com.planner5d.library.contest.c.f) {
            contestArchive.f153381b.a().p(contestArchive.getString(com.planner5d.library.contest.e.r.Nu), true);
        } else if (cVar instanceof com.planner5d.library.contest.c.a) {
            contestArchive.f153381b.a().b();
            contestArchive.getMessageManager$P5D_Library_Contest_release().e(new u(u.c.ContestError, ((com.planner5d.library.contest.c.a) cVar).a().toMessage().c(), new u.a[0]));
        } else if (cVar instanceof com.planner5d.library.contest.c.d) {
            contestArchive.f153381b.a().b();
            com.planner5d.library.contest.c.d dVar = (com.planner5d.library.contest.c.d) cVar;
            contestArchive.v(dVar.a(), dVar.b());
        } else if ((cVar instanceof com.planner5d.library.contest.c.h) && (mVar = contestArchive.f153384e) != null) {
            mVar.f();
        }
        return Unit.f312394a;
    }

    private final void v(Contest contest, List<eb.a> list) {
        db.h hVar;
        Object next;
        List<eb.a> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            hVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((eb.a) next).k());
        eb.a aVar = (eb.a) next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!((eb.a) obj).k()) {
                arrayList.add(obj);
            }
        }
        com.planner5d.library.services.q imageManager$P5D_Library_Contest_release = getImageManager$P5D_Library_Contest_release();
        com.planner5d.library.services.bitmaploader.target.h hVar2 = this.f153383d;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar2 = null;
        }
        m mVar = new m(imageManager$P5D_Library_Contest_release, hVar2);
        db.h hVar3 = this.f153382c;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            hVar = hVar3;
        }
        ConstraintLayout contestArchiveRendersCarouselContainer = hVar.f269801h;
        Intrinsics.checkNotNullExpressionValue(contestArchiveRendersCarouselContainer, "contestArchiveRendersCarouselContainer");
        mVar.c(list, contestArchiveRendersCarouselContainer, androidx.lifecycle.p0.a(this));
        this.f153384e = mVar;
        w(contest);
        z(aVar);
        A(arrayList, aVar != null);
    }

    @e.a({"SetTextI18n"})
    private final void w(Contest contest) {
        String strL = getFormatter$P5D_Library_Contest_release().l(contest.H());
        String strK = getFormatter$P5D_Library_Contest_release().k(contest.z());
        db.h hVar = this.f153382c;
        db.h hVar2 = null;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar = null;
        }
        hVar.f269798e.setText(strL + " - " + strK);
        db.h hVar3 = this.f153382c;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar3 = null;
        }
        hVar3.f269799f.setText(String.valueOf(contest.D()));
        db.h hVar4 = this.f153382c;
        if (hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar4 = null;
        }
        hVar4.f269797d.setText(getLanguageManager$P5D_Library_Contest_release().b(requireContext(), contest.C(), ""));
        db.h hVar5 = this.f153382c;
        if (hVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            hVar2 = hVar5;
        }
        hVar2.f269802i.setText(getLanguageManager$P5D_Library_Contest_release().b(requireContext(), contest.G(), ""));
    }

    private final void x() {
        db.h hVar = this.f153382c;
        db.h hVar2 = null;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar = null;
        }
        u1.j2(hVar.f269796c, new ef.g(0, 1, null));
        db.h hVar3 = this.f153382c;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            hVar2 = hVar3;
        }
        hVar2.f269795b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.archive.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestArchive.y(this.f153420a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ContestArchive contestArchive, View view) {
        androidx.navigation.fragment.f.a(contestArchive).z0();
    }

    private final void z(eb.a aVar) {
        com.planner5d.library.services.bitmaploader.target.h hVar = null;
        db.h hVar2 = null;
        if (aVar == null) {
            db.h hVar3 = this.f153382c;
            if (hVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                hVar2 = hVar3;
            }
            RoundedCornersLayout contestArchiveUserParticipant = hVar2.f269804k;
            Intrinsics.checkNotNullExpressionValue(contestArchiveUserParticipant, "contestArchiveUserParticipant");
            contestArchiveUserParticipant.setVisibility(8);
            return;
        }
        db.h hVar4 = this.f153382c;
        if (hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar4 = null;
        }
        RoundedCornersLayout contestArchiveUserParticipant2 = hVar4.f269804k;
        Intrinsics.checkNotNullExpressionValue(contestArchiveUserParticipant2, "contestArchiveUserParticipant");
        contestArchiveUserParticipant2.setVisibility(0);
        y3 y3Var = y3.f229862a;
        db.h hVar5 = this.f153382c;
        if (hVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar5 = null;
        }
        RoundedCornersLayout contestArchiveUserParticipant3 = hVar5.f269804k;
        Intrinsics.checkNotNullExpressionValue(contestArchiveUserParticipant3, "contestArchiveUserParticipant");
        y3Var.e(contestArchiveUserParticipant3, com.planner5d.library.contest.e.C1519e.Lm, com.planner5d.library.contest.e.f.He, com.planner5d.library.contest.e.C1519e.f149783wg, com.planner5d.library.contest.e.f.f150340yf, com.planner5d.library.contest.e.f.A1);
        db.h hVar6 = this.f153382c;
        if (hVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar6 = null;
        }
        hVar6.f269807n.setPlace(aVar.n());
        db.h hVar7 = this.f153382c;
        if (hVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar7 = null;
        }
        hVar7.f269806m.setText(aVar.m());
        db.h hVar8 = this.f153382c;
        if (hVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar8 = null;
        }
        TextView textView = hVar8.f269808o;
        int i10 = com.planner5d.library.contest.e.r.f151919w3;
        Integer numP = aVar.p();
        textView.setText(getString(i10, Integer.valueOf(numP != null ? numP.intValue() : 0)));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        db.h hVar9 = this.f153382c;
        if (hVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar9 = null;
        }
        ProfileIconView contestArchiveUserParticipantAvatar = hVar9.f269805l;
        Intrinsics.checkNotNullExpressionValue(contestArchiveUserParticipantAvatar, "contestArchiveUserParticipantAvatar");
        com.planner5d.library.services.bitmaploader.target.f fVar = new com.planner5d.library.services.bitmaploader.target.f(contextRequireContext, contestArchiveUserParticipantAvatar, Integer.valueOf(com.planner5d.library.contest.e.g.f150555mc));
        com.planner5d.library.services.bitmaploader.target.h hVar10 = this.f153383d;
        if (hVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
        } else {
            hVar = hVar10;
        }
        hVar.c(fVar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150326y1);
        getImageManager$P5D_Library_Contest_release().b(aVar.q(), dimensionPixelSize, dimensionPixelSize, fVar, -3L);
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
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f153383d = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        db.h hVarA = db.h.a(inflater.inflate(com.planner5d.library.contest.e.l.f151318v0, viewGroup, false));
        Intrinsics.checkNotNullExpressionValue(hVarA, "bind(...)");
        B().X().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.contest.view.archive.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestArchive.C(this.f153421a, (com.planner5d.library.contest.c) obj);
            }
        }));
        B().W(new com.planner5d.library.services.utility.j(getArguments()).d(r.contestUid, -1L));
        this.f153382c = hVarA;
        if (hVarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVarA = null;
        }
        FrameLayout root = hVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m mVar = this.f153384e;
        if (mVar != null) {
            mVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m mVar = this.f153384e;
        if (mVar != null) {
            mVar.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        x();
        t tVar = this.f153381b;
        db.h hVar = this.f153382c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hVar = null;
        }
        tVar.b(hVar.f269800g);
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
