package io.ktor.util.debug;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nContextUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextUtils.kt\nio/ktor/util/debug/ContextUtilsKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,54:1\n374#2:55\n374#2:56\n374#2:57\n*S KotlinDebug\n*F\n+ 1 ContextUtils.kt\nio/ktor/util/debug/ContextUtilsKt\n*L\n21#1:55\n36#1:56\n52#1:57\n*E\n"})
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.ktor.util.debug.a$a, reason: collision with other inner class name */
    @f(c = "io.ktor.util.debug.ContextUtilsKt$addToContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class C2089a<T> extends o implements Function2<s0, d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<d<? super T>, Object> f296574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2089a(Function1<? super d<? super T>, ? extends Object> function1, d<? super C2089a> dVar) {
            super(2, dVar);
            this.f296574b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2089a(this.f296574b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296573a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<d<? super T>, Object> function1 = this.f296574b;
            this.f296573a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super T> dVar) {
            return ((C2089a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @f(c = "io.ktor.util.debug.ContextUtilsKt$initContextInDebugMode$2", f = "ContextUtils.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends o implements Function2<s0, d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<d<? super T>, Object> f296576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super d<? super T>, ? extends Object> function1, d<? super b> dVar) {
            super(2, dVar);
            this.f296576b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f296576b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296575a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Function1<d<? super T>, Object> function1 = this.f296576b;
            this.f296575a = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super T> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull String str, @NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> dVar) {
        return !c.f296577a.b() ? function1.invoke(dVar) : i.h(dVar.getContext().plus(new oi.a(str)), new C2089a(function1, null), dVar);
    }

    @Nullable
    public static final <T> Object b(@NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> dVar) {
        return !c.f296577a.b() ? function1.invoke(dVar) : i.h(dVar.getContext().plus(new oi.c(null, 1, null)), new b(function1, null), dVar);
    }

    @Nullable
    public static final <Element extends CoroutineContext.Element> Object c(@NotNull CoroutineContext.b<Element> bVar, @NotNull Function1<? super Element, Unit> function1, @NotNull d<? super Unit> dVar) {
        if (!c.f296577a.b()) {
            return Unit.f312394a;
        }
        CoroutineContext.Element element = dVar.getContext().get(bVar);
        if (element != null) {
            function1.invoke(element);
        }
        return Unit.f312394a;
    }
}
