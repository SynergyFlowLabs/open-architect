package androidx.compose.material3.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material3/internal/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,420:1\n123#2:421\n123#2:422\n123#2:423\n123#2:424\n123#2:425\n123#2:426\n640#3,2:427\n653#3,2:429\n655#3,11:435\n653#3,13:446\n73#4,4:431\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material3/internal/IconsKt\n*L\n375#1:421\n376#1:422\n390#1:423\n391#1:424\n390#1:425\n391#1:426\n405#1:427,2\n405#1:429,2\n405#1:435,11\n405#1:446,13\n405#1:431,4\n*E\n"})
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f29081a = 24.0f;

    private static final androidx.compose.ui.graphics.vector.d a(String str, Function1<? super androidx.compose.ui.graphics.vector.d.a, androidx.compose.ui.graphics.vector.d.a> function1) {
        int i10 = 1 >> 0;
        return function1.invoke(new androidx.compose.ui.graphics.vector.d.a(str, androidx.compose.ui.unit.h.r(f29081a), androidx.compose.ui.unit.h.r(f29081a), f29081a, f29081a, 0L, 0, false, 224, null)).f();
    }

    private static final androidx.compose.ui.graphics.vector.d b(String str, boolean z10, Function1<? super androidx.compose.ui.graphics.vector.d.a, androidx.compose.ui.graphics.vector.d.a> function1) {
        return function1.invoke(new androidx.compose.ui.graphics.vector.d.a(str, androidx.compose.ui.unit.h.r(f29081a), androidx.compose.ui.unit.h.r(f29081a), f29081a, f29081a, 0L, 0, z10, 96, null)).f();
    }

    static /* synthetic */ androidx.compose.ui.graphics.vector.d c(String str, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return ((androidx.compose.ui.graphics.vector.d.a) function1.invoke(new androidx.compose.ui.graphics.vector.d.a(str, androidx.compose.ui.unit.h.r(f29081a), androidx.compose.ui.unit.h.r(f29081a), f29081a, f29081a, 0L, 0, z10, 96, null))).f();
    }

    private static final androidx.compose.ui.graphics.vector.d.a d(androidx.compose.ui.graphics.vector.d.a aVar, float f10, float f11, int i10, Function1<? super androidx.compose.ui.graphics.vector.f, Unit> function1) {
        androidx.compose.ui.graphics.s3 s3Var = new androidx.compose.ui.graphics.s3(androidx.compose.ui.graphics.q0.f38131b.a(), null);
        int iA = androidx.compose.ui.graphics.u3.f38256b.a();
        int iA2 = androidx.compose.ui.graphics.v3.f38275b.a();
        androidx.compose.ui.graphics.vector.f fVar = new androidx.compose.ui.graphics.vector.f();
        function1.invoke(fVar);
        return androidx.compose.ui.graphics.vector.d.a.d(aVar, fVar.f(), i10, "", s3Var, f10, null, f11, 1.0f, iA, iA2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    static /* synthetic */ androidx.compose.ui.graphics.vector.d.a e(androidx.compose.ui.graphics.vector.d.a aVar, float f10, float f11, int i10, Function1 function1, int i11, Object obj) {
        float f12 = (i11 & 1) != 0 ? 1.0f : f10;
        float f13 = (i11 & 2) != 0 ? 1.0f : f11;
        int iC = (i11 & 4) != 0 ? androidx.compose.ui.graphics.vector.s.c() : i10;
        androidx.compose.ui.graphics.s3 s3Var = new androidx.compose.ui.graphics.s3(androidx.compose.ui.graphics.q0.f38131b.a(), null);
        int iA = androidx.compose.ui.graphics.u3.f38256b.a();
        int iA2 = androidx.compose.ui.graphics.v3.f38275b.a();
        androidx.compose.ui.graphics.vector.f fVar = new androidx.compose.ui.graphics.vector.f();
        function1.invoke(fVar);
        return androidx.compose.ui.graphics.vector.d.a.d(aVar, fVar.f(), iC, "", s3Var, f12, null, f13, 1.0f, iA, iA2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
