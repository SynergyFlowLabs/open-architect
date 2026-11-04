package com.google.firebase.sessions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f124878c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f124879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f124880b;

    public static final class a {

        /* JADX INFO: renamed from: com.google.firebase.sessions.b0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", i = {0, 1}, l = {31, 39}, m = "create", n = {"firebaseInstallations", "authToken"}, s = {"L$0", "L$0"})
        static final class C1188a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f124881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f124882b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f124884d;

            C1188a(kotlin.coroutines.d<? super C1188a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f124882b = obj;
                this.f124884d |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        
            if (r7 == r9) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [com.google.firebase.installations.k] */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.google.firebase.installations.k r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.google.firebase.sessions.b0> r9) {
            /*
                r7 = this;
                r6 = 0
                boolean r0 = r9 instanceof com.google.firebase.sessions.b0.a.C1188a
                r6 = 3
                if (r0 == 0) goto L18
                r0 = r9
                r6 = 7
                com.google.firebase.sessions.b0$a$a r0 = (com.google.firebase.sessions.b0.a.C1188a) r0
                int r1 = r0.f124884d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                r6 = 3
                if (r3 == 0) goto L18
                r6 = 3
                int r1 = r1 - r2
                r0.f124884d = r1
                goto L1d
            L18:
                com.google.firebase.sessions.b0$a$a r0 = new com.google.firebase.sessions.b0$a$a
                r0.<init>(r9)
            L1d:
                r6 = 2
                java.lang.Object r7 = r0.f124882b
                java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r0.f124884d
                r2 = 2
                r3 = 1
                r6 = 1
                java.lang.String r4 = ""
                java.lang.String r4 = ""
                r6 = 6
                if (r1 == 0) goto L51
                r6 = 4
                if (r1 == r3) goto L49
                if (r1 != r2) goto L3f
                java.lang.Object r8 = r0.f124881a
                r6 = 4
                java.lang.String r8 = (java.lang.String) r8
                r6 = 4
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Exception -> L99
                goto L91
            L3f:
                r6 = 7
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 1
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L49:
                java.lang.Object r8 = r0.f124881a
                com.google.firebase.installations.k r8 = (com.google.firebase.installations.k) r8
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Exception -> L78
                goto L6c
            L51:
                kotlin.ResultKt.m(r7)
                r7 = 0
                com.google.android.gms.tasks.Task r7 = r8.b(r7)     // Catch: java.lang.Exception -> L78
                r6 = 5
                java.lang.String r1 = "getToken(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch: java.lang.Exception -> L78
                r0.f124881a = r8     // Catch: java.lang.Exception -> L78
                r6 = 6
                r0.f124884d = r3     // Catch: java.lang.Exception -> L78
                java.lang.Object r7 = kotlinx.coroutines.tasks.e.m(r7, r0)     // Catch: java.lang.Exception -> L78
                if (r7 != r9) goto L6c
                r6 = 5
                goto L90
            L6c:
                com.google.firebase.installations.p r7 = (com.google.firebase.installations.p) r7     // Catch: java.lang.Exception -> L78
                r6 = 6
                java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> L78
                r5 = r8
                r8 = r7
                r7 = r5
                r6 = 6
                goto L7c
            L78:
                r7 = r8
                r7 = r8
                r8 = r4
                r8 = r4
            L7c:
                com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch: java.lang.Exception -> L99
                r6 = 1
                java.lang.String r1 = "getId(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch: java.lang.Exception -> L99
                r0.f124881a = r8     // Catch: java.lang.Exception -> L99
                r0.f124884d = r2     // Catch: java.lang.Exception -> L99
                java.lang.Object r7 = kotlinx.coroutines.tasks.e.m(r7, r0)     // Catch: java.lang.Exception -> L99
                if (r7 != r9) goto L91
            L90:
                return r9
            L91:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L99
                if (r7 != 0) goto L97
                r6 = 4
                goto L99
            L97:
                r4 = r7
                r4 = r7
            L99:
                com.google.firebase.sessions.b0 r7 = new com.google.firebase.sessions.b0
                r6 = 7
                r9 = 0
                r6 = 3
                r7.<init>(r4, r8, r9)
                r6 = 1
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b0.a.a(com.google.firebase.installations.k, kotlin.coroutines.d):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ b0(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String a() {
        return this.f124880b;
    }

    @NotNull
    public final String b() {
        return this.f124879a;
    }

    private b0(String str, String str2) {
        this.f124879a = str;
        this.f124880b = str2;
    }
}
