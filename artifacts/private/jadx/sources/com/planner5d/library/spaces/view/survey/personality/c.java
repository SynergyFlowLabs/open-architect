package com.planner5d.library.spaces.view.survey.personality;

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
@SourceDebugExtension({"SMAP\nSurveyStepPersonalityAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyStepPersonalityAdapter.kt\ncom/planner5d/library/spaces/view/survey/personality/SurveyStepPersonalityAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1872#2,3:81\n295#2,2:84\n*S KotlinDebug\n*F\n+ 1 SurveyStepPersonalityAdapter.kt\ncom/planner5d/library/spaces/view/survey/personality/SurveyStepPersonalityAdapter\n*L\n53#1:81,3\n66#1:84,2\n*E\n"})
public final class c extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230574e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f230575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f230576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.spaces.data.g> f230577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList<com.planner5d.library.spaces.data.g> f230578d;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f230579b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f230580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(de.b.l.f272555j2, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f230580a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 function1, com.planner5d.library.spaces.data.g gVar, View view) {
            function1.invoke(gVar);
        }

        public final void h(@NotNull final com.planner5d.library.spaces.data.g answer, @NotNull final Function1<? super com.planner5d.library.spaces.data.g, Unit> onClick) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            ee.i iVarA = ee.i.a(this.itemView);
            iVarA.f274824b.setText(answer.h());
            iVarA.f274824b.setChecked(answer.g());
            iVarA.f274824b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.survey.personality.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a.i(onClick, answer, view);
                }
            });
        }

        @NotNull
        public final ViewGroup j() {
            return this.f230580a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Function1<? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f230575a = onClick;
        List<com.planner5d.library.spaces.data.g> listShuffled = CollectionsKt.shuffled(CollectionsKt.listOf((Object[]) new com.planner5d.library.spaces.data.g[]{new com.planner5d.library.spaces.data.g(de.b.r.iu, c4.f.household_owner, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.gu, c4.f.interior_design_enthusiast, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.hu, c4.f.future_property_buyer, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.ju, c4.f.interior_designer, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.mu, c4.f.real_estate_agent_stager, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.eu, c4.f.architect, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.lu, c4.f.property_developer, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.nu, c4.f.student_architecture_design, false, 4, null), new com.planner5d.library.spaces.data.g(de.b.r.fu, c4.f.contractor_builder, false, 4, null)}));
        this.f230577c = listShuffled;
        ArrayList<com.planner5d.library.spaces.data.g> arrayList = new ArrayList<>();
        arrayList.addAll(listShuffled);
        arrayList.add(new com.planner5d.library.spaces.data.g(de.b.r.Xi, c4.f.other, false, 4, null));
        this.f230578d = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(c cVar, int i10, com.planner5d.library.spaces.data.g answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        cVar.f230576b = Integer.valueOf(i10);
        cVar.m(answer);
        cVar.f230575a.invoke(Boolean.TRUE);
        return Unit.f312394a;
    }

    private final void m(com.planner5d.library.spaces.data.g gVar) {
        int i10 = 0;
        for (Object obj : this.f230578d) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.planner5d.library.spaces.data.g gVar2 = (com.planner5d.library.spaces.data.g) obj;
            if (Intrinsics.areEqual(gVar2, gVar)) {
                gVar2.i(true);
                notifyItemChanged(i10);
            } else if (gVar2.g()) {
                gVar2.i(false);
                notifyItemChanged(i10);
            }
            i10 = i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f230578d.size();
    }

    @Nullable
    public final com.planner5d.library.spaces.data.g i() {
        Object next;
        Iterator<T> it = this.f230578d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.planner5d.library.spaces.data.g) next).g()) {
                return (com.planner5d.library.spaces.data.g) next;
            }
        }
        next = null;
        return (com.planner5d.library.spaces.data.g) next;
    }

    @Nullable
    public final Integer j() {
        return this.f230576b;
    }

    public final void l(@Nullable Integer num) {
        this.f230576b = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        com.planner5d.library.spaces.data.g gVar = this.f230578d.get(i10);
        Intrinsics.checkNotNullExpressionValue(gVar, "get(...)");
        ((a) holder).h(gVar, new Function1() { // from class: com.planner5d.library.spaces.view.survey.personality.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.k(this.f230570a, i10, (com.planner5d.library.spaces.data.g) obj);
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
