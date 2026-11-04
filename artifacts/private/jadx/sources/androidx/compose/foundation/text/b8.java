package androidx.compose.foundation.text;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nValidatingOffsetMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,135:1\n51#2,4:136\n51#2,4:140\n*S KotlinDebug\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n*L\n117#1:136,4\n129#1:140,4\n*E\n"})
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.text.input.m0 f18792a = new a8(androidx.compose.ui.text.input.m0.f41903a.a(), 0, 0);

    @NotNull
    public static final androidx.compose.ui.text.input.h1 c(@NotNull androidx.compose.ui.text.input.j1 j1Var, @NotNull androidx.compose.ui.text.f fVar) {
        androidx.compose.ui.text.input.h1 h1VarA = j1Var.a(fVar);
        f(h1VarA, fVar.length(), 0, 2, null);
        return new androidx.compose.ui.text.input.h1(h1VarA.b(), new a8(h1VarA.a(), fVar.length(), h1VarA.b().length()));
    }

    @NotNull
    public static final androidx.compose.ui.text.input.m0 d() {
        return f18792a;
    }

    @androidx.annotation.l1
    public static final void e(@NotNull androidx.compose.ui.text.input.h1 h1Var, int i10, int i11) {
        int length = h1Var.b().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            g(h1Var.a().b(i12), length, i12);
        }
        g(h1Var.a().b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            h(h1Var.a().a(i13), i10, i13);
        }
        h(h1Var.a().a(length), i10, length);
    }

    public static /* synthetic */ void f(androidx.compose.ui.text.input.h1 h1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(h1Var, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.i("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + AbstractJsonLexerKt.END_LIST);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.i("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + AbstractJsonLexerKt.END_LIST);
        }
    }
}
