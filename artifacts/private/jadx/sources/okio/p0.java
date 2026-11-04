package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends AbstractList<o> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f335056c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o[] f335057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f335058b;

    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13374#3,3:240\n74#4:243\n74#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, l lVar, int i10, List<? extends o> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (list.get(i17).v0() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            o oVar = list.get(i11);
            o oVar2 = list.get(i12 - 1);
            if (i16 == oVar.v0()) {
                int iIntValue = list2.get(i11).intValue();
                int i18 = i11 + 1;
                o oVar3 = list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                oVar = oVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (oVar.E(i16) == oVar2.E(i16)) {
                int iMin = Math.min(oVar.v0(), oVar2.v0());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && oVar.E(i20) == oVar2.E(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(lVar) + ((long) 2) + ((long) i19) + 1;
                lVar.writeInt(-i19);
                lVar.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    lVar.writeInt(oVar.E(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != list.get(i13).v0()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    lVar.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    l lVar2 = new l();
                    lVar.writeInt(((int) (c(lVar2) + jC)) * (-1));
                    a(jC, lVar2, i21, list, i13, i12, list2);
                    lVar.Ma(lVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (list.get(i23 - 1).E(i16) != list.get(i23).E(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(lVar) + ((long) 2) + ((long) (i22 * 2));
            lVar.writeInt(i22);
            lVar.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bE = list.get(i24).E(i16);
                if (i24 == i13 || bE != list.get(i24 - 1).E(i16)) {
                    lVar.writeInt(bE & 255);
                }
            }
            l lVar3 = new l();
            while (i13 < i12) {
                byte bE2 = list.get(i13).E(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bE2 != list.get(i26).E(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == list.get(i13).v0()) {
                    lVar.writeInt(list2.get(i13).intValue());
                    j11 = jC2;
                } else {
                    lVar.writeInt(((int) (c(lVar3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, lVar3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            lVar.Ma(lVar3);
        }

        static /* synthetic */ void b(a aVar, long j10, l lVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, lVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(l lVar) {
            return lVar.size() / ((long) 4);
        }

        @oj.n
        @NotNull
        public final p0 d(@NotNull o... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new p0(new o[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            int size = mutableList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(CollectionsKt.binarySearch$default(mutableList, byteStrings[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((o) mutableList.get(0)).v0() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < mutableList.size()) {
                o oVar = (o) mutableList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < mutableList.size()) {
                    o oVar2 = (o) mutableList.get(i15);
                    if (!oVar2.w0(oVar)) {
                        break;
                    }
                    if (oVar2.v0() == oVar.v0()) {
                        throw new IllegalArgumentException(("duplicate option: " + oVar2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        mutableList.remove(i15);
                        arrayList.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            l lVar = new l();
            b(this, 0L, lVar, 0, mutableList, 0, 0, arrayList, 53, null);
            int iC = (int) c(lVar);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = lVar.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new p0((o[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ p0(o[] oVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVarArr, iArr);
    }

    @oj.n
    @NotNull
    public static final p0 n(@NotNull o... oVarArr) {
        return f335056c.d(oVarArr);
    }

    public /* bridge */ boolean c(o oVar) {
        return super.contains(oVar);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o) {
            return c((o) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o get(int i10) {
        return this.f335057a[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f335057a.length;
    }

    @NotNull
    public final o[] i() {
        return this.f335057a;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof o) {
            return l((o) obj);
        }
        return -1;
    }

    @NotNull
    public final int[] k() {
        return this.f335058b;
    }

    public /* bridge */ int l(o oVar) {
        return super.indexOf(oVar);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof o) {
            return m((o) obj);
        }
        return -1;
    }

    public /* bridge */ int m(o oVar) {
        return super.lastIndexOf(oVar);
    }

    private p0(o[] oVarArr, int[] iArr) {
        this.f335057a = oVarArr;
        this.f335058b = iArr;
    }
}
