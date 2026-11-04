package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ga extends p9 {

    @NotNull
    public static final String Y = "<unlabeled transaction>";

    @NotNull
    private static final io.sentry.protocol.f0 Z = io.sentry.protocol.f0.CUSTOM;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final String f305499p0 = "default";
    private boolean X;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private String f305500t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.f0 f305501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private fa f305502w;

    public ga(@NotNull String str, @NotNull String str2) {
        this(str, str2, (fa) null);
    }

    @lm.a.c
    public static ga B(@NotNull m4 m4Var) {
        Boolean boolJ = m4Var.j();
        d dVarE = m4Var.e();
        return new ga(m4Var.i(), m4Var.h(), m4Var.f(), boolJ == null ? null : new fa(boolJ, dVarE.r(), m4Var.g()), dVarE);
    }

    @NotNull
    public String C() {
        return this.f305500t;
    }

    @Nullable
    public Boolean D() {
        fa faVar = this.f305502w;
        if (faVar != null) {
            return faVar.e();
        }
        boolean z10 = false | false;
        return null;
    }

    @Nullable
    public fa E() {
        return this.f305502w;
    }

    @NotNull
    public io.sentry.protocol.f0 F() {
        return this.f305501v;
    }

    public boolean G() {
        return this.X;
    }

    @lm.a.c
    public void H(boolean z10) {
        this.X = z10;
    }

    public void I(@NotNull String str) {
        this.f305500t = (String) io.sentry.util.y.c(str, "name is required");
    }

    public void J(@Nullable Boolean bool) {
        if (bool == null) {
            this.f305502w = null;
        } else {
            this.f305502w = new fa(bool);
        }
    }

    public void K(@Nullable Boolean bool, @Nullable Boolean bool2) {
        if (bool == null) {
            this.f305502w = null;
        } else if (bool2 == null) {
            this.f305502w = new fa(bool);
        } else {
            this.f305502w = new fa(bool, null, bool2, null);
        }
    }

    public void L(@NotNull io.sentry.protocol.f0 f0Var) {
        this.f305501v = f0Var;
    }

    @lm.a.c
    public ga(@NotNull String str, @NotNull io.sentry.protocol.f0 f0Var, @NotNull String str2) {
        this(str, f0Var, str2, null);
    }

    public ga(@NotNull String str, @NotNull String str2, @Nullable fa faVar) {
        this(str, io.sentry.protocol.f0.CUSTOM, str2, faVar);
    }

    @lm.a.c
    public ga(@NotNull String str, @NotNull io.sentry.protocol.f0 f0Var, @NotNull String str2, @Nullable fa faVar) {
        super(str2);
        this.X = false;
        this.f305500t = (String) io.sentry.util.y.c(str, "name is required");
        this.f305501v = f0Var;
        y(faVar);
        this.f306050m = io.sentry.util.o0.g(null, faVar);
    }

    @lm.a.c
    public ga(@NotNull io.sentry.protocol.v vVar, @NotNull v9 v9Var, @Nullable v9 v9Var2, @Nullable fa faVar, @Nullable d dVar) {
        super(vVar, v9Var, f305499p0, v9Var2, null);
        this.X = false;
        this.f305500t = Y;
        this.f305502w = faVar;
        this.f305501v = Z;
        this.f306050m = io.sentry.util.o0.g(dVar, faVar);
    }
}
