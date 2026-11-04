package com.google.firebase.remoteconfig;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super c>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f124469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f124470c;

        /* JADX INFO: renamed from: com.google.firebase.remoteconfig.f0$a$a, reason: collision with other inner class name */
        static final class C1182a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f124471a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1182a(e eVar) {
                super(0);
                this.f124471a = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f124471a.remove();
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f124472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0<c> f124473b;

            /* JADX WARN: Multi-variable type inference failed */
            b(r rVar, l0<? super c> l0Var) {
                this.f124472a = rVar;
                this.f124473b = l0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(l0 $this$callbackFlow, c configUpdate) {
                Intrinsics.checkNotNullParameter($this$callbackFlow, "$$this$callbackFlow");
                Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
                kotlinx.coroutines.channels.v.m0($this$callbackFlow, configUpdate);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void a(@NotNull final c configUpdate) {
                Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
                r rVar = this.f124472a;
                final l0<c> l0Var = this.f124473b;
                rVar.E(new Runnable() { // from class: com.google.firebase.remoteconfig.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.a.b.d(l0Var, configUpdate);
                    }
                });
            }

            @Override // com.google.firebase.remoteconfig.d
            public void b(@NotNull t error) {
                Intrinsics.checkNotNullParameter(error, "error");
                t0.c(this.f124473b, "Error listening for config updates.", error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f124470c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f124470c, dVar);
            aVar.f124469b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f124468a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f124469b;
                r rVar = this.f124470c;
                e eVarL = rVar.l(new b(rVar, l0Var));
                Intrinsics.checkNotNullExpressionValue(eVarL, "FirebaseRemoteConfig.con…      }\n        }\n      )");
                C1182a c1182a = new C1182a(eVarL);
                this.f124468a = 1;
                if (j0.b(l0Var, c1182a, this) == objL) {
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
        @Nullable
        public final Object invoke(@NotNull l0<? super c> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final f a(@NotNull Function1<? super f.a, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        f.a aVar = new f.a();
        builder.invoke(aVar);
        f fVarB = aVar.b();
        Intrinsics.checkNotNullExpressionValue(fVarB, "Builder().apply(builder).build()");
        return fVarB;
    }

    @NotNull
    public static final y b(@NotNull r rVar, @NotNull String key) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        y yVarA = rVar.A(key);
        Intrinsics.checkNotNullExpressionValue(yVarA, "this.getValue(key)");
        return yVarA;
    }

    @NotNull
    public static final kotlinx.coroutines.flow.i<c> c(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return kotlinx.coroutines.flow.k.t(new a(rVar, null));
    }

    @NotNull
    public static final r d(@NotNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        r rVarU = r.u();
        Intrinsics.checkNotNullExpressionValue(rVarU, "getInstance()");
        return rVarU;
    }

    @NotNull
    public static final r e(@NotNull com.google.firebase.d dVar, @NotNull com.google.firebase.h app2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(app2, "app");
        r rVarV = r.v(app2);
        Intrinsics.checkNotNullExpressionValue(rVarV, "getInstance(app)");
        return rVarV;
    }

    @NotNull
    public static final x f(@NotNull Function1<? super x.b, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        x.b bVar = new x.b();
        init.invoke(bVar);
        x xVarC = bVar.c();
        Intrinsics.checkNotNullExpressionValue(xVarC, "builder.build()");
        return xVarC;
    }
}
