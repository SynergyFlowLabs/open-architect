package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28983c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Locale f28984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f28985b = new LinkedHashMap();

    public k1(@NotNull Locale locale) {
        this.f28984a = locale;
    }

    public static /* synthetic */ String d(k1 k1Var, j1 j1Var, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = k1Var.f28984a;
        }
        return k1Var.b(j1Var, str, locale);
    }

    public static /* synthetic */ String e(k1 k1Var, o1 o1Var, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = k1Var.f28984a;
        }
        return k1Var.c(o1Var, str, locale);
    }

    public static /* synthetic */ v1 h(k1 k1Var, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i10 & 1) != 0) {
            locale = k1Var.f28984a;
        }
        return k1Var.g(locale);
    }

    @NotNull
    public abstract String a(long j10, @NotNull String str, @NotNull Locale locale);

    @NotNull
    public final String b(@NotNull j1 j1Var, @NotNull String str, @NotNull Locale locale) {
        return n1.b(j1Var.v(), str, locale, this.f28985b);
    }

    @NotNull
    public final String c(@NotNull o1 o1Var, @NotNull String str, @NotNull Locale locale) {
        return n1.b(o1Var.m(), str, locale, this.f28985b);
    }

    @NotNull
    public abstract j1 f(long j10);

    @NotNull
    public abstract v1 g(@NotNull Locale locale);

    public abstract int i(@NotNull j1 j1Var);

    public abstract int j();

    @NotNull
    public final Map<String, Object> k() {
        return this.f28985b;
    }

    @NotNull
    public final Locale l() {
        return this.f28984a;
    }

    @NotNull
    public abstract o1 m(int i10, int i11);

    @NotNull
    public abstract o1 n(long j10);

    @NotNull
    public abstract o1 o(@NotNull j1 j1Var);

    @NotNull
    public abstract j1 p();

    @NotNull
    public abstract List<Pair<String, String>> q();

    @NotNull
    public abstract o1 r(@NotNull o1 o1Var, int i10);

    @Nullable
    public abstract j1 s(@NotNull String str, @NotNull String str2, @NotNull Locale locale);

    @NotNull
    public abstract o1 t(@NotNull o1 o1Var, int i10);
}
