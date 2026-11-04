package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.h;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.remoteconfig.t;
import com.google.firebase.remoteconfig.x;
import com.google.firebase.remoteconfig.y;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @f(c = "com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<l0<? super com.google.firebase.remoteconfig.c>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f124745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f124746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f124747c;

        /* JADX INFO: renamed from: com.google.firebase.remoteconfig.ktx.d$a$a, reason: collision with other inner class name */
        static final class C1186a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.firebase.remoteconfig.e f124748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1186a(com.google.firebase.remoteconfig.e eVar) {
                super(0);
                this.f124748a = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f124748a.remove();
            }
        }

        public static final class b implements com.google.firebase.remoteconfig.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f124749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0<com.google.firebase.remoteconfig.c> f124750b;

            /* JADX WARN: Multi-variable type inference failed */
            b(r rVar, l0<? super com.google.firebase.remoteconfig.c> l0Var) {
                this.f124749a = rVar;
                this.f124750b = l0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(l0 $this$callbackFlow, com.google.firebase.remoteconfig.c configUpdate) {
                Intrinsics.checkNotNullParameter($this$callbackFlow, "$$this$callbackFlow");
                Intrinsics.checkNotNullParameter(configUpdate, "$configUpdate");
                v.m0($this$callbackFlow, configUpdate);
            }

            @Override // com.google.firebase.remoteconfig.d
            public void a(@NotNull final com.google.firebase.remoteconfig.c configUpdate) {
                Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
                r rVar = this.f124749a;
                final l0<com.google.firebase.remoteconfig.c> l0Var = this.f124750b;
                rVar.E(new Runnable() { // from class: com.google.firebase.remoteconfig.ktx.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.b.d(l0Var, configUpdate);
                    }
                });
            }

            @Override // com.google.firebase.remoteconfig.d
            public void b(@NotNull t error) {
                Intrinsics.checkNotNullParameter(error, "error");
                t0.c(this.f124750b, "Error listening for config updates.", error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f124747c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f124747c, dVar);
            aVar.f124746b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f124745a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f124746b;
                r rVar = this.f124747c;
                com.google.firebase.remoteconfig.e eVarL = rVar.l(new b(rVar, l0Var));
                Intrinsics.checkNotNullExpressionValue(eVarL, "FirebaseRemoteConfig.con…      }\n        }\n      )");
                C1186a c1186a = new C1186a(eVarL);
                this.f124745a = 1;
                if (j0.b(l0Var, c1186a, this) == objL) {
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
        public final Object invoke(@NotNull l0<? super com.google.firebase.remoteconfig.c> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
    @NotNull
    public static final y a(@NotNull r rVar, @NotNull String key) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        y yVarA = rVar.A(key);
        Intrinsics.checkNotNullExpressionValue(yVarA, "this.getValue(key)");
        return yVarA;
    }

    @NotNull
    public static final i<com.google.firebase.remoteconfig.c> b(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return k.t(new a(rVar, null));
    }

    @l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
    public static /* synthetic */ void c(r rVar) {
    }

    @NotNull
    public static final r d(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        r rVarU = r.u();
        Intrinsics.checkNotNullExpressionValue(rVarU, "getInstance()");
        return rVarU;
    }

    @NotNull
    public static final r e(@NotNull Firebase firebase, @NotNull h app2) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
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
