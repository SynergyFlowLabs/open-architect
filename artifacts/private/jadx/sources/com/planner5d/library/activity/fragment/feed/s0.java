package com.planner5d.library.activity.fragment.feed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.b4;
import com.planner5d.library.databinding.c4;
import com.planner5d.library.databinding.d4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedProjectListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedProjectListAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedProjectListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,140:1\n1#2:141\n216#3,2:142\n*S KotlinDebug\n*F\n+ 1 FeedProjectListAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedProjectListAdapter\n*L\n89#1:142,2\n*E\n"})
public final class s0 extends androidx.recyclerview.widget.u<yc.d<Project>, a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f133619j = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f133621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f133622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ja.b f133623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.u0 f133624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f133625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<a, Unit> f133626i;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static class a extends com.planner5d.library.activity.fragment.list.holders.a<yc.d<Project>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f133627d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View f133628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final View.OnClickListener f133629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view, @NotNull View.OnClickListener listener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f133628b = view;
            this.f133629c = listener;
        }

        @Override // com.planner5d.library.activity.fragment.list.holders.a
        public void a() {
        }

        @Override // com.planner5d.library.activity.fragment.list.holders.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(@Nullable yc.d<Project> dVar) {
            this.f133628b.setOnClickListener(this.f133629c);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b extends a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f133630k = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final d4 f133631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.project.d0 f133632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final ja.b f133633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.u0 f133634h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private com.planner5d.library.services.bitmaploader.target.k f133635i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f133636j;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull d4 binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull ja.b feedProjectListListener, @NotNull com.planner5d.library.model.manager.u0 hapticManager) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(projectManager, "projectManager");
            Intrinsics.checkNotNullParameter(feedProjectListListener, "feedProjectListListener");
            Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s0.b.n(view);
                }
            });
            this.f133631e = binding;
            this.f133632f = projectManager;
            this.f133633g = feedProjectListListener;
            this.f133634h = hapticManager;
            this.f133635i = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
            this.f133636j = this.itemView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167378xh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(b bVar, yc.d dVar, View view) {
            com.planner5d.library.model.manager.u0 u0Var = bVar.f133634h;
            Intrinsics.checkNotNull(view);
            u0Var.a(view);
            bVar.f133633g.a(g1.f133365a.a(view), dVar != null ? (Project) dVar.c() : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.services.bitmaploader.d.C1663d p(b bVar, yc.d dVar, com.planner5d.library.services.bitmaploader.target.a aVar) {
            return bVar.f133632f.d0((Project) dVar.c(), bVar.f133636j, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.services.bitmaploader.d.C1663d q(b bVar, yc.d dVar, com.planner5d.library.services.bitmaploader.target.a aVar) {
            return bVar.f133632f.c0(bVar.itemView.getContext(), (Project) dVar.c(), bVar.f133636j, aVar);
        }

        @Override // com.planner5d.library.activity.fragment.feed.s0.a, com.planner5d.library.activity.fragment.list.holders.a
        public void a() {
            this.f133635i.a();
        }

        @Override // com.planner5d.library.activity.fragment.list.holders.a
        public void h(boolean z10) {
            this.f133631e.o1(Boolean.valueOf(z10));
            this.f133631e.s();
        }

        @Override // com.planner5d.library.activity.fragment.feed.s0.a, com.planner5d.library.activity.fragment.list.holders.a
        /* JADX INFO: renamed from: i */
        public void g(@Nullable final yc.d<Project> dVar) {
            super.g(dVar);
            d4 d4Var = this.f133631e;
            d4Var.p1(dVar != null ? (Project) dVar.c() : null);
            d4Var.o1(dVar != null ? Boolean.valueOf(dVar.a()) : null);
            d4Var.s();
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s0.b.o(this.f133651a, dVar, view);
                }
            });
            com.planner5d.library.services.bitmaploader.target.k kVar = this.f133635i;
            ImageView image = this.f133631e.f158846m3;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            com.planner5d.library.services.bitmaploader.target.k.b bVarB = kVar.b(com.planner5d.library.widget.bitmaptarget.a.g(image, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
            if (dVar != null) {
                bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.feed.v0
                    @Override // com.planner5d.library.services.bitmaploader.d.f
                    public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                        return s0.b.p(this.f133657a, dVar, aVar);
                    }
                });
                bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.feed.w0
                    @Override // com.planner5d.library.services.bitmaploader.d.f
                    public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                        return s0.b.q(this.f133659a, dVar, aVar);
                    }
                });
            }
            bVarB.i();
        }
    }

    public enum c {
        Header(0),
        Project(1),
        Footer(2),
        UploadInProgress(3),
        UploadFailed(4);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133643h = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f133644a;

        c(int i10) {
            this.f133644a = i10;
        }

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f133643h;
        }

        public final int n() {
            return this.f133644a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull ja.b feedProjectListListener, @NotNull com.planner5d.library.model.manager.u0 hapticManager, @NotNull c viewType) {
        super(new yc.e());
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(feedProjectListListener, "feedProjectListListener");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f133620c = bitmapTargetManager;
        this.f133621d = scope;
        this.f133622e = projectManager;
        this.f133623f = feedProjectListListener;
        this.f133624g = hapticManager;
        this.f133625h = viewType;
        this.f133626i = new WeakHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(s0 s0Var, View view) {
        com.planner5d.library.model.manager.u0 u0Var = s0Var.f133624g;
        Intrinsics.checkNotNull(view);
        u0Var.a(view);
        s0Var.f133623f.C(g1.f133365a.a(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(s0 s0Var, View view) {
        com.planner5d.library.model.manager.u0 u0Var = s0Var.f133624g;
        Intrinsics.checkNotNull(view);
        u0Var.a(view);
        s0Var.f133623f.s(g1.f133365a.a(view));
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        c cVar = this.f133625h;
        if (cVar == c.Header || cVar == c.Footer) {
            return 1;
        }
        return super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f133625h.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(this.f133625h == c.Project ? i(i10) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) payloads);
        if (objLastOrNull instanceof yc.a.C2534a) {
            holder.h(((yc.a.C2534a) objLastOrNull).d());
        } else {
            onBindViewHolder(holder, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        a bVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == c.Header.n()) {
            RelativeLayout root = c4.d(layoutInflaterFrom, parent, false).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            bVar = new a(root, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s0.r(this.f133582a, view);
                }
            });
        } else if (i10 == c.Footer.n()) {
            CardView root2 = b4.d(layoutInflaterFrom, parent, false).getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            bVar = new a(root2, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s0.s(this.f133585a, view);
                }
            });
        } else {
            d4 d4VarL1 = d4.l1(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(d4VarL1, "inflate(...)");
            bVar = new b(d4VarL1, this.f133620c, this.f133621d, this.f133622e, this.f133623f, this.f133624g);
        }
        this.f133626i.put(bVar, Unit.f312394a);
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    public final void u() {
        WeakHashMap<a, Unit> weakHashMap = this.f133626i;
        Iterator<Map.Entry<a, Unit>> it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a();
        }
        weakHashMap.clear();
    }
}
