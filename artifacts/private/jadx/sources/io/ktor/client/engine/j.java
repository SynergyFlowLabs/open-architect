package io.ktor.client.engine;

import io.ktor.utils.io.r0;
import java.net.Proxy;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@r0
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f294340a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private n0 f294341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f294342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Proxy f294343d;

    @kotlin.l(level = kotlin.n.ERROR, message = "The [threadsCount] property is deprecated. Consider setting [dispatcher] instead.")
    public static /* synthetic */ void e() {
    }

    @Nullable
    public final n0 a() {
        return this.f294341b;
    }

    public final boolean b() {
        return this.f294342c;
    }

    @Nullable
    public final Proxy c() {
        return this.f294343d;
    }

    public final int d() {
        return this.f294340a;
    }

    public final void f(@Nullable n0 n0Var) {
        this.f294341b = n0Var;
    }

    public final void g(boolean z10) {
        this.f294342c = z10;
    }

    public final void h(@Nullable Proxy proxy) {
        this.f294343d = proxy;
    }

    public final void i(int i10) {
        this.f294340a = i10;
    }
}
