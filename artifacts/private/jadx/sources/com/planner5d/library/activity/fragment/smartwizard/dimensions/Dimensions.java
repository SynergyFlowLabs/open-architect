package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import android.graphics.PointF;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.u1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.o0;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.editor.facade.e0;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@e.a({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nDimensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimensions.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/Dimensions\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n12#2,6:183\n28#2:189\n1#3:190\n13409#4,2:191\n*S KotlinDebug\n*F\n+ 1 Dimensions.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/Dimensions\n*L\n50#1:183,6\n50#1:189\n169#1:191,2\n*E\n"})
public final class Dimensions extends SmartWizardEditor2DFragment<t> {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.widget.editor.editaction.f actionExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f135494f;

    @ij.a
    public com.planner5d.library.model.converter.json.to.f fromItemLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final p f135495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f135496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final PointF f135497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f135498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f135499k;

    @ij.a
    public t1 logRecordManager;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135500a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135500a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f135500a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135500a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class b implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<w> f135502b;

        b(List<w> list) {
            this.f135502b = list;
        }

        @Override // com.planner5d.library.activity.fragment.smartwizard.dimensions.x
        public void a(int i10, w wall, boolean z10) {
            Intrinsics.checkNotNullParameter(wall, "wall");
            int iB = i10 - wall.b();
            wall.h(i10);
            w wVarF = wall.f();
            if (wVarF != null) {
                Dimensions dimensions = Dimensions.this;
                List<w> list = this.f135502b;
                wVarF.h(wVarF.b() + iB);
                dimensions.f135495g.k(list.indexOf(wVarF), wVarF);
            }
            Dimensions.this.getViewModel().N0(i10, wall);
            if (z10) {
                Dimensions.this.getViewModel().I0();
            } else {
                Dimensions.this.getViewModel().H0();
            }
        }
    }

    public Dimensions() {
        t3 t3Var = t3.f229751a;
        this.f135494f = new i2(j1.d(t.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f135495g = new p(null, 1, null);
        this.f135497i = new PointF(0.0f, 0.0f);
        com.planner5d.library.application.b.f142455c.a().Q(this);
        I(true);
    }

    private final void Y(String str, ItemProject itemProject) {
        ItemWindow[] windows;
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        Bundle arguments = getArguments();
        if (arguments != null) {
            iVar.s(arguments);
        }
        iVar.j(com.planner5d.library.services.r.smartWizardRoomDataReference, str);
        Bundle bundleA = iVar.a();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putIntArray(com.planner5d.library.services.r.smartWizardDimensionsSavedWalls.f224891a, this.f135495g.h());
            Bundle bundle = new Bundle();
            ItemLayout itemLayout = new ItemLayout();
            ItemFloor activeFloor = itemProject.getActiveFloor();
            if (activeFloor != null && (windows = activeFloor.getWindows()) != null) {
                for (ItemWindow itemWindow : windows) {
                    try {
                        String uid = itemWindow.getUid();
                        com.planner5d.library.model.converter.json.to.f fromItemLayout = getFromItemLayout();
                        ItemLayout layout = itemWindow.getLayout(itemLayout);
                        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
                        bundle.putString(uid, fromItemLayout.convert(layout).toString());
                    } catch (JSONException e10) {
                        getLogRecordManager().b("dimensions", null, e10);
                    }
                }
            }
            if (!bundle.isEmpty()) {
                arguments2.putBundle(com.planner5d.library.services.r.smartWizardDimensionsSavedWindows.f224891a, bundle);
            }
        }
        androidx.navigation.fragment.f.a(this).c0(q.a().e(), bundleA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(o0 o0Var, Dimensions dimensions, Boolean bool) {
        o0Var.f159424e.setEnabled(!bool.booleanValue());
        if (!bool.booleanValue() && dimensions.f135498j) {
            dimensions.f135498j = false;
            p pVar = dimensions.f135495g;
            Bundle arguments = dimensions.getArguments();
            pVar.j(arguments != null ? arguments.getIntArray(com.planner5d.library.services.r.smartWizardDimensionsSavedWalls.f224891a) : null);
        }
        if (!bool.booleanValue() && dimensions.f135499k) {
            dimensions.f135499k = false;
            ItemProject item = dimensions.B().getItem();
            if (item != null) {
                dimensions.getViewModel().S0(item);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(final Dimensions dimensions, View view) {
        final ItemProject item = dimensions.B().getItem();
        if (item != null) {
            Observable<String> observableK0 = dimensions.getViewModel().K0(item);
            final Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Dimensions.b0(this.f135520a, item, (String) obj);
                }
            };
            Subscription subscriptionSubscribe = observableK0.subscribe(new Action1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.h
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    Dimensions.c0(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscriptionSubscribe, "subscribe(...)");
            dimensions.y(subscriptionSubscribe);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(Dimensions dimensions, ItemProject itemProject, String str) {
        Intrinsics.checkNotNull(str);
        dimensions.Y(str, itemProject);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(Dimensions dimensions, View view) {
        dimensions.getViewModel().D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(Pair old, Pair pair) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(pair, "new");
        return Intrinsics.areEqual(old.first, pair.first) && ((w) old.second).g().getWallIndex() == ((w) pair.second).g().getWallIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f0(Dimensions dimensions, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dimensions.getEditor().getPainterData().w() ? 1000L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(Dimensions dimensions, Pair pair) {
        t viewModel = dimensions.getViewModel();
        Object first = pair.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        int iIntValue = ((Number) first).intValue();
        Object second = pair.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        Pair<com.planner5d.library.widget.editor.editaction.e, com.planner5d.library.widget.editor.editaction.e> pairR0 = viewModel.R0(iIntValue, (w) second);
        com.planner5d.library.widget.editor.editaction.e eVar = (com.planner5d.library.widget.editor.editaction.e) pairR0.first;
        if (eVar != null) {
            dimensions.getActionExecutor().a(eVar, pairR0.second == null, dimensions.B());
        }
        com.planner5d.library.widget.editor.editaction.e eVar2 = (com.planner5d.library.widget.editor.editaction.e) pairR0.second;
        if (eVar2 != null) {
            dimensions.getActionExecutor().a(eVar2, true, dimensions.B());
        }
        PointF pointFE1 = dimensions.B().G().E1();
        if (!Intrinsics.areEqual(dimensions.f135497i, pointFE1)) {
            com.planner5d.library.widget.editor.editor2d.painter.d painterData = dimensions.getEditor().getPainterData();
            float f10 = pointFE1.x;
            PointF pointF = dimensions.f135497i;
            painterData.C(f10 - pointF.x, pointFE1.y - pointF.y, false);
            dimensions.f135497i.set(pointFE1);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(Dimensions dimensions, Pair pair) {
        o0 o0Var = dimensions.f135496h;
        if (o0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o0Var = null;
        }
        o0Var.f159423d.setText(((com.planner5d.library.model.metricunit.a) pair.first).g());
        dimensions.f135495g.notifyDataSetChanged();
        com.planner5d.library.widget.editor.editaction.s sVar = (com.planner5d.library.widget.editor.editaction.s) pair.second;
        if (sVar != null) {
            dimensions.getActionExecutor().a(sVar, true, dimensions.B());
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    protected void F(@Nullable Project project, @Nullable ItemProject itemProject) {
        super.F(project, itemProject);
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = B().G().G1();
        if (bVarG1 != null) {
            e0 e0VarF = B().F();
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVarG1).b(true).h(false).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            e0VarF.w(bVarA);
        }
        B().F().x();
        this.f135497i.set(B().G().E1());
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    protected void J(@Nullable ItemProject itemProject) {
        if (itemProject != null) {
            List<w> listO0 = getViewModel().O0(itemProject);
            this.f135495g.i(listO0, new b(listO0));
            Bundle arguments = getArguments();
            if (arguments != null && arguments.containsKey(com.planner5d.library.services.r.smartWizardDimensionsSavedWalls.f224891a)) {
                this.f135498j = true;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.containsKey(com.planner5d.library.services.r.smartWizardDimensionsSavedWindows.f224891a)) {
                return;
            }
            this.f135499k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    @NotNull
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public t getViewModel() {
        return (t) this.f135494f.getValue();
    }

    @NotNull
    public final com.planner5d.library.widget.editor.editaction.f getActionExecutor() {
        com.planner5d.library.widget.editor.editaction.f fVar = this.actionExecutor;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionExecutor");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    @NotNull
    public Editor2D getEditor() {
        o0 o0Var = this.f135496h;
        if (o0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o0Var = null;
            int i10 = 5 | 0;
        }
        Editor2D editor = o0Var.f159422c;
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        return editor;
    }

    @NotNull
    public final com.planner5d.library.model.converter.json.to.f getFromItemLayout() {
        com.planner5d.library.model.converter.json.to.f fVar = this.fromItemLayout;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fromItemLayout");
        return null;
    }

    @NotNull
    public final t1 getLogRecordManager() {
        t1 t1Var = this.logRecordManager;
        if (t1Var != null) {
            return t1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logRecordManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Serializable serializableS = new com.planner5d.library.services.utility.j(getArguments()).s(com.planner5d.library.services.r.roomShape, com.planner5d.library.activity.fragment.smartwizard.roomshape.i.lType);
        t viewModel = getViewModel();
        Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.smartwizard.roomshape.RoomShape");
        viewModel.Q0((com.planner5d.library.activity.fragment.smartwizard.roomshape.i) serializableS);
        final o0 o0VarD = o0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(o0VarD, "inflate(...)");
        o0VarD.f159421b.setAdapter(this.f135495g);
        getViewModel().c0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Dimensions.Z(o0VarD, this, (Boolean) obj);
            }
        }));
        o0VarD.f159424e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dimensions.a0(this.f135538a, view);
            }
        });
        o0VarD.f159423d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dimensions.d0(this.f135539a, view);
            }
        });
        this.f135496h = o0VarD;
        com.planner5d.library.activity.helper.ui.d.i(new k3(com.planner5d.library.f.s.hC, new Object[0]));
        o0 o0Var = this.f135496h;
        if (o0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o0Var = null;
        }
        FrameLayout root = o0Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment, androidx.fragment.app.Fragment
    @e.a({"NotifyDataSetChanged"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        o0 o0Var = this.f135496h;
        if (o0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            o0Var = null;
        }
        u1.j2(o0Var.getRoot(), new ef.b());
        getViewModel().E0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Dimensions.h0(this.f135523a, (Pair) obj);
            }
        }));
        androidx.lifecycle.w.g(kotlinx.coroutines.flow.k.d0(kotlinx.coroutines.flow.k.j0(androidx.lifecycle.w.a(getViewModel().G0()), new Function2() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(Dimensions.e0((Pair) obj, (Pair) obj2));
            }
        }), new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(Dimensions.f0(this.f135534a, (Pair) obj));
            }
        }), null, 0L, 3, null).k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Dimensions.g0(this.f135535a, (Pair) obj);
            }
        }));
    }

    public final void setActionExecutor(@NotNull com.planner5d.library.widget.editor.editaction.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.actionExecutor = fVar;
    }

    public final void setFromItemLayout(@NotNull com.planner5d.library.model.converter.json.to.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.fromItemLayout = fVar;
    }

    public final void setLogRecordManager(@NotNull t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "<set-?>");
        this.logRecordManager = t1Var;
    }
}
