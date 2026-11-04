package com.planner5d.library.contest.view.archive;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestArchiveListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestArchiveListAdapter.kt\ncom/planner5d/library/contest/view/archive/ContestArchiveListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class h extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f153429j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f153430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o1 f153431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.q f153432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f153433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f153434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.view.o f153435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final d f153436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f153437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private List<? extends j> f153438i;

    @w0(parameters = 1)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f153439a = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public final void g(@NotNull j item, @NotNull p0 formatter, @NotNull o1 contestLanguageManager, @NotNull com.planner5d.library.contest.view.o listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(contestLanguageManager, "contestLanguageManager");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.planner5d.library.contest.view.archive.ContestActiveView");
            ((ContestActiveView) view).y(item.a(), item.b(), item.c(), formatter, contestLanguageManager, listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements d {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f153440a;

            static {
                int[] iArr = new int[com.planner5d.library.contest.view.n.a.values().length];
                try {
                    iArr[com.planner5d.library.contest.view.n.a.ActiveContest.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.planner5d.library.contest.view.n.a.InactiveContest.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f153440a = iArr;
            }
        }

        @Override // com.planner5d.library.contest.view.archive.h.d
        @NotNull
        public View a(@NotNull ViewGroup parent, @NotNull com.planner5d.library.contest.view.n.a viewType) {
            int i10;
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(viewType, "viewType");
            int i11 = a.f153440a[viewType.ordinal()];
            if (i11 == 1) {
                i10 = com.planner5d.library.contest.e.l.B2;
            } else {
                if (i11 != 2) {
                    throw new k0();
                }
                i10 = com.planner5d.library.contest.e.l.C2;
            }
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(i10, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "let(...)");
            return viewInflate;
        }
    }

    @w0(parameters = 0)
    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f153441b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final f0 f153442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull final View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f153442a = g0.c(new Function0() { // from class: com.planner5d.library.contest.view.archive.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.c.j(itemView);
                }
            });
        }

        private final t i() {
            return (t) this.f153442a.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t j(View view) {
            return new t(view.findViewById(com.planner5d.library.contest.e.i.f151038s9));
        }

        public final void a() {
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.planner5d.library.contest.view.archive.ContestInactiveView");
            ((ContestInactiveView) view).a();
        }

        public final void h(boolean z10, @NotNull j.b item, @NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull w userAuthorization, @NotNull com.planner5d.library.contest.view.o listener, @NotNull com.planner5d.library.services.q imageManager) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(languageManager, "languageManager");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            eb.a aVarA = item.c() ? com.planner5d.library.contest.data.j.f148541a.a(item.a(), userAuthorization.a()) : null;
            if (aVarA == null) {
                aVarA = com.planner5d.library.contest.data.j.f148541a.b(item.d());
            }
            eb.a aVar = aVarA;
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.planner5d.library.contest.view.archive.ContestInactiveView");
            ((ContestInactiveView) view).c(item.a(), aVar, item.d(), item.c(), formatter, languageManager, bitmapTargetManager, listener, imageManager);
            h0 h0VarA = i().a();
            if (z10) {
                h0VarA.o(null, null);
            } else {
                h0VarA.b();
            }
        }
    }

    @l1
    @lm.n
    public interface d {
        @NotNull
        View a(@NotNull ViewGroup viewGroup, @NotNull com.planner5d.library.contest.view.n.a aVar);
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153443a;

        static {
            int[] iArr = new int[com.planner5d.library.contest.view.n.a.values().length];
            try {
                iArr[com.planner5d.library.contest.view.n.a.ActiveContest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.contest.view.n.a.InactiveContest.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153443a = iArr;
        }
    }

    public /* synthetic */ h(p0 p0Var, o1 o1Var, com.planner5d.library.services.q qVar, com.planner5d.library.services.bitmaploader.target.h hVar, w wVar, com.planner5d.library.contest.view.o oVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p0Var, o1Var, qVar, hVar, wVar, oVar, (i10 & 64) != 0 ? new b() : dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f153438i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        j jVar = this.f153438i.get(i10);
        if (jVar instanceof j.a) {
            return com.planner5d.library.contest.view.n.a.ActiveContest.n();
        }
        if (jVar instanceof j.b) {
            return com.planner5d.library.contest.view.n.a.InactiveContest.n();
        }
        throw new k0();
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.target.h h() {
        return this.f153433d;
    }

    @NotNull
    public final p0 i() {
        return this.f153430a;
    }

    public final boolean j() {
        return this.f153437h;
    }

    public final void k(@NotNull List<? extends j> contestListItems) {
        Intrinsics.checkNotNullParameter(contestListItems, "contestListItems");
        this.f153438i = contestListItems;
    }

    public final void l(boolean z10) {
        this.f153437h = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        j jVar = this.f153438i.get(i10);
        if (jVar instanceof j.a) {
            ((a) holder).g(jVar, this.f153430a, this.f153431b, this.f153435f);
        } else {
            if (!(jVar instanceof j.b)) {
                throw new k0();
            }
            ((c) holder).h(this.f153437h, (j.b) jVar, this.f153430a, this.f153431b, this.f153433d, this.f153434e, this.f153435f, this.f153432c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        com.planner5d.library.contest.view.n.a next;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Iterator<com.planner5d.library.contest.view.n.a> it = com.planner5d.library.contest.view.n.a.l().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.n() != i10);
        com.planner5d.library.contest.view.n.a aVar = next;
        int i11 = aVar == null ? -1 : e.f153443a[aVar.ordinal()];
        if (i11 == 1) {
            return new a(this.f153436g.a(parent, aVar));
        }
        if (i11 == 2) {
            return new c(this.f153436g.a(parent, aVar));
        }
        throw new IllegalArgumentException("Unknown view type #" + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NotNull RecyclerView.g0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof c) {
            ((c) holder).a();
        }
    }

    public h(@NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.q imageManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull w userAuthorization, @NotNull com.planner5d.library.contest.view.o listener, @NotNull d viewFactory) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.f153430a = formatter;
        this.f153431b = languageManager;
        this.f153432c = imageManager;
        this.f153433d = bitmapTargetManager;
        this.f153434e = userAuthorization;
        this.f153435f = listener;
        this.f153436g = viewFactory;
        this.f153438i = CollectionsKt.emptyList();
    }
}
