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
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,742:1\n139#2:743\n139#2:768\n33#3:744\n53#4,3:745\n60#4:750\n70#4:753\n60#4:756\n70#4:760\n53#4,3:764\n278#5:748\n30#5:763\n273#5:767\n65#6:749\n69#6:752\n65#6:755\n69#6:759\n22#7:751\n22#7:754\n22#7:757\n22#7:761\n57#8:758\n61#8:762\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n*L\n532#1:743\n583#1:768\n533#1:744\n533#1:745,3\n543#1:750\n544#1:753\n546#1:756\n547#1:760\n553#1:764,3\n541#1:748\n553#1:763\n582#1:767\n543#1:749\n544#1:752\n546#1:755\n547#1:759\n543#1:751\n544#1:754\n546#1:757\n547#1:761\n546#1:758\n547#1:762\n*E\n"})
public final class b3 extends m3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<q0> f37535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<Float> f37536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f37537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f37538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f37539j;

    public /* synthetic */ b3(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    @Override // androidx.compose.ui.graphics.i0
    public long b() {
        if ((Float.floatToRawIntBits(this.f37538i) & Integer.MAX_VALUE) >= 2139095040) {
            return n0.n.f332724b.a();
        }
        float f10 = this.f37538i;
        float f11 = 2;
        return n0.n.f((((long) Float.floatToRawIntBits(f10 * f11)) << 32) | (((long) Float.floatToRawIntBits(f10 * f11)) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.graphics.m3
    @NotNull
    public Shader c(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.f37537h;
        if ((9223372034707292159L & j11) == n0.d.f332689d) {
            long jB = n0.o.b(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f37537h >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.f37537h & com.rabbitmq.client.k0.f265952a)) == Float.POSITIVE_INFINITY ? j10 & com.rabbitmq.client.k0.f265952a : this.f37537h & com.rabbitmq.client.k0.f265952a));
        }
        List<q0> list = this.f37535f;
        List<Float> list2 = this.f37536g;
        long jG = n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))));
        float fQ = this.f37538i;
        if (fQ == Float.POSITIVE_INFINITY) {
            fQ = n0.n.q(j10) / 2;
        }
        return n3.f(jG, fQ, list, list2, this.f37539j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.areEqual(this.f37535f, b3Var.f37535f) && Intrinsics.areEqual(this.f37536g, b3Var.f37536g) && n0.g.l(this.f37537h, b3Var.f37537h) && this.f37538i == b3Var.f37538i && x3.h(this.f37539j, b3Var.f37539j);
    }

    public int hashCode() {
        int iHashCode = this.f37535f.hashCode() * 31;
        List<Float> list = this.f37536g;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + n0.g.t(this.f37537h)) * 31) + Float.hashCode(this.f37538i)) * 31) + x3.i(this.f37539j);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if ((this.f37537h & 9223372034707292159L) != n0.d.f332689d) {
            str = "center=" + ((Object) n0.g.z(this.f37537h)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.f37538i) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.f37538i + ", ";
        }
        return "RadialGradient(colors=" + this.f37535f + ", stops=" + this.f37536g + ", " + str + str2 + "tileMode=" + ((Object) x3.j(this.f37539j)) + ')';
    }

    public /* synthetic */ b3(List list, List list2, long j10, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, f10, (i11 & 16) != 0 ? x3.f38688b.a() : i10, null);
    }

    private b3(List<q0> list, List<Float> list2, long j10, float f10, int i10) {
        this.f37535f = list;
        this.f37536g = list2;
        this.f37537h = j10;
        this.f37538i = f10;
        this.f37539j = i10;
    }
}
