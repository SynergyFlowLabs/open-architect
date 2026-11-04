package lj;

import java.util.concurrent.CancellationException;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class a {
    @e1(version = "1.4")
    @f
    private static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @e1(version = "1.4")
    @f
    private static final CancellationException b(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? th2.toString() : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @e1(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
