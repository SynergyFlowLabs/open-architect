package kotlinx.coroutines.rx2;

import com.facebook.internal.w0;
import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx2/RxChannelKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,91:1\n160#2:92\n94#2,3:93\n161#2,2:96\n101#2:98\n97#2,3:99\n94#2,3:102\n161#2,2:105\n101#2:107\n97#2,3:108\n160#2:111\n94#2,3:112\n161#2,2:115\n101#2:117\n97#2,3:118\n160#2:121\n94#2,3:122\n161#2,2:125\n101#2:127\n97#2,3:128\n*S KotlinDebug\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx2/RxChannelKt\n*L\n17#1:92\n17#1:93,3\n17#1:96,2\n17#1:98\n17#1:99,3\n17#1:102,3\n17#1:105,2\n17#1:107\n17#1:108,3\n26#1:111\n26#1:112,3\n26#1:115,2\n26#1:117\n26#1:118,3\n26#1:121\n26#1:122,3\n26#1:125,2\n26#1:127\n26#1:128,3\n*E\n"})
public final class k {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {96}, m = "collect", n = {w0.f100156c1, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f315372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315373e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315372d = obj;
            this.f315373e |= Integer.MIN_VALUE;
            return k.a(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {96}, m = "collect", n = {w0.f100156c1, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f315377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315378e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315377d = obj;
            this.f315378e |= Integer.MIN_VALUE;
            return k.b(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082 A[Catch: all -> 0x008d, TryCatch #4 {all -> 0x008d, blocks: (B:27:0x0078, B:29:0x0082, B:32:0x0090), top: B:52:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull io.reactivex.y<T> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r5 = 1
            boolean r0 = r8 instanceof kotlinx.coroutines.rx2.k.a
            r5 = 5
            if (r0 == 0) goto L18
            r0 = r8
            r5 = 5
            kotlinx.coroutines.rx2.k$a r0 = (kotlinx.coroutines.rx2.k.a) r0
            int r1 = r0.f315373e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2
            r3 = r1 & r2
            r5 = 6
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f315373e = r1
            goto L1d
        L18:
            kotlinx.coroutines.rx2.k$a r0 = new kotlinx.coroutines.rx2.k$a
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.f315372d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f315373e
            r3 = 7
            r3 = 1
            if (r2 == 0) goto L52
            if (r2 != r3) goto L49
            r5 = 0
            java.lang.Object r6 = r0.f315371c
            r5 = 7
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
            java.lang.Object r7 = r0.f315370b
            kotlinx.coroutines.channels.n0 r7 = (kotlinx.coroutines.channels.n0) r7
            java.lang.Object r2 = r0.f315369a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r5 = 2
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L46
            r4 = r0
            r4 = r0
            r0 = r7
            r7 = r2
            r7 = r2
        L42:
            r2 = r4
            r2 = r4
            r5 = 2
            goto L78
        L46:
            r6 = move-exception
            r5 = 0
            goto La6
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 3
            r6.<init>(r7)
            throw r6
        L52:
            kotlin.ResultKt.m(r8)
            kotlinx.coroutines.channels.n0 r6 = g(r6)
            kotlinx.coroutines.channels.r r8 = r6.iterator()     // Catch: java.lang.Throwable -> La1
            r4 = r8
            r8 = r6
            r8 = r6
            r6 = r4
            r6 = r4
        L62:
            r0.f315369a = r7     // Catch: java.lang.Throwable -> L9d
            r0.f315370b = r8     // Catch: java.lang.Throwable -> L9d
            r0.f315371c = r6     // Catch: java.lang.Throwable -> L9d
            r0.f315373e = r3     // Catch: java.lang.Throwable -> L9d
            r5 = 0
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L9d
            r5 = 1
            if (r2 != r1) goto L73
            return r1
        L73:
            r4 = r0
            r0 = r8
            r8 = r2
            r8 = r2
            goto L42
        L78:
            r5 = 5
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L8d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L8d
            r5 = 0
            if (r8 == 0) goto L90
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L8d
            r8 = r0
            r0 = r2
            goto L62
        L8d:
            r6 = move-exception
            r7 = r0
            goto La6
        L90:
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L8d
            kotlin.jvm.internal.h0.d(r3)
            r7 = 0
            kotlinx.coroutines.channels.v.b(r0, r7)
            kotlin.jvm.internal.h0.c(r3)
            return r6
        L9d:
            r6 = move-exception
            r7 = r8
            r5 = 5
            goto La6
        La1:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r7 = r6
            r6 = r4
        La6:
            r5 = 6
            throw r6     // Catch: java.lang.Throwable -> La8
        La8:
            r8 = move-exception
            kotlin.jvm.internal.h0.d(r3)
            r5 = 5
            kotlinx.coroutines.channels.v.b(r7, r6)
            r5 = 1
            kotlin.jvm.internal.h0.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.k.a(io.reactivex.y, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:27:0x007d, B:29:0x0086, B:32:0x0095), top: B:46:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:14:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull io.reactivex.g0<T> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r5 = 0
            boolean r0 = r8 instanceof kotlinx.coroutines.rx2.k.b
            if (r0 == 0) goto L19
            r0 = r8
            r5 = 2
            kotlinx.coroutines.rx2.k$b r0 = (kotlinx.coroutines.rx2.k.b) r0
            int r1 = r0.f315378e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 3
            r3 = r1 & r2
            r5 = 6
            if (r3 == 0) goto L19
            r5 = 5
            int r1 = r1 - r2
            r5 = 2
            r0.f315378e = r1
            goto L1e
        L19:
            kotlinx.coroutines.rx2.k$b r0 = new kotlinx.coroutines.rx2.k$b
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f315377d
            r5 = 3
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f315378e
            r5 = 5
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L49
            r5 = 4
            java.lang.Object r6 = r0.f315376c
            r5 = 1
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
            java.lang.Object r7 = r0.f315375b
            kotlinx.coroutines.channels.n0 r7 = (kotlinx.coroutines.channels.n0) r7
            java.lang.Object r2 = r0.f315374a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r5 = 3
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L46
            r4 = r0
            r4 = r0
            r0 = r7
            r7 = r2
        L43:
            r2 = r4
            r5 = 4
            goto L7d
        L46:
            r6 = move-exception
            r5 = 7
            goto Lae
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = 7
            java.lang.String r7 = "t sliloi/ rvsae// eeoifrenu//khocemncor/ew/ou/tt  b"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 3
            r6.<init>(r7)
            r5 = 0
            throw r6
        L56:
            kotlin.ResultKt.m(r8)
            kotlinx.coroutines.channels.n0 r6 = h(r6)
            kotlinx.coroutines.channels.r r8 = r6.iterator()     // Catch: java.lang.Throwable -> La9
            r4 = r8
            r8 = r6
            r6 = r4
            r6 = r4
        L65:
            r5 = 0
            r0.f315374a = r7     // Catch: java.lang.Throwable -> La4
            r5 = 0
            r0.f315375b = r8     // Catch: java.lang.Throwable -> La4
            r0.f315376c = r6     // Catch: java.lang.Throwable -> La4
            r0.f315378e = r3     // Catch: java.lang.Throwable -> La4
            r5 = 7
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> La4
            r5 = 2
            if (r2 != r1) goto L78
            return r1
        L78:
            r4 = r0
            r0 = r8
            r8 = r2
            r5 = 5
            goto L43
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L91
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L91
            r5 = 4
            if (r8 == 0) goto L95
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L91
            r5 = 5
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L91
            r8 = r0
            r0 = r2
            goto L65
        L91:
            r6 = move-exception
            r7 = r0
            r5 = 6
            goto Lae
        L95:
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.h0.d(r3)
            r5 = 3
            r7 = 0
            r5 = 4
            kotlinx.coroutines.channels.v.b(r0, r7)
            kotlin.jvm.internal.h0.c(r3)
            return r6
        La4:
            r6 = move-exception
            r7 = r8
            r7 = r8
            r5 = 0
            goto Lae
        La9:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
            r6 = r4
        Lae:
            r5 = 1
            throw r6     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r8 = move-exception
            kotlin.jvm.internal.h0.d(r3)
            kotlinx.coroutines.channels.v.b(r7, r6)
            kotlin.jvm.internal.h0.c(r3)
            r5 = 3
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.k.b(io.reactivex.g0, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object c(io.reactivex.y<T> yVar, Function1<? super T, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        n0 n0VarG = g(yVar);
        try {
            kotlinx.coroutines.channels.r it = n0VarG.iterator();
            while (true) {
                kotlin.jvm.internal.h0.e(3);
                kotlin.jvm.internal.h0.e(0);
                Object objC = it.c(null);
                kotlin.jvm.internal.h0.e(1);
                if (!((Boolean) objC).booleanValue()) {
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                    kotlinx.coroutines.channels.v.b(n0VarG, null);
                    kotlin.jvm.internal.h0.c(1);
                    return unit;
                }
                function1.invoke((Object) it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                kotlinx.coroutines.channels.v.b(n0VarG, th2);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
    }

    private static final <T> Object d(io.reactivex.g0<T> g0Var, Function1<? super T, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        n0 n0VarH = h(g0Var);
        try {
            kotlinx.coroutines.channels.r it = n0VarH.iterator();
            while (true) {
                kotlin.jvm.internal.h0.e(3);
                kotlin.jvm.internal.h0.e(0);
                Object objC = it.c(null);
                kotlin.jvm.internal.h0.e(1);
                if (!((Boolean) objC).booleanValue()) {
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                    kotlinx.coroutines.channels.v.b(n0VarH, null);
                    kotlin.jvm.internal.h0.c(1);
                    return unit;
                }
                function1.invoke((Object) it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                kotlinx.coroutines.channels.v.b(n0VarH, th2);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of Flow")
    public static final /* synthetic */ n0 e(io.reactivex.y yVar) {
        h0 h0Var = new h0();
        yVar.a(h0Var);
        return h0Var;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of Flow")
    public static final /* synthetic */ n0 f(io.reactivex.g0 g0Var) {
        h0 h0Var = new h0();
        g0Var.a(h0Var);
        return h0Var;
    }

    @a1
    @NotNull
    public static final <T> n0<T> g(@NotNull io.reactivex.y<T> yVar) {
        h0 h0Var = new h0();
        yVar.a(h0Var);
        return h0Var;
    }

    @a1
    @NotNull
    public static final <T> n0<T> h(@NotNull io.reactivex.g0<T> g0Var) {
        h0 h0Var = new h0();
        g0Var.a(h0Var);
        return h0Var;
    }
}
