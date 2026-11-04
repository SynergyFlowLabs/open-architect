package v2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@h
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<?>, i<?>> f381329a = new LinkedHashMap();

    public final <T extends f2> void a(@NotNull kotlin.reflect.d<T> clazz, @NotNull Function1<? super a, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (!this.f381329a.containsKey(clazz)) {
            this.f381329a.put(clazz, new i<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + w2.a.a(clazz) + '.').toString());
    }

    @NotNull
    public final j2.c b() {
        return w2.j.f385882a.a(this.f381329a.values());
    }
}
