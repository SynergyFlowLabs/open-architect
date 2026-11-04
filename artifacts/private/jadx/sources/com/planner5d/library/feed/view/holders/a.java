package com.planner5d.library.feed.view.holders;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a2;
import androidx.fragment.app.s;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.feed.view.databinding.f;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.q;
import com.planner5d.library.widget.preloader.PreloaderShimmerV2View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jc.e;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nDesignOfDayViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignOfDayViewHolder.kt\ncom/planner5d/library/feed/view/holders/DesignOfDayViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,118:1\n1#2:119\n257#3,2:120\n257#3,2:122\n255#3:124\n257#3,2:125\n299#3,2:127\n*S KotlinDebug\n*F\n+ 1 DesignOfDayViewHolder.kt\ncom/planner5d/library/feed/view/holders/DesignOfDayViewHolder\n*L\n49#1:120,2\n50#1:122,2\n100#1:124\n104#1:125,2\n105#1:127,2\n*E\n"})
public final class a extends c<c1<List<? extends e>>> implements d1<List<? extends e>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C1556a f179917g = new C1556a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f179918h = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private c1<List<e>> f179919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private f f179920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final lc.b f179921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e f179922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f179923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private PointF f179924f;

    /* JADX INFO: renamed from: com.planner5d.library.feed.view.holders.a$a, reason: collision with other inner class name */
    public static final class C1556a {
        public /* synthetic */ C1556a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1556a() {
        }
    }

    public static final class b implements RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f179925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f179926b;

        b(RecyclerView recyclerView, a aVar) {
            this.f179925a = recyclerView;
            this.f179926b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView rv, MotionEvent e10) {
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(e10, "e");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView ignored, MotionEvent event) {
            Intrinsics.checkNotNullParameter(ignored, "ignored");
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action == 0) {
                this.f179925a.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(event.getX() - this.f179926b.f179924f.x) > Math.abs(event.getY() - this.f179926b.f179924f.y)) {
                    this.f179925a.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (Math.abs(event.getY() - this.f179926b.f179924f.y) > this.f179926b.f179923e) {
                    this.f179925a.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            this.f179926b.f179924f.set(event.getX(), event.getY());
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull Context context, @NotNull h bitmapTargetManager, @NotNull q imageManager, @NotNull kc.b navigation, @NotNull kc.a feedStatistics, @NotNull Function1<? super e, Unit> onFavoriteClicked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(feedStatistics, "feedStatistics");
        Intrinsics.checkNotNullParameter(onFavoriteClicked, "onFavoriteClicked");
        ConstraintLayout constraintLayoutB = f.c(LayoutInflater.from(context)).getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "getRoot(...)");
        super(constraintLayoutB);
        this.f179921c = new lc.b(bitmapTargetManager, imageManager, navigation, feedStatistics, onFavoriteClicked);
        this.f179922d = new e("", "", "", "", "", false);
        this.f179923e = (ViewConfiguration.get(context).getScaledPagingTouchSlop() * 2) / 3;
        this.f179924f = new PointF();
        f fVarA = f.a(this.itemView);
        Intrinsics.checkNotNullExpressionValue(fVarA, "bind(...)");
        RecyclerView recyclerView = fVarA.f179915c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(8);
        LinearLayoutCompat placeholder = fVarA.f179914b;
        Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
        placeholder.setVisibility(0);
        LinearLayoutCompat placeholder2 = fVarA.f179914b;
        Intrinsics.checkNotNullExpressionValue(placeholder2, "placeholder");
        Iterator<View> it = a2.e(placeholder2).iterator();
        while (it.hasNext()) {
            ((PreloaderShimmerV2View) it.next().findViewById(com.planner5d.library.feed.view.c.i.L8)).x();
        }
        RecyclerView recyclerView2 = fVarA.f179915c;
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView2.setAdapter(this.f179921c);
        Intrinsics.checkNotNull(recyclerView2);
        k(recyclerView2);
        fVarA.f179916d.setText(context.getText(com.planner5d.library.feed.view.c.q.f178143fb));
        this.f179920b = fVarA;
    }

    private final void k(RecyclerView recyclerView) {
        recyclerView.q(new b(recyclerView, this));
    }

    @Override // com.planner5d.library.feed.view.holders.c
    public void a() {
        c1<List<e>> c1Var = this.f179919a;
        if (c1Var != null) {
            c1Var.p(this);
        }
        this.f179919a = null;
    }

    @Override // com.planner5d.library.feed.view.holders.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable c1<List<e>> c1Var) {
        c1<List<e>> c1Var2 = this.f179919a;
        if (c1Var2 != null) {
            c1Var2.p(this);
        }
        this.f179919a = c1Var;
        if (c1Var != null) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            c1Var.k((s) context, this);
        }
    }

    @Override // androidx.lifecycle.d1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull List<e> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        f fVar = this.f179920b;
        LinearLayoutCompat placeholder = fVar.f179914b;
        Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
        if (placeholder.getVisibility() == 0) {
            LinearLayoutCompat placeholder2 = fVar.f179914b;
            Intrinsics.checkNotNullExpressionValue(placeholder2, "placeholder");
            Iterator<View> it = a2.e(placeholder2).iterator();
            while (it.hasNext()) {
                ((PreloaderShimmerV2View) it.next().findViewById(com.planner5d.library.feed.view.c.i.L8)).w();
            }
            RecyclerView recyclerView = fVar.f179915c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            recyclerView.setVisibility(0);
            LinearLayoutCompat placeholder3 = fVar.f179914b;
            Intrinsics.checkNotNullExpressionValue(placeholder3, "placeholder");
            placeholder3.setVisibility(8);
        }
        this.f179921c.k(CollectionsKt.plus((Collection<? extends e>) list.subList(0, Math.min(10, list.size())), this.f179922d));
    }
}
