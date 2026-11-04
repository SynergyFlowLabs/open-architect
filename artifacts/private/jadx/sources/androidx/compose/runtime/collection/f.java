package androidx.compose.runtime.collection;

import androidx.collection.c3;
import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v;
import kotlin.sequences.n;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1734#2,3:57\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n33#1:57,3\n*E\n"})
public final class f<T> implements Set<T>, qj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35561b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c3<T> f35562a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {31}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,56:1\n231#2,3:57\n200#2,7:60\n211#2,3:68\n214#2,9:72\n234#2:81\n1399#3:67\n1270#3:71\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n*L\n31#1:57,3\n31#1:60,7\n31#1:68,3\n31#1:72,9\n31#1:81\n31#1:67\n31#1:71\n*E\n"})
    static final class a extends k implements Function2<n<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f35566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f35567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f35568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f35569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f35570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f35571i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f<T> f35572j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35572j = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f35572j, dVar);
            aVar.f35571i = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005f  */
        /* JADX WARN: Code duplicated, block: B:21:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x009f  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.sequences.n] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00a5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0071). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007a -> B:20:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0097 -> B:20:0x009a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f35570h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f35568f
                int r6 = r0.f35567e
                long r7 = r0.f35569g
                int r9 = r0.f35566d
                int r10 = r0.f35565c
                java.lang.Object r11 = r0.f35564b
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f35563a
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f35571i
                kotlin.sequences.n r13 = (kotlin.sequences.n) r13
                kotlin.ResultKt.m(r21)
                goto L9a
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L33:
                kotlin.ResultKt.m(r21)
                java.lang.Object r2 = r0.f35571i
                kotlin.sequences.n r2 = (kotlin.sequences.n) r2
                androidx.compose.runtime.collection.f<T> r6 = r0.f35572j
                androidx.collection.c3 r6 = r6.c()
                java.lang.Object[] r7 = r6.f12171b
                long[] r6 = r6.f12170a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Laa
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto La5
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L71:
                if (r2 >= r6) goto L9d
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L9a
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f35571i = r13
                r0.f35563a = r12
                r0.f35564b = r11
                r0.f35565c = r10
                r0.f35566d = r9
                r0.f35569g = r7
                r0.f35567e = r6
                r0.f35568f = r2
                r0.f35570h = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L9a
                return r1
            L9a:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L71
            L9d:
                if (r6 != r4) goto Laa
                r8 = r10
                r6 = r11
                r6 = r11
                r7 = r12
                r2 = r13
                r2 = r13
            La5:
                if (r9 == r8) goto Laa
                int r9 = r9 + 1
                goto L4a
            Laa:
                kotlin.Unit r0 = kotlin.Unit.f312394a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n<? super T> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public f(@NotNull c3<T> c3Var) {
        this.f35562a = c3Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final c3<T> c() {
        return this.f35562a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f35562a.e(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f35562a.e(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int i() {
        return this.f35562a.q();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f35562a.r();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return o.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
