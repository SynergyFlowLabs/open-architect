package com.planner5d.library.dgenerator.fragment.gallery.pager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.r0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.navigation.h0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.l1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nGalleryPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPagerFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/pager/GalleryPagerFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,89:1\n42#2,3:90\n16#3:93\n*S KotlinDebug\n*F\n+ 1 GalleryPagerFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/pager/GalleryPagerFragment\n*L\n25#1:90,3\n26#1:93\n*E\n"})
public final class GalleryPagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0 f160181a = new h0(j1.d(com.planner5d.library.dgenerator.fragment.gallery.pager.d.class), new c(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f0 f160182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f160183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f160184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private mb.e f160185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f160186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160187g;

    @ij.a
    public y0 imageManager;

    static final class a<T> implements kotlinx.coroutines.flow.j {
        a() {
        }

        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(j.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            if (aVar.f()) {
                GalleryPagerFragment.this.f160184d.a().m();
            } else {
                GalleryPagerFragment.this.f160184d.a().b();
                GalleryPagerFragment.this.w().a(aVar.e());
                mb.e eVar = GalleryPagerFragment.this.f160185e;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    eVar = null;
                }
                eVar.f322872c.setCurrentItem(GalleryPagerFragment.this.f160186f);
            }
            return Unit.f312394a;
        }
    }

    public static final class b implements r0 {
        b() {
        }

        @Override // androidx.core.view.r0
        public void a(Menu menu, MenuInflater menuInflater) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
            menuInflater.inflate(lb.b.n.f320674f, menu);
        }

        @Override // androidx.core.view.r0
        public boolean d(MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            if (menuItem.getItemId() != lb.b.j.f320098r1) {
                return false;
            }
            j jVarY = GalleryPagerFragment.this.y();
            com.planner5d.library.services.bitmaploader.target.h hVar = GalleryPagerFragment.this.f160187g;
            y0 imageManager$P5D_Library_DesignGenerator_release = GalleryPagerFragment.this.getImageManager$P5D_Library_DesignGenerator_release();
            mb.e eVar = GalleryPagerFragment.this.f160185e;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar = null;
            }
            jVarY.k0(hVar, imageManager$P5D_Library_DesignGenerator_release, eVar.f322872c.getCurrentItem());
            return true;
        }
    }

    public static final class c implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f160190a;

        public c(Fragment fragment) {
            this.f160190a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f160190a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f160190a + " has null arguments");
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 GalleryPagerFragment.kt\ncom/planner5d/library/dgenerator/fragment/gallery/pager/GalleryPagerFragment\n*L\n1#1,16:1\n26#2:17\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return GalleryPagerFragment.this.getViewModelStore();
        }
    }

    public static final class e implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f160192a;

        public e(com.planner5d.library.view.b bVar) {
            this.f160192a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f160192a;
        }
    }

    public GalleryPagerFragment() {
        com.planner5d.library.dgenerator.application.c.b bVar = com.planner5d.library.dgenerator.application.c.f160073b;
        Function0 function0 = null;
        this.f160182b = new i2(j1.d(j.class), new d(), new e(bVar.a()), function0, 8, null);
        this.f160183c = g0.c(new Function0() { // from class: com.planner5d.library.dgenerator.fragment.gallery.pager.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryPagerFragment.v(this.f160197a);
            }
        });
        this.f160184d = new t();
        com.planner5d.library.services.bitmaploader.target.h hVarA = new com.planner5d.library.services.bitmaploader.target.h.a().a(this);
        Intrinsics.checkNotNullExpressionValue(hVarA, "create(...)");
        this.f160187g = hVarA;
        bVar.a().h(this);
    }

    private final void A() {
        y3.f229862a.l(this).addMenuProvider(new b(), getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.dgenerator.fragment.gallery.pager.a v(GalleryPagerFragment galleryPagerFragment) {
        return new com.planner5d.library.dgenerator.fragment.gallery.pager.a(galleryPagerFragment.f160187g, galleryPagerFragment.getImageManager$P5D_Library_DesignGenerator_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.dgenerator.fragment.gallery.pager.a w() {
        return (com.planner5d.library.dgenerator.fragment.gallery.pager.a) this.f160183c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.planner5d.library.dgenerator.fragment.gallery.pager.d x() {
        return (com.planner5d.library.dgenerator.fragment.gallery.pager.d) this.f160181a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j y() {
        return (j) this.f160182b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(GalleryPagerFragment galleryPagerFragment, mb.e eVar, View view) {
        galleryPagerFragment.y().i0(galleryPagerFragment.f160187g, galleryPagerFragment.getImageManager$P5D_Library_DesignGenerator_release(), eVar.f322872c.getCurrentItem());
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

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f160186f = x().d();
        y().h0(x().c());
        final mb.e eVarC = mb.e.c(inflater);
        Intrinsics.checkNotNullExpressionValue(eVarC, "inflate(...)");
        setHasOptionsMenu(true);
        this.f160184d.b(eVarC.f322873d);
        eVarC.f322872c.setAdapter(w());
        eVarC.f322871b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.gallery.pager.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryPagerFragment.z(this.f160198a, eVarC, view);
            }
        });
        this.f160185e = eVarC;
        y().p0();
        mb.e eVar = this.f160185e;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        FrameLayout root = eVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        l1.c(l1.f225303a, this, y().getUiState(), null, new a(), 2, null);
        A();
    }

    public final void setImageManager$P5D_Library_DesignGenerator_release(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        this.imageManager = y0Var;
    }
}
