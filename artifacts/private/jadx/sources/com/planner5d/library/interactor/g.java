package com.planner5d.library.interactor;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.gallery.Gallery;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.projects.z0;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.y1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHandleDeepLinkInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandleDeepLinkInteractor.kt\ncom/planner5d/library/interactor/HandleDeepLinkInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1863#2,2:267\n*S KotlinDebug\n*F\n+ 1 HandleDeepLinkInteractor.kt\ncom/planner5d/library/interactor/HandleDeepLinkInteractor\n*L\n151#1:267,2\n*E\n"})
public final class g implements le.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f180105t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f180106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.feed.b f180107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.e f180108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.n f180109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f180110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q0 f180111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.activity.fragment.projects.g f180112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final y1 f180113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.rate.g f180114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.startup.e f180115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final ia.b f180116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final r3 f180117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final e4 f180118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.a0 f180119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.b0 f180120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final z0 f180121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f180122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.h[] f180123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f180124s;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.interactor.HandleDeepLinkInteractor", f = "HandleDeepLinkInteractor.kt", i = {0, 0, 0, 2}, l = {com.planner5d.library.engine.input.f.b.f160696i0, 101, 151, 212}, m = "handle", n = {"this", "activity", "uri", "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180128d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180130f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180128d = obj;
            this.f180130f |= Integer.MIN_VALUE;
            return g.this.a(null, null, this);
        }
    }

    public static final class b extends com.planner5d.library.services.rx.e<com.planner5d.library.model.h> {
        b() {
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.model.h hVar) {
            com.planner5d.library.activity.fragment.x.g(g.this.f180110e, hVar != null ? new com.planner5d.library.activity.helper.event.content.d(hVar, new q0.d(hVar.f180739a), (com.planner5d.library.model.h) null, b4.c.url) : new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Gallery.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.snapshotsList).a()), false, 2, null);
        }
    }

    @ij.a
    public g(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.activity.fragment.feed.b autoStyleListProvider, @NotNull com.planner5d.library.activity.helper.e blogPostNavigation, @NotNull com.planner5d.library.activity.fragment.n defaultFragmentProvider, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull q0 galleryRecordManager, @Nullable com.planner5d.library.activity.fragment.projects.g gVar, @NotNull y1 menuManager, @NotNull com.planner5d.library.widget.rate.g rateUsManager, @NotNull com.planner5d.library.activity.fragment.startup.e oneLinkDeeplinkHandler, @NotNull ia.b paywallStrategy, @NotNull r3 statisticsEventGeneric, @NotNull e4 statisticsEventUploadPlan, @NotNull com.planner5d.library.model.manager.payments.a0 superwall, @NotNull com.planner5d.library.model.manager.payments.b0 superwallUseCase, @Nullable z0 z0Var, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.h[] uriProcessors, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(autoStyleListProvider, "autoStyleListProvider");
        Intrinsics.checkNotNullParameter(blogPostNavigation, "blogPostNavigation");
        Intrinsics.checkNotNullParameter(defaultFragmentProvider, "defaultFragmentProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(galleryRecordManager, "galleryRecordManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(rateUsManager, "rateUsManager");
        Intrinsics.checkNotNullParameter(oneLinkDeeplinkHandler, "oneLinkDeeplinkHandler");
        Intrinsics.checkNotNullParameter(paywallStrategy, "paywallStrategy");
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        Intrinsics.checkNotNullParameter(statisticsEventUploadPlan, "statisticsEventUploadPlan");
        Intrinsics.checkNotNullParameter(superwall, "superwall");
        Intrinsics.checkNotNullParameter(superwallUseCase, "superwallUseCase");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(uriProcessors, "uriProcessors");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f180106a = application;
        this.f180107b = autoStyleListProvider;
        this.f180108c = blogPostNavigation;
        this.f180109d = defaultFragmentProvider;
        this.f180110e = navigator;
        this.f180111f = galleryRecordManager;
        this.f180112g = gVar;
        this.f180113h = menuManager;
        this.f180114i = rateUsManager;
        this.f180115j = oneLinkDeeplinkHandler;
        this.f180116k = paywallStrategy;
        this.f180117l = statisticsEventGeneric;
        this.f180118m = statisticsEventUploadPlan;
        this.f180119n = superwall;
        this.f180120o = superwallUseCase;
        this.f180121p = z0Var;
        this.f180122q = userAuthorization;
        this.f180123r = uriProcessors;
        this.f180124s = dialogLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(g gVar, Uri uri, String str) {
        if (str != null) {
            gVar.i(uri);
        }
        return Unit.f312394a;
    }

    private final void f() {
        int i10 = 6 ^ 2;
        com.planner5d.library.activity.fragment.x.g(this.f180110e, new com.planner5d.library.activity.helper.event.content.c(this.f180109d.a(), (Bundle) null), false, 2, null);
    }

    private final void g(Activity activity) {
        if (!(activity instanceof androidx.appcompat.app.d) || this.f180121p == null) {
            return;
        }
        FragmentManager supportFragmentManager = ((androidx.appcompat.app.d) activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f180120o.a((androidx.fragment.app.s) activity, supportFragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a.ai_smart_wizard_a, null, new Function0() { // from class: com.planner5d.library.interactor.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.h(this.f180092a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(g gVar) {
        gVar.f180118m.S(false);
        oe.a aVar = new oe.a(gVar.f180121p.b(), new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.smartWizardPipeline, true).a());
        aVar.k(new com.planner5d.library.activity.helper.event.content.d(gVar.f180109d.a(), new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a()));
        gVar.f180110e.f(aVar, false);
        return Unit.f312394a;
    }

    private final void i(Uri uri) {
        com.planner5d.library.activity.fragment.x xVar = this.f180110e;
        String string = uri.toString();
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        com.planner5d.library.activity.fragment.x.g(xVar, new com.planner5d.library.activity.helper.event.content.d(string, string2, "", false, false, null).k(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a())), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0348, code lost:
    
        if (r12.i(r13, r0) == r1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e0, code lost:
    
        if (r15 == r1) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27, types: [com.planner5d.library.activity.helper.e] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.planner5d.library.interactor.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39, types: [com.planner5d.library.interactor.g] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.planner5d.library.widget.rate.g] */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.planner5d.library.application.b] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.planner5d.library.api.a0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // le.d
    @androidx.annotation.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.Nullable android.app.Activity r13, @org.jetbrains.annotations.NotNull final android.net.Uri r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.interactor.g.a(android.app.Activity, android.net.Uri, kotlin.coroutines.d):java.lang.Object");
    }
}
