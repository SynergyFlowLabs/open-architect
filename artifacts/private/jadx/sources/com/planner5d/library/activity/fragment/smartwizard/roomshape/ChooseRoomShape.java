package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.databinding.k0;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.m0;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@e.a({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nChooseRoomShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseRoomShape.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomshape/ChooseRoomShape\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n12#2,6:95\n28#2:101\n299#3,2:102\n299#3,2:104\n*S KotlinDebug\n*F\n+ 1 ChooseRoomShape.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomshape/ChooseRoomShape\n*L\n29#1:95,6\n29#1:101\n43#1:102,2\n44#1:104,2\n*E\n"})
public final class ChooseRoomShape extends SmartWizardEditor2DFragment<f> implements h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f135606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f135607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k0 f135608h;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f135609a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f135609a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f135609a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f135609a.invoke(obj);
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

    public ChooseRoomShape() {
        t3 t3Var = t3.f229751a;
        this.f135606f = new i2(j1.d(f.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f135607g = new j(this);
        com.planner5d.library.application.b.f142455c.a().h2(this);
    }

    private final void T() {
        i iVarI = this.f135607g.i();
        getViewModel().y0(iVarI);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable(r.roomShape.f224891a, iVarI);
        androidx.navigation.fragment.f.a(this).c0(e.a().e(), arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(k0 k0Var, View view, MotionEvent motionEvent) {
        k0Var.f159210f.setOnTouchListener(null);
        FrameLayout tooltipCover = k0Var.f159210f;
        Intrinsics.checkNotNullExpressionValue(tooltipCover, "tooltipCover");
        tooltipCover.setVisibility(8);
        TextView tooltip = k0Var.f159209e;
        Intrinsics.checkNotNullExpressionValue(tooltip, "tooltip");
        tooltip.setVisibility(8);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(final ChooseRoomShape chooseRoomShape, View view) {
        chooseRoomShape.N().doOnCompleted(new Action0() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomshape.d
            @Override // rx.functions.Action0
            public final void call() {
                ChooseRoomShape.W(this.f135613a);
            }
        }).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(ChooseRoomShape chooseRoomShape) {
        chooseRoomShape.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(k0 k0Var, Boolean bool) {
        k0Var.f159207c.setEnabled(!bool.booleanValue());
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    protected void F(@Nullable Project project, @Nullable ItemProject itemProject) {
        super.F(project, itemProject);
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarG1 = B().G().G1();
        if (bVarG1 != null) {
            e0 e0VarF = B().F();
            com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarA = new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVarG1).b(false).h(true).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            e0VarF.w(bVarA);
        }
        B().F().x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public f getViewModel() {
        return (f) this.f135606f.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.SmartWizardEditor2DFragment
    @NotNull
    public Editor2D getEditor() {
        k0 k0Var = this.f135608h;
        if (k0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k0Var = null;
        }
        Editor2D editor = k0Var.f159206b;
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        return editor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:9:0x00e6  */
    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k0 k0Var;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final k0 k0VarD = k0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(k0VarD, "inflate(...)");
        k0VarD.f159210f.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomshape.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChooseRoomShape.U(k0VarD, view, motionEvent);
            }
        });
        k0VarD.f159208d.setAdapter(this.f135607g);
        RecyclerView recyclerView = k0VarD.f159208d;
        Context context = k0VarD.f159208d.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.n(new m0(context, 0, 0, 0, 0, 0, 0, 0, null, v.g.f44098r, null));
        RecyclerView shapesList = k0VarD.f159208d;
        Intrinsics.checkNotNullExpressionValue(shapesList, "shapesList");
        Context context2 = k0VarD.f159208d.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        com.planner5d.library.widget.x.i(shapesList, context2, Integer.valueOf(com.planner5d.library.f.g.Lh), Integer.valueOf(com.planner5d.library.f.g.Lh), Integer.valueOf(com.planner5d.library.f.g.Hh));
        new t().b(k0VarD.f159208d);
        k0VarD.f159207c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomshape.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseRoomShape.V(this.f135611a, view);
            }
        });
        getViewModel().c0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomshape.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseRoomShape.X(k0VarD, (Boolean) obj);
            }
        }));
        k0VarD.f159206b.setInteractionEnabled(false);
        this.f135608h = k0VarD;
        Bundle arguments = getArguments();
        k0 k0Var2 = null;
        if (arguments != null) {
            r rVar = r.roomShape;
            if (arguments.containsKey(rVar.f224891a)) {
                Serializable serializableS = new com.planner5d.library.services.utility.j(getArguments()).s(rVar, i.lType);
                Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.smartwizard.roomshape.RoomShape");
                onItemClick((i) serializableS);
            } else {
                k0Var = this.f135608h;
                if (k0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    k0Var = null;
                }
                k0Var.f159208d.V1(this.f135607g.h(i.lType));
            }
        } else {
            k0Var = this.f135608h;
            if (k0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                k0Var = null;
            }
            k0Var.f159208d.V1(this.f135607g.h(i.lType));
        }
        k0 k0Var3 = this.f135608h;
        if (k0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            k0Var2 = k0Var3;
        }
        ConstraintLayout root = k0Var2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.planner5d.library.activity.fragment.smartwizard.roomshape.h
    public void onItemClick(@NotNull i shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f135607g.k(shape);
        k0 k0Var = this.f135608h;
        if (k0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            k0Var = null;
        }
        k0Var.f159208d.V1(this.f135607g.h(shape));
        getViewModel().z0();
        getViewModel().A0(shape, this);
    }
}
