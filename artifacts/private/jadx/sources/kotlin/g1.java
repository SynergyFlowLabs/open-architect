package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class g1 {
    @kotlin.internal.f
    private static final Void a() {
        throw new l0(null, 1, null);
    }

    @kotlin.internal.f
    private static final Void b(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new l0("An operation is not implemented: " + reason);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final <T> T c(T t10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t10);
        return t10;
    }

    @kotlin.internal.f
    private static final <T> T d(T t10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t10);
        return t10;
    }

    @kotlin.internal.f
    private static final <T, R> R e(T t10, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t10);
    }

    @kotlin.internal.f
    private static final void f(int i10, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i11 = 0; i11 < i10; i11++) {
            action.invoke(Integer.valueOf(i11));
        }
    }

    @kotlin.internal.f
    private static final <T, R> R g(T t10, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t10);
    }

    @kotlin.internal.f
    private static final <R> R h(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke();
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final <T> T i(T t10, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final <T> T j(T t10, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return null;
        }
        return t10;
    }

    @kotlin.internal.f
    private static final <T, R> R k(T t10, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t10);
    }
}
