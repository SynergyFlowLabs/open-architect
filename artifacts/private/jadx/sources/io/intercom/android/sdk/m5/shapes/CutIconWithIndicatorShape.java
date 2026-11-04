package io.intercom.android.sdk.m5.shapes;

import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.d3;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.t2;
import androidx.compose.ui.graphics.u;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import n0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCutIconWithIndicatorShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutIconWithIndicatorShape.kt\nio/intercom/android/sdk/m5/shapes/CutIconWithIndicatorShape\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,52:1\n113#2:53\n1#3:54\n33#4:55\n53#5,3:56\n60#5:60\n53#5,3:63\n53#5,3:67\n57#6:59\n22#7:61\n30#8:62\n30#8:66\n*S KotlinDebug\n*F\n+ 1 CutIconWithIndicatorShape.kt\nio/intercom/android/sdk/m5/shapes/CutIconWithIndicatorShape\n*L\n17#1:53\n27#1:55\n27#1:56,3\n36#1:60\n48#1:63,3\n49#1:67,3\n36#1:59\n36#1:61\n48#1:62\n49#1:66\n*E\n"})
public final class CutIconWithIndicatorShape implements q3 {
    public static final int $stable = 0;
    private final float indicatorSize;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    /* JADX INFO: renamed from: getOffset-P-0qjgQ, reason: not valid java name */
    private final long m413getOffsetP0qjgQ(float f10, float f11, w wVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[wVar.ordinal()];
        if (i10 == 1) {
            return g.g((((long) Float.floatToRawIntBits(f10 - f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & k0.f265952a));
        }
        if (i10 != 2) {
            throw new kotlin.k0();
        }
        return g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & k0.f265952a));
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public f2 mo0createOutlinePq9zytI(long j10, @NotNull w layoutDirection, @NotNull d density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fS7 = density.S7(this.indicatorSize);
        k2 k2VarA = u.a();
        g2.a(k2VarA, d3.a().mo0createOutlinePq9zytI(j10, layoutDirection, density));
        k2 k2VarA2 = u.a();
        g2.a(k2VarA2, o.k().mo0createOutlinePq9zytI(n.f((((long) Float.floatToRawIntBits(fS7)) << 32) | (((long) Float.floatToRawIntBits(fS7)) & k0.f265952a)), layoutDirection, density));
        k2 k2VarA3 = u.a();
        k2VarA3.E(k2VarA2, m413getOffsetP0qjgQ(Float.intBitsToFloat((int) (j10 >> 32)), fS7, layoutDirection));
        k2 k2VarA4 = u.a();
        k2VarA4.X(k2VarA, k2VarA3, t2.f38235b.a());
        return new f2.a(k2VarA4);
    }

    private CutIconWithIndicatorShape(float f10) {
        this.indicatorSize = f10;
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.r(8) : f10, null);
    }
}
