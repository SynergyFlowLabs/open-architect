package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.feed.s0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.i6;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.u0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHolderFeedProjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderFeedProjects.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderFeedProjects\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class p extends com.planner5d.library.feed.view.holders.c<List<? extends yc.d<Project>>> implements ja.c.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133440f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s0 f133441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f133442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s0 f133443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.feed.e f133444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.feed.e f133445e;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(@NotNull Context context, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull d0 projectManager, @NotNull final ja.c viewHolderProjectListener, @NotNull ja.b feedProjectListListener, @NotNull u0 hapticManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(viewHolderProjectListener, "viewHolderProjectListener");
        Intrinsics.checkNotNullParameter(feedProjectListListener, "feedProjectListListener");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        FrameLayout root = i6.c(LayoutInflater.from(context)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        s0 s0Var = new s0(bitmapTargetManager, scope, projectManager, feedProjectListListener, hapticManager, s0.c.Project);
        this.f133441a = s0Var;
        s0 s0Var2 = new s0(bitmapTargetManager, scope, projectManager, feedProjectListListener, hapticManager, s0.c.Header);
        this.f133442b = s0Var2;
        s0 s0Var3 = new s0(bitmapTargetManager, scope, projectManager, feedProjectListListener, hapticManager, s0.c.Footer);
        this.f133443c = s0Var3;
        com.planner5d.library.activity.fragment.feed.e eVar = new com.planner5d.library.activity.fragment.feed.e(hapticManager, com.planner5d.library.activity.fragment.feed.e.b.UploadInProgress, new Function1() { // from class: com.planner5d.library.activity.fragment.feed.holders.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.l(viewHolderProjectListener, (com.planner5d.library.activity.fragment.feed.a) obj);
            }
        });
        this.f133444d = eVar;
        com.planner5d.library.activity.fragment.feed.e eVar2 = new com.planner5d.library.activity.fragment.feed.e(hapticManager, com.planner5d.library.activity.fragment.feed.e.b.UploadFailed, new Function1() { // from class: com.planner5d.library.activity.fragment.feed.holders.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.k(viewHolderProjectListener, (com.planner5d.library.activity.fragment.feed.a) obj);
            }
        });
        this.f133445e = eVar2;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(this.itemView, com.planner5d.library.f.j.Up);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            recyclerView.setAdapter(new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{s0Var2, eVar, eVar2, s0Var, s0Var3}));
            viewHolderProjectListener.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(ja.c cVar, com.planner5d.library.activity.fragment.feed.a aVar) {
        cVar.f(aVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(ja.c cVar, com.planner5d.library.activity.fragment.feed.a aVar) {
        cVar.f(aVar);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.feed.view.holders.c
    public void a() {
        this.f133441a.u();
    }

    @Override // ja.c.a
    public void d(@NotNull List<com.planner5d.library.activity.fragment.feed.a> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f133444d.k(items);
    }

    @Override // ja.c.a
    public void e(@NotNull List<com.planner5d.library.activity.fragment.feed.a> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f133445e.k(items);
    }

    @Override // com.planner5d.library.feed.view.holders.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable List<yc.d<Project>> list) {
        if (list == null) {
            return;
        }
        this.f133441a.k(list.subList(0, Math.min(5, list.size())));
    }
}
