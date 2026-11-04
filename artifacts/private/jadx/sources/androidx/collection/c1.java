package androidx.collection;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,573:1\n229#1,5:574\n229#1,5:579\n299#1,18:584\n299#1,18:603\n299#1,18:626\n299#1,18:649\n299#1,18:672\n299#1,18:690\n299#1,18:708\n299#1,18:726\n1#2:602\n59#3,5:621\n59#3,5:644\n59#3,5:667\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n218#1:574,5\n223#1:579,5\n331#1:584,18\n374#1:603,18\n389#1:626,18\n401#1:649,18\n414#1:672,18\n422#1:690,18\n430#1:708,18\n468#1:726,18\n384#1:621,5\n396#1:644,5\n409#1:667,5\n*E\n"})
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f12162a = new Object();

    public static final class a extends LongIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1<T> f12164b;

        a(b1<T> b1Var) {
            this.f12164b = b1Var;
        }

        public final int b() {
            return this.f12163a;
        }

        public final void c(int i10) {
            this.f12163a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12163a < this.f12164b.size();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.collections.LongIterator
        public long nextLong() {
            b1<T> b1Var = this.f12164b;
            int i10 = this.f12163a;
            this.f12163a = i10 + 1;
            return b1Var.l(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1<T> f12166b;

        b(b1<T> b1Var) {
            this.f12166b = b1Var;
        }

        public final int b() {
            return this.f12165a;
        }

        public final void c(int i10) {
            this.f12165a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12165a < this.f12166b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            b1<T> b1Var = this.f12166b;
            int i10 = this.f12165a;
            this.f12165a = i10 + 1;
            return b1Var.w(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> void A(@NotNull b1<T> b1Var, @NotNull Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = b1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Long.valueOf(b1Var.l(i10)), b1Var.w(i10));
        }
    }

    public static final <T> T B(@NotNull b1<T> b1Var, long j10, T t10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.h(j10, t10);
    }

    public static final <T> T C(@NotNull b1<T> b1Var, long j10, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T tG = b1Var.g(j10);
        if (tG == null) {
            tG = defaultValue.invoke();
        }
        return tG;
    }

    public static final <T> int D(@NotNull b1<T> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.size();
    }

    public static /* synthetic */ void E(b1 b1Var) {
    }

    public static final <T> boolean F(@NotNull b1<T> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return !b1Var.k();
    }

    @NotNull
    public static final <T> LongIterator G(@NotNull b1<T> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return new a(b1Var);
    }

    @NotNull
    public static final <T> b1<T> H(@NotNull b1<T> b1Var, @NotNull b1<T> other) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        b1<T> b1Var2 = new b1<>(b1Var.size() + other.size());
        b1Var2.o(b1Var);
        b1Var2.o(other);
        return b1Var2;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean I(b1 b1Var, long j10, Object obj) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.r(j10, obj);
    }

    public static final <T> void J(@NotNull b1<T> b1Var, long j10, T t10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        b1Var.n(j10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> K(@NotNull b1<T> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return new b(b1Var);
    }

    public static final <E> void b(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.f12139d;
        if (i10 != 0 && j10 <= b1Var.f12137b[i10 - 1]) {
            b1Var.n(j10, e10);
            return;
        }
        if (b1Var.f12136a) {
            long[] jArr = b1Var.f12137b;
            if (i10 >= jArr.length) {
                Object[] objArr = b1Var.f12138c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != f12162a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                b1Var.f12136a = false;
                b1Var.f12139d = i11;
            }
        }
        int i13 = b1Var.f12139d;
        if (i13 >= b1Var.f12137b.length) {
            int iF = t.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(b1Var.f12137b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            b1Var.f12137b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(b1Var.f12138c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            b1Var.f12138c = objArrCopyOf;
        }
        b1Var.f12137b[i13] = j10;
        b1Var.f12138c[i13] = e10;
        b1Var.f12139d = i13 + 1;
    }

    public static final <E> void c(@NotNull b1<E> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.f12139d;
        Object[] objArr = b1Var.f12138c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        b1Var.f12139d = 0;
        b1Var.f12136a = false;
    }

    public static final <E> boolean d(@NotNull b1<E> b1Var, long j10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.i(j10) >= 0;
    }

    public static final <E> boolean e(@NotNull b1<E> b1Var, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.j(e10) >= 0;
    }

    public static final <E> void f(@NotNull b1<E> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.f12139d;
        long[] jArr = b1Var.f12137b;
        Object[] objArr = b1Var.f12138c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f12162a) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        b1Var.f12136a = false;
        b1Var.f12139d = i11;
    }

    @Nullable
    public static final <E> E g(@NotNull b1<E> b1Var, long j10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int iB = t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
        if (iB >= 0 && b1Var.f12138c[iB] != f12162a) {
            return (E) b1Var.f12138c[iB];
        }
        return null;
    }

    public static final <E> E h(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int iB = t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
        if (iB >= 0 && b1Var.f12138c[iB] != f12162a) {
            return (E) b1Var.f12138c[iB];
        }
        return e10;
    }

    @Nullable
    public static final Object i(@NotNull b1<?> b1Var, long j10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int iB = t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
        return (iB < 0 || b1Var.f12138c[iB] == f12162a) ? obj : b1Var.f12138c[iB];
    }

    public static final <E> int j(@NotNull b1<E> b1Var, long j10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var.f12136a) {
            int i10 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f12162a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i11;
        }
        return t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
    }

    public static final <E> int k(@NotNull b1<E> b1Var, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var.f12136a) {
            int i10 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f12162a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i11;
        }
        int i13 = b1Var.f12139d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (b1Var.f12138c[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public static final <E> boolean l(@NotNull b1<E> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.size() == 0;
    }

    public static final <E> long m(@NotNull b1<E> b1Var, int i10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (!(i10 >= 0 && i10 < b1Var.f12139d)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (b1Var.f12136a) {
            int i11 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i12;
        }
        return b1Var.f12137b[i10];
    }

    public static final <E> void n(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int iB = t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
        if (iB >= 0) {
            b1Var.f12138c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < b1Var.f12139d && b1Var.f12138c[i10] == f12162a) {
            b1Var.f12137b[i10] = j10;
            b1Var.f12138c[i10] = e10;
            return;
        }
        if (b1Var.f12136a) {
            int i11 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            if (i11 >= jArr.length) {
                Object[] objArr = b1Var.f12138c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != f12162a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                b1Var.f12136a = false;
                b1Var.f12139d = i12;
                i10 = ~t.a.b(b1Var.f12137b, i12, j10);
            }
        }
        int i14 = b1Var.f12139d;
        if (i14 >= b1Var.f12137b.length) {
            int iF = t.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(b1Var.f12137b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            b1Var.f12137b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(b1Var.f12138c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            b1Var.f12138c = objArrCopyOf;
        }
        int i15 = b1Var.f12139d;
        if (i15 - i10 != 0) {
            long[] jArr2 = b1Var.f12137b;
            int i16 = i10 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = b1Var.f12138c;
            ArraysKt.copyInto(objArr2, objArr2, i16, i10, b1Var.f12139d);
        }
        b1Var.f12137b[i10] = j10;
        b1Var.f12138c[i10] = e10;
        b1Var.f12139d++;
    }

    public static final <E> void o(@NotNull b1<E> b1Var, @NotNull b1<? extends E> other) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            b1Var.n(other.l(i10), other.w(i10));
        }
    }

    @Nullable
    public static final <E> E p(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        E eG = b1Var.g(j10);
        if (eG == null) {
            b1Var.n(j10, e10);
        }
        return eG;
    }

    public static final <E> void q(@NotNull b1<E> b1Var, long j10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int iB = t.a.b(b1Var.f12137b, b1Var.f12139d, j10);
        if (iB < 0 || b1Var.f12138c[iB] == f12162a) {
            return;
        }
        b1Var.f12138c[iB] = f12162a;
        b1Var.f12136a = true;
    }

    public static final <E> boolean r(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.i(j10);
        if (i10 < 0 || !Intrinsics.areEqual(e10, b1Var.w(i10))) {
            return false;
        }
        b1Var.s(i10);
        return true;
    }

    public static final <E> void s(@NotNull b1<E> b1Var, int i10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var.f12138c[i10] != f12162a) {
            b1Var.f12138c[i10] = f12162a;
            b1Var.f12136a = true;
        }
    }

    @Nullable
    public static final <E> E t(@NotNull b1<E> b1Var, long j10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = b1Var.f12138c;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public static final <E> boolean u(@NotNull b1<E> b1Var, long j10, E e10, E e11) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        int i10 = b1Var.i(j10);
        if (i10 < 0 || !Intrinsics.areEqual(b1Var.f12138c[i10], e10)) {
            return false;
        }
        b1Var.f12138c[i10] = e11;
        return true;
    }

    public static final <E> void v(@NotNull b1<E> b1Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (!(i10 >= 0 && i10 < b1Var.f12139d)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (b1Var.f12136a) {
            int i11 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i12;
        }
        b1Var.f12138c[i10] = e10;
    }

    public static final <E> int w(@NotNull b1<E> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var.f12136a) {
            int i10 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i11 = 7 << 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                Object obj = objArr[i13];
                if (obj != f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i12;
        }
        return b1Var.f12139d;
    }

    @NotNull
    public static final <E> String x(@NotNull b1<E> b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(b1Var.f12139d * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = b1Var.f12139d;
        int i11 = 2 >> 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(b1Var.l(i12));
            sb2.append('=');
            E eW = b1Var.w(i12);
            if (eW != sb2) {
                sb2.append(eW);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <E> E y(@NotNull b1<E> b1Var, int i10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (!(i10 >= 0 && i10 < b1Var.f12139d)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (b1Var.f12136a) {
            int i11 = b1Var.f12139d;
            long[] jArr = b1Var.f12137b;
            Object[] objArr = b1Var.f12138c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            b1Var.f12136a = false;
            b1Var.f12139d = i12;
        }
        return (E) b1Var.f12138c[i10];
    }

    public static final <T> boolean z(@NotNull b1<T> b1Var, long j10) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return b1Var.d(j10);
    }
}
