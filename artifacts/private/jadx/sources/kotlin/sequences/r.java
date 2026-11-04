package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class r extends q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Iterator<T>> f313062a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<? extends Iterator<? extends T>> function0) {
            this.f313062a = function0;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f313062a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,22:1\n30#2:23\n*E\n"})
    public static final class b<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f313063a;

        public b(Iterator it) {
            this.f313063a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f313063a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {350}, m = "invokeSuspend", n = {"$this$sequence", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "I$0"})
    static final class c<R> extends kotlin.coroutines.jvm.internal.k implements Function2<n<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, T, C> f313069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<C, Iterator<R>> f313070g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends C> function2, Function1<? super C, ? extends Iterator<? extends R>> function1, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f313068e = sequence;
            this.f313069f = function2;
            this.f313070g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f313068e, this.f313069f, this.f313070g, dVar);
            cVar.f313067d = obj;
            return cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n nVar;
            int i10;
            Iterator it;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f313066c;
            if (i11 == 0) {
                ResultKt.m(obj);
                nVar = (n) this.f313067d;
                i10 = 0;
                it = this.f313068e.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = this.f313065b;
                it = (Iterator) this.f313064a;
                nVar = (n) this.f313067d;
                ResultKt.m(obj);
                i10 = i12;
            }
            while (it.hasNext()) {
                Object next = it.next();
                Function2<Integer, T, C> function2 = this.f313069f;
                int i13 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Iterator<R> itInvoke = this.f313070g.invoke((C) function2.invoke(kotlin.coroutines.jvm.internal.b.f(i10), (T) next));
                this.f313067d = nVar;
                this.f313064a = it;
                this.f313065b = i13;
                this.f313066c = 1;
                if (nVar.e(itInvoke, this) == objL) {
                    return objL;
                }
                i10 = i13;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n<? super R> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class d<T> extends l0 implements Function1<Sequence<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f313071a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(Sequence<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class e<T> extends l0 implements Function1<Iterable<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f313072a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(Iterable<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class f<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f313073a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class g<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<T> f313074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function0<? extends T> function0) {
            super(1);
            this.f313074a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f313074a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class h<T> extends l0 implements Function0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f313075a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t10) {
            super(0);
            this.f313075a = t10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f313075a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0, 71}, m = "invokeSuspend", n = {}, s = {})
    static final class i<T> extends kotlin.coroutines.jvm.internal.k implements Function2<n<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f313077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Sequence<T>> f313079d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> function0, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f313078c = sequence;
            this.f313079d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f313078c, this.f313079d, dVar);
            iVar.f313077b = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r7.e(r1, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r7.f(r1, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 7
                int r1 = r6.f313076a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                r5 = 0
                if (r1 == r3) goto L1b
                r5 = 7
                if (r1 != r2) goto L12
                goto L1b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 5
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                goto L52
            L1f:
                kotlin.ResultKt.m(r7)
                r5 = 1
                java.lang.Object r7 = r6.f313077b
                kotlin.sequences.n r7 = (kotlin.sequences.n) r7
                kotlin.sequences.Sequence<T> r1 = r6.f313078c
                java.util.Iterator r1 = r1.iterator()
                r5 = 0
                boolean r4 = r1.hasNext()
                r5 = 4
                if (r4 == 0) goto L3f
                r6.f313076a = r3
                r5 = 7
                java.lang.Object r6 = r7.e(r1, r6)
                if (r6 != r0) goto L52
                goto L51
            L3f:
                kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> r1 = r6.f313079d
                java.lang.Object r1 = r1.invoke()
                r5 = 2
                kotlin.sequences.Sequence r1 = (kotlin.sequences.Sequence) r1
                r6.f313076a = r2
                r5 = 3
                java.lang.Object r6 = r7.f(r1, r6)
                if (r6 != r0) goto L52
            L51:
                return r0
            L52:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.r.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n<? super T> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    static final class j<T> extends kotlin.coroutines.jvm.internal.k implements Function2<n<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f313082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.random.f f313084e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Sequence<? extends T> sequence, kotlin.random.f fVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f313083d = sequence;
            this.f313084e = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f313083d, this.f313084e, dVar);
            jVar.f313082c = obj;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listD3;
            n nVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313081b;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar2 = (n) this.f313082c;
                listD3 = t.d3(this.f313083d);
                nVar = nVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                listD3 = (List) this.f313080a;
                n nVar3 = (n) this.f313082c;
                ResultKt.m(obj);
                nVar = nVar3;
            }
            while (!listD3.isEmpty()) {
                int iM = this.f313084e.m(listD3.size());
                Object objRemoveLast = CollectionsKt.removeLast(listD3);
                if (iM < listD3.size()) {
                    objRemoveLast = listD3.set(iM, objRemoveLast);
                }
                this.f313082c = nVar;
                this.f313080a = listD3;
                this.f313081b = 1;
                if (nVar.b(objRemoveLast, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n<? super T> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.internal.f
    private static final <T> Sequence<T> d(Function0<? extends Iterator<? extends T>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new a(iterator);
    }

    @NotNull
    public static <T> Sequence<T> e(@NotNull Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> f(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof kotlin.sequences.a ? sequence : new kotlin.sequences.a(sequence);
    }

    @NotNull
    public static <T> Sequence<T> g() {
        return kotlin.sequences.g.f313018a;
    }

    @NotNull
    public static final <T, C, R> Sequence<R> h(@NotNull Sequence<? extends T> source, @NotNull Function2<? super Integer, ? super T, ? extends C> transform, @NotNull Function1<? super C, ? extends Iterator<? extends R>> iterator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return p.b(new c(source, transform, iterator, null));
    }

    @NotNull
    public static final <T> Sequence<T> i(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return j(sequence, d.f313071a);
    }

    private static final <T, R> Sequence<R> j(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        return sequence instanceof y ? ((y) sequence).e(function1) : new kotlin.sequences.i(sequence, f.f313073a, function1);
    }

    @oj.i(name = "flattenSequenceOfIterable")
    @NotNull
    public static <T> Sequence<T> k(@NotNull Sequence<? extends Iterable<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return j(sequence, e.f313072a);
    }

    @kotlin.internal.h
    @NotNull
    public static <T> Sequence<T> l(@Nullable T t10, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t10 == null ? kotlin.sequences.g.f313018a : new kotlin.sequences.j(new h(t10), nextFunction);
    }

    @NotNull
    public static <T> Sequence<T> m(@NotNull Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return f(new kotlin.sequences.j(nextFunction, new g(nextFunction)));
    }

    @NotNull
    public static <T> Sequence<T> n(@NotNull Function0<? extends T> seedFunction, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new kotlin.sequences.j(seedFunction, nextFunction);
    }

    @e1(version = "1.3")
    @NotNull
    public static final <T> Sequence<T> o(@NotNull Sequence<? extends T> sequence, @NotNull Function0<? extends Sequence<? extends T>> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return p.b(new i(sequence, defaultValue, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Sequence<T> p(Sequence<? extends T> sequence) {
        return sequence == 0 ? g() : sequence;
    }

    @NotNull
    public static <T> Sequence<T> q(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt.asSequence(elements);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> r(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return s(sequence, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> s(@NotNull Sequence<? extends T> sequence, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return p.b(new j(sequence, random, null));
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> t(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
