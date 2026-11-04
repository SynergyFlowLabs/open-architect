package com.planner5d.library.model.manager.favorite.room;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.ApplicationDatabase;
import com.planner5d.library.database.model.h;
import com.planner5d.library.services.utility.d3;
import fg.e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f191436d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.favorite.c f191437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e<ApplicationDatabase> f191438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d3<com.planner5d.library.database.model.c> f191439c;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.favorite.room.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.model.manager.favorite.room.MigratedFromPreferencesFavoriteMarkDao$dao$1", f = "MigratedFromPreferencesFavoriteMarkDao.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    static final class C1594a extends o implements Function1<d<? super com.planner5d.library.database.model.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191440a;

        C1594a(d<? super C1594a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(d<?> dVar) {
            return a.this.new C1594a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191440a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.favorite.c cVar = a.this.f191437a;
                this.f191440a = 1;
                if (cVar.g(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return ((ApplicationDatabase) a.this.f191438b.get()).g();
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super com.planner5d.library.database.model.c> dVar) {
            return ((C1594a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.model.manager.favorite.room.MigratedFromPreferencesFavoriteMarkDao", f = "MigratedFromPreferencesFavoriteMarkDao.kt", i = {0, 0, 0}, l = {27, 27}, m = "isMarkedAsFavorite", n = {"user", "type", "itemId"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191445d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191447f;

        b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191445d = obj;
            this.f191447f |= Integer.MIN_VALUE;
            return a.this.b(null, null, null, this);
        }
    }

    @f(c = "com.planner5d.library.model.manager.favorite.room.MigratedFromPreferencesFavoriteMarkDao", f = "MigratedFromPreferencesFavoriteMarkDao.kt", i = {0, 0, 0}, l = {30, 30}, m = "updateAllFavorites", n = {"user", "type", "itemIdsToBeFavorite"}, s = {"L$0", "L$1", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191451d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191453f;

        c(d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191451d = obj;
            this.f191453f |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.model.manager.favorite.c oldStorage, @NotNull e<ApplicationDatabase> applicationDatabase) {
        Intrinsics.checkNotNullParameter(oldStorage, "oldStorage");
        Intrinsics.checkNotNullParameter(applicationDatabase, "applicationDatabase");
        this.f191437a = oldStorage;
        this.f191438b = applicationDatabase;
        this.f191439c = new d3<>(new C1594a(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (((com.planner5d.library.database.model.c) r10).a(r7, r8, r9, r0) == r1) goto L21;
     */
    @Override // com.planner5d.library.database.model.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.Nullable id.a r7, @org.jetbrains.annotations.NotNull com.planner5d.library.database.model.f r8, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            r5 = 3
            boolean r0 = r10 instanceof com.planner5d.library.model.manager.favorite.room.a.c
            if (r0 == 0) goto L16
            r0 = r10
            r5 = 2
            com.planner5d.library.model.manager.favorite.room.a$c r0 = (com.planner5d.library.model.manager.favorite.room.a.c) r0
            int r1 = r0.f191453f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 4
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f191453f = r1
            goto L1c
        L16:
            r5 = 0
            com.planner5d.library.model.manager.favorite.room.a$c r0 = new com.planner5d.library.model.manager.favorite.room.a$c
            r0.<init>(r10)
        L1c:
            java.lang.Object r10 = r0.f191451d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f191453f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L31
            r5 = 3
            kotlin.ResultKt.m(r10)
            goto L84
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 7
            java.lang.String r7 = "/ihmncmbn oei//evt ael// oe u euretrsorowoit//flkc/"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 4
            throw r6
        L3d:
            r5 = 6
            java.lang.Object r6 = r0.f191450c
            r9 = r6
            r9 = r6
            r5 = 7
            java.util.Set r9 = (java.util.Set) r9
            r5 = 5
            java.lang.Object r6 = r0.f191449b
            r8 = r6
            com.planner5d.library.database.model.f r8 = (com.planner5d.library.database.model.f) r8
            r5 = 2
            java.lang.Object r6 = r0.f191448a
            r7 = r6
            id.a r7 = (id.a) r7
            r5 = 1
            kotlin.ResultKt.m(r10)
            r5 = 0
            goto L6f
        L57:
            kotlin.ResultKt.m(r10)
            r5 = 3
            com.planner5d.library.services.utility.d3<com.planner5d.library.database.model.c> r6 = r6.f191439c
            r5 = 2
            r0.f191448a = r7
            r0.f191449b = r8
            r5 = 1
            r0.f191450c = r9
            r0.f191453f = r4
            java.lang.Object r10 = r6.a(r0)
            r5 = 7
            if (r10 != r1) goto L6f
            goto L83
        L6f:
            com.planner5d.library.database.model.c r10 = (com.planner5d.library.database.model.c) r10
            r5 = 2
            r6 = 0
            r0.f191448a = r6
            r0.f191449b = r6
            r0.f191450c = r6
            r5 = 4
            r0.f191453f = r3
            java.lang.Object r6 = r10.a(r7, r8, r9, r0)
            r5 = 6
            if (r6 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.favorite.room.a.a(id.a, com.planner5d.library.database.model.f, java.util.Set, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.database.model.h
    @Nullable
    public Object b(@Nullable id.a aVar, @NotNull com.planner5d.library.database.model.f fVar, @NotNull String str, @NotNull d<? super Boolean> dVar) throws Throwable {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f191447f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f191447f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f191445d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f191447f;
        if (i11 == 0) {
            ResultKt.m(objA);
            d3<com.planner5d.library.database.model.c> d3Var = this.f191439c;
            bVar.f191442a = aVar;
            bVar.f191443b = fVar;
            bVar.f191444c = str;
            bVar.f191447f = 1;
            objA = d3Var.a(bVar);
            if (objA != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objA);
            return objA;
        }
        str = (String) bVar.f191444c;
        fVar = (com.planner5d.library.database.model.f) bVar.f191443b;
        aVar = (id.a) bVar.f191442a;
        ResultKt.m(objA);
        bVar.f191442a = null;
        bVar.f191443b = null;
        bVar.f191444c = null;
        bVar.f191447f = 2;
        Object objB = ((com.planner5d.library.database.model.c) objA).b(aVar, fVar, str, bVar);
        return objB == objL ? objL : objB;
    }
}
