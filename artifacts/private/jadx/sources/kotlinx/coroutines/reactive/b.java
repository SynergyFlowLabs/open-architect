package kotlinx.coroutines.reactive;

import com.facebook.internal.w0;
import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.channels.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.u;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,107:1\n160#2:108\n94#2,3:109\n161#2,2:112\n101#2:114\n97#2,3:115\n94#2,3:118\n161#2,2:121\n101#2:123\n97#2,3:124\n*S KotlinDebug\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt\n*L\n15#1:108\n15#1:109,3\n15#1:112,2\n15#1:114\n15#1:115,3\n15#1:118,3\n15#1:121,2\n15#1:123\n15#1:124,3\n*E\n"})
public final class b {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.ChannelKt", f = "Channel.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.B}, m = "collect", n = {w0.f100156c1, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f315235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315236e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315235d = obj;
            this.f315236e |= Integer.MIN_VALUE;
            return b.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: all -> 0x008f, TryCatch #4 {all -> 0x008f, blocks: (B:26:0x007a, B:28:0x0083, B:31:0x0093), top: B:51:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:14:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull org.reactivestreams.u<T> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r6 = 6
            boolean r0 = r9 instanceof kotlinx.coroutines.reactive.b.a
            r6 = 2
            if (r0 == 0) goto L15
            r0 = r9
            kotlinx.coroutines.reactive.b$a r0 = (kotlinx.coroutines.reactive.b.a) r0
            int r1 = r0.f315236e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f315236e = r1
            goto L1a
        L15:
            kotlinx.coroutines.reactive.b$a r0 = new kotlinx.coroutines.reactive.b$a
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f315235d
            r6 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f315236e
            r3 = 1
            r6 = 6
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 != r3) goto L46
            java.lang.Object r7 = r0.f315234c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            r6 = 0
            java.lang.Object r8 = r0.f315233b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f315232a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L43
            r5 = r0
            r5 = r0
            r0 = r8
            r8 = r2
            r8 = r2
        L40:
            r2 = r5
            r2 = r5
            goto L7a
        L43:
            r7 = move-exception
            r6 = 0
            goto La8
        L46:
            r6 = 7
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4f:
            r6 = 2
            kotlin.ResultKt.m(r9)
            r6 = 7
            r9 = 0
            kotlinx.coroutines.channels.n0 r7 = f(r7, r9, r3, r4)
            r6 = 1
            kotlinx.coroutines.channels.r r9 = r7.iterator()     // Catch: java.lang.Throwable -> La4
            r5 = r9
            r9 = r7
            r7 = r5
        L61:
            r6 = 3
            r0.f315232a = r8     // Catch: java.lang.Throwable -> La0
            r6 = 6
            r0.f315233b = r9     // Catch: java.lang.Throwable -> La0
            r6 = 5
            r0.f315234c = r7     // Catch: java.lang.Throwable -> La0
            r0.f315236e = r3     // Catch: java.lang.Throwable -> La0
            r6 = 2
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> La0
            if (r2 != r1) goto L74
            return r1
        L74:
            r5 = r0
            r0 = r9
            r0 = r9
            r9 = r2
            r6 = 5
            goto L40
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8f
            r6 = 0
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto L93
            r6 = 2
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L8f
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L8f
            r9 = r0
            r0 = r2
            r6 = 3
            goto L61
        L8f:
            r7 = move-exception
            r8 = r0
            r6 = 7
            goto La8
        L93:
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L8f
            r6 = 1
            kotlin.jvm.internal.h0.d(r3)
            kotlinx.coroutines.channels.v.b(r0, r4)
            kotlin.jvm.internal.h0.c(r3)
            return r7
        La0:
            r7 = move-exception
            r8 = r9
            r6 = 0
            goto La8
        La4:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        La8:
            r6 = 4
            throw r7     // Catch: java.lang.Throwable -> Laa
        Laa:
            r9 = move-exception
            kotlin.jvm.internal.h0.d(r3)
            kotlinx.coroutines.channels.v.b(r8, r7)
            r6 = 4
            kotlin.jvm.internal.h0.c(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.b.a(org.reactivestreams.u, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object b(u<T> uVar, Function1<? super T, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        n0 n0VarF = f(uVar, 0, 1, null);
        try {
            r it = n0VarF.iterator();
            while (true) {
                h0.e(3);
                h0.e(0);
                Object objC = it.c(null);
                h0.e(1);
                if (!((Boolean) objC).booleanValue()) {
                    Unit unit = Unit.f312394a;
                    h0.d(1);
                    v.b(n0VarF, null);
                    h0.c(1);
                    return unit;
                }
                function1.invoke((Object) it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                v.b(n0VarF, th2);
                h0.c(1);
                throw th3;
            }
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Transforming publisher to channel is deprecated, use asFlow() instead")
    public static final /* synthetic */ n0 c(u uVar, int i10) {
        q qVar = new q(i10);
        uVar.e(qVar);
        return qVar;
    }

    public static /* synthetic */ n0 d(u uVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return c(uVar, i10);
    }

    @a1
    @NotNull
    public static final <T> n0<T> e(@NotNull u<T> uVar, int i10) {
        q qVar = new q(i10);
        uVar.e(qVar);
        return qVar;
    }

    public static /* synthetic */ n0 f(u uVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return e(uVar, i10);
    }
}
