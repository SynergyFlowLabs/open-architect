package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314630a;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.z$a$a, reason: collision with other inner class name */
        public static final class C2297a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314631a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314633c;

            public C2297a(kotlin.coroutines.d<? super C2297a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314631a = obj;
                this.f314633c |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            this.f314630a = function2;
        }

        public Object c(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            h0.e(4);
            new C2297a(dVar);
            h0.e(5);
            this.f314630a.invoke(jVar, dVar);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objInvoke = this.f314630a.invoke(jVar, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
    }

    @oj.i(name = "checkContext")
    public static final void b(@NotNull final w<?> wVar, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(z.c(wVar, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == wVar.f314624c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + wVar.f314623b + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(w wVar, int i10, CoroutineContext.Element element) {
        CoroutineContext.b<?> key = element.getKey();
        CoroutineContext.Element element2 = wVar.f314623b.get(key);
        if (key != p2.M2) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        p2 p2Var = (p2) element2;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        p2 p2VarD = d((p2) element, p2Var);
        if (p2VarD == p2Var) {
            return p2Var == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p2VarD + ", expected child of " + p2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Nullable
    public static final p2 d(@Nullable p2 p2Var, @Nullable p2 p2Var2) {
        while (p2Var != null) {
            if (p2Var == p2Var2 || !(p2Var instanceof v0)) {
                return p2Var;
            }
            p2Var = ((v0) p2Var).getParent();
        }
        return null;
    }

    @a1
    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new a(function2);
    }
}
