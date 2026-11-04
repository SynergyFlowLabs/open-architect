package kotlinx.coroutines.debug.internal;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.v0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.w2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@a1
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:640\n147#1,4:642\n152#1,5:647\n146#1:652\n147#1,4:654\n152#1,5:659\n1#2:617\n1#2:641\n1#2:653\n774#3:618\n865#3,2:619\n1216#3,2:621\n1246#3,4:623\n1863#3,2:667\n360#3,7:675\n1827#3,8:682\n607#4:627\n607#4:646\n607#4:658\n607#4:664\n1317#4,2:665\n37#5:628\n36#5,3:629\n37#5:632\n36#5,3:633\n37#5:636\n36#5,3:637\n1682#6,6:669\n1790#6,6:690\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:640\n241#1:642,4\n241#1:647,5\n248#1:652\n248#1:654,4\n248#1:659,5\n241#1:641\n248#1:653\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:667,2\n412#1:675,7\n502#1:682,8\n150#1:627\n241#1:646\n248#1:658\n283#1:664\n284#1:665,2\n207#1:628\n207#1:629,3\n208#1:632\n208#1:633,3\n209#1:636\n209#1:637,3\n351#1:669,6\n554#1:690,6\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f313979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final StackTraceElement f313980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final SimpleDateFormat f313981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static Thread f313982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.debug.internal.f<a<?>, Boolean> f313983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicInteger f313984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLong f313985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f313986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f313987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f313988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private static final Function1<Boolean, Unit> f313989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.debug.internal.f<kotlin.coroutines.jvm.internal.e, i> f313990l;

    public static final class a<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final kotlin.coroutines.d<T> f313991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public final i f313992b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull kotlin.coroutines.d<? super T> dVar, @NotNull i iVar) {
            this.f313991a = dVar;
            this.f313992b = iVar;
        }

        private final s a() {
            return this.f313992b.d();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @Nullable
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            s sVarA = a();
            if (sVarA != null) {
                return sVarA.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        @NotNull
        public CoroutineContext getContext() {
            return this.f313991a.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.e
        @Nullable
        public StackTraceElement getStackTraceElement() {
            s sVarA = a();
            if (sVarA != null) {
                return sVarA.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@NotNull Object obj) {
            m.f313979a.J(this);
            this.f313991a.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f313991a.toString();
        }
    }

    @SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n241#3:618\n*E\n"})
    public static final class b implements Function1<a<?>, h> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h invoke(a<?> aVar) {
            CoroutineContext coroutineContextC;
            if (m.f313979a.D(aVar) || (coroutineContextC = aVar.f313992b.c()) == null) {
                return null;
            }
            return new h(aVar.f313992b, coroutineContextC);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n150#2:103\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Long.valueOf(((a) t10).f313992b.f313963b), Long.valueOf(((a) t11).f313992b.f313963b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
    public static final class d<R> implements Function1<a<?>, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<a<?>, CoroutineContext, R> f313993a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
            this.f313993a = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final R invoke(a<?> aVar) {
            CoroutineContext coroutineContextC;
            if (m.f313979a.D(aVar) || (coroutineContextC = aVar.f313992b.c()) == null) {
                return null;
            }
            return this.f313993a.invoke(aVar, coroutineContextC);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n283#2:103\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Long.valueOf(((a) t10).f313992b.f313963b), Long.valueOf(((a) t11).f313992b.f313963b));
        }
    }

    @SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n248#3:618\n*E\n"})
    public static final class f implements Function1<a<?>, p> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p invoke(a<?> aVar) {
            CoroutineContext coroutineContextC;
            if (m.f313979a.D(aVar) || (coroutineContextC = aVar.f313992b.c()) == null) {
                return null;
            }
            return new p(aVar.f313992b, coroutineContextC);
        }
    }

    static {
        m mVar = new m();
        f313979a = mVar;
        f313980b = new _COROUTINE.a().b();
        f313981c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f313983e = new kotlinx.coroutines.debug.internal.f<>(false, 1, null);
        f313984f = new AtomicInteger(0);
        f313985g = new AtomicLong(0L);
        f313986h = true;
        f313988j = true;
        f313989k = mVar.v();
        f313990l = new kotlinx.coroutines.debug.internal.f<>(true);
    }

    private m() {
    }

    private final /* synthetic */ AtomicLong A() {
        return f313985g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(a<?> aVar) {
        p2 p2Var;
        CoroutineContext coroutineContextC = aVar.f313992b.c();
        if (coroutineContextC == null || (p2Var = (p2) coroutineContextC.get(p2.M2)) == null || !p2Var.x()) {
            return false;
        }
        f313983e.remove(aVar);
        return true;
    }

    private final boolean F(StackTraceElement stackTraceElement) {
        return StringsKt.u2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final a<?> G(kotlin.coroutines.d<?> dVar) {
        kotlin.coroutines.jvm.internal.e eVar = dVar instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) dVar : null;
        if (eVar != null) {
            return H(eVar);
        }
        return null;
    }

    private final a<?> H(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof a)) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        }
        return (a) eVar;
    }

    private final void I(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(a<?> aVar) {
        kotlin.coroutines.jvm.internal.e eVarN;
        f313983e.remove(aVar);
        kotlin.coroutines.jvm.internal.e eVarF = aVar.f313992b.f();
        if (eVarF != null && (eVarN = N(eVarF)) != null) {
            f313990l.remove(eVarN);
        }
    }

    private final kotlin.coroutines.jvm.internal.e N(kotlin.coroutines.jvm.internal.e eVar) {
        do {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        } while (eVar.getStackTraceElement() == null);
        return eVar;
    }

    private final <T extends Throwable> List<StackTraceElement> O(T t10) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i10 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        int i12 = i10 + 1;
        if (!f313986h) {
            int i13 = length - i12;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(stackTrace[i14 + i12]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i12) + 1);
        while (i12 < length) {
            if (F(stackTrace[i12])) {
                arrayList2.add(stackTrace[i12]);
                int i15 = i12 + 1;
                while (i15 < length && F(stackTrace[i15])) {
                    i15++;
                }
                int i16 = i15 - 1;
                int i17 = i16;
                while (i17 > i12 && stackTrace[i17].getFileName() == null) {
                    i17--;
                }
                if (i17 > i12 && i17 < i16) {
                    arrayList2.add(stackTrace[i17]);
                }
                arrayList2.add(stackTrace[i16]);
                i12 = i15;
            } else {
                arrayList2.add(stackTrace[i12]);
                i12++;
            }
        }
        return arrayList2;
    }

    private final void S() {
        f313982d = kotlin.concurrent.b.c(false, true, null, "Coroutines Debugger Cleaner", 0, new Function0() { // from class: kotlinx.coroutines.debug.internal.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.T();
            }
        }, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T() {
        f313990l.o();
        return Unit.f312394a;
    }

    private final void U() throws InterruptedException {
        Thread thread = f313982d;
        if (thread == null) {
            return;
        }
        f313982d = null;
        thread.interrupt();
        thread.join();
    }

    private final s V(List<StackTraceElement> list) {
        s sVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                sVar = new s(sVar, listIterator.previous());
            }
        }
        return new s(sVar, f313980b);
    }

    private final String W(Object obj) {
        return n.b(obj.toString());
    }

    private final void Y(kotlin.coroutines.jvm.internal.e eVar, String str) {
        boolean z10;
        if (E()) {
            kotlinx.coroutines.debug.internal.f<kotlin.coroutines.jvm.internal.e, i> fVar = f313990l;
            i iVarRemove = fVar.remove(eVar);
            if (iVarRemove == null) {
                a<?> aVarH = H(eVar);
                if (aVarH != null && (iVarRemove = aVarH.f313992b) != null) {
                    kotlin.coroutines.jvm.internal.e eVarF = iVarRemove.f();
                    kotlin.coroutines.jvm.internal.e eVarN = eVarF != null ? N(eVarF) : null;
                    if (eVarN != null) {
                        fVar.remove(eVarN);
                    }
                    z10 = true;
                }
                return;
            }
            z10 = false;
            Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            iVarRemove.j(str, (kotlin.coroutines.d) eVar, z10);
            kotlin.coroutines.jvm.internal.e eVarN2 = N(eVar);
            if (eVarN2 == null) {
                return;
            }
            fVar.put(eVarN2, iVarRemove);
        }
    }

    private final void Z(kotlin.coroutines.d<?> dVar, String str) {
        if (E()) {
            if (f313988j && dVar.getContext() == kotlin.coroutines.h.f312451a) {
                return;
            }
            if (Intrinsics.areEqual(str, j.f313977b)) {
                kotlin.coroutines.jvm.internal.e eVar = dVar instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) dVar : null;
                if (eVar == null) {
                    return;
                }
                Y(eVar, str);
                return;
            }
            a<?> aVarG = G(dVar);
            if (aVarG == null) {
                return;
            }
            a0(aVarG, dVar, str);
        }
    }

    private final void a0(a<?> aVar, kotlin.coroutines.d<?> dVar, String str) {
        if (E()) {
            aVar.f313992b.j(str, dVar, true);
        }
    }

    private final void e(p2 p2Var, Map<p2, i> map, StringBuilder sb2, String str) {
        i iVar = map.get(p2Var);
        if (iVar != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) CollectionsKt.firstOrNull((List) iVar.h());
            sb2.append(str + t(p2Var) + ", continuation is " + iVar.g() + " at line " + stackTraceElement + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        } else if (!(p2Var instanceof v0)) {
            sb2.append(str + t(p2Var) + '\n');
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append('\t');
            str = sb4.toString();
        }
        Iterator<p2> it = p2Var.r0().iterator();
        while (it.hasNext()) {
            e(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.d<T> f(kotlin.coroutines.d<? super T> dVar, s sVar) {
        if (!E()) {
            return dVar;
        }
        a<?> aVar = new a<>(dVar, new i(dVar.getContext(), sVar, A().incrementAndGet()));
        kotlinx.coroutines.debug.internal.f<a<?>, Boolean> fVar = f313983e;
        fVar.put(aVar, Boolean.TRUE);
        if (!E()) {
            fVar.clear();
        }
        return aVar;
    }

    private final <R> List<R> j(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
        if (E()) {
            return kotlin.sequences.o.c3(kotlin.sequences.o.p1(kotlin.sequences.o.K2(CollectionsKt.asSequence(s()), new c()), new d(function2)));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    private final void k(PrintStream printStream) {
        if (!E()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + f313981c.format(Long.valueOf(System.currentTimeMillis())));
        for (a aVar : kotlin.sequences.o.K2(kotlin.sequences.o.p0(CollectionsKt.asSequence(s()), new Function1() { // from class: kotlinx.coroutines.debug.internal.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.l((m.a) obj));
            }
        }), new e())) {
            i iVar = aVar.f313992b;
            List<StackTraceElement> listH = iVar.h();
            m mVar = f313979a;
            List<StackTraceElement> listP = mVar.p(iVar.g(), iVar.lastObservedThread, listH);
            printStream.print("\n\nCoroutine " + aVar.f313991a + ", state: " + ((Intrinsics.areEqual(iVar.g(), j.f313977b) && listP == listH) ? iVar.g() + " (Last suspension stacktrace, not an actual stacktrace)" : iVar.g()));
            if (listH.isEmpty()) {
                printStream.print("\n\tat " + f313980b);
                mVar.I(printStream, iVar.e());
            } else {
                mVar.I(printStream, listP);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(a aVar) {
        return !f313979a.D(aVar);
    }

    private final List<StackTraceElement> p(String str, Thread thread, List<StackTraceElement> list) {
        Object objM785constructorimpl;
        if (Intrinsics.areEqual(str, j.f313977b) && thread != null) {
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(thread.getStackTrace());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m786isFailureimpl(objM785constructorimpl)) {
                objM785constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM785constructorimpl;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i10];
                    if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i10++;
                }
                Pair<Integer, Integer> pairQ = q(i10, stackTraceElementArr, list);
                int iIntValue = pairQ.component1().intValue();
                int iIntValue2 = pairQ.component2().intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i10) - iIntValue) - 1) - iIntValue2);
                    int i11 = i10 - iIntValue2;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(stackTraceElementArr[i12]);
                    }
                    int size = list.size();
                    for (int i13 = iIntValue + 1; i13 < size; i13++) {
                        arrayList.add(list.get(i13));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    private final Pair<Integer, Integer> q(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i11 = 0; i11 < 3; i11++) {
            int iR = f313979a.r((i10 - 1) - i11, stackTraceElementArr, list);
            if (iR != -1) {
                return TuplesKt.to(Integer.valueOf(iR), Integer.valueOf(i11));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int r(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(stackTraceElementArr, i10);
        if (stackTraceElement == null) {
            return -1;
        }
        int i11 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private final Set<a<?>> s() {
        return f313983e.keySet();
    }

    private final String t(p2 p2Var) {
        return p2Var instanceof w2 ? ((w2) p2Var).W1() : p2Var.toString();
    }

    private static /* synthetic */ void u(p2 p2Var) {
    }

    private final Function1<Boolean, Unit> v() {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM785constructorimpl = Result.m785constructorimpl((Function1) r1.q(objNewInstance, 1));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        return (Function1) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }

    private final /* synthetic */ AtomicInteger y() {
        return f313984f;
    }

    @NotNull
    public final String B(@NotNull p2 p2Var) {
        if (!E()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<a<?>> setS = s();
        ArrayList<a> arrayList = new ArrayList();
        for (Object obj : setS) {
            if (((a) obj).f313991a.getContext().get(p2.M2) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (a aVar : arrayList) {
            linkedHashMap.put(s2.A(aVar.f313991a.getContext()), aVar.f313992b);
        }
        StringBuilder sb2 = new StringBuilder();
        f313979a.e(p2Var, linkedHashMap, sb2, "");
        return sb2.toString();
    }

    public final void C() {
        Function1<Boolean, Unit> function1;
        if (y().incrementAndGet() > 1) {
            return;
        }
        S();
        if (kotlinx.coroutines.debug.internal.a.f313925a.a() || (function1 = f313989k) == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    @oj.i(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean E() {
        return y().get() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> kotlin.coroutines.d<T> K(@NotNull kotlin.coroutines.d<? super T> dVar) {
        if (E() && (!(f313988j && dVar.getContext() == kotlin.coroutines.h.f312451a) && G(dVar) == null)) {
            return f(dVar, f313987i ? V(O(new Exception())) : null);
        }
        return dVar;
    }

    public final void L(@NotNull kotlin.coroutines.d<?> dVar) {
        Z(dVar, j.f313977b);
    }

    public final void M(@NotNull kotlin.coroutines.d<?> dVar) {
        Z(dVar, j.f313978c);
    }

    public final void P(boolean z10) {
        f313987i = z10;
    }

    public final void Q(boolean z10) {
        f313988j = z10;
    }

    public final void R(boolean z10) {
        f313986h = z10;
    }

    public final void X() throws InterruptedException {
        Function1<Boolean, Unit> function1;
        if (!E()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (y().decrementAndGet() == 0) {
            U();
            f313983e.clear();
            f313990l.clear();
            if (!kotlinx.coroutines.debug.internal.a.f313925a.a() && (function1 = f313989k) != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
    }

    @oj.i(name = "dumpCoroutines")
    public final void g(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            try {
                f313979a.k(printStream);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final List<h> h() {
        if (E()) {
            return kotlin.sequences.o.c3(kotlin.sequences.o.p1(kotlin.sequences.o.K2(CollectionsKt.asSequence(s()), new c()), new b()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final Object[] i() {
        String strT;
        List<h> listH = h();
        int size = listH.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (h hVar : listH) {
            CoroutineContext coroutineContextA = hVar.a();
            r0 r0Var = (r0) coroutineContextA.get(r0.f315206b);
            Long lValueOf = null;
            String strW = (r0Var == null || (strT = r0Var.T()) == null) ? null : W(strT);
            n0 n0Var = (n0) coroutineContextA.get(n0.f315180a);
            String strW2 = n0Var != null ? W(n0Var) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"name\": ");
            sb2.append(strW);
            sb2.append(",\n                    \"id\": ");
            q0 q0Var = (q0) coroutineContextA.get(q0.f315202b);
            if (q0Var != null) {
                lValueOf = Long.valueOf(q0Var.T());
            }
            sb2.append(lValueOf);
            sb2.append(",\n                    \"dispatcher\": ");
            sb2.append(strW2);
            sb2.append(",\n                    \"sequenceNumber\": ");
            sb2.append(hVar.f());
            sb2.append(",\n                    \"state\": \"");
            sb2.append(hVar.g());
            sb2.append("\"\n                } \n                ");
            arrayList3.add(StringsKt.p(sb2.toString()));
            arrayList2.add(hVar.d());
            arrayList.add(hVar.e());
        }
        return new Object[]{AbstractJsonLexerKt.BEGIN_LIST + CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST, arrayList.toArray(new Thread[0]), arrayList2.toArray(new kotlin.coroutines.jvm.internal.e[0]), listH.toArray(new h[0])};
    }

    @NotNull
    public final List<p> m() {
        if (E()) {
            return kotlin.sequences.o.c3(kotlin.sequences.o.p1(kotlin.sequences.o.K2(CollectionsKt.asSequence(s()), new c()), new f()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final List<StackTraceElement> n(@NotNull h hVar, @NotNull List<StackTraceElement> list) {
        return p(hVar.g(), hVar.e(), list);
    }

    @NotNull
    public final String o(@NotNull h hVar) {
        List<StackTraceElement> listN = n(hVar, hVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listN) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? W(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(StringsKt.p(sb2.toString()));
        }
        return AbstractJsonLexerKt.BEGIN_LIST + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST;
    }

    public final boolean w() {
        return f313987i;
    }

    public final boolean x() {
        return f313988j;
    }

    public final boolean z() {
        return f313986h;
    }
}
