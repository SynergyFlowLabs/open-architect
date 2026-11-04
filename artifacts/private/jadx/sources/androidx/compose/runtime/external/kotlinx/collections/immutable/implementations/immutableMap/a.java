package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35611a = 8;

    public abstract boolean c(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    public final boolean contains(@NotNull E e10) {
        if ((e10 != null ? e10 : null) == null) {
            return false;
        }
        return containsEntry(e10);
    }

    public final boolean remove(@NotNull E e10) {
        if ((e10 != null ? e10 : null) == null) {
            return false;
        }
        return c(e10);
    }
}
