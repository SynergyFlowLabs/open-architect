package kotlinx.coroutines.flow.internal;

import kotlin.a1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {
    @a1
    public static final int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@NotNull a aVar, @NotNull Object obj) {
        if (aVar.f314480a != obj) {
            throw aVar;
        }
    }
}
