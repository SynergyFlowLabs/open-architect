package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public abstract class y<E, C extends Collection<? extends E>, B> extends x<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull KSerializer<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Iterator<E> e(@NotNull C c10) {
        Intrinsics.checkNotNullParameter(c10, "<this>");
        return c10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull C c10) {
        Intrinsics.checkNotNullParameter(c10, "<this>");
        return c10.size();
    }
}
