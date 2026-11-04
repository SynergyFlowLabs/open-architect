package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.feed.s;
import com.planner5d.library.databinding.j6;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.preloader.PreloaderShimmerV2View;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHolderFeedBlog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderFeedBlog.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderFeedBlog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n*L\n1#1,120:1\n1#2:121\n257#3,2:122\n257#3,2:124\n255#3:126\n257#3,2:127\n299#3,2:129\n58#4,17:131\n*S KotlinDebug\n*F\n+ 1 ViewHolderFeedBlog.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderFeedBlog\n*L\n48#1:122,2\n50#1:124,2\n103#1:126\n107#1:127,2\n108#1:129,2\n114#1:131,17\n*E\n"})
public final class k extends com.planner5d.library.feed.view.holders.c<Unit> implements ja.a.InterfaceC2239a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133425h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ja.a f133426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final hc.a.EnumC1914a f133427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f133428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private j6 f133429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s f133430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f133431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.math.k f133432g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133433a;

        static {
            int[] iArr = new int[hc.a.EnumC1914a.values().length];
            try {
                iArr[hc.a.EnumC1914a.Inspiration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hc.a.EnumC1914a.ForYourHome.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hc.a.EnumC1914a.Tips.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133433a = iArr;
        }
    }

    public static final class b implements RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f133434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f133435b;

        b(RecyclerView recyclerView, k kVar) {
            this.f133434a = recyclerView;
            this.f133435b = kVar;
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
                this.f133434a.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(event.getX() - this.f133435b.f133432g.f180480a) > Math.abs(event.getY() - this.f133435b.f133432g.f180481b)) {
                    this.f133434a.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (Math.abs(event.getY() - this.f133435b.f133432g.f180481b) > this.f133435b.f133431f) {
                    this.f133434a.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            this.f133435b.f133432g.U(event.getX(), event.getY());
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(@NotNull Context context, @NotNull ja.a feedBlogAdapterListener, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull s0 scope, @NotNull hc.a.EnumC1914a blogType, @NotNull RecyclerView.w recycledViewPool, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(feedBlogAdapterListener, "feedBlogAdapterListener");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        ConstraintLayout root = j6.c(LayoutInflater.from(context)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f133426a = feedBlogAdapterListener;
        this.f133427b = blogType;
        this.f133428c = bundle;
        this.f133430e = new s(bitmapTargetManager, imageManager, scope, feedBlogAdapterListener, blogType, true);
        this.f133431f = (ViewConfiguration.get(context).getScaledPagingTouchSlop() * 2) / 3;
        this.f133432g = new com.planner5d.library.math.k();
        j6 j6VarA = j6.a(this.itemView);
        Intrinsics.checkNotNullExpressionValue(j6VarA, "bind(...)");
        RecyclerView recyclerView = j6VarA.f159196c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(8);
        j6VarA.f159196c.setRecycledViewPool(recycledViewPool);
        LinearLayoutCompat placeholder = j6VarA.f159195b;
        Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
        placeholder.setVisibility(0);
        LinearLayoutCompat placeholder2 = j6VarA.f159195b;
        Intrinsics.checkNotNullExpressionValue(placeholder2, "placeholder");
        Iterator<View> it = a2.e(placeholder2).iterator();
        while (it.hasNext()) {
            ((PreloaderShimmerV2View) it.next().findViewById(com.planner5d.library.f.j.ds)).x();
        }
        RecyclerView recyclerView2 = j6VarA.f159196c;
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView2.setAdapter(this.f133430e);
        Intrinsics.checkNotNull(recyclerView2);
        k(recyclerView2);
        int i10 = a.f133433a[this.f133427b.ordinal()];
        j6VarA.f159197d.setText(context.getText(i10 != 1 ? i10 != 2 ? i10 != 3 ? com.planner5d.library.f.s.YA : com.planner5d.library.f.s.XA : com.planner5d.library.f.s.UA : com.planner5d.library.f.s.VA));
        this.f133429d = j6VarA;
        this.f133426a.P(this, this.f133427b);
    }

    private final void k(RecyclerView recyclerView) {
        recyclerView.q(new b(recyclerView, this));
    }

    @Override // com.planner5d.library.feed.view.holders.c
    public void a() {
        this.f133430e.s();
    }

    @Override // ja.a.InterfaceC2239a
    public void b(@NotNull List<jc.a> items) {
        Parcelable parcelable;
        RecyclerView.p layoutManager;
        Intrinsics.checkNotNullParameter(items, "items");
        j6 j6Var = this.f133429d;
        LinearLayoutCompat placeholder = j6Var.f159195b;
        Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
        if (placeholder.getVisibility() == 0) {
            LinearLayoutCompat placeholder2 = j6Var.f159195b;
            Intrinsics.checkNotNullExpressionValue(placeholder2, "placeholder");
            Iterator<View> it = a2.e(placeholder2).iterator();
            while (it.hasNext()) {
                ((PreloaderShimmerV2View) it.next().findViewById(com.planner5d.library.f.j.ds)).w();
            }
            RecyclerView recyclerView = j6Var.f159196c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            recyclerView.setVisibility(0);
            LinearLayoutCompat placeholder3 = j6Var.f159195b;
            Intrinsics.checkNotNullExpressionValue(placeholder3, "placeholder");
            placeholder3.setVisibility(8);
        }
        this.f133430e.k(items.subList(0, Math.min(5, items.size())));
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(this.f133428c);
        boolean z10 = true & false;
        if (jVar.s(r.type, null) == this.f133427b) {
            r rVar = r.scrollPositionHorizontal;
            try {
                parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Parcelable.class) : jVar.g().getParcelable(rVar.f224891a);
                if (parcelable == null) {
                    parcelable = null;
                }
            } catch (ClassCastException unused) {
            }
            Parcelable parcelable2 = parcelable != null ? parcelable : null;
            if (parcelable2 == null || (layoutManager = this.f133429d.f159196c.getLayoutManager()) == null) {
                return;
            }
            layoutManager.x1(parcelable2);
        }
    }

    @Override // com.planner5d.library.feed.view.holders.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Unit unit) {
        List<jc.a> listR = this.f133426a.R(this.f133427b);
        if (listR != null) {
            if (listR.isEmpty()) {
                listR = null;
            }
            if (listR != null) {
                b(listR);
            }
        }
    }
}
