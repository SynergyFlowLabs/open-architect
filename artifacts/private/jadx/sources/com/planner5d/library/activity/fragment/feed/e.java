package com.planner5d.library.activity.fragment.feed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.f4;
import com.planner5d.library.databinding.g4;
import com.planner5d.library.widget.AnimatedVectorImageView;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFeedAiTaskListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedAiTaskListAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedAiTaskListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class e extends androidx.recyclerview.widget.u<com.planner5d.library.activity.fragment.feed.a, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f133198g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.u0 f133199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f133200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<com.planner5d.library.activity.fragment.feed.a, Unit> f133201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<a, Unit> f133202f;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a extends com.planner5d.library.activity.fragment.list.holders.a<com.planner5d.library.activity.fragment.feed.a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f133203f = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final View f133204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.u0 f133205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final AnimatedVectorImageView f133206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<com.planner5d.library.activity.fragment.feed.a, Unit> f133207e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull View view, @NotNull com.planner5d.library.model.manager.u0 hapticManager, @Nullable AnimatedVectorImageView animatedVectorImageView, @NotNull Function1<? super com.planner5d.library.activity.fragment.feed.a, Unit> onClick) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f133204b = view;
            this.f133205c = hapticManager;
            this.f133206d = animatedVectorImageView;
            this.f133207e = onClick;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(a aVar, com.planner5d.library.activity.fragment.feed.a aVar2, View view) {
            aVar.f133205c.a(aVar.f133204b);
            aVar.f133207e.invoke(aVar2);
        }

        @Override // com.planner5d.library.activity.fragment.list.holders.a
        public void a() {
            AnimatedVectorImageView animatedVectorImageView = this.f133206d;
            if (animatedVectorImageView != null) {
                animatedVectorImageView.e();
            }
        }

        @Override // com.planner5d.library.activity.fragment.list.holders.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void g(@Nullable final com.planner5d.library.activity.fragment.feed.a aVar) {
            AnimatedVectorImageView animatedVectorImageView = this.f133206d;
            if (animatedVectorImageView != null) {
                animatedVectorImageView.d();
            }
            this.f133204b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.k(this.f133194a, aVar, view);
                }
            });
        }
    }

    public enum b {
        UploadInProgress(1),
        UploadFailed(2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133211e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f133212a;

        b(int i10) {
            this.f133212a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f133211e;
        }

        public final int n() {
            return this.f133212a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull com.planner5d.library.model.manager.u0 hapticManager, @NotNull b viewType, @NotNull Function1<? super com.planner5d.library.activity.fragment.feed.a, Unit> onClick) {
        super(new yc.c());
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f133199c = hapticManager;
        this.f133200d = viewType;
        this.f133201e = onClick;
        this.f133202f = new WeakHashMap<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f133200d.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        com.planner5d.library.activity.fragment.feed.a aVarI = i(i10);
        Intrinsics.checkNotNullExpressionValue(aVarI, "getItem(...)");
        holder.g(new com.planner5d.library.activity.fragment.feed.a(aVarI));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        a aVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i11 = 3 ^ 0;
        if (i10 == b.UploadInProgress.n()) {
            g4 g4VarD = g4.d(layoutInflaterFrom, parent, false);
            ConstraintLayout root = g4VarD.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            aVar = new a(root, this.f133199c, g4VarD.f159018c, this.f133201e);
        } else {
            ConstraintLayout root2 = f4.d(layoutInflaterFrom, parent, false).getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            aVar = new a(root2, this.f133199c, null, this.f133201e);
        }
        this.f133202f.put(aVar, Unit.f312394a);
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.a();
        super.onViewRecycled(holder);
    }
}
