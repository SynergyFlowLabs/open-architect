package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    public static final <T> T a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static /* synthetic */ void b(AtomicReference atomicReference) {
    }

    public static final <T> void c(@NotNull AtomicReference<T> atomicReference, @NotNull Function2<? super AtomicReference<T>, ? super T, Unit> function2) {
        while (true) {
            function2.invoke(atomicReference, (Object) a(atomicReference));
        }
    }

    public static final <T> void d(@NotNull AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }
}
