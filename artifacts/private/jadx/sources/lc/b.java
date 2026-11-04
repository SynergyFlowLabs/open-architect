package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.q;
import com.planner5d.library.widget.ProfileIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends u<jc.e, a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f322633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f322634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kc.b f322635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kc.a f322636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<jc.e, Unit> f322637g;

    public static class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final View f322638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View.OnClickListener f322639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View view, @NotNull View.OnClickListener listener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f322638a = view;
            this.f322639b = listener;
        }

        public void a() {
        }

        public void g(@Nullable jc.e eVar) {
            this.f322638a.setOnClickListener(this.f322639b);
        }
    }

    /* JADX INFO: renamed from: lc.b$b, reason: collision with other inner class name */
    public static final class C2325b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.feed.view.databinding.c f322640c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C2325b(@NotNull com.planner5d.library.feed.view.databinding.c binding, @NotNull View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, listener);
            this.f322640c = binding;
        }

        @Override // lc.b.a
        public void g(@Nullable jc.e eVar) {
            super.g(eVar);
            this.f322640c.f179904m3.setText(this.itemView.getContext().getString(com.planner5d.library.feed.view.c.q.f178167gb));
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.feed.view.databinding.a f322641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final h f322642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final q f322643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final kc.b f322644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final kc.a f322645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final Function1<jc.e, Unit> f322646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private com.planner5d.library.services.bitmaploader.target.a f322647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private com.planner5d.library.services.bitmaploader.target.a f322648j;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull com.planner5d.library.feed.view.databinding.a binding, @NotNull h bitmapTargetManager, @NotNull q imageManager, @NotNull kc.b navigation, @NotNull kc.a feedStatistics, @NotNull Function1<? super jc.e, Unit> onFavoriteClicked) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(feedStatistics, "feedStatistics");
            Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
            View root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, new View.OnClickListener() { // from class: lc.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.k(view);
                }
            });
            this.f322641c = binding;
            this.f322642d = bitmapTargetManager;
            this.f322643e = imageManager;
            this.f322644f = navigation;
            this.f322645g = feedStatistics;
            this.f322646h = onFavoriteClicked;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(c cVar, jc.e eVar, View view) {
            cVar.f322646h.invoke(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(c cVar, jc.e eVar, View view) {
            cVar.f322644f.a(eVar.l());
            cVar.f322645g.a(StringsKt.toIntOrNull(eVar.l()));
        }

        @Override // lc.b.a
        public void a() {
            super.a();
            this.f322642d.d(this.f322647i);
            this.f322642d.d(this.f322648j);
        }

        @Override // lc.b.a
        public void g(@Nullable final jc.e eVar) {
            super.g(eVar);
            com.planner5d.library.feed.view.databinding.a aVar = this.f322641c;
            if (eVar == null) {
                return;
            }
            aVar.n1(eVar);
            this.f322641c.f179895n3.setOnClickListener(new View.OnClickListener() { // from class: lc.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.l(this.f322654a, eVar, view);
                }
            });
            this.f322641c.f179897p3.setOnClickListener(new View.OnClickListener() { // from class: lc.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.m(this.f322656a, eVar, view);
                }
            });
            ImageView image = this.f322641c.f179896o3;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            this.f322647i = com.planner5d.library.widget.bitmaptarget.a.b(image, this.f322642d);
            q.a.a(this.f322643e, eVar.m(), 0, 0, this.f322647i, 0L, 16, null);
            ProfileIconView avatar = this.f322641c.f179894m3;
            Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
            this.f322648j = com.planner5d.library.widget.bitmaptarget.a.e(avatar, this.f322642d);
            q.a.a(this.f322643e, eVar.j(), 0, 0, this.f322648j, 0L, 16, null);
        }
    }

    public enum d {
        Gallery(0),
        Footer(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f322652e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f322653a;

        d(int i10) {
            this.f322653a = i10;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f322652e;
        }

        public final int n() {
            return this.f322653a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull h bitmapTargetManager, @NotNull q imageManager, @NotNull kc.b navigation, @NotNull kc.a feedStatistics, @NotNull Function1<? super jc.e, Unit> onFavoriteClicked) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(feedStatistics, "feedStatistics");
        Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
        this.f322633c = bitmapTargetManager;
        this.f322634d = imageManager;
        this.f322635e = navigation;
        this.f322636f = feedStatistics;
        this.f322637g = onFavoriteClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(b bVar, View view) {
        bVar.f322636f.a(null);
        bVar.f322635e.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i10 == getItemCount() + (-1) ? d.Footer.n() : d.Gallery.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(i(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == d.Gallery.n()) {
            com.planner5d.library.feed.view.databinding.a aVarK1 = com.planner5d.library.feed.view.databinding.a.k1(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(aVarK1, "inflate(...)");
            return new c(aVarK1, this.f322633c, this.f322634d, this.f322635e, this.f322636f, this.f322637g);
        }
        com.planner5d.library.feed.view.databinding.c cVarK1 = com.planner5d.library.feed.view.databinding.c.k1(layoutInflaterFrom, parent, false);
        Intrinsics.checkNotNullExpressionValue(cVarK1, "inflate(...)");
        return new C2325b(cVarK1, new View.OnClickListener() { // from class: lc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.p(this.f322632a, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
    }
}
