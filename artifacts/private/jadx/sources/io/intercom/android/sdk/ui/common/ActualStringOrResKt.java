package io.intercom.android.sdk.ui.common;

import android.content.Context;
import androidx.annotation.f1;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nActualStringOrRes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualStringOrRes.kt\nio/intercom/android/sdk/ui/common/ActualStringOrResKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1863#2,2:42\n*S KotlinDebug\n*F\n+ 1 ActualStringOrRes.kt\nio/intercom/android/sdk/ui/common/ActualStringOrResKt\n*L\n36#1:42,2\n*E\n"})
public final class ActualStringOrResKt {
    @NotNull
    public static final String parseString(@NotNull Context context, @f1 int i10, @NotNull List<Pair<String, String>> params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Iterator<T> it = params.iterator();
        String strK2 = string;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            strK2 = StringsKt.k2(strK2, AbstractJsonLexerKt.BEGIN_OBJ + ((String) pair.getFirst()) + AbstractJsonLexerKt.END_OBJ, (String) pair.getSecond(), false, 4, null);
        }
        return strK2;
    }

    public static /* synthetic */ String parseString$default(Context context, int i10, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return parseString(context, i10, list);
    }
}
