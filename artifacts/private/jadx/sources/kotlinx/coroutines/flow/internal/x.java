package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final pj.n<kotlinx.coroutines.flow.j<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> f314627a;

    /* synthetic */ class a extends g0 implements pj.n<kotlinx.coroutines.flow.j<? super Object>, Object, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314628a = new a();

        a() {
            super(3, kotlinx.coroutines.flow.j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<Object> jVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return jVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f314628a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f314627a = (pj.n) r1.q(aVar, 3);
    }

    private static /* synthetic */ void b() {
    }
}
