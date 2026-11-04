package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,742:1\n65#2:743\n69#2:746\n65#2:753\n69#2:757\n65#2:761\n69#2:765\n60#3:744\n70#3:747\n53#3,3:750\n60#3:754\n70#3:758\n60#3:762\n70#3:766\n53#3,3:770\n53#3,3:774\n22#4:745\n22#4:748\n22#4:755\n22#4:759\n22#4:763\n22#4:767\n33#5:749\n57#6:756\n61#6:760\n57#6:764\n61#6:768\n30#7:769\n30#7:773\n266#7,2:777\n266#7,2:779\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n*L\n468#1:743\n469#1:746\n473#1:753\n474#1:757\n475#1:761\n476#1:765\n468#1:744\n469#1:747\n467#1:750,3\n473#1:754\n474#1:758\n475#1:762\n476#1:766\n480#1:770,3\n481#1:774,3\n468#1:745\n469#1:748\n473#1:755\n474#1:759\n475#1:763\n476#1:767\n467#1:749\n473#1:756\n474#1:760\n475#1:764\n476#1:768\n480#1:769\n481#1:773\n509#1:777,2\n510#1:779,2\n*E\n"})
public final class b2 extends m3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<q0> f37530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<Float> f37531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f37532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f37533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f37534j;

    public /* synthetic */ b2(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    @Override // androidx.compose.ui.graphics.i0
    public long b() {
        float fAbs;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f37532h >> 32));
        float fAbs2 = Float.NaN;
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            fAbs = Float.NaN;
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f37533i >> 32));
            if (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) {
                fAbs = Float.NaN;
            } else {
                fAbs = Math.abs(Float.intBitsToFloat((int) (this.f37532h >> 32)) - Float.intBitsToFloat((int) (this.f37533i >> 32)));
            }
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f37532h & com.rabbitmq.client.k0.f265952a));
        if (!Float.isInfinite(fIntBitsToFloat3) && !Float.isNaN(fIntBitsToFloat3)) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f37533i & com.rabbitmq.client.k0.f265952a));
            if (!Float.isInfinite(fIntBitsToFloat4) && !Float.isNaN(fIntBitsToFloat4)) {
                fAbs2 = Math.abs(Float.intBitsToFloat((int) (this.f37532h & com.rabbitmq.client.k0.f265952a)) - Float.intBitsToFloat((int) (this.f37533i & com.rabbitmq.client.k0.f265952a)));
            }
        }
        return n0.n.f((((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.graphics.m3
    @NotNull
    public Shader c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f37532h >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f37532h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f37532h & com.rabbitmq.client.k0.f265952a)) == Float.POSITIVE_INFINITY ? j10 & com.rabbitmq.client.k0.f265952a : this.f37532h & com.rabbitmq.client.k0.f265952a));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f37533i >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f37533i >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f37533i & com.rabbitmq.client.k0.f265952a)) == Float.POSITIVE_INFINITY ? j10 & com.rabbitmq.client.k0.f265952a : this.f37533i & com.rabbitmq.client.k0.f265952a));
        List<q0> list = this.f37530f;
        List<Float> list2 = this.f37531g;
        return n3.d(n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.f37534j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.areEqual(this.f37530f, b2Var.f37530f) && Intrinsics.areEqual(this.f37531g, b2Var.f37531g) && n0.g.l(this.f37532h, b2Var.f37532h) && n0.g.l(this.f37533i, b2Var.f37533i) && x3.h(this.f37534j, b2Var.f37534j);
    }

    public int hashCode() {
        int iHashCode = this.f37530f.hashCode() * 31;
        List<Float> list = this.f37531g;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + n0.g.t(this.f37532h)) * 31) + n0.g.t(this.f37533i)) * 31) + x3.i(this.f37534j);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (((((this.f37532h & n0.d.f332688c) ^ n0.d.f332688c) - n0.d.f332692g) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) n0.g.z(this.f37532h)) + ", ";
        } else {
            str = "";
        }
        if ((((n0.d.f332688c ^ (this.f37533i & n0.d.f332688c)) - n0.d.f332692g) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) n0.g.z(this.f37533i)) + ", ";
        }
        return "LinearGradient(colors=" + this.f37530f + ", stops=" + this.f37531g + ", " + str + str2 + "tileMode=" + ((Object) x3.j(this.f37534j)) + ')';
    }

    public /* synthetic */ b2(List list, List list2, long j10, long j11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? x3.f38688b.a() : i10, null);
    }

    private b2(List<q0> list, List<Float> list2, long j10, long j11, int i10) {
        this.f37530f = list;
        this.f37531g = list2;
        this.f37532h = j10;
        this.f37533i = j11;
        this.f37534j = i10;
    }
}
