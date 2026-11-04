package io.intercom.android.sdk.m5.shapes;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.g;
import n0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCutAvatarBoxShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutAvatarBoxShape.kt\nio/intercom/android/sdk/m5/shapes/CutAvatarBoxShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n1#2:70\n57#3:71\n61#3:74\n60#4:72\n70#4:75\n53#4,3:77\n53#4,3:85\n53#4,3:89\n22#5:73\n33#6:76\n1557#7:80\n1628#7,3:81\n30#8:84\n30#8:88\n*S KotlinDebug\n*F\n+ 1 CutAvatarBoxShape.kt\nio/intercom/android/sdk/m5/shapes/CutAvatarBoxShape\n*L\n32#1:71\n32#1:74\n32#1:72\n32#1:75\n32#1:77,3\n65#1:85,3\n66#1:89,3\n32#1:73\n32#1:76\n39#1:80\n39#1:81,3\n65#1:84\n66#1:88\n*E\n"})
public final class CutAvatarBoxShape implements q3 {
    public static final int $stable = 0;
    private final float cut;

    @NotNull
    private final List<Pair<h, h>> cutsOffsets;

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

    public /* synthetic */ CutAvatarBoxShape(q3 q3Var, float f10, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, f10, list);
    }

    /* JADX INFO: renamed from: getOffset-Rc2DDho, reason: not valid java name */
    private final long m411getOffsetRc2DDho(float f10, float f11, float f12, w wVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[wVar.ordinal()];
        if (i10 == 1) {
            return g.g((((long) Float.floatToRawIntBits(f11 - f10)) << 32) | (((long) Float.floatToRawIntBits(f12 - f10)) & k0.f265952a));
        }
        if (i10 != 2) {
            throw new kotlin.k0();
        }
        return g.g((((long) Float.floatToRawIntBits((-f11) - f10)) << 32) | (((long) Float.floatToRawIntBits(f12 - f10)) & k0.f265952a));
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public f2 mo0createOutlinePq9zytI(long j10, @NotNull w layoutDirection, @NotNull d density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fS7 = density.S7(this.cut);
        k2 k2VarA = u.a();
        g2.a(k2VarA, this.shape.mo0createOutlinePq9zytI(j10, layoutDirection, density));
        k2 k2VarA2 = u.a();
        q3 q3Var = this.shape;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + fS7;
        g2.a(k2VarA2, q3Var.mo0createOutlinePq9zytI(n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & k0.f265952a)) + fS7)) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), layoutDirection, density));
        k2 k2VarA3 = u.a();
        List<Pair<h, h>> list = this.cutsOffsets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            k2VarA3.E(k2VarA2, m411getOffsetRc2DDho(fS7 / 2, density.S7(((h) pair.component1()).O()), density.S7(((h) pair.component2()).O()), layoutDirection));
            arrayList.add(Unit.f312394a);
        }
        k2 k2VarA4 = u.a();
        k2VarA4.X(k2VarA, k2VarA3, t2.f38235b.a());
        return new f2.a(k2VarA4);
    }

    private CutAvatarBoxShape(q3 shape, float f10, List<Pair<h, h>> cutsOffsets) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(cutsOffsets, "cutsOffsets");
        this.shape = shape;
        this.cut = f10;
        this.cutsOffsets = cutsOffsets;
    }
}
