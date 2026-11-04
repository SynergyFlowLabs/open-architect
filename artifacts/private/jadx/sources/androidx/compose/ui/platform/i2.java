package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i2 f40511a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f40512b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f40513c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40514d = 8;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,59:1\n81#2:60\n58#2,6:61\n82#2,2:67\n68#2:69\n64#2,3:70\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n46#1:60\n46#1:61,6\n46#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f40516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f40518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlinx.coroutines.channels.p<Unit> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f40518d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f40518d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x004d A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:7:0x0018, B:18:0x0044, B:20:0x004d, B:15:0x0034, B:21:0x0063, B:14:0x002d), top: B:30:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 2
                int r1 = r6.f40517c
                r2 = 1
                int r5 = r5 << r2
                if (r1 == 0) goto L28
                r5 = 2
                if (r1 != r2) goto L1e
                r5 = 7
                java.lang.Object r1 = r6.f40516b
                r5 = 1
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r3 = r6.f40515a
                kotlinx.coroutines.channels.n0 r3 = (kotlinx.coroutines.channels.n0) r3
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L1c
                goto L44
            L1c:
                r6 = move-exception
                goto L6b
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = " ese/fmlt /otewieb oh/eolsut/o//a/c v /nrerui inrko"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L28:
                kotlin.ResultKt.m(r7)
                kotlinx.coroutines.channels.p<kotlin.Unit> r3 = r6.f40518d
                r5 = 0
                kotlinx.coroutines.channels.r r7 = r3.iterator()     // Catch: java.lang.Throwable -> L1c
                r1 = r7
                r1 = r7
            L34:
                r6.f40515a = r3     // Catch: java.lang.Throwable -> L1c
                r5 = 5
                r6.f40516b = r1     // Catch: java.lang.Throwable -> L1c
                r6.f40517c = r2     // Catch: java.lang.Throwable -> L1c
                r5 = 6
                java.lang.Object r7 = r1.c(r6)     // Catch: java.lang.Throwable -> L1c
                r5 = 6
                if (r7 != r0) goto L44
                return r0
            L44:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L1c
                r5 = 5
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L1c
                if (r7 == 0) goto L63
                java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L1c
                r5 = 5
                kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L1c
                java.util.concurrent.atomic.AtomicBoolean r7 = androidx.compose.ui.platform.i2.a()     // Catch: java.lang.Throwable -> L1c
                r4 = 0
                r7.set(r4)     // Catch: java.lang.Throwable -> L1c
                androidx.compose.runtime.snapshots.m$a r7 = androidx.compose.runtime.snapshots.m.f36535e     // Catch: java.lang.Throwable -> L1c
                r7.y()     // Catch: java.lang.Throwable -> L1c
                r5 = 1
                goto L34
            L63:
                kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L1c
                r7 = 0
                kotlinx.coroutines.channels.v.b(r3, r7)
                r5 = 5
                return r6
            L6b:
                throw r6     // Catch: java.lang.Throwable -> L6c
            L6c:
                r7 = move-exception
                r5 = 7
                kotlinx.coroutines.channels.v.b(r3, r6)
                r5 = 1
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.i2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<Unit> f40519a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.p<Unit> pVar) {
            super(1);
            this.f40519a = pVar;
        }

        public final void c(Object obj) {
            if (i2.f40513c.compareAndSet(false, true)) {
                this.f40519a.p(Unit.f312394a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            c(obj);
            return Unit.f312394a;
        }
    }

    private i2() {
    }

    public final void b() {
        if (f40512b.compareAndSet(false, true)) {
            kotlinx.coroutines.channels.p pVarD = kotlinx.coroutines.channels.s.d(1, null, null, 6, null);
            kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(l0.f40623l.b()), null, null, new a(pVarD, null), 3, null);
            androidx.compose.runtime.snapshots.m.f36535e.t(new b(pVarD));
        }
    }
}
