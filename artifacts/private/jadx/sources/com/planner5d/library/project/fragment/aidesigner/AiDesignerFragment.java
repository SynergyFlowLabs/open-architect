package com.planner5d.library.project.fragment.aidesigner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.f3;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.widget.c0;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nAiDesignerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiDesignerFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiDesignerFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,64:1\n16#2:65\n*S KotlinDebug\n*F\n+ 1 AiDesignerFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiDesignerFragment\n*L\n19#1:65\n*E\n"})
public final class AiDesignerFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nd.a f223672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f223673b = new i2(j1.d(f.class), new a(), new b(com.planner5d.library.project.application.c.f223658b.a()), null, 8, null);

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AiDesignerFragment.kt\ncom/planner5d/library/project/fragment/aidesigner/AiDesignerFragment\n*L\n1#1,16:1\n19#2:17\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AiDesignerFragment.this.getViewModelStore();
        }
    }

    public static final class b implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f223675a;

        public b(com.planner5d.library.view.b bVar) {
            this.f223675a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f223675a;
        }
    }

    public AiDesignerFragment() {
        int i10 = 7 ^ 0;
    }

    private final f u() {
        return (f) this.f223673b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(AiDesignerFragment aiDesignerFragment, int i10) {
        StatisticsEventAiDesigner.g gVar = StatisticsEventAiDesigner.g.furnisher;
        if (i10 == gVar.ordinal()) {
            boolean z10 = true & false;
            aiDesignerFragment.u().X(StatisticsEventAiDesigner.EventData.j(aiDesignerFragment.u().W(), null, gVar, null, null, null, null, null, 125, null));
            aiDesignerFragment.u().U(StatisticsEventAiDesigner.a.tool_selected);
            androidx.navigation.fragment.f.a(aiDesignerFragment).c0(e.a().e(), new f3(aiDesignerFragment.getArguments(), aiDesignerFragment.u().W()).a());
        } else {
            StatisticsEventAiDesigner.g gVar2 = StatisticsEventAiDesigner.g.styler;
            if (i10 == gVar2.ordinal()) {
                aiDesignerFragment.u().X(StatisticsEventAiDesigner.EventData.j(aiDesignerFragment.u().W(), null, gVar2, null, null, null, null, null, 125, null));
                aiDesignerFragment.u().U(StatisticsEventAiDesigner.a.tool_selected);
                androidx.navigation.fragment.f.a(aiDesignerFragment).c0(e.a().e(), new f3(aiDesignerFragment.getArguments(), aiDesignerFragment.u().W()).a());
            } else {
                StatisticsEventAiDesigner.g gVar3 = StatisticsEventAiDesigner.g.decorator;
                if (i10 == gVar3.ordinal()) {
                    aiDesignerFragment.u().X(StatisticsEventAiDesigner.EventData.j(aiDesignerFragment.u().W(), null, gVar3, null, null, null, null, null, 125, null));
                    aiDesignerFragment.u().U(StatisticsEventAiDesigner.a.tool_selected);
                    androidx.navigation.fragment.f.a(aiDesignerFragment).c0(e.a().e(), new f3(aiDesignerFragment.getArguments(), aiDesignerFragment.u().W()).a());
                }
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        u().U(StatisticsEventAiDesigner.a.back);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        u().X(g3.f216952a.a(getArguments()));
        u().U(StatisticsEventAiDesigner.a.open);
        nd.a aVarC = nd.a.c(inflater);
        this.f223672a = aVarC;
        aVarC.f332753b.setAdapter(new com.planner5d.library.project.fragment.aidesigner.b(u().V(), new Function1() { // from class: com.planner5d.library.project.fragment.aidesigner.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiDesignerFragment.v(this.f223693a, ((Integer) obj).intValue());
            }
        }));
        RecyclerView root = aVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
