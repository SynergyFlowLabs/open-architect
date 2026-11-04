package com.planner5d.library.activity.fragment.feed;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.video.VideoPlayerDialog;
import com.planner5d.library.model.manager.statistics.events.q3;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedAllArticlesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedAllArticlesFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedAllArticlesFragment\n+ 2 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n58#2,17:136\n257#3,2:153\n1#4:155\n*S KotlinDebug\n*F\n+ 1 FeedAllArticlesFragment.kt\ncom/planner5d/library/activity/fragment/feed/FeedAllArticlesFragment\n*L\n67#1:136,17\n125#1:153,2\n*E\n"})
public final class FeedAllArticlesFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.databinding.r0 f133149f;

    @ij.a
    public e1 feedViewModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f133150g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133152i;

    @ij.a
    public com.planner5d.library.model.manager.y0 imageManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Parcelable f133153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133154k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f133148e = com.planner5d.library.services.network.f.f224463a.f(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private hc.a.EnumC1914a f133151h = hc.a.EnumC1914a.Inspiration;

    public static final class a implements ja.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ e1 f133155a;

        a(FeedAllArticlesFragment feedAllArticlesFragment) {
            this.f133155a = feedAllArticlesFragment.getFeedViewModel();
        }

        @Override // ja.a
        public void O(Bundle scrollState, hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(scrollState, "scrollState");
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            this.f133155a.O(scrollState, blogType);
        }

        @Override // ja.a
        public void P(ja.a.InterfaceC2239a callback, hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            this.f133155a.P(callback, blogType);
        }

        @Override // ja.a
        public List<jc.a> R(hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            return this.f133155a.R(blogType);
        }

        @Override // ja.a
        public void o(Bundle scrollState, jc.a blogPost, q3.d source, hc.a.EnumC1914a blogType) {
            Intrinsics.checkNotNullParameter(scrollState, "scrollState");
            Intrinsics.checkNotNullParameter(blogPost, "blogPost");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            this.f133155a.o(scrollState, blogPost, source, blogType);
        }
    }

    public static final class b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f133156e;

        b(int i10) {
            this.f133156e = i10;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            if (i10 == 0) {
                return this.f133156e;
            }
            return 1;
        }
    }

    static final class c implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133157a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133157a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f133157a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133157a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public FeedAllArticlesFragment() {
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f133152i = hVarA;
        this.f133154k = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedAllArticlesFragment.D(this.f133506a);
            }
        });
        com.planner5d.library.application.b.f142455c.a().s0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a D(FeedAllArticlesFragment feedAllArticlesFragment) {
        return new a(feedAllArticlesFragment);
    }

    private final ja.a E() {
        return (ja.a) this.f133154k.getValue();
    }

    private final com.planner5d.library.services.network.b F() {
        return (com.planner5d.library.services.network.b) this.f133148e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(FeedAllArticlesFragment feedAllArticlesFragment, hc.a.EnumC1914a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        feedAllArticlesFragment.f133151h = type;
        Map<Integer, List<jc.a>> mapF = feedAllArticlesFragment.getFeedViewModel().j1().f();
        if (mapF != null) {
            feedAllArticlesFragment.K(mapF, feedAllArticlesFragment.f133151h);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(FeedAllArticlesFragment feedAllArticlesFragment, Map map) {
        Intrinsics.checkNotNull(map);
        feedAllArticlesFragment.K(map, feedAllArticlesFragment.f133151h);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(FeedAllArticlesFragment feedAllArticlesFragment, Pair pair) {
        if (pair != null) {
            com.planner5d.library.activity.fragment.dialog.k.a aVarC = feedAllArticlesFragment.getDialogLauncher().c(VideoPlayerDialog.class);
            com.planner5d.library.services.utility.i iVarI = new com.planner5d.library.services.utility.i().i(com.planner5d.library.services.r.uri, (Parcelable) pair.getFirst());
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.title;
            String str = (String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            aVarC.h(iVarI.j(rVar, str).a()).g();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(FeedAllArticlesFragment feedAllArticlesFragment) {
        feedAllArticlesFragment.getFeedViewModel().D1();
        return Unit.f312394a;
    }

    private final void K(Map<Integer, ? extends List<jc.a>> map, hc.a.EnumC1914a enumC1914a) {
        s sVar = this.f133150g;
        com.planner5d.library.databinding.r0 r0Var = null;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sVar = null;
        }
        List<jc.a> listEmptyList = map.get(com.planner5d.library.activity.fragment.feed.c.a(enumC1914a));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        sVar.t(enumC1914a, listEmptyList);
        Parcelable parcelable = this.f133153j;
        if (parcelable != null) {
            com.planner5d.library.databinding.r0 r0Var2 = this.f133149f;
            if (r0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r0Var2 = null;
            }
            RecyclerView.p layoutManager = r0Var2.f159583b.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.x1(parcelable);
            }
            this.f133153j = null;
        }
        com.planner5d.library.databinding.r0 r0Var3 = this.f133149f;
        if (r0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r0Var = r0Var3;
        }
        RecyclerView recyclerView = r0Var.f159583b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(0);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final e1 getFeedViewModel() {
        e1 e1Var = this.feedViewModel;
        if (e1Var != null) {
            return e1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("feedViewModel");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.y0 getImageManager() {
        com.planner5d.library.model.manager.y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).N(true).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @kotlin.l(message = "This is a temp method to be used until we don't stop using savedInstanceStateDefault")
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.scrollPosition;
        com.planner5d.library.databinding.r0 r0Var = null;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Parcelable.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        if (parcelable == null) {
            parcelable = null;
        }
        this.f133153j = parcelable;
        com.planner5d.library.services.utility.j jVar2 = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.type;
        hc.a.EnumC1914a enumC1914a = (hc.a.EnumC1914a) jVar2.s(rVar2, null);
        if (enumC1914a == null) {
            Serializable serializableS = jVar.s(rVar2, this.f133151h);
            Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.feed.activity.fragment.FeedListItem.ViewType");
            enumC1914a = (hc.a.EnumC1914a) serializableS;
        }
        this.f133151h = enumC1914a;
        this.f133150g = new s(this.f133152i, getImageManager(), g2.a(getFeedViewModel()), E(), this.f133151h, false);
        com.planner5d.library.databinding.r0 r0VarD = com.planner5d.library.databinding.r0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(r0VarD, "inflate(...)");
        y yVar = new y(this.f133151h);
        yVar.l(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedAllArticlesFragment.G(this.f133335a, (hc.a.EnumC1914a) obj);
            }
        });
        int integer = getResources().getInteger(com.planner5d.library.f.k.f168590r);
        RecyclerView recyclerView = r0VarD.f159583b;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), integer);
        gridLayoutManager.R3(new b(integer));
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = r0VarD.f159583b;
        s sVar = this.f133150g;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sVar = null;
        }
        recyclerView2.setAdapter(new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{yVar, sVar}));
        this.f133149f = r0VarD;
        getFeedViewModel().j1().k(this, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedAllArticlesFragment.H(this.f133363a, (Map) obj);
            }
        }));
        getFeedViewModel().p1().k(this, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.feed.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedAllArticlesFragment.I(this.f133367a, (Pair) obj);
            }
        }));
        com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
        q3.b bVarA0 = a1Var.A0(com.planner5d.library.activity.fragment.feed.c.a(this.f133151h));
        if (bVarA0 != null) {
            a1Var.e1(q3.a.open, bVarA0, this.f133151h == hc.a.EnumC1914a.Videos ? q3.d.show_more_videos : q3.d.show_more_articles);
        }
        F().f(new Function0() { // from class: com.planner5d.library.activity.fragment.feed.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeedAllArticlesFragment.J(this.f133446a);
            }
        });
        com.planner5d.library.databinding.r0 r0Var2 = this.f133149f;
        if (r0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r0Var = r0Var2;
        }
        ConstraintLayout root = r0Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putSerializable(com.planner5d.library.services.r.type.f224891a, this.f133151h);
        super.onSaveInstanceState(outState);
    }

    public final void setDialogLauncher(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setFeedViewModel(@NotNull e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<set-?>");
        this.feedViewModel = e1Var;
    }

    public final void setImageManager(@NotNull com.planner5d.library.model.manager.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}
