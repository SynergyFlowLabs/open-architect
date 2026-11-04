package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42510b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f42511a = new LinkedHashMap();

    public final void a() {
        this.f42511a.clear();
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f42511a;
    }
}
