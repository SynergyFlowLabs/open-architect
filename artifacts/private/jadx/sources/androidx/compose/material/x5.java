package androidx.compose.material;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@u7
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x5<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25477b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<T, Float> f25478a = new LinkedHashMap();

    public final void a(T t10, float f10) {
        this.f25478a.put(t10, Float.valueOf(f10));
    }

    @NotNull
    public final Map<T, Float> b() {
        return this.f25478a;
    }
}
