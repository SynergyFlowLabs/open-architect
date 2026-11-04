package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.b1;
import androidx.compose.ui.text.a4;
import androidx.compose.ui.text.b4;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.z0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n35#2,5:199\n35#2,5:204\n35#2,5:209\n35#2,5:214\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:199,5\n66#1:204,5\n76#1:209,5\n85#1:214,5\n*E\n"})
public final class a {
    private static final void a(SpannableString spannableString, c3 c3Var, int i10, int i11, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar) {
        z0.d.n(spannableString, c3Var.m(), i10, i11);
        z0.d.s(spannableString, c3Var.q(), dVar, i10, i11);
        if (c3Var.t() != null || c3Var.r() != null) {
            v0 v0VarT = c3Var.t();
            if (v0VarT == null) {
                v0VarT = v0.f41742b.m();
            }
            q0 q0VarR = c3Var.r();
            spannableString.setSpan(new StyleSpan(androidx.compose.ui.text.font.j.c(v0VarT, q0VarR != null ? q0VarR.j() : q0.f41690b.c())), i10, i11, 33);
        }
        if (c3Var.o() != null) {
            if (c3Var.o() instanceof z0) {
                spannableString.setSpan(new TypefaceSpan(((z0) c3Var.o()).s()), i10, i11, 33);
            } else {
                androidx.compose.ui.text.font.y yVarO = c3Var.o();
                r0 r0VarS = c3Var.s();
                Object value = androidx.compose.ui.text.font.y.b.c(bVar, yVarO, null, 0, r0VarS != null ? r0VarS.m() : r0.f41699b.a(), 6, null).getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(t.f42110a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (c3Var.y() != null) {
            androidx.compose.ui.text.style.k kVarY = c3Var.y();
            androidx.compose.ui.text.style.k.a aVar = androidx.compose.ui.text.style.k.f42215b;
            if (kVarY.d(aVar.f())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (c3Var.y().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (c3Var.A() != null) {
            spannableString.setSpan(new ScaleXSpan(c3Var.A().d()), i10, i11, 33);
        }
        z0.d.w(spannableString, c3Var.v(), i10, i11);
        z0.d.j(spannableString, c3Var.j(), i10, i11);
    }

    @androidx.compose.ui.text.x
    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public static final SpannableString b(@NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull e0 e0Var) {
        SpannableString spannableString = new SpannableString(fVar.m());
        List<androidx.compose.ui.text.f.e<c3>> listJ = fVar.j();
        if (listJ != null) {
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.text.f.e<c3> eVar = listJ.get(i10);
                a(spannableString, c3.d(eVar.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), eVar.b(), eVar.c(), dVar, bVar);
            }
        }
        List<androidx.compose.ui.text.f.e<a4>> listN = fVar.n(0, fVar.length());
        int size2 = listN.size();
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.text.f.e<a4> eVar2 = listN.get(i11);
            spannableString.setSpan(z0.f.a(eVar2.a()), eVar2.b(), eVar2.c(), 33);
        }
        List<androidx.compose.ui.text.f.e<b4>> listO = fVar.o(0, fVar.length());
        int size3 = listO.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.text.f.e<b4> eVar3 = listO.get(i12);
            spannableString.setSpan(e0Var.c(eVar3.a()), eVar3.b(), eVar3.c(), 33);
        }
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0>> listF = fVar.f(0, fVar.length());
        int size4 = listF.size();
        for (int i13 = 0; i13 < size4; i13++) {
            androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar4 = listF.get(i13);
            if (eVar4.i() != eVar4.g()) {
                androidx.compose.ui.text.b0 b0VarH = eVar4.h();
                if ((b0VarH instanceof androidx.compose.ui.text.b0.b) && ((androidx.compose.ui.text.b0.b) b0VarH).a() == null) {
                    spannableString.setSpan(e0Var.b(c(eVar4)), eVar4.i(), eVar4.g(), 33);
                } else {
                    spannableString.setSpan(e0Var.a(eVar4), eVar4.i(), eVar4.g(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0.b> c(androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        androidx.compose.ui.text.b0 b0VarH = eVar.h();
        Intrinsics.checkNotNull(b0VarH, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new androidx.compose.ui.text.f.e<>((androidx.compose.ui.text.b0.b) b0VarH, eVar.i(), eVar.g());
    }
}
