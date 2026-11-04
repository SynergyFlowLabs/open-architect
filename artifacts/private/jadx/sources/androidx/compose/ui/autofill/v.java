package androidx.compose.ui.autofill;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContentType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentType.android.kt\nandroidx/compose/ui/autofill/ContentType_androidKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,125:1\n37#2,2:126\n*S KotlinDebug\n*F\n+ 1 ContentType.android.kt\nandroidx/compose/ui/autofill/ContentType_androidKt\n*L\n124#1:126,2\n*E\n"})
public final class v {
    @NotNull
    public static final u a(@NotNull String str) {
        return new g(SetsKt.setOf(str));
    }

    @NotNull
    public static final String[] b(@NotNull u uVar) {
        Intrinsics.checkNotNull(uVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((g) uVar).b().toArray(new String[0]);
    }
}
