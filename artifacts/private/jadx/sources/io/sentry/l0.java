package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Pattern f305815b;

    public l0(@NotNull String str) {
        Pattern patternCompile;
        this.f305814a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            t5.R().b().getLogger().c(y7.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f305815b = patternCompile;
    }

    @NotNull
    public String a() {
        return this.f305814a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f305815b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f305814a, ((l0) obj).f305814a);
    }

    public int hashCode() {
        return Objects.hash(this.f305814a);
    }
}
