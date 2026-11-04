package io.intercom.android.sdk.m5.shapes;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.t2;
import androidx.compose.ui.graphics.u;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nOverlappedAvatarShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappedAvatarShape.kt\nio/intercom/android/sdk/m5/shapes/OverlappedAvatarShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,43:1\n1#2:44\n57#3:45\n60#4:46\n53#4,3:49\n53#4,3:53\n22#5:47\n30#6:48\n30#6:52\n*S KotlinDebug\n*F\n+ 1 OverlappedAvatarShape.kt\nio/intercom/android/sdk/m5/shapes/OverlappedAvatarShape\n*L\n27#1:45\n27#1:46\n39#1:49,3\n40#1:53,3\n27#1:47\n39#1:48\n40#1:52\n*E\n"})
public final class OverlappedAvatarShape implements q3 {
    public static final int $stable = 0;

    @NotNull
    private final q3 currentAvatarShape;
    private final float cut;

    @NotNull
    private final q3 previousAvatarShape;

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

    public /* synthetic */ OverlappedAvatarShape(q3 q3Var, q3 q3Var2, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, q3Var2, f10);
    }

    /* JADX INFO: renamed from: getOffset-dBAh8RU, reason: not valid java name */
    private final long m414getOffsetdBAh8RU(float f10, w wVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[wVar.ordinal()];
        if (i10 == 1) {
            return g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(0.0f))));
        }
        if (i10 != 2) {
            throw new kotlin.k0();
        }
        return g.g((((long) Float.floatToRawIntBits(-f10)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(0.0f))));
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public f2 mo0createOutlinePq9zytI(long j10, @NotNull w layoutDirection, @NotNull d density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fS7 = density.S7(this.cut);
        k2 k2VarA = u.a();
        g2.a(k2VarA, this.currentAvatarShape.mo0createOutlinePq9zytI(j10, layoutDirection, density));
        k2 k2VarA2 = u.a();
        g2.a(k2VarA2, this.previousAvatarShape.mo0createOutlinePq9zytI(j10, layoutDirection, density));
        k2 k2VarA3 = u.a();
        k2VarA3.E(k2VarA2, m414getOffsetdBAh8RU(fS7 - Float.intBitsToFloat((int) (j10 >> 32)), layoutDirection));
        k2 k2VarA4 = u.a();
        k2VarA4.X(k2VarA, k2VarA3, t2.f38235b.a());
        return new f2.a(k2VarA4);
    }

    private OverlappedAvatarShape(q3 currentAvatarShape, q3 previousAvatarShape, float f10) {
        Intrinsics.checkNotNullParameter(currentAvatarShape, "currentAvatarShape");
        Intrinsics.checkNotNullParameter(previousAvatarShape, "previousAvatarShape");
        this.currentAvatarShape = currentAvatarShape;
        this.previousAvatarShape = previousAvatarShape;
        this.cut = f10;
    }

    public /* synthetic */ OverlappedAvatarShape(q3 q3Var, q3 q3Var2, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, (i10 & 2) != 0 ? q3Var : q3Var2, f10, null);
    }
}
