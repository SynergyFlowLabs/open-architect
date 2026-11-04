package com.planner5d.library.activity.fragment.dialog.projectsettings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.slider.Slider;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.a2;
import com.planner5d.library.databinding.s1;
import com.planner5d.library.databinding.u1;
import com.planner5d.library.databinding.w1;
import com.planner5d.library.databinding.y1;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.TextInputEditTextCompat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nProjectSettingsBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectSettingsBottomSheetDialog.kt\ncom/planner5d/library/activity/fragment/dialog/projectsettings/ProjectSettingsBottomSheetDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,498:1\n12#2,6:499\n28#2:505\n1#3:506\n1863#4:507\n1864#4:510\n1557#4:511\n1628#4,3:512\n1863#4:515\n1864#4:518\n1863#4:527\n1864#4:530\n1863#4,2:531\n1863#4,2:533\n278#5,2:508\n278#5,2:516\n257#5,2:521\n257#5,2:523\n257#5,2:525\n257#5,2:528\n13409#6,2:519\n216#7,2:535\n*S KotlinDebug\n*F\n+ 1 ProjectSettingsBottomSheetDialog.kt\ncom/planner5d/library/activity/fragment/dialog/projectsettings/ProjectSettingsBottomSheetDialog\n*L\n66#1:499,6\n66#1:505\n138#1:507\n138#1:510\n203#1:511\n203#1:512,3\n237#1:515\n237#1:518\n469#1:527\n469#1:530\n251#1:531,2\n255#1:533,2\n138#1:508,2\n237#1:516,2\n300#1:521,2\n340#1:523,2\n343#1:525,2\n470#1:528,2\n279#1:519,2\n264#1:535,2\n*E\n"})
public final class ProjectSettingsBottomSheetDialog extends com.google.android.material.bottomsheet.f {
    public static final int $stable = 8;

    @NotNull
    private final kotlin.f0 H1;

    @ij.a
    public com.planner5d.library.services.utility.p0 formatter;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private List<? extends View> f132238g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f132239h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f132240i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f132241j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f132242k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private Long f132243l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private o3.j f132244m3;

    @ij.a
    public com.planner5d.library.activity.fragment.x navigator;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private u1 f132245p2;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog$checkArguments$1$3", f = "ProjectSettingsBottomSheetDialog.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132246a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f132248c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bundle bundle, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f132248c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ProjectSettingsBottomSheetDialog.this.new a(this.f132248c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132246a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u0 u0VarX0 = ProjectSettingsBottomSheetDialog.this.x0();
                com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(this.f132248c.getBundle(com.planner5d.library.services.r.viewOptions.f224891a)).a();
                Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
                this.f132246a = 1;
                if (u0VarX0.f1(bVarA, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<ItemMaterial> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerView f132250e;

        b(RecyclerView recyclerView) {
            this.f132250e = recyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(RecyclerView recyclerView, final ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, final int i10) {
            recyclerView.post(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.p0
                @Override // java.lang.Runnable
                public final void run() {
                    ProjectSettingsBottomSheetDialog.b.h(projectSettingsBottomSheetDialog, i10);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, int i10) {
            u1 u1Var = projectSettingsBottomSheetDialog.f132245p2;
            if (u1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                u1Var = null;
            }
            u1Var.f159747m.f158689e.setBackgroundColor(i10);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(ItemMaterial selectedItemMaterial) {
            Intrinsics.checkNotNullParameter(selectedItemMaterial, "selectedItemMaterial");
            u0 u0VarX0 = ProjectSettingsBottomSheetDialog.this.x0();
            final ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog = ProjectSettingsBottomSheetDialog.this;
            final RecyclerView recyclerView = this.f132250e;
            u0VarX0.S0(projectSettingsBottomSheetDialog, selectedItemMaterial, new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProjectSettingsBottomSheetDialog.b.g(recyclerView, projectSettingsBottomSheetDialog, ((Integer) obj).intValue());
                }
            });
        }
    }

    public static final class c implements com.planner5d.library.services.bitmaploader.target.m {
        c() {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.m
        public void setImageBitmap(Bitmap bitmap) {
            u1 u1Var = ProjectSettingsBottomSheetDialog.this.f132245p2;
            if (u1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                u1Var = null;
            }
            u1Var.f159747m.f158689e.setImageBitmap(bitmap);
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f132252a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f132252a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f132252a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f132252a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog$setupGridPage$1$4", f = "ProjectSettingsBottomSheetDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<Editable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f132254b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = ProjectSettingsBottomSheetDialog.this.new e(dVar);
            eVar.f132254b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f132253a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ProjectSettingsBottomSheetDialog.this.x0().Z0(ProjectSettingsBottomSheetDialog.this, ((Editable) this.f132254b).toString());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Editable editable, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(editable, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public ProjectSettingsBottomSheetDialog() {
        t3 t3Var = t3.f229751a;
        this.H1 = new i2(j1.d(u0.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132239h3 = new com.planner5d.library.widget.preloader.t();
        this.f132240i3 = new com.planner5d.library.services.bitmaploader.target.h();
        this.f132242k3 = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProjectSettingsBottomSheetDialog.z0(this.f132298a);
            }
        });
        com.planner5d.library.application.b.f142455c.a().q(this);
    }

    private final void A0() {
        com.planner5d.library.widget.preloader.t tVar = this.f132239h3;
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        tVar.b(u1Var.f159748n);
        x0().u0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.B0(this.f132295a, (u0.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, com.planner5d.library.model.metricunit.a aVar, View view) {
        projectSettingsBottomSheetDialog.x0().b1(projectSettingsBottomSheetDialog, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, u0.c cVar) {
        if (cVar instanceof u0.c.a) {
            projectSettingsBottomSheetDialog.f132239h3.a().p(projectSettingsBottomSheetDialog.getString(com.planner5d.library.f.s.ku), true);
        } else if (cVar instanceof u0.c.b) {
            projectSettingsBottomSheetDialog.u0();
            projectSettingsBottomSheetDialog.z1();
            projectSettingsBottomSheetDialog.R0();
            projectSettingsBottomSheetDialog.f132239h3.a().b();
        } else if (cVar instanceof u0.c.C1457c) {
            projectSettingsBottomSheetDialog.f132239h3.a().p(projectSettingsBottomSheetDialog.getString(com.planner5d.library.f.s.gF), true);
        } else {
            if (!(cVar instanceof u0.c.d)) {
                throw new kotlin.k0();
            }
            projectSettingsBottomSheetDialog.f132239h3.a().b();
            u0.c.d dVar = (u0.c.d) cVar;
            projectSettingsBottomSheetDialog.K0(dVar.a(), dVar.b());
        }
        return Unit.f312394a;
    }

    private final void B1(List<ProjectRevision> list) {
        String strV;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<ProjectRevision> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final ProjectRevision projectRevision : list2) {
            Date dateP = projectRevision.p();
            String str = com.planner5d.library.model.payments.a.f222474i;
            if (dateP == null || (strV = getFormatter$P5D_Library_release().v(contextRequireContext, dateP)) == null) {
                strV = com.planner5d.library.model.payments.a.f222474i;
            }
            Integer numU = projectRevision.u();
            if (numU != null) {
                String strB = getFormatter$P5D_Library_release().b(contextRequireContext, numU.intValue());
                if (strB != null) {
                    str = strB;
                }
            }
            arrayList.add(new com.planner5d.library.widget.editor.projectsettings.e.a(strV, str, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProjectSettingsBottomSheetDialog.C1(this.f132258a, projectRevision);
                }
            }));
        }
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        RecyclerView recyclerView = u1Var.f159746l.f160009b;
        recyclerView.n(new com.planner5d.library.widget.n0(contextRequireContext));
        recyclerView.setAdapter(new com.planner5d.library.widget.editor.projectsettings.e(arrayList));
    }

    private final void C0() {
        x0().w0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.D0(this.f132278a, (com.planner5d.library.model.metricunit.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, ProjectRevision projectRevision) {
        projectSettingsBottomSheetDialog.x0().P0(projectRevision);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, com.planner5d.library.model.metricunit.a aVar) {
        u1 u1Var = projectSettingsBottomSheetDialog.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        u1Var.f159743i.f159939d.setText(aVar.g());
        for (Map.Entry<Class<? extends com.planner5d.library.model.metricunit.a>, View> entry : projectSettingsBottomSheetDialog.w0().entrySet()) {
            entry.getValue().setSelected(Intrinsics.areEqual(entry.getKey(), aVar.getClass()));
        }
        return Unit.f312394a;
    }

    private final void D1() {
        u1 u1Var = this.f132245p2;
        w0 w0Var = null;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        EditText editText = u1Var.f159742h.f159892b.getEditText();
        final AutoCompleteTextView autoCompleteTextView = editText instanceof AutoCompleteTextView ? (AutoCompleteTextView) editText : null;
        if (autoCompleteTextView != null) {
            w0[] w0VarArr = {new w0(autoCompleteTextView.getContext(), ac.i.None), new w0(autoCompleteTextView.getContext(), ac.i.Simple), new w0(autoCompleteTextView.getContext(), ac.i.SimpleSoft), new w0(autoCompleteTextView.getContext(), ac.i.VsmSoft1), new w0(autoCompleteTextView.getContext(), ac.i.VsmSoft2)};
            final ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), com.planner5d.library.f.m.O7, w0VarArr);
            autoCompleteTextView.setAdapter(arrayAdapter);
            for (int i10 = 0; i10 < 5; i10++) {
                w0 w0Var2 = w0VarArr[i10];
                if (w0Var2.f132455a == x0().z0()) {
                    w0Var = w0Var2;
                    break;
                }
            }
            if (w0Var == null) {
                w0Var = w0VarArr[0];
            }
            autoCompleteTextView.setText((CharSequence) w0Var.f132456b, false);
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.m
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i11, long j10) {
                    ProjectSettingsBottomSheetDialog.E1(arrayAdapter, autoCompleteTextView, this, adapterView, view, i11, j10);
                }
            });
        }
    }

    private final void E0() {
        x0().v0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.F0(this.f132285a, (u0.e) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(ArrayAdapter arrayAdapter, AutoCompleteTextView autoCompleteTextView, ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, AdapterView adapterView, View view, int i10, long j10) {
        w0 w0Var = (w0) arrayAdapter.getItem(i10);
        if (w0Var == null) {
            w0Var = new w0(autoCompleteTextView.getContext(), ac.i.None);
        }
        u0 u0VarX0 = projectSettingsBottomSheetDialog.x0();
        ac.i shadowType = w0Var.f132455a;
        Intrinsics.checkNotNullExpressionValue(shadowType, "shadowType");
        u0VarX0.c1(projectSettingsBottomSheetDialog, shadowType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, u0.e eVar) {
        if (eVar instanceof u0.e.b) {
            Iterator<T> it = projectSettingsBottomSheetDialog.w0().values().iterator();
            while (it.hasNext()) {
                ((View) it.next()).setEnabled(false);
            }
        } else {
            if (!(eVar instanceof u0.e.a)) {
                throw new kotlin.k0();
            }
            Iterator<T> it2 = projectSettingsBottomSheetDialog.w0().values().iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setEnabled(true);
            }
        }
        return Unit.f312394a;
    }

    private final void F1() {
        u1 u1Var = this.f132245p2;
        x0 x0Var = null;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        EditText editText = u1Var.f159742h.f159893c.getEditText();
        AutoCompleteTextView autoCompleteTextView = editText instanceof AutoCompleteTextView ? (AutoCompleteTextView) editText : null;
        if (autoCompleteTextView != null) {
            x0[] x0VarArrValues = x0.values();
            final ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), com.planner5d.library.f.m.O7, x0VarArrValues);
            autoCompleteTextView.setAdapter(arrayAdapter);
            for (x0 x0Var2 : x0VarArrValues) {
                if (x0Var2.n() == x0().A0()) {
                    x0Var = x0Var2;
                    break;
                }
            }
            if (x0Var == null) {
                x0Var = x0VarArrValues[0];
            }
            autoCompleteTextView.setText((CharSequence) x0Var.toString(), false);
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.b0
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                    ProjectSettingsBottomSheetDialog.G1(arrayAdapter, this, adapterView, view, i10, j10);
                }
            });
        }
    }

    private final void G0() {
        v1.a<ProjectRevision> aVarY0 = x0().y0();
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarY0.k(viewLifecycleOwner, new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.H0(this.f132286a, (ProjectRevision) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(ArrayAdapter arrayAdapter, ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, AdapterView adapterView, View view, int i10, long j10) {
        x0 x0Var = (x0) arrayAdapter.getItem(i10);
        if (x0Var == null) {
            x0Var = x0.small;
        }
        projectSettingsBottomSheetDialog.x0().d1(projectSettingsBottomSheetDialog, x0Var.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, ProjectRevision projectRevision) {
        if (projectRevision != null) {
            projectSettingsBottomSheetDialog.getNavigator$P5D_Library_release().f(new com.planner5d.library.activity.helper.event.content.d(projectRevision), true);
        }
        return Unit.f312394a;
    }

    private final void I0() {
        final u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        x0().B0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.J0(u1Var, (com.planner5d.library.widget.editor.projectresources.viewoptions.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(u1 u1Var, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar) {
        u1Var.f159741g.f159844d.setChecked(bVar.f258071b);
        u1Var.f159741g.f159846f.setChecked(bVar.f258081l);
        u1Var.f159741g.f159843c.setChecked(bVar.f258070a);
        u1Var.f159741g.f159845e.setChecked(bVar.f258072c);
        u1Var.f159743i.f159944i.setChecked(bVar.f258079j);
        u1Var.f159743i.f159943h.setChecked(bVar.f258078i);
        u1Var.f159740f.f159808m.setChecked(bVar.f258083n);
        u1Var.f159740f.f159806k.setChecked(bVar.f258074e);
        u1Var.f159740f.f159807l.setChecked(bVar.f258075f);
        u1Var.f159740f.f159803h.setChecked(bVar.f258073d);
        u1Var.f159740f.f159804i.setChecked(bVar.f258076g);
        u1Var.f159740f.f159805j.setChecked(bVar.f258077h);
        return Unit.f312394a;
    }

    private final void K0(com.planner5d.library.widget.editor.helper.t3 t3Var, List<ProjectRevision> list) {
        ItemEarth earth;
        u1 u1Var = this.f132245p2;
        ItemMaterial material = null;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        TextInputEditTextCompat textInputEditTextCompat = u1Var.f159747m.f158698n;
        Project projectB = t3Var.b();
        textInputEditTextCompat.setText(projectB != null ? projectB.title : null);
        u1 u1Var2 = this.f132245p2;
        if (u1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var2 = null;
        }
        RecyclerView recyclerView = u1Var2.f159738d.f159669b;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManagerItemDecorationInvalidation(recyclerView, 3));
        com.planner5d.library.widget.editor.projectsettings.d dVar = new com.planner5d.library.widget.editor.projectsettings.d(this.f132240i3);
        dVar.q(com.planner5d.library.f.g.f167078k3);
        ItemProject itemProjectA = t3Var.a();
        if (itemProjectA != null && (earth = itemProjectA.getEarth()) != null) {
            material = earth.getMaterial();
        }
        dVar.p(material);
        dVar.j().subscribe((Subscriber<? super ItemMaterial>) new b(recyclerView));
        recyclerView.setAdapter(dVar);
        recyclerView.n(new com.planner5d.library.widget.j0(recyclerView.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167078k3)));
        B1(list);
    }

    private final Function0<com.planner5d.library.services.bitmaploader.target.a> L0() {
        return new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProjectSettingsBottomSheetDialog.M0(this.f132276a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.services.bitmaploader.target.a M0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
        projectSettingsBottomSheetDialog.f132240i3.d(projectSettingsBottomSheetDialog.f132241j3);
        Context contextRequireContext = projectSettingsBottomSheetDialog.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.planner5d.library.services.bitmaploader.target.f fVar = new com.planner5d.library.services.bitmaploader.target.f(contextRequireContext, projectSettingsBottomSheetDialog.new c(), null, 4, null);
        projectSettingsBottomSheetDialog.f132241j3 = fVar;
        return projectSettingsBottomSheetDialog.f132240i3.c(fVar);
    }

    private final void N0(u0.d dVar) {
        String string;
        List<? extends View> list = this.f132238g3;
        u1 u1Var = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hideableViews");
            list = null;
        }
        for (View view : list) {
            int i10 = 0;
            if (dVar.o() == 0) {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
        u1 u1Var2 = this.f132245p2;
        if (u1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u1Var = u1Var2;
        }
        TextView textView = u1Var.f159749o;
        Integer numN = dVar.n();
        if (numN == null || (string = getString(numN.intValue())) == null) {
            string = "";
        }
        textView.setText(string);
    }

    private final void O0() {
        if (x0().r0()) {
            return;
        }
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        s1 s1Var = u1Var.f159736b;
        s1Var.f159628b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.P0(this.f132289a, view);
            }
        });
        s1Var.f159629c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.Q0(this.f132292a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.x0().L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.x0().N0();
    }

    private final void R0() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        a2 a2Var = u1Var.f159747m;
        a2Var.f158691g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.S0(this.f132265a, view);
            }
        });
        a2Var.f158692h.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.T0(this.f132267a, view);
            }
        });
        TextView projectSettingsActionsButton = a2Var.f158686b;
        Intrinsics.checkNotNullExpressionValue(projectSettingsActionsButton, "projectSettingsActionsButton");
        projectSettingsActionsButton.setVisibility(!x0().r0() ? 0 : 8);
        if (!x0().r0()) {
            a2Var.f158686b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProjectSettingsBottomSheetDialog.U0(this.f132269a, view);
                }
            });
        }
        a2Var.f158690f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.V0(this.f132271a, view);
            }
        });
        x1();
        f1();
        l1();
        O0();
        Y0();
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.DisplayOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.Graphics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.Actions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.ControlsAndNavigation);
    }

    private final void W0() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        u1Var.f159747m.f158688d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.X0(this.f132301a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.Background);
    }

    private final void Y0() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        com.planner5d.library.databinding.v1 v1Var = u1Var.f159740f;
        int i10 = 5 ^ 3;
        for (View view : CollectionsKt.listOf((Object[]) new View[]{v1Var.f159806k, v1Var.f159807l, v1Var.f159803h, v1Var.f159804i, v1Var.f159798c, v1Var.f159799d, v1Var.f159800e, v1Var.f159801f})) {
            Intrinsics.checkNotNull(view);
            view.setVisibility(!x0().r0() ? 0 : 8);
        }
        v1Var.f159808m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.Z0(this.f132256a, compoundButton, z10);
            }
        });
        v1Var.f159806k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.a1(this.f132280a, compoundButton, z10);
            }
        });
        v1Var.f159807l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.w
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.b1(this.f132454a, compoundButton, z10);
            }
        });
        v1Var.f159803h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.c1(this.f132273a, compoundButton, z10);
            }
        });
        v1Var.f159804i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.i0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.d1(this.f132275a, compoundButton, z10);
            }
        });
        v1Var.f159805j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.j0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.e1(this.f132277a, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.m(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.i(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.j(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.b(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.d(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.f(), z10);
    }

    private final void f1() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        w1 w1Var = u1Var.f159741g;
        w1Var.f159842b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.g1(this.f132264a, view);
            }
        });
        w1Var.f159844d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.h1(this.f132266a, compoundButton, z10);
            }
        });
        w1Var.f159846f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.i1(this.f132268a, compoundButton, z10);
            }
        });
        w1Var.f159843c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.j1(this.f132270a, compoundButton, z10);
            }
        });
        w1Var.f159845e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.h
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.k1(this.f132272a, compoundButton, z10);
            }
        });
        m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.Grid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.c(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.l(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.e(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.k(), z10);
    }

    private final void l1() {
        D1();
        F1();
    }

    private final void m1() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        final y1 y1Var = u1Var.f159743i;
        x0().s0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.n1(y1Var, (Integer) obj);
            }
        }));
        x0().t0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProjectSettingsBottomSheetDialog.o1(y1Var, (IntRange) obj);
            }
        }));
        y1Var.f159940e.h(new Slider.a() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.v
            @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
            /* JADX INFO: renamed from: c */
            public final void a(Slider slider, float f10, boolean z10) {
                ProjectSettingsBottomSheetDialog.p1(this.f132444a, slider, f10, z10);
            }
        });
        y3 y3Var = y3.f229862a;
        TextInputEditTextCompat projectSettingsGridSizeInput = y1Var.f159938c;
        Intrinsics.checkNotNullExpressionValue(projectSettingsGridSizeInput, "projectSettingsGridSizeInput");
        kotlinx.coroutines.flow.i iVarH1 = kotlinx.coroutines.flow.k.h1(y3.J(y3Var, projectSettingsGridSizeInput, 0L, 1, null), new e(null));
        androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.flow.k.W0(iVarH1, androidx.lifecycle.p0.a(viewLifecycleOwner));
        y1Var.f159941f.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.q1(this.f132457a, view);
            }
        });
        y1Var.f159942g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.r1(this.f132464a, view);
            }
        });
        y1Var.f159944i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.z
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.s1(this.f132465a, compoundButton, z10);
            }
        });
        y1Var.f159943h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.a0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ProjectSettingsBottomSheetDialog.t1(this.f132257a, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n1(y1 y1Var, Integer num) {
        y1Var.f159940e.setValue(num.intValue());
        if (!Intrinsics.areEqual(String.valueOf(y1Var.f159938c.getText()), num.toString())) {
            y1Var.f159938c.setText(num.toString());
            y1Var.f159938c.selectAll();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o1(y1 y1Var, IntRange intRange) {
        y1Var.f159940e.setValueFrom(intRange.l());
        y1Var.f159940e.setValueTo(intRange.m());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, Slider slider, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(slider, "<unused var>");
        if (z10) {
            projectSettingsBottomSheetDialog.x0().U0(projectSettingsBottomSheetDialog, (int) f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.x0().p0(projectSettingsBottomSheetDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.x0().C0(projectSettingsBottomSheetDialog);
    }

    private final void s0(u0.d dVar) {
        N0(dVar);
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        ViewFlipper viewFlipper = u1Var.f159750s;
        viewFlipper.setInAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165534e0);
        viewFlipper.setOutAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165540h0);
        viewFlipper.setDisplayedChild(dVar.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.h(), z10);
    }

    private final void t0(com.planner5d.library.widget.editor.a.c cVar, boolean z10) {
        x0().e1(this, cVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, CompoundButton compoundButton, boolean z10) {
        projectSettingsBottomSheetDialog.t0(com.planner5d.library.widget.editor.a.f254298t2.g(), z10);
    }

    private final void u0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f132243l3 = Long.valueOf(arguments.getLong(com.planner5d.library.services.r.id.f224891a));
            String string = arguments.getString(com.planner5d.library.services.r.mode.f224891a, null);
            this.f132244m3 = string != null ? o3.j.valueOf(string) : null;
            x0().E0(String.valueOf(this.f132243l3), L0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProjectSettingsBottomSheetDialog.v0(this.f132263a, ((Integer) obj).intValue());
                }
            });
            androidx.lifecycle.o0 viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            int i10 = (7 | 3) ^ 0;
            kotlinx.coroutines.k.f(androidx.lifecycle.p0.a(viewLifecycleOwner), null, null, new a(arguments, null), 3, null);
        }
    }

    private final void u1() {
        List<? extends View> list = this.f132238g3;
        u1 u1Var = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hideableViews");
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i10 = 0 >> 4;
            ((View) it.next()).setVisibility(4);
        }
        u1 u1Var2 = this.f132245p2;
        if (u1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var2 = null;
        }
        u1Var2.f159737c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.v1(this.f132279a, view);
            }
        });
        u1 u1Var3 = this.f132245p2;
        if (u1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u1Var = u1Var3;
        }
        u1Var.f159739e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectSettingsBottomSheetDialog.w1(this.f132281a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, int i10) {
        u1 u1Var = projectSettingsBottomSheetDialog.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        u1Var.f159747m.f158689e.setBackgroundColor(i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.x0().q0().removeLastOrNull();
        projectSettingsBottomSheetDialog.s0(projectSettingsBottomSheetDialog.x0().q0().isEmpty() ? u0.d.Main : projectSettingsBottomSheetDialog.x0().q0().last());
    }

    private final Map<Class<? extends com.planner5d.library.model.metricunit.a>, View> w0() {
        return (Map) this.f132242k3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 x0() {
        return (u0) this.H1.getValue();
    }

    private final void x1() {
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        ConstraintLayout root = u1Var.f159747m.f158693i.getRoot();
        if (!x0().Q0()) {
            Intrinsics.checkNotNull(root);
            root.setVisibility(8);
        } else {
            Intrinsics.checkNotNull(root);
            root.setVisibility(0);
            root.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProjectSettingsBottomSheetDialog.y1(this.f132262a, view);
                }
            });
        }
    }

    private final void y0(u0.d dVar) {
        N0(dVar);
        x0().q0().addLast(dVar);
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        ViewFlipper viewFlipper = u1Var.f159750s;
        viewFlipper.setInAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165536f0);
        viewFlipper.setOutAnimation(viewFlipper.getContext(), com.planner5d.library.f.a.f165538g0);
        viewFlipper.setDisplayedChild(dVar.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog, View view) {
        projectSettingsBottomSheetDialog.y0(u0.d.History);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map z0(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
        u1 u1Var = projectSettingsBottomSheetDialog.f132245p2;
        u1 u1Var2 = null;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        Pair pair = TuplesKt.to(com.planner5d.library.model.metricunit.c.class, u1Var.f159747m.f158697m);
        u1 u1Var3 = projectSettingsBottomSheetDialog.f132245p2;
        if (u1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u1Var2 = u1Var3;
        }
        return MapsKt.mapOf(pair, TuplesKt.to(com.planner5d.library.model.metricunit.b.class, u1Var2.f159747m.f158696l));
    }

    private final void z1() {
        int i10 = 1 << 0;
        for (final com.planner5d.library.model.metricunit.a aVar : x0().x0()) {
            View view = w0().get(aVar.getClass());
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.projectsettings.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ProjectSettingsBottomSheetDialog.A1(this.f132287a, aVar, view2);
                    }
                });
            }
        }
    }

    @NotNull
    public final com.planner5d.library.services.utility.p0 getFormatter$P5D_Library_release() {
        com.planner5d.library.services.utility.p0 p0Var = this.formatter;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.x getNavigator$P5D_Library_release() {
        com.planner5d.library.activity.fragment.x xVar = this.navigator;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        u1();
        A0();
        W0();
        E0();
        C0();
        G0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Dialog dialog = getDialog();
        com.planner5d.library.widget.editor.popup.itemproperties.a aVar = dialog instanceof com.planner5d.library.widget.editor.popup.itemproperties.a ? (com.planner5d.library.widget.editor.popup.itemproperties.a) dialog : null;
        if (aVar != null) {
            aVar.C(newConfig.orientation);
        }
    }

    @Override // com.google.android.material.bottomsheet.f, androidx.appcompat.app.r, androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new com.planner5d.library.widget.editor.popup.itemproperties.a(contextRequireContext, getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        u1 u1VarD = u1.d(inflater, viewGroup, false);
        this.f132245p2 = u1VarD;
        u1 u1Var = null;
        if (u1VarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1VarD = null;
        }
        ImageView imageView = u1VarD.f159737c;
        u1 u1Var2 = this.f132245p2;
        if (u1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var2 = null;
        }
        View view = u1Var2.f159744j;
        u1 u1Var3 = this.f132245p2;
        if (u1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var3 = null;
        }
        int i10 = 7 & 2;
        this.f132238g3 = CollectionsKt.listOf((Object[]) new View[]{imageView, view, u1Var3.f159749o});
        u1 u1Var4 = this.f132245p2;
        if (u1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u1Var = u1Var4;
        }
        ConstraintLayout root = u1Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        com.planner5d.library.model.manager.statistics.events.t0.f217461b.n(this.f132244m3, this.f132243l3);
        u0 u0VarX0 = x0();
        u1 u1Var = this.f132245p2;
        if (u1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u1Var = null;
        }
        u0VarX0.W0(u1Var.f159747m.f158698n.getTextAsString());
    }

    public final void setFormatter$P5D_Library_release(@NotNull com.planner5d.library.services.utility.p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setNavigator$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.navigator = xVar;
    }
}
