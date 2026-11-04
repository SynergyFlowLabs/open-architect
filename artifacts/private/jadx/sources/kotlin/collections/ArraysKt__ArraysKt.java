package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.a1;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.e1;
import kotlin.f2;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.r1;
import kotlin.ranges.r;
import kotlin.v1;
import kotlin.z1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    /* JADX WARN: Multi-variable type inference failed */
    @a1
    @e1(version = "1.3")
    @i(name = "contentDeepEquals")
    public static <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof r1) && (objArr2 instanceof r1)) {
                    if (!UArraysKt.m1002contentEqualskV0jMPg(((r1) objArr).G(), ((r1) objArr2).G())) {
                        return false;
                    }
                } else if ((objArr instanceof f2) && (objArr2 instanceof f2)) {
                    if (!UArraysKt.m1000contentEqualsFGO6Aew(((f2) objArr).G(), ((f2) objArr2).G())) {
                        return false;
                    }
                } else if ((objArr instanceof v1) && (objArr2 instanceof v1)) {
                    if (!UArraysKt.m1001contentEqualsKJPZfPQ(((v1) objArr).G(), ((v1) objArr2).G())) {
                        return false;
                    }
                } else if ((objArr instanceof z1) && (objArr2 instanceof z1)) {
                    if (!UArraysKt.m1003contentEqualslec5QzE(((z1) objArr).G(), ((z1) objArr2).G())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @e1(version = "1.3")
    @NotNull
    @a1
    @i(name = "contentDeepToString")
    public static <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder((r.B(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb2, new ArrayList());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object[] objArr = tArr[i10];
            if (objArr == 0) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb2, list);
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb2.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb2.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb2.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb2.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb2.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb2.append(string8);
            } else if (objArr instanceof r1) {
                sb2.append(UArraysKt.m1008contentToString2csIQuQ(((r1) objArr).G()));
            } else if (objArr instanceof f2) {
                sb2.append(UArraysKt.m1010contentToStringd6D3K8(((f2) objArr).G()));
            } else if (objArr instanceof v1) {
                sb2.append(UArraysKt.m1009contentToStringXUkPCBk(((v1) objArr).G()));
            } else if (objArr instanceof z1) {
                sb2.append(UArraysKt.m1011contentToStringuLth9ew(((z1) objArr).G()));
            } else {
                sb2.append(objArr.toString());
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @e1(version = "1.3")
    @f
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @e1(version = "1.3")
    @f
    private static final boolean isNullOrEmpty(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
