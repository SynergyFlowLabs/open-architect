package com.planner5d.library.dgenerator.fragment.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.r0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.h0;
import androidx.navigation.w0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.r3;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.c0;
import com.planner5d.library.widget.k0;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nGalleryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n42#2,3:122\n16#3:125\n1#4:126\n*S KotlinDebug\n*F\n+ 1 GalleryFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryFragment\n*L\n36#1:122,3\n37#1:125\n*E\n"})
public final class GalleryFragment extends Fragment implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h0 f160140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f160141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f160142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f160143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private mb.d f160144f;

    @ij.a
    public y0 imageManager;

    public static final class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return GalleryFragment.this.y().m(i10);
        }
    }

    static final class b<T> implements kotlinx.coroutines.flow.j {
        b() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(u.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            GalleryFragment.this.y().k(aVar.f());
            return Unit.f312394a;
        }
    }

    static final class c<T> implements kotlinx.coroutines.flow.j {
        c() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(u.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            GalleryFragment.this.f160143e.a().u(bVar.d());
            return Unit.f312394a;
        }
    }

    static final class d implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f160148a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f160148a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f160148a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f160148a.invoke(obj);
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

    public static final class e implements r0 {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(GalleryFragment galleryFragment) {
            androidx.navigation.fragment.f.a(galleryFragment).A0();
            return Unit.f312394a;
        }

        @Override // androidx.core.view.r0
        public void a(Menu menu, MenuInflater menuInflater) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
            menuInflater.inflate(lb.b.n.f320669a, menu);
        }

        @Override // androidx.core.view.r0
        public boolean d(MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            if (menuItem.getItemId() != lb.b.j.Q0) {
                return false;
            }
            u uVarA = GalleryFragment.this.A();
            final GalleryFragment galleryFragment = GalleryFragment.this;
            uVarA.k0(new Function0() { // from class: com.planner5d.library.dgenerator.fragment.gallery.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryFragment.e.f(galleryFragment);
                }
            });
            return true;
        }
    }

    public static final class f implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f160150a;

        public f(Fragment fragment) {
            this.f160150a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f160150a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f160150a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 GalleryFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/GalleryFragment\n*L\n1#1,16:1\n37#2:17\n*E\n"})
    public static final class g implements Function0<l2> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return GalleryFragment.this.getViewModelStore();
        }
    }

    public static final class h implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f160152a;

        public h(com.planner5d.library.view.b bVar) {
            this.f160152a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f160152a;
        }
    }

    public GalleryFragment() {
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f160139a = hVarA;
        this.f160140b = new h0(j1.d(com.planner5d.library.dgenerator.fragment.crop.g.class), new f(this));
        com.planner5d.library.dgenerator.application.c.b bVar = com.planner5d.library.dgenerator.application.c.f160073b;
        this.f160141c = new i2(j1.d(u.class), new g(), new h(bVar.a()), null, 8, null);
        this.f160142d = g0.c(new Function0() { // from class: com.planner5d.library.dgenerator.fragment.gallery.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryFragment.x(this.f160153a);
            }
        });
        this.f160143e = new com.planner5d.library.widget.preloader.t();
        bVar.a().g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u A() {
        return (u) this.f160141c.getValue();
    }

    private final void B(u.c cVar) {
        w0 w0VarA = androidx.navigation.fragment.f.a(this);
        com.planner5d.library.dgenerator.fragment.gallery.h.a aVarA = com.planner5d.library.dgenerator.fragment.gallery.h.a(cVar.h(), cVar.f(), cVar.g());
        Intrinsics.checkNotNullExpressionValue(aVarA, "toGalleryPager(...)");
        w0VarA.m0(aVarA);
        A().s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(GalleryFragment galleryFragment, View view) {
        u uVarA = galleryFragment.A();
        com.planner5d.library.services.bitmaploader.target.h hVar = galleryFragment.f160139a;
        y0 imageManager$P5D_Library_DesignGenerator_release = galleryFragment.getImageManager$P5D_Library_DesignGenerator_release();
        androidx.fragment.app.s sVarRequireActivity = galleryFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
        uVarA.u0(hVar, imageManager$P5D_Library_DesignGenerator_release, sVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(GalleryFragment galleryFragment, u.c cVar) {
        if (cVar != null) {
            galleryFragment.B(cVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(View view, GalleryFragment galleryFragment, com.planner5d.library.services.utility.o oVar) {
        r3 r3VarA = oVar.a();
        if (r3VarA != null && ((Boolean) r3VarA.a()).booleanValue()) {
            Snackbar snackbarC0 = Snackbar.C0(view, lb.b.s.NF, -1);
            Intrinsics.checkNotNullExpressionValue(snackbarC0, "make(...)");
            mb.d dVar = galleryFragment.f160144f;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dVar = null;
            }
            snackbarC0.d0(dVar.f322869e);
            snackbarC0.m0();
        }
        return Unit.f312394a;
    }

    private final void F() {
        y3.f229862a.l(this).addMenuProvider(new e(), getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o x(GalleryFragment galleryFragment) {
        return new o(galleryFragment.f160139a, galleryFragment.getImageManager$P5D_Library_DesignGenerator_release(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o y() {
        return (o) this.f160142d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.planner5d.library.dgenerator.fragment.crop.g z() {
        return (com.planner5d.library.dgenerator.fragment.crop.g) this.f160140b.getValue();
    }

    @NotNull
    public final y0 getImageManager$P5D_Library_DesignGenerator_release() {
        y0 y0Var = this.imageManager;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageManager");
        return null;
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        A().w0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        A().r0(z().c());
        mb.d dVarC = mb.d.c(inflater);
        Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
        this.f160143e.b(dVarC.f322867c);
        dVarC.f322868d.setAdapter(y());
        RecyclerView recyclerView = dVarC.f322868d;
        RecyclerView imageList = dVarC.f322868d;
        Intrinsics.checkNotNullExpressionValue(imageList, "imageList");
        GridLayoutManagerItemDecorationInvalidation gridLayoutManagerItemDecorationInvalidation = new GridLayoutManagerItemDecorationInvalidation(imageList, 2);
        gridLayoutManagerItemDecorationInvalidation.R3(new a());
        recyclerView.setLayoutManager(gridLayoutManagerItemDecorationInvalidation);
        dVarC.f322868d.n(new k0(getResources().getDimensionPixelSize(md.b.g.Mh)));
        dVarC.f322866b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.gallery.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryFragment.C(this.f160154a, view);
            }
        });
        this.f160144f = dVarC;
        A().B0();
        mb.d dVar = this.f160144f;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        ConstraintLayout root = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        A().p0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.gallery.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryFragment.D(this.f160155a, (u.c) obj);
            }
        }));
        l1 l1Var = l1.f225303a;
        l1.c(l1Var, this, A().n0(), null, new b(), 2, null);
        l1.c(l1Var, this, A().o0(), null, new c(), 2, null);
        A().m0().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.planner5d.library.dgenerator.fragment.gallery.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryFragment.E(view, this, (com.planner5d.library.services.utility.o) obj);
            }
        }));
        F();
    }

    public final void setImageManager$P5D_Library_DesignGenerator_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}
