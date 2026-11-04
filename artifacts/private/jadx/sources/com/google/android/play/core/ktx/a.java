package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", f = "AppUpdateManagerKtx.kt", i = {}, l = {226}, m = "requestAppUpdateInfo", n = {}, s = {})
    static final class C1000a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f114904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f114905b;

        C1000a(kotlin.coroutines.d<? super C1000a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f114904a = obj;
            this.f114905b |= Integer.MIN_VALUE;
            return a.n(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<l0<? super com.google.android.play.core.ktx.c>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f114906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f114907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.android.play.core.appupdate.b f114908c;

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.a$b$a, reason: collision with other inner class name */
        static final class C1001a<TResult> implements com.google.android.gms.tasks.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0<com.google.android.play.core.ktx.c> f114909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.android.play.core.appupdate.b f114910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.google.android.play.core.ktx.b f114911c;

            /* JADX WARN: Multi-variable type inference failed */
            C1001a(l0<? super com.google.android.play.core.ktx.c> l0Var, com.google.android.play.core.appupdate.b bVar, com.google.android.play.core.ktx.b bVar2) {
                this.f114909a = l0Var;
                this.f114910b = bVar;
                this.f114911c = bVar2;
            }

            @Override // com.google.android.gms.tasks.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void b(com.google.android.play.core.appupdate.a updateInfo) {
                int iJ = updateInfo.j();
                if (iJ == 0) {
                    this.f114909a.F(new com.google.android.play.core.install.a(-2));
                    return;
                }
                if (iJ == 1) {
                    a.t(this.f114909a, com.google.android.play.core.ktx.c.d.f114929a);
                    o0.a.a(this.f114909a, null, 1, null);
                } else if (iJ == 2 || iJ == 3) {
                    Intrinsics.checkNotNullExpressionValue(updateInfo, "updateInfo");
                    if (updateInfo.e() == 11) {
                        a.t(this.f114909a, new com.google.android.play.core.ktx.c.b(this.f114910b));
                        o0.a.a(this.f114909a, null, 1, null);
                    } else {
                        this.f114910b.h(this.f114911c);
                        a.t(this.f114909a, new com.google.android.play.core.ktx.c.a(this.f114910b, updateInfo));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.google.android.play.core.ktx.a$b$b, reason: collision with other inner class name */
        static final class C1002b implements com.google.android.gms.tasks.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0<com.google.android.play.core.ktx.c> f114912a;

            /* JADX WARN: Multi-variable type inference failed */
            C1002b(l0<? super com.google.android.play.core.ktx.c> l0Var) {
                this.f114912a = l0Var;
            }

            @Override // com.google.android.gms.tasks.f
            public final void d(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f114912a.F(exception);
            }
        }

        static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.android.play.core.appupdate.b f114913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.android.play.core.ktx.b f114914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(com.google.android.play.core.appupdate.b bVar, com.google.android.play.core.ktx.b bVar2) {
                super(0);
                this.f114913a = bVar;
                this.f114914b = bVar2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f114913a.j(this.f114914b);
            }
        }

        static final class d implements com.google.android.play.core.install.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0<com.google.android.play.core.ktx.c> f114915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.google.android.play.core.appupdate.b f114916b;

            /* JADX WARN: Multi-variable type inference failed */
            d(l0<? super com.google.android.play.core.ktx.c> l0Var, com.google.android.play.core.appupdate.b bVar) {
                this.f114915a = l0Var;
                this.f114916b = bVar;
            }

            @Override // f7.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(@NotNull InstallState installState) {
                Intrinsics.checkNotNullParameter(installState, "installState");
                if (installState.c() == 11) {
                    a.t(this.f114915a, new com.google.android.play.core.ktx.c.b(this.f114916b));
                } else {
                    a.t(this.f114915a, new com.google.android.play.core.ktx.c.C1003c(installState));
                }
            }
        }

        static final class e extends kotlin.jvm.internal.l0 implements Function1<com.google.android.play.core.ktx.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0<com.google.android.play.core.ktx.c> f114917a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(l0<? super com.google.android.play.core.ktx.c> l0Var) {
                super(1);
                this.f114917a = l0Var;
            }

            public final void c(@NotNull com.google.android.play.core.ktx.b $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                o0.a.a(this.f114917a, null, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(com.google.android.play.core.ktx.b bVar) {
                c(bVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.android.play.core.appupdate.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f114908c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f114908c, dVar);
            bVar.f114907b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f114906a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f114907b;
                com.google.android.play.core.ktx.b bVar = new com.google.android.play.core.ktx.b(new d(l0Var, this.f114908c), new e(l0Var));
                this.f114908c.c().j(new C1001a(l0Var, this.f114908c, bVar)).g(new C1002b(l0Var));
                c cVar = new c(this.f114908c, bVar);
                this.f114906a = 1;
                if (j0.b(l0Var, cVar, this) == objL) {
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
        public final Object invoke(@NotNull l0<? super com.google.android.play.core.ktx.c> l0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f114918a = new c();

        c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f114919a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0) {
            super(1);
            this.f114919a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            this.f114919a.invoke();
        }
    }

    static final class e<TResult> implements com.google.android.gms.tasks.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f114920a;

        /* JADX WARN: Multi-variable type inference failed */
        e(n<? super T> nVar) {
            this.f114920a = nVar;
        }

        @Override // com.google.android.gms.tasks.g
        public final void b(T t10) {
            this.f114920a.resumeWith(Result.m785constructorimpl(t10));
        }
    }

    static final class f implements com.google.android.gms.tasks.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f114921a;

        /* JADX WARN: Multi-variable type inference failed */
        f(n<? super T> nVar) {
            this.f114921a = nVar;
        }

        @Override // com.google.android.gms.tasks.f
        public final void d(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f114921a.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    public static final long a(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.b();
    }

    public static final long b(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.a();
    }

    @Nullable
    public static final Integer c(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.c();
    }

    public static final boolean d(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        int iC = installState.c();
        if (iC != 0 && iC != 11) {
            int i10 = 5 ^ 5;
            if (iC != 5 && iC != 6) {
                return false;
            }
        }
        return true;
    }

    @e7.c
    public static final int e(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.b();
    }

    @e7.d
    public static final int f(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.e();
    }

    @e7.d
    public static final int g(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.c();
    }

    @NotNull
    public static final String h(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        String strD = installState.d();
        Intrinsics.checkNotNullExpressionValue(strD, "packageName()");
        return strD;
    }

    public static final long i(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.i();
    }

    public static final long j(@NotNull InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "<this>");
        return installState.e();
    }

    public static final int k(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.k();
    }

    public static final boolean l(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.f(0);
    }

    public static final boolean m(@NotNull com.google.android.play.core.appupdate.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.f(1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object n(@NotNull com.google.android.play.core.appupdate.b bVar, @NotNull kotlin.coroutines.d<? super com.google.android.play.core.appupdate.a> dVar) {
        C1000a c1000a;
        if (dVar instanceof C1000a) {
            c1000a = (C1000a) dVar;
            int i10 = c1000a.f114905b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1000a.f114905b = i10 - Integer.MIN_VALUE;
            } else {
                c1000a = new C1000a(dVar);
            }
        } else {
            c1000a = new C1000a(dVar);
        }
        Object objR = c1000a.f114904a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1000a.f114905b;
        if (i11 == 0) {
            ResultKt.m(objR);
            Task<com.google.android.play.core.appupdate.a> appUpdateInfo = bVar.c();
            Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "appUpdateInfo");
            c1000a.f114905b = 1;
            objR = r(appUpdateInfo, null, c1000a, 2, null);
            if (objR == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objR);
        }
        Intrinsics.checkNotNullExpressionValue(objR, "runTask(appUpdateInfo)");
        return objR;
    }

    @Nullable
    public static final Object o(@NotNull com.google.android.play.core.appupdate.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Task<Void> taskG = bVar.g();
        Intrinsics.checkNotNullExpressionValue(taskG, "completeUpdate()");
        Object objR = r(taskG, null, dVar, 2, null);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }

    @NotNull
    public static final i<com.google.android.play.core.ktx.c> p(@NotNull com.google.android.play.core.appupdate.b bVar) throws com.google.android.play.core.install.a {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return k.Y(k.t(new b(bVar, null)));
    }

    @Nullable
    public static final <T> Object q(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        pVar.e0(new d(function0));
        if (!task.t()) {
            task.j(new e(pVar));
            task.g(new f(pVar));
        } else if (task.u()) {
            pVar.resumeWith(Result.m785constructorimpl(task.q()));
        } else {
            Exception excP = task.p();
            Intrinsics.checkNotNull(excP);
            pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(excP)));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objU;
    }

    public static /* synthetic */ Object r(Task task, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = c.f114918a;
        }
        return q(task, function0, dVar);
    }

    public static final boolean s(@NotNull com.google.android.play.core.appupdate.b bVar, @NotNull com.google.android.play.core.appupdate.a appUpdateInfo, @NotNull final Fragment fragment, @NotNull com.google.android.play.core.appupdate.d options, int i10) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(options, "options");
        return bVar.d(appUpdateInfo, new com.google.android.play.core.common.a() { // from class: com.google.android.play.core.ktx.a.g
            @Override // com.google.android.play.core.common.a
            public final void a(@NotNull IntentSender p10, int i11, @Nullable Intent intent, int i12, int i13, int i14, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                fragment.startIntentSenderForResult(p10, i11, intent, i12, i13, i14, bundle);
            }
        }, options, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean t(@NotNull o0<? super E> o0Var, E e10) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        return t.m(o0Var.p(e10));
    }
}
