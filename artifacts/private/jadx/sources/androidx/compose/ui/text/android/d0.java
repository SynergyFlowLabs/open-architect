package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,433:1\n1#2:434\n1682#3,6:435\n1682#3,6:441\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:435,6\n324#1:441,6\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f41351g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Layout f41352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Integer> f41353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Bidi> f41354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final boolean[] f41355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private char[] f41356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41357f;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41358d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f41361c;

        public a(int i10, int i11, boolean z10) {
            this.f41359a = i10;
            this.f41360b = i11;
            this.f41361c = z10;
        }

        public static /* synthetic */ a e(a aVar, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f41359a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f41360b;
            }
            if ((i12 & 4) != 0) {
                z10 = aVar.f41361c;
            }
            return aVar.d(i10, i11, z10);
        }

        public final int a() {
            return this.f41359a;
        }

        public final int b() {
            return this.f41360b;
        }

        public final boolean c() {
            return this.f41361c;
        }

        @NotNull
        public final a d(int i10, int i11, boolean z10) {
            return new a(i10, i11, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f41359a == aVar.f41359a && this.f41360b == aVar.f41360b && this.f41361c == aVar.f41361c) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f41360b;
        }

        public final int g() {
            return this.f41359a;
        }

        public final boolean h() {
            return this.f41361c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f41359a) * 31) + Integer.hashCode(this.f41360b)) * 31) + Boolean.hashCode(this.f41361c);
        }

        @NotNull
        public String toString() {
            return "BidiRun(start=" + this.f41359a + ", end=" + this.f41360b + ", isRtl=" + this.f41361c + ')';
        }
    }

    public d0(@NotNull Layout layout) {
        this.f41352a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iQ3 = StringsKt.q3(this.f41352a.getText(), '\n', length, false, 4, null);
            length = iQ3 < 0 ? this.f41352a.getText().length() : iQ3 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f41352a.getText().length());
        this.f41353b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f41354c = arrayList2;
        this.f41355d = new boolean[this.f41353b.size()];
        this.f41357f = this.f41353b.size();
    }

    private final float b(int i10, boolean z10) {
        int iB = kotlin.ranges.r.B(i10, this.f41352a.getLineEnd(this.f41352a.getLineForOffset(i10)));
        return z10 ? this.f41352a.getPrimaryHorizontal(iB) : this.f41352a.getSecondaryHorizontal(iB);
    }

    public static /* synthetic */ int j(d0 d0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return d0Var.i(i10, z10);
    }

    private final int n(int i10, int i11) {
        while (i10 > i11 && l(this.f41352a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    @Nullable
    public final Bidi a(int i10) {
        Bidi bidi;
        if (this.f41355d[i10]) {
            return this.f41354c.get(i10);
        }
        int iIntValue = i10 == 0 ? 0 : this.f41353b.get(i10 - 1).intValue();
        int iIntValue2 = this.f41353b.get(i10).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = this.f41356e;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.f41352a.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, m(i10) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.f41354c.set(i10, bidi);
        this.f41355d[i10] = true;
        if (bidi != null) {
            char[] cArr3 = this.f41356e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f41356e = cArr2;
        return bidi;
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int iN = i10;
        if (!z11) {
            return b(i10, z10);
        }
        int iA = c0.a(this.f41352a, iN, z11);
        int lineStart = this.f41352a.getLineStart(iA);
        int lineEnd = this.f41352a.getLineEnd(iA);
        if (iN != lineStart && iN != lineEnd) {
            return b(i10, z10);
        }
        if (iN == 0 || iN == this.f41352a.getText().length()) {
            return b(i10, z10);
        }
        int i11 = i(iN, z11);
        boolean zM = m(i11);
        int iN2 = n(lineEnd, lineStart);
        int iK = k(i11);
        int i12 = lineStart - iK;
        int i13 = iN2 - iK;
        Bidi bidiA = a(i11);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i12, i13) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f41352a.isRtlCharAt(lineStart);
            if (z10 || zM == zIsRtlCharAt) {
                zM = !zM;
            }
            if (iN == lineStart) {
                z12 = zM;
            } else if (!zM) {
                z12 = true;
            }
            Layout layout = this.f41352a;
            return z12 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            aVarArr[i14] = new a(bidiCreateLineBidi.getRunStart(i14) + lineStart, bidiCreateLineBidi.getRunLimit(i14) + lineStart, bidiCreateLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) bidiCreateLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i16 = -1;
        if (iN == lineStart) {
            for (int i17 = 0; i17 < runCount; i17++) {
                if (aVarArr[i17].g() == iN) {
                    i16 = i17;
                    break;
                }
            }
            a aVar = aVarArr[i16];
            if (z10 || zM == aVar.h()) {
                zM = !zM;
            }
            if (i16 == 0 && zM) {
                return this.f41352a.getLineLeft(iA);
            }
            if (i16 != ArraysKt.getLastIndex(aVarArr) || zM) {
                return zM ? this.f41352a.getPrimaryHorizontal(aVarArr[i16 - 1].g()) : this.f41352a.getPrimaryHorizontal(aVarArr[i16 + 1].g());
            }
            return this.f41352a.getLineRight(iA);
        }
        if (iN > iN2) {
            iN = n(iN, lineStart);
        }
        for (int i18 = 0; i18 < runCount; i18++) {
            if (aVarArr[i18].f() == iN) {
                i16 = i18;
                break;
            }
        }
        a aVar2 = aVarArr[i16];
        if (!z10 && zM != aVar2.h()) {
            zM = !zM;
        }
        if (i16 == 0 && zM) {
            return this.f41352a.getLineLeft(iA);
        }
        if (i16 != ArraysKt.getLastIndex(aVarArr) || zM) {
            return zM ? this.f41352a.getPrimaryHorizontal(aVarArr[i16 - 1].f()) : this.f41352a.getPrimaryHorizontal(aVarArr[i16 + 1].f());
        }
        return this.f41352a.getLineRight(iA);
    }

    @NotNull
    public final Layout d() {
        return this.f41352a;
    }

    @NotNull
    public final a[] e(int i10) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f41352a.getLineStart(i10);
        int lineEnd = this.f41352a.getLineEnd(i10);
        int iJ = j(this, lineStart, false, 2, null);
        int iK = k(iJ);
        int i11 = lineStart - iK;
        int i12 = lineEnd - iK;
        Bidi bidiA = a(iJ);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f41352a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = bidiCreateLineBidi.getRunStart(i13) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    public final int f(int i10) {
        return n(this.f41352a.getLineEnd(i10), this.f41352a.getLineStart(i10));
    }

    public final int g() {
        return this.f41357f;
    }

    public final int h(@androidx.annotation.g0(from = 0) int i10) {
        return this.f41353b.get(i10).intValue();
    }

    public final int i(@androidx.annotation.g0(from = 0) int i10, boolean z10) {
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.f41353b, Integer.valueOf(i10), 0, 0, 6, (Object) null);
        int i11 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.f41353b.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f41353b.get(i10 - 1).intValue();
    }

    public final boolean l(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == 5760 || (Intrinsics.compare((int) c10, 8192) >= 0 && Intrinsics.compare((int) c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean m(@androidx.annotation.g0(from = 0) int i10) {
        if (this.f41352a.getParagraphDirection(this.f41352a.getLineForOffset(k(i10))) != -1) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }
}
