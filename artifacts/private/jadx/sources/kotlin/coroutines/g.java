package kotlin.coroutines;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    @s
    @e1(version = "1.3")
    @Nullable
    public static final <E extends CoroutineContext.Element> E a(@NotNull CoroutineContext.Element element, @NotNull CoroutineContext.b<E> key) {
        E e10;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof b)) {
            if (element.getKey() == key) {
                return element;
            }
            return null;
        }
        b bVar = (b) key;
        if (!bVar.a(element.getKey()) || (e10 = (E) bVar.b(element)) == null) {
            return null;
        }
        return e10;
    }

    @s
    @e1(version = "1.3")
    @NotNull
    public static final CoroutineContext b(@NotNull CoroutineContext.Element element, @NotNull CoroutineContext.b<?> key) {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2;
        Intrinsics.checkNotNullParameter(element, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof b)) {
            if (element.getKey() == key) {
                coroutineContext = element;
                coroutineContext = h.f312451a;
            }
            coroutineContext = element;
            return coroutineContext;
        }
        b bVar = (b) key;
        if (bVar.a(element.getKey()) && bVar.b(element) != null) {
            coroutineContext2 = element;
            coroutineContext2 = element;
            coroutineContext2 = h.f312451a;
        }
        coroutineContext2 = element;
        coroutineContext2 = element;
        coroutineContext2 = element;
        return coroutineContext2;
    }
}
