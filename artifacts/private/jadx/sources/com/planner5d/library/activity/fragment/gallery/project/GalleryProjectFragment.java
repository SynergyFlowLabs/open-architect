package com.planner5d.library.activity.fragment.gallery.project;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.databinding.y0;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.PinsIndicator;
import com.planner5d.library.widget.ProfileIconView;
import java.util.List;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nGalleryProjectFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryProjectFragment.kt\ncom/planner5d/library/activity/fragment/gallery/project/GalleryProjectFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,156:1\n12#2,6:157\n28#2:163\n1#3:164\n257#4,2:165\n257#4,2:167\n*S KotlinDebug\n*F\n+ 1 GalleryProjectFragment.kt\ncom/planner5d/library/activity/fragment/gallery/project/GalleryProjectFragment\n*L\n46#1:157,6\n46#1:163\n147#1:165,2\n151#1:167,2\n*E\n"})
public final class GalleryProjectFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y0 f133827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f133828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f133829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.listitem.j f133830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final f0 f133831i;

    @ij.a
    public com.planner5d.library.model.manager.y0 imageManager;

    @ij.a
    public c0 projectsAndSnapshotsSourceManager;

    public static final class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f133832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f133833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GalleryProjectFragment f133834c;

        a(a0 a0Var, RecyclerView recyclerView, GalleryProjectFragment galleryProjectFragment) {
            this.f133832a = a0Var;
            this.f133833b = recyclerView;
            this.f133834c = galleryProjectFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            View viewH;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i10 != 0 || (viewH = this.f133832a.h(this.f133833b.getLayoutManager())) == null) {
                return;
            }
            GalleryProjectFragment galleryProjectFragment = this.f133834c;
            int iS0 = this.f133833b.s0(viewH);
            List<String> listF = galleryProjectFragment.G().k0().f();
            galleryProjectFragment.N(iS0, listF != null ? listF.size() : 0);
        }
    }

    /* synthetic */ class b extends g0 implements Function1<com.planner5d.library.model.h, Unit> {
        b(Object obj) {
            super(1, obj, GalleryProjectFragment.class, "share", "share(Lcom/planner5d/library/model/GalleryRecord;)V", 0);
        }

        public final void X(com.planner5d.library.model.h p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((GalleryProjectFragment) this.receiver).M(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.planner5d.library.model.h hVar) {
            X(hVar);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class c extends g0 implements Function1<String, Unit> {
        c(Object obj) {
            super(1, obj, GalleryProjectFragment.class, "loadAuthorUserPic", "loadAuthorUserPic(Ljava/lang/String;)V", 0);
        }

        public final void X(String str) {
            ((GalleryProjectFragment) this.receiver).H(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            X(str);
            return Unit.f312394a;
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133835a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133835a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f133835a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133835a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            int i10 = 3 << 0;
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public GalleryProjectFragment() {
        t3 t3Var = t3.f229751a;
        this.f133831i = new i2(j1.d(k.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        com.planner5d.library.application.b.f142455c.a().l0(this);
    }

    private final void D() {
        y0 y0Var = this.f133827e;
        com.planner5d.library.services.bitmaploader.target.h hVar = null;
        if (y0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y0Var = null;
        }
        RecyclerView recyclerView = y0Var.f159929s3;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        com.planner5d.library.services.bitmaploader.target.h hVar2 = this.f133829g;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
        } else {
            hVar = hVar2;
        }
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        g gVar = new g(hVar, p0.a(viewLifecycleOwner), getImageManager());
        this.f133828f = gVar;
        recyclerView.setAdapter(gVar);
        a0 a0Var = new a0();
        a0Var.b(recyclerView);
        recyclerView.r(new a(a0Var, recyclerView, this));
    }

    private final void E() {
        D();
        k kVarG = G();
        kVarG.j0().k(getViewLifecycleOwner(), new d(new b(this)));
        kVarG.l0().k(getViewLifecycleOwner(), new d(new c(this)));
        kVarG.k0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.project.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryProjectFragment.F(this.f133841a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(GalleryProjectFragment galleryProjectFragment, List list) {
        g gVar = galleryProjectFragment.f133828f;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            gVar = null;
        }
        gVar.k(list);
        galleryProjectFragment.N(0, list != null ? list.size() : 0);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k G() {
        return (k) this.f133831i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        com.planner5d.library.widget.listitem.j jVar = this.f133830h;
        com.planner5d.library.services.bitmaploader.target.h hVar = null;
        if (jVar != null) {
            com.planner5d.library.services.bitmaploader.target.h hVar2 = this.f133829g;
            if (hVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar2 = null;
            }
            jVar.c(hVar2);
        }
        y0 y0Var = this.f133827e;
        if (y0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y0Var = null;
        }
        ProfileIconView avatar = y0Var.f159923m3;
        Intrinsics.checkNotNullExpressionValue(avatar, "avatar");
        com.planner5d.library.widget.listitem.j jVar2 = new com.planner5d.library.widget.listitem.j(avatar);
        com.planner5d.library.services.bitmaploader.target.h hVar3 = this.f133829g;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
        } else {
            hVar = hVar3;
        }
        jVar2.b(hVar, getImageManager(), str);
        this.f133830h = jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(k kVar, View view) {
        kVar.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(k kVar, View view) {
        kVar.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(y0 y0Var, GalleryProjectFragment galleryProjectFragment, Boolean bool) {
        y0Var.f159924n3.setDefaultTint(!bool.booleanValue());
        y0Var.f159924n3.setImageDrawable(androidx.core.content.d.l(galleryProjectFragment.requireContext(), bool.booleanValue() ? qd.b.g.f352198p6 : qd.b.g.f352211q6));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(k kVar, View view) {
        kVar.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(com.planner5d.library.model.h hVar) {
        b2.f216725b.u0(x3.a.share, null, Long.valueOf(hVar.f180750l));
        s sVarRequireActivity = requireActivity();
        Intrinsics.checkNotNull(sVarRequireActivity);
        new com.planner5d.library.services.f0(sVarRequireActivity, hVar, getProjectsAndSnapshotsSourceManager().a().b()).a(sVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"SetTextI18n"})
    public final void N(int i10, int i11) {
        boolean z10 = i11 > 0;
        y0 y0Var = this.f133827e;
        y0 y0Var2 = null;
        if (y0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y0Var = null;
        }
        TextView textView = y0Var.f159932v3;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(z10 ? 0 : 8);
        textView.setText((i10 + 1) + "/" + i11);
        y0 y0Var3 = this.f133827e;
        if (y0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            y0Var2 = y0Var3;
        }
        PinsIndicator pinsIndicator = y0Var2.f159925o3;
        Intrinsics.checkNotNull(pinsIndicator);
        pinsIndicator.setVisibility(z10 ? 0 : 8);
        pinsIndicator.c(i10, i11);
    }

    @NotNull
    public final com.planner5d.library.model.manager.y0 getImageManager() {
        com.planner5d.library.model.manager.y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @NotNull
    public final c0 getProjectsAndSnapshotsSourceManager() {
        c0 c0Var = this.projectsAndSnapshotsSourceManager;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("projectsAndSnapshotsSourceManager");
        return null;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f133829g = new com.planner5d.library.services.bitmaploader.target.h.a().a(getViewLifecycleOwner());
        G().c0(getArguments(), getProjectsAndSnapshotsSourceManager().a().b());
        y0 y0VarK1 = y0.k1(inflater, viewGroup, false);
        y0VarK1.C0(getViewLifecycleOwner());
        y0VarK1.n1(G());
        this.f133827e = y0VarK1;
        E();
        View root = y0VarK1.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.planner5d.library.widget.listitem.j jVar = this.f133830h;
        if (jVar != null) {
            com.planner5d.library.services.bitmaploader.target.h hVar = this.f133829g;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
                hVar = null;
            }
            jVar.c(hVar);
        }
    }

    public final void setImageManager(@NotNull com.planner5d.library.model.manager.y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }

    public final void setProjectsAndSnapshotsSourceManager(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.projectsAndSnapshotsSourceManager = c0Var;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    protected void w(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        final k kVarG = G();
        final y0 y0Var = this.f133827e;
        if (y0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y0Var = null;
        }
        y0Var.f159930t3.setOnClickListener(kVarG.i0());
        y0Var.f159931u3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.project.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GalleryProjectFragment.I(kVarG, view2);
            }
        });
        y0Var.f159924n3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.project.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GalleryProjectFragment.J(kVarG, view2);
            }
        });
        kVarG.f0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.project.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryProjectFragment.K(y0Var, this, (Boolean) obj);
            }
        }));
        y0Var.f159928r3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.project.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GalleryProjectFragment.L(kVarG, view2);
            }
        });
    }
}
