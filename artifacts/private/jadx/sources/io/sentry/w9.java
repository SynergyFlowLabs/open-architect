package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private e6 f307113a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private u4 f307114b = u4.AUTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f307115c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f307116d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f307117e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    protected String f307118f = p9.f306037s;

    @Nullable
    public String a() {
        return this.f307118f;
    }

    @NotNull
    public u4 b() {
        return this.f307114b;
    }

    @Nullable
    public e6 c() {
        return this.f307113a;
    }

    public boolean d() {
        return this.f307117e;
    }

    public boolean e() {
        return this.f307116d;
    }

    public boolean f() {
        return this.f307115c;
    }

    public void g(boolean z10) {
        this.f307117e = z10;
    }

    public void h(@Nullable String str) {
        this.f307118f = str;
    }

    public void i(@NotNull u4 u4Var) {
        this.f307114b = u4Var;
    }

    public void j(@Nullable e6 e6Var) {
        this.f307113a = e6Var;
    }

    public void k(boolean z10) {
        this.f307116d = z10;
    }

    public void l(boolean z10) {
        this.f307115c = z10;
    }
}
