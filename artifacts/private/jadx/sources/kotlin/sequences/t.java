package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.t1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.text.StringsKt;
import kotlin.u0;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n183#1,2:3113\n320#1,7:3115\n1328#1,3:3123\n743#1,4:3126\n708#1,4:3130\n726#1,4:3134\n779#1,4:3138\n1021#1,3:3142\n1024#1,3:3152\n1041#1,3:3155\n1044#1,3:3165\n1328#1,3:3182\n1317#1,2:3185\n1#2:3122\n381#3,7:3145\n381#3,7:3158\n381#3,7:3168\n381#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3113,2\n103#1:3115,7\n462#1:3123,3\n662#1:3126,4\n678#1:3130,4\n693#1:3134,4\n764#1:3138,4\n992#1:3142,3\n992#1:3152,3\n1007#1:3155,3\n1007#1:3165,3\n1110#1:3182,3\n1148#1:3185,2\n992#1:3145,7\n1007#1:3158,7\n1023#1:3168,7\n1043#1:3175,7\n*E\n"})
public class t extends kotlin.sequences.s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,17:1\n2921#2:18\n*E\n"})
    public static final class a<T> implements Iterable<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f313086a;

        public a(Sequence sequence) {
            this.f313086a = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f313086a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a0<T> extends l0 implements Function2<T, T, Pair<? extends T, ? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a0 f313087a = new a0();

        a0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pair<T, T> invoke(T t10, T t11) {
            return TuplesKt.to(t10, t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f313088a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", "iterator", t1.b.f296120h}, s = {"L$0", "L$1", "L$2"})
    static final class b0<R> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, R> f313094f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(Sequence<? extends T> sequence, Function2<? super T, ? super T, ? extends R> function2, kotlin.coroutines.d<? super b0> dVar) {
            super(2, dVar);
            this.f313093e = sequence;
            this.f313094f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b0 b0Var = new b0(this.f313093e, this.f313094f, dVar);
            b0Var.f313092d = obj;
            return b0Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0068 A[RETURN] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0066 -> B:6:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 5
                int r1 = r7.f313091c
                r2 = 4
                r2 = 1
                r6 = 3
                if (r1 == 0) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f313090b
                java.lang.Object r3 = r7.f313089a
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.f313092d
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                kotlin.ResultKt.m(r8)
            L1b:
                r8 = r1
                r8 = r1
                r6 = 2
                goto L46
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L27:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f313092d
                kotlin.sequences.n r8 = (kotlin.sequences.n) r8
                kotlin.sequences.Sequence<T> r1 = r7.f313093e
                r6 = 0
                java.util.Iterator r1 = r1.iterator()
                boolean r3 = r1.hasNext()
                if (r3 != 0) goto L3e
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L3e:
                java.lang.Object r3 = r1.next()
                r4 = r8
                r4 = r8
                r8 = r3
                r3 = r1
            L46:
                r6 = 2
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L69
                java.lang.Object r1 = r3.next()
                kotlin.jvm.functions.Function2<T, T, R> r5 = r7.f313094f
                java.lang.Object r8 = r5.invoke(r8, r1)
                r6 = 4
                r7.f313092d = r4
                r7.f313089a = r3
                r7.f313090b = r1
                r6 = 7
                r7.f313091c = r2
                java.lang.Object r8 = r4.b(r8, r7)
                r6 = 1
                if (r8 != r0) goto L1b
                return r0
            L69:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 6
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.t.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super R> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b0) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends l0 implements Function1<Integer, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f313095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(1);
            this.f313095a = i10;
        }

        public final T invoke(int i10) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f313095a + '.');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class d<T> extends l0 implements Function1<IndexedValue<? extends T>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, T, Boolean> f313096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Integer, ? super T, Boolean> function2) {
            super(1);
            this.f313096a = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(IndexedValue<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f313096a.invoke(Integer.valueOf(it.getIndex()), it.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class e<T> extends l0 implements Function1<IndexedValue<? extends T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f313097a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final T invoke(IndexedValue<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }
    }

    public static final class f extends l0 implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f313098a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.reifiedOperationMarker(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class g<T> extends l0 implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f313099a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* synthetic */ class h<R> extends g0 implements Function1<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f313100a = new h();

        h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* synthetic */ class i<R> extends g0 implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f313101a = new i();

        i() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Sequence<? extends R> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* synthetic */ class j<R> extends g0 implements Function1<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f313102a = new j();

        j() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* synthetic */ class k<R> extends g0 implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f313103a = new k();

        k() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Sequence<? extends R> p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    public static final class l<K, T> implements Grouping<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, K> f313105b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
            this.f313104a = sequence;
            this.f313105b = function1;
        }

        @Override // kotlin.collections.Grouping
        public K keyOf(T t10) {
            return this.f313105b.invoke(t10);
        }

        @Override // kotlin.collections.Grouping
        public Iterator<T> sourceIterator() {
            return this.f313104a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class m<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f313107b;

        static final class a extends l0 implements Function1<T, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.a f313108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f313109b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i1.a aVar, T t10) {
                super(1);
                this.f313108a = aVar;
                this.f313109b = t10;
                int i10 = 2 >> 1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(T t10) {
                boolean z10 = true;
                if (!this.f313108a.f312744a && Intrinsics.areEqual(t10, this.f313109b)) {
                    this.f313108a.f312744a = true;
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        m(Sequence<? extends T> sequence, T t10) {
            this.f313106a = sequence;
            this.f313107b = t10;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return t.p0(this.f313106a, new a(new i1.a(), this.f313107b)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class n<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T[] f313111b;

        static final class a extends l0 implements Function1<T, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ T[] f313112a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T[] tArr) {
                super(1);
                this.f313112a = tArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(T t10) {
                return Boolean.valueOf(ArraysKt.contains(this.f313112a, t10));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(Sequence<? extends T> sequence, T[] tArr) {
            this.f313110a = sequence;
            this.f313111b = tArr;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return t.u0(this.f313110a, new a(this.f313111b)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class o<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable<T> f313113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313114b;

        static final class a extends l0 implements Function1<T, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Collection<T> f313115a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Collection<? extends T> collection) {
                super(1);
                this.f313115a = collection;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(T t10) {
                return Boolean.valueOf(this.f313115a.contains(t10));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        o(Iterable<? extends T> iterable, Sequence<? extends T> sequence) {
            this.f313113a = iterable;
            this.f313114b = sequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            Collection collectionConvertToListIfNotCollection = CollectionsKt.convertToListIfNotCollection(this.f313113a);
            return collectionConvertToListIfNotCollection.isEmpty() ? this.f313114b.iterator() : t.u0(this.f313114b, new a(collectionConvertToListIfNotCollection)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class p<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313117b;

        static final class a extends l0 implements Function1<T, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<T> f313118a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends T> list) {
                super(1);
                this.f313118a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(T t10) {
                return Boolean.valueOf(this.f313118a.contains(t10));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(Sequence<? extends T> sequence, Sequence<? extends T> sequence2) {
            this.f313116a = sequence;
            this.f313117b = sequence2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            List listC3 = t.c3(this.f313116a);
            return listC3.isEmpty() ? this.f313117b.iterator() : t.u0(this.f313117b, new a(listC3)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class q<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f313119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function1<? super T, Unit> function1) {
            super(1);
            this.f313119a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            this.f313119a.invoke(t10);
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class r<T> extends l0 implements Function2<Integer, T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, T, Unit> f313120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(Function2<? super Integer, ? super T, Unit> function2) {
            super(2);
            this.f313120a = function2;
        }

        public final T c(int i10, T t10) {
            this.f313120a.invoke(Integer.valueOf(i10), t10);
            return t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return c(num.intValue(), obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class s<T> extends l0 implements Function1<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(Sequence<? extends T> sequence) {
            super(1);
            this.f313121a = sequence;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            if (t10 != null) {
                return t10;
            }
            throw new IllegalArgumentException("null element found in " + this.f313121a + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.t$t, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2311, 2315}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    static final class C2263t<R> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ R f313126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<R, T, R> f313128g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2263t(R r10, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, kotlin.coroutines.d<? super C2263t> dVar) {
            super(2, dVar);
            this.f313126e = r10;
            this.f313127f = sequence;
            this.f313128g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2263t c2263t = new C2263t(this.f313126e, this.f313127f, this.f313128g, dVar);
            c2263t.f313125d = obj;
            return c2263t;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0060  */
        /* JADX WARN: Code duplicated, block: B:20:0x007c  */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            if (r1.b(r8, r7) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
        
            if (r4.b(r3, r7) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            return r0;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0079 -> B:7:0x001f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f313124c
                r6 = 2
                r2 = 2
                r3 = 1
                r6 = r3
                if (r1 == 0) goto L36
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L22
                java.lang.Object r1 = r7.f313123b
                java.util.Iterator r1 = (java.util.Iterator) r1
                r6 = 0
                java.lang.Object r3 = r7.f313122a
                r6 = 7
                java.lang.Object r4 = r7.f313125d
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                kotlin.ResultKt.m(r8)
            L1f:
                r8 = r3
                r8 = r3
                goto L59
            L22:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "/es//tnreclbseee/i/ok/m oohf/a  ooilt u iwntvce/r r"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2c:
                java.lang.Object r1 = r7.f313125d
                r6 = 6
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                r6 = 3
                kotlin.ResultKt.m(r8)
                goto L4e
            L36:
                r6 = 2
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f313125d
                r1 = r8
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                r6 = 5
                R r8 = r7.f313126e
                r7.f313125d = r1
                r7.f313124c = r3
                r6 = 5
                java.lang.Object r8 = r1.b(r8, r7)
                if (r8 != r0) goto L4e
                goto L7b
            L4e:
                r6 = 7
                R r8 = r7.f313126e
                kotlin.sequences.Sequence<T> r3 = r7.f313127f
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L59:
                r6 = 4
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L7c
                r6 = 4
                java.lang.Object r3 = r1.next()
                kotlin.jvm.functions.Function2<R, T, R> r5 = r7.f313128g
                java.lang.Object r3 = r5.invoke(r8, r3)
                r7.f313125d = r4
                r7.f313122a = r3
                r6 = 2
                r7.f313123b = r1
                r7.f313124c = r2
                java.lang.Object r8 = r4.b(r3, r7)
                r6 = 1
                if (r8 != r0) goto L1f
            L7b:
                return r0
            L7c:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.t.C2263t.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super R> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2263t) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2339, 2344}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$0", "L$1", "I$0"})
    static final class u<R> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f313133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ R f313134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ pj.n<Integer, R, T, R> f313136h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(R r10, Sequence<? extends T> sequence, pj.n<? super Integer, ? super R, ? super T, ? extends R> nVar, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.f313134f = r10;
            this.f313135g = sequence;
            this.f313136h = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            u uVar = new u(this.f313134f, this.f313135g, this.f313136h, dVar);
            uVar.f313133e = obj;
            return uVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0077  */
        /* JADX WARN: Code duplicated, block: B:23:0x0096 A[LOOP:0: B:15:0x0064->B:23:0x0096, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:27:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
        
            if (r1.b(r10, r9) == r0) goto L22;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r8 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f313132d
                r2 = 2
                r3 = 1
                r8 = r3
                if (r1 == 0) goto L3f
                r8 = 6
                if (r1 == r3) goto L35
                if (r1 != r2) goto L29
                int r1 = r9.f313131c
                java.lang.Object r3 = r9.f313130b
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r9.f313129a
                r8 = 2
                java.lang.Object r5 = r9.f313133e
                r8 = 5
                kotlin.sequences.n r5 = (kotlin.sequences.n) r5
                r8 = 3
                kotlin.ResultKt.m(r10)
                r10 = r4
                r10 = r4
                r8 = 5
                r4 = r1
                r4 = r1
                goto L64
            L29:
                r8 = 1
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "v/sr /o/w/ote/toro/nt//eiu e cebl ncla erimhskuf ei"
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r8 = 0
                r9.<init>(r10)
                throw r9
            L35:
                r8 = 7
                java.lang.Object r1 = r9.f313133e
                r8 = 3
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                kotlin.ResultKt.m(r10)
                goto L58
            L3f:
                r8 = 0
                kotlin.ResultKt.m(r10)
                java.lang.Object r10 = r9.f313133e
                r1 = r10
                r8 = 6
                kotlin.sequences.n r1 = (kotlin.sequences.n) r1
                R r10 = r9.f313134f
                r9.f313133e = r1
                r8 = 4
                r9.f313132d = r3
                java.lang.Object r10 = r1.b(r10, r9)
                r8 = 0
                if (r10 != r0) goto L58
                goto L95
            L58:
                R r10 = r9.f313134f
                r8 = 1
                kotlin.sequences.Sequence<T> r3 = r9.f313135g
                r8 = 2
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r1
            L64:
                r8 = 6
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L9a
                java.lang.Object r1 = r3.next()
                r8 = 2
                pj.n<java.lang.Integer, R, T, R> r6 = r9.f313136h
                int r7 = r4 + 1
                r8 = 1
                if (r4 >= 0) goto L7b
                r8 = 0
                kotlin.collections.CollectionsKt.throwIndexOverflow()
            L7b:
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
                r8 = 1
                java.lang.Object r4 = r6.invoke(r4, r10, r1)
                r9.f313133e = r5
                r9.f313129a = r4
                r9.f313130b = r3
                r9.f313131c = r7
                r9.f313132d = r2
                java.lang.Object r10 = r5.b(r4, r9)
                r8 = 3
                if (r10 != r0) goto L96
            L95:
                return r0
            L96:
                r10 = r4
                r8 = 0
                r4 = r7
                goto L64
            L9a:
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.t.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super R> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2368, 2371}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class v<S> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super S>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<S, T, S> f313142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> function2, kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
            this.f313141e = sequence;
            this.f313142f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            v vVar = new v(this.f313141e, this.f313142f, dVar);
            vVar.f313140d = obj;
            return vVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.n nVar;
            Object next;
            Iterator it;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313139c;
            if (i10 == 0) {
                ResultKt.m(obj);
                nVar = (kotlin.sequences.n) this.f313140d;
                Iterator it2 = this.f313141e.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f313140d = nVar;
                    this.f313137a = it2;
                    this.f313138b = next;
                    this.f313139c = 1;
                    if (nVar.b(next, this) != objL) {
                        it = it2;
                    }
                    return objL;
                }
                return Unit.f312394a;
            }
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f313138b;
            it = (Iterator) this.f313137a;
            nVar = (kotlin.sequences.n) this.f313140d;
            ResultKt.m(obj);
            while (it.hasNext()) {
                next = this.f313142f.invoke((S) next, (T) it.next());
                this.f313140d = nVar;
                this.f313137a = it;
                this.f313138b = next;
                this.f313139c = 2;
                if (nVar.b(next, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super S> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((v) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2397, 2401}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    static final class w<S> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super S>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f313147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<Integer, S, T, S> f313149g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(Sequence<? extends T> sequence, pj.n<? super Integer, ? super S, ? super T, ? extends S> nVar, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f313148f = sequence;
            this.f313149g = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f313148f, this.f313149g, dVar);
            wVar.f313147e = obj;
            return wVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.n nVar;
            Iterator it;
            Object next;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313146d;
            int i11 = 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                nVar = (kotlin.sequences.n) this.f313147e;
                it = this.f313148f.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f313147e = nVar;
                    this.f313143a = it;
                    this.f313144b = next;
                    this.f313146d = 1;
                    if (nVar.b(next, this) != objL) {
                    }
                    return objL;
                }
                return Unit.f312394a;
            }
            if (i10 == 1) {
                next = this.f313144b;
                it = (Iterator) this.f313143a;
                nVar = (kotlin.sequences.n) this.f313147e;
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = this.f313145c;
                Object obj2 = this.f313144b;
                it = (Iterator) this.f313143a;
                nVar = (kotlin.sequences.n) this.f313147e;
                ResultKt.m(obj);
                i11 = i12;
                next = obj2;
            }
            while (it.hasNext()) {
                pj.n<Integer, S, T, S> nVar2 = this.f313149g;
                int i13 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                S sInvoke = nVar2.invoke(kotlin.coroutines.jvm.internal.b.f(i11), (S) next, (T) it.next());
                this.f313147e = nVar;
                this.f313143a = it;
                this.f313144b = sInvoke;
                this.f313145c = i13;
                this.f313146d = 2;
                if (nVar.b(sInvoke, this) == objL) {
                    return objL;
                }
                next = sInvoke;
                i11 = i13;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super S> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class x<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313150a;

        /* JADX WARN: Multi-variable type inference failed */
        x(Sequence<? extends T> sequence) {
            this.f313150a = sequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            List listD3 = t.d3(this.f313150a);
            CollectionsKt.sort(listD3);
            return listD3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class y<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f313151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super T> f313152b;

        /* JADX WARN: Multi-variable type inference failed */
        y(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
            this.f313151a = sequence;
            this.f313152b = comparator;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            List listD3 = t.d3(this.f313151a);
            CollectionsKt.sortWith(listD3, this.f313152b);
            return listD3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    static final class z<R, T> extends l0 implements Function2<T, R, Pair<? extends T, ? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f313153a = new z();

        z() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Pair<T, R> invoke(T t10, R r10) {
            return TuplesKt.to(t10, r10);
        }
    }

    @kotlin.internal.f
    private static final <T> T A0(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        int i10 = 4 | 0;
        for (T t11 : sequence) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R A1(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> A2(@NotNull Sequence<? extends T> sequence, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return w2(sequence, r10, operation);
    }

    public static <T> T B0(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R B1(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> B2(@NotNull Sequence<? extends T> sequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return x2(sequence, r10, operation);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T C0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T C1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> T C2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R D0(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        do {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
        } while (rInvoke == null);
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double D1(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <T> T D2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : sequence) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z10 = true;
                int i10 = 2 | 1;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @e1(version = "1.5")
    @kotlin.internal.f
    private static final <T, R> R E0(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float E1(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Nullable
    public static final <T> T E2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @Nullable
    public static <T> T F0(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final double F1(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @Nullable
    public static final <T> T F2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : sequence) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T G0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final float G1(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> G2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new x(sequence);
    }

    @NotNull
    public static final <T, R> Sequence<R> H0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new kotlin.sequences.i(sequence, transform, i.f313101a);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T H1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> H2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return K2(sequence, new kotlin.comparisons.g.a(selector));
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapIndexedIterable")
    public static final <T, R> Sequence<R> I0(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return kotlin.sequences.r.h(sequence, transform, j.f313102a);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T> T I1(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> I2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return K2(sequence, new kotlin.comparisons.g.c(selector));
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C J0(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final <T> T J1(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> J2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return K2(sequence, kotlin.comparisons.a.x());
    }

    public static final <T> boolean K(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapIndexedSequence")
    public static final <T, R> Sequence<R> K0(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return kotlin.sequences.r.h(sequence, transform, k.f313103a);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @e1(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T K1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @NotNull
    public static <T> Sequence<T> K2(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new y(sequence, comparator);
    }

    public static final <T> boolean L(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence.iterator().hasNext();
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C L0(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T] */
    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T L1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @kotlin.l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.m(warningSince = "1.5")
    public static final <T> int L2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        int iIntValue = 0;
        int i10 = 3 >> 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final <T> boolean M(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapIterable")
    public static <T, R> Sequence<R> M0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new kotlin.sequences.i(sequence, transform, h.f313100a);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> double M1(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @kotlin.m(warningSince = "1.5")
    public static final <T> double M2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static <T> Iterable<T> N(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new a(sequence);
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapIterableTo")
    public static final <T, R, C extends Collection<? super R>> C N0(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> float N1(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @oj.i(name = "sumOfByte")
    public static final int N2(@NotNull Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Sequence<T> O(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C O0(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R O1(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @oj.i(name = "sumOfDouble")
    public static final double O2(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> P(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, R> R P0(@NotNull Sequence<? extends T> sequence, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
        }
        return r10;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R P1(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfDouble")
    private static final <T> double P2(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T, K> Map<K, T> Q(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    public static final <T, R> R Q0(@NotNull Sequence<? extends T> sequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                int i12 = (6 << 3) << 1;
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            r10 = operation.invoke(Integer.valueOf(i10), r10, t10);
            i10 = i11;
        }
        return r10;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double Q1(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @oj.i(name = "sumOfFloat")
    public static final float Q2(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> R(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final <T> void R0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float R1(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @oj.i(name = "sumOfInt")
    public static final int R2(@NotNull Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M S(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : sequence) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    public static final <T> void S0(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                int i12 = 0 ^ 3;
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R S1(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfInt")
    private static final <T> int S2(Sequence<? extends T> sequence, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M T(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : sequence) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> T0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R> R T1(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @oj.i(name = "sumOfLong")
    public static final long T2(@NotNull Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M U(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> U0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T U1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    @oj.i(name = "sumOfLong")
    private static final <T> long U2(Sequence<? extends T> sequence, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @e1(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> V(@NotNull Sequence<? extends K> sequence, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k10 : sequence) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M V0(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double V1(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @oj.i(name = "sumOfShort")
    public static final int V2(@NotNull Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @e1(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M W(@NotNull Sequence<? extends K> sequence, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k10 : sequence) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M W0(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float W1(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "sumOfUInt")
    private static final <T> int W2(Sequence<? extends T> sequence, Function1<? super T, u1> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            iN = u1.n(iN + selector.invoke(it.next()).z0());
        }
        return iN;
    }

    @oj.i(name = "averageOfByte")
    public static final double X(@NotNull Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final <T, K> Grouping<T, K> X0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new l(sequence, keySelector);
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final double X1(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @u0
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    @oj.i(name = "sumOfULong")
    private static final <T> long X2(Sequence<? extends T> sequence, Function1<? super T, y1> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            jN = y1.n(jN + selector.invoke(it.next()).z0());
        }
        return jN;
    }

    @oj.i(name = "averageOfDouble")
    public static final double Y(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    public static final <T> int Y0(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = 0;
        for (T t11 : sequence) {
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final float Y1(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @NotNull
    public static <T> Sequence<T> Y2(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return kotlin.sequences.r.g();
            }
            return sequence instanceof kotlin.sequences.e ? ((kotlin.sequences.e) sequence).b(i10) : new kotlin.sequences.v(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @oj.i(name = "averageOfFloat")
    public static final double Z(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        int i11 = 5 >> 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    public static final <T> int Z0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : sequence) {
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(t10).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T Z1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static <T> Sequence<T> Z2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.w(sequence, predicate);
    }

    @oj.i(name = "averageOfInt")
    public static final double a0(@NotNull Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    public static final <T> int a1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (T t10 : sequence) {
            if (i11 < 0) {
                int i12 = 2 >> 1;
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(t10).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T> T a2(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C a3(@NotNull Sequence<? extends T> sequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @oj.i(name = "averageOfLong")
    public static final double b0(@NotNull Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @NotNull
    public static final <T, A extends Appendable> A b1(@NotNull Sequence<? extends T> sequence, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.b(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final <T> T b2(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T> HashSet<T> b3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (HashSet) a3(sequence, new HashSet());
    }

    @oj.i(name = "averageOfShort")
    public static final double c0(@NotNull Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    @NotNull
    public static final <T> Sequence<T> c2(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new o(elements, sequence);
    }

    @NotNull
    public static <T> List<T> c3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> d0(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return g3(sequence, i10, i10, true);
    }

    @NotNull
    public static final <T> String d1(@NotNull Sequence<? extends T> sequence, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) b1(sequence, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final <T> Sequence<T> d2(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new m(sequence, t10);
    }

    @NotNull
    public static final <T> List<T> d3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) a3(sequence, new ArrayList());
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> e0(@NotNull Sequence<? extends T> sequence, int i10, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return h3(sequence, i10, i10, true, transform);
    }

    public static /* synthetic */ String e1(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return d1(sequence, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    @NotNull
    public static final <T> Sequence<T> e2(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new p(elements, sequence);
    }

    @NotNull
    public static final <T> Set<T> e3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> boolean f0(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return Y0(sequence, t10) >= 0;
    }

    public static <T> T f1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> f2(@NotNull Sequence<? extends T> sequence, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? sequence : new n(sequence, elements);
    }

    @NotNull
    public static <T> Set<T> f3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return SetsKt.emptySet();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return SetsKt.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> int g0(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i10 = 0;
        int i11 = 7 ^ 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public static final <T> T g1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : sequence) {
            if (predicate.invoke(t11).booleanValue()) {
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @kotlin.internal.f
    private static final <T> Sequence<T> g2(Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return d2(sequence, t10);
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> g3(@NotNull Sequence<? extends T> sequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SlidingWindowKt.windowedSequence(sequence, i10, i11, z10, false);
    }

    public static final <T> int h0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = sequence.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public static final <T> int h1(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = -1;
        int i11 = 0;
        for (T t11 : sequence) {
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> boolean h2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return !sequence.iterator().hasNext();
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> h3(@NotNull Sequence<? extends T> sequence, int i10, int i11, boolean z10, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k1(SlidingWindowKt.windowedSequence(sequence, i10, i11, z10, true), transform);
    }

    @NotNull
    public static final <T> Sequence<T> i0(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return j0(sequence, b.f313088a);
    }

    @Nullable
    public static final <T> T i1(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> boolean i2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Sequence i3(Sequence sequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return g3(sequence, i10, i11, z10);
    }

    @NotNull
    public static final <T, K> Sequence<T> j0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new kotlin.sequences.c(sequence, selector);
    }

    @Nullable
    public static final <T> T j1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        for (T t11 : sequence) {
            if (predicate.invoke(t11).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final <T> Sequence<T> j2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return k1(sequence, new q(action));
    }

    public static /* synthetic */ Sequence j3(Sequence sequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return h3(sequence, i10, i11, z10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> k0(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return sequence;
            }
            return sequence instanceof kotlin.sequences.e ? ((kotlin.sequences.e) sequence).a(i10) : new kotlin.sequences.d(sequence, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static <T, R> Sequence<R> k1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new kotlin.sequences.y(sequence, transform);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> k2(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return l1(sequence, new r(action));
    }

    @NotNull
    public static final <T> Sequence<IndexedValue<T>> k3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new kotlin.sequences.k(sequence);
    }

    @NotNull
    public static <T> Sequence<T> l0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.f(sequence, predicate);
    }

    @NotNull
    public static final <T, R> Sequence<R> l1(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new kotlin.sequences.x(sequence, transform);
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> l2(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final <T, R> Sequence<Pair<T, R>> l3(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> other) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new kotlin.sequences.l(sequence, other, z.f313153a);
    }

    public static <T> T m0(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (T) n0(sequence, i10, new c(i10));
    }

    @NotNull
    public static final <T, R> Sequence<R> m1(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return v0(new kotlin.sequences.x(sequence, transform));
    }

    @NotNull
    public static final <T> Sequence<T> m2(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.sequences.r.i(kotlin.sequences.r.q(sequence, CollectionsKt.asSequence(elements)));
    }

    @NotNull
    public static final <T, R, V> Sequence<V> m3(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new kotlin.sequences.l(sequence, other, transform);
    }

    public static final <T> T n0(@NotNull Sequence<? extends T> sequence, int i10, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : sequence) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C n1(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T> Sequence<T> n2(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = 4 << 0;
        return kotlin.sequences.r.i(kotlin.sequences.r.q(sequence, kotlin.sequences.r.q(t10)));
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T> Sequence<Pair<T, T>> n3(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return o3(sequence, a0.f313087a);
    }

    @Nullable
    public static final <T> T o0(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : sequence) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C o1(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T> Sequence<T> o2(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.sequences.r.i(kotlin.sequences.r.q(sequence, elements));
    }

    @e1(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> o3(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return kotlin.sequences.p.b(new b0(sequence, transform, null));
    }

    @NotNull
    public static <T> Sequence<T> p0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.h(sequence, true, predicate);
    }

    @NotNull
    public static <T, R> Sequence<R> p1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return v0(new kotlin.sequences.y(sequence, transform));
    }

    @NotNull
    public static final <T> Sequence<T> p2(@NotNull Sequence<? extends T> sequence, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m2(sequence, ArraysKt.asList(elements));
    }

    @NotNull
    public static final <T> Sequence<T> q0(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.y(new kotlin.sequences.h(new kotlin.sequences.k(sequence), true, new d(predicate)), e.f313097a);
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C q1(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @kotlin.internal.f
    private static final <T> Sequence<T> q2(Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return n2(sequence, t10);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C r0(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                destination.add(t10);
            }
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C r1(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <S, T extends S> S r2(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final /* synthetic */ <R> Sequence<R> s0(Sequence<?> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.needClassReification();
        Sequence<R> sequenceP0 = p0(sequence, f.f313098a);
        Intrinsics.checkNotNull(sequenceP0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceP0;
    }

    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T] */
    @e1(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T s1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    public static final <S, T extends S> S s2(@NotNull Sequence<? extends T> sequence, @NotNull pj.n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t0(Sequence<?> sequence, C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : sequence) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T] */
    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T t1(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S t2(@NotNull Sequence<? extends T> sequence, @NotNull pj.n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @NotNull
    public static final <T> Sequence<T> u0(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new kotlin.sequences.h(sequence, false, predicate);
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> double u1(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S u2(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @NotNull
    public static <T> Sequence<T> v0(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence<T> sequenceU0 = u0(sequence, g.f313099a);
        Intrinsics.checkNotNull(sequenceU0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceU0;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> float v1(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @NotNull
    public static final <T> Sequence<T> v2(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return k1(sequence, new s(sequence));
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C w0(@NotNull Sequence<? extends T> sequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : sequence) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R w1(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> w2(@NotNull Sequence<? extends T> sequence, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlin.sequences.p.b(new C2263t(r10, sequence, operation, null));
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C x0(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T, R extends Comparable<? super R>> R x1(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> x2(@NotNull Sequence<? extends T> sequence, R r10, @NotNull pj.n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlin.sequences.p.b(new u(r10, sequence, operation, null));
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C y0(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> Double y1(Sequence<? extends T> sequence, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> y2(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlin.sequences.p.b(new v(sequence, operation, null));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @kotlin.internal.f
    private static final <T> T z0(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final <T> Float z1(Sequence<? extends T> sequence, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> z2(@NotNull Sequence<? extends T> sequence, @NotNull pj.n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlin.sequences.p.b(new w(sequence, operation, null));
    }
}
