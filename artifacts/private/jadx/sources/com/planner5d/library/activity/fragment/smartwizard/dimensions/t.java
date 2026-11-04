package com.planner5d.library.activity.fragment.smartwizard.dimensions;

import android.os.Bundle;
import android.util.Pair;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.j2;
import com.planner5d.library.widget.editor.helper.n3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDimensionsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimensionsViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionsViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1137#2,2:150\n1#3:152\n1863#4,2:153\n*S KotlinDebug\n*F\n+ 1 DimensionsViewModel.kt\ncom/planner5d/library/activity/fragment/smartwizard/dimensions/DimensionsViewModel\n*L\n117#1:150,2\n125#1:153,2\n*E\n"})
public final class t extends com.planner5d.library.activity.fragment.smartwizard.s {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f135546j3 = 8;
    private boolean H1;

    @NotNull
    private final com.planner5d.library.model.converter.json.to.o X;

    @NotNull
    private final com.planner5d.library.activity.helper.r Y;

    @NotNull
    private com.planner5d.library.activity.fragment.smartwizard.roomshape.i Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final j2 f135547g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Pair<com.planner5d.library.model.metricunit.a, com.planner5d.library.widget.editor.editaction.s>> f135548h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Pair<Integer, w>> f135549i3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final f2 f135550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final na.a f135551o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final List<w> f135552p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private com.planner5d.library.model.metricunit.a f135553p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private kf.b f135554p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final na.b f135555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final d0 f135556t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final na.c f135557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final oa.f f135558w;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.dimensions.DimensionsViewModel$1", f = "DimensionsViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135560b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135560b;
            if (i10 == 0) {
                ResultKt.m(obj);
                t tVar2 = t.this;
                f2 f2Var = tVar2.f135550n;
                this.f135559a = tVar2;
                this.f135560b = 1;
                Object objK = f2Var.k(this);
                if (objK == objL) {
                    return objL;
                }
                tVar = tVar2;
                obj = objK;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) this.f135559a;
                ResultKt.m(obj);
            }
            tVar.f135553p1 = (com.planner5d.library.model.metricunit.a) obj;
            androidx.lifecycle.w0<Pair<com.planner5d.library.model.metricunit.a, com.planner5d.library.widget.editor.editaction.s>> w0VarE0 = t.this.E0();
            Intrinsics.checkNotNull(w0VarE0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<android.util.Pair<com.planner5d.library.model.metricunit.MetricUnit, com.planner5d.library.widget.editor.editaction.MetricUnitChangeAction?>>");
            c1 c1Var = (c1) w0VarE0;
            com.planner5d.library.model.metricunit.a aVar = t.this.f135553p1;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unit");
                aVar = null;
            }
            c1Var.r(new Pair(aVar, null));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.dimensions.DimensionsViewModel$setMeasurementUnit$1", f = "DimensionsViewModel.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135562a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.metricunit.a f135564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.model.metricunit.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135564c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new b(this.f135564c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135562a;
            if (i10 == 0) {
                ResultKt.m(obj);
                f2 f2Var = t.this.f135550n;
                com.planner5d.library.model.metricunit.a aVar = this.f135564c;
                this.f135562a = 1;
                if (f2Var.u(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ij.a
    public t(@NotNull f2 metricUnitManager, @NotNull na.a prepareForRenderingUseCase, @NotNull na.b updateWallLengthUseCase, @NotNull d0 projectManager, @NotNull na.c updateWindowsAndDoorsUseCase, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull n3 helperProjectPersistence, @NotNull b2 messageManager, @NotNull sd.e firebaseInAppMessageTrigger, @NotNull oa.f windowDoorCatalogLoader, @NotNull com.planner5d.library.model.converter.json.to.o fromItemProject, @NotNull com.planner5d.library.activity.helper.r fileHelper) {
        super(messageManager, navigator, networkStateUtility, application);
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(prepareForRenderingUseCase, "prepareForRenderingUseCase");
        Intrinsics.checkNotNullParameter(updateWallLengthUseCase, "updateWallLengthUseCase");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(updateWindowsAndDoorsUseCase, "updateWindowsAndDoorsUseCase");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        Intrinsics.checkNotNullParameter(windowDoorCatalogLoader, "windowDoorCatalogLoader");
        Intrinsics.checkNotNullParameter(fromItemProject, "fromItemProject");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        this.f135550n = metricUnitManager;
        this.f135551o = prepareForRenderingUseCase;
        this.f135555s = updateWallLengthUseCase;
        this.f135556t = projectManager;
        this.f135557v = updateWindowsAndDoorsUseCase;
        this.f135558w = windowDoorCatalogLoader;
        this.X = fromItemProject;
        this.Y = fileHelper;
        this.Z = com.planner5d.library.activity.fragment.smartwizard.s.a.f135866a.a();
        this.f135552p0 = new ArrayList();
        this.f135547g3 = new j2(this, dialogLauncher, helperProjectPersistence, null, this, firebaseInAppMessageTrigger);
        this.f135548h3 = new c1();
        this.f135549i3 = new c1();
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String L0(t tVar, byte[] bArr) {
        com.planner5d.library.activity.helper.r rVar = tVar.Y;
        Intrinsics.checkNotNull(bArr);
        String strK = rVar.K(null, bArr);
        if (strK != null) {
            return strK;
        }
        throw new IllegalStateException("Project data cant be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M0(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    private final void P0(com.planner5d.library.model.metricunit.a aVar) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(aVar, null), 3, null);
        List<w> list = this.f135552p0;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            for (w wVar : list) {
                wVar.h((int) this.f135550n.c(wVar.g().getLength(), aVar));
                wVar.i((int) this.f135550n.c(wVar.a().b(), aVar));
                wVar.j((int) this.f135550n.c(wVar.a().c(), aVar));
            }
        }
        this.f135553p1 = aVar;
        com.planner5d.library.widget.editor.editaction.s sVar = new com.planner5d.library.widget.editor.editaction.s(null, aVar, this.f135550n);
        androidx.lifecycle.w0<Pair<com.planner5d.library.model.metricunit.a, com.planner5d.library.widget.editor.editaction.s>> w0Var = this.f135548h3;
        c1 c1Var = w0Var instanceof c1 ? (c1) w0Var : null;
        if (c1Var != null) {
            c1Var.o(new Pair(aVar, sVar));
        }
    }

    public final void D0() {
        if (this.H1) {
            for (com.planner5d.library.model.metricunit.a aVar : this.f135550n.o()) {
                com.planner5d.library.model.metricunit.a aVar2 = this.f135553p1;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("unit");
                    aVar2 = null;
                }
                if ((aVar2 instanceof com.planner5d.library.model.metricunit.c) == (aVar instanceof com.planner5d.library.model.metricunit.b)) {
                    P0(aVar);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<Pair<com.planner5d.library.model.metricunit.a, com.planner5d.library.widget.editor.editaction.s>> E0() {
        return this.f135548h3;
    }

    @NotNull
    public final androidx.lifecycle.w0<Pair<Integer, w>> G0() {
        return this.f135549i3;
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void H(@NotNull Pair<Project, ItemProject> project, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(listener, "listener");
        p0((Project) project.first, (ItemProject) project.second, listener);
    }

    public final void H0() {
        g0().putBoolean(com.planner5d.library.services.r.smartWizardStatisticsChangeInput.f224891a, true);
    }

    public final void I0() {
        g0().putBoolean(com.planner5d.library.services.r.smartWizardStatisticsChangeSlider.f224891a, true);
    }

    public final void J0() {
        g0().putBoolean(com.planner5d.library.services.r.smartWizardStatisticsFlip.f224891a, true);
    }

    @NotNull
    public final Observable<String> K0(@NotNull ItemProject item) {
        Intrinsics.checkNotNullParameter(item, "item");
        x0();
        Observable<byte[]> observableL0 = this.f135556t.l0(item);
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.L0(this.f135544a, (byte[]) obj);
            }
        };
        Observable map = observableL0.map(new Func1() { // from class: com.planner5d.library.activity.fragment.smartwizard.dimensions.s
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return t.M0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void N0(int i10, @NotNull w wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        androidx.lifecycle.w0<Pair<Integer, w>> w0Var = this.f135549i3;
        Intrinsics.checkNotNull(w0Var, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<android.util.Pair<kotlin.Int, com.planner5d.library.activity.fragment.smartwizard.dimensions.EditableWallData>>");
        ((c1) w0Var).r(new Pair(Integer.valueOf(i10), wall));
    }

    @NotNull
    public final List<w> O0(@NotNull ItemProject item) {
        kf.b bVar;
        com.planner5d.library.model.metricunit.a aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        na.a aVar2 = this.f135551o;
        kf.b bVar2 = this.f135554p2;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("room");
            bVar = null;
        } else {
            bVar = bVar2;
        }
        List<w> list = this.f135552p0;
        com.planner5d.library.model.metricunit.a aVar3 = this.f135553p1;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unit");
            aVar = null;
        } else {
            aVar = aVar3;
        }
        return aVar2.a(item, bVar, list, aVar, Y().getInt(com.planner5d.library.services.r.smartWizardRoomType.f224891a, 2));
    }

    public final void Q0(@NotNull com.planner5d.library.activity.fragment.smartwizard.roomshape.i shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.Z = shape;
        this.f135554p2 = new oa.a(this.Z, new hf.c()).k();
    }

    @NotNull
    public final Pair<com.planner5d.library.widget.editor.editaction.e, com.planner5d.library.widget.editor.editaction.e> R0(int i10, @NotNull w data) {
        Intrinsics.checkNotNullParameter(data, "data");
        na.b bVar = this.f135555s;
        f2 f2Var = this.f135550n;
        double d10 = i10;
        com.planner5d.library.model.metricunit.a aVar = this.f135553p1;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unit");
            aVar = null;
            int i11 = 4 ^ 0;
        }
        return bVar.a(f2Var.x(d10, aVar).floatValue(), data);
    }

    public final void S0(@NotNull ItemProject item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Bundle bundle = Y().getBundle(com.planner5d.library.services.r.smartWizardDimensionsSavedWindows.f224891a);
        if (bundle != null) {
            this.f135557v.a(item, bundle);
        }
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.s
    public void n0(@NotNull g1.j listener, @Nullable Bundle bundle) throws JSONException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.H1 = true;
        d0().o(Boolean.TRUE);
        j2 j2Var = this.f135547g3;
        com.planner5d.library.model.converter.json.to.o oVar = this.X;
        oa.c cVar = oa.c.f333600a;
        kf.b bVar = this.f135554p2;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("room");
            bVar = null;
        }
        JSONObject jSONObjectH = oVar.h(cVar.b(bVar, this.f135558w), false);
        Intrinsics.checkNotNullExpressionValue(jSONObjectH, "convert(...)");
        j2Var.i(jSONObjectH, listener);
    }

    @Override // com.planner5d.library.widget.editor.helper.j2.b
    public void u(@NotNull Map<String, ? extends Pair<Project, ItemProject>> projects, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
