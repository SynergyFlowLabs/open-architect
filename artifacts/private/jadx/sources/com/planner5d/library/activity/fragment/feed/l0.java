package com.planner5d.library.activity.fragment.feed;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.paging.r1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedListAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n1#2:69\n216#3,2:70\n*S KotlinDebug\n*F\n+ 1 FeedListAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedListAdapter\n*L\n62#1:70,2\n*E\n"})
public final class l0 extends r1<hc.a, com.planner5d.library.feed.view.holders.c<?>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f133521m = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.feed.holders.a f133522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f133523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f133524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ja.c f133526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ja.b f133527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final ja.a f133528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<jc.e, Unit> f133529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Bundle f133530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<com.planner5d.library.feed.view.holders.c<?>, Unit> f133531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(@NotNull com.planner5d.library.activity.fragment.feed.holders.a factory, @NotNull kotlinx.coroutines.s0 scope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull ja.c projectListItemListener, @NotNull ja.b feedProjectListListener, @NotNull ja.a feedBlogAdapterListener, @NotNull Function1<? super jc.e, Unit> onFavoriteClicked, @Nullable Bundle bundle) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(projectListItemListener, "projectListItemListener");
        Intrinsics.checkNotNullParameter(feedProjectListListener, "feedProjectListListener");
        Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
        Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
        this.f133522c = factory;
        this.f133523d = scope;
        this.f133524e = coroutineDispatchers;
        this.f133525f = bitmapTargetManager;
        this.f133526g = projectListItemListener;
        this.f133527h = feedProjectListListener;
        this.f133528i = feedBlogAdapterListener;
        this.f133529j = onFavoriteClicked;
        this.f133530k = bundle;
        this.f133531l = new WeakHashMap<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        hc.a.EnumC1914a enumC1914aC;
        hc.a aVarM = m(i10);
        if (aVarM == null || (enumC1914aC = aVarM.c()) == null) {
            enumC1914aC = hc.a.EnumC1914a.Unknown;
        }
        return enumC1914aC.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull com.planner5d.library.feed.view.holders.c<?> holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        hc.a aVarM = m(i10);
        holder.g(aVarM != null ? aVarM.b() : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.view.holders.c<?> onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        hc.a.EnumC1914a enumC1914a;
        Intrinsics.checkNotNullParameter(parent, "parent");
        com.planner5d.library.activity.fragment.feed.holders.a aVar = this.f133522c;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kotlinx.coroutines.s0 s0Var = this.f133523d;
        com.planner5d.library.services.utility.t tVar = this.f133524e;
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f133525f;
        ja.c cVar = this.f133526g;
        ja.b bVar = this.f133527h;
        ja.a aVar2 = this.f133528i;
        Function1<jc.e, Unit> function1 = this.f133529j;
        hc.a.EnumC1914a[] enumC1914aArrValues = hc.a.EnumC1914a.values();
        int length = enumC1914aArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                enumC1914a = null;
                break;
            }
            enumC1914a = enumC1914aArrValues[i11];
            if (enumC1914a.n() == i10) {
                break;
            }
            i11++;
        }
        if (enumC1914a == null) {
            enumC1914a = hc.a.EnumC1914a.Unknown;
        }
        com.planner5d.library.feed.view.holders.c<?> cVarA = aVar.a(context, s0Var, tVar, hVar, cVar, bVar, aVar2, function1, enumC1914a, this.f133530k);
        cVarA.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
        this.f133531l.put(cVarA, Unit.f312394a);
        return cVarA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull com.planner5d.library.feed.view.holders.c<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.a();
    }

    public final void z() {
        WeakHashMap<com.planner5d.library.feed.view.holders.c<?>, Unit> weakHashMap = this.f133531l;
        Iterator<Map.Entry<com.planner5d.library.feed.view.holders.c<?>, Unit>> it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a();
        }
        weakHashMap.clear();
    }
}
