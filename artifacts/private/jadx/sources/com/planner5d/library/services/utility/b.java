package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f225044a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f225045b = 0;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.ApiUtils$call$3", f = "ApiUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.modules.user.user.t f225047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f225048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> f225049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.api.b f225050e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(com.planner5d.library.modules.user.user.t tVar, id.a aVar, Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, com.planner5d.library.api.b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f225047b = tVar;
            this.f225048c = aVar;
            this.f225049d = function1;
            this.f225050e = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.planner5d.library.api.c m(Function1 function1, com.planner5d.library.api.b bVar) {
            return (com.planner5d.library.api.c) function1.invoke(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f225047b, this.f225048c, this.f225049d, this.f225050e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f225046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.modules.user.user.t tVar = this.f225047b;
            id.a aVar = this.f225048c;
            final Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> function1 = this.f225049d;
            final com.planner5d.library.api.b bVar = this.f225050e;
            return tVar.T(aVar, new Function0() { // from class: com.planner5d.library.services.utility.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.m(function1, bVar);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.utility.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.ApiUtils$call$5", f = "ApiUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1686b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f225051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<com.planner5d.library.api.b, com.planner5d.library.api.c> f225052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.api.b f225053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1686b(Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, com.planner5d.library.api.b bVar, kotlin.coroutines.d<? super C1686b> dVar) {
            super(2, dVar);
            this.f225052b = function1;
            this.f225053c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1686b(this.f225052b, this.f225053c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f225051a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f225052b.invoke(this.f225053c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((C1686b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.ApiUtils", f = "ApiUtils.kt", i = {}, l = {36}, m = "callQuiet", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f225054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f225056c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225054a = obj;
            this.f225056c |= Integer.MIN_VALUE;
            return b.this.d(null, null, this);
        }
    }

    private b() {
    }

    @Nullable
    public final Object a(@NotNull com.planner5d.library.api.b bVar, @NotNull com.planner5d.library.modules.user.user.t tVar, @Nullable id.a aVar, @NotNull Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) throws Exception {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new a(tVar, aVar, function1, bVar, null), dVar);
    }

    @Nullable
    public final Object b(@NotNull com.planner5d.library.api.b bVar, @NotNull com.planner5d.library.modules.user.user.t tVar, @NotNull Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) throws Exception {
        return a(bVar, tVar, tVar.a(), function1, dVar);
    }

    @Nullable
    public final Object c(@NotNull com.planner5d.library.api.b bVar, @NotNull Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.b(), new C1686b(function1, bVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object d(@NotNull com.planner5d.library.api.b bVar, @NotNull Function1<? super com.planner5d.library.api.b, com.planner5d.library.api.c> function1, @NotNull kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f225056c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f225056c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objC = cVar.f225054a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f225056c;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                cVar.f225056c = 1;
                objC = c(bVar, function1, cVar);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
            }
            return (com.planner5d.library.api.c) objC;
        } catch (Throwable unused) {
            return null;
        }
    }
}
