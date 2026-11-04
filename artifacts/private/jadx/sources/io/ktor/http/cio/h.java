package io.ktor.http.cio;

import android.support.v4.media.session.PlaybackStateCompat;
import io.ktor.utils.io.l0;
import io.ktor.utils.io.o0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@o0
@SourceDebugExtension({"SMAP\nCIOMultipartDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOMultipartDataBase.kt\nio/ktor/http/cio/CIOMultipartDataBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class h implements io.ktor.http.content.r, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f295493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private io.ktor.http.content.c0 f295494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n0<w> f295495c;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "eventToData", n = {androidx.core.app.w.I0}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295497b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295499d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295497b = obj;
            this.f295499d |= Integer.MIN_VALUE;
            return h.this.m(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0, 1, 1}, l = {75, com.planner5d.library.engine.input.f.b.f160705l0}, m = "partToData", n = {"part", "part", "headers"}, s = {"L$0", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295502c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f295504e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295502c = obj;
            this.f295504e |= Integer.MIN_VALUE;
            return h.this.n(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {39, 45}, m = "readPart", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295505a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295507c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295505a = obj;
            this.f295507c |= Integer.MIN_VALUE;
            return h.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {51, 52}, m = "readPartSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295508a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295510c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295508a = obj;
            this.f295510c |= Integer.MIN_VALUE;
            return h.this.r(this);
        }
    }

    public h(@NotNull CoroutineContext coroutineContext, @NotNull io.ktor.utils.io.h channel, @NotNull CharSequence contentType, @Nullable Long l10, long j10) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f295493a = coroutineContext;
        this.f295495c = z.k(this, channel, contentType, l10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(w wVar, kotlin.coroutines.d<? super io.ktor.http.content.c0> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f295499d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f295499d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objN = aVar.f295497b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f295499d;
        try {
            if (i11 == 0) {
                ResultKt.m(objN);
                if (!(wVar instanceof w.b)) {
                    wVar.a();
                    return null;
                }
                aVar.f295496a = wVar;
                aVar.f295499d = 1;
                objN = n((w.b) wVar, aVar);
                if (objN == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objN);
            }
            return (io.ktor.http.content.c0) objN;
        } catch (Throwable th2) {
            wVar.a();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object n(final w.b bVar, kotlin.coroutines.d<? super io.ktor.http.content.c0> dVar) throws Exception {
        b bVar2;
        final w.b bVar3;
        q qVar;
        kotlinx.io.c0 c0Var;
        if (dVar instanceof b) {
            bVar2 = (b) dVar;
            int i10 = bVar2.f295504e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f295504e = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(dVar);
            }
        } else {
            bVar2 = new b(dVar);
        }
        Object objQ = bVar2.f295502c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f295504e;
        if (i11 == 0) {
            ResultKt.m(objQ);
            a1<q> a1VarD = bVar.d();
            bVar2.f295500a = bVar;
            bVar2.f295504e = 1;
            objQ = a1VarD.q(bVar2);
            if (objQ == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            bVar = (w.b) bVar2.f295500a;
            ResultKt.m(objQ);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) bVar2.f295501b;
            bVar3 = (w.b) bVar2.f295500a;
            ResultKt.m(objQ);
        }
        c0Var = (kotlinx.io.c0) objQ;
        try {
            io.ktor.http.content.c0.d dVar2 = new io.ktor.http.content.c0.d(l0.a(c0Var), new Function0() { // from class: io.ktor.http.cio.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.o(bVar3);
                }
            }, new io.ktor.http.cio.d(qVar));
            kotlin.jdk7.a.c(c0Var, null);
            return dVar2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(c0Var, th2);
                throw th3;
            }
        }
        q qVar2 = (q) objQ;
        CharSequence charSequenceF = qVar2.f(com.google.common.net.d.f119472a0);
        io.ktor.http.i iVarE = charSequenceF != null ? io.ktor.http.i.f295864d.e(charSequenceF.toString()) : null;
        String strC = iVarE != null ? iVarE.c("filename") : null;
        io.ktor.utils.io.h hVarC = bVar.c();
        if (strC != null) {
            return new io.ktor.http.content.c0.c(new Function0() { // from class: io.ktor.http.cio.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.p(bVar);
                }
            }, new Function0() { // from class: io.ktor.http.cio.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.q(bVar);
                }
            }, new io.ktor.http.cio.d(qVar2));
        }
        bVar2.f295500a = bVar;
        bVar2.f295501b = qVar2;
        bVar2.f295504e = 2;
        Object objI = io.ktor.utils.io.k.I(hVarC, bVar2);
        if (objI != objL) {
            bVar3 = bVar;
            qVar = qVar2;
            objQ = objI;
            c0Var = (kotlinx.io.c0) objQ;
            io.ktor.http.content.c0.d dVar3 = new io.ktor.http.content.c0.d(l0.a(c0Var), new Function0() { // from class: io.ktor.http.cio.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.o(bVar3);
                }
            }, new io.ktor.http.cio.d(qVar));
            kotlin.jdk7.a.c(c0Var, null);
            return dVar3;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(w.b bVar) throws InterruptedException {
        bVar.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h p(w.b bVar) {
        return bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(w.b bVar) throws InterruptedException {
        bVar.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: c0 -> 0x0067, PHI: r7
      0x0055: PHI (r7v2 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:22:0x0052, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {c0 -> 0x0067, blocks: (B:14:0x002f, B:27:0x0061, B:21:0x0047, B:24:0x0055, B:18:0x003f), top: B:33:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.d<? super io.ktor.http.content.c0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.http.cio.h.d
            if (r0 == 0) goto L15
            r0 = r7
            io.ktor.http.cio.h$d r0 = (io.ktor.http.cio.h.d) r0
            int r1 = r0.f295510c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r5 = 5
            r0.f295510c = r1
            goto L1b
        L15:
            r5 = 2
            io.ktor.http.cio.h$d r0 = new io.ktor.http.cio.h$d
            r0.<init>(r7)
        L1b:
            r5 = 2
            java.lang.Object r7 = r0.f295508a
            r5 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f295510c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            r5 = 5
            if (r2 == r4) goto L3f
            r5 = 2
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r7)     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r5 = 2
            goto L61
        L34:
            r5 = 6
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "vhlooi////nu/ceiot/efmreu/ we ecnkaire os/lbotot   "
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.ResultKt.m(r7)     // Catch: kotlinx.coroutines.channels.c0 -> L67
            goto L55
        L43:
            r5 = 1
            kotlin.ResultKt.m(r7)
        L47:
            r5 = 3
            kotlinx.coroutines.channels.n0<io.ktor.http.cio.w> r7 = r6.f295495c     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r0.f295510c = r4     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r5 = 4
            java.lang.Object r7 = r7.j(r0)     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r5 = 1
            if (r7 != r1) goto L55
            goto L60
        L55:
            io.ktor.http.cio.w r7 = (io.ktor.http.cio.w) r7     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r0.f295510c = r3     // Catch: kotlinx.coroutines.channels.c0 -> L67
            java.lang.Object r7 = r6.m(r7, r0)     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r5 = 1
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            io.ktor.http.content.c0 r7 = (io.ktor.http.content.c0) r7     // Catch: kotlinx.coroutines.channels.c0 -> L67
            r5 = 6
            if (r7 == 0) goto L47
            return r7
        L67:
            r6 = 0
            r5 = 2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.h.r(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:32:0x007d). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.r
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super io.ktor.http.content.c0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.http.cio.h.c
            if (r0 == 0) goto L17
            r0 = r7
            r0 = r7
            r5 = 2
            io.ktor.http.cio.h$c r0 = (io.ktor.http.cio.h.c) r0
            int r1 = r0.f295507c
            r5 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f295507c = r1
            r5 = 4
            goto L1d
        L17:
            r5 = 6
            io.ktor.http.cio.h$c r0 = new io.ktor.http.cio.h$c
            r0.<init>(r7)
        L1d:
            r5 = 2
            java.lang.Object r7 = r0.f295505a
            r5 = 4
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f295507c
            r3 = 2
            r4 = 1
            r5 = r5 | r4
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L35
            r5 = 5
            kotlin.ResultKt.m(r7)
            return r7
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            r5 = 4
            throw r6
        L3f:
            r5 = 3
            kotlin.ResultKt.m(r7)
            goto L7d
        L44:
            kotlin.ResultKt.m(r7)
            io.ktor.http.content.c0 r7 = r6.f295494b
            if (r7 == 0) goto L55
            kotlin.jvm.functions.Function0 r7 = r7.g()
            r5 = 5
            if (r7 == 0) goto L55
            r7.invoke()
        L55:
            r5 = 1
            kotlinx.coroutines.channels.n0<io.ktor.http.cio.w> r7 = r6.f295495c
            java.lang.Object r7 = r7.w()
            r5 = 6
            java.lang.Object r7 = kotlinx.coroutines.channels.t.h(r7)
            r5 = 1
            io.ktor.http.cio.w r7 = (io.ktor.http.cio.w) r7
            if (r7 != 0) goto L74
            r5 = 0
            r0.f295507c = r3
            r5 = 4
            java.lang.Object r6 = r6.r(r0)
            if (r6 != r1) goto L72
            r5 = 1
            goto L7c
        L72:
            r5 = 0
            return r6
        L74:
            r0.f295507c = r4
            java.lang.Object r7 = r6.m(r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r5 = 7
            io.ktor.http.content.c0 r7 = (io.ktor.http.content.c0) r7
            if (r7 == 0) goto L55
            r6.f295494b = r7
            r5 = 7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.h.c(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f295493a;
    }

    public /* synthetic */ h(CoroutineContext coroutineContext, io.ktor.utils.io.h hVar, CharSequence charSequence, Long l10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, hVar, charSequence, l10, (i10 & 16) != 0 ? PlaybackStateCompat.f9653i3 : j10);
    }
}
