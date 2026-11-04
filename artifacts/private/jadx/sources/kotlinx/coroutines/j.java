package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final /* synthetic */ class j {
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    public static final <T> T a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) throws InterruptedException {
        s1 s1VarA;
        CoroutineContext coroutineContextK;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(kotlin.coroutines.e.K2);
        if (eVar == null) {
            s1VarA = t3.f315643a.b();
            coroutineContextK = l0.k(f2.f314023a, coroutineContext.plus(s1VarA));
        } else {
            s1 s1Var = eVar instanceof s1 ? (s1) eVar : null;
            if (s1Var == null) {
                s1VarA = t3.f315643a.a();
            } else {
                s1 s1Var2 = s1Var.w1() ? s1Var : null;
                if (s1Var2 == null) {
                    s1VarA = t3.f315643a.a();
                } else {
                    s1VarA = s1Var2;
                }
            }
            coroutineContextK = l0.k(f2.f314023a, coroutineContext);
        }
        g gVar = new g(coroutineContextK, threadCurrentThread, s1VarA);
        gVar.h2(u0.DEFAULT, gVar, function2);
        return (T) gVar.i2();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return i.f(coroutineContext, function2);
    }
}
