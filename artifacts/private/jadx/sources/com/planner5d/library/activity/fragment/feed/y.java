package com.planner5d.library.activity.fragment.feed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.t3;
import com.planner5d.library.model.manager.statistics.events.q3;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f133663d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f133664e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133665f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private hc.a.EnumC1914a f133666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function1<? super hc.a.EnumC1914a, Unit> f133667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final hc.a.EnumC1914a f133668c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nFeedCategoriesHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedCategoriesHeaderAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedCategoriesHeaderAdapter$ViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n67#2,4:103\n37#2,2:107\n55#2:109\n72#2:110\n*S KotlinDebug\n*F\n+ 1 FeedCategoriesHeaderAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedCategoriesHeaderAdapter$ViewHolder\n*L\n79#1:103,4\n79#1:107,2\n79#1:109\n79#1:110\n*E\n"})
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f133669d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final t3 f133670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final hc.a.EnumC1914a f133671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<hc.a.EnumC1914a, CheckedTextView> f133672c;

        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 FeedCategoriesHeaderAdapter.kt\ncom/planner5d/library/activity/fragment/feed/FeedCategoriesHeaderAdapter$ViewHolder\n*L\n1#1,52:1\n70#2:53\n79#3:54\n*E\n"})
        public static final class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                b.this.f133670a.f159700d.scrollTo(view.getLeft(), 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull t3 binding, @NotNull hc.a.EnumC1914a initialBlogType) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(initialBlogType, "initialBlogType");
            this.f133670a = binding;
            this.f133671b = initialBlogType;
            this.f133672c = MapsKt.mapOf(TuplesKt.to(hc.a.EnumC1914a.Inspiration, binding.f159699c), TuplesKt.to(hc.a.EnumC1914a.ForYourHome, binding.f159698b), TuplesKt.to(hc.a.EnumC1914a.Tips, binding.f159701e), TuplesKt.to(hc.a.EnumC1914a.Videos, binding.f159703g));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(b bVar, Function1 function1, View view) {
            bVar.k(view);
            hc.a.EnumC1914a enumC1914aL = bVar.l();
            if (enumC1914aL != null) {
                function1.invoke(enumC1914aL);
                bVar.n(enumC1914aL);
            }
        }

        private final void k(View view) {
            for (Map.Entry<hc.a.EnumC1914a, CheckedTextView> entry : this.f133672c.entrySet()) {
                entry.getValue().setChecked(Intrinsics.areEqual(view, entry.getValue()));
            }
        }

        private final hc.a.EnumC1914a l() {
            for (Map.Entry<hc.a.EnumC1914a, CheckedTextView> entry : this.f133672c.entrySet()) {
                if (entry.getValue().isChecked()) {
                    return entry.getKey();
                }
            }
            return null;
        }

        private final void m(hc.a.EnumC1914a enumC1914a) {
            CheckedTextView checkedTextView = this.f133672c.get(enumC1914a);
            k(checkedTextView);
            if (checkedTextView != null) {
                if (!checkedTextView.isLaidOut() || checkedTextView.isLayoutRequested()) {
                    checkedTextView.addOnLayoutChangeListener(new a());
                } else {
                    this.f133670a.f159700d.scrollTo(checkedTextView.getLeft(), 0);
                }
            }
        }

        private final void n(hc.a.EnumC1914a enumC1914a) {
            com.planner5d.library.model.manager.statistics.events.a1 a1Var = com.planner5d.library.model.manager.statistics.events.a1.f216679b;
            q3.b bVarA0 = a1Var.A0(c.a(enumC1914a));
            if (bVarA0 != null) {
                a1Var.e1(q3.a.filter, bVarA0, this.f133671b == hc.a.EnumC1914a.Videos ? q3.d.show_more_videos : q3.d.show_more_articles);
            }
        }

        public final void i(@NotNull hc.a.EnumC1914a blogType, @NotNull final Function1<? super hc.a.EnumC1914a, Unit> onCategoryChangeListener) {
            Intrinsics.checkNotNullParameter(blogType, "blogType");
            Intrinsics.checkNotNullParameter(onCategoryChangeListener, "onCategoryChangeListener");
            m(blogType);
            for (CheckedTextView checkedTextView : this.f133672c.values()) {
                Intrinsics.checkNotNullExpressionValue(checkedTextView, "next(...)");
                checkedTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.feed.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        y.b.j(this.f133675a, onCategoryChangeListener, view);
                    }
                });
            }
        }
    }

    public y(@NotNull hc.a.EnumC1914a blogType) {
        Intrinsics.checkNotNullParameter(blogType, "blogType");
        this.f133666a = blogType;
        this.f133668c = blogType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(y yVar, hc.a.EnumC1914a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        yVar.f133666a = it;
        Function1<? super hc.a.EnumC1914a, Unit> function1 = yVar.f133667b;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.i(this.f133666a, new Function1() { // from class: com.planner5d.library.activity.fragment.feed.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.j(this.f133661a, (hc.a.EnumC1914a) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        t3 t3VarD = t3.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(t3VarD, "inflate(...)");
        return new b(t3VarD, this.f133668c);
    }

    public final void l(@NotNull Function1<? super hc.a.EnumC1914a, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f133667b = listener;
    }
}
