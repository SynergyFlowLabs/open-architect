package com.google.firebase.sessions.settings;

import com.google.firebase.q;
import com.google.firebase.sessions.c0;
import com.google.firebase.sessions.n0;
import com.google.firebase.sessions.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f125129c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f125130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f125131b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a() {
            return ((o) q.c(com.google.firebase.d.f121972a).l(o.class)).a();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 99}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f125132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f125133b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f125135d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f125133b = obj;
            this.f125135d |= Integer.MIN_VALUE;
            return i.this.f(this);
        }
    }

    @ij.a
    public i(@c0 @NotNull n localOverrideSettings, @n0 @NotNull n remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f125130a = localOverrideSettings;
        this.f125131b = remoteSettings;
    }

    private final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean e(long j10) {
        return kotlin.time.c.y0(j10) && kotlin.time.c.t0(j10);
    }

    public final double a() {
        Double dA = this.f125130a.a();
        if (dA != null) {
            double dDoubleValue = dA.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dA2 = this.f125131b.a();
        if (dA2 != null) {
            double dDoubleValue2 = dA2.doubleValue();
            if (d(dDoubleValue2)) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    public final long b() {
        kotlin.time.c cVarD = this.f125130a.d();
        if (cVarD != null) {
            long jS0 = cVarD.S0();
            if (e(jS0)) {
                return jS0;
            }
        }
        kotlin.time.c cVarD2 = this.f125131b.d();
        if (cVarD2 != null) {
            long jS1 = cVarD2.S0();
            if (e(jS1)) {
                return jS1;
            }
        }
        kotlin.time.c.a aVar = kotlin.time.c.f313406b;
        return kotlin.time.e.m0(30, kotlin.time.f.MINUTES);
    }

    public final boolean c() {
        Boolean boolC = this.f125130a.c();
        if (boolC != null) {
            return boolC.booleanValue();
        }
        Boolean boolC2 = this.f125131b.c();
        if (boolC2 != null) {
            return boolC2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r6.b(r0) == r1) goto L21;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r5 = 3
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.i.b
            r5 = 3
            if (r0 == 0) goto L19
            r0 = r7
            r5 = 5
            com.google.firebase.sessions.settings.i$b r0 = (com.google.firebase.sessions.settings.i.b) r0
            int r1 = r0.f125135d
            r5 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 7
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r0.f125135d = r1
            r5 = 3
            goto L1f
        L19:
            com.google.firebase.sessions.settings.i$b r0 = new com.google.firebase.sessions.settings.i$b
            r5 = 7
            r0.<init>(r7)
        L1f:
            r5 = 7
            java.lang.Object r7 = r0.f125133b
            r5 = 3
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f125135d
            r3 = 2
            r4 = 1
            r5 = 5
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L42
            if (r2 != r3) goto L36
            kotlin.ResultKt.m(r7)
            goto L6a
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 2
            java.lang.String r7 = "oetmi otebilu/cf  /w/iocrveo lru/ k/ne///mhetroesn "
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 4
            throw r6
        L42:
            java.lang.Object r6 = r0.f125132a
            com.google.firebase.sessions.settings.i r6 = (com.google.firebase.sessions.settings.i) r6
            kotlin.ResultKt.m(r7)
            goto L5b
        L4a:
            kotlin.ResultKt.m(r7)
            com.google.firebase.sessions.settings.n r7 = r6.f125130a
            r0.f125132a = r6
            r0.f125135d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L5b
            r5 = 0
            goto L68
        L5b:
            com.google.firebase.sessions.settings.n r6 = r6.f125131b
            r7 = 0
            r0.f125132a = r7
            r0.f125135d = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L6a
        L68:
            r5 = 6
            return r1
        L6a:
            r5 = 1
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.i.f(kotlin.coroutines.d):java.lang.Object");
    }
}
