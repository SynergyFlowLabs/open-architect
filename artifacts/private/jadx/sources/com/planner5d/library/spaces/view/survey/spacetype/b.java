package com.planner5d.library.spaces.view.survey.spacetype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.statistics.events.c4;
import ee.k;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class b extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230595c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<com.planner5d.library.spaces.data.h, Unit> f230596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<com.planner5d.library.spaces.data.h> f230597b;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f230598b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f230599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(de.b.l.f272563l2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f230599a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 function1, com.planner5d.library.spaces.data.h hVar, View view) {
            function1.invoke(hVar);
        }

        public final void h(@NotNull final com.planner5d.library.spaces.data.h answer, @NotNull final Function1<? super com.planner5d.library.spaces.data.h, Unit> onClick) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            k kVarA = k.a(this.itemView);
            kVarA.f274833c.setImageResource(answer.f());
            kVarA.f274834d.setText(this.itemView.getContext().getString(answer.h()));
            kVarA.getRoot().setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            kVarA.getRoot().setClipToOutline(true);
            kVarA.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.spacetype.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.i(onClick, answer, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f230599a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super com.planner5d.library.spaces.data.h, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f230596a = onClick;
        this.f230597b = CollectionsKt.listOf((Object[]) new com.planner5d.library.spaces.data.h[]{new com.planner5d.library.spaces.data.h(de.b.g.X4, de.b.r.Bi, c4.g.house), new com.planner5d.library.spaces.data.h(de.b.g.f271839jd, de.b.r.qp, c4.g.room), new com.planner5d.library.spaces.data.h(de.b.g.f271748dc, de.b.r.Ep, c4.g.office), new com.planner5d.library.spaces.data.h(de.b.g.C0, de.b.r.Ai, c4.g.apartment), new com.planner5d.library.spaces.data.h(de.b.g.Ga, de.b.r.ou, c4.g.landscape), new com.planner5d.library.spaces.data.h(de.b.g.f271838jc, de.b.r.Xi, c4.g.other)});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230597b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).h(this.f230597b.get(i10), this.f230596a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent);
    }
}
