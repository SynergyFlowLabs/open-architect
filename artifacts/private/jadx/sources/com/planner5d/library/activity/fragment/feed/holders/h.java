package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.s5;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.u0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.t;
import com.planner5d.library.widget.EnhancedRecyclerView;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.util.Date;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHolderDesignContestItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderDesignContestItem.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderDesignContestItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n257#2,2:142\n257#2,2:144\n257#2,2:146\n257#2,2:148\n257#2,2:150\n257#2,2:152\n257#2,2:154\n1#3:156\n*S KotlinDebug\n*F\n+ 1 ViewHolderDesignContestItem.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderDesignContestItem\n*L\n80#1:142,2\n85#1:144,2\n97#1:146,2\n109#1:148,2\n114#1:150,2\n122#1:152,2\n127#1:154,2\n*E\n"})
public final class h extends com.planner5d.library.feed.view.holders.c<Pair<? extends Contest, ? extends Project>> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f133393l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s5 f133394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ja.c f133395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f133396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s0 f133397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f133398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.contest.g f133399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n1 f133400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final u0 f133401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private p2 f133402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.services.bitmaploader.target.k f133403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f133404k;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.holders.ViewHolderDesignContestItem$bind$2", f = "ViewHolderDesignContestItem.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133405a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<Contest, Project> f133407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Pair<Contest, Project> pair, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f133407c = pair;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h.this.new a(this.f133407c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133405a;
            if (i10 == 0) {
                ResultKt.m(obj);
                h hVar = h.this;
                Pair<Contest, Project> pair = this.f133407c;
                Contest first = pair != null ? pair.getFirst() : null;
                Pair<Contest, Project> pair2 = this.f133407c;
                Project second = pair2 != null ? pair2.getSecond() : null;
                this.f133405a = 1;
                if (hVar.q(first, second, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.holders.ViewHolderDesignContestItem", f = "ViewHolderDesignContestItem.kt", i = {0, 0, 0}, l = {76}, m = "configureVoteState", n = {"this", "contest", "contestProject"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f133410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f133411d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f133413f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133411d = obj;
            this.f133413f |= Integer.MIN_VALUE;
            return h.this.q(null, null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(@NotNull s5 binding, @NotNull ja.c viewHolderProjectListener, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull s0 scope, @NotNull t coroutineDispatchers, @NotNull com.planner5d.library.model.manager.contest.g contestManager, @NotNull n1 languageManager, @NotNull u0 hapticManager) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f133394a = binding;
        this.f133395b = viewHolderProjectListener;
        this.f133396c = imageManager;
        this.f133397d = scope;
        this.f133398e = coroutineDispatchers;
        this.f133399f = contestManager;
        this.f133400g = languageManager;
        this.f133401h = hapticManager;
        this.f133403j = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
        this.f133404k = this.itemView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(h hVar, View view) {
        hVar.f133395b.b(hVar.getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.d.C1663d p(h hVar, Pair pair, com.planner5d.library.services.bitmaploader.target.a aVar) {
        y0 y0Var = hVar.f133396c;
        Contest contest = (Contest) pair.getFirst();
        String strA = contest != null ? contest.A() : null;
        int i10 = hVar.f133404k;
        return y0Var.b(strA, i10, i10, aVar, 4L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object q(final Contest contest, Project project, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f133413f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f133413f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objV = bVar.f133411d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f133413f;
        if (i11 == 0) {
            ResultKt.m(objV);
            com.planner5d.library.model.manager.contest.g gVar = this.f133399f;
            bVar.f133408a = this;
            bVar.f133409b = contest;
            bVar.f133410c = project;
            bVar.f133413f = 1;
            objV = gVar.v(bVar);
            if (objV == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            project = (Project) bVar.f133410c;
            contest = (Contest) bVar.f133409b;
            this = (h) bVar.f133408a;
            ResultKt.m(objV);
        }
        Date date = (Date) objV;
        boolean z10 = project != null;
        boolean z11 = z10 && project.contestStatus == com.planner5d.library.database.model.project.a.Submitted.f154201a;
        boolean zN = contest != null ? contest.N(date) : true;
        ImageView success = this.f133394a.f159649o3;
        Intrinsics.checkNotNullExpressionValue(success, "success");
        success.setVisibility(8);
        ButtonTextView buttonTextView = this.f133394a.f159651q3;
        if (zN) {
            buttonTextView.setVisibility(4);
        } else if (!z10) {
            Intrinsics.checkNotNull(buttonTextView);
            buttonTextView.setVisibility(0);
            buttonTextView.setEnabled(true);
            buttonTextView.setAlpha(1.0f);
            buttonTextView.setText(com.planner5d.library.f.s.f169484v4);
            buttonTextView.setBackgroundResource(com.planner5d.library.f.h.f167890y5);
            buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.holders.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.r(this.f133387a, contest, view);
                }
            });
        } else if (!z11) {
            Intrinsics.checkNotNull(buttonTextView);
            buttonTextView.setVisibility(0);
            buttonTextView.setEnabled(true);
            buttonTextView.setAlpha(1.0f);
            buttonTextView.setText(com.planner5d.library.f.s.f169412s4);
            buttonTextView.setBackgroundResource(com.planner5d.library.f.h.f167890y5);
            buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.holders.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.s(this.f133389a, contest, view);
                }
            });
        } else if (contest.P(date)) {
            Intrinsics.checkNotNull(buttonTextView);
            buttonTextView.setVisibility(0);
            buttonTextView.setEnabled(true);
            buttonTextView.setAlpha(1.0f);
            buttonTextView.setText(com.planner5d.library.f.s.R4);
            buttonTextView.setBackgroundResource(com.planner5d.library.f.h.A5);
            ImageView success2 = this.f133394a.f159649o3;
            Intrinsics.checkNotNullExpressionValue(success2, "success");
            success2.setVisibility(0);
            buttonTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.holders.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.t(this.f133391a, contest, view);
                }
            });
        } else {
            Intrinsics.checkNotNull(buttonTextView);
            buttonTextView.setVisibility(0);
            buttonTextView.setEnabled(false);
            buttonTextView.setAlpha(0.5f);
            buttonTextView.setText(com.planner5d.library.f.s.R4);
            buttonTextView.setBackgroundResource(com.planner5d.library.f.h.A5);
            ImageView success3 = this.f133394a.f159649o3;
            Intrinsics.checkNotNullExpressionValue(success3, "success");
            success3.setVisibility(0);
            int i12 = 4 ^ 0;
            buttonTextView.setOnClickListener(null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(h hVar, Contest contest, View view) {
        u0 u0Var = hVar.f133401h;
        Intrinsics.checkNotNull(view);
        u0Var.a(view);
        hVar.f133395b.j(contest, hVar.getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(h hVar, Contest contest, View view) {
        u0 u0Var = hVar.f133401h;
        Intrinsics.checkNotNull(view);
        u0Var.a(view);
        hVar.f133395b.A(contest, hVar.getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(h hVar, Contest contest, View view) {
        u0 u0Var = hVar.f133401h;
        Intrinsics.checkNotNull(view);
        u0Var.a(view);
        hVar.f133395b.t(contest, hVar.getBindingAdapterPosition());
    }

    @Override // com.planner5d.library.feed.view.holders.c
    public void a() {
        p2 p2Var = this.f133402i;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f133402i = null;
        this.f133403j.a();
    }

    @Override // com.planner5d.library.feed.view.holders.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable final Pair<Contest, Project> pair) {
        s5 s5Var = this.f133394a;
        s5Var.s1(this.f133400g);
        s5Var.r1(pair != null ? pair.getFirst() : null);
        s5Var.q1(EnhancedRecyclerView.e.LIST);
        s5Var.t1(Boolean.TRUE);
        s5Var.s();
        s5Var.f159646l3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.holders.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.o(this.f133384a, view);
            }
        });
        p2 p2Var = this.f133402i;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f133402i = kotlinx.coroutines.k.f(this.f133397d, this.f133398e.a(), null, new a(pair, null), 2, null);
        com.planner5d.library.services.bitmaploader.target.k kVar = this.f133403j;
        ImageView preview = this.f133394a.f159647m3;
        Intrinsics.checkNotNullExpressionValue(preview, "preview");
        com.planner5d.library.services.bitmaploader.target.k.b bVarB = kVar.b(com.planner5d.library.widget.bitmaptarget.a.g(preview, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
        if (pair != null) {
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.feed.holders.d
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return h.p(this.f133385a, pair, aVar);
                }
            });
        }
        bVarB.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(@NotNull Context context, @NotNull ja.c viewHolderProjectListener, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull s0 scope, @NotNull t coroutineDispatchers, @NotNull com.planner5d.library.model.manager.contest.g contestManager, @NotNull n1 languageManager, @NotNull u0 hapticManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        s5 s5VarM1 = s5.m1(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(s5VarM1, "inflate(...)");
        this(s5VarM1, viewHolderProjectListener, bitmapTargetManager, imageManager, scope, coroutineDispatchers, contestManager, languageManager, hapticManager);
    }
}
