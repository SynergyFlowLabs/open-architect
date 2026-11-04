package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.lifecycle.c2;
import androidx.lifecycle.d1;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.databinding.a6;
import com.planner5d.library.databinding.y5;
import com.planner5d.library.widget.EnhancedRecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderDocument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderDocument.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,155:1\n1#2:156\n257#3,2:157\n257#3,2:159\n257#3,2:161\n257#3,2:163\n257#3,2:165\n257#3,2:167\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderDocument.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderDocument\n*L\n71#1:157,2\n118#1:159,2\n150#1:161,2\n151#1:163,2\n152#1:165,2\n130#1:167,2\n*E\n"})
public final class k extends com.planner5d.library.activity.fragment.list.holders.a<com.planner5d.library.database.model.spaces.documents.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f134135j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.databinding.e0 f134136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f134137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f134138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f134139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final n1<com.planner5d.library.database.model.spaces.documents.a> f134141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.services.bitmaploader.target.k f134142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f134143i;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.holders.MainListViewHolderDocument$renderRemoteDocument$1$1", f = "MainListViewHolderDocument.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134144a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f134146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.database.model.spaces.documents.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f134146c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new a(this.f134146c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134144a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.spaces.documents.c cVar = k.this.f134138d;
                com.planner5d.library.database.model.spaces.documents.a aVar = this.f134146c;
                this.f134144a = 1;
                if (cVar.g1(aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134147a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134147a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f134147a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134147a.invoke(obj);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public k(@NotNull androidx.databinding.e0 binding, @NotNull l1 viewModel, @NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.services.utility.p0 formatter, @Nullable n1<com.planner5d.library.database.model.spaces.documents.a> n1Var) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134136b = binding;
        this.f134137c = viewModel;
        this.f134138d = documentsManager;
        this.f134139e = scope;
        this.f134140f = formatter;
        this.f134141g = n1Var;
        this.f134142h = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
        this.f134143i = this.itemView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh);
    }

    private final void A(final y5 y5Var, final com.planner5d.library.database.model.spaces.documents.a aVar) {
        FrameLayout downloadButton = y5Var.f159971m3;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        downloadButton.setVisibility(0);
        E(y5Var, false);
        y5Var.f159971m3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.B(y5Var, this, aVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(final y5 y5Var, final k kVar, final com.planner5d.library.database.model.spaces.documents.a aVar, View view) {
        y5Var.f159971m3.setOnClickListener(null);
        kVar.E(y5Var, true);
        kotlinx.coroutines.k.f(kVar.f134139e, null, null, kVar.new a(aVar, null), 3, null);
        androidx.lifecycle.o0 o0VarS = y5Var.S();
        if (o0VarS != null) {
            kVar.f134138d.G0().k(o0VarS, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k.C(this.f134130a, aVar, y5Var, (com.planner5d.library.activity.fragment.spaces.view.d) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(k kVar, com.planner5d.library.database.model.spaces.documents.a aVar, y5 y5Var, com.planner5d.library.activity.fragment.spaces.view.d dVar) {
        if (kVar.f134138d.i0(aVar) != null) {
            if (dVar instanceof com.planner5d.library.activity.fragment.spaces.view.p) {
                FrameLayout downloadButton = y5Var.f159971m3;
                Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
                downloadButton.setVisibility(8);
                l1.M1(kVar.f134137c, false, null, 2, null);
            } else {
                Intrinsics.checkNotNull(dVar);
                kVar.D(y5Var, dVar);
            }
        }
        return Unit.f312394a;
    }

    private final void D(y5 y5Var, com.planner5d.library.activity.fragment.spaces.view.d dVar) {
        boolean z10 = dVar instanceof com.planner5d.library.activity.fragment.spaces.view.k;
        E(y5Var, z10);
        if (z10) {
            com.planner5d.library.activity.fragment.spaces.view.k kVar = (com.planner5d.library.activity.fragment.spaces.view.k) dVar;
            y5Var.f159975q3.setIndeterminate(kVar.c() == null);
            CircularProgressIndicator circularProgressIndicator = y5Var.f159975q3;
            Integer numC = kVar.c();
            circularProgressIndicator.setProgress(numC != null ? numC.intValue() : 100);
        }
    }

    private final void E(y5 y5Var, boolean z10) {
        FrameLayout downloadButton = y5Var.f159971m3;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        int i10 = 0;
        downloadButton.setVisibility(0);
        ImageView downloadIcon = y5Var.f159972n3;
        Intrinsics.checkNotNullExpressionValue(downloadIcon, "downloadIcon");
        downloadIcon.setVisibility(!z10 ? 0 : 8);
        CircularProgressIndicator progress = y5Var.f159975q3;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        if (!z10) {
            i10 = 8;
        }
        progress.setVisibility(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(com.planner5d.library.database.model.spaces.documents.a aVar, l1.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return aVar != null && it.f().contains(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d s(k kVar, com.planner5d.library.database.model.spaces.documents.a aVar, com.planner5d.library.services.bitmaploader.target.a aVar2, com.planner5d.library.services.bitmaploader.target.a aVar3) {
        return kVar.f134138d.U0(aVar, aVar2, kVar.f134143i);
    }

    private final View.OnClickListener t(final com.planner5d.library.database.model.spaces.documents.a aVar) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.u(this.f134123a, aVar, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(k kVar, com.planner5d.library.database.model.spaces.documents.a aVar, View view) {
        kVar.f134137c.A1(aVar);
    }

    private final View.OnLongClickListener v(final com.planner5d.library.database.model.spaces.documents.a aVar) {
        return new View.OnLongClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return k.w(this.f134127a, aVar, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(k kVar, com.planner5d.library.database.model.spaces.documents.a aVar, View view) {
        return kVar.f134137c.I1(aVar);
    }

    private final View.OnClickListener x(final n1<com.planner5d.library.database.model.spaces.documents.a> n1Var, final View view, final com.planner5d.library.database.model.spaces.documents.a aVar) {
        return new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.y(n1Var, view, aVar, view2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(n1 n1Var, View view, com.planner5d.library.database.model.spaces.documents.a aVar, View view2) {
        if (n1Var != null) {
            n1Var.a(view, aVar);
        }
    }

    private final String z(Context context, com.planner5d.library.database.model.spaces.documents.a aVar) {
        return this.f134140f.m(context, aVar != null ? aVar.m() : null);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable final com.planner5d.library.database.model.spaces.documents.a aVar) {
        Context context = this.f134136b.getRoot().getContext();
        androidx.databinding.e0 e0Var = this.f134136b;
        androidx.lifecycle.w0<Boolean> w0VarH = c2.h(this.f134137c.d1(), new Function1() { // from class: com.planner5d.library.activity.fragment.list.holders.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k.r(aVar, (l1.i) obj));
            }
        });
        if (!(e0Var instanceof y5)) {
            if (e0Var instanceof a6) {
                a6 a6Var = (a6) e0Var;
                a6Var.x1(this.f134137c.q1());
                a6Var.w1(w0VarH);
                a6Var.A1(aVar != null ? aVar.q() : null);
                Intrinsics.checkNotNull(context);
                a6Var.z1(z(context, aVar));
                a6Var.t1(t(aVar));
                a6Var.v1(v(aVar));
                n1<com.planner5d.library.database.model.spaces.documents.a> n1Var = this.f134141g;
                ImageButton buttonMenu = a6Var.f158709l3;
                Intrinsics.checkNotNullExpressionValue(buttonMenu, "buttonMenu");
                a6Var.y1(x(n1Var, buttonMenu, aVar));
            }
        }
        y5 y5Var = (y5) e0Var;
        y5Var.x1(this.f134137c.q1());
        y5Var.w1(w0VarH);
        y5Var.A1(aVar != null ? aVar.q() : null);
        Intrinsics.checkNotNull(context);
        y5Var.z1(z(context, aVar));
        y5Var.t1(t(aVar));
        y5Var.v1(v(aVar));
        n1<com.planner5d.library.database.model.spaces.documents.a> n1Var2 = this.f134141g;
        ImageButton buttonMenu2 = y5Var.f159970l3;
        Intrinsics.checkNotNullExpressionValue(buttonMenu2, "buttonMenu");
        y5Var.y1(x(n1Var2, buttonMenu2, aVar));
        FrameLayout downloadButton = y5Var.f159971m3;
        Intrinsics.checkNotNullExpressionValue(downloadButton, "downloadButton");
        downloadButton.setVisibility(8);
        if (aVar != null && aVar.u()) {
            ImageView image = y5Var.f159973o3;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            final com.planner5d.library.services.bitmaploader.target.a aVarG = com.planner5d.library.widget.bitmaptarget.a.g(image, com.planner5d.library.widget.drawable.h.b.Document, null, 2, null);
            com.planner5d.library.services.bitmaploader.target.k.b bVarB = this.f134142h.b(aVarG);
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.list.holders.g
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar2) {
                    return k.s(this.f134119a, aVar, aVarG, aVar2);
                }
            });
            bVarB.i();
        } else if (aVar != null) {
            A(y5Var, aVar);
        }
        e0Var.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(@NotNull Context context, @NotNull l1 viewModel, @NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.services.utility.p0 formatter, @Nullable n1<com.planner5d.library.database.model.spaces.documents.a> n1Var) {
        androidx.databinding.e0 e0VarP1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (viewModel.S0().f() == EnhancedRecyclerView.e.GRID) {
            e0VarP1 = y5.p1(layoutInflaterFrom);
            Intrinsics.checkNotNull(e0VarP1);
        } else {
            e0VarP1 = a6.p1(layoutInflaterFrom);
            Intrinsics.checkNotNull(e0VarP1);
        }
        androidx.databinding.e0 e0Var = e0VarP1;
        e0Var.C0(lifecycleOwner);
        this(e0Var, viewModel, documentsManager, bitmapTargetManager, scope, formatter, n1Var);
    }
}
