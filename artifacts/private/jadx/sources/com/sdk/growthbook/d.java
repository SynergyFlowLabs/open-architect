package com.sdk.growthbook;

import com.sdk.growthbook.model.q;
import com.sdk.growthbook.network.i;
import com.sdk.growthbook.utils.j;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f266173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Function2<? super Boolean, ? super j, Unit> f266174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private rf.a f266175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Function2<? super String, ? super com.sdk.growthbook.model.j, Unit> f266176o;

    /* JADX INFO: Access modifiers changed from: private */
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<e, Unit> f266177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private e f266178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Function0<Unit> f266179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f266180d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull final d dVar, @NotNull com.sdk.growthbook.model.d gbContext, Function1<? super e, Unit> onResult) {
            Intrinsics.checkNotNullParameter(gbContext, "gbContext");
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            this.f266180d = dVar;
            this.f266177a = onResult;
            this.f266179c = new Function0() { // from class: com.sdk.growthbook.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d.a.e(this.f266170a);
                }
            };
            this.f266178b = new e(gbContext, new Function2() { // from class: com.sdk.growthbook.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.a.c(dVar, this, ((Boolean) obj).booleanValue(), (j) obj2);
                }
            }, dVar.h(), null, null, dVar.f266173l, 24, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(d dVar, a aVar, boolean z10, j jVar) {
            Function2 function2 = dVar.f266174m;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(z10), jVar);
            }
            if (jVar != null && dVar.c()) {
                System.out.println((Object) ("GrowthBook error: " + jVar.a()));
            }
            Function0<Unit> function0 = aVar.f266179c;
            if (function0 != null) {
                function0.invoke();
            }
            aVar.f266179c = null;
            aVar.f266178b = null;
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(a aVar) {
            e eVar = aVar.f266178b;
            if (eVar != null) {
                aVar.f266177a.invoke(eVar);
            }
            return Unit.f312394a;
        }

        @Nullable
        public final e d() {
            return this.f266178b;
        }

        public final void f(@Nullable e eVar) {
            this.f266178b = eVar;
        }
    }

    public /* synthetic */ d(String str, String str2, i iVar, Map map, String str3, Function2 function2, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, iVar, map, (i10 & 16) != 0 ? null : str3, function2, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? true : z12);
    }

    public static /* synthetic */ d B(d dVar, rf.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new rf.b(null, pf.c.f350184a.a(), 1, null);
        }
        return dVar.A(aVar);
    }

    private final com.sdk.growthbook.model.d u() {
        String strA = a();
        boolean zD = d();
        Map<String, q> mapB = b();
        String strG = g();
        boolean zI = i();
        Map<String, Integer> mapF = f();
        Function2<com.sdk.growthbook.model.f, com.sdk.growthbook.model.g, Unit> function2K = k();
        Function2<? super String, ? super com.sdk.growthbook.model.j, Unit> function2 = this.f266176o;
        return new com.sdk.growthbook.model.d(strA, strG, zD, e(), mapB, mapF, null, null, this.f266175n, zI, function2K, function2, j(), c(), null, 16576, null);
    }

    public static /* synthetic */ d y(d dVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "gbStickyBuckets__";
        }
        return dVar.x(str);
    }

    @NotNull
    public final d A(@NotNull rf.a stickyBucketService) {
        Intrinsics.checkNotNullParameter(stickyBucketService, "stickyBucketService");
        this.f266175n = stickyBucketService;
        return this;
    }

    @Override // com.sdk.growthbook.h
    @NotNull
    public e l() {
        com.sdk.growthbook.model.d dVarU = u();
        if (c() && !this.f266173l) {
            of.e.a().b("calling #initialize with caching\ndisabled will cause feature values nulls. We recommend to enable\ncaching or calling method #initialize with callback");
        }
        return new e(dVarU, this.f266174m, h(), null, null, this.f266173l, 24, null);
    }

    public final void v(@NotNull Function1<? super e, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        new a(this, u(), onResult);
    }

    @NotNull
    public final d w(@NotNull Function2<? super String, ? super com.sdk.growthbook.model.j, Unit> featureUsageCallback) {
        Intrinsics.checkNotNullParameter(featureUsageCallback, "featureUsageCallback");
        this.f266176o = featureUsageCallback;
        return this;
    }

    @NotNull
    public final d x(@NotNull String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f266175n = new rf.b(prefix, pf.c.f350184a.a());
        return this;
    }

    @NotNull
    public final d z(@NotNull Function2<? super Boolean, ? super j, Unit> refreshHandler) {
        Intrinsics.checkNotNullParameter(refreshHandler, "refreshHandler");
        this.f266174m = refreshHandler;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String apiKey, @NotNull String hostURL, @NotNull i networkDispatcher, @NotNull Map<String, ? extends q> attributes, @Nullable String str, @NotNull Function2<? super com.sdk.growthbook.model.f, ? super com.sdk.growthbook.model.g, Unit> trackingCallback, boolean z10, boolean z11, boolean z12) {
        super(apiKey, hostURL, attributes, trackingCallback, str, networkDispatcher, z10, z11);
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(hostURL, "hostURL");
        Intrinsics.checkNotNullParameter(networkDispatcher, "networkDispatcher");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(trackingCallback, "trackingCallback");
        this.f266173l = z12;
    }
}
