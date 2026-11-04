package io.sentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class w8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f307108d = "sentry-trace";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f307109e = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f307110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v9 f307111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Boolean f307112c;

    public w8(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @Nullable Boolean bool) {
        this.f307110a = vVar;
        this.f307111b = v9Var;
        this.f307112c = bool;
    }

    @NotNull
    public String a() {
        return f307108d;
    }

    @NotNull
    public v9 b() {
        return this.f307111b;
    }

    @NotNull
    public io.sentry.protocol.v c() {
        return this.f307110a;
    }

    @NotNull
    public String d() {
        Boolean bool = this.f307112c;
        if (bool != null) {
            return String.format("%s-%s-%s", this.f307110a, this.f307111b, bool.booleanValue() ? "1" : com.facebook.appevents.p.f99189d0);
        }
        return String.format("%s-%s", this.f307110a, this.f307111b);
    }

    @Nullable
    public Boolean e() {
        return this.f307112c;
    }

    public w8(@NotNull String str) throws io.sentry.exception.b {
        Matcher matcher = f307109e.matcher(str);
        if (!matcher.matches()) {
            throw new io.sentry.exception.b(str);
        }
        this.f307110a = new io.sentry.protocol.v(matcher.group(1));
        this.f307111b = new v9(matcher.group(2));
        String strGroup = matcher.group(3);
        this.f307112c = strGroup == null ? null : Boolean.valueOf("1".equals(strGroup.substring(1)));
    }
}
