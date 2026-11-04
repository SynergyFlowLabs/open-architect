package kotlinx.coroutines.channels;

import com.facebook.internal.w0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.a1;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,204:1\n94#1,8:205\n160#1:213\n94#1,3:214\n161#1,2:217\n101#1:219\n97#1,3:220\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n160#1:205,8\n192#1:213\n192#1:214,3\n192#1:217,2\n192#1:219\n192#1:220,3\n*E\n"})
final /* synthetic */ class x {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {161}, m = "consumeEach", n = {w0.f100156c1, "$this$consume$iv"}, s = {"L$0", "L$1"})
    static final class a<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313911e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313910d = obj;
            this.f313911e |= Integer.MIN_VALUE;
            return x.c(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {209}, m = "toList", n = {"$this$toList_u24lambda_u242", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    static final class b<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313917f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313916e = obj;
            this.f313917f |= Integer.MIN_VALUE;
            return v.g0(null, this);
        }
    }

    @a1
    public static final void a(@NotNull n0<?> n0Var, @Nullable Throwable th2) {
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = x1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        n0Var.e(cancellationExceptionA);
    }

    public static final <E, R> R b(@NotNull n0<? extends E> n0Var, @NotNull Function1<? super n0<? extends E>, ? extends R> function1) {
        try {
            R rInvoke = function1.invoke(n0Var);
            kotlin.jvm.internal.h0.d(1);
            v.b(n0Var, null);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                v.b(n0Var, th2);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0036, B:25:0x006a, B:27:0x0073, B:21:0x0054, B:28:0x007d), top: B:41:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:25:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.n0<? extends E> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.x.a
            if (r0 == 0) goto L15
            r0 = r8
            r5 = 4
            kotlinx.coroutines.channels.x$a r0 = (kotlinx.coroutines.channels.x.a) r0
            int r1 = r0.f313911e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f313911e = r1
            r5 = 5
            goto L1c
        L15:
            r5 = 7
            kotlinx.coroutines.channels.x$a r0 = new kotlinx.coroutines.channels.x$a
            r5 = 5
            r0.<init>(r8)
        L1c:
            r5 = 5
            java.lang.Object r8 = r0.f313910d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f313911e
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.f313909c
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
            java.lang.Object r7 = r0.f313908b
            kotlinx.coroutines.channels.n0 r7 = (kotlinx.coroutines.channels.n0) r7
            java.lang.Object r2 = r0.f313907a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r5 = 5
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L3c
            r5 = 1
            goto L6a
        L3c:
            r6 = move-exception
            goto L8f
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "imsrn oo ciohet/cs/  /onuteti/ee/e b/lrlrafkev o/w/"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L48:
            kotlin.ResultKt.m(r8)
            kotlinx.coroutines.channels.r r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
            r8 = r4
        L54:
            r5 = 7
            r0.f313907a = r8     // Catch: java.lang.Throwable -> L3c
            r0.f313908b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f313909c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f313911e = r3     // Catch: java.lang.Throwable -> L3c
            r5 = 7
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L65
            return r1
        L65:
            r4 = r2
            r4 = r2
            r2 = r8
            r2 = r8
            r8 = r4
        L6a:
            r5 = 3
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L3c
            r8 = r2
            r5 = 7
            goto L54
        L7d:
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L3c
            kotlin.jvm.internal.h0.d(r3)
            r8 = 0
            r8 = 0
            kotlinx.coroutines.channels.v.b(r7, r8)
            kotlin.jvm.internal.h0.c(r3)
            return r6
        L8b:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r8 = move-exception
            kotlin.jvm.internal.h0.d(r3)
            kotlinx.coroutines.channels.v.b(r7, r6)
            kotlin.jvm.internal.h0.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x.c(kotlinx.coroutines.channels.n0, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <E> Object d(n0<? extends E> n0Var, Function1<? super E, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        try {
            r<? extends E> it = n0Var.iterator();
            while (true) {
                kotlin.jvm.internal.h0.e(3);
                kotlin.jvm.internal.h0.e(0);
                int i10 = 7 ^ 0;
                Object objC = it.c(null);
                kotlin.jvm.internal.h0.e(1);
                if (!((Boolean) objC).booleanValue()) {
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                    v.b(n0Var, null);
                    kotlin.jvm.internal.h0.c(1);
                    return unit;
                }
                function1.invoke(it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                v.b(n0Var, th2);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.h e(n0 n0Var) {
        Intrinsics.checkNotNull(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return n0Var.v();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object f(n0 n0Var, kotlin.coroutines.d dVar) {
        Intrinsics.checkNotNull(n0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return n0Var.z(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:13:0x003a, B:27:0x0072, B:29:0x007c, B:30:0x0087), top: B:48:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006e -> B:27:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.n0<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<? extends E>> r9) {
        /*
            r7 = 6
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.x.b
            if (r0 == 0) goto L15
            r0 = r9
            kotlinx.coroutines.channels.x$b r0 = (kotlinx.coroutines.channels.x.b) r0
            int r1 = r0.f313917f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r7 = 7
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f313917f = r1
            goto L1a
        L15:
            kotlinx.coroutines.channels.x$b r0 = new kotlinx.coroutines.channels.x$b
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f313916e
            r7 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f313917f
            r3 = 1
            r7 = r7 & r3
            if (r2 == 0) goto L4b
            r7 = 4
            if (r2 != r3) goto L42
            java.lang.Object r8 = r0.f313915d
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.r) r8
            java.lang.Object r2 = r0.f313914c
            kotlinx.coroutines.channels.n0 r2 = (kotlinx.coroutines.channels.n0) r2
            java.lang.Object r4 = r0.f313913b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f313912a
            java.util.List r5 = (java.util.List) r5
            r7 = 5
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L3f
            goto L72
        L3f:
            r8 = move-exception
            r9 = r2
            goto L99
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 0
            r8.<init>(r9)
            throw r8
        L4b:
            kotlin.ResultKt.m(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlinx.coroutines.channels.r r2 = r8.iterator()     // Catch: java.lang.Throwable -> L95
            r4 = r9
            r4 = r9
            r5 = r4
            r9 = r8
            r8 = r2
        L5b:
            r0.f313912a = r5     // Catch: java.lang.Throwable -> L93
            r0.f313913b = r4     // Catch: java.lang.Throwable -> L93
            r7 = 3
            r0.f313914c = r9     // Catch: java.lang.Throwable -> L93
            r0.f313915d = r8     // Catch: java.lang.Throwable -> L93
            r0.f313917f = r3     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L93
            r7 = 3
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r6 = r2
            r2 = r9
            r2 = r9
            r9 = r6
        L72:
            r7 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3f
            r7 = 6
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L87
            r7 = 7
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L3f
            r4.add(r9)     // Catch: java.lang.Throwable -> L3f
            r9 = r2
            r7 = 0
            goto L5b
        L87:
            kotlin.Unit r8 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L3f
            r8 = 0
            kotlinx.coroutines.channels.v.b(r2, r8)
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r5)
            r7 = 7
            return r8
        L93:
            r8 = move-exception
            goto L99
        L95:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L99:
            r7 = 7
            throw r8     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            kotlinx.coroutines.channels.v.b(r9, r8)
            r7 = 5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.x.g(kotlinx.coroutines.channels.n0, kotlin.coroutines.d):java.lang.Object");
    }
}
