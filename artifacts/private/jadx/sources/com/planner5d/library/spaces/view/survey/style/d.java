package com.planner5d.library.spaces.view.survey.style;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSurveyStepStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepStyleAdapter.kt\ncom/planner5d/library/spaces/view/survey/style/SurveyStepStyleAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n774#2:57\n865#2,2:58\n*S KotlinDebug\n*F\n+ 1 SurveyStepStyleAdapter.kt\ncom/planner5d/library/spaces/view/survey/style/SurveyStepStyleAdapter\n*L\n55#1:57\n55#1:58,2\n*E\n"})
public final class d extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230614c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f230615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<com.planner5d.library.spaces.data.i> f230616b;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f230617b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f230618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(de.b.l.f272571n2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f230618a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(ee.m mVar, View view) {
            mVar.f274845c.toggle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function1 function1, CompoundButton compoundButton, boolean z10) {
            function1.invoke(Boolean.valueOf(z10));
        }

        public final void i(@NotNull com.planner5d.library.spaces.data.i answer, @NotNull final Function1<? super Boolean, Unit> onClick) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            final ee.m mVarA = ee.m.a(this.itemView);
            mVarA.f274846d.setImageResource(answer.e());
            mVarA.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.style.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.j(mVarA, view);
                }
            });
            mVarA.f274845c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.spaces.view.survey.style.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    d.a.k(onClick, compoundButton, z10);
                }
            });
        }

        @NotNull
        public final ViewGroup l() {
            return this.f230618a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Function1<? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f230615a = onClick;
        this.f230616b = CollectionsKt.listOf((Object[]) new com.planner5d.library.spaces.data.i[]{new com.planner5d.library.spaces.data.i(de.b.g.f272004ud, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.f272064yd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.f272079zd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Ad, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Bd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Cd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Dd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Ed, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.Fd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.f272019vd, false, 2, null), new com.planner5d.library.spaces.data.i(de.b.g.f272034wd, false, 2, null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(d dVar, int i10, boolean z10) {
        dVar.f230616b.get(i10).g(z10);
        dVar.f230615a.invoke(Boolean.valueOf(!dVar.i().isEmpty()));
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230616b.size();
    }

    @NotNull
    public final List<com.planner5d.library.spaces.data.i> i() {
        List<com.planner5d.library.spaces.data.i> list = this.f230616b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.planner5d.library.spaces.data.i) obj).f()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).i(this.f230616b.get(i10), new Function1() { // from class: com.planner5d.library.spaces.view.survey.style.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.j(this.f230610a, i10, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent);
    }
}
