package com.planner5d.library.activity.fragment.dialog.snapshots;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.l0;
import com.planner5d.library.activity.fragment.dialog.message.SnapshotSetupComplete;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.activity.fragment.profile.edit.q;
import com.planner5d.library.databinding.p2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.preloader.t;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotSetupDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotSetupDialog.kt\ncom/planner5d/library/activity/fragment/dialog/snapshots/SnapshotSetupDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,201:1\n12#2,6:202\n28#2:208\n*S KotlinDebug\n*F\n+ 1 SnapshotSetupDialog.kt\ncom/planner5d/library/activity/fragment/dialog/snapshots/SnapshotSetupDialog\n*L\n36#1:202,6\n36#1:208\n*E\n"})
public final class SnapshotSetupDialog extends ContentDialog<gd.a> implements n0, l0 {
    public static final int $stable = 8;

    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k dialogLauncher;

    @ij.a
    public y1 menuManager;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private p2 f132934o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final f0 f132935p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final t f132936q3;

    @ij.a
    public t0 userPurchases;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132937a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f132937a = iArr;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f132938a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f132938a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f132938a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f132938a.invoke(obj);
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

    public static final class c implements com.planner5d.library.activity.fragment.dialog.snapshots.b.a {
        c() {
        }

        @Override // com.planner5d.library.activity.fragment.dialog.snapshots.b.a
        public void a(vd.b renderVariant) {
            Intrinsics.checkNotNullParameter(renderVariant, "renderVariant");
            SnapshotSetupDialog.this.b0().Z().r(renderVariant);
        }
    }

    public SnapshotSetupDialog() {
        t3 t3Var = t3.f229751a;
        this.f132935p3 = new i2(j1.d(n.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f132936q3 = new t();
        com.planner5d.library.application.b.f142455c.a().X(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n b0() {
        return (n) this.f132935p3.getValue();
    }

    private final void c0() {
        Bundle bundleH = new com.planner5d.library.services.utility.j(getArguments()).h(r.renderData, null);
        if (bundleH != null) {
            b0().f0(new gd.a(bundleH));
        }
    }

    private final void d0() {
        p2 p2Var = this.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        p2Var.f159490e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnapshotSetupDialog.e0(this.f132967a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(SnapshotSetupDialog snapshotSetupDialog, View view) {
        snapshotSetupDialog.s0();
    }

    private final void f0() {
        p2 p2Var = this.f132934o3;
        p2 p2Var2 = null;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        p2Var.f159491f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SnapshotSetupDialog.h0(this.f132960a, compoundButton, z10);
            }
        });
        p2 p2Var3 = this.f132934o3;
        if (p2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p2Var2 = p2Var3;
        }
        p2Var2.f159492g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.g
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SnapshotSetupDialog.i0(this.f132961a, compoundButton, z10);
            }
        });
        b0().W().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotSetupDialog.j0(this.f132962a, (Boolean) obj);
            }
        }));
        b0().Y().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotSetupDialog.g0(this.f132963a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(SnapshotSetupDialog snapshotSetupDialog, Boolean bool) {
        p2 p2Var = snapshotSetupDialog.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        p2Var.f159492g.setChecked(bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(SnapshotSetupDialog snapshotSetupDialog, CompoundButton compoundButton, boolean z10) {
        snapshotSetupDialog.b0().W().r(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(SnapshotSetupDialog snapshotSetupDialog, CompoundButton compoundButton, boolean z10) {
        snapshotSetupDialog.b0().Y().r(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(SnapshotSetupDialog snapshotSetupDialog, Boolean bool) {
        p2 p2Var = snapshotSetupDialog.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        p2Var.f159491f.setChecked(bool.booleanValue());
        return Unit.f312394a;
    }

    private final void k0() {
        v1.a<n.a> aVarX = b0().X();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarX.k(viewLifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotSetupDialog.l0(this.f132958a, (n.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(SnapshotSetupDialog snapshotSetupDialog, n.a aVar) {
        if (aVar instanceof n.a.b) {
            snapshotSetupDialog.sendResultOnce(((n.a.b) aVar).a());
        } else if (aVar instanceof n.a.C1464a) {
            snapshotSetupDialog.dismiss();
            SnapshotSetupComplete.show(snapshotSetupDialog.getDialogLauncher$P5D_Library_release(), com.planner5d.library.f.s.KC, ((n.a.C1464a) aVar).a());
        } else if (aVar != null) {
            throw new k0();
        }
        return Unit.f312394a;
    }

    private final void m0() {
        t tVar = this.f132936q3;
        p2 p2Var = this.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        tVar.b(p2Var.getRoot());
        b0().a0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotSetupDialog.n0(this.f132959a, (q) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(SnapshotSetupDialog snapshotSetupDialog, q qVar) {
        if ((qVar == null ? -1 : a.f132937a[qVar.ordinal()]) == 1) {
            snapshotSetupDialog.f132936q3.a().p(snapshotSetupDialog.getString(com.planner5d.library.f.s.pn), true);
        } else {
            snapshotSetupDialog.f132936q3.a().b();
        }
        return Unit.f312394a;
    }

    private final void o0() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final com.planner5d.library.activity.fragment.dialog.snapshots.b bVar = new com.planner5d.library.activity.fragment.dialog.snapshots.b(contextRequireContext, new c(), getUserPurchases$P5D_Library_release().r());
        bVar.m(b0().b0());
        int i10 = com.planner5d.library.f.g.Lh;
        com.planner5d.library.widget.l0 l0Var = new com.planner5d.library.widget.l0(i10, i10, i10);
        p2 p2Var = this.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        RecyclerView recyclerView = p2Var.f159495j;
        recyclerView.setAdapter(bVar);
        recyclerView.n(l0Var);
        b0().Z().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotSetupDialog.p0(bVar, this, (vd.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(com.planner5d.library.activity.fragment.dialog.snapshots.b bVar, SnapshotSetupDialog snapshotSetupDialog, vd.b bVar2) {
        bVar.n(bVar2);
        p2 p2Var = snapshotSetupDialog.f132934o3;
        int i10 = 3 << 0;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        ButtonTextView buttonTextView = p2Var.f159490e;
        int i11 = com.planner5d.library.f.s.Ou;
        Integer numP = bVar2.p();
        Intrinsics.checkNotNullExpressionValue(numP, "getTitle(...)");
        buttonTextView.setText(snapshotSetupDialog.getString(i11, snapshotSetupDialog.getString(numP.intValue())));
        p2 p2Var2 = snapshotSetupDialog.f132934o3;
        if (p2Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var2 = null;
        }
        p2Var2.f159490e.setBackground(androidx.core.content.res.i.g(snapshotSetupDialog.getResources(), bVar2.f385730a == vd.b.PRO4K.f385730a ? com.planner5d.library.f.h.C5 : com.planner5d.library.f.h.f167890y5, null));
        return Unit.f312394a;
    }

    private final void q0(ViewGroup viewGroup) {
        Toolbar toolbar = te.h.a(viewGroup).f380926d;
        toolbar.setTitle(com.planner5d.library.f.s.Qc);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.snapshots.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SnapshotSetupDialog.r0(this.f132964a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(SnapshotSetupDialog snapshotSetupDialog, View view) {
        snapshotSetupDialog.dismiss();
    }

    private final void s0() {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        n nVarB0 = b0();
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        p2 p2Var = this.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        FrameLayout root = p2Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        nVarB0.g0(sVarRequireActivity, root, jVar.d(r.project, 0L), jVar.d(r.projectId, 0L), jVar.t(r.screenshot, "screenshot"), new vd.a(jVar.h(r.cameraFrom, null)));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f132934o3 = p2.d(getLayoutInflater(), root, false);
        c0();
        q0(root);
        o0();
        f0();
        d0();
        m0();
        k0();
        p2 p2Var = this.f132934o3;
        if (p2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p2Var = null;
        }
        FrameLayout root2 = p2Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.f168879x0;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k getDialogLauncher$P5D_Library_release() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final y1 getMenuManager$P5D_Library_release() {
        y1 y1Var = this.menuManager;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuManager");
        return null;
    }

    @NotNull
    public final t0 getUserPurchases$P5D_Library_release() {
        t0 t0Var = this.userPurchases;
        if (t0Var != null) {
            return t0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userPurchases");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.W6);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        sendResultOnce(null);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    @NotNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new androidx.appcompat.view.d(requireContext(), com.planner5d.library.f.t.Ei));
        Intrinsics.checkNotNullExpressionValue(layoutInflaterCloneInContext, "cloneInContext(...)");
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Dialog dialog;
        super.onResume();
        if (B() || (dialog = getDialog()) == null) {
            return;
        }
        dialog.hide();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable(r.renderVariant.f224891a, b0().Z().f());
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        Serializable serializableS = new com.planner5d.library.services.utility.j(bundle).s(r.renderVariant, null);
        vd.b bVar = serializableS instanceof vd.b ? (vd.b) serializableS : null;
        if (bVar != null) {
            b0().Z().r(bVar);
        }
    }

    public final void setDialogLauncher$P5D_Library_release(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setMenuManager$P5D_Library_release(@NotNull y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.menuManager = y1Var;
    }

    public final void setUserPurchases$P5D_Library_release(@NotNull t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<set-?>");
        this.userPurchases = t0Var;
    }
}
