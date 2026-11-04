package com.planner5d.library.activity.fragment.profile.about;

import android.content.Context;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e1 f134536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t2 f134537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f134538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w0<String> f134539d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.about.AboutViewModel$isUserFilled$1", f = "AboutViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f134542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f134543d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Boolean, Unit> function1, e eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f134542c = function1;
            this.f134543d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f134542c, this.f134543d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134541b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Boolean, Unit> function2 = this.f134542c;
                w wVar = this.f134543d.f134538c;
                this.f134540a = function2;
                this.f134541b = 1;
                Object objC = wVar.c(this);
                if (objC == objL) {
                    return objL;
                }
                obj = objC;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.f134540a;
                ResultKt.m(obj);
            }
            function1.invoke(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.about.AboutViewModel$loadPurchaseInformation$1", f = "AboutViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134545b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f134547d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.about.AboutViewModel$loadPurchaseInformation$1$1", f = "AboutViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f134548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f134549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f134550c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f134551d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Context context, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134550c = eVar;
                this.f134551d = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134550c, this.f134551d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f134549b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    String strA = this.f134550c.f134536a.a();
                    t2 t2Var = this.f134550c.f134537b;
                    Context context = this.f134551d;
                    long jA = x.a(this.f134550c.f134538c.a());
                    this.f134548a = strA;
                    this.f134549b = 1;
                    Object objB = t2Var.b(context, jA, this);
                    if (objB == objL) {
                        return objL;
                    }
                    obj = objB;
                    str = strA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f134548a;
                    ResultKt.m(obj);
                }
                return str + "<br/>" + obj;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f134547d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f134547d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134545b;
            if (i10 == 0) {
                ResultKt.m(obj);
                w0<String> w0VarX = e.this.X();
                Intrinsics.checkNotNull(w0VarX, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
                c1 c1Var2 = (c1) w0VarX;
                z1 z1VarW = s.f229729a.d();
                a aVar = new a(e.this, this.f134547d, null);
                this.f134544a = c1Var2;
                this.f134545b = 1;
                Object objH = i.h(z1VarW, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                obj = objH;
                c1Var = c1Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f134544a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public e(@NotNull e1 installationManager, @NotNull t2 paymentsManager, @NotNull w userAuthorization) {
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(paymentsManager, "paymentsManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f134536a = installationManager;
        this.f134537b = paymentsManager;
        this.f134538c = userAuthorization;
        this.f134539d = new c1();
    }

    @NotNull
    public final w0<String> X() {
        return this.f134539d;
    }

    @NotNull
    public final p2 Y(@NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z10 = false | false;
        return k.f(g2.a(this), null, null, new a(block, this, null), 3, null);
    }

    public final void Z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k.f(g2.a(this), null, null, new b(context, null), 3, null);
    }
}
