package com.planner5d.library.spaces.view.loading;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.spaces.entity.SpaceInfoResponse;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class q extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f230395f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.a f230396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fe.a f230397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c4 f230398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v1.a<a> f230399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f230400e;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f230401a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.spaces.view.loading.q$a$a, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1702a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1702a f230402b = new C1702a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f230403c = 0;

            private C1702a() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1702a);
            }

            public int hashCode() {
                return -1565873599;
            }

            @NotNull
            public String toString() {
                return "Close";
            }
        }

        @w0(parameters = 0)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f230404c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final SpacesProjectData f230405b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull SpacesProjectData spacesProjectData) {
                super(null);
                Intrinsics.checkNotNullParameter(spacesProjectData, "spacesProjectData");
                this.f230405b = spacesProjectData;
            }

            @NotNull
            public final SpacesProjectData a() {
                return this.f230405b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingViewModel$findHouse$1$1", f = "SpacesLoadingViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230406a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f230408c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingViewModel$findHouse$1$1$1", f = "SpacesLoadingViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f230409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f230410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f230411c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f230410b = qVar;
                this.f230411c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f230410b, this.f230411c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f230409a;
                int i11 = 3 & 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    q qVar = this.f230410b;
                    String str = this.f230411c;
                    this.f230409a = 1;
                    if (qVar.X(str, this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f230408c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new b(this.f230408c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230406a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(q.this, this.f230408c, null);
                this.f230406a = 1;
                if (b4.e(120000L, aVar, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingViewModel", f = "SpacesLoadingViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {48, 49, 49}, m = "findHouse", n = {"this", "fullAddress", "this", "fullAddress", "this", "fullAddress"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f230413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f230414c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230416e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230414c = obj;
            this.f230416e |= Integer.MIN_VALUE;
            return q.this.X(null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nSpacesLoadingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesLoadingViewModel.kt\ncom/planner5d/library/spaces/view/loading/SpacesLoadingViewModel$findHouse$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f230418b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.loading.SpacesLoadingViewModel$findHouse$4$1", f = "SpacesLoadingViewModel.kt", i = {0}, l = {52}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f230419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f230420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d<T> f230421c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f230422d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f230421c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f230420b = obj;
                this.f230422d |= Integer.MIN_VALUE;
                return this.f230421c.emit(null, this);
            }
        }

        d(String str) {
            this.f230418b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(q qVar, SpacesProjectData spacesProjectData) {
            if (spacesProjectData != null) {
                qVar.f230399d.r(new a.b(spacesProjectData));
            } else {
                qVar.f230399d.r(a.C1702a.f230402b);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(q qVar) {
            qVar.f230399d.r(a.C1702a.f230402b);
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(SpaceInfoResponse spaceInfoResponse, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f230422d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f230422d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            a aVar2 = aVar;
            Object obj = aVar2.f230420b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar2.f230422d;
            if (i11 == 0) {
                ResultKt.m(obj);
                if (spaceInfoResponse != null) {
                    final q qVar = q.this;
                    String str = this.f230418b;
                    timber.log.b.f381052a.a("findHouseInfo collected status=" + spaceInfoResponse.b(), new Object[0]);
                    com.planner5d.library.spaces.data.a aVar3 = qVar.f230396a;
                    Function1<? super SpacesProjectData, Unit> function1 = new Function1() { // from class: com.planner5d.library.spaces.view.loading.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return q.d.e(qVar, (SpacesProjectData) obj2);
                        }
                    };
                    Function0<Unit> function0 = new Function0() { // from class: com.planner5d.library.spaces.view.loading.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.d.g(qVar);
                        }
                    };
                    aVar2.f230419a = this;
                    aVar2.f230422d = 1;
                    if (aVar3.k(str, spaceInfoResponse, function1, function0, aVar2) == objL) {
                        return objL;
                    }
                } else {
                    timber.log.b.f381052a.a("findHouseInfo collected null spaceInfoResponse", new Object[0]);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    @ij.a
    public q(@NotNull com.planner5d.library.spaces.data.a addressRepository, @NotNull fe.a findHouseInfoUseCase, @NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(findHouseInfoUseCase, "findHouseInfoUseCase");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230396a = addressRepository;
        this.f230397b = findHouseInfoUseCase;
        this.f230398c = statisticsEventSpaces;
        v1.a<a> aVarL = v1.l(v1.f229769a, null, 1, null);
        this.f230399d = aVarL;
        this.f230400e = aVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r10.collect(r2, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(java.lang.String r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.loading.q.X(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    public final void Y(@Nullable String str) {
        if (str == null || kotlinx.coroutines.k.f(g2.a(this), null, null, new b(str, null), 3, null) == null) {
            this.f230398c.Z0(c4.a.error, c4.c.loader, null, "failed to find house");
            this.f230399d.r(a.C1702a.f230402b);
            Unit unit = Unit.f312394a;
        }
    }

    @NotNull
    public final androidx.lifecycle.w0<a> Z() {
        return this.f230400e;
    }

    public final void a0() {
        c4.b.a(this.f230398c, c4.a.open, c4.c.loader, null, null, 12, null);
    }

    public final void b0() {
        c4.b.a(this.f230398c, c4.a.back, c4.c.loader, null, null, 12, null);
    }
}
