package com.planner5d.library.activity.fragment.gallery;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class k0 extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f133775e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.favorite.a f133776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<a> f133777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f133778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private p2 f133779d;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f133780f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f133781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f133782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f133783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f133784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f133785e;

        public a(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f133781a = z10;
            this.f133782b = z11;
            this.f133783c = z12;
            this.f133784d = z13;
            this.f133785e = z10 || z11 || z12;
        }

        public static /* synthetic */ a f(a aVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f133781a;
            }
            if ((i10 & 2) != 0) {
                z11 = aVar.f133782b;
            }
            if ((i10 & 4) != 0) {
                z12 = aVar.f133783c;
            }
            if ((i10 & 8) != 0) {
                z13 = aVar.f133784d;
            }
            return aVar.e(z10, z11, z12, z13);
        }

        public final boolean a() {
            return this.f133781a;
        }

        public final boolean b() {
            return this.f133782b;
        }

        public final boolean c() {
            return this.f133783c;
        }

        public final boolean d() {
            return this.f133784d;
        }

        @NotNull
        public final a e(boolean z10, boolean z11, boolean z12, boolean z13) {
            return new a(z10, z11, z12, z13);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f133781a == aVar.f133781a && this.f133782b == aVar.f133782b && this.f133783c == aVar.f133783c && this.f133784d == aVar.f133784d;
        }

        public final boolean g() {
            return this.f133781a;
        }

        public final boolean h() {
            return this.f133782b;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f133781a) * 31) + Boolean.hashCode(this.f133782b)) * 31) + Boolean.hashCode(this.f133783c)) * 31) + Boolean.hashCode(this.f133784d);
        }

        public final boolean i() {
            return this.f133784d;
        }

        public final boolean j() {
            return this.f133785e;
        }

        public final boolean k() {
            return this.f133783c;
        }

        @NotNull
        public String toString() {
            return "UiState(changeInProgress=" + this.f133781a + ", checkFavoriteInProgress=" + this.f133782b + ", toggleFavoriteInProgress=" + this.f133783c + ", favorite=" + this.f133784d + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.GalleryPagerViewModel$refreshFavoriteState$1", f = "GalleryPagerViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f133791f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.f f133793h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h f133794i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.database.model.f fVar, com.planner5d.library.model.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133793h = fVar;
            this.f133794i = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k0.this.new b(this.f133793h, this.f133794i, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            a aVarF;
            a aVar;
            c1 c1Var2;
            int i10;
            int i11;
            int i12;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i13 = this.f133791f;
            if (i13 == 0) {
                ResultKt.m(obj);
                c1Var = k0.this.f133777b;
                aVarF = k0.this.W().f();
                if (aVarF != null) {
                    com.planner5d.library.model.manager.favorite.a aVar2 = k0.this.f133776a;
                    com.planner5d.library.database.model.f fVar = this.f133793h;
                    String id2 = this.f133794i.f180740b;
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    this.f133786a = c1Var;
                    this.f133787b = aVarF;
                    this.f133788c = 0;
                    this.f133789d = 0;
                    this.f133790e = 0;
                    this.f133791f = 1;
                    Object objG = aVar2.g(fVar, id2, this);
                    if (objG == objL) {
                        return objL;
                    }
                    obj = objG;
                    c1Var2 = c1Var;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                } else {
                    aVar = null;
                }
                c1Var.r(aVar);
                return Unit.f312394a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f133790e;
            i11 = this.f133789d;
            i12 = this.f133788c;
            aVarF = (a) this.f133787b;
            c1Var2 = (c1) this.f133786a;
            ResultKt.m(obj);
            a aVarF2 = a.f(aVarF, i12 != 0, i11 != 0, i10 != 0, ((Boolean) obj).booleanValue(), 5, null);
            c1Var = c1Var2;
            aVar = aVarF2;
            c1Var.r(aVar);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k0(@NotNull com.planner5d.library.model.manager.favorite.a favoritesRepository) {
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        this.f133776a = favoritesRepository;
        c1<a> c1Var = new c1<>(new a(false, false, false, false));
        this.f133777b = c1Var;
        this.f133778c = c1Var;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> W() {
        return this.f133778c;
    }

    public final void X(@Nullable com.planner5d.library.model.h hVar) {
        if (hVar == null) {
            c1<a> c1Var = this.f133777b;
            a aVarF = this.f133778c.f();
            c1Var.r(aVarF != null ? a.f(aVarF, false, false, false, false, 7, null) : null);
            return;
        }
        com.planner5d.library.database.model.f fVar = hVar.f180739a == com.planner5d.library.model.manager.q0.c.ideas ? com.planner5d.library.database.model.f.GALLERY_SNAPSHOTS : com.planner5d.library.database.model.f.GALLERY_PROJECTS;
        c1<a> c1Var2 = this.f133777b;
        a aVarF2 = this.f133778c.f();
        c1Var2.r(aVarF2 != null ? a.f(aVarF2, false, true, false, false, 13, null) : null);
        p2 p2Var = this.f133779d;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f133779d = kotlinx.coroutines.k.f(g2.a(this), null, null, new b(fVar, hVar, null), 3, null);
    }

    public final boolean Y(boolean z10) {
        a aVarF;
        a aVarF2 = this.f133778c.f();
        if (aVarF2 != null && z10 == aVarF2.g()) {
            return false;
        }
        c1<a> c1Var = this.f133777b;
        if (aVarF2 != null) {
            int i10 = 0 >> 0;
            aVarF = a.f(aVarF2, z10, false, false, false, 14, null);
        } else {
            aVarF = null;
        }
        c1Var.r(aVarF);
        return true;
    }

    public final void Z(boolean z10) {
        c1<a> c1Var = this.f133777b;
        a aVarF = this.f133778c.f();
        c1Var.r(aVarF != null ? a.f(aVarF, false, false, z10, false, 11, null) : null);
    }
}
