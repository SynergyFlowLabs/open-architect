package com.planner5d.library.uploadplan.view;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f230892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<c.a, Unit> f230893b;

    @SourceDebugExtension({"SMAP\nCreateProjectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateProjectAdapter.kt\ncom/planner5d/library/uploadplan/view/CreateProjectAdapter$ViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,43:1\n257#2,2:44\n*S KotlinDebug\n*F\n+ 1 CreateProjectAdapter.kt\ncom/planner5d/library/uploadplan/view/CreateProjectAdapter$ViewHolder\n*L\n34#1:44,2\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ie.o f230894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<c.a, Unit> f230895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ie.o binding, @NotNull Function1<? super c.a, Unit> onItemSelected) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
            this.f230894a = binding;
            this.f230895b = onItemSelected;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, c cVar, View view) {
            aVar.f230895b.invoke(cVar.e());
        }

        public final void h(@NotNull final c item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ie.o oVar = this.f230894a;
            Resources resources = oVar.getRoot().getResources();
            oVar.f287201d.setText(resources.getString(item.d()));
            oVar.f287200c.setText(resources.getString(item.c()));
            oVar.f287199b.setImageResource(item.a());
            TextView tooltipNew = oVar.f287202e;
            Intrinsics.checkNotNullExpressionValue(tooltipNew, "tooltipNew");
            tooltipNew.setVisibility(item.b() ? 0 : 8);
            oVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.i(this.f230881a, item, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<c> list, @NotNull Function1<? super c.a, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.f230892a = list;
        this.f230893b = onItemSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230892a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f230892a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ie.o oVarD = ie.o.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(oVarD, "inflate(...)");
        return new a(oVarD, this.f230893b);
    }
}
