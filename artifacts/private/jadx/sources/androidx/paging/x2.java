package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSeparators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n1#1,608:1\n1#2:609\n1726#3,3:610\n2661#3,7:621\n116#4,8:613\n116#4,8:628\n*S KotlinDebug\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState\n*L\n264#1:610,3\n406#1:621,7\n315#1:613,8\n481#1:628,8\n*E\n"})
final class x2<R, T extends R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f3 f72711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<T, T, kotlin.coroutines.d<? super R>, Object> f72712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<g3<T>> f72713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f72714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final e1 f72716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private z0 f72717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f72718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f72719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f72720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f72721k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72722a;

        static {
            int[] iArr = new int[f3.values().length];
            try {
                iArr[f3.FULLY_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f3.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72722a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nSeparators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState$onDrop$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,608:1\n12774#2,2:609\n*S KotlinDebug\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState$onDrop$1\n*L\n508#1:609,2\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function1<g3<T>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntRange f72723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IntRange intRange) {
            super(1);
            this.f72723a = intRange;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull g3<T> stash) {
            Intrinsics.checkNotNullParameter(stash, "stash");
            int[] iArrK = stash.k();
            IntRange intRange = this.f72723a;
            boolean z10 = false;
            for (int i10 : iArrK) {
                if (intRange.t(i10)) {
                    z10 = true;
                    break;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 1, 2}, l = {214, 216, 217}, m = "onEvent", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x2<R, T> f72726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f72727d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x2<R, T> x2Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f72726c = x2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72725b = obj;
            this.f72727d |= Integer.MIN_VALUE;
            return this.f72726c.n(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9}, l = {307, 370, 382, 388, 400, com.google.api.client.http.a0.f115563p, 431, 440, 453, 464}, m = "onInsert", n = {"this", androidx.core.app.w.I0, "this", androidx.core.app.w.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "pageIndex", "this", androidx.core.app.w.I0, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "lastStash", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", net.openid.appauth.f.c.f332989a, "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", net.openid.appauth.f.c.f332989a, "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", androidx.core.app.w.I0, "outList", "stashOutList", "lastNonEmptyPage", "eventTerminatesEnd", "eventEmpty", "pageIndex", "this", androidx.core.app.w.I0, "outList", "stashOutList", "pageBefore"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f72733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f72734g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f72735h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f72736i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f72737j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f72738k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f72739l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f72740m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72741n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f72742o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ x2<R, T> f72743s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72744t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x2<R, T> x2Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f72743s = x2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72742o = obj;
            this.f72744t |= Integer.MIN_VALUE;
            return this.f72743s.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 0, 0, 0}, l = {564}, m = "onStaticList", n = {"this", androidx.core.app.w.I0, "data", "item", androidx.media3.exoplayer.upstream.h.f65997k}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f72750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ x2<R, T> f72752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f72753i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x2<R, T> x2Var, kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
            this.f72752h = x2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72751g = obj;
            this.f72753i |= Integer.MIN_VALUE;
            return this.f72752h.q(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x2(@NotNull f3 terminalSeparatorType, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        this.f72711a = terminalSeparatorType;
        this.f72712b = generator;
        this.f72713c = new ArrayList();
        this.f72716f = new e1();
    }

    private final <T> g3<T> A(g3<T> g3Var) {
        int[] iArrK = g3Var.k();
        List listListOf = CollectionsKt.listOf(CollectionsKt.first((List) g3Var.h()), CollectionsKt.last((List) g3Var.h()));
        int iJ = g3Var.j();
        List<Integer> listI = g3Var.i();
        Integer numValueOf = Integer.valueOf(listI != null ? ((Number) CollectionsKt.first((List) listI)).intValue() : 0);
        List<Integer> listI2 = g3Var.i();
        return new g3<>(iArrK, listListOf, iJ, CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, Integer.valueOf(listI2 != null ? ((Number) CollectionsKt.last((List) listI2)).intValue() : CollectionsKt.getLastIndex(g3Var.h()))}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final g1.b<R> a(@NotNull g1.b<T> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar;
    }

    public final boolean b() {
        return this.f72714d;
    }

    public final boolean c() {
        return this.f72720j;
    }

    @NotNull
    public final pj.n<T, T, kotlin.coroutines.d<? super R>, Object> d() {
        return this.f72712b;
    }

    public final boolean e() {
        return this.f72721k;
    }

    @Nullable
    public final z0 f() {
        return this.f72717g;
    }

    @NotNull
    public final List<g3<T>> g() {
        return this.f72713c;
    }

    public final int h() {
        return this.f72719i;
    }

    public final int i() {
        return this.f72718h;
    }

    @NotNull
    public final e1 j() {
        return this.f72716f;
    }

    public final boolean k() {
        return this.f72715e;
    }

    @NotNull
    public final f3 l() {
        return this.f72711a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final g1.a<R> m(@NotNull g1.a<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f72716f.f(event.m(), x0.c.f72693b.b());
        a1 a1VarM = event.m();
        a1 a1Var = a1.PREPEND;
        if (a1VarM == a1Var) {
            this.f72718h = event.q();
            this.f72721k = false;
        } else if (event.m() == a1.APPEND) {
            this.f72719i = event.q();
            this.f72720j = false;
        }
        if (this.f72713c.isEmpty()) {
            if (event.m() == a1Var) {
                this.f72715e = false;
            } else {
                this.f72714d = false;
            }
        }
        CollectionsKt.removeAll((List) this.f72713c, (Function1) new b(new IntRange(event.o(), event.n())));
        return event;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r9 == r1) goto L37;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@org.jetbrains.annotations.NotNull androidx.paging.g1<T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x2.n(androidx.paging.g1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0447  */
    /* JADX WARN: Code duplicated, block: B:136:0x047d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x047d -> B:137:0x0482). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x068c -> B:193:0x0692). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x077b -> B:217:0x077c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull androidx.paging.g1.b<T> r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1.b<R>> r29) {
        /*
            Method dump skipped, instruction units count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x2.o(androidx.paging.g1$b, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object p(@NotNull g1.c<T> cVar, @NotNull kotlin.coroutines.d<? super g1<R>> dVar) {
        z0 z0Var = this.f72717g;
        if (Intrinsics.areEqual(this.f72716f.j(), cVar.l()) && Intrinsics.areEqual(z0Var, cVar.k())) {
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
            return cVar;
        }
        this.f72716f.e(cVar.l());
        this.f72717g = cVar.k();
        if (cVar.k() != null && cVar.k().j().a()) {
            if (!Intrinsics.areEqual(z0Var != null ? z0Var.j() : null, cVar.k().j())) {
                return o(g1.b.f71933g.c(CollectionsKt.emptyList(), this.f72718h, cVar.l(), cVar.k()), dVar);
            }
        }
        if (cVar.k() != null && cVar.k().i().a()) {
            if (!Intrinsics.areEqual(z0Var != null ? z0Var.i() : null, cVar.k().i())) {
                return o(g1.b.f71933g.a(CollectionsKt.emptyList(), this.f72719i, cVar.l(), cVar.k()), dVar);
            }
        }
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a4 -> B:23:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object q(@org.jetbrains.annotations.NotNull androidx.paging.g1.d<T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g1<R>> r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x2.q(androidx.paging.g1$d, kotlin.coroutines.d):java.lang.Object");
    }

    public final void r(boolean z10) {
        this.f72714d = z10;
    }

    public final void s(boolean z10) {
        this.f72720j = z10;
    }

    public final void t(boolean z10) {
        this.f72721k = z10;
    }

    public final void u(@Nullable z0 z0Var) {
        this.f72717g = z0Var;
    }

    public final void v(int i10) {
        this.f72719i = i10;
    }

    public final void w(int i10) {
        this.f72718h = i10;
    }

    public final void x(boolean z10) {
        this.f72715e = z10;
    }

    public final <T> boolean y(@NotNull g1.b<T> bVar, @NotNull f3 terminalSeparatorType) {
        z0 z0VarQ;
        x0 x0VarI;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (bVar.p() == a1.PREPEND) {
            return this.f72714d;
        }
        int i10 = a.f72722a[terminalSeparatorType.ordinal()];
        if (i10 == 1) {
            return bVar.u().i().a() && ((z0VarQ = bVar.q()) == null || (x0VarI = z0VarQ.i()) == null || x0VarI.a());
        }
        if (i10 == 2) {
            return bVar.u().i().a();
        }
        throw new kotlin.k0();
    }

    public final <T> boolean z(@NotNull g1.b<T> bVar, @NotNull f3 terminalSeparatorType) {
        z0 z0VarQ;
        x0 x0VarJ;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (bVar.p() == a1.APPEND) {
            return this.f72715e;
        }
        int i10 = a.f72722a[terminalSeparatorType.ordinal()];
        if (i10 == 1) {
            return bVar.u().j().a() && ((z0VarQ = bVar.q()) == null || (x0VarJ = z0VarQ.j()) == null || x0VarJ.a());
        }
        if (i10 == 2) {
            return bVar.u().j().a();
        }
        throw new kotlin.k0();
    }
}
