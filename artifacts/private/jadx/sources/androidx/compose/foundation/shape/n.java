package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,201:1\n33#2:202\n33#2:206\n33#2:210\n33#2:214\n53#3,3:203\n53#3,3:207\n53#3,3:211\n53#3,3:215\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShape\n*L\n69#1:202\n70#1:206\n72#1:210\n74#1:214\n69#1:203,3\n70#1:207,3\n72#1:211,3\n74#1:215,3\n*E\n"})
public final class n extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18746f = 0;

    public n(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    public f2 d(long j10, float f10, float f11, float f12, float f13, @NotNull w wVar) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new f2.b(n0.o.m(j10));
        }
        n0.j jVarM = n0.o.m(j10);
        w wVar2 = w.Ltr;
        float f14 = wVar == wVar2 ? f10 : f11;
        long jE = n0.a.e((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & k0.f265952a));
        float f15 = wVar == wVar2 ? f11 : f10;
        long jE2 = n0.a.e((((long) Float.floatToRawIntBits(f15)) & k0.f265952a) | (((long) Float.floatToRawIntBits(f15)) << 32));
        float f16 = wVar == wVar2 ? f12 : f13;
        long jE3 = n0.a.e((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & k0.f265952a));
        float f17 = wVar == wVar2 ? f13 : f12;
        return new f2.c(n0.m.c(jVarM, jE, jE2, jE3, n0.a.e((((long) Float.floatToRawIntBits(f17)) & k0.f265952a) | (((long) Float.floatToRawIntBits(f17)) << 32))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(h(), nVar.h()) && Intrinsics.areEqual(g(), nVar.g()) && Intrinsics.areEqual(e(), nVar.e()) && Intrinsics.areEqual(f(), nVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n b(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new n(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
