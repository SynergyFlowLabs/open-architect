package androidx.paging;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n+ 5 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,553:1\n1#2:554\n230#3,5:555\n230#3,5:570\n32#4,10:560\n32#4,10:575\n32#4,10:585\n32#4,8:595\n41#4:608\n27#5,5:603\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter\n*L\n272#1:555,5\n278#1:570,5\n276#1:560,10\n311#1:575,10\n332#1:585,10\n484#1:595,8\n484#1:608\n485#1:603,5\n*E\n"})
public abstract class a2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f71490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private h0 f71491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private h3 f71492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private p1<T> f71493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d1 f71494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<Function0<Unit>> f71495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c3 f71496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f71497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f71498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<Boolean> f71499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.z0<n> f71500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.j0<Unit> f71501l;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2<T> f71502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2<T> a2Var) {
            super(0);
            this.f71502a = a2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((a2) this.f71502a).f71501l.f(Unit.f312394a);
        }
    }

    private static final class b implements h3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f71503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f71504b;

        @Override // androidx.paging.h3
        public void Z() {
            this.f71503a = true;
        }

        @Override // androidx.paging.h3
        public void a() {
            this.f71504b = true;
        }

        public final boolean b() {
            return this.f71504b;
        }

        public final boolean c() {
            return this.f71503a;
        }

        public final void d(boolean z10) {
            this.f71504b = z10;
        }

        public final void e(boolean z10) {
            this.f71503a = z10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2<T> f71506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x1<T> f71507c;

        @SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,553:1\n32#2,10:554\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1\n*L\n122#1:554,10\n*E\n"})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a2<T> f71508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x1<T> f71509b;

            /* JADX INFO: renamed from: androidx.paging.a2$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0, androidx.media2.widget.f.i.f59801t0, 170, 173, 225, 228}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nPagingDataPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,553:1\n1726#2,3:554\n1855#2,2:557\n*S KotlinDebug\n*F\n+ 1 PagingDataPresenter.kt\nandroidx/paging/PagingDataPresenter$collectFrom$2$1$2\n*L\n201#1:554,3\n254#1:557,2\n*E\n"})
            static final class C0635a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f71510a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g1<T> f71511b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a2<T> f71512c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ x1<T> f71513d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0635a(g1<T> g1Var, a2<T> a2Var, x1<T> x1Var, kotlin.coroutines.d<? super C0635a> dVar) {
                    super(2, dVar);
                    this.f71511b = g1Var;
                    this.f71512c = a2Var;
                    this.f71513d = x1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0635a(this.f71511b, this.f71512c, this.f71513d, dVar);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x02ed  */
                /* JADX WARN: Code duplicated, block: B:104:0x02f7  */
                /* JADX WARN: Code duplicated, block: B:107:0x0308 A[LOOP:0: B:105:0x0302->B:107:0x0308, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:111:0x01e9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:113:? A[LOOP:1: B:61:0x01cf->B:113:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:37:0x0123 A[PHI: r9
                  0x0123: PHI (r9v5 androidx.paging.a2$c$a$a) = (r9v1 androidx.paging.a2$c$a$a), (r9v1 androidx.paging.a2$c$a$a), (r9v6 androidx.paging.a2$c$a$a) binds: [B:33:0x0114, B:35:0x011f, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x013b  */
                /* JADX WARN: Code duplicated, block: B:42:0x016e  */
                /* JADX WARN: Code duplicated, block: B:43:0x0174  */
                /* JADX WARN: Code duplicated, block: B:46:0x0179  */
                /* JADX WARN: Code duplicated, block: B:48:0x0198 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:49:0x019a  */
                /* JADX WARN: Code duplicated, block: B:57:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:60:0x01ca  */
                /* JADX WARN: Code duplicated, block: B:63:0x01d6  */
                /* JADX WARN: Code duplicated, block: B:67:0x01ed  */
                /* JADX WARN: Code duplicated, block: B:68:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:70:0x01fc  */
                /* JADX WARN: Code duplicated, block: B:72:0x01ff A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:73:0x0201  */
                /* JADX WARN: Code duplicated, block: B:79:0x0240  */
                /* JADX WARN: Code duplicated, block: B:81:0x0248  */
                /* JADX WARN: Code duplicated, block: B:82:0x025e  */
                /* JADX WARN: Code duplicated, block: B:91:0x028d A[PHI: r9
                  0x028d: PHI (r9v10 androidx.paging.a2$c$a$a) = (r9v1 androidx.paging.a2$c$a$a), (r9v1 androidx.paging.a2$c$a$a), (r9v12 androidx.paging.a2$c$a$a) binds: [B:87:0x0280, B:89:0x0289, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
                
                    if (r1.u(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L93;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x02a3, code lost:
                
                    if (r14.v(r15, r9) == r0) goto L93;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
                    /*
                        Method dump skipped, instruction units count: 810
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.a2.c.a.C0635a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0635a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(a2<T> a2Var, x1<T> x1Var) {
                this.f71508a = a2Var;
                this.f71509b = x1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull g1<T> g1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                f2 f2Var = f2.f71875a;
                if (f2Var.a(2)) {
                    f2Var.b(2, "Collected " + g1Var, null);
                }
                Object objH = kotlinx.coroutines.i.h(((a2) this.f71508a).f71490a, new C0635a(g1Var, this.f71508a, this.f71509b, null), dVar);
                return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a2<T> a2Var, x1<T> x1Var, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f71506b = a2Var;
            this.f71507c = x1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f71506b, this.f71507c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71505a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f71506b.A(this.f71507c.l());
                kotlinx.coroutines.flow.i<g1<T>> iVarJ = this.f71507c.j();
                a aVar = new a(this.f71506b, this.f71507c);
                this.f71505a = 1;
                if (iVarJ.collect(aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {478}, m = "presentNewList", n = {"this", "pages", "sourceLoadStates", "mediatorLoadStates", "newHintReceiver", "newPageStore", "placeholdersBefore", "placeholdersAfter", "dispatchLoadStates"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "Z$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f71515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f71516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f71517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f71518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f71519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f71520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f71521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f71522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f71523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a2<T> f71524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f71525l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a2<T> a2Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f71524k = a2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71523j = obj;
            this.f71525l |= Integer.MIN_VALUE;
            int i10 = 5 << 0;
            return this.f71524k.u(null, 0, 0, false, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(h3 h3Var) {
        h3 h3Var2 = this.f71492c;
        this.f71492c = h3Var;
        if (h3Var2 instanceof b) {
            b bVar = (b) h3Var2;
            if (bVar.c()) {
                h3Var.Z();
            }
            if (bVar.b()) {
                h3Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object u(List<g3<T>> list, int i10, int i11, boolean z10, z0 z0Var, z0 z0Var2, h0 h0Var, kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        p1<T> p1Var;
        h0 h0Var2;
        List<T> listH;
        List<T> listH2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i12 = dVar2.f71525l;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar2.f71525l = i12 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f71523j;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = dVar2.f71525l;
        if (i13 == 0) {
            ResultKt.m(obj);
            if (z10 && z0Var == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            this.f71497h = false;
            p1Var = new p1<>(list, i10, i11);
            p1<T> p1Var2 = this.f71493d;
            Intrinsics.checkNotNull(p1Var2, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            this.f71493d = p1Var;
            this.f71491b = h0Var;
            z1.e eVar = new z1.e(p1Var, p1Var2);
            dVar2.f71514a = this;
            dVar2.f71515b = list;
            dVar2.f71516c = z0Var;
            dVar2.f71517d = z0Var2;
            dVar2.f71518e = h0Var;
            dVar2.f71519f = p1Var;
            dVar2.f71520g = i10;
            dVar2.f71521h = i11;
            dVar2.f71522i = z10;
            dVar2.f71525l = 1;
            if (v(eVar, dVar2) == objL) {
                return objL;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = dVar2.f71522i;
            i11 = dVar2.f71521h;
            i10 = dVar2.f71520g;
            p1<T> p1Var3 = (p1) dVar2.f71519f;
            h0Var = (h0) dVar2.f71518e;
            z0Var2 = (z0) dVar2.f71517d;
            z0Var = (z0) dVar2.f71516c;
            list = (List) dVar2.f71515b;
            a2<T> a2Var = (a2) dVar2.f71514a;
            ResultKt.m(obj);
            p1Var = p1Var3;
            this = a2Var;
        }
        f2 f2Var = f2.f71875a;
        if (f2Var.a(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Presenting data (\n                            |   first item: ");
            g3 g3Var = (g3) CollectionsKt.firstOrNull((List) list);
            sb2.append((g3Var == null || (listH2 = g3Var.h()) == null) ? null : CollectionsKt.firstOrNull((List) listH2));
            sb2.append("\n                            |   last item: ");
            g3 g3Var2 = (g3) CollectionsKt.lastOrNull((List) list);
            sb2.append((g3Var2 == null || (listH = g3Var2.h()) == null) ? null : CollectionsKt.lastOrNull((List) listH));
            sb2.append("\n                            |   placeholdersBefore: ");
            sb2.append(i10);
            sb2.append("\n                            |   placeholdersAfter: ");
            sb2.append(i11);
            sb2.append("\n                            |   hintReceiver: ");
            sb2.append(h0Var);
            sb2.append("\n                            |   sourceLoadStates: ");
            sb2.append(z0Var);
            sb2.append("\n                        ");
            String string = sb2.toString();
            if (z0Var2 != null) {
                string = string + "|   mediatorLoadStates: " + z0Var2 + '\n';
            }
            f2Var.b(3, StringsKt.r(string + "|)", null, 1, null), null);
        }
        if (z10) {
            d1 d1Var = this.f71494e;
            Intrinsics.checkNotNull(z0Var);
            d1Var.i(z0Var, z0Var2);
        }
        if (p1Var.getSize() == 0 && (h0Var2 = this.f71491b) != null) {
            h0Var2.a(p1Var.m());
        }
        return Unit.f312394a;
    }

    @NotNull
    public final q0<T> B() {
        return this.f71493d.p();
    }

    public final void m(@NotNull Function1<n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71494e.b(listener);
    }

    public final void n(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71495f.add(listener);
    }

    @Nullable
    public final Object o(@NotNull x1<T> x1Var, @NotNull kotlin.coroutines.d<Unit> dVar) {
        Object objC = c3.c(this.f71496g, 0, new c(this, x1Var, null), dVar, 1, null);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @androidx.annotation.l0
    @Nullable
    public final T p(@androidx.annotation.g0(from = 0) int i10) {
        Boolean value;
        Boolean value2;
        kotlinx.coroutines.flow.k0<Boolean> k0Var = this.f71499j;
        do {
            value = k0Var.getValue();
            value.getClass();
        } while (!k0Var.compareAndSet(value, Boolean.TRUE));
        this.f71497h = true;
        this.f71498i = i10;
        f2 f2Var = f2.f71875a;
        if (f2Var.a(2)) {
            f2Var.b(2, "Accessing item index[" + i10 + AbstractJsonLexerKt.END_LIST, null);
        }
        h0 h0Var = this.f71491b;
        if (h0Var != null) {
            h0Var.a(this.f71493d.b(i10));
        }
        T tH = this.f71493d.h(i10);
        kotlinx.coroutines.flow.k0<Boolean> k0Var2 = this.f71499j;
        do {
            value2 = k0Var2.getValue();
            value2.getClass();
        } while (!k0Var2.compareAndSet(value2, Boolean.FALSE));
        return tH;
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<n> q() {
        return this.f71500k;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Unit> r() {
        return kotlinx.coroutines.flow.k.m(this.f71501l);
    }

    public final int s() {
        return this.f71493d.getSize();
    }

    @androidx.annotation.l0
    @Nullable
    public final T t(@androidx.annotation.g0(from = 0) int i10) {
        return this.f71493d.h(i10);
    }

    @Nullable
    public abstract Object v(@NotNull z1<T> z1Var, @NotNull kotlin.coroutines.d<Unit> dVar);

    public final void w() {
        f2 f2Var = f2.f71875a;
        if (f2Var.a(3)) {
            f2Var.b(3, "Refresh signal received", null);
        }
        this.f71492c.a();
    }

    public final void x(@NotNull Function1<n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71494e.h(listener);
    }

    public final void y(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71495f.remove(listener);
    }

    public final void z() {
        f2 f2Var = f2.f71875a;
        if (f2Var.a(3)) {
            f2Var.b(3, "Retry signal received", null);
        }
        this.f71492c.Z();
    }

    public a2(@NotNull CoroutineContext mainContext, @Nullable x1<T> x1Var) {
        g1.b<T> bVarC;
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.f71490a = mainContext;
        this.f71492c = new b();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f71493d = p1.f72423e.a(x1Var != null ? x1Var.c() : null);
        d1 d1Var = new d1();
        if (x1Var != null && (bVarC = x1Var.c()) != null) {
            d1Var.i(bVarC.u(), bVarC.q());
        }
        this.f71494e = d1Var;
        this.f71495f = new CopyOnWriteArrayList<>();
        this.f71496g = new c3(false, 1, defaultConstructorMarker);
        this.f71499j = kotlinx.coroutines.flow.b1.a(Boolean.FALSE);
        this.f71500k = d1Var.g();
        this.f71501l = kotlinx.coroutines.flow.q0.a(0, 64, kotlinx.coroutines.channels.j.DROP_OLDEST);
        n(new a(this));
    }

    public /* synthetic */ a2(CoroutineContext coroutineContext, x1 x1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? kotlinx.coroutines.l1.e() : coroutineContext, (i10 & 2) != 0 ? null : x1Var);
    }
}
