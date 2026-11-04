package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f125058c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f125059d = "FirebaseSessions";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.h f125060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.google.firebase.sessions.settings.i f125061b;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {51, 55}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFirebaseSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n2632#2,3:85\n*S KotlinDebug\n*F\n+ 1 FirebaseSessions.kt\ncom/google/firebase/sessions/FirebaseSessions$1\n*L\n52#1:85,3\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f125062a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0 f125064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f125064c = y0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(y0 y0Var, String str, com.google.firebase.s sVar) {
            y0Var.a();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f125064c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        
            if (r7.f(r6) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f125062a
                java.lang.String r2 = "sasoFSsrsbsiieee"
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r5 = r3
                r4 = 6
                r4 = 1
                if (r1 == 0) goto L27
                r5 = 6
                if (r1 == r4) goto L23
                r5 = 5
                if (r1 != r3) goto L1a
                kotlin.ResultKt.m(r7)
                goto L78
            L1a:
                r5 = 2
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                kotlin.ResultKt.m(r7)
                goto L37
            L27:
                kotlin.ResultKt.m(r7)
                com.google.firebase.sessions.api.b r7 = com.google.firebase.sessions.api.b.f124853a
                r5 = 7
                r6.f125062a = r4
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L37
                r5 = 7
                goto L76
            L37:
                java.util.Map r7 = (java.util.Map) r7
                java.util.Collection r7 = r7.values()
                r5 = 1
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                r5 = 1
                boolean r1 = r7 instanceof java.util.Collection
                if (r1 == 0) goto L50
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                r5 = 3
                if (r1 == 0) goto L50
                goto La6
            L50:
                java.util.Iterator r7 = r7.iterator()
            L54:
                r5 = 5
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto La6
                java.lang.Object r1 = r7.next()
                com.google.firebase.sessions.api.c r1 = (com.google.firebase.sessions.api.c) r1
                boolean r1 = r1.a()
                r5 = 5
                if (r1 == 0) goto L54
                com.google.firebase.sessions.n r7 = com.google.firebase.sessions.n.this
                com.google.firebase.sessions.settings.i r7 = com.google.firebase.sessions.n.b(r7)
                r6.f125062a = r3
                java.lang.Object r7 = r7.f(r6)
                if (r7 != r0) goto L78
            L76:
                r5 = 6
                return r0
            L78:
                com.google.firebase.sessions.n r7 = com.google.firebase.sessions.n.this
                com.google.firebase.sessions.settings.i r7 = com.google.firebase.sessions.n.b(r7)
                r5 = 2
                boolean r7 = r7.c()
                r5 = 1
                if (r7 != 0) goto L92
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                r5 = 5
                int r6 = android.util.Log.d(r2, r6)
                r5 = 3
                kotlin.coroutines.jvm.internal.b.f(r6)
                goto Lb2
            L92:
                r5 = 4
                com.google.firebase.sessions.n r7 = com.google.firebase.sessions.n.this
                com.google.firebase.h r7 = com.google.firebase.sessions.n.a(r7)
                com.google.firebase.sessions.y0 r6 = r6.f125064c
                com.google.firebase.sessions.m r0 = new com.google.firebase.sessions.m
                r0.<init>()
                r7.h(r0)
                kotlin.Unit r6 = kotlin.Unit.f312394a
                goto Lb2
            La6:
                r5 = 0
                java.lang.String r6 = "gilm ss letiiNecNbrfsSnto nri bnsoeisve uye.lotcntse.o ssce"
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                kotlin.coroutines.jvm.internal.b.f(r6)
            Lb2:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            Object objL = com.google.firebase.q.c(com.google.firebase.d.f121972a).l(n.class);
            Intrinsics.checkNotNullExpressionValue(objL, "get(...)");
            return (n) objL;
        }

        private b() {
        }
    }

    @ij.a
    public n(@NotNull com.google.firebase.h firebaseApp, @NotNull com.google.firebase.sessions.settings.i settings, @d8.a @NotNull CoroutineContext backgroundDispatcher, @NotNull y0 sessionsActivityLifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f125060a = firebaseApp;
        this.f125061b = settings;
        Context applicationContext = firebaseApp.n().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to register lifecycle callbacks, unexpected context ");
            sb2.append(applicationContext.getClass());
            sb2.append('.');
        }
    }
}
