package com.planner5d.library.model.manager.initialization;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.modules.user.user.y0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class z implements x.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f191737m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.builtin.i> f191738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.l> f191739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f191740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.legal.model.manager.a> f191741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<k5> f191742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<f2> f191743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.j> f191744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg.e<y0> f191745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f191746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.payments.a0> f191747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f191749l;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f191750l = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.builtin.i> f191751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.l> f191752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.modules.user.user.t> f191753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.legal.model.manager.a> f191754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final fg.e<k5> f191755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final fg.e<f2> f191756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.payments.j> f191757g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final fg.e<y0> f191758h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.config.j> f191759i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.payments.a0> f191760j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f191761k;

        @ij.a
        public a(@NotNull fg.e<com.planner5d.library.model.manager.builtin.i> builtInDataManager, @NotNull fg.e<com.planner5d.library.model.manager.l> databaseManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull fg.e<com.planner5d.library.legal.model.manager.a> privacyManager, @NotNull fg.e<k5> textureManager, @NotNull fg.e<f2> metricUnitManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.j> paymentManager, @NotNull fg.e<y0> userRemember, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.a0> superwallPurchaseController, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter) {
            Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
            Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
            Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
            Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
            Intrinsics.checkNotNullParameter(textureManager, "textureManager");
            Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
            Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
            Intrinsics.checkNotNullParameter(userRemember, "userRemember");
            Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
            Intrinsics.checkNotNullParameter(superwallPurchaseController, "superwallPurchaseController");
            Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
            this.f191751a = builtInDataManager;
            this.f191752b = databaseManager;
            this.f191753c = userAuthorization;
            this.f191754d = privacyManager;
            this.f191755e = textureManager;
            this.f191756f = metricUnitManager;
            this.f191757g = paymentManager;
            this.f191758h = userRemember;
            this.f191759i = featureConfigManager;
            this.f191760j = superwallPurchaseController;
            this.f191761k = crashReporter;
        }

        @NotNull
        public final z a(@NotNull AtomicBoolean isFirstLaunch) {
            Intrinsics.checkNotNullParameter(isFirstLaunch, "isFirstLaunch");
            return new z(this.f191751a, this.f191752b, this.f191753c, this.f191754d, this.f191755e, this.f191756f, this.f191757g, this.f191758h, this.f191759i, this.f191760j, isFirstLaunch, this.f191761k);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationWorkWithUser", f = "InitializationWorkWithUser.kt", i = {0, 0, 1, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 72, com.planner5d.library.engine.input.f.b.f160725s, com.planner5d.library.engine.input.f.b.f160716p}, m = "execute", n = {"this", "start", "this", "start", "this", "start"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f191763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191764c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191766e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191764c = obj;
            this.f191766e |= Integer.MIN_VALUE;
            return z.this.a(this);
        }
    }

    public z(@NotNull fg.e<com.planner5d.library.model.manager.builtin.i> builtInDataManager, @NotNull fg.e<com.planner5d.library.model.manager.l> databaseManager, @NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull fg.e<com.planner5d.library.legal.model.manager.a> privacyManager, @NotNull fg.e<k5> textureManager, @NotNull fg.e<f2> metricUnitManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.j> paymentManager, @NotNull fg.e<y0> userRemember, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull fg.e<com.planner5d.library.model.manager.payments.a0> superwallPurchaseController, @NotNull AtomicBoolean isFirstLaunch, @NotNull fg.e<com.planner5d.library.model.manager.crashreporting.l> crashReporter) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userRemember, "userRemember");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(superwallPurchaseController, "superwallPurchaseController");
        Intrinsics.checkNotNullParameter(isFirstLaunch, "isFirstLaunch");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f191738a = builtInDataManager;
        this.f191739b = databaseManager;
        this.f191740c = userAuthorization;
        this.f191741d = privacyManager;
        this.f191742e = textureManager;
        this.f191743f = metricUnitManager;
        this.f191744g = paymentManager;
        this.f191745h = userRemember;
        this.f191746i = featureConfigManager;
        this.f191747j = superwallPurchaseController;
        this.f191748k = isFirstLaunch;
        this.f191749l = crashReporter;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
    
        if (kotlinx.coroutines.d1.b(r11, r0) == r1) goto L38;
     */
    @Override // com.planner5d.library.model.manager.initialization.x.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.initialization.z.a(kotlin.coroutines.d):java.lang.Object");
    }
}
