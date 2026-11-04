package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.u;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShape\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,202:1\n57#2:203\n57#2:206\n57#2:209\n61#2:212\n57#2:214\n61#2:217\n61#2:219\n61#2:222\n60#3:204\n60#3:207\n60#3:210\n70#3:213\n60#3:215\n70#3:218\n70#3:220\n70#3:223\n22#4:205\n22#4:208\n22#4:211\n22#4:216\n22#4:221\n22#4:224\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShape\n*L\n71#1:203\n72#1:206\n74#1:209\n74#1:212\n75#1:214\n75#1:217\n77#1:219\n78#1:222\n71#1:204\n72#1:207\n74#1:210\n74#1:213\n75#1:215\n75#1:218\n77#1:220\n78#1:223\n71#1:205\n72#1:208\n74#1:211\n75#1:216\n77#1:221\n78#1:224\n*E\n"})
public final class h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18740f = 0;

    public h(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    public f2 d(long j10, float f10, float f11, float f12, float f13, @NotNull w wVar) {
        if (f10 + f11 + f13 + f12 == 0.0f) {
            return new f2.b(n0.o.m(j10));
        }
        k2 k2VarA = u.a();
        w wVar2 = w.Ltr;
        float f14 = wVar == wVar2 ? f10 : f11;
        k2VarA.A(0.0f, f14);
        k2VarA.F(f14, 0.0f);
        if (wVar == wVar2) {
            f10 = f11;
        }
        int i10 = (int) (j10 >> 32);
        k2VarA.F(Float.intBitsToFloat(i10) - f10, 0.0f);
        k2VarA.F(Float.intBitsToFloat(i10), f10);
        float f15 = wVar == wVar2 ? f12 : f13;
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & k0.f265952a);
        k2VarA.F(fIntBitsToFloat, Float.intBitsToFloat(i11) - f15);
        k2VarA.F(Float.intBitsToFloat(i10) - f15, Float.intBitsToFloat(i11));
        if (wVar == wVar2) {
            f12 = f13;
        }
        k2VarA.F(f12, Float.intBitsToFloat(i11));
        k2VarA.F(0.0f, Float.intBitsToFloat(i11) - f12);
        k2VarA.close();
        return new f2.a(k2VarA);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(h(), hVar.h()) && Intrinsics.areEqual(g(), hVar.g()) && Intrinsics.areEqual(e(), hVar.e()) && Intrinsics.areEqual(f(), hVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // androidx.compose.foundation.shape.e
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h b(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new h(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public String toString() {
        return "CutCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
