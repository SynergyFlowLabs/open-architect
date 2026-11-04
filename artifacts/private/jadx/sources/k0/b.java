package k0;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1557#2:207\n1628#2,3:208\n1812#2,4:211\n1#3:215\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n126#1:207\n126#1:208,3\n127#1:211,4\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f307523c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Method f307524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f307525b;

    public b(@NotNull Method method, @NotNull a aVar) {
        this.f307524a = method;
        this.f307525b = aVar;
    }

    @NotNull
    public final Method a() {
        return this.f307524a;
    }

    public final int b() {
        return this.f307525b.i();
    }

    @NotNull
    public final Class<?>[] c() {
        return (Class[]) ArraysKt.copyOfRange(this.f307524a.getParameterTypes(), 0, this.f307525b.i());
    }

    @NotNull
    public final Parameter[] d() {
        return (Parameter[]) ArraysKt.copyOfRange(this.f307524a.getParameters(), 0, this.f307525b.i());
    }

    @Nullable
    public final Object e(@NotNull c0 c0Var, @Nullable Object obj, @NotNull Object... objArr) {
        Object objH;
        a aVar = this.f307525b;
        int iB = aVar.b();
        int iC = aVar.c();
        int iD = aVar.d();
        int length = this.f307524a.getParameterTypes().length;
        int i10 = iB + 1;
        int i11 = iC + i10;
        int i12 = 0;
        Object[] objArr2 = new Integer[iD];
        for (int i13 = 0; i13 < iD; i13++) {
            int i14 = i13 * 31;
            IntRange intRangeW1 = r.W1(i14, Math.min(i14 + 31, iB));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
            Iterator<Integer> it = intRangeW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= objArr.length || objArr[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i15 = 0;
            for (Object obj2 : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj2).intValue() << i15;
                i15 = i16;
            }
            objArr2[i13] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i12 < length) {
            if (i12 >= 0 && i12 < iB) {
                objH = (i12 < 0 || i12 >= objArr.length) ? c.h(this.f307524a.getParameterTypes()[i12]) : objArr[i12];
            } else if (i12 == iB) {
                objH = c0Var;
            } else if (i12 == i10 || (iB + 2 <= i12 && i12 < i11)) {
                objH = 0;
            } else {
                if (i11 > i12 || i12 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                objH = objArr2[i12 - i11];
            }
            objArr3[i12] = objH;
            i12++;
        }
        return this.f307524a.invoke(obj, Arrays.copyOf(objArr3, length));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f307524a, ((b) obj).f307524a);
        }
        return false;
    }

    public int hashCode() {
        return this.f307524a.hashCode();
    }
}
