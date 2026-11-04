package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.databinding.s;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t3;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSendToGallery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendToGallery.kt\ncom/planner5d/library/activity/fragment/dialog/send_to_gallery/SendToGallery\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,183:1\n12#2,6:184\n28#2:190\n257#3,2:191\n257#3,2:193\n257#3,2:195\n257#3,2:197\n257#3,2:199\n257#3,2:201\n257#3,2:203\n257#3,2:205\n*S KotlinDebug\n*F\n+ 1 SendToGallery.kt\ncom/planner5d/library/activity/fragment/dialog/send_to_gallery/SendToGallery\n*L\n24#1:184,6\n24#1:190\n140#1:191,2\n141#1:193,2\n160#1:195,2\n161#1:197,2\n67#1:199,2\n68#1:201,2\n70#1:203,2\n71#1:205,2\n*E\n"})
public final class SendToGallery extends ContentDialog<Void> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f132843o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private s f132844p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private com.planner5d.library.databinding.h f132845q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private a f132846r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @Nullable
    private o f132847s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f132848t3;

    public enum a {
        Project(0),
        Snapshot(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f132854a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f132853f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1461a f132849b = new C1461a(null);

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGallery$a$a, reason: collision with other inner class name */
        public static final class C1461a {
            public /* synthetic */ C1461a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(int i10) {
                if (i10 != 0 && i10 == 1) {
                    return a.Snapshot;
                }
                return a.Project;
            }

            private C1461a() {
            }
        }

        a(int i10) {
            this.f132854a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> n() {
            return f132853f;
        }

        public final int l() {
            return this.f132854a;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f132855a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f132855a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f132855a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f132855a.invoke(obj);
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

    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            SendToGallery.this.c0().s0(s10.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(s10, "s");
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            SendToGallery.this.c0().q0(s10.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(s10, "s");
        }
    }

    public static final class e implements o.a {
        e() {
        }

        @Override // com.planner5d.library.activity.fragment.dialog.send_to_gallery.o.a
        public void a(List<? extends com.planner5d.library.model.x> selectedTags) {
            Intrinsics.checkNotNullParameter(selectedTags, "selectedTags");
            SendToGallery.this.c0().r0(selectedTags);
        }
    }

    public SendToGallery() {
        t3 t3Var = t3.f229751a;
        this.f132843o3 = new i2(j1.d(l.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(SendToGallery sendToGallery, View view) {
        l lVarC0 = sendToGallery.c0();
        FragmentManager supportFragmentManager = sendToGallery.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        lVarC0.t0(supportFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(SendToGallery sendToGallery, View view) {
        sendToGallery.g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(SendToGallery sendToGallery, View view) {
        sendToGallery.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l c0() {
        return (l) this.f132843o3.getValue();
    }

    private final boolean d0() {
        if (!this.f132848t3) {
            return false;
        }
        this.f132848t3 = false;
        s sVar = this.f132844p3;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar = null;
        }
        LinearLayout inputContainer = sVar.f159611c;
        Intrinsics.checkNotNullExpressionValue(inputContainer, "inputContainer");
        inputContainer.setVisibility(0);
        s sVar2 = this.f132844p3;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar2 = null;
        }
        FrameLayout tagSelectContainer = sVar2.f159618j;
        Intrinsics.checkNotNullExpressionValue(tagSelectContainer, "tagSelectContainer");
        tagSelectContainer.setVisibility(8);
        Q(com.planner5d.library.f.s.gB, null);
        int i10 = 5 ^ 1;
        return true;
    }

    private final void e0() {
        c0().o0().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SendToGallery.f0(this.f132870a, (p) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(SendToGallery sendToGallery, p pVar) {
        com.planner5d.library.databinding.h hVar = sendToGallery.f132845q3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
            hVar = null;
        }
        hVar.f159025d.setEnabled((pVar.c() || pVar.a() || pVar.b()) ? false : true);
        s sVar = sendToGallery.f132844p3;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar = null;
        }
        sVar.f159613e.setError(pVar.c() ? "Enter title" : null);
        s sVar2 = sendToGallery.f132844p3;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar2 = null;
        }
        sVar2.f159612d.setError(pVar.a() ? "Enter description" : null);
        return Unit.f312394a;
    }

    private final void g0() {
        if (!c0().l0()) {
            c0().w0();
            return;
        }
        s sVar = this.f132844p3;
        s sVar2 = null;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar = null;
        }
        com.planner5d.library.services.s.f(sVar.f159611c, false);
        s sVar3 = this.f132844p3;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar3 = null;
        }
        LinearLayout inputContainer = sVar3.f159611c;
        Intrinsics.checkNotNullExpressionValue(inputContainer, "inputContainer");
        inputContainer.setVisibility(8);
        s sVar4 = this.f132844p3;
        if (sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
        } else {
            sVar2 = sVar4;
        }
        FrameLayout tagSelectContainer = sVar2.f159618j;
        Intrinsics.checkNotNullExpressionValue(tagSelectContainer, "tagSelectContainer");
        tagSelectContainer.setVisibility(0);
        Q(com.planner5d.library.f.s.dB, Integer.valueOf(com.planner5d.library.f.h.I6));
        this.f132848t3 = true;
    }

    private final void h0() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Nh);
        s sVar = this.f132844p3;
        s sVar2 = null;
        if (sVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar = null;
        }
        sVar.f159617i.n(new com.planner5d.library.widget.x.a(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        staggeredGridLayoutManager.r3(2);
        s sVar3 = this.f132844p3;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
        } else {
            sVar2 = sVar3;
        }
        sVar2.f159617i.setLayoutManager(staggeredGridLayoutManager);
    }

    private final void i0() {
        a aVar = this.f132846r3;
        s sVar = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogType");
            aVar = null;
        }
        if (aVar == a.Snapshot) {
            s sVar2 = this.f132844p3;
            if (sVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
                sVar2 = null;
            }
            sVar2.f159614f.setHint(getString(com.planner5d.library.f.s.DF));
        }
        s sVar3 = this.f132844p3;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar3 = null;
        }
        sVar3.f159613e.addTextChangedListener(new c());
        s sVar4 = this.f132844p3;
        if (sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar4 = null;
        }
        sVar4.f159613e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                SendToGallery.j0(this.f132867a, view, z10);
            }
        });
        s sVar5 = this.f132844p3;
        if (sVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar5 = null;
        }
        sVar5.f159610b.setHint(getString(com.planner5d.library.f.s.J5));
        s sVar6 = this.f132844p3;
        if (sVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar6 = null;
        }
        sVar6.f159612d.addTextChangedListener(new d());
        s sVar7 = this.f132844p3;
        if (sVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
        } else {
            sVar = sVar7;
        }
        sVar.f159612d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                SendToGallery.k0(this.f132868a, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(SendToGallery sendToGallery, View view, boolean z10) {
        if (z10) {
            return;
        }
        sendToGallery.c0().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(SendToGallery sendToGallery, View view, boolean z10) {
        if (z10) {
            return;
        }
        sendToGallery.c0().m0();
    }

    private final void l0() {
        c0().n0().k(this, new b(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SendToGallery.m0(this.f132869a, (k) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(SendToGallery sendToGallery, k kVar) {
        if (kVar instanceof com.planner5d.library.activity.fragment.dialog.send_to_gallery.b) {
            sendToGallery.dismiss();
        } else {
            s sVar = null;
            com.planner5d.library.databinding.h hVar = null;
            if (kVar instanceof com.planner5d.library.activity.fragment.dialog.send_to_gallery.c) {
                com.planner5d.library.databinding.h hVar2 = sendToGallery.f132845q3;
                if (hVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
                    hVar2 = null;
                }
                ProgressBar sendToGalleryProgressBar = hVar2.f159031j;
                Intrinsics.checkNotNullExpressionValue(sendToGalleryProgressBar, "sendToGalleryProgressBar");
                sendToGalleryProgressBar.setVisibility(0);
                com.planner5d.library.databinding.h hVar3 = sendToGallery.f132845q3;
                if (hVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
                } else {
                    hVar = hVar3;
                }
                ConstraintLayout contentContainer = hVar.f159027f;
                Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
                contentContainer.setVisibility(8);
            } else if (kVar instanceof com.planner5d.library.activity.fragment.dialog.send_to_gallery.a) {
                com.planner5d.library.databinding.h hVar4 = sendToGallery.f132845q3;
                if (hVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
                    hVar4 = null;
                }
                ProgressBar sendToGalleryProgressBar2 = hVar4.f159031j;
                Intrinsics.checkNotNullExpressionValue(sendToGalleryProgressBar2, "sendToGalleryProgressBar");
                sendToGalleryProgressBar2.setVisibility(8);
                com.planner5d.library.databinding.h hVar5 = sendToGallery.f132845q3;
                if (hVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
                    hVar5 = null;
                }
                ConstraintLayout contentContainer2 = hVar5.f159027f;
                Intrinsics.checkNotNullExpressionValue(contentContainer2, "contentContainer");
                contentContainer2.setVisibility(0);
                s sVar2 = sendToGallery.f132844p3;
                if (sVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
                    sVar2 = null;
                }
                com.planner5d.library.activity.fragment.dialog.send_to_gallery.a aVar = (com.planner5d.library.activity.fragment.dialog.send_to_gallery.a) kVar;
                sVar2.f159613e.setText(aVar.b());
                sendToGallery.f132847s3 = new o(aVar.a(), sendToGallery.new e());
                s sVar3 = sendToGallery.f132844p3;
                if (sVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
                } else {
                    sVar = sVar3;
                }
                sVar.f159617i.setAdapter(sendToGallery.f132847s3);
            }
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        s.d(LayoutInflater.from(root.getContext()), root, false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        this.f132846r3 = a.f132849b.a(jVar.c(r.type, 0));
        l lVarC0 = c0();
        a aVar = this.f132846r3;
        s sVar = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogType");
            aVar = null;
        }
        lVarC0.u0(aVar, jVar.d(r.id, 0L));
        this.f132844p3 = s.d(LayoutInflater.from(getContext()), root, false);
        this.f132845q3 = com.planner5d.library.databinding.h.a(root);
        Q(com.planner5d.library.f.s.gB, null);
        com.planner5d.library.databinding.h hVar = this.f132845q3;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
            hVar = null;
        }
        hVar.f159025d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendToGallery.Z(this.f132864a, view);
            }
        });
        s sVar2 = this.f132844p3;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            sVar2 = null;
        }
        sVar2.f159615g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendToGallery.a0(this.f132865a, view);
            }
        });
        com.planner5d.library.databinding.h hVar2 = this.f132845q3;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerBinding");
            hVar2 = null;
        }
        hVar2.f159028g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SendToGallery.b0(this.f132866a, view);
            }
        });
        h0();
        i0();
        l0();
        e0();
        a aVar2 = this.f132846r3;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogType");
            aVar2 = null;
        }
        if (aVar2 == a.Project) {
            c0().p0();
        }
        c0().m0();
        s sVar3 = this.f132844p3;
        if (sVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
        } else {
            sVar = sVar3;
        }
        FrameLayout root2 = sVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.I0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected void P(@Nullable Integer num, int i10) {
        if (num == null) {
            i10 = 8;
        }
        super.P(num, i10);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        if (d0()) {
            return true;
        }
        return super.onBackPressed();
    }
}
