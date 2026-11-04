package androidx.compose.foundation;

import android.view.KeyEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1799:1\n1#2:1800\n397#3,3:1801\n354#3,6:1804\n364#3,3:1811\n367#3,9:1815\n400#3:1824\n397#3,3:1825\n354#3,6:1828\n364#3,3:1835\n367#3,9:1839\n400#3:1848\n1399#4:1810\n1270#4:1814\n1399#4:1834\n1270#4:1838\n159#5:1849\n30#6:1850\n53#7,3:1851\n97#8,4:1854\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1489#1:1801,3\n1489#1:1804,6\n1489#1:1811,3\n1489#1:1815,9\n1489#1:1824\n1505#1:1825,3\n1505#1:1828,6\n1505#1:1835,3\n1505#1:1839,9\n1505#1:1848\n1489#1:1810\n1489#1:1814\n1505#1:1834\n1505#1:1838\n1544#1:1849\n1544#1:1850\n1544#1:1851,3\n1452#1:1854,4\n*E\n"})
public abstract class c extends androidx.compose.ui.node.m implements androidx.compose.ui.node.d2, androidx.compose.ui.input.key.g, androidx.compose.ui.node.i2, androidx.compose.ui.node.p2, androidx.compose.ui.node.h, androidx.compose.ui.node.q1 {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    public static final a f13929s3 = new a(null);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f13930t3 = 8;

    @NotNull
    private Function0<Unit> H1;

    @Nullable
    private z2 X;
    private boolean Y;

    @Nullable
    private String Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final h2 f13931g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private z2 f13932h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.input.pointer.y0 f13933i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.j f13934j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.l.b f13935k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.e.a f13936l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a2<androidx.compose.foundation.interaction.l.b> f13937m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private long f13938n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.j f13939o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.semantics.j f13940p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f13941p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final boolean f13942p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f13943p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f13944q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final Object f13945r3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.j f13946w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", i = {}, l = {1760}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.e.a f13949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.e.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f13948b = jVar;
            this.f13949c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f13948b, this.f13949c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13947a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = this.f13948b;
                androidx.compose.foundation.interaction.e.a aVar = this.f13949c;
                this.f13947a = 1;
                if (jVar.b(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", i = {}, l = {1770}, m = "invokeSuspend", n = {}, s = {})
    static final class C0069c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.e.b f13952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0069c(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.e.b bVar, kotlin.coroutines.d<? super C0069c> dVar) {
            super(2, dVar);
            this.f13951b = jVar;
            this.f13952c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C0069c(this.f13951b, this.f13952c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13950a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = this.f13951b;
                androidx.compose.foundation.interaction.e.b bVar = this.f13952c;
                this.f13950a = 1;
                if (jVar.b(bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0069c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements Function1<Boolean, Unit> {
        d(Object obj) {
            super(1, obj, c.class, "onFocusChange", "onFocusChange(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f312394a;
        }

        public final void invoke(boolean z10) {
            ((c) this.receiver).ha(z10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1725, 1727, 1734, 1735, 1745}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f13953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.r3 f13956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f13959g;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1719, 1722}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f13960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f13961b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f13962c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f13963d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.j f13964e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, long j10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f13962c = cVar;
                this.f13963d = j10;
                this.f13964e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f13962c, this.f13963d, this.f13964e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.compose.foundation.interaction.l.b bVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f13961b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (this.f13962c.T9()) {
                        long jA = l1.a();
                        this.f13961b = 1;
                        if (kotlinx.coroutines.d1.b(jA, this) == objL) {
                        }
                    }
                    return objL;
                }
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (androidx.compose.foundation.interaction.l.b) this.f13960a;
                    ResultKt.m(obj);
                }
                this.f13962c.f13935k3 = bVar;
                return Unit.f312394a;
                androidx.compose.foundation.interaction.l.b bVar2 = new androidx.compose.foundation.interaction.l.b(this.f13963d, null);
                androidx.compose.foundation.interaction.j jVar = this.f13964e;
                this.f13960a = bVar2;
                this.f13961b = 2;
                if (jVar.b(bVar2, this) != objL) {
                    bVar = bVar2;
                    this.f13962c.f13935k3 = bVar;
                    return Unit.f312394a;
                }
                return objL;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.foundation.gestures.r3 r3Var, long j10, androidx.compose.foundation.interaction.j jVar, c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f13956d = r3Var;
            this.f13957e = j10;
            this.f13958f = jVar;
            this.f13959g = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f13956d, this.f13957e, this.f13958f, this.f13959g, dVar);
            eVar.f13955c = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0089  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        
            if (r3.b(r2, r16) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r4.b(r5, r16) == r1) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", i = {}, l = {1706}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13967c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.foundation.interaction.l.b bVar, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f13966b = bVar;
            this.f13967c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f13966b, this.f13967c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13965a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.l.a aVar = new androidx.compose.foundation.interaction.l.a(this.f13966b);
                androidx.compose.foundation.interaction.j jVar = this.f13967c;
                this.f13965a = 1;
                if (jVar.b(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", i = {1}, l = {1676, 1681, 1682}, m = "invokeSuspend", n = {"release"}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13969b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13972e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f13971d = j10;
            this.f13972e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new g(this.f13971d, this.f13972e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r9.b(r1, r8) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 4
                int r1 = r8.f13969b
                r7 = 0
                r2 = 0
                r3 = 3
                r7 = r3
                r4 = 2
                r7 = 4
                r5 = 1
                if (r1 == 0) goto L34
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1b
                kotlin.ResultKt.m(r9)
                r7 = 4
                goto L79
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 6
                java.lang.String r9 = "ofsevno /cr/r/e/i ieut/ slcowbe/tmeil/rukt n h /eao"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L26:
                java.lang.Object r1 = r8.f13968a
                androidx.compose.foundation.interaction.l$c r1 = (androidx.compose.foundation.interaction.l.c) r1
                kotlin.ResultKt.m(r9)
                r7 = 6
                goto L68
            L2f:
                r7 = 4
                kotlin.ResultKt.m(r9)
                goto L4b
            L34:
                kotlin.ResultKt.m(r9)
                androidx.compose.foundation.c r9 = androidx.compose.foundation.c.this
                r7 = 2
                kotlinx.coroutines.p2 r9 = androidx.compose.foundation.c.L9(r9)
                r7 = 5
                if (r9 == 0) goto L4b
                r8.f13969b = r5
                r7 = 2
                java.lang.Object r9 = kotlinx.coroutines.s2.l(r9, r8)
                if (r9 != r0) goto L4b
                goto L77
            L4b:
                androidx.compose.foundation.interaction.l$b r9 = new androidx.compose.foundation.interaction.l$b
                long r5 = r8.f13971d
                r7 = 3
                r9.<init>(r5, r2)
                androidx.compose.foundation.interaction.l$c r1 = new androidx.compose.foundation.interaction.l$c
                r7 = 4
                r1.<init>(r9)
                r7 = 4
                androidx.compose.foundation.interaction.j r5 = r8.f13972e
                r8.f13968a = r1
                r8.f13969b = r4
                java.lang.Object r9 = r5.b(r9, r8)
                if (r9 != r0) goto L68
                r7 = 1
                goto L77
            L68:
                r7 = 1
                androidx.compose.foundation.interaction.j r9 = r8.f13972e
                r8.f13968a = r2
                r7 = 0
                r8.f13969b = r3
                java.lang.Object r8 = r9.b(r1, r8)
                r7 = 1
                if (r8 != r0) goto L79
            L77:
                r7 = 1
                return r0
            L79:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", i = {}, l = {1688}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.interaction.l.b bVar, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f13974b = bVar;
            this.f13975c = jVar;
            int i10 = 4 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f13974b, this.f13975c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13973a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.l.c cVar = new androidx.compose.foundation.interaction.l.c(this.f13974b);
                androidx.compose.foundation.interaction.j jVar = this.f13975c;
                this.f13973a = 1;
                if (jVar.b(cVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", i = {}, l = {1661, 1662}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f13979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.l.b bVar, c cVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f13977b = jVar;
            this.f13978c = bVar;
            this.f13979d = cVar;
            int i10 = 5 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f13977b, this.f13978c, this.f13979d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r8.b(r1, r7) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f13976a
                r6 = 2
                r2 = 2
                r3 = 0
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L21
                r6 = 2
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r8)
                r6 = 1
                goto L48
            L16:
                r6 = 0
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "onsb/w e/otcelk/saecrirot h eue/m ouvrfin/l/i / oe/"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L21:
                kotlin.ResultKt.m(r8)
                r6 = 4
                goto L39
            L26:
                kotlin.ResultKt.m(r8)
                long r4 = androidx.compose.foundation.l1.a()
                r7.f13976a = r3
                r6 = 2
                java.lang.Object r8 = kotlinx.coroutines.d1.b(r4, r7)
                r6 = 1
                if (r8 != r0) goto L39
                r6 = 6
                goto L46
            L39:
                androidx.compose.foundation.interaction.j r8 = r7.f13977b
                androidx.compose.foundation.interaction.l$b r1 = r7.f13978c
                r6 = 3
                r7.f13976a = r2
                java.lang.Object r8 = r8.b(r1, r7)
                if (r8 != r0) goto L48
            L46:
                r6 = 3
                return r0
            L48:
                androidx.compose.foundation.c r8 = r7.f13979d
                androidx.compose.foundation.interaction.l$b r7 = r7.f13978c
                r6 = 0
                androidx.compose.foundation.c.P9(r8, r7)
                r6 = 4
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2", f = "Clickable.kt", i = {}, l = {1667}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f13981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.interaction.j jVar, androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f13981b = jVar;
            this.f13982c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f13981b, this.f13982c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13980a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = this.f13981b;
                androidx.compose.foundation.interaction.l.b bVar = this.f13982c;
                this.f13980a = 1;
                if (jVar.b(bVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", i = {}, l = {1506}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13983a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f13985c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new k(this.f13985c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13983a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = c.this.f13946w;
                if (jVar != null) {
                    androidx.compose.foundation.interaction.l.a aVar = new androidx.compose.foundation.interaction.l.a(this.f13985c);
                    this.f13983a = 1;
                    if (jVar.b(aVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {1592}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f13988c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new l(this.f13988c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13986a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = c.this.f13946w;
                if (jVar != null) {
                    androidx.compose.foundation.interaction.l.b bVar = this.f13988c;
                    this.f13986a = 1;
                    if (jVar.b(bVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", i = {}, l = {1603}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13989a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.l.b f13991c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.interaction.l.b bVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f13991c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new m(this.f13991c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13989a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.interaction.j jVar = c.this.f13946w;
                if (jVar != null) {
                    androidx.compose.foundation.interaction.l.c cVar = new androidx.compose.foundation.interaction.l.c(this.f13991c);
                    this.f13989a = 1;
                    if (jVar.b(cVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13992a;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f13992a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.V9();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13994a;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f13994a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.W9();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ c(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z2Var, z10, z11, str, jVar2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R9(c cVar) {
        cVar.H1.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T9() {
        return i1.v(this) || l1.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V9() {
        if (this.f13936l3 == null) {
            androidx.compose.foundation.interaction.e.a aVar = new androidx.compose.foundation.interaction.e.a();
            androidx.compose.foundation.interaction.j jVar = this.f13946w;
            if (jVar != null) {
                kotlinx.coroutines.k.f(Q8(), null, null, new b(jVar, aVar, null), 3, null);
            }
            this.f13936l3 = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W9() {
        androidx.compose.foundation.interaction.e.a aVar = this.f13936l3;
        if (aVar != null) {
            androidx.compose.foundation.interaction.e.b bVar = new androidx.compose.foundation.interaction.e.b(aVar);
            androidx.compose.foundation.interaction.j jVar = this.f13946w;
            if (jVar != null) {
                kotlinx.coroutines.k.f(Q8(), null, null, new C0069c(jVar, bVar, null), 3, null);
            }
            this.f13936l3 = null;
        }
    }

    private final void da() {
        if (this.f13934j3 == null) {
            z2 z2Var = this.Y ? this.f13932h3 : this.X;
            if (z2Var != null) {
                if (this.f13946w == null) {
                    this.f13946w = androidx.compose.foundation.interaction.i.a();
                }
                this.f13931g3.S9(this.f13946w);
                androidx.compose.foundation.interaction.j jVar = this.f13946w;
                Intrinsics.checkNotNull(jVar);
                androidx.compose.ui.node.j jVarA = z2Var.a(jVar);
                v9(jVarA);
                this.f13934j3 = jVarA;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[LOOP:0: B:11:0x0019->B:21:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[EDGE_INSN: B:25:0x0065->B:22:0x0065 BREAK  A[LOOP:0: B:11:0x0019->B:21:0x0062], SYNTHETIC] */
    public final void ha(boolean z10) {
        if (z10) {
            da();
            return;
        }
        if (this.f13946w != null) {
            androidx.collection.a2<androidx.compose.foundation.interaction.l.b> a2Var = this.f13937m3;
            Object[] objArr = a2Var.f12511c;
            long[] jArr = a2Var.f12509a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                kotlinx.coroutines.k.f(Q8(), null, null, new k((androidx.compose.foundation.interaction.l.b) objArr[(i10 << 3) + i12], null), 3, null);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.f13937m3.P();
        ea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ia(c cVar) {
        t2 t2Var = (t2) androidx.compose.ui.node.i.a(cVar, w2.c());
        if (!(t2Var instanceof z2)) {
            androidx.compose.foundation.internal.e.g(i1.A(t2Var));
        }
        z2 z2Var = cVar.f13932h3;
        z2 z2Var2 = (z2) t2Var;
        cVar.f13932h3 = z2Var2;
        if (z2Var != null && !Intrinsics.areEqual(z2Var2, z2Var)) {
            cVar.ja();
        }
        return Unit.f312394a;
    }

    private final void ja() {
        androidx.compose.ui.node.j jVar = this.f13934j3;
        if (jVar == null && this.f13943p3) {
            return;
        }
        if (jVar != null) {
            C9(jVar);
        }
        this.f13934j3 = null;
        da();
    }

    private final boolean la() {
        return this.f13939o3 == null;
    }

    @Override // androidx.compose.ui.node.i2
    public final boolean A4() {
        return true;
    }

    public void Q9(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f13945r3;
    }

    @Nullable
    public abstract androidx.compose.ui.input.pointer.y0 S9();

    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[LOOP:0: B:13:0x002a->B:23:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[EDGE_INSN: B:27:0x0069->B:24:0x0069 BREAK  A[LOOP:0: B:13:0x002a->B:23:0x0066], SYNTHETIC] */
    protected final void U9() {
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        if (jVar != null) {
            androidx.compose.foundation.interaction.l.b bVar = this.f13935k3;
            if (bVar != null) {
                jVar.a(new androidx.compose.foundation.interaction.l.a(bVar));
            }
            androidx.compose.foundation.interaction.e.a aVar = this.f13936l3;
            if (aVar != null) {
                jVar.a(new androidx.compose.foundation.interaction.e.b(aVar));
            }
            androidx.collection.a2<androidx.compose.foundation.interaction.l.b> a2Var = this.f13937m3;
            Object[] objArr = a2Var.f12511c;
            long[] jArr = a2Var.f12509a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                jVar.a(new androidx.compose.foundation.interaction.l.a((androidx.compose.foundation.interaction.l.b) objArr[(i10 << 3) + i12]));
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.f13935k3 = null;
        this.f13936l3 = null;
        this.f13937m3.P();
    }

    @Override // androidx.compose.ui.a0.d
    public final boolean X8() {
        return this.f13942p2;
    }

    protected final boolean X9() {
        return this.f13941p1;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        if (this.Y) {
            androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.ia(this.f13906a);
                }
            });
        }
    }

    @NotNull
    protected final Function0<Unit> Y9() {
        return this.H1;
    }

    @Nullable
    protected final Object Z9(@NotNull androidx.compose.foundation.gestures.r3 r3Var, long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG;
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        return (jVar == null || (objG = kotlinx.coroutines.t0.g(new e(r3Var, j10, jVar, this, null), dVar)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objG;
    }

    protected final void aa() {
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        if (jVar != null) {
            kotlinx.coroutines.p2 p2Var = this.f13944q3;
            if (p2Var == null || !p2Var.isActive()) {
                androidx.compose.foundation.interaction.l.b bVar = this.f13935k3;
                if (bVar != null) {
                    kotlinx.coroutines.k.f(Q8(), null, null, new f(bVar, jVar, null), 3, null);
                }
            } else {
                kotlinx.coroutines.p2 p2Var2 = this.f13944q3;
                if (p2Var2 != null) {
                    kotlinx.coroutines.p2.a.b(p2Var2, null, 1, null);
                }
            }
            this.f13935k3 = null;
        }
    }

    protected final void ba(long j10) {
        c cVar;
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        if (jVar != null) {
            kotlinx.coroutines.p2 p2Var = this.f13944q3;
            if (p2Var == null || !p2Var.isActive()) {
                cVar = this;
                androidx.compose.foundation.interaction.l.b bVar = cVar.f13935k3;
                if (bVar != null) {
                    kotlinx.coroutines.k.f(cVar.Q8(), null, null, new h(bVar, jVar, null), 3, null);
                }
            } else {
                cVar = this;
                kotlinx.coroutines.k.f(Q8(), null, null, cVar.new g(j10, jVar, null), 3, null);
            }
            cVar.f13935k3 = null;
        }
    }

    protected final void ca(long j10) {
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        if (jVar != null) {
            androidx.compose.foundation.interaction.l.b bVar = new androidx.compose.foundation.interaction.l.b(j10, null);
            if (T9()) {
                this.f13944q3 = kotlinx.coroutines.k.f(Q8(), null, null, new i(jVar, bVar, this, null), 3, null);
                return;
            }
            this.f13935k3 = bVar;
            int i10 = 6 ^ 0;
            kotlinx.coroutines.k.f(Q8(), null, null, new j(jVar, bVar, null), 3, null);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public final void e9() {
        Y5();
        if (!this.f13943p3) {
            da();
        }
        if (this.f13941p1) {
            v9(this.f13931g3);
        }
    }

    protected void ea() {
    }

    @Override // androidx.compose.ui.a0.d
    public final void f9() {
        U9();
        if (this.f13939o3 == null) {
            this.f13946w = null;
        }
        androidx.compose.ui.node.j jVar = this.f13934j3;
        if (jVar != null) {
            C9(jVar);
        }
        this.f13934j3 = null;
    }

    protected abstract boolean fa(@NotNull KeyEvent keyEvent);

    protected abstract boolean ga(@NotNull KeyEvent keyEvent);

    @Override // androidx.compose.ui.input.key.g
    public final boolean h7(@NotNull KeyEvent keyEvent) {
        boolean z10;
        da();
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        if (!this.f13941p1 || !i1.z(keyEvent)) {
            if (this.f13941p1 && i1.x(keyEvent)) {
                androidx.compose.foundation.interaction.l.b bVarE0 = this.f13937m3.e0(jA);
                if (bVarE0 != null) {
                    if (this.f13946w != null) {
                        kotlinx.coroutines.k.f(Q8(), null, null, new m(bVarE0, null), 3, null);
                    }
                    ga(keyEvent);
                }
                if (bVarE0 != null) {
                    return true;
                }
            }
            return false;
        }
        if (this.f13937m3.e(jA)) {
            z10 = false;
        } else {
            androidx.compose.foundation.interaction.l.b bVar = new androidx.compose.foundation.interaction.l.b(this.f13938n3, null);
            this.f13937m3.j0(jA, bVar);
            if (this.f13946w != null) {
                kotlinx.coroutines.k.f(Q8(), null, null, new l(bVar, null), 3, null);
            }
            z10 = true;
        }
        if (!fa(keyEvent) && !z10) {
            return false;
        }
        return true;
    }

    @Nullable
    protected final Unit ka() {
        androidx.compose.ui.input.pointer.y0 y0Var = this.f13933i3;
        if (y0Var == null) {
            return null;
        }
        y0Var.A6();
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    protected final void ma(@Nullable androidx.compose.foundation.interaction.j jVar, @Nullable z2 z2Var, boolean z10, boolean z11, @Nullable String str, @Nullable androidx.compose.ui.semantics.j jVar2, @NotNull Function0<Unit> function0) {
        boolean z12;
        boolean z13;
        if (Intrinsics.areEqual(this.f13939o3, jVar)) {
            z12 = false;
        } else {
            U9();
            this.f13939o3 = jVar;
            this.f13946w = jVar;
            z12 = true;
        }
        if (!Intrinsics.areEqual(this.X, z2Var)) {
            this.X = z2Var;
            z12 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            if (z10) {
                Y5();
            }
            z12 = true;
        }
        if (this.f13941p1 != z11) {
            if (z11) {
                v9(this.f13931g3);
            } else {
                C9(this.f13931g3);
                U9();
            }
            androidx.compose.ui.node.j2.b(this);
            this.f13941p1 = z11;
        }
        if (!Intrinsics.areEqual(this.Z, str)) {
            this.Z = str;
            androidx.compose.ui.node.j2.b(this);
        }
        if (!Intrinsics.areEqual(this.f13940p0, jVar2)) {
            this.f13940p0 = jVar2;
            androidx.compose.ui.node.j2.b(this);
        }
        this.H1 = function0;
        if (this.f13943p3 != la()) {
            boolean zLa = la();
            this.f13943p3 = zLa;
            z13 = (zLa || this.f13934j3 != null) ? z12 : true;
        }
        if (z13) {
            ja();
        }
        this.f13931g3.S9(this.f13946w);
    }

    @Override // androidx.compose.ui.node.i2
    public final void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.j jVar = this.f13940p0;
        if (jVar != null) {
            Intrinsics.checkNotNull(jVar);
            androidx.compose.ui.semantics.b0.K1(e0Var, jVar.p());
        }
        androidx.compose.ui.semantics.b0.P0(e0Var, this.Z, new Function0() { // from class: androidx.compose.foundation.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(c.R9(this.f13911a));
            }
        });
        if (this.f13941p1) {
            this.f13931g3.p0(e0Var);
        } else {
            androidx.compose.ui.semantics.b0.n(e0Var);
        }
        Q9(e0Var);
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        androidx.compose.foundation.interaction.e.a aVar;
        androidx.compose.foundation.interaction.j jVar = this.f13946w;
        if (jVar != null && (aVar = this.f13936l3) != null) {
            jVar.a(new androidx.compose.foundation.interaction.e.b(aVar));
        }
        this.f13936l3 = null;
        androidx.compose.ui.input.pointer.y0 y0Var = this.f13933i3;
        if (y0Var != null) {
            y0Var.p3();
        }
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        androidx.compose.ui.input.pointer.y0 y0VarS9;
        long jB = androidx.compose.ui.unit.v.b(j10);
        this.f13938n3 = n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.n(jB))) << 32) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.p(jB))) & com.rabbitmq.client.k0.f265952a));
        da();
        if (this.f13941p1 && sVar == androidx.compose.ui.input.pointer.s.Main) {
            int iJ = qVar.j();
            androidx.compose.ui.input.pointer.u.a aVar = androidx.compose.ui.input.pointer.u.f39127b;
            if (androidx.compose.ui.input.pointer.u.k(iJ, aVar.a())) {
                kotlinx.coroutines.k.f(Q8(), null, null, new n(null), 3, null);
            } else if (androidx.compose.ui.input.pointer.u.k(iJ, aVar.b())) {
                int i10 = 4 & 3;
                kotlinx.coroutines.k.f(Q8(), null, null, new o(null), 3, null);
            }
        }
        if (this.f13933i3 == null && (y0VarS9 = S9()) != null) {
            this.f13933i3 = (androidx.compose.ui.input.pointer.y0) v9(y0VarS9);
        }
        androidx.compose.ui.input.pointer.y0 y0Var = this.f13933i3;
        if (y0Var != null) {
            y0Var.p5(qVar, sVar, j10);
        }
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean w2(@NotNull KeyEvent keyEvent) {
        return false;
    }

    private c(androidx.compose.foundation.interaction.j jVar, z2 z2Var, boolean z10, boolean z11, String str, androidx.compose.ui.semantics.j jVar2, Function0<Unit> function0) {
        this.f13946w = jVar;
        this.X = z2Var;
        this.Y = z10;
        this.Z = str;
        this.f13940p0 = jVar2;
        this.f13941p1 = z11;
        this.H1 = function0;
        this.f13931g3 = new h2(this.f13946w, androidx.compose.ui.focus.w0.f37469b.c(), new d(this), null);
        this.f13937m3 = androidx.collection.y0.j();
        this.f13938n3 = n0.g.f332700b.e();
        this.f13939o3 = this.f13946w;
        this.f13943p3 = la();
        this.f13945r3 = f13929s3;
    }
}
