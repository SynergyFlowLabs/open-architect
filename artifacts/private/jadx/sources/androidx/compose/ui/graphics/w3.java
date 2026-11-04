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
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/SweepGradient\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,742:1\n278#2:743\n30#2:752\n273#2:756\n65#3:744\n69#3:748\n60#4:745\n70#4:749\n53#4,3:753\n22#5:746\n22#5:750\n57#6:747\n61#6:751\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/SweepGradient\n*L\n647#1:743\n650#1:752\n678#1:756\n651#1:744\n652#1:748\n651#1:745\n652#1:749\n650#1:753,3\n651#1:746\n652#1:750\n651#1:747\n652#1:751\n*E\n"})
public final class w3 extends m3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f38681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<q0> f38682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final List<Float> f38683h;

    public /* synthetic */ w3(long j10, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, list, list2);
    }

    @Override // androidx.compose.ui.graphics.m3
    @NotNull
    public Shader c(long j10) {
        long jG;
        long j11 = this.f38681f;
        if ((9223372034707292159L & j11) == n0.d.f332689d) {
            jG = n0.o.b(j10);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j11 >> 32)) == Float.POSITIVE_INFINITY ? j10 >> 32 : this.f38681f >> 32));
            if (Float.intBitsToFloat((int) (this.f38681f & com.rabbitmq.client.k0.f265952a)) != Float.POSITIVE_INFINITY) {
                j10 = this.f38681f;
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
            jG = n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        }
        return n3.h(jG, this.f38682g, this.f38683h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        if (n0.g.l(this.f38681f, w3Var.f38681f) && Intrinsics.areEqual(this.f38682g, w3Var.f38682g) && Intrinsics.areEqual(this.f38683h, w3Var.f38683h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int iT = ((n0.g.t(this.f38681f) * 31) + this.f38682g.hashCode()) * 31;
        List<Float> list = this.f38683h;
        return iT + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str;
        if ((this.f38681f & 9223372034707292159L) != n0.d.f332689d) {
            str = "center=" + ((Object) n0.g.z(this.f38681f)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f38682g + ", stops=" + this.f38683h + ')';
    }

    public /* synthetic */ w3(long j10, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }

    private w3(long j10, List<q0> list, List<Float> list2) {
        this.f38681f = j10;
        this.f38682g = list;
        this.f38683h = list2;
    }
}
