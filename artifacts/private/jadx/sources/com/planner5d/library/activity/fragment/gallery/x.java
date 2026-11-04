package com.planner5d.library.activity.fragment.gallery;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.services.utility.v1;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class x extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f133910f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f133911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f133912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f133913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v1.a<a> f133914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Long> f133915e;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f133916c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ue.b[] f133917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f133918b;

        public a(@NotNull ue.b[] categoryItems, int i10) {
            Intrinsics.checkNotNullParameter(categoryItems, "categoryItems");
            this.f133917a = categoryItems;
            this.f133918b = i10;
        }

        @NotNull
        public final ue.b[] a() {
            return this.f133917a;
        }

        public final int b() {
            return this.f133918b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.GalleryPageViewModel$setListCategory$1", f = "GalleryPageViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133920b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f133922d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.GalleryPageViewModel$setListCategory$1$tags$1", f = "GalleryPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.x[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133923a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f133924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f133924b = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f133924b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f133923a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f133924b.f133912b.e0();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.x[]> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133922d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new b(this.f133922d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            c1 c1Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133920b;
            Long lG = null;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1Var = x.this.f133915e;
                String str = this.f133922d;
                if (str != null && !Intrinsics.areEqual(CreateTicketViewModelKt.EmailId, str)) {
                    if (Intrinsics.areEqual("777", this.f133922d)) {
                        lG = kotlin.coroutines.jvm.internal.b.g(777L);
                    } else {
                        kotlinx.coroutines.n0 n0VarH = x.this.f133913c.h();
                        a aVar = new a(x.this, null);
                        this.f133919a = c1Var;
                        this.f133920b = 1;
                        Object objH = kotlinx.coroutines.i.h(n0VarH, aVar, this);
                        if (objH == objL) {
                            return objL;
                        }
                        c1Var2 = c1Var;
                        obj = objH;
                    }
                }
                c1Var.r(lG);
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1Var2 = (c1) this.f133919a;
            ResultKt.m(obj);
            com.planner5d.library.model.x[] xVarArr = (com.planner5d.library.model.x[]) obj;
            Integer numValueOf = Integer.valueOf(this.f133922d);
            if (numValueOf.intValue() < xVarArr.length) {
                Intrinsics.checkNotNull(numValueOf);
                lG = kotlin.coroutines.jvm.internal.b.g(xVarArr[numValueOf.intValue()].f222847a);
            }
            c1Var = c1Var2;
            c1Var.r(lG);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.GalleryPageViewModel$showCategoriesPicker$1", f = "GalleryPageViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f133925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133926b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.q0.d f133928d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.gallery.GalleryPageViewModel$showCategoriesPicker$1$1", f = "GalleryPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super a>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f133929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f133930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.model.manager.q0.d f133931c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, com.planner5d.library.model.manager.q0.d dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f133930b = xVar;
                this.f133931c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f133930b, this.f133931c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f133929a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                v vVar = this.f133930b.f133911a;
                com.planner5d.library.model.x[] xVarArrE0 = this.f133930b.f133912b.e0();
                Intrinsics.checkNotNullExpressionValue(xVarArrE0, "getTags(...)");
                ue.b[] bVarArrA = vVar.a(xVarArrE0);
                v vVar2 = this.f133930b.f133911a;
                com.planner5d.library.model.x[] xVarArrE1 = this.f133930b.f133912b.e0();
                Intrinsics.checkNotNullExpressionValue(xVarArrE1, "getTags(...)");
                return new a(bVarArrA, vVar2.b(xVarArrE1, this.f133931c.f197683d));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super a> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.planner5d.library.model.manager.q0.d dVar, kotlin.coroutines.d<? super c> dVar2) {
            super(2, dVar2);
            this.f133928d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x.this.new c(this.f133928d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            v1.a aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f133926b;
            if (i10 == 0) {
                ResultKt.m(obj);
                v1.a<a> aVarA0 = x.this.a0();
                kotlinx.coroutines.n0 n0VarH = x.this.f133913c.h();
                a aVar2 = new a(x.this, this.f133928d, null);
                this.f133925a = aVarA0;
                this.f133926b = 1;
                Object objH = kotlinx.coroutines.i.h(n0VarH, aVar2, this);
                if (objH == objL) {
                    return objL;
                }
                obj = objH;
                aVar = aVarA0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (v1.a) this.f133925a;
                ResultKt.m(obj);
            }
            aVar.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public x(@NotNull v galleryPageCategoryPickerData, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.services.utility.t coroutineDispatchersProvider) {
        Intrinsics.checkNotNullParameter(galleryPageCategoryPickerData, "galleryPageCategoryPickerData");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(coroutineDispatchersProvider, "coroutineDispatchersProvider");
        this.f133911a = galleryPageCategoryPickerData;
        this.f133912b = builtInDataManager;
        this.f133913c = coroutineDispatchersProvider;
        this.f133914d = v1.l(v1.f229769a, null, 1, null);
        this.f133915e = new c1<>();
    }

    private static Object Z(x xVar) {
        return j1.t(new kotlin.jvm.internal.c1(xVar, x.class, "internalListCategory", "getInternalListCategory()Landroidx/lifecycle/MutableLiveData;", 0));
    }

    @NotNull
    public final androidx.lifecycle.w0<Long> Y() {
        return this.f133915e;
    }

    @NotNull
    public final v1.a<a> a0() {
        return this.f133914d;
    }

    public final void b0(@Nullable String str) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(str, null), 3, null);
    }

    public final void c0(@NotNull com.planner5d.library.model.manager.q0.d listFilter) {
        Intrinsics.checkNotNullParameter(listFilter, "listFilter");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new c(listFilter, null), 3, null);
    }
}
