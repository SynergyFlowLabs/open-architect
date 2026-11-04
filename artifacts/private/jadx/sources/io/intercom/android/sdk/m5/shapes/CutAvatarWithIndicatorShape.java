package io.intercom.android.sdk.m5.shapes;

import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.internal.w0;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCutAvatarWithIndicatorShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutAvatarWithIndicatorShape.kt\nio/intercom/android/sdk/m5/shapes/CutAvatarWithIndicatorShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,73:1\n1#2:74\n113#3:75\n33#4:76\n53#5,3:77\n70#5:81\n60#5:84\n53#5,3:87\n53#5,3:91\n61#6:80\n57#6:83\n22#7:82\n22#7:85\n30#8:86\n30#8:90\n*S KotlinDebug\n*F\n+ 1 CutAvatarWithIndicatorShape.kt\nio/intercom/android/sdk/m5/shapes/CutAvatarWithIndicatorShape\n*L\n26#1:75\n36#1:76\n36#1:77,3\n49#1:81\n69#1:84\n69#1:87,3\n70#1:91,3\n49#1:80\n69#1:83\n49#1:82\n69#1:85\n69#1:86\n70#1:90\n*E\n"})
public final class CutAvatarWithIndicatorShape implements q3 {
    public static final int $stable = 0;
    private final float indicatorSize;

    @NotNull
    private final q3 shape;

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

    public /* synthetic */ CutAvatarWithIndicatorShape(q3 q3Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, f10);
    }

    /* JADX INFO: renamed from: getOffset-XPhi94U, reason: not valid java name */
    private final long m412getOffsetXPhi94U(long j10, float f10, float f11, float f12, w wVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[wVar.ordinal()];
        if (i10 == 1) {
            return g.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j10 >> 32)) - f10) + f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & k0.f265952a));
        }
        if (i10 != 2) {
            throw new kotlin.k0();
        }
        return g.g((((long) Float.floatToRawIntBits(0.0f - f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & k0.f265952a));
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public f2 mo0createOutlinePq9zytI(long j10, @NotNull w layoutDirection, @NotNull d density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float f10 = 2;
        float fS7 = density.S7(h.r(f10));
        float fS8 = density.S7(this.indicatorSize) + (f10 * fS7);
        n nVarK = o.k();
        k2 k2VarA = u.a();
        g2.a(k2VarA, this.shape.mo0createOutlinePq9zytI(j10, layoutDirection, density));
        k2 k2VarA2 = u.a();
        g2.a(k2VarA2, nVarK.mo0createOutlinePq9zytI(n0.n.f((((long) Float.floatToRawIntBits(fS8)) << 32) | (((long) Float.floatToRawIntBits(fS8)) & k0.f265952a)), layoutDirection, density));
        k2 k2VarA3 = u.a();
        k2VarA3.E(k2VarA2, m412getOffsetXPhi94U(j10, fS8, fS7, (Float.intBitsToFloat((int) (j10 & k0.f265952a)) - fS8) + fS7, layoutDirection));
        k2 k2VarA4 = u.a();
        k2VarA4.X(k2VarA, k2VarA3, t2.f38235b.a());
        return new f2.a(k2VarA4);
    }

    private CutAvatarWithIndicatorShape(q3 shape, float f10) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        this.indicatorSize = f10;
    }
}
