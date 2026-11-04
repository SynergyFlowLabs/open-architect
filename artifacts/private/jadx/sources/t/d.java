package t;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<K, V> f376161a;

    public d() {
        this(0, 0.0f, 3, null);
    }

    @Nullable
    public final V a(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f376161a.get(key);
    }

    @NotNull
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> setEntrySet = this.f376161a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f376161a.isEmpty();
    }

    @Nullable
    public final V d(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f376161a.put(key, value);
    }

    @Nullable
    public final V e(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f376161a.remove(key);
    }

    public d(int i10, float f10) {
        this.f376161a = new LinkedHashMap<>(i10, f10, true);
    }

    public /* synthetic */ d(int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull d<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        Intrinsics.checkNotNullParameter(original, "original");
        for (Map.Entry<? extends K, V> entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
