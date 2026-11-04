package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.a1;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.y3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidParagraphHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,145:1\n252#2:146\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n*L\n79#1:146\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f42075a = new a();

    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @NotNull
    public static final CharSequence a(@NotNull String str, float f10, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull List<androidx.compose.ui.text.f.e<v0>> list2, @NotNull androidx.compose.ui.unit.d dVar, @NotNull pj.o<? super androidx.compose.ui.text.font.y, ? super androidx.compose.ui.text.font.v0, ? super q0, ? super r0, ? extends Typeface> oVar, boolean z10) {
        String str2;
        CharSequence charSequenceA;
        float f11;
        androidx.compose.ui.unit.d dVar2;
        x0 x0VarA;
        if (z10 && androidx.emoji2.text.f.q()) {
            a1 a1VarM = y3Var.M();
            androidx.compose.ui.text.u uVarD = (a1VarM == null || (x0VarA = a1VarM.a()) == null) ? null : androidx.compose.ui.text.u.d(x0VarA.b());
            str2 = str;
            charSequenceA = androidx.emoji2.text.f.c().A(str2, 0, str.length(), Integer.MAX_VALUE, uVarD == null ? 0 : androidx.compose.ui.text.u.g(uVarD.j(), androidx.compose.ui.text.u.f42278b.a()));
            Intrinsics.checkNotNull(charSequenceA);
        } else {
            str2 = str;
            charSequenceA = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.areEqual(y3Var.X(), androidx.compose.ui.text.style.s.f42240c.a()) && androidx.compose.ui.unit.z.l(y3Var.I()) == 0) {
            return charSequenceA;
        }
        Spannable spannableString = charSequenceA instanceof Spannable ? (Spannable) charSequenceA : new SpannableString(charSequenceA);
        if (Intrinsics.areEqual(y3Var.S(), androidx.compose.ui.text.style.k.f42215b.f())) {
            z0.d.y(spannableString, f42075a, 0, str2.length());
        }
        if (b(y3Var) && y3Var.J() == null) {
            z0.d.v(spannableString, y3Var.I(), f10, dVar);
            f11 = f10;
            dVar2 = dVar;
        } else {
            androidx.compose.ui.text.style.h hVarJ = y3Var.J();
            if (hVarJ == null) {
                hVarJ = androidx.compose.ui.text.style.h.f42178d.a();
            }
            f11 = f10;
            dVar2 = dVar;
            z0.d.u(spannableString, y3Var.I(), f11, dVar2, hVarJ);
        }
        z0.d.C(spannableString, y3Var.X(), f11, dVar2);
        z0.d.A(spannableString, y3Var, list, dVar2, oVar);
        z0.d.m(spannableString, list, f11, dVar2, y3Var.X());
        z0.b.f(spannableString, list2, dVar2);
        return spannableString;
    }

    public static final boolean b(@NotNull y3 y3Var) {
        x0 x0VarA;
        a1 a1VarM = y3Var.M();
        if (a1VarM == null || (x0VarA = a1VarM.a()) == null) {
            return false;
        }
        return x0VarA.c();
    }
}
