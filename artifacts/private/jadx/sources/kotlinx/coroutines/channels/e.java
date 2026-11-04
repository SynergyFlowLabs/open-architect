package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n11#2:364\n11#2:365\n11#2:369\n11#2:372\n11#2:378\n11#2:379\n11#2:385\n11#2:388\n11#2:389\n11#2:390\n774#3:366\n865#3,2:367\n1863#3,2:370\n1755#3,3:373\n1863#3,2:376\n1863#3,2:380\n774#3:382\n865#3,2:383\n1863#3,2:386\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n115#1:364\n137#1:365\n162#1:369\n186#1:372\n228#1:378\n280#1:379\n292#1:385\n304#1:388\n331#1:389\n343#1:390\n138#1:366\n138#1:367,2\n175#1:370,2\n191#1:373,3\n200#1:376,2\n282#1:380,2\n287#1:382\n287#1:383,2\n295#1:386,2\n*E\n"})
public final class e<E> extends n<E> implements kotlinx.coroutines.channels.d<E> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f313748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f313749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private List<? extends n<E>> f313750o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Object f313751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final HashMap<kotlinx.coroutines.selects.n<?>, Object> f313752t;

    @SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,363:1\n11#2:364\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n311#1:364\n*E\n"})
    private final class a extends n<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(e.this.I2(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.n
        /* JADX INFO: renamed from: F2, reason: merged with bridge method [inline-methods] */
        public boolean h0(@Nullable Throwable th2) {
            ReentrantLock reentrantLock = ((e) e.this).f313749n;
            e<E> eVar = e.this;
            reentrantLock.lock();
            try {
                eVar.N2(this);
                boolean zH0 = super.h0(th2);
                reentrantLock.unlock();
                return zH0;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    private final class b extends f0<E> {
        public b() {
            super(1, j.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.n
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public boolean h0(@Nullable Throwable th2) {
            e.this.N2(this);
            return super.h0(th2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n11#2:364\n1#3:365\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n253#1:364\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<E> f313756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f313757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.n<?> f313758d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<E> eVar, Object obj, kotlinx.coroutines.selects.n<?> nVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f313756b = eVar;
            this.f313757c = obj;
            this.f313758d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f313756b, this.f313757c, this.f313758d, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.channels.e$c for r5v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f313755a
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L13
                r4 = 5
                kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L10
                goto L47
            L10:
                r6 = move-exception
                r4 = 1
                goto L31
            L13:
                r4 = 1
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 7
                java.lang.String r6 = "ens/lo/o tcneiocr  teuosvke w /mref/i/ota//ulh r/eb"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1f:
                kotlin.ResultKt.m(r6)
                r4 = 5
                kotlinx.coroutines.channels.e<E> r6 = r5.f313756b     // Catch: java.lang.Throwable -> L10
                java.lang.Object r1 = r5.f313757c     // Catch: java.lang.Throwable -> L10
                r5.f313755a = r2     // Catch: java.lang.Throwable -> L10
                r4 = 5
                java.lang.Object r6 = r6.G(r1, r5)     // Catch: java.lang.Throwable -> L10
                if (r6 != r0) goto L47
                return r0
            L31:
                kotlinx.coroutines.channels.e<E> r0 = r5.f313756b
                boolean r0 = r0.B()
                if (r0 == 0) goto L94
                boolean r0 = r6 instanceof kotlinx.coroutines.channels.d0
                if (r0 != 0) goto L46
                r4 = 1
                kotlinx.coroutines.channels.e<E> r0 = r5.f313756b
                java.lang.Throwable r0 = r0.Q0()
                if (r0 != r6) goto L94
            L46:
                r2 = 0
            L47:
                kotlinx.coroutines.channels.e<E> r6 = r5.f313756b
                java.util.concurrent.locks.ReentrantLock r6 = kotlinx.coroutines.channels.e.F2(r6)
                r4 = 1
                kotlinx.coroutines.channels.e<E> r0 = r5.f313756b
                kotlinx.coroutines.selects.n<?> r5 = r5.f313758d
                r4 = 7
                r6.lock()
                java.util.HashMap r1 = kotlinx.coroutines.channels.e.G2(r0)     // Catch: java.lang.Throwable -> L5f
                if (r2 == 0) goto L62
                kotlin.Unit r2 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L5f
                goto L66
            L5f:
                r5 = move-exception
                r4 = 0
                goto L90
            L62:
                kotlinx.coroutines.internal.z0 r2 = kotlinx.coroutines.channels.o.z()     // Catch: java.lang.Throwable -> L5f
            L66:
                r4 = 0
                r1.put(r5, r2)     // Catch: java.lang.Throwable -> L5f
                r4 = 3
                java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L5f
                r1 = r5
                r4 = 5
                kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1     // Catch: java.lang.Throwable -> L5f
                r1 = r5
                kotlinx.coroutines.selects.m r1 = (kotlinx.coroutines.selects.m) r1     // Catch: java.lang.Throwable -> L5f
                r4 = 4
                kotlin.Unit r2 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L5f
                r4 = 6
                kotlinx.coroutines.selects.s r1 = r1.L(r0, r2)     // Catch: java.lang.Throwable -> L5f
                kotlinx.coroutines.selects.s r3 = kotlinx.coroutines.selects.s.REREGISTER     // Catch: java.lang.Throwable -> L5f
                if (r1 == r3) goto L8b
                java.util.HashMap r0 = kotlinx.coroutines.channels.e.G2(r0)     // Catch: java.lang.Throwable -> L5f
                r4 = 7
                r0.remove(r5)     // Catch: java.lang.Throwable -> L5f
            L8b:
                r6.unlock()
                r4 = 3
                return r2
            L90:
                r6.unlock()
                throw r5
            L94:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {179}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e<E> f313763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313764f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e<E> eVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f313763e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313762d = obj;
            this.f313764f |= Integer.MIN_VALUE;
            return this.f313763e.G(null, this);
        }
    }

    public e(int i10) {
        super(0, null);
        this.f313748m = i10;
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i10 + " was specified").toString());
        }
        this.f313749n = new ReentrantLock();
        this.f313750o = CollectionsKt.emptyList();
        this.f313751s = f.f313766a;
        this.f313752t = new HashMap<>();
    }

    public static /* synthetic */ void K2() {
    }

    public static /* synthetic */ void M2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N2(n0<? extends E> n0Var) {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            List<? extends n<E>> list = this.f313750o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((n) obj) != n0Var) {
                    arrayList.add(obj);
                }
            }
            this.f313750o = arrayList;
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    public boolean B() {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            return super.B();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f313750o.iterator();
            while (it.hasNext()) {
                ((n) it.next()).F(th2);
            }
            List<? extends n<E>> list = this.f313750o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((n) obj).Z0()) {
                    arrayList.add(obj);
                }
            }
            this.f313750o = arrayList;
            return super.F(th2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0098 -> B:12:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object G(E r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.e.d
            r6 = 6
            if (r0 == 0) goto L15
            r0 = r9
            kotlinx.coroutines.channels.e$d r0 = (kotlinx.coroutines.channels.e.d) r0
            int r1 = r0.f313764f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f313764f = r1
            goto L1b
        L15:
            kotlinx.coroutines.channels.e$d r0 = new kotlinx.coroutines.channels.e$d
            r6 = 2
            r0.<init>(r7, r9)
        L1b:
            r6 = 1
            java.lang.Object r9 = r0.f313762d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 3
            int r2 = r0.f313764f
            r6 = 0
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L40
            java.lang.Object r7 = r0.f313761c
            r6 = 2
            java.util.Iterator r7 = (java.util.Iterator) r7
            r6 = 7
            java.lang.Object r8 = r0.f313760b
            java.lang.Object r2 = r0.f313759a
            kotlinx.coroutines.channels.e r2 = (kotlinx.coroutines.channels.e) r2
            kotlin.ResultKt.m(r9)
            r5 = r0
            r0 = r8
            r0 = r8
            r8 = r2
        L3e:
            r2 = r5
            goto L9d
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 7
            r7.<init>(r8)
            r6 = 7
            throw r7
        L4a:
            kotlin.ResultKt.m(r9)
            java.util.concurrent.locks.ReentrantLock r9 = r7.f313749n
            r9.lock()
            r6 = 1
            boolean r2 = r7.B()     // Catch: java.lang.Throwable -> L64
            r6 = 6
            if (r2 != 0) goto Lbc
            int r2 = r7.f313748m     // Catch: java.lang.Throwable -> L64
            r6 = 0
            r4 = -1
            if (r2 != r4) goto L67
            r6 = 7
            r7.f313751s = r8     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r7 = move-exception
            r6 = 3
            goto Lc2
        L67:
            java.util.List<? extends kotlinx.coroutines.channels.n<E>> r2 = r7.f313750o     // Catch: java.lang.Throwable -> L64
            r9.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r6 = 0
            java.util.Iterator r9 = r2.iterator()
            r5 = r8
            r8 = r7
            r7 = r9
            r7 = r9
            r9 = r5
        L78:
            boolean r2 = r7.hasNext()
            r6 = 0
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r7.next()
            r6 = 5
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            r0.f313759a = r8
            r0.f313760b = r9
            r0.f313761c = r7
            r6 = 7
            r0.f313764f = r3
            java.lang.Object r2 = r2.a2(r9, r0)
            r6 = 4
            if (r2 != r1) goto L98
            r6 = 0
            return r1
        L98:
            r5 = r0
            r0 = r9
            r9 = r2
            r6 = 1
            goto L3e
        L9d:
            r6 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r6 = 6
            boolean r9 = r9.booleanValue()
            r6 = 7
            if (r9 != 0) goto Lb5
            boolean r9 = r8.B()
            if (r9 != 0) goto Lb0
            r6 = 6
            goto Lb5
        Lb0:
            java.lang.Throwable r7 = r8.Q0()
            throw r7
        Lb5:
            r9 = r0
            r0 = r2
            r6 = 6
            goto L78
        Lb9:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        Lbc:
            java.lang.Throwable r7 = r7.Q0()     // Catch: java.lang.Throwable -> L64
            r6 = 2
            throw r7     // Catch: java.lang.Throwable -> L64
        Lc2:
            r9.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.e.G(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public final int I2() {
        return this.f313748m;
    }

    public final E J2() {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            if (B()) {
                Throwable thA0 = A0();
                if (thA0 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw thA0;
            }
            if (this.f313751s == f.f313766a) {
                throw new IllegalStateException("No value");
            }
            E e10 = (E) this.f313751s;
            reentrantLock.unlock();
            return e10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Nullable
    public final E L2() {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            E e10 = null;
            if (!C() && this.f313751s != f.f313766a) {
                e10 = (E) this.f313751s;
            }
            return e10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.n
    protected void U1(@NotNull kotlinx.coroutines.selects.n<?> nVar, @Nullable Object obj) {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            Object objRemove = this.f313752t.remove(nVar);
            if (objRemove != null) {
                nVar.f(objRemove);
                reentrantLock.unlock();
            } else {
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
                kotlinx.coroutines.k.f(t0.a(nVar.getContext()), null, u0.UNDISPATCHED, new c(this, obj, nVar, null), 1, null);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.n
    public boolean h0(@Nullable Throwable th2) {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f313750o.iterator();
            while (it.hasNext()) {
                ((n) it.next()).h0(th2);
            }
            this.f313751s = f.f313766a;
            return super.h0(th2);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.d
    @NotNull
    public n0<E> k() {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            a bVar = this.f313748m == -1 ? new b() : new a();
            if (B() && this.f313751s == f.f313766a) {
                ((n) bVar).F(A0());
                return bVar;
            }
            if (this.f313751s != f.f313766a) {
                ((n) bVar).p(J2());
            }
            this.f313750o = CollectionsKt.plus((Collection<? extends n0<E>>) this.f313750o, bVar);
            return bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.n, kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        ReentrantLock reentrantLock = this.f313749n;
        reentrantLock.lock();
        try {
            if (B()) {
                Object objP = super.p(e10);
                reentrantLock.unlock();
                return objP;
            }
            List<? extends n<E>> list = this.f313750o;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((n) it.next()).q2()) {
                        Object objB = t.f313893b.b();
                        reentrantLock.unlock();
                        return objB;
                    }
                }
            }
            if (this.f313748m == -1) {
                this.f313751s = e10;
            }
            Iterator<T> it2 = this.f313750o.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).p(e10);
            }
            Object objC = t.f313893b.c(Unit.f312394a);
            reentrantLock.unlock();
            return objC;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.n
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f313751s != f.f313766a) {
            str = "CONFLATED_ELEMENT=" + this.f313751s + "; ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        int i10 = 4 & 0;
        sb2.append(CollectionsKt.joinToString$default(this.f313750o, ";", "<", ">", 0, null, null, 56, null));
        return sb2.toString();
    }
}
