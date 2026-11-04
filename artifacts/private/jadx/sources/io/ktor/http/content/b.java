package io.ktor.http.content;

import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f295684a = kotlin.g0.c(new Function0() { // from class: io.ktor.http.content.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.d();
        }
    });

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2", f = "BlockingBridge.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f295686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f295686b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f295686b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295685a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f295686b;
                this.f295685a = 1;
                if (function1.invoke(this) == objL) {
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

    private static final Method c() {
        return (Method) f295684a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method d() {
        Method method = null;
        try {
            method = Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
        } catch (Throwable unused) {
        }
        return method;
    }

    private static final boolean e() {
        boolean zAreEqual = false;
        try {
            Method methodC = c();
            if (methodC != null) {
                zAreEqual = Intrinsics.areEqual(methodC.invoke(null, null), Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
        return zAreEqual;
    }

    @Nullable
    public static final Object f(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (e()) {
            Object objInvoke = function1.invoke(dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
        Object objG = g(function1, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(l1.c(), new a(function1, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
