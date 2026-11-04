package com.planner5d.library.project.fragment.aidesigner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.annotation.v;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends RecyclerView.h<C1656b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f223684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Unit> f223685b;

    /* JADX INFO: renamed from: com.planner5d.library.project.fragment.aidesigner.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAiDesignerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiDesignerAdapter.kt\ncom/planner5d/library/project/fragment/aidesigner/AiDesignerAdapter$ViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,55:1\n257#2,2:56\n*S KotlinDebug\n*F\n+ 1 AiDesignerAdapter.kt\ncom/planner5d/library/project/fragment/aidesigner/AiDesignerAdapter$ViewHolder\n*L\n49#1:56,2\n*E\n"})
    public static final class C1656b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f223690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final nd.e f223691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1656b(@NotNull Context context, @NotNull nd.e binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f223690a = context;
            this.f223691b = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function0 function0, View view) {
            function0.invoke();
        }

        public final void h(@NotNull a item, @NotNull final Function0<Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.project.fragment.aidesigner.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.C1656b.i(onSelect, view);
                }
            });
            nd.e eVar = this.f223691b;
            eVar.f332769c.setImageDrawable(j.a.b(this.f223690a, item.b()));
            eVar.f332770d.setText(item.c());
            eVar.f332768b.setText(item.a());
            TextView tooltip = eVar.f332771e;
            Intrinsics.checkNotNullExpressionValue(tooltip, "tooltip");
            tooltip.setVisibility(item.d() ? 0 : 8);
        }

        @NotNull
        public final nd.e j() {
            return this.f223691b;
        }

        @NotNull
        public final Context k() {
            return this.f223690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<a> list, @NotNull Function1<? super Integer, Unit> onItemClicked) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        this.f223684a = list;
        this.f223685b = onItemClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(b bVar, int i10) {
        bVar.f223685b.invoke(Integer.valueOf(i10));
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f223684a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C1656b holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f223684a.get(i10), new Function0() { // from class: com.planner5d.library.project.fragment.aidesigner.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.j(this.f223682a, i10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C1656b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nd.e eVarD = nd.e.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(eVarD, "inflate(...)");
        return new C1656b(context, eVarD);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f223686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f223687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f223688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f223689d;

        public a(@v int i10, @f1 int i11, @f1 int i12, boolean z10) {
            this.f223686a = i10;
            this.f223687b = i11;
            this.f223688c = i12;
            this.f223689d = z10;
        }

        public final int a() {
            return this.f223688c;
        }

        public final int b() {
            return this.f223686a;
        }

        public final int c() {
            return this.f223687b;
        }

        public final boolean d() {
            return this.f223689d;
        }

        public /* synthetic */ a(int i10, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, i12, (i13 & 8) != 0 ? false : z10);
        }
    }
}
