package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.a1;
import kotlin.b1;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.internal.h;
import kotlin.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.u0;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n13996#2,14:3106\n14019#2,14:3120\n14042#2,14:3134\n14065#2,14:3148\n14088#2,14:3162\n14111#2,14:3176\n14134#2,14:3190\n14157#2,14:3204\n14180#2,14:3218\n16582#2,14:3232\n16605#2,14:3246\n16628#2,14:3260\n16651#2,14:3274\n16674#2,14:3288\n16697#2,14:3302\n16720#2,14:3316\n16743#2,14:3330\n16766#2,14:3344\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2497#1:3106,14\n2504#1:3120,14\n2511#1:3134,14\n2518#1:3148,14\n2525#1:3162,14\n2532#1:3176,14\n2539#1:3190,14\n2546#1:3204,14\n2553#1:3218,14\n2695#1:3232,14\n2702#1:3246,14\n2709#1:3260,14\n2716#1:3274,14\n2723#1:3288,14\n2730#1:3302,14\n2737#1:3316,14\n2744#1:3330,14\n2751#1:3344,14\n*E\n"})
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractList<Byte> implements RandomAccess {
        final /* synthetic */ byte[] $this_asList;

        AnonymousClass1(byte[] bArr) {
            this.$this_asList = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return contains(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return indexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return lastIndexOf(((Number) obj).byteValue());
            }
            return -1;
        }

        public boolean contains(byte b10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, b10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Byte get(int i10) {
            return Byte.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(byte b10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, b10);
        }

        public int lastIndexOf(byte b10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractList<Short> implements RandomAccess {
        final /* synthetic */ short[] $this_asList;

        AnonymousClass2(short[] sArr) {
            this.$this_asList = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return contains(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return indexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return lastIndexOf(((Number) obj).shortValue());
            }
            return -1;
        }

        public boolean contains(short s10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, s10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Short get(int i10) {
            return Short.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(short s10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, s10);
        }

        public int lastIndexOf(short s10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, s10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractList<Integer> implements RandomAccess {
        final /* synthetic */ int[] $this_asList;

        AnonymousClass3(int[] iArr) {
            this.$this_asList = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return indexOf(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return lastIndexOf(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean contains(int i10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, i10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Integer get(int i10) {
            return Integer.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(int i10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, i10);
        }

        public int lastIndexOf(int i10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, i10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractList<Long> implements RandomAccess {
        final /* synthetic */ long[] $this_asList;

        AnonymousClass4(long[] jArr) {
            this.$this_asList = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return contains(((Number) obj).longValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return indexOf(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return lastIndexOf(((Number) obj).longValue());
            }
            return -1;
        }

        public boolean contains(long j10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, j10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Long get(int i10) {
            return Long.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(long j10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, j10);
        }

        public int lastIndexOf(long j10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$5, reason: invalid class name */
    @SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n12624#2,2:3106\n1742#2,6:3108\n1850#2,6:3114\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3106,2\n201#1:3108,6\n202#1:3114,6\n*E\n"})
    public static final class AnonymousClass5 extends AbstractList<Float> implements RandomAccess {
        final /* synthetic */ float[] $this_asList;

        AnonymousClass5(float[] fArr) {
            this.$this_asList = fArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return contains(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return indexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return lastIndexOf(((Number) obj).floatValue());
            }
            return -1;
        }

        public boolean contains(float f10) {
            for (float f11 : this.$this_asList) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Float get(int i10) {
            return Float.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(float f10) {
            float[] fArr = this.$this_asList;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int lastIndexOf(float f10) {
            float[] fArr = this.$this_asList;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$6, reason: invalid class name */
    @SourceDebugExtension({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3105:1\n12634#2,2:3106\n1754#2,6:3108\n1862#2,6:3114\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3106,2\n215#1:3108,6\n216#1:3114,6\n*E\n"})
    public static final class AnonymousClass6 extends AbstractList<Double> implements RandomAccess {
        final /* synthetic */ double[] $this_asList;

        AnonymousClass6(double[] dArr) {
            this.$this_asList = dArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return contains(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return indexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.$this_asList.length != 0) {
                return false;
            }
            int i10 = 4 << 1;
            return true;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return lastIndexOf(((Number) obj).doubleValue());
            }
            return -1;
        }

        public boolean contains(double d10) {
            for (double d11 : this.$this_asList) {
                if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Double get(int i10) {
            return Double.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(double d10) {
            double[] dArr = this.$this_asList;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int lastIndexOf(double d10) {
            double[] dArr = this.$this_asList;
            int length = dArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$7, reason: invalid class name */
    public static final class AnonymousClass7 extends AbstractList<Boolean> implements RandomAccess {
        final /* synthetic */ boolean[] $this_asList;

        AnonymousClass7(boolean[] zArr) {
            this.$this_asList = zArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return contains(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return indexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return lastIndexOf(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        public boolean contains(boolean z10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, z10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Boolean get(int i10) {
            return Boolean.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(boolean z10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, z10);
        }

        public int lastIndexOf(boolean z10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, z10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysJvmKt$asList$8, reason: invalid class name */
    public static final class AnonymousClass8 extends AbstractList<Character> implements RandomAccess {
        final /* synthetic */ char[] $this_asList;

        AnonymousClass8(char[] cArr) {
            this.$this_asList = cArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return contains(((Character) obj).charValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.$this_asList.length;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.$this_asList.length == 0;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public boolean contains(char c10) {
            return ArraysKt___ArraysKt.contains(this.$this_asList, c10);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public Character get(int i10) {
            return Character.valueOf(this.$this_asList[i10]);
        }

        public int indexOf(char c10) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, c10);
        }

        public int lastIndexOf(char c10) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, c10);
        }
    }

    @NotNull
    public static <T> List<T> asList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> listAsList = ArraysUtilJVM.asList(tArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t10, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i10, i11);
    }

    @h
    @e1(version = j.f266120g)
    @f
    @i(name = "contentDeepEqualsInline")
    private static final <T> boolean contentDeepEqualsInline(T[] tArr, T[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = 3 ^ 3;
        return m.a(1, 3, 0) ? ArraysKt__ArraysKt.contentDeepEquals(tArr, other) : Arrays.deepEquals(tArr, other);
    }

    @e1(version = "1.4")
    @f
    @i(name = "contentDeepEqualsNullable")
    private static final <T> boolean contentDeepEqualsNullable(T[] tArr, T[] tArr2) {
        return m.a(1, 3, 0) ? ArraysKt__ArraysKt.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @h
    @e1(version = j.f266120g)
    @f
    @i(name = "contentDeepHashCodeInline")
    private static final <T> int contentDeepHashCodeInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return m.a(1, 3, 0) ? ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @e1(version = "1.4")
    @f
    @i(name = "contentDeepHashCodeNullable")
    private static final <T> int contentDeepHashCodeNullable(T[] tArr) {
        return m.a(1, 3, 0) ? ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @h
    @e1(version = j.f266120g)
    @f
    @i(name = "contentDeepToStringInline")
    private static final <T> String contentDeepToStringInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (m.a(1, 3, 0)) {
            return ArraysKt__ArraysKt.contentDeepToString(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        Intrinsics.checkNotNullExpressionValue(strDeepToString, "deepToString(...)");
        return strDeepToString;
    }

    @e1(version = "1.4")
    @f
    @i(name = "contentDeepToStringNullable")
    private static final <T> String contentDeepToStringNullable(T[] tArr) {
        if (m.a(1, 3, 0)) {
            return ArraysKt__ArraysKt.contentDeepToString(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        Intrinsics.checkNotNullExpressionValue(strDeepToString, "deepToString(...)");
        return strDeepToString;
    }

    @e1(version = "1.4")
    @f
    private static final <T> boolean contentEquals(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @e1(version = "1.4")
    @f
    private static final <T> int contentHashCode(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @e1(version = "1.4")
    @f
    private static final <T> String contentToString(T[] tArr) {
        String string = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return copyInto(objArr, objArr2, i10, i11, i12);
    }

    @f
    private static final <T> T[] copyOf(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static <T> T[] copyOfRange(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final <T> T[] copyOfRangeInline(T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (m.a(1, 3, 0)) {
            return (T[]) copyOfRange(tArr, i10, i11);
        }
        if (i11 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
            Intrinsics.checkNotNull(tArr2);
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + tArr.length);
    }

    @f
    private static final <T> T elementAt(T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i10];
    }

    public static <T> void fill(@NotNull T[] tArr, T t10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        fill(objArr, obj, i10, i11);
    }

    @NotNull
    public static <R> List<R> filterIsInstance(@NotNull Object[] objArr, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] objArr, @NotNull C destination, @NotNull Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = j.f266120g)
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(objArr, comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = j.f266120g)
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(objArr, comparator);
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @f
    private static final <T> T[] plusElement(T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T[]) plus(tArr, t10);
    }

    public static void sort(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        sort(comparableArr, i10, i11);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        sortWith(objArr, comparator, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final <T> BigDecimal sumOfBigDecimal(T[] tArr, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t10));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final <T> BigInteger sumOfBigInteger(T[] tArr, Function1<? super T, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t10));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    @NotNull
    public static final Byte[] toTypedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @NotNull
    public static final List<Byte> asList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new AnonymousClass1(bArr);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(byte[] bArr) {
        String string = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return copyInto(bArr, bArr2, i10, i11, i12);
    }

    @f
    private static final byte[] copyOf(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @f
    private static final byte elementAt(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[i10];
    }

    public static void fill(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        fill(bArr, b10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @e1(version = j.f266120g)
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @e1(version = j.f266120g)
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        sort(bArr, i10, i11);
    }

    public static <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    @NotNull
    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    @NotNull
    public static final List<Short> asList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new AnonymousClass2(sArr);
    }

    public static final int binarySearch(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return binarySearch(bArr, b10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(short[] sArr) {
        String string = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static short[] copyInto(@NotNull short[] sArr, @NotNull short[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return copyInto(sArr, sArr2, i10, i11, i12);
    }

    @f
    private static final short[] copyOf(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static byte[] copyOfRange(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @f
    private static final short elementAt(short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[i10];
    }

    public static void fill(@NotNull short[] sArr, short s10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        fill(sArr, s10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(comparableArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(comparableArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        sort(sArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Short> toSortedSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    @NotNull
    public static List<Integer> asList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new AnonymousClass3(iArr);
    }

    public static final int binarySearch(@NotNull short[] sArr, short s10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return binarySearch(sArr, s10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(int[] iArr) {
        String string = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static int[] copyInto(@NotNull int[] iArr, @NotNull int[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return copyInto(iArr, iArr2, i10, i11, i12);
    }

    @f
    private static final int[] copyOf(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @f
    private static final int elementAt(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[i10];
    }

    public static void fill(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        fill(iArr, i10, i11, i12);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte max(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(bArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte min(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(bArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        sort(iArr, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super Byte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Byte.valueOf(b10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super Byte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Byte.valueOf(b10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final SortedSet<Integer> toSortedSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @NotNull
    public static List<Long> asList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new AnonymousClass4(jArr);
    }

    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return binarySearch(iArr, i10, i11, i12);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(long[] jArr) {
        String string = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static long[] copyInto(@NotNull long[] jArr, @NotNull long[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return copyInto(jArr, jArr2, i10, i11, i12);
    }

    @f
    private static final long[] copyOf(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static short[] copyOfRange(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    @f
    private static final long elementAt(long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[i10];
    }

    public static void fill(@NotNull long[] jArr, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        fill(jArr, j10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short max(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(sArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short min(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(sArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b10;
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void sort(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        sort(jArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Long> toSortedSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    @NotNull
    public static final List<Float> asList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new AnonymousClass5(fArr);
    }

    public static final int binarySearch(@NotNull long[] jArr, long j10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return binarySearch(jArr, j10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(float[] fArr) {
        String string = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static float[] copyInto(@NotNull float[] fArr, @NotNull float[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return copyInto(fArr, fArr2, i10, i11, i12);
    }

    @f
    private static final float[] copyOf(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @f
    private static final float elementAt(float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[i10];
    }

    public static final void fill(@NotNull float[] fArr, float f10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        fill(fArr, f10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer max(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(iArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer min(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(iArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int i10 = 5 >> 1;
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        sort(fArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Float> toSortedSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    @NotNull
    public static List<Double> asList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new AnonymousClass6(dArr);
    }

    public static final int binarySearch(@NotNull float[] fArr, float f10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return binarySearch(fArr, f10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(double[] dArr) {
        String string = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static double[] copyInto(@NotNull double[] dArr, @NotNull double[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return copyInto(dArr, dArr2, i10, i11, i12);
    }

    @f
    private static final double[] copyOf(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static int[] copyOfRange(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final byte[] copyOfRangeInline(byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(bArr, i10, i11);
        }
        if (i11 <= bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            Intrinsics.checkNotNull(bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + bArr.length);
    }

    @f
    private static final double elementAt(double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[i10];
    }

    public static final void fill(@NotNull double[] dArr, double d10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        fill(dArr, d10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long max(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(jArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long min(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(jArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        sort(dArr, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super Short, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Short.valueOf(s10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super Short, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Short.valueOf(s10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final SortedSet<Double> toSortedSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    @NotNull
    public static Integer[] toTypedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @NotNull
    public static final List<Boolean> asList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new AnonymousClass7(zArr);
    }

    public static final int binarySearch(@NotNull double[] dArr, double d10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return binarySearch(dArr, d10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static final boolean[] copyInto(@NotNull boolean[] zArr, @NotNull boolean[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return copyInto(zArr, zArr2, i10, i11, i12);
    }

    @f
    private static final boolean[] copyOf(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @f
    private static final boolean elementAt(boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i10];
    }

    public static final void fill(@NotNull boolean[] zArr, boolean z10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        fill(zArr, z10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @f
    private static final <T extends Comparable<? super T>> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        sort((Object[]) tArr);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        sort(cArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    @NotNull
    public static final List<Character> asList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new AnonymousClass8(cArr);
    }

    public static final int binarySearch(@NotNull char[] cArr, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return binarySearch(cArr, c10, i10, i11);
    }

    @e1(version = "1.4")
    @f
    private static final boolean contentEquals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @e1(version = "1.4")
    @f
    private static final int contentHashCode(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @e1(version = "1.4")
    @f
    private static final String contentToString(char[] cArr) {
        String string = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = "1.3")
    @NotNull
    public static char[] copyInto(@NotNull char[] cArr, @NotNull char[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return copyInto(cArr, cArr2, i10, i11, i12);
    }

    @f
    private static final char[] copyOf(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static long[] copyOfRange(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    @f
    private static final char elementAt(char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[i10];
    }

    public static void fill(@NotNull char[] cArr, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        fill(cArr, c10, i10, i11);
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @l(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @l(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @NotNull
    public static short[] plus(@NotNull short[] sArr, short s10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s10;
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static <T> void sort(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        sort(objArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    @f
    private static final byte[] copyOf(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @l(message = "Use maxOrNull instead.", replaceWith = @b1(expression = "this.maxOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(cArr);
    }

    @l(message = "Use minOrNull instead.", replaceWith = @b1(expression = "this.minOrNull()", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(cArr);
    }

    @e1(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super Integer, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Integer.valueOf(i10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super Integer, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Integer.valueOf(i10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    @NotNull
    public static Long[] toTypedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @f
    private static final short[] copyOf(short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static float[] copyOfRange(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static final void sort(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @f
    private static final int[] copyOf(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static final void sort(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    @f
    private static final long[] copyOf(long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static final double[] copyOfRange(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final short[] copyOfRangeInline(short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(sArr, i10, i11);
        }
        if (i11 <= sArr.length) {
            short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
            Intrinsics.checkNotNull(sArrCopyOfRange);
            return sArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + sArr.length);
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static void sort(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super Long, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Long.valueOf(j10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super Long, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Long.valueOf(j10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static Float[] toTypedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @f
    private static final float[] copyOf(float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static void sort(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @f
    private static final double[] copyOf(double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static final boolean[] copyOfRange(@NotNull boolean[] zArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    public static void sort(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @f
    private static final boolean[] copyOf(boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    public static void sort(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(float[] fArr, Function1<? super Float, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Float.valueOf(f10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(float[] fArr, Function1<? super Float, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Float.valueOf(f10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static Double[] toTypedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @f
    private static final char[] copyOf(char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "copyOfRange")
    public static final char[] copyOfRange(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j10;
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final void sort(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @f
    private static final <T> T[] copyOf(T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <T> void sort(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final int[] copyOfRangeInline(int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(iArr, i10, i11);
        }
        if (i11 <= iArr.length) {
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
            Intrinsics.checkNotNull(iArrCopyOfRange);
            return iArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + iArr.length);
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(double[] dArr, Function1<? super Double, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Double.valueOf(d10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(double[] dArr, Function1<? super Double, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Double.valueOf(d10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static Boolean[] toTypedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, float f10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f10;
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(boolean[] zArr, Function1<? super Boolean, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(boolean[] zArr, Function1<? super Boolean, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final long[] copyOfRangeInline(long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(jArr, i10, i11);
        }
        if (i11 <= jArr.length) {
            long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
            Intrinsics.checkNotNull(jArrCopyOfRange);
            return jArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + jArr.length);
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, double d10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d10;
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(char[] cArr, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(c10)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @u0
    @e1(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(char[] cArr, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(c10)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z10;
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final float[] copyOfRangeInline(float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(fArr, i10, i11);
        }
        if (i11 <= fArr.length) {
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
            Intrinsics.checkNotNull(fArrCopyOfRange);
            return fArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + fArr.length);
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c10;
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final double[] copyOfRangeInline(double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(dArr, i10, i11);
        }
        if (i11 <= dArr.length) {
            double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
            Intrinsics.checkNotNull(dArrCopyOfRange);
            return dArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + dArr.length);
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] bArr, @NotNull Collection<Byte> elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final boolean[] copyOfRangeInline(boolean[] zArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(zArr, i10, i11);
        }
        if (i11 <= zArr.length) {
            boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
            Intrinsics.checkNotNull(zArrCopyOfRange);
            return zArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + zArr.length);
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull Collection<Short> elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final char[] copyOfRangeInline(char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (m.a(1, 3, 0)) {
            return copyOfRange(cArr, i10, i11);
        }
        if (i11 <= cArr.length) {
            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
            Intrinsics.checkNotNull(cArrCopyOfRange);
            return cArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + cArr.length);
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, @NotNull Collection<Integer> elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, @NotNull Collection<Long> elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull Collection<Float> elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull Collection<Double> elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull Collection<Boolean> elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull Collection<Character> elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @l(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @l(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static <T> T[] plus(@NotNull T[] tArr, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        Intrinsics.checkNotNull(tArr2);
        return tArr2;
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] bArr, @NotNull byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        Intrinsics.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static short[] plus(@NotNull short[] sArr, @NotNull short[] elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        Intrinsics.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static int[] plus(@NotNull int[] iArr, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        Intrinsics.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static long[] plus(@NotNull long[] jArr, @NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        Intrinsics.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static float[] plus(@NotNull float[] fArr, @NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        Intrinsics.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static double[] plus(@NotNull double[] dArr, @NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        Intrinsics.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static boolean[] plus(@NotNull boolean[] zArr, @NotNull boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        Intrinsics.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull char[] elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        Intrinsics.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }
}
