package androidx.savedstate;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class p {
    @a1
    @NotNull
    public static final <T> ArrayList<T> a(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
