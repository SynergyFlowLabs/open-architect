package androidx.compose.material.internal;

import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n123#2:88\n123#2:89\n640#3,2:90\n653#3,2:92\n655#3,11:98\n653#3,13:109\n73#4,4:94\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/IconsKt\n*L\n59#1:88\n60#1:89\n73#1:90,2\n73#1:92,2\n73#1:98,11\n73#1:109,13\n73#1:94,4\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23220a = 24.0f;

    private static final androidx.compose.ui.graphics.vector.d a(String str, Function1<? super androidx.compose.ui.graphics.vector.d.a, androidx.compose.ui.graphics.vector.d.a> function1) {
        return function1.invoke(new androidx.compose.ui.graphics.vector.d.a(str, androidx.compose.ui.unit.h.r(f23220a), androidx.compose.ui.unit.h.r(f23220a), f23220a, f23220a, 0L, 0, false, 224, null)).f();
    }

    private static final androidx.compose.ui.graphics.vector.d.a b(androidx.compose.ui.graphics.vector.d.a aVar, float f10, float f11, int i10, Function1<? super androidx.compose.ui.graphics.vector.f, Unit> function1) {
        s3 s3Var = new s3(q0.f38131b.a(), null);
        int iA = u3.f38256b.a();
        int iA2 = v3.f38275b.a();
        androidx.compose.ui.graphics.vector.f fVar = new androidx.compose.ui.graphics.vector.f();
        function1.invoke(fVar);
        return androidx.compose.ui.graphics.vector.d.a.d(aVar, fVar.f(), i10, "", s3Var, f10, null, f11, 1.0f, iA, iA2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    static /* synthetic */ androidx.compose.ui.graphics.vector.d.a c(androidx.compose.ui.graphics.vector.d.a aVar, float f10, float f11, int i10, Function1 function1, int i11, Object obj) {
        float f12 = (i11 & 1) != 0 ? 1.0f : f10;
        float f13 = (i11 & 2) != 0 ? 1.0f : f11;
        int iC = (i11 & 4) != 0 ? androidx.compose.ui.graphics.vector.s.c() : i10;
        s3 s3Var = new s3(q0.f38131b.a(), null);
        int iA = u3.f38256b.a();
        int iA2 = v3.f38275b.a();
        androidx.compose.ui.graphics.vector.f fVar = new androidx.compose.ui.graphics.vector.f();
        function1.invoke(fVar);
        return androidx.compose.ui.graphics.vector.d.a.d(aVar, fVar.f(), iC, "", s3Var, f12, null, f13, 1.0f, iA, iA2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
