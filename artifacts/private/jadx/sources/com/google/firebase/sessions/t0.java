package com.google.firebase.sessions;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSessionFirelogPublisher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n2632#2,3:130\n*S KotlinDebug\n*F\n+ 1 SessionFirelogPublisher.kt\ncom/google/firebase/sessions/SessionFirelogPublisherImpl\n*L\n99#1:130,3\n*E\n"})
public final class t0 implements s0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f125160g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f125161h = Math.random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.h f125162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.installations.k f125163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.settings.i f125164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final j f125165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f125166f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {70, 71, com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f125167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f125168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f125169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f125170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f125171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f125172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f125173g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ SessionDetails f125175i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionDetails sessionDetails, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f125175i = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t0.this.new b(this.f125175i, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            t0 t0Var;
            r0 r0Var;
            com.google.firebase.h hVar;
            SessionDetails sessionDetails;
            com.google.firebase.sessions.settings.i iVar;
            Object objC;
            b0 b0Var2;
            r0 r0Var2;
            SessionDetails sessionDetails2;
            com.google.firebase.sessions.settings.i iVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f125173g;
            if (i10 == 0) {
                ResultKt.m(obj);
                t0 t0Var2 = t0.this;
                this.f125173g = 1;
                obj = t0Var2.i(this);
                if (obj != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 == 2) {
                    ResultKt.m(obj);
                    b0Var = (b0) obj;
                    t0Var = t0.this;
                    r0Var = r0.f125074a;
                    hVar = t0Var.f125162b;
                    sessionDetails = this.f125175i;
                    iVar = t0.this.f125164d;
                    com.google.firebase.sessions.api.b bVar = com.google.firebase.sessions.api.b.f124853a;
                    this.f125167a = b0Var;
                    this.f125168b = t0Var;
                    this.f125169c = r0Var;
                    this.f125170d = hVar;
                    this.f125171e = sessionDetails;
                    this.f125172f = iVar;
                    this.f125173g = 3;
                    objC = bVar.c(this);
                    if (objC != objL) {
                        obj = objC;
                        b0Var2 = b0Var;
                        r0Var2 = r0Var;
                        sessionDetails2 = sessionDetails;
                        iVar2 = iVar;
                    }
                    return objL;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.firebase.sessions.settings.i iVar3 = (com.google.firebase.sessions.settings.i) this.f125172f;
                SessionDetails sessionDetails3 = (SessionDetails) this.f125171e;
                com.google.firebase.h hVar2 = (com.google.firebase.h) this.f125170d;
                r0 r0Var3 = (r0) this.f125169c;
                t0Var = (t0) this.f125168b;
                b0Var2 = (b0) this.f125167a;
                ResultKt.m(obj);
                iVar2 = iVar3;
                r0Var2 = r0Var3;
                sessionDetails2 = sessionDetails3;
                hVar = hVar2;
            }
            t0Var.g(r0Var2.a(hVar, sessionDetails2, iVar2, (Map) obj, b0Var2.b(), b0Var2.a()));
            return Unit.f312394a;
            if (((Boolean) obj).booleanValue()) {
                b0.a aVar = b0.f124878c;
                com.google.firebase.installations.k kVar = t0.this.f125163c;
                this.f125173g = 2;
                obj = aVar.a(kVar, this);
                if (obj != objL) {
                    b0Var = (b0) obj;
                    t0Var = t0.this;
                    r0Var = r0.f125074a;
                    hVar = t0Var.f125162b;
                    sessionDetails = this.f125175i;
                    iVar = t0.this.f125164d;
                    com.google.firebase.sessions.api.b bVar2 = com.google.firebase.sessions.api.b.f124853a;
                    this.f125167a = b0Var;
                    this.f125168b = t0Var;
                    this.f125169c = r0Var;
                    this.f125170d = hVar;
                    this.f125171e = sessionDetails;
                    this.f125172f = iVar;
                    this.f125173g = 3;
                    objC = bVar2.c(this);
                    if (objC != objL) {
                        obj = objC;
                        b0Var2 = b0Var;
                        r0Var2 = r0Var;
                        sessionDetails2 = sessionDetails;
                        iVar2 = iVar;
                        t0Var.g(r0Var2.a(hVar, sessionDetails2, iVar2, (Map) obj, b0Var2.b(), b0Var2.a()));
                    }
                }
                return objL;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 104}, m = "shouldLogSession", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f125176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f125177b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f125179d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f125177b = obj;
            this.f125179d |= Integer.MIN_VALUE;
            return t0.this.i(this);
        }
    }

    @ij.a
    public t0(@NotNull com.google.firebase.h firebaseApp, @NotNull com.google.firebase.installations.k firebaseInstallations, @NotNull com.google.firebase.sessions.settings.i sessionSettings, @NotNull j eventGDTLogger, @d8.a @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f125162b = firebaseApp;
        this.f125163c = firebaseInstallations;
        this.f125164d = sessionSettings;
        this.f125165e = eventGDTLogger;
        this.f125166f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(q0 q0Var) {
        try {
            this.f125165e.a(q0Var);
        } catch (RuntimeException unused) {
        }
    }

    private final boolean h() {
        return f125161h <= this.f125164d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r8.f(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.d<? super java.lang.Boolean> r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.t0.i(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.s0
    public void a(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(this.f125166f), null, null, new b(sessionDetails, null), 3, null);
    }
}
