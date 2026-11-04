package com.planner5d.library.contest.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class c0 extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f153489j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f153490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o1 f153491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.q f153492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f153493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f153494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f153495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f153496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f153497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private List<n> f153498i;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f153499d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f153500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final u f153501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.widget.preloader.t f153502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, boolean z10) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.contest.e.l.A2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            this.f153500a = parent;
            View viewFindViewById = this.itemView.findViewById(com.planner5d.library.contest.e.i.f150897j3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(com.planner5d.library.contest.e.i.G3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(com.planner5d.library.contest.e.i.f151032s3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.itemView.findViewById(com.planner5d.library.contest.e.i.H3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            TextView textView3 = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.itemView.findViewById(com.planner5d.library.contest.e.i.f150792c3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            TextView textView4 = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.itemView.findViewById(com.planner5d.library.contest.e.i.f150822e3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            TextView textView5 = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.itemView.findViewById(com.planner5d.library.contest.e.i.f151079v5);
            View viewFindViewById8 = this.itemView.findViewById(com.planner5d.library.contest.e.i.f151038s9);
            View viewFindViewById9 = this.itemView.findViewById(com.planner5d.library.contest.e.i.I2);
            View viewFindViewById10 = this.itemView.findViewById(com.planner5d.library.contest.e.i.R3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.f153501b = new u(bitmapTargetManager, imageView, textView, textView2, textView3, textView4, textView5, viewFindViewById7, viewFindViewById8, viewFindViewById9, (TextView) viewFindViewById10, z10);
            this.f153502c = new com.planner5d.library.widget.preloader.t(this.itemView);
        }

        public final void a() {
            this.f153501b.a();
        }

        public final void g(boolean z10, boolean z11, @NotNull n item, @NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.q imageManager, @NotNull b listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(languageManager, "languageManager");
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            Intrinsics.checkNotNullParameter(listener, "listener");
            u uVar = this.f153501b;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uVar.n(context, item.a(), item.c(), item.b(), item.d(), formatter, languageManager, imageManager, listener);
            uVar.l().setEnabled(!z11);
            uVar.m().setEnabled(!z11);
            com.planner5d.library.widget.preloader.h0 h0VarA = this.f153502c.a();
            if (z10) {
                h0VarA.o(null, null);
            } else {
                h0VarA.b();
            }
        }

        @NotNull
        public final ViewGroup h() {
            return this.f153500a;
        }
    }

    public interface b {
        void a(@NotNull Contest contest);

        void b(@NotNull Contest contest);

        void c();

        void d(@NotNull Contest contest);

        void e(@NotNull Contest contest);

        void f(@NotNull Contest contest);
    }

    @ij.a
    public c0(@NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.q imageManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, boolean z10, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f153490a = formatter;
        this.f153491b = languageManager;
        this.f153492c = imageManager;
        this.f153493d = bitmapTargetManager;
        this.f153494e = z10;
        this.f153495f = listener;
        this.f153498i = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f153498i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f153498i.get(i10).e().n();
    }

    public final boolean h() {
        return this.f153497h;
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.target.h i() {
        return this.f153493d;
    }

    @NotNull
    public final p0 j() {
        return this.f153490a;
    }

    public final boolean k() {
        return this.f153496g;
    }

    public final void l(boolean z10) {
        this.f153497h = z10;
    }

    public final void m(@NotNull List<n> contestListItems) {
        Intrinsics.checkNotNullParameter(contestListItems, "contestListItems");
        this.f153498i = contestListItems;
    }

    public final void n(boolean z10) {
        this.f153496g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).g(this.f153496g, this.f153497h, this.f153498i.get(i10), this.f153490a, this.f153491b, this.f153492c, this.f153495f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i10 == n.a.InactiveContest.n() ? new a(parent, this.f153493d, this.f153494e) : new a(parent, this.f153493d, this.f153494e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NotNull RecyclerView.g0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof a) {
            ((a) holder).a();
        }
    }
}
