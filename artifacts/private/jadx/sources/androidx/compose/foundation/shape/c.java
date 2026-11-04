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
@SourceDebugExtension({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n33#2:198\n33#2:202\n33#2:206\n33#2:210\n33#2:214\n53#3,3:199\n53#3,3:203\n53#3,3:207\n53#3,3:211\n53#3,3:215\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShape\n*L\n67#1:198\n68#1:202\n69#1:206\n70#1:210\n113#1:214\n67#1:199,3\n68#1:203,3\n69#1:207,3\n70#1:211,3\n113#1:215,3\n*E\n"})
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18733f = 0;

    public c(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    private final long j(float f10) {
        return n0.a.e((((long) Float.floatToRawIntBits(f10)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    public f2 d(long j10, float f10, float f11, float f12, float f13, @NotNull w wVar) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new f2.b(n0.o.m(j10));
        }
        return new f2.c(n0.m.c(n0.o.m(j10), n0.a.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & k0.f265952a)), n0.a.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a)), n0.a.e((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & k0.f265952a)), n0.a.e((((long) Float.floatToRawIntBits(f13)) & k0.f265952a) | (Float.floatToRawIntBits(f13) << 32))));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(h(), cVar.h()) && Intrinsics.areEqual(g(), cVar.g()) && Intrinsics.areEqual(e(), cVar.e()) && Intrinsics.areEqual(f(), cVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c b(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new c(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + h() + ", topRight = " + g() + ", bottomRight = " + e() + ", bottomLeft = " + f() + ')';
    }
}
