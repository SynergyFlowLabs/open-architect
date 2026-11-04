package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,705:1\n73#2,4:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n654#1:706,4\n*E\n"})
public final class e {
    @NotNull
    public static final d.a d(@NotNull d.a aVar, @NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends h> list, @NotNull Function1<? super d.a, Unit> function1) {
        aVar.a(str, f10, f11, f12, f13, f14, f15, f16, list);
        function1.invoke(aVar);
        aVar.g();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d.a e(d.a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        aVar.a(str2, f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? s.h() : list);
        function1.invoke(aVar);
        aVar.g();
        return aVar;
    }

    @NotNull
    public static final d.a f(@NotNull d.a aVar, @NotNull String str, @Nullable i0 i0Var, float f10, @Nullable i0 i0Var2, float f11, float f12, int i10, int i11, float f13, int i12, @NotNull Function1<? super f, Unit> function1) {
        f fVar = new f();
        function1.invoke(fVar);
        return d.a.d(aVar, fVar.f(), i12, str, i0Var, f10, i0Var2, f11, f12, i10, i11, f13, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    public static /* synthetic */ d.a g(d.a aVar, String str, i0 i0Var, float f10, i0 i0Var2, float f11, float f12, int i10, int i11, float f13, int i12, Function1 function1, int i13, Object obj) {
        String str2 = (i13 & 1) != 0 ? "" : str;
        i0 i0Var3 = (i13 & 2) != 0 ? null : i0Var;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        i0 i0Var4 = (i13 & 8) != 0 ? null : i0Var2;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int iD = (i13 & 64) != 0 ? s.d() : i10;
        int iE = (i13 & 128) != 0 ? s.e() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int iC = (i13 & 512) != 0 ? s.c() : i12;
        f fVar = new f();
        function1.invoke(fVar);
        return d.a.d(aVar, fVar.f(), iC, str2, i0Var3, f14, i0Var4, f15, f16, iD, iE, f17, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T h(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T i(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean j(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
