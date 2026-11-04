package com.planner5d.library.activity.fragment.gallery.project;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.c2;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.y0;
import com.planner5d.library.activity.fragment.gallery.m;
import com.planner5d.library.activity.fragment.gallery.p0;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import le.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class k extends f2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f133859o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f133860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f133861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.i f133862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.favorite.a f133863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final x f133864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final y1 f133865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m f133866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final t f133867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.model.h> f133868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<String>> f133869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<String> f133870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f133871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f133872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.model.h> f133873n;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.project.GalleryProjectViewModel$consumeArgumentsAndInit$1", f = "GalleryProjectViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f133876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b4.c f133877d;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.gallery.project.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.project.GalleryProjectViewModel$consumeArgumentsAndInit$1$1", f = "GalleryProjectViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1471a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.h>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f133879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f133880c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1471a(k kVar, Bundle bundle, kotlin.coroutines.d<? super C1471a> dVar) {
                super(2, dVar);
                this.f133879b = kVar;
                this.f133880c = bundle;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1471a(this.f133879b, this.f133880c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f133878a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f133879b.f133862c.a(new com.planner5d.library.services.utility.j(this.f133880c).h(r.model, null));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.h> dVar) {
                return ((C1471a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bundle bundle, b4.c cVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f133876c = bundle;
            this.f133877d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new a(this.f133876c, this.f133877d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133874a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n0 n0VarH = k.this.f133867h.h();
                C1471a c1471a = new C1471a(k.this, this.f133876c, null);
                this.f133874a = 1;
                obj = kotlinx.coroutines.i.h(n0VarH, c1471a, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            k kVar = k.this;
            com.planner5d.library.model.h hVar = (com.planner5d.library.model.h) obj;
            kVar.i0().c(hVar, this.f133877d);
            kVar.g0().r(hVar);
            k.this.h0().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.project.GalleryProjectViewModel$favorite$1$1", f = "GalleryProjectViewModel.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<y0<Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f133882b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h f133884d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.model.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133884d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = k.this.new b(this.f133884d, dVar);
            bVar.f133882b = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 1
                int r1 = r8.f133881a
                r7 = 6
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L20
                r7 = 0
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r9)
                goto L5d
            L15:
                r7 = 3
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 1
                r8.<init>(r9)
                r7 = 0
                throw r8
            L20:
                java.lang.Object r1 = r8.f133882b
                androidx.lifecycle.y0 r1 = (androidx.lifecycle.y0) r1
                kotlin.ResultKt.m(r9)
                r7 = 0
                goto L51
            L29:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f133882b
                r1 = r9
                r1 = r9
                androidx.lifecycle.y0 r1 = (androidx.lifecycle.y0) r1
                com.planner5d.library.activity.fragment.gallery.project.k r9 = com.planner5d.library.activity.fragment.gallery.project.k.this
                com.planner5d.library.model.manager.favorite.a r9 = com.planner5d.library.activity.fragment.gallery.project.k.Z(r9)
                r7 = 0
                com.planner5d.library.database.model.f r4 = com.planner5d.library.database.model.f.GALLERY_PROJECTS
                com.planner5d.library.model.h r5 = r8.f133884d
                r7 = 1
                java.lang.String r5 = r5.f180740b
                java.lang.String r6 = "id"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                r8.f133882b = r1
                r8.f133881a = r3
                java.lang.Object r9 = r9.g(r4, r5, r8)
                if (r9 != r0) goto L51
                r7 = 2
                goto L5c
            L51:
                r3 = 0
                r8.f133882b = r3
                r8.f133881a = r2
                java.lang.Object r8 = r1.emit(r9, r8)
                if (r8 != r0) goto L5d
            L5c:
                return r0
            L5d:
                r7 = 3
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.gallery.project.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y0<Boolean> y0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(y0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.project.GalleryProjectViewModel$toggleFavorite$1", f = "GalleryProjectViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133885a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.h f133887c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f133888a;

            static {
                int[] iArr = new int[o.a.EnumC2327a.values().length];
                try {
                    iArr[o.a.EnumC2327a.LIKE_ADDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.a.EnumC2327a.LIKE_REMOVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[o.a.EnumC2327a.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f133888a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.model.h hVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f133887c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new c(this.f133887c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Boolean boolA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133885a;
            if (i10 == 0) {
                ResultKt.m(obj);
                o oVar = k.this.f133861b;
                com.planner5d.library.model.h hVar = this.f133887c;
                this.f133885a = 1;
                obj = oVar.a(hVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            o.a aVar = (o.a) obj;
            k.this.h0().r(kotlin.coroutines.jvm.internal.b.a(false));
            k.this.g0().r(aVar.a());
            int i11 = a.f133888a[aVar.b().ordinal()];
            if (i11 == 1) {
                boolA = kotlin.coroutines.jvm.internal.b.a(true);
            } else if (i11 == 2) {
                boolA = kotlin.coroutines.jvm.internal.b.a(false);
            } else {
                if (i11 != 3) {
                    throw new k0();
                }
                boolA = null;
            }
            if (boolA != null) {
                k.this.f133866g.c(new com.planner5d.library.model.k(aVar.a(), kotlin.coroutines.jvm.internal.b.a(boolA.booleanValue())));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public k(@NotNull p0 saveGalleryItemOnClickListener, @NotNull o toggleFavoriteUseCase, @NotNull com.planner5d.library.model.i galleryRecordFactory, @NotNull com.planner5d.library.model.manager.favorite.a favoritesRepository, @NotNull x navigator, @NotNull y1 menuManager, @NotNull m cache, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(saveGalleryItemOnClickListener, "saveGalleryItemOnClickListener");
        Intrinsics.checkNotNullParameter(toggleFavoriteUseCase, "toggleFavoriteUseCase");
        Intrinsics.checkNotNullParameter(galleryRecordFactory, "galleryRecordFactory");
        Intrinsics.checkNotNullParameter(favoritesRepository, "favoritesRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f133860a = saveGalleryItemOnClickListener;
        this.f133861b = toggleFavoriteUseCase;
        this.f133862c = galleryRecordFactory;
        this.f133863d = favoritesRepository;
        this.f133864e = navigator;
        this.f133865f = menuManager;
        this.f133866g = cache;
        this.f133867h = coroutineDispatchers;
        c1<com.planner5d.library.model.h> c1Var = new c1<>();
        this.f133868i = c1Var;
        this.f133869j = c2.f(c2.h(c1Var, new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.project.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.o0((com.planner5d.library.model.h) obj);
            }
        }));
        this.f133870k = c2.f(c2.h(c1Var, new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.project.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.q0((com.planner5d.library.model.h) obj);
            }
        }));
        this.f133871l = c2.l(c1Var, new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.project.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k.d0(this.f133858a, (com.planner5d.library.model.h) obj);
            }
        });
        this.f133872m = new c1<>(Boolean.FALSE);
        this.f133873n = new c1<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 d0(k kVar, com.planner5d.library.model.h hVar) {
        return androidx.lifecycle.o.h(null, 0L, kVar.new b(hVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o0(com.planner5d.library.model.h hVar) {
        String[] strArrD = hVar.d();
        if (strArrD != null) {
            return ArraysKt.toList(strArrD);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q0(com.planner5d.library.model.h hVar) {
        return hVar.f180745g;
    }

    public final void c0(@Nullable Bundle bundle, @NotNull b4.c analyticsSource) {
        Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
        this.f133872m.r(Boolean.TRUE);
        int i10 = 4 & 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(bundle, analyticsSource, null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> f0() {
        return this.f133871l;
    }

    @NotNull
    public final c1<com.planner5d.library.model.h> g0() {
        return this.f133868i;
    }

    @NotNull
    public final c1<Boolean> h0() {
        return this.f133872m;
    }

    @NotNull
    public final p0 i0() {
        return this.f133860a;
    }

    @NotNull
    public final c1<com.planner5d.library.model.h> j0() {
        return this.f133873n;
    }

    @NotNull
    public final androidx.lifecycle.w0<List<String>> k0() {
        return this.f133869j;
    }

    @NotNull
    public final androidx.lifecycle.w0<String> l0() {
        return this.f133870k;
    }

    public final void m0() {
        x xVar = this.f133864e;
        com.planner5d.library.model.h hVarF = this.f133868i.f();
        if (hVarF == null) {
            return;
        }
        x.g(xVar, new com.planner5d.library.activity.helper.event.content.d(hVarF).j(this.f133865f.a()), false, 2, null);
    }

    public final void n0() {
        this.f133873n.r(this.f133868i.f());
    }

    public final void p0() {
        com.planner5d.library.model.h hVarF = this.f133868i.f();
        if (hVarF == null) {
            return;
        }
        this.f133872m.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(hVarF, null), 3, null);
    }
}
