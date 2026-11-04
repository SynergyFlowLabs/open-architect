package com.planner5d.library.services.utility;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCoroutineDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDispatchers.kt\ncom/planner5d/library/services/utility/CoroutineDispatchers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f229729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.a3 f229730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.a3 f229731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.z1 f229732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.z1 f229733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.z1 f229734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.z1 f229735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.f2 f229736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f229737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f229738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static volatile kotlinx.coroutines.n0 f229739k;

    static {
        s sVar = new s();
        f229729a = sVar;
        f229730b = kotlinx.coroutines.l1.e().R0();
        f229731c = kotlinx.coroutines.l1.e();
        f229732d = m(sVar, "background", 4, 0L, 4, null);
        f229733e = m(sVar, "worker", 16, 0L, 4, null);
        f229734f = m(sVar, "files", 1, 0L, 4, null);
        f229735g = m(sVar, "image-data", 1, 0L, 4, null);
        f229736h = kotlinx.coroutines.f2.f314023a;
        f229737i = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.services.utility.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.z();
            }
        });
        f229738j = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.services.utility.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.k();
            }
        });
        f229739k = sVar.y();
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.z1 k() {
        return m(f229729a, "concurrent-network", 4, 0L, 4, null);
    }

    private final kotlinx.coroutines.z1 l(String str, int i10, long j10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, j10, TimeUnit.SECONDS, new LinkedBlockingDeque(), new com.google.common.util.concurrent.y2().f("p5d-" + str + "-%d").b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return kotlinx.coroutines.b2.d(threadPoolExecutor);
    }

    static /* synthetic */ kotlinx.coroutines.z1 m(s sVar, String str, int i10, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j10 = 8;
        }
        return sVar.l(str, i10, j10);
    }

    private final kotlinx.coroutines.n0 o() {
        return (kotlinx.coroutines.n0) f229738j.getValue();
    }

    @kotlin.l(message = "Try removing once possible")
    public static /* synthetic */ void r() {
    }

    private static Object t(s sVar) {
        return kotlin.jvm.internal.j1.j(new kotlin.jvm.internal.t0(sVar, s.class, "selectedDispatcherNetwork", "getSelectedDispatcherNetwork()Lkotlinx/coroutines/CoroutineDispatcher;", 0));
    }

    private final kotlinx.coroutines.n0 y() {
        return (kotlinx.coroutines.n0) f229737i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.z1 z() {
        return m(f229729a, "sequential-network", 1, 0L, 4, null);
    }

    public final void A(boolean z10) {
        f229739k = z10 ? o() : y();
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    public kotlinx.coroutines.n0 b() {
        return f229739k;
    }

    @NotNull
    public final kotlinx.coroutines.n0 n() {
        return m(this, "single", 1, 0L, 4, null);
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.z1 h() {
        return f229732d;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.z1 c() {
        return f229735g;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.z1 f() {
        return f229734f;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.a3 e() {
        return f229731c;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.a3 a() {
        return f229730b;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.z1 d() {
        return f229733e;
    }

    @Override // com.planner5d.library.services.utility.t
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.f2 g() {
        return f229736h;
    }
}
