package kotlin.coroutines.intrinsics;

import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class d extends c {
    @NotNull
    public static Object l() {
        return a.COROUTINE_SUSPENDED;
    }

    @e1(version = "1.3")
    public static /* synthetic */ void m() {
    }

    @e1(version = "1.3")
    @f
    private static final <T> Object n(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> dVar) {
        throw new l0("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
