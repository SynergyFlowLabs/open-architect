package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Boolean f305439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f305440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Double f305441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Boolean f305442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Double f305443e;

    public fa(@NotNull Boolean bool) {
        this(bool, null);
    }

    @Nullable
    public Double a() {
        return this.f305443e;
    }

    @NotNull
    public Boolean b() {
        return this.f305442d;
    }

    @Nullable
    public Double c() {
        return this.f305441c;
    }

    @Nullable
    public Double d() {
        return this.f305440b;
    }

    @NotNull
    public Boolean e() {
        return this.f305439a;
    }

    public fa(@NotNull Boolean bool, @Nullable Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public fa(@NotNull Boolean bool, @Nullable Double d10, @Nullable Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public fa(@NotNull Boolean bool, @Nullable Double d10, @NotNull Boolean bool2, @Nullable Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public fa(@NotNull Boolean bool, @Nullable Double d10, @Nullable Double d11, @NotNull Boolean bool2, @Nullable Double d12) {
        this.f305439a = bool;
        this.f305440b = d10;
        this.f305441c = d11;
        this.f305442d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f305443e = d12;
    }
}
