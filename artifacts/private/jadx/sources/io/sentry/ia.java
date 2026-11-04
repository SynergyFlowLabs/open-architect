package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ia extends w9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @lm.a.c
    public static final long f305563n = 30000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private n f305564g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f305565h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f305566i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Long f305567j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Long f305568k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private ha f305569l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @lm.a.c
    @Nullable
    private q1 f305570m = null;

    public void A(@Nullable ha haVar) {
        this.f305569l = haVar;
    }

    public void B(boolean z10) {
        this.f305566i = z10;
    }

    @Nullable
    public n m() {
        return this.f305564g;
    }

    @lm.a.c
    @Nullable
    public Long n() {
        return this.f305568k;
    }

    @Nullable
    public Long o() {
        return this.f305567j;
    }

    @lm.a.c
    @Nullable
    public q1 p() {
        return this.f305570m;
    }

    @Nullable
    public ha q() {
        return this.f305569l;
    }

    @lm.a.c
    public boolean r() {
        return this.f305565h;
    }

    public boolean s() {
        return u4.ON == b();
    }

    public boolean t() {
        return this.f305566i;
    }

    @lm.a.c
    public void u(boolean z10) {
        this.f305565h = z10;
    }

    public void v(boolean z10) {
        i(z10 ? u4.ON : u4.OFF);
    }

    public void w(@Nullable n nVar) {
        this.f305564g = nVar;
    }

    @lm.a.c
    public void x(@Nullable Long l10) {
        this.f305568k = l10;
    }

    public void y(@Nullable Long l10) {
        this.f305567j = l10;
    }

    @lm.a.c
    public void z(@NotNull q1 q1Var) {
        this.f305570m = q1Var;
    }
}
