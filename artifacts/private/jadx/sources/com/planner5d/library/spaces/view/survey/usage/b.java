package com.planner5d.library.spaces.view.survey.usage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.spaces.data.j;
import ee.o;
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
    public static final int f230633c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<c4.h, Unit> f230634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<j> f230635b;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f230636b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f230637a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(de.b.l.f272579p2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f230637a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 function1, j jVar, View view) {
            function1.invoke(jVar.h());
        }

        public final void h(@NotNull final j answer, @NotNull final Function1<? super c4.h, Unit> onClick) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            o oVarA = o.a(this.itemView);
            oVarA.f274854b.setImageResource(answer.g());
            oVarA.f274856d.setText(this.itemView.getContext().getString(answer.j()));
            oVarA.f274855c.setText(this.itemView.getContext().getString(answer.i()));
            oVarA.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.usage.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.i(onClick, answer, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f230637a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super c4.h, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f230634a = onClick;
        this.f230635b = CollectionsKt.listOf((Object[]) new j[]{new j(de.b.g.f271853kc, de.b.r.uu, de.b.r.Mt, c4.h.personal_use), new j(de.b.g.Fc, de.b.r.vu, de.b.r.Nt, c4.h.professional_use), new j(de.b.g.I4, de.b.r.tu, de.b.r.su, c4.h.for_school)});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230635b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).h(this.f230635b.get(i10), this.f230634a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent);
    }
}
