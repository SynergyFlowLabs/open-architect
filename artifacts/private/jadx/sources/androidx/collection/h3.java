package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n299#1,5:762\n299#1,5:767\n59#2,5:772\n59#2,5:777\n59#2,5:782\n59#2,5:788\n1#3:787\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n278#1:762,5\n294#1:767,5\n315#1:772,5\n330#1:777,5\n346#1:782,5\n512#1:788,5\n*E\n"})
public class h3<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f12273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f12274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12275c;

    @oj.j
    public h3() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T c(Object obj, T t10) {
        int iE = e(obj);
        return iE >= 0 ? (T) this.f12274b[(iE << 1) + 1] : t10;
    }

    private final int d(K k10, int i10) {
        int i11 = this.f12275c;
        if (i11 == 0) {
            int i12 = 6 | (-1);
            return -1;
        }
        int iA = t.a.a(this.f12273a, i11, i10);
        if (iA < 0 || Intrinsics.areEqual(k10, this.f12274b[iA << 1])) {
            return iA;
        }
        int i13 = iA + 1;
        while (i13 < i11 && this.f12273a[i13] == i10) {
            if (Intrinsics.areEqual(k10, this.f12274b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iA - 1; i14 >= 0 && this.f12273a[i14] == i10; i14--) {
            if (Intrinsics.areEqual(k10, this.f12274b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    private final int f() {
        int i10 = this.f12275c;
        if (i10 == 0) {
            return -1;
        }
        int iA = t.a.a(this.f12273a, i10, 0);
        if (iA < 0 || this.f12274b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f12273a[i11] == 0) {
            if (this.f12274b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f12273a[i12] == 0; i12--) {
            if (this.f12274b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @oj.i(name = "__restricted$indexOfValue")
    public final int a(V v10) {
        int i10 = this.f12275c * 2;
        Object[] objArr = this.f12274b;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.areEqual(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f12275c;
        int[] iArr = this.f12273a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12273a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12274b, i10 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12274b = objArrCopyOf;
        }
        if (this.f12275c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f12275c > 0) {
            this.f12273a = t.a.f376158a;
            this.f12274b = t.a.f376160c;
            this.f12275c = 0;
        }
        if (this.f12275c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public int e(K k10) {
        return k10 == null ? f() : d(k10, k10.hashCode());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof h3) {
                if (size() != ((h3) obj).size()) {
                    return false;
                }
                h3 h3Var = (h3) obj;
                int i10 = this.f12275c;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vK = k(i11);
                    Object obj2 = h3Var.get(kG);
                    if (vK == null) {
                        if (obj2 != null || !h3Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(vK, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f12275c;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vK2 = k(i13);
                Object obj3 = ((Map) obj).get(kG2);
                if (vK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vK2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12275c) {
            z10 = true;
        }
        if (!z10) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (K) this.f12274b[i10 << 1];
    }

    @Nullable
    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f12274b[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@Nullable Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f12274b[(iE << 1) + 1] : v10;
    }

    public void h(@NotNull h3<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.f12275c;
        b(this.f12275c + i10);
        if (this.f12275c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.g(i11), map.k(i11));
            }
        } else if (i10 > 0) {
            ArraysKt.copyInto(map.f12273a, this.f12273a, 0, 0, i10);
            ArraysKt.copyInto(map.f12274b, this.f12274b, 0, 0, i10 << 1);
            this.f12275c = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f12273a;
        Object[] objArr = this.f12274b;
        int i10 = this.f12275c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public V i(int i10) {
        if (!(i10 >= 0 && i10 < this.f12275c)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f12274b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f12275c;
        if (i12 <= 1) {
            clear();
            return v10;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f12273a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                ArraysKt.copyInto(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f12274b;
                ArraysKt.copyInto(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f12274b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12273a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12274b, i16 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12274b = objArrCopyOf;
            if (i12 != this.f12275c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                ArraysKt.copyInto(iArr, this.f12273a, 0, 0, i10);
                ArraysKt.copyInto(objArr, this.f12274b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                ArraysKt.copyInto(iArr, this.f12273a, i10, i17, i12);
                ArraysKt.copyInto(objArr, this.f12274b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f12275c) {
            throw new ConcurrentModificationException();
        }
        this.f12275c = i13;
        return v10;
    }

    public boolean isEmpty() {
        return this.f12275c <= 0;
    }

    public V j(int i10, V v10) {
        boolean z10 = false;
        int i11 = 3 & 1;
        if (i10 >= 0 && i10 < this.f12275c) {
            z10 = true;
        }
        if (!z10) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i12 = (i10 << 1) + 1;
        Object[] objArr = this.f12274b;
        V v11 = (V) objArr[i12];
        objArr[i12] = v10;
        return v11;
    }

    public V k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12275c) {
            z10 = true;
        }
        if (!z10) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (V) this.f12274b[(i10 << 1) + 1];
    }

    @Nullable
    public V put(K k10, V v10) {
        int i10 = this.f12275c;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iD = k10 != null ? d(k10, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f12274b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iD;
        int[] iArr = this.f12273a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12273a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12274b, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12274b = objArrCopyOf;
            if (i10 != this.f12275c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f12273a;
            int i14 = i12 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f12274b;
            ArraysKt.copyInto(objArr2, objArr2, i14 << 1, i12 << 1, this.f12275c << 1);
        }
        int i15 = this.f12275c;
        if (i10 == i15) {
            int[] iArr3 = this.f12273a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f12274b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f12275c = i15 + 1;
                int i17 = 6 ^ 0;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    @Nullable
    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    @Nullable
    public V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return j(iE, v10);
        }
        return null;
    }

    public int size() {
        return this.f12275c;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12275c * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f12275c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != sb2) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vK = k(i11);
            if (vK != sb2) {
                sb2.append(vK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @oj.j
    public h3(int i10) {
        this.f12273a = i10 == 0 ? t.a.f376158a : new int[i10];
        this.f12274b = i10 == 0 ? t.a.f376160c : new Object[i10 << 1];
    }

    public boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !Intrinsics.areEqual(v10, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !Intrinsics.areEqual(v10, k(iE))) {
            return false;
        }
        j(iE, v11);
        return true;
    }

    public /* synthetic */ h3(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public h3(@Nullable h3<? extends K, ? extends V> h3Var) {
        this(0, 1, null);
        if (h3Var != null) {
            h(h3Var);
        }
    }
}
