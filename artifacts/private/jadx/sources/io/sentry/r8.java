package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
@Deprecated
public final class r8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile r8 f306625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f306626c = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, p1> f306627a = new ConcurrentHashMap();

    private r8() {
    }

    @NotNull
    public static r8 b() {
        if (f306625b == null) {
            m1 m1VarA = f306626c.a();
            try {
                if (f306625b == null) {
                    f306625b = new r8();
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f306625b;
    }

    @Nullable
    public p1 a(@Nullable String str) {
        return this.f306627a.get(str);
    }

    @Nullable
    public p1 c(@Nullable String str) {
        return this.f306627a.remove(str);
    }

    public void d(@NotNull String str, @NotNull p1 p1Var) {
        this.f306627a.put(str, p1Var);
    }
}
