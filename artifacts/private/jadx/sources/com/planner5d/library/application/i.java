package com.planner5d.library.application;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.profile.ProfileNavigationFragment;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@fg.h
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f142560a = 0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f142562b;

        static {
            int[] iArr = new int[zc.a.values().length];
            try {
                iArr[zc.a.Google.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zc.a.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142561a = iArr;
            int[] iArr2 = new int[com.planner5d.library.model.payments.paymentmethod.e.a.values().length];
            try {
                iArr2[com.planner5d.library.model.payments.paymentmethod.e.a.Google.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.planner5d.library.model.payments.paymentmethod.e.a.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f142562b = iArr2;
        }
    }

    public static final class b implements com.planner5d.library.activity.fragment.j {
        b() {
        }

        @Override // com.planner5d.library.activity.fragment.j
        public void a(com.planner5d.library.activity.helper.event.content.a request) {
            Intrinsics.checkNotNullParameter(request, "request");
            com.planner5d.library.activity.helper.event.content.b.f136790a.a(request);
        }
    }

    /* synthetic */ class c implements com.planner5d.library.services.utility.a2, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f142563a = new c();

        c() {
        }

        @Override // com.planner5d.library.services.utility.a2
        public final long a() {
            return SystemClock.elapsedRealtime();
        }

        @Override // kotlin.jvm.internal.c0
        public final kotlin.x<?> b() {
            return new kotlin.jvm.internal.g0(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof com.planner5d.library.services.utility.a2) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final class d implements com.planner5d.library.model.manager.i2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.fragment.n f142564a;

        d(com.planner5d.library.activity.fragment.n nVar) {
            this.f142564a = nVar;
        }

        @Override // com.planner5d.library.model.manager.i2
        public Class<? extends FragmentController> a() {
            return this.f142564a.a();
        }

        @Override // com.planner5d.library.model.manager.i2
        public Class<? extends FragmentController> b() {
            return ProfileNavigationFragment.class;
        }
    }

    static final class e implements com.planner5d.library.model.payments.paymentmethod.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f142565c = new e();

        e() {
        }

        @Override // com.planner5d.library.model.payments.paymentmethod.a
        public final Object l(id.a aVar, com.planner5d.library.model.payments.a aVar2, boolean z10, kotlin.coroutines.d<? super com.planner5d.library.model.payments.paymentmethod.b> dVar) {
            return com.planner5d.library.model.payments.paymentmethod.b.ORDER_UNASSIGNED;
        }
    }

    /* synthetic */ class f implements com.planner5d.library.services.utility.g3, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f142566a = new f();

        f() {
        }

        @Override // kotlin.jvm.internal.c0
        public final kotlin.x<?> b() {
            return new kotlin.jvm.internal.g0(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // com.planner5d.library.services.utility.g3
        public final long currentTimeMillis() {
            return System.currentTimeMillis();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof com.planner5d.library.services.utility.g3) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(com.planner5d.library.model.manager.t1 t1Var, final String str, final Exception exc) {
        t1Var.v(new ij.c() { // from class: com.planner5d.library.application.g
            @Override // ij.c
            public final Object get() {
                return i.N0(str, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord N0(String str, Exception exc) {
        return new LogRecord("formatter", str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W() {
        return com.planner5d.library.api.f.a().f142273k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Exception n0(int i10, String[] strArr) {
        return new ErrorMessageException(i10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.e1 A(@NotNull com.planner5d.library.model.manager.c1 installationManager) {
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        return installationManager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.t3 A0() {
        return com.planner5d.library.model.manager.statistics.events.n1.f217163b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.o1 B(@NotNull com.planner5d.library.model.manager.n1 languageManager) {
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        return languageManager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.v3 B0() {
        return com.planner5d.library.model.manager.statistics.events.t1.f217463b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.licensing.a<?> C(@NotNull com.planner5d.library.application.d configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i10 = a.f142561a[configuration.d().ordinal()];
        if (i10 == 1) {
            return new com.planner5d.library.services.licensing.c();
        }
        if (i10 == 2) {
            return new com.planner5d.library.services.licensing.d();
        }
        throw new RuntimeException("Unsupported license checker");
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.y3 C0() {
        return com.planner5d.library.model.manager.statistics.events.l2.f217094b;
    }

    @fg.i
    @NotNull
    public final zc.b D(@NotNull com.planner5d.library.application.d applicationConfiguration) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        return applicationConfiguration;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.e4 D0() {
        return com.planner5d.library.model.manager.statistics.events.e3.f216873b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.database.model.h E(@NotNull com.planner5d.library.model.manager.favorite.room.a storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.d0 E0(@NotNull com.planner5d.library.model.manager.statistics.b0 statisticsManager) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        return statisticsManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.u1 F(@NotNull com.planner5d.library.model.manager.t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        return logRecordManager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.q4 F0(@NotNull com.planner5d.library.model.manager.p4 supportManagerData) {
        Intrinsics.checkNotNullParameter(supportManagerData, "supportManagerData");
        return supportManagerData;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.v G() {
        return com.planner5d.library.activity.helper.n.f137056a;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.z4 G0(@NotNull com.planner5d.library.model.manager.config.r supportUrlProvider) {
        Intrinsics.checkNotNullParameter(supportUrlProvider, "supportUrlProvider");
        return supportUrlProvider;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.w1 H(@NotNull com.planner5d.library.model.manager.managedfiles.a0 managedFileManager) {
        Intrinsics.checkNotNullParameter(managedFileManager, "managedFileManager");
        return managedFileManager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.utility.g3 H0() {
        return f.f142566a;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.y1 I() {
        return new com.planner5d.library.model.manager.y1();
    }

    @fg.i
    @NotNull
    public final le.o I0(@NotNull com.planner5d.library.interactor.n0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.c2 J(@NotNull com.planner5d.library.model.manager.b2 messageManager) {
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        return messageManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.widget.q1 J0() {
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        return new com.planner5d.library.widget.q1(dVarF != null ? Integer.valueOf(dVarF.f137146m) : null);
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.database.migration.h K() {
        return new com.planner5d.library.database.migration.h(gd.c.REGULAR.o());
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.m5 K0(@NotNull com.planner5d.library.model.manager.unlockeditems.b trialUnlockManager) {
        Intrinsics.checkNotNullParameter(trialUnlockManager, "trialUnlockManager");
        return trialUnlockManager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.utility.a2 L() {
        return c.f142563a;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.utility.p0.a L0(@NotNull final com.planner5d.library.model.manager.t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        return new com.planner5d.library.services.utility.p0.a() { // from class: com.planner5d.library.application.h
            @Override // com.planner5d.library.services.utility.p0.a
            public final void a(String str, Exception exc) {
                i.M0(logRecordManager, str, exc);
            }
        };
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.i2 M(@NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider) {
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        return new d(defaultFragmentProvider);
    }

    @fg.i
    @ij.f
    @NotNull
    public final okhttp3.b0 N() {
        return new okhttp3.b0.a().f();
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.payments.paymentmethod.a O(@NotNull com.planner5d.library.model.manager.q2 paymentMethodIdProvider, @NotNull fg.e<com.planner5d.library.model.manager.payments.j> paymentManager) {
        Intrinsics.checkNotNullParameter(paymentMethodIdProvider, "paymentMethodIdProvider");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        int i10 = a.f142562b[paymentMethodIdProvider.b().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return e.f142565c;
            }
            throw new kotlin.k0();
        }
        com.planner5d.library.model.manager.payments.j jVar = paymentManager.get();
        Intrinsics.checkNotNullExpressionValue(jVar, "get(...)");
        return jVar;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.n5 O0(@NotNull com.planner5d.library.model.manager.unlockeditems.d unlockedItemManager) {
        Intrinsics.checkNotNullParameter(unlockedItemManager, "unlockedItemManager");
        return unlockedItemManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.payments.k P(@NotNull com.planner5d.library.model.manager.payments.j paymentManager) {
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        return paymentManager;
    }

    @fg.i
    @NotNull
    public final na.b P0(@NotNull com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.payments.paymentmethod.e Q(@NotNull com.planner5d.library.model.manager.q2 paymentMethodIdProvider, @NotNull fg.e<com.planner5d.library.model.payments.paymentmethod.g> googlePlayInApp) {
        Intrinsics.checkNotNullParameter(paymentMethodIdProvider, "paymentMethodIdProvider");
        Intrinsics.checkNotNullParameter(googlePlayInApp, "googlePlayInApp");
        int i10 = a.f142562b[paymentMethodIdProvider.b().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new com.planner5d.library.model.payments.paymentmethod.k();
            }
            throw new kotlin.k0();
        }
        com.planner5d.library.model.payments.paymentmethod.g gVar = googlePlayInApp.get();
        Intrinsics.checkNotNullExpressionValue(gVar, "get(...)");
        return gVar;
    }

    @fg.i
    @NotNull
    public final na.c Q0(@NotNull com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.e interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.q2 R(@NotNull com.planner5d.library.application.d applicationConfiguration) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        return applicationConfiguration;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.bitmaploader.d.g R0() {
        return com.planner5d.library.services.download.o.f224287a;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.t2 S(@NotNull com.planner5d.library.model.manager.s2 paymentsManager) {
        Intrinsics.checkNotNullParameter(paymentsManager, "paymentsManager");
        return paymentsManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.h[] S0() {
        return new com.planner5d.library.h[]{new com.planner5d.library.contest.helper.c()};
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.y T(@NotNull com.planner5d.library.model.manager.n defaultPaywallService) {
        Intrinsics.checkNotNullParameter(defaultPaywallService, "defaultPaywallService");
        return defaultPaywallService;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.p5 T0(@NotNull com.planner5d.library.activity.helper.m2 uriViewer) {
        Intrinsics.checkNotNullParameter(uriViewer, "uriViewer");
        return uriViewer;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.performancetracing.e U() {
        return new com.planner5d.library.model.manager.performancetracing.e();
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.modules.user.user.a0 U0(@NotNull com.planner5d.library.modules.user.user.z userAvatar) {
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        return userAvatar;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.api.b V(@NotNull com.planner5d.library.api.support.b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b(new Function0() { // from class: com.planner5d.library.application.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.W();
            }
        });
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.u0 V0(@NotNull com.planner5d.library.modules.user.user.t0 userPurchases) {
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        return userPurchases;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.attributes.c W0(@NotNull com.planner5d.library.model.manager.config.attributes.a provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.z X(@NotNull com.planner5d.library.activity.fragment.dialog.y premiumFeaturesDialogLauncher) {
        Intrinsics.checkNotNullParameter(premiumFeaturesDialogLauncher, "premiumFeaturesDialogLauncher");
        return premiumFeaturesDialogLauncher;
    }

    @fg.i
    @ij.f
    @NotNull
    public final oa.f X0(@NotNull oa.d loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        return loader;
    }

    @fg.i
    @NotNull
    public final le.h Y(@NotNull com.planner5d.library.interactor.p interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final le.b Y0(@NotNull com.planner5d.library.interactor.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final na.a Z(@NotNull com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final le.f Z0(@NotNull com.planner5d.library.interactor.k interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final pa.c a0(@NotNull com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @NotNull
    public final le.g a1(@NotNull com.planner5d.library.interactor.m interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final cf.a b0(@NotNull com.planner5d.library.widget.editor.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final le.i b1(@NotNull com.planner5d.library.interactor.s interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.legal.model.manager.a c0() {
        return com.planner5d.library.legal.application.e.f180321b.a().i();
    }

    @fg.i
    @NotNull
    public final le.j c1(@NotNull com.planner5d.library.interactor.u interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.project.m0.a d0() {
        return new com.planner5d.library.model.manager.project.m0.a(50, 3, TimeUnit.HOURS.toMillis(1L));
    }

    @fg.i
    @NotNull
    public final le.l d1(@NotNull com.planner5d.library.interactor.h0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.a e(@NotNull com.planner5d.library.activity.helper.l0 helperPayment) {
        Intrinsics.checkNotNullParameter(helperPayment, "helperPayment");
        return helperPayment;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.v2 e0(@NotNull com.planner5d.library.application.d applicationConfiguration) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        return applicationConfiguration;
    }

    @fg.i
    @NotNull
    public final StatisticsEventAiDesigner e1() {
        return com.planner5d.library.model.manager.statistics.events.g.f216942b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.initialization.r.a f(@NotNull com.planner5d.library.activity.fragment.startup.a agreementChecker) {
        Intrinsics.checkNotNullParameter(agreementChecker, "agreementChecker");
        return agreementChecker;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.purchase.t f0(@NotNull ia.b paywallStrategy) {
        Intrinsics.checkNotNullParameter(paywallStrategy, "paywallStrategy");
        return paywallStrategy;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.l3 f1() {
        return com.planner5d.library.model.manager.statistics.events.r.f217359b;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.bitmaploader.cache.a g() {
        return new com.planner5d.library.services.bitmaploader.cache.a(com.planner5d.library.services.utility.h3.m() / ((long) 3));
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.w2 g0(@NotNull com.planner5d.library.model.manager.config.n purchasePlacementManager) {
        Intrinsics.checkNotNullParameter(purchasePlacementManager, "purchasePlacementManager");
        return purchasePlacementManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.m3 g1() {
        return com.planner5d.library.model.manager.statistics.events.t.f217459b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.builtin.l h(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        return builtInDataManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.k h0(@NotNull com.planner5d.library.model.manager.statistics.b0 statisticsManager) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        return statisticsManager;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.n3 h1() {
        return com.planner5d.library.model.manager.statistics.events.v.f217588b;
    }

    @fg.i
    @NotNull
    public final af.a i(@NotNull com.planner5d.library.widget.editor.popup.itemproperties.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.x2 i0(@NotNull com.planner5d.library.application.d applicationConfiguration) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        return applicationConfiguration;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.c4 i1() {
        return com.planner5d.library.model.manager.statistics.events.x2.f217661b;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.h j(@NotNull com.planner5d.library.model.manager.config.d configManager) {
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        return configManager;
    }

    @fg.i
    @NotNull
    public final ka.b j0(@NotNull com.planner5d.library.activity.fragment.feed.interactor.e interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.modules.user.user.w j1(@NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        return userAuthorization;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.activity.fragment.j k() {
        return new b();
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.e0 k0(@NotNull com.planner5d.library.model.region.h telephonyNetworkRegionProvider, @NotNull com.planner5d.library.model.region.j userProfileRegionProvider, @NotNull com.planner5d.library.model.region.f resourcesRegionProvider, @NotNull com.planner5d.library.model.region.b localeRegionProvider) {
        Intrinsics.checkNotNullParameter(telephonyNetworkRegionProvider, "telephonyNetworkRegionProvider");
        Intrinsics.checkNotNullParameter(userProfileRegionProvider, "userProfileRegionProvider");
        Intrinsics.checkNotNullParameter(resourcesRegionProvider, "resourcesRegionProvider");
        Intrinsics.checkNotNullParameter(localeRegionProvider, "localeRegionProvider");
        int i10 = 7 ^ 1;
        return new com.planner5d.library.model.region.a(telephonyNetworkRegionProvider, userProfileRegionProvider, resourcesRegionProvider, localeRegionProvider);
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.contest.view.b0 l(@NotNull com.planner5d.library.activity.fragment.l contestViewProvider) {
        Intrinsics.checkNotNullParameter(contestViewProvider, "contestViewProvider");
        return contestViewProvider;
    }

    @fg.i
    @NotNull
    public final le.k l0(@NotNull com.planner5d.library.interactor.f0 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.widget.editor.controls.a m() {
        return new com.planner5d.library.widget.editor.controls.b();
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.filedownloader.c.a m0() {
        return new com.planner5d.library.services.filedownloader.c.a() { // from class: com.planner5d.library.application.f
            @Override // com.planner5d.library.services.filedownloader.c.a
            public final Exception a(int i10, String[] strArr) {
                return i.n0(i10, strArr);
            }
        };
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.utility.t n() {
        return com.planner5d.library.services.utility.s.f229729a;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.k o(@NotNull com.planner5d.library.model.manager.crashreporting.l crashReporter) {
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        return crashReporter;
    }

    @fg.i
    @NotNull
    public final ka.c o0(@NotNull com.planner5d.library.activity.fragment.feed.interactor.g interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final le.a p(@NotNull com.planner5d.library.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.feed.usecase.b p0(@NotNull ic.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.uploadplan.g q(@NotNull com.planner5d.library.model.manager.uploadplan.d databaseRepository) {
        Intrinsics.checkNotNullParameter(databaseRepository, "databaseRepository");
        return databaseRepository;
    }

    @fg.i
    @NotNull
    public final ka.d q0(@NotNull com.planner5d.library.activity.fragment.feed.interactor.i interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final ma.a r(@NotNull com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @ij.f
    @NotNull
    public final SharedPreferences r0(@NotNull com.planner5d.library.application.b application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences(application.getApplicationContext().getPackageName() + "_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @fg.i
    @NotNull
    public final pa.b s(@NotNull com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.config.p s0(@NotNull com.planner5d.library.model.manager.config.sql.l manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return manager;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.w t(@NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        return featureConfigManager;
    }

    @fg.i
    @NotNull
    public final pa.d t0(@NotNull com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.service.b u(@NotNull com.planner5d.library.services.utility.f1 globalCoroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        return Build.VERSION.SDK_INT >= 35 ? new com.planner5d.library.services.service.c(globalCoroutineScope, coroutineDispatchers) : new com.planner5d.library.services.service.a();
    }

    @fg.i
    @NotNull
    public final pa.e u0(@NotNull com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.feed.usecase.a v(@NotNull com.planner5d.library.activity.fragment.feed.interactor.c interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.activity.fragment.smartwizard.v v0(@NotNull com.planner5d.library.activity.fragment.smartwizard.t interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.services.utility.f1 w() {
        return new com.planner5d.library.services.utility.k0(kotlinx.coroutines.f2.f314023a);
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.spaces.data.e w0(@NotNull com.planner5d.library.model.manager.spaces.b spacesManager) {
        Intrinsics.checkNotNullParameter(spacesManager, "spacesManager");
        return spacesManager;
    }

    @fg.i
    @NotNull
    public final le.d x(@NotNull com.planner5d.library.interactor.g interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.i3 x0() {
        return com.planner5d.library.model.manager.statistics.events.c.f216767b;
    }

    @fg.i
    @NotNull
    public final le.e y(@NotNull com.planner5d.library.interactor.i interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.j3 y0() {
        return com.planner5d.library.model.manager.statistics.events.e.f216850b;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.widget.editor.helper.o3 z(@NotNull com.planner5d.library.widget.editor.helper.n3 helperProjectPersistence) {
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        return helperProjectPersistence;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.statistics.events.r3 z0() {
        return com.planner5d.library.model.manager.statistics.events.j1.f216988b;
    }
}
