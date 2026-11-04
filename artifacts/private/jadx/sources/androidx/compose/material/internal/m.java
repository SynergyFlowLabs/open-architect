package androidx.compose.material.internal;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f23215a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23216b = 0;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n+ 2 Icons.kt\nandroidx/compose/material/internal/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n64#2:88\n57#2,3:89\n60#2,3:93\n67#2,15:96\n84#2:130\n65#2:131\n123#3:92\n640#4,2:111\n653#4,2:113\n655#4,11:119\n73#5,4:115\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n*L\n38#1:88\n38#1:89,3\n38#1:93,3\n39#1:96,15\n39#1:130\n38#1:131\n38#1:92\n39#1:111,2\n39#1:113,2\n39#1:119,11\n39#1:115,4\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private static androidx.compose.ui.graphics.vector.d f23218b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f23217a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f23219c = 8;

        private a() {
        }

        @NotNull
        public final androidx.compose.ui.graphics.vector.d a() {
            androidx.compose.ui.graphics.vector.d dVar = f23218b;
            if (dVar != null) {
                Intrinsics.checkNotNull(dVar);
                return dVar;
            }
            androidx.compose.ui.graphics.vector.d.a aVar = new androidx.compose.ui.graphics.vector.d.a("Filled.ArrowDropDown", androidx.compose.ui.unit.h.r(24.0f), androidx.compose.ui.unit.h.r(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int iC = androidx.compose.ui.graphics.vector.s.c();
            s3 s3Var = new s3(q0.f38131b.a(), null);
            int iA = u3.f38256b.a();
            int iA2 = v3.f38275b.a();
            androidx.compose.ui.graphics.vector.f fVar = new androidx.compose.ui.graphics.vector.f();
            fVar.k(7.0f, 10.0f);
            fVar.j(5.0f, 5.0f);
            fVar.j(5.0f, -5.0f);
            fVar.c();
            androidx.compose.ui.graphics.vector.d dVarF = androidx.compose.ui.graphics.vector.d.a.d(aVar, fVar.f(), iC, "", s3Var, 1.0f, null, 1.0f, 1.0f, iA, iA2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).f();
            f23218b = dVarF;
            Intrinsics.checkNotNull(dVarF);
            return dVarF;
        }
    }

    private m() {
    }
}
