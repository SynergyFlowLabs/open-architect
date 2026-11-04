package androidx.compose.foundation.text;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,356:1\n26#2:357\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n310#1:357\n*E\n"})
public final class j5 {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    @NotNull
    public static final i5 b(@NotNull i5 i5Var, @NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.text.y3 y3Var, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, boolean z10, int i10, int i11, int i12, @NotNull List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> list) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> list2;
        if (Intrinsics.areEqual(i5Var.n(), fVar) && Intrinsics.areEqual(i5Var.m(), y3Var)) {
            z11 = z10;
            if (i5Var.l() == z11) {
                i13 = i10;
                if (androidx.compose.ui.text.style.v.i(i5Var.i(), i13)) {
                    i14 = i11;
                    if (i5Var.e() == i14) {
                        i15 = i12;
                        if (i5Var.g() == i15 && Intrinsics.areEqual(i5Var.a(), dVar)) {
                            list2 = list;
                            if (Intrinsics.areEqual(i5Var.k(), list2)) {
                                bVar = bVar;
                                if (i5Var.b() == bVar) {
                                    return i5Var;
                                }
                            } else {
                                bVar = bVar;
                            }
                        } else {
                            bVar = bVar;
                            list2 = list;
                        }
                    } else {
                        bVar = bVar;
                        i15 = i12;
                        list2 = list;
                    }
                } else {
                    bVar = bVar;
                    i14 = i11;
                    i15 = i12;
                    list2 = list;
                }
            }
            return new i5(fVar, y3Var, i14, i15, z11, i13, dVar, bVar, list2, null);
        }
        z11 = z10;
        i13 = i10;
        i14 = i11;
        i15 = i12;
        list2 = list;
        return new i5(fVar, y3Var, i14, i15, z11, i13, dVar, bVar, list2, null);
    }

    public static /* synthetic */ i5 c(i5 i5Var, androidx.compose.ui.text.f fVar, androidx.compose.ui.text.y3 y3Var, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            i10 = androidx.compose.ui.text.style.v.f42256b.a();
        }
        if ((i13 & 128) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 256) != 0) {
            i12 = 1;
        }
        return b(i5Var, fVar, y3Var, dVar, bVar, z10, i10, i11, i12, list);
    }
}
