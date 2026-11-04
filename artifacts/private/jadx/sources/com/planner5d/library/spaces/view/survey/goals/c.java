package com.planner5d.library.spaces.view.survey.goals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.statistics.events.c4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSurveyStepGoalsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepGoalsAdapter.kt\ncom/planner5d/library/spaces/view/survey/goals/SurveyStepGoalsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1872#2,3:78\n295#2,2:81\n*S KotlinDebug\n*F\n+ 1 SurveyStepGoalsAdapter.kt\ncom/planner5d/library/spaces/view/survey/goals/SurveyStepGoalsAdapter\n*L\n50#1:78,3\n76#1:81,2\n*E\n"})
public final class c extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230552e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f230553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f230554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.spaces.data.f> f230555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList<com.planner5d.library.spaces.data.f> f230556d;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f230557b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f230558a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(de.b.l.f272555j2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f230558a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 function1, com.planner5d.library.spaces.data.f fVar, View view) {
            function1.invoke(fVar);
        }

        public final void h(@NotNull final com.planner5d.library.spaces.data.f answer, @NotNull final Function1<? super com.planner5d.library.spaces.data.f, Unit> onClick) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            ee.i iVarA = ee.i.a(this.itemView);
            iVarA.f274824b.setText(answer.h());
            iVarA.f274824b.setChecked(answer.g());
            iVarA.f274824b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.goals.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a.i(onClick, answer, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f230558a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Function1<? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f230553a = onClick;
        List<com.planner5d.library.spaces.data.f> listShuffled = CollectionsKt.shuffled(CollectionsKt.listOf((Object[]) new com.planner5d.library.spaces.data.f[]{new com.planner5d.library.spaces.data.f(de.b.r.Zt, c4.e.plan_a_renovation_before_starting, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.Tt, c4.e.design_a_new_home_from_scratch, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.cu, c4.e.test_what_furniture_fits_in_a_room, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.Qt, c4.e.create_projects_to_present_to_clients, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.au, c4.e.share_designs_with_family_or_friends, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.Ut, c4.e.build_a_dream_home_or_fantasy_project, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.Xt, c4.e.learn_interior_design_for_fun_or_study, false, 4, null), new com.planner5d.library.spaces.data.f(de.b.r.Wt, c4.e.make_images_and_walkthroughs_for_real_estate, false, 4, null)}));
        this.f230555c = listShuffled;
        ArrayList<com.planner5d.library.spaces.data.f> arrayList = new ArrayList<>();
        arrayList.addAll(listShuffled);
        arrayList.add(new com.planner5d.library.spaces.data.f(de.b.r.Yt, c4.e.something_else, false, 4, null));
        this.f230556d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(c cVar, int i10, com.planner5d.library.spaces.data.f answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        cVar.f230554b = Integer.valueOf(i10);
        cVar.m(answer);
        cVar.f230553a.invoke(Boolean.TRUE);
        return Unit.f312394a;
    }

    private final void m(com.planner5d.library.spaces.data.f fVar) {
        int i10 = 0;
        for (Object obj : this.f230556d) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.planner5d.library.spaces.data.f fVar2 = (com.planner5d.library.spaces.data.f) obj;
            if (Intrinsics.areEqual(fVar2, fVar)) {
                fVar2.i(true);
                notifyItemChanged(i10);
            } else if (fVar2.g()) {
                fVar2.i(false);
                notifyItemChanged(i10);
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230556d.size();
    }

    @Nullable
    public final com.planner5d.library.spaces.data.f i() {
        Object next;
        Iterator<T> it = this.f230556d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.planner5d.library.spaces.data.f) next).g()) {
                return (com.planner5d.library.spaces.data.f) next;
            }
        }
        next = null;
        return (com.planner5d.library.spaces.data.f) next;
    }

    @Nullable
    public final Integer j() {
        return this.f230554b;
    }

    public final void l(@Nullable Integer num) {
        this.f230554b = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        com.planner5d.library.spaces.data.f fVar = this.f230556d.get(i10);
        Intrinsics.checkNotNullExpressionValue(fVar, "get(...)");
        ((a) holder).h(fVar, new Function1() { // from class: com.planner5d.library.spaces.view.survey.goals.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.k(this.f230548a, i10, (com.planner5d.library.spaces.data.f) obj);
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
