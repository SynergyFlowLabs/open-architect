package com.planner5d.library.uploadplan.view.dialog;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.v1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRecognitionFailedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionFailedViewModel.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionFailedViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class l extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f230953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ke.c f230954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f230955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.uploadplan.view.dialog.a f230956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.source.l f230957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u1 f230958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n1 f230959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f230960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c2 f230961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f230962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final m2 f230963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f230964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f230965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final v1.a<String> f230966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f230967o;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionFailedViewModel$checkRecognitionQueue$1", f = "RecognitionFailedViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230968a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230968a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(true));
                com.planner5d.library.uploadplan.view.dialog.a aVar = l.this.f230956d;
                this.f230968a = 1;
                obj = aVar.a(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                l lVar = l.this;
                if (bool.booleanValue()) {
                    lVar.k0().o(kotlin.coroutines.jvm.internal.b.a(false));
                    lVar.f230953a.c(RecognitionInProgressDialog.class).g();
                } else {
                    lVar.k0().o(kotlin.coroutines.jvm.internal.b.a(true));
                }
            }
            l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionFailedViewModel$clearFailedTasks$1", f = "RecognitionFailedViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230970a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f230972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f230972c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(this.f230972c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f230970a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    ke.c cVar = l.this.f230954b;
                    this.f230970a = 1;
                    if (cVar.a(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (com.planner5d.library.api.e unused) {
                l.this.p0();
            }
            this.f230972c.invoke();
            l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionFailedViewModel", f = "RecognitionFailedViewModel.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "getUploadPlanFailedSupportLink", n = {"this"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f230974b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f230976d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f230974b = obj;
            this.f230976d |= Integer.MIN_VALUE;
            return l.this.l0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionFailedViewModel$navigateSupportPage$1", f = "RecognitionFailedViewModel.kt", i = {}, l = {49, com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRecognitionFailedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionFailedViewModel.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionFailedViewModel$navigateSupportPage$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f230978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            int i10 = 1 & 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            if (kotlinx.coroutines.d1.b(1000, r11) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
        
            if (kotlinx.coroutines.d1.b(1000, r11) == r0) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.uploadplan.view.dialog.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.uploadplan.view.dialog.RecognitionFailedViewModel$reUpload$1", f = "RecognitionFailedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230980a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f230980a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                l.this.d0();
            } catch (com.planner5d.library.api.e unused) {
                l.this.p0();
            }
            l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull ke.c clearFailedTasksUseCase, @NotNull b2 messageManager, @NotNull com.planner5d.library.uploadplan.view.dialog.a checkUploadQueueHelper, @NotNull com.planner5d.library.model.manager.config.source.l serverConfigs, @NotNull u1 logRecordManagerService, @NotNull n1 languageManager, @NotNull com.planner5d.library.application.b application, @NotNull c2 networkStateUtility, @NotNull ErrorMessageParser errorMessageParser, @NotNull m2 uriViewer) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(clearFailedTasksUseCase, "clearFailedTasksUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(checkUploadQueueHelper, "checkUploadQueueHelper");
        Intrinsics.checkNotNullParameter(serverConfigs, "serverConfigs");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(uriViewer, "uriViewer");
        this.f230953a = dialogLauncher;
        this.f230954b = clearFailedTasksUseCase;
        this.f230955c = messageManager;
        this.f230956d = checkUploadQueueHelper;
        this.f230957e = serverConfigs;
        this.f230958f = logRecordManagerService;
        this.f230959g = languageManager;
        this.f230960h = application;
        this.f230961i = networkStateUtility;
        this.f230962j = errorMessageParser;
        this.f230963k = uriViewer;
        v1 v1Var = v1.f229769a;
        this.f230964l = v1Var.j(null);
        this.f230965m = v1Var.j(null);
        this.f230966n = v1Var.j(null);
        this.f230967o = new c1<>(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p2 d0() {
        return kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    private final String g0(JSONObject jSONObject, String str) {
        int i10 = 1 << 0;
        if (jSONObject.has(str)) {
            return k1.z(jSONObject, str, null, 4, null);
        }
        if (!jSONObject.has(this.f230959g.i())) {
            return null;
        }
        String strI = this.f230959g.i();
        Intrinsics.checkNotNullExpressionValue(strI, "getLanguageDefault(...)");
        return k1.z(jSONObject, strI, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object l0(kotlin.coroutines.d<? super String> dVar) throws Throwable {
        c cVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f230976d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f230976d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objO = cVar.f230974b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f230976d;
        boolean z10 = true | true;
        if (i11 == 0) {
            ResultKt.m(objO);
            com.planner5d.library.model.manager.config.source.l lVar = this.f230957e;
            cVar.f230973a = this;
            cVar.f230976d = 1;
            objO = lVar.o(cVar);
            if (objO == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (l) cVar.f230973a;
            ResultKt.m(objO);
        }
        JSONObject jSONObject4 = (JSONObject) objO;
        if (jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject(com.planner5d.library.services.r.support.f224891a)) == null || (jSONObject2 = jSONObject.getJSONObject(com.planner5d.library.services.r.knowledgebase.f224891a)) == null || (jSONObject3 = jSONObject2.getJSONObject(com.planner5d.library.services.r.aiUploadPlanFailed.f224891a)) == null) {
            return null;
        }
        String strA = this.f230959g.a(this.f230960h);
        Intrinsics.checkNotNullExpressionValue(strA, "getLanguage(...)");
        return this.g0(jSONObject3, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        this.f230967o.o(Boolean.FALSE);
        b2 b2Var = this.f230955c;
        ErrorMessageException errorMessageExceptionCreateNetworkException = ErrorMessageException.createNetworkException();
        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNetworkException, "createNetworkException(...)");
        b2Var.r(errorMessageExceptionCreateNetworkException);
    }

    public final void f0(@NotNull Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.f230967o.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(onFinished, null), 3, null);
    }

    @NotNull
    public final v1.a<Boolean> h0() {
        return this.f230964l;
    }

    @NotNull
    public final c1<Boolean> i0() {
        return this.f230967o;
    }

    @NotNull
    public final v1.a<String> j0() {
        return this.f230966n;
    }

    @NotNull
    public final v1.a<Boolean> k0() {
        return this.f230965m;
    }

    @NotNull
    public final m2 m0() {
        return this.f230963k;
    }

    public final void n0() {
        if (this.f230961i.d(this.f230960h)) {
            this.f230967o.r(Boolean.TRUE);
            kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.b(), null, new d(null), 2, null);
        } else {
            b2 b2Var = this.f230955c;
            ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
            Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
            b2Var.r(errorMessageExceptionCreateNoInternetException);
        }
    }

    public final void o0() {
        this.f230967o.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(null), 3, null);
    }
}
