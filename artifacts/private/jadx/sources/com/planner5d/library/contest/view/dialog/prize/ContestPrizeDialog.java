package com.planner5d.library.contest.view.dialog.prize;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.model.manager.y2;
import com.planner5d.library.model.u;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.AnimatedImageView;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q1;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestPrizeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestPrizeDialog.kt\ncom/planner5d/library/contest/view/dialog/prize/ContestPrizeDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,169:1\n16#2:170\n257#3,2:171\n*S KotlinDebug\n*F\n+ 1 ContestPrizeDialog.kt\ncom/planner5d/library/contest/view/dialog/prize/ContestPrizeDialog\n*L\n46#1:170\n84#1:171,2\n*E\n"})
public final class ContestPrizeDialog extends ContentDialog<Void> implements n0 {
    public static final int $stable = 8;

    @ij.a
    public x2 configuration;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    @ij.a
    public c2 messageManager;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private fb.a f153586o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final f0 f153587p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private db.b f153588q3;

    @ij.a
    public y2 rateUsManagerService;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153589a;

        static {
            int[] iArr = new int[m.a.values().length];
            try {
                iArr[m.a.NO_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.a.NO_MATCHING_CONTEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.a.SYNCHRONIZATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153589a = iArr;
        }
    }

    /* synthetic */ class b extends g0 implements Function1<m.a, Unit> {
        b(Object obj) {
            super(1, obj, ContestPrizeDialog.class, "processFailure", "processFailure(Lcom/planner5d/library/contest/view/dialog/prize/ContestPrizeViewModel$Failure;)V", 0);
        }

        public final void X(m.a p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((ContestPrizeDialog) this.receiver).m0(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m.a aVar) {
            X(aVar);
            return Unit.f312394a;
        }
    }

    public static final class c extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f153590a;

        c(int i10) {
            this.f153590a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (parent.s0(view) != 0) {
                outRect.left = this.f153590a;
            }
        }
    }

    static final class d implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153591a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153591a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153591a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153591a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestPrizeDialog.kt\ncom/planner5d/library/contest/view/dialog/prize/ContestPrizeDialog\n*L\n1#1,16:1\n46#2:17\n*E\n"})
    public static final class e implements Function0<l2> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestPrizeDialog.this.getViewModelStore();
        }
    }

    public static final class f implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153593a;

        public f(com.planner5d.library.view.b bVar) {
            this.f153593a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153593a;
        }
    }

    public ContestPrizeDialog() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        int i10 = 1 << 0;
        this.f153587p3 = new i2(j1.d(m.class), new e(), new f(c1517a.a()), null, 8, null);
        c1517a.a().r(this);
    }

    private final void a0() {
        t tVarH = H();
        db.b bVar = this.f153588q3;
        db.b bVar2 = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        tVarH.b(bVar.f269756h);
        db.b bVar3 = this.f153588q3;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar3 = null;
        }
        bVar3.f269752d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.prize.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestPrizeDialog.b0(this.f153594a, view);
            }
        });
        db.b bVar4 = this.f153588q3;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar4 = null;
        }
        bVar4.f269754f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.prize.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestPrizeDialog.c0(this.f153595a, view);
            }
        });
        db.b bVar5 = this.f153588q3;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bVar2 = bVar5;
        }
        TextView textView = bVar2.f269750b;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(k0().q0() ? 0 : 8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.prize.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestPrizeDialog.d0(this.f153596a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(ContestPrizeDialog contestPrizeDialog, View view) {
        contestPrizeDialog.getRateUsManagerService$P5D_Library_Contest_release().a(com.planner5d.library.widget.rate.c.OnContestPrizeClaimed);
        contestPrizeDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(ContestPrizeDialog contestPrizeDialog, View view) {
        contestPrizeDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ContestPrizeDialog contestPrizeDialog, View view) {
        m mVarK0 = contestPrizeDialog.k0();
        s sVarRequireActivity = contestPrizeDialog.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        mVarK0.u0(sVarRequireActivity, new com.planner5d.library.services.utility.j(contestPrizeDialog.getArguments()).f(r.test, false));
        contestPrizeDialog.dismiss();
    }

    private final void e0() {
        m mVarK0 = k0();
        mVarK0.m0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.dialog.prize.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestPrizeDialog.h0(this.f153597a, (Boolean) obj);
            }
        }));
        mVarK0.p0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.dialog.prize.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestPrizeDialog.i0(this.f153598a, (String) obj);
            }
        }));
        mVarK0.n0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.contest.view.dialog.prize.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestPrizeDialog.f0(this.f153599a, (List) obj);
            }
        }));
        mVarK0.l0().k(getViewLifecycleOwner(), new d(new b(this)));
        mVarK0.k0().k(getViewLifecycleOwner(), new d1() { // from class: com.planner5d.library.contest.view.dialog.prize.g
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                ContestPrizeDialog.g0(this.f153600a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(ContestPrizeDialog contestPrizeDialog, List list) {
        fb.a aVar = contestPrizeDialog.f153586o3;
        if (aVar != null) {
            Intrinsics.checkNotNull(list);
            aVar.j(list);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(ContestPrizeDialog contestPrizeDialog, Object obj) {
        contestPrizeDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(ContestPrizeDialog contestPrizeDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        contestPrizeDialog.o0(bool.booleanValue());
        db.b bVar = contestPrizeDialog.f153588q3;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        AnimatedImageView contestPrizeChestAnimation = bVar.f269751c;
        Intrinsics.checkNotNullExpressionValue(contestPrizeChestAnimation, "contestPrizeChestAnimation");
        contestPrizeDialog.l0(contestPrizeChestAnimation, !bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(ContestPrizeDialog contestPrizeDialog, String str) {
        db.b bVar = contestPrizeDialog.f153588q3;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVar = null;
        }
        TextView textView = bVar.f269755g;
        q1 q1Var = q1.f312784a;
        String string = contestPrizeDialog.getString(com.planner5d.library.contest.e.r.O5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView.setText(str2);
        return Unit.f312394a;
    }

    private final void j0(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        fb.a aVar = new fb.a(contextRequireContext, getConfiguration$P5D_Library_Contest_release());
        this.f153586o3 = aVar;
        recyclerView.n(new c(recyclerView.getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150340yf)));
        recyclerView.setAdapter(aVar);
    }

    private final m k0() {
        return (m) this.f153587p3.getValue();
    }

    private final void l0(AnimatedImageView animatedImageView, boolean z10) {
        if (z10) {
            animatedImageView.b(com.planner5d.library.contest.e.g.B0);
        } else {
            animatedImageView.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(m.a aVar) {
        int i10 = a.f153589a[aVar.ordinal()];
        if (i10 == 1) {
            getMessageManager$P5D_Library_Contest_release().e(new u(u.c.Error, new k3(com.planner5d.library.contest.e.r.Z7, new Object[0]), new u.a(new k3(com.planner5d.library.contest.e.r.xp, new Object[0]), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.contest.view.dialog.prize.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContestPrizeDialog.n0(this.f153601a);
                }
            }), u.f222819h));
        } else if (i10 == 2) {
            getMessageManager$P5D_Library_Contest_release().e(new u(u.c.Error, new k3(com.planner5d.library.contest.e.r.W8, new Object[0]), u.f222818g));
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            getMessageManager$P5D_Library_Contest_release().e(new u(u.c.Error, new k3(com.planner5d.library.contest.e.r.T9, new Object[0]), u.f222818g));
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(ContestPrizeDialog contestPrizeDialog) {
        contestPrizeDialog.getDialogLauncher$P5D_Library_Contest_release().c(ContestPrizeDialog.class).h(new com.planner5d.library.services.utility.i().g(r.contestUid, contestPrizeDialog.k0().o0()).a()).g();
        return Unit.f312394a;
    }

    private final void o0(boolean z10) {
        h0 h0VarA = H().a();
        if (z10) {
            h0VarA.p(getString(com.planner5d.library.contest.e.r.Nu), true);
        } else {
            h0VarA.b();
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        k0().t0(jVar.d(r.contestUid, -1L), jVar.f(r.test, false));
        db.b bVarD = db.b.d(LayoutInflater.from(getContext()), root, false);
        this.f153588q3 = bVarD;
        db.b bVar = null;
        if (bVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bVarD = null;
        }
        ConstraintLayout root2 = bVarD.getRoot();
        a0();
        db.b bVar2 = this.f153588q3;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bVar = bVar2;
        }
        RecyclerView contestPrizePrizes = bVar.f269757i;
        Intrinsics.checkNotNullExpressionValue(contestPrizePrizes, "contestPrizePrizes");
        j0(contestPrizePrizes);
        e0();
        Intrinsics.checkNotNullExpressionValue(root2, "apply(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.contest.e.l.f151249g0;
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
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher$P5D_Library_Contest_release() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
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
    public final y2 getRateUsManagerService$P5D_Library_Contest_release() {
        y2 y2Var = this.rateUsManagerService;
        if (y2Var != null) {
            return y2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rateUsManagerService");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog
    protected void onActivityCreatedWithSetup(@Nullable Bundle bundle) {
        super.onActivityCreatedWithSetup(bundle);
        com.planner5d.library.activity.fragment.dialog.i.b bVar = com.planner5d.library.activity.fragment.dialog.i.f132070d;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        O(bVar.a(contextRequireContext));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.P5);
    }

    public final void setConfiguration$P5D_Library_Contest_release(@NotNull x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "<set-?>");
        this.configuration = x2Var;
    }

    public final void setDialogLauncher$P5D_Library_Contest_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setMessageManager$P5D_Library_Contest_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }

    public final void setRateUsManagerService$P5D_Library_Contest_release(@NotNull y2 y2Var) {
        Intrinsics.checkNotNullParameter(y2Var, "<set-?>");
        this.rateUsManagerService = y2Var;
    }
}
