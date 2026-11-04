package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.node.k;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.t;
import com.rabbitmq.client.k0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRelativeLayoutBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n1#1,306:1\n893#2:307\n895#2:308\n893#2:311\n895#2:312\n893#2:315\n893#2:316\n895#2:317\n895#2:318\n893#2:319\n895#2:320\n893#2:321\n895#2:322\n893#2:323\n895#2:324\n893#2:325\n895#2:326\n893#2:327\n895#2:328\n893#2:329\n895#2:330\n916#2,2:347\n893#2:351\n895#2:353\n893#2:355\n895#2:357\n860#2:359\n893#2:363\n895#2:364\n893#2:365\n895#2:366\n893#2:367\n895#2:368\n893#2:369\n895#2:370\n893#2,3:371\n893#2:374\n895#2:375\n32#3:309\n32#3:313\n80#4:310\n80#4:314\n590#5,16:331\n606#5,2:349\n608#5:352\n609#5:354\n610#5:356\n611#5:358\n614#5,3:360\n*S KotlinDebug\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n*L\n58#1:307\n59#1:308\n68#1:311\n69#1:312\n76#1:315\n77#1:316\n84#1:317\n85#1:318\n94#1:319\n95#1:320\n96#1:321\n97#1:322\n104#1:323\n105#1:324\n106#1:325\n107#1:326\n134#1:327\n135#1:328\n136#1:329\n137#1:330\n174#1:347,2\n174#1:351\n174#1:353\n174#1:355\n174#1:357\n174#1:359\n197#1:363\n198#1:364\n199#1:365\n200#1:366\n216#1:367\n219#1:368\n222#1:369\n225#1:370\n248#1:371,3\n273#1:374\n274#1:375\n60#1:309\n70#1:313\n60#1:310\n70#1:314\n174#1:331,16\n174#1:349,2\n174#1:352\n174#1:354\n174#1:356\n174#1:358\n174#1:360,3\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41272h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f41277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final float[] f41278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.j f41279g;

    public /* synthetic */ h(long j10, long j11, long j12, long j13, long j14, float[] fArr, androidx.compose.ui.node.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, fArr, jVar);
    }

    @NotNull
    public final List<s> a() {
        int i10;
        int i11;
        f rectManager = k.v(this.f41279g).getRectManager();
        int iK = k.u(this.f41279g).K();
        b bVarF = rectManager.f();
        int iO = bVarF.o(iK);
        if (iO < 0) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        long[] jArr = bVarF.f41234a;
        int i12 = bVarF.f41236c;
        long j10 = jArr[iO];
        long j11 = jArr[iO + 1];
        int i13 = 0;
        while (i13 < jArr.length - 2 && i13 < i12) {
            if (i13 == iO) {
                i13 += 3;
            } else {
                long j12 = jArr[i13];
                long j13 = jArr[i13 + 1];
                if (((((j11 - j12) - n0.d.f332692g) | ((j13 - j10) - n0.d.f332692g)) & (-9223372034707292160L)) == 0) {
                    i10 = i12;
                    i11 = iO;
                    int i14 = (int) (j12 >> 32);
                    int i15 = (int) j12;
                    int i16 = (int) (j13 >> 32);
                    int i17 = (int) j13;
                    if (rectManager.l(iK, ((int) jArr[i13 + 2]) & e.f41245c)) {
                        listCreateListBuilder.add(new s(i14, i15, i16, i17));
                    }
                } else {
                    i10 = i12;
                    i11 = iO;
                }
                i13 += 3;
                iO = i11;
                i12 = i10;
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final float b(@NotNull h hVar) {
        long j10 = hVar.f41273a;
        long j11 = hVar.f41274b;
        return c((int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
    }

    public final float c(int i10, int i11, int i12, int i13) {
        int i14 = (int) (this.f41273a >> 32);
        int iMin = Math.min(Math.max(i14, i10), i12);
        int i15 = (int) this.f41273a;
        int iMin2 = Math.min(Math.max(i15, i11), i13);
        int i16 = (int) (this.f41274b >> 32);
        int iMax = Math.max(Math.min(i16, i12), i10);
        int i17 = (int) this.f41274b;
        return Math.max((iMax - iMin) * (Math.max(Math.min(i17, i13), i11) - iMin2), 0) / Math.min((i12 - i10) * (i13 - i11), (i16 - i14) * (i17 - i15));
    }

    public final float d() {
        long j10 = this.f41277e;
        return c(0, 0, (int) (j10 >> 32), (int) j10);
    }

    public final float e(long j10, long j11) {
        long j12 = this.f41277e;
        int iN = q.n(this.f41275c);
        int iP = q.p(this.f41275c);
        return c(q.n(j10) + iN, q.p(j10) + iP, (iN + ((int) (j12 >> 32))) - q.n(j11), (iP + ((int) j12)) - q.p(j11));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    public boolean equals(@Nullable Object obj) {
        boolean zE;
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f41273a != hVar.f41273a || this.f41274b != hVar.f41274b || this.f41277e != hVar.f41277e || !q.k(this.f41275c, hVar.f41275c) || !q.k(this.f41276d, hVar.f41276d)) {
                return false;
            }
            float[] fArr = this.f41278f;
            float[] fArr2 = hVar.f41278f;
            if (fArr == null) {
                if (fArr2 == null) {
                    zE = true;
                } else {
                    zE = false;
                }
            } else if (fArr2 == null) {
                zE = false;
            } else {
                zE = c2.e(fArr, fArr2);
            }
            return zE && Intrinsics.areEqual(this.f41279g, hVar.f41279g);
        }
        return false;
    }

    @NotNull
    public final s f() {
        long j10 = this.f41273a;
        long j11 = this.f41274b;
        return new s((int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11);
    }

    @NotNull
    public final s g() {
        if (this.f41278f != null) {
            s sVarH = h();
            long j10 = this.f41275c;
            return new s(sVarH.t() + q.n(j10), sVarH.B() + q.p(j10), sVarH.x() + q.n(j10), sVarH.j() + q.p(j10));
        }
        long j11 = this.f41273a;
        int i10 = (int) (j11 >> 32);
        long j12 = this.f41274b;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) j12;
        int iN = q.n(this.f41276d);
        int iP = q.p(this.f41276d);
        return new s(i10 + iN, ((int) j11) + iP, i11 + iN, i12 + iP);
    }

    @NotNull
    public final s h() {
        long j10 = this.f41273a;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) j10;
        long j11 = this.f41274b;
        int i12 = (int) (j11 >> 32);
        int i13 = (int) j11;
        float[] fArr = this.f41278f;
        if (fArr != null) {
            return t.e(c2.k(fArr, new n0.j(i10, i11, i12, i13)));
        }
        int iN = q.n(this.f41276d) - q.n(this.f41275c);
        int iP = q.p(this.f41276d) - q.p(this.f41275c);
        return new s(i10 + iN, i11 + iP, i12 + iN, i13 + iP);
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.f41273a) * 31) + Long.hashCode(this.f41274b)) * 31) + Long.hashCode(this.f41277e)) * 31) + q.q(this.f41275c)) * 31) + q.q(this.f41276d)) * 31;
        float[] fArr = this.f41278f;
        return ((iHashCode + (fArr != null ? c2.h(fArr) : 0)) * 31) + this.f41279g.hashCode();
    }

    public final int i() {
        return ((int) this.f41274b) - ((int) this.f41273a);
    }

    public final long j() {
        return q.f(this.f41273a);
    }

    public final long k() {
        int iN = q.n(this.f41276d);
        int iP = q.p(this.f41276d);
        long j10 = this.f41273a;
        return q.f((((long) (((int) (j10 >> 32)) + iN)) << 32) | (((long) (((int) j10) + iP)) & k0.f265952a));
    }

    public final long l() {
        int iN = q.n(this.f41276d) - q.n(this.f41275c);
        int iP = q.p(this.f41276d) - q.p(this.f41275c);
        long j10 = this.f41273a;
        return q.f((((long) (((int) (j10 >> 32)) + iN)) << 32) | (((long) (((int) j10) + iP)) & k0.f265952a));
    }

    public final int m() {
        return ((int) (this.f41274b >> 32)) - ((int) (this.f41273a >> 32));
    }

    private h(long j10, long j11, long j12, long j13, long j14, float[] fArr, androidx.compose.ui.node.j jVar) {
        this.f41273a = j10;
        this.f41274b = j11;
        this.f41275c = j12;
        this.f41276d = j13;
        this.f41277e = j14;
        this.f41278f = fArr;
        this.f41279g = jVar;
    }
}
