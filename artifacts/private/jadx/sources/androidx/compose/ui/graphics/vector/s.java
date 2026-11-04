package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.e0;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f38599a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f38600b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f38601c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f38602d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f38603e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f38604f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f38605g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f38606h = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f38608j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f38609k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f38610l = 4.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f38611m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f38612n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f38613o = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final List<h> f38607i = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f38614p = u3.f38256b.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f38615q = v3.f38275b.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f38616r = d0.f37693b.z();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f38617s = q0.f38131b.s();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f38618t = m2.f38048b.b();

    @NotNull
    public static final List<h> a(@NotNull Function1<? super f, Unit> function1) {
        f fVar = new f();
        function1.invoke(fVar);
        return fVar.f();
    }

    @NotNull
    public static final List<h> b(@Nullable String str) {
        return str == null ? f38607i : new j().c(str).g();
    }

    public static final int c() {
        return f38618t;
    }

    public static final int d() {
        return f38614p;
    }

    public static final int e() {
        return f38615q;
    }

    public static final int f() {
        return f38616r;
    }

    public static final long g() {
        return f38617s;
    }

    @NotNull
    public static final List<h> h() {
        return f38607i;
    }

    public static final boolean i(long j10, long j11) {
        return q0.I(j10) == q0.I(j11) && q0.G(j10) == q0.G(j11) && q0.C(j10) == q0.C(j11);
    }

    public static final boolean j(@Nullable r0 r0Var) {
        if (!(r0Var instanceof e0)) {
            return r0Var == null;
        }
        e0 e0Var = (e0) r0Var;
        int iB = e0Var.b();
        d0.a aVar = d0.f37693b;
        if (!d0.G(iB, aVar.z()) && !d0.G(e0Var.b(), aVar.B())) {
            return false;
        }
        return true;
    }

    public static final long k(long j10) {
        return q0.A(j10) == 1.0f ? j10 : q0.w(j10, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
