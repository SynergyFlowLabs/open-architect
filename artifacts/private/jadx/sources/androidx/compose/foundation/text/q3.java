package androidx.compose.foundation.text;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInlineTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,86:1\n97#2,4:87\n*S KotlinDebug\n*F\n+ 1 InlineTextContent.kt\nandroidx/compose/foundation/text/InlineTextContentKt\n*L\n52#1:87,4\n*E\n"})
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f20777a = "androidx.compose.foundation.text.inlineContent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f20778b = "�";

    public static final void a(@NotNull androidx.compose.ui.text.f.b bVar, @NotNull String str, @NotNull String str2) {
        if (!(str2.length() > 0)) {
            androidx.compose.foundation.internal.e.g("alternateText can't be an empty string.");
        }
        bVar.x(f20777a, str);
        bVar.p(str2);
        bVar.t();
    }

    public static /* synthetic */ void b(androidx.compose.ui.text.f.b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = f20778b;
        }
        a(bVar, str, str2);
    }
}
