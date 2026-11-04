package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.b
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f305381b = "baggage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305382a;

    public e(@NotNull String str) {
        this.f305382a = str;
    }

    @Nullable
    public static e a(@NotNull d dVar, @Nullable List<String> list) {
        String strU = dVar.U(d.k(list, true, dVar.f305310h).t());
        if (strU.isEmpty()) {
            return null;
        }
        return new e(strU);
    }

    @NotNull
    public String b() {
        return f305381b;
    }

    @NotNull
    public String c() {
        return this.f305382a;
    }
}
