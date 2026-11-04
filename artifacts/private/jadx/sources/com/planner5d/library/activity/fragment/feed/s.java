package com.planner5d.library.activity.fragment.feed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.u3;
import com.planner5d.library.databinding.x3;
import com.planner5d.library.databinding.z3;
import com.planner5d.library.model.manager.statistics.events.q3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedBlogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBlogAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedBlogAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n216#2,2:210\n1#3:212\n*S KotlinDebug\n*F\n+ 1 FeedBlogAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedBlogAdapter\n*L\n76#1:210,2\n*E\n"})
public final class s extends androidx.recyclerview.widget.u<jc.a, e> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f133586j = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.y0 f133588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f133589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ja.a f133590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private hc.a.EnumC1914a f133591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f133592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<e, Unit> f133593i;

    public enum a {
        Article(0),
        Video(1),
        Footer(2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133598f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f133599a;

        a(int i10) {
            this.f133599a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f133598f;
        }

        public final int n() {
            return this.f133599a;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f133600f = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final u3 f133601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f133602e;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull u3 binding, boolean z10, @NotNull View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, listener);
            this.f133601d = binding;
            this.f133602e = z10;
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.e
        public void g(@Nullable jc.a aVar, @NotNull hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            super.g(aVar, blogType);
            u3 u3Var = this.f133601d;
            u3Var.f159757m3.setText(u3Var.getRoot().getContext().getString(this.f133602e ? com.planner5d.library.f.s.GB : com.planner5d.library.f.s.EB));
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class c extends f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f133603j = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final x3 f133604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final ja.a f133605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f133606i;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull x3 binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull com.planner5d.library.model.manager.y0 imageManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull ja.a feedBlogAdapterListener, boolean z10) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, bitmapTargetManager, imageManager, scope);
            this.f133604g = binding;
            this.f133605h = feedBlogAdapterListener;
            this.f133606i = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(jc.a aVar, c cVar, hc.a.EnumC1914a enumC1914a, View view) {
            if (aVar != null) {
                ja.a aVar2 = cVar.f133605h;
                g1 g1Var = g1.f133365a;
                Intrinsics.checkNotNull(view);
                aVar2.o(g1Var.a(view), aVar, cVar.f133606i ? q3.d.home_page : q3.d.all_article, enumC1914a);
            }
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.f, com.planner5d.library.activity.fragment.feed.s.e
        public void g(@Nullable final jc.a aVar, @NotNull final hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            super.g(aVar, blogType);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s.c.p(aVar, this, blogType, view);
                }
            });
            this.f133604g.n1(aVar);
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.f
        @NotNull
        public ImageView l() {
            ImageView image = this.f133604g.f159901l3;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            return image;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class d extends f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f133607j = 8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final z3 f133608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final ja.a f133609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f133610i;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(@NotNull z3 binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull com.planner5d.library.model.manager.y0 imageManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull ja.a feedBlogAdapterListener, boolean z10) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, bitmapTargetManager, imageManager, scope);
            this.f133608g = binding;
            this.f133609h = feedBlogAdapterListener;
            this.f133610i = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(jc.a aVar, d dVar, hc.a.EnumC1914a enumC1914a, View view) {
            if (aVar != null) {
                ja.a aVar2 = dVar.f133609h;
                g1 g1Var = g1.f133365a;
                Intrinsics.checkNotNull(view);
                aVar2.o(g1Var.a(view), aVar, dVar.f133610i ? q3.d.home_page : q3.d.all_article, enumC1914a);
            }
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.f, com.planner5d.library.activity.fragment.feed.s.e
        public void g(@Nullable final jc.a aVar, @NotNull final hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            super.g(aVar, blogType);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s.d.p(aVar, this, blogType, view);
                }
            });
            this.f133608g.n1(aVar);
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.f
        @NotNull
        public ImageView l() {
            ImageView image = this.f133608g.f160015m3;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            return image;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static class e extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f133611c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f133612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View.OnClickListener f133613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull View view, @NotNull View.OnClickListener listener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f133612a = view;
            this.f133613b = listener;
        }

        public void a() {
        }

        public void g(@Nullable jc.a aVar, @NotNull hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            this.f133612a.setOnClickListener(this.f133613b);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nFeedBlogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedBlogAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedBlogAdapter$ImageViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,209:1\n67#2,4:210\n37#2,2:214\n55#2:216\n72#2:217\n*S KotlinDebug\n*F\n+ 1 FeedBlogAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedBlogAdapter$ImageViewHolder\n*L\n134#1:210,4\n134#1:214,2\n134#1:216\n134#1:217\n*E\n"})
    public static abstract class f extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f133614f = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.y0 f133615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private com.planner5d.library.services.bitmaploader.target.k f133616e;

        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 FeedBlogAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedBlogAdapter$ImageViewHolder\n*L\n1#1,52:1\n70#2:53\n135#3,2:54\n*E\n"})
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f133618b;

            public a(String str) {
                this.f133618b = str;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                f.this.m(this.f133618b, view.getWidth(), view.getHeight());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull View view, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull com.planner5d.library.model.manager.y0 imageManager, @NotNull kotlinx.coroutines.s0 scope) {
            super(view, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s.f.j(view2);
                }
            });
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f133615d = imageManager;
            this.f133616e = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, scope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(final String str, final int i10, final int i11) {
            com.planner5d.library.services.bitmaploader.target.k.b bVarB = this.f133616e.b(com.planner5d.library.widget.bitmaptarget.a.g(l(), com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
            bVarB.c(new com.planner5d.library.services.bitmaploader.d.f() { // from class: com.planner5d.library.activity.fragment.feed.v
                @Override // com.planner5d.library.services.bitmaploader.d.f
                public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                    return s.f.n(this.f133653a, str, i10, i11, aVar);
                }
            });
            bVarB.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.services.bitmaploader.d.C1663d n(f fVar, String str, int i10, int i11, com.planner5d.library.services.bitmaploader.target.a aVar) {
            return fVar.f133615d.b(str, i10, i11, aVar, 4L);
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.e
        public void a() {
            this.f133616e.a();
        }

        @Override // com.planner5d.library.activity.fragment.feed.s.e
        public void g(@Nullable jc.a aVar, @NotNull hc.a.EnumC1914a blogType) {
            String strG;
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            if (aVar == null || (strG = aVar.g()) == null) {
                return;
            }
            int width = l().getWidth();
            int height = l().getHeight();
            if (width != 0 && height != 0) {
                m(strG, width, height);
                return;
            }
            ImageView imageViewL = l();
            if (!imageViewL.isLaidOut() || imageViewL.isLayoutRequested()) {
                imageViewL.addOnLayoutChangeListener(new a(strG));
            } else {
                m(strG, imageViewL.getWidth(), imageViewL.getHeight());
            }
        }

        @NotNull
        public abstract ImageView l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull com.planner5d.library.model.manager.y0 imageManager, @NotNull kotlinx.coroutines.s0 scope, @NotNull ja.a feedBlogAdapterListener, @NotNull hc.a.EnumC1914a blogType, boolean z10) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        this.f133587c = bitmapTargetManager;
        this.f133588d = imageManager;
        this.f133589e = scope;
        this.f133590f = feedBlogAdapterListener;
        this.f133591g = blogType;
        this.f133592h = z10;
        this.f133593i = new WeakHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(s sVar, ViewGroup viewGroup, View view) {
        sVar.f133590f.O(g1.f133365a.a(viewGroup), sVar.f133591g);
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return super.getItemCount() + (this.f133592h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        jc.a aVarI = i(i10);
        if (aVarI == null) {
            return a.Footer.n();
        }
        Integer numB = aVarI.b();
        return (numB != null && numB.intValue() == jc.d.Videos.n()) ? a.Video.n() : a.Article.n();
    }

    @Override // androidx.recyclerview.widget.u
    public void k(@Nullable List<jc.a> list) {
        super.k(list);
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                notifyItemRangeChanged(0, list.size());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.u
    @Nullable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public jc.a i(int i10) {
        if (i10 >= super.getItemCount()) {
            return null;
        }
        return (jc.a) super.i(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull e holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(i(i10), this.f133591g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(@NotNull final ViewGroup parent, int i10) {
        e cVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == a.Footer.n()) {
            u3 u3VarK1 = u3.k1(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(u3VarK1, "inflate(...)");
            cVar = new b(u3VarK1, this.f133591g == hc.a.EnumC1914a.Videos, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s.q(this.f133583a, parent, view);
                }
            });
        } else if (i10 == a.Video.n()) {
            z3 z3VarK1 = z3.k1(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(z3VarK1, "inflate(...)");
            cVar = new d(z3VarK1, this.f133587c, this.f133588d, this.f133589e, this.f133590f, this.f133592h);
        } else {
            x3 x3VarK1 = x3.k1(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(x3VarK1, "inflate(...)");
            cVar = new c(x3VarK1, this.f133587c, this.f133588d, this.f133589e, this.f133590f, this.f133592h);
        }
        this.f133593i.put(cVar, Unit.f312394a);
        if (!this.f133592h) {
            cVar.itemView.getLayoutParams().width = -1;
        }
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull e holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }

    public final void s() {
        WeakHashMap<e, Unit> weakHashMap = this.f133593i;
        Iterator<Map.Entry<e, Unit>> it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a();
        }
        weakHashMap.clear();
    }

    public final void t(@NotNull hc.a.EnumC1914a blogType, @NotNull List<jc.a> list) {
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f133591g = blogType;
        k(list);
    }
}
