package com.planner5d.library.model.manager;

import android.content.Context;
import com.planner5d.library.activity.fragment.dialog.DialogWebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a5 implements x1, b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f180788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f180789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q4 f180790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c2 f180791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f180792g;

    @SourceDebugExtension({"SMAP\nSurveyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyManager.kt\ncom/planner5d/library/model/manager/SurveyManager$StartUrlLoadingListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1755#2,3:68\n*S KotlinDebug\n*F\n+ 1 SurveyManager.kt\ncom/planner5d/library/model/manager/SurveyManager$StartUrlLoadingListener\n*L\n26#1:68,3\n*E\n"})
    private static final class a implements DialogWebView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f180793a;

        public a(@NotNull List<String> closeUris) {
            Intrinsics.checkNotNullParameter(closeUris, "closeUris");
            this.f180793a = closeUris;
        }

        @Override // com.planner5d.library.activity.fragment.dialog.DialogWebView.d
        public void f2(@NotNull DialogWebView dialog, @NotNull String url) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(url, "url");
            List<String> list = this.f180793a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.V2(url, (String) it.next(), false, 2, null)) {
                    dialog.dismiss();
                    break;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SurveyManager", f = "SurveyManager.kt", i = {0, 0, 0, 1, 1}, l = {50, 51}, m = "canLaunchSurvey", n = {"this", "context", "surveyId", "this", "context"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180797d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180799f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180797d = obj;
            this.f180799f |= Integer.MIN_VALUE;
            return a5.this.i(0, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SurveyManager$launchSurveyIfNeeded$1", f = "SurveyManager.kt", i = {}, l = {37, 41, 45}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSurveyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyManager.kt\ncom/planner5d/library/model/manager/SurveyManager$launchSurveyIfNeeded$1\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n163#2,3:68\n167#2:72\n1#3:71\n1#3:76\n774#4:73\n865#4,2:74\n*S KotlinDebug\n*F\n+ 1 SurveyManager.kt\ncom/planner5d/library/model/manager/SurveyManager$launchSurveyIfNeeded$1\n*L\n37#1:68,3\n37#1:72\n37#1:71\n40#1:73\n40#1:74,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f180801b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f180803d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f180803d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a5.this.new c(this.f180803d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:46:0x00df  */
        /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:56:0x0105  */
        /* JADX WARN: Code duplicated, block: B:57:0x010d  */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
        
            if (r13.j(r1, r12) == r0) goto L60;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.a5.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SurveyManager", f = "SurveyManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.f160729t0}, m = "setSurveyViewed", n = {"surveyId"}, s = {"I$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f180807d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180809f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180807d = obj;
            this.f180809f |= Integer.MIN_VALUE;
            return a5.this.j(0, this);
        }
    }

    @ij.a
    public a5(@NotNull h configManager, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull q4 supportManagerDataService, @NotNull com.planner5d.library.services.utility.c2 networkStateUtility, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(supportManagerDataService, "supportManagerDataService");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f180788c = configManager;
        this.f180789d = preferences;
        this.f180790e = supportManagerDataService;
        this.f180791f = networkStateUtility;
        this.f180792g = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object i(int i10, Context context, kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        a5 a5Var;
        Context context2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f180799f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f180799f = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objK = bVar.f180797d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = bVar.f180799f;
        boolean z10 = false;
        if (i12 == 0) {
            ResultKt.m(objK);
            bVar.f180794a = this;
            bVar.f180795b = context;
            bVar.f180796c = i10;
            bVar.f180799f = 1;
            objK = k(bVar);
            if (objK != objL) {
            }
            return objL;
        }
        if (i12 == 1) {
            i10 = bVar.f180796c;
            context = (Context) bVar.f180795b;
            this = (a5) bVar.f180794a;
            ResultKt.m(objK);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context2 = (Context) bVar.f180795b;
            a5Var = (a5) bVar.f180794a;
            ResultKt.m(objK);
        }
        if (((Number) objK).intValue() >= 3 && Intrinsics.areEqual(a5Var.f180790e.a(context2), "en") && a5Var.f180791f.d(context2)) {
            z10 = true;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
        if (!((Set) objK).contains(String.valueOf(i10))) {
            com.planner5d.library.model.manager.config.p pVar = this.f180789d;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.sessions;
            bVar.f180794a = this;
            bVar.f180795b = context;
            bVar.f180799f = 2;
            objK = pVar.p(rVar, 0, bVar);
            if (objK != objL) {
                a5Var = this;
                context2 = context;
                if (((Number) objK).intValue() >= 3) {
                    z10 = true;
                }
            }
            return objL;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r2.A(r7, r9, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.planner5d.library.model.manager.a5.d
            if (r0 == 0) goto L17
            r0 = r9
            r0 = r9
            r6 = 7
            com.planner5d.library.model.manager.a5$d r0 = (com.planner5d.library.model.manager.a5.d) r0
            int r1 = r0.f180809f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r6 = 4
            int r1 = r1 - r2
            r6 = 4
            r0.f180809f = r1
            goto L1c
        L17:
            com.planner5d.library.model.manager.a5$d r0 = new com.planner5d.library.model.manager.a5$d
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f180807d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f180809f
            r3 = 2
            r4 = 1
            r6 = r4
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r9)
            goto L9a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "weooomrc/let tefaliue /vr/niubtcok/se  /o/eh/onr i "
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            int r8 = r0.f180804a
            r6 = 0
            java.lang.Object r7 = r0.f180806c
            r6 = 2
            com.planner5d.library.services.r r7 = (com.planner5d.library.services.r) r7
            java.lang.Object r2 = r0.f180805b
            com.planner5d.library.model.manager.config.p r2 = (com.planner5d.library.model.manager.config.p) r2
            r6 = 5
            kotlin.ResultKt.m(r9)
            r6 = 2
            goto L6b
        L4d:
            r6 = 1
            kotlin.ResultKt.m(r9)
            com.planner5d.library.model.manager.config.p r2 = r7.f180789d
            r6 = 4
            com.planner5d.library.services.r r9 = com.planner5d.library.services.r.surveyViewedIds
            r6 = 0
            r0.f180805b = r2
            r0.f180806c = r9
            r6 = 1
            r0.f180804a = r8
            r0.f180809f = r4
            java.lang.Object r7 = r7.k(r0)
            if (r7 != r1) goto L67
            goto L99
        L67:
            r5 = r9
            r5 = r9
            r9 = r7
            r7 = r5
        L6b:
            r6 = 5
            java.util.Set r9 = (java.util.Set) r9
            r6 = 2
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r6 = 1
            boolean r4 = r9.contains(r4)
            if (r4 == 0) goto L7b
            goto L8a
        L7b:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r6 = 2
            java.util.Set r8 = kotlin.collections.SetsKt.setOf(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r9 = kotlin.collections.SetsKt.plus(r9, r8)
        L8a:
            r8 = 0
            r6 = r8
            r0.f180805b = r8
            r0.f180806c = r8
            r0.f180809f = r3
            java.lang.Object r7 = r2.A(r7, r9, r0)
            r6 = 3
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.a5.j(int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(kotlin.coroutines.d<? super Set<String>> dVar) {
        return this.f180789d.i(com.planner5d.library.services.r.surveyViewedIds, new LinkedHashSet(), dVar);
    }

    @Override // com.planner5d.library.model.manager.b5
    public void a(@Nullable Context context) {
        if (context == null) {
            return;
        }
        int i10 = 6 ^ 2;
        kotlinx.coroutines.k.f(this.f180792g, com.planner5d.library.services.utility.s.f229729a.a(), null, new c(context, null), 2, null);
    }
}
