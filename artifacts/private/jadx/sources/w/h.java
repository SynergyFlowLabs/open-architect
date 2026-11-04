package w;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.b2;
import androidx.compose.ui.platform.k1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class h {
    @b2
    @Nullable
    public static final g a(@NotNull g gVar, @NotNull Function1<? super ClipData.Item, Boolean> function1) {
        ClipData clipDataA = gVar.a().a();
        if (clipDataA.getItemCount() != 1) {
            int itemCount = clipDataA.getItemCount();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < itemCount; i10++) {
                ClipData.Item itemAt = clipDataA.getItemAt(i10);
                if (!function1.invoke(itemAt).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipDataA.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(gVar.b().a());
                ClipData clipData = new ClipData(clipDescription, (ClipData.Item) CollectionsKt.first((List) arrayList));
                int size = arrayList.size();
                for (int i11 = 1; i11 < size; i11++) {
                    clipData.addItem((ClipData.Item) arrayList.get(i11));
                }
                return new g(androidx.compose.ui.platform.g.c(clipData), androidx.compose.ui.platform.g.d(clipDescription), gVar.d(), gVar.c(), null);
            }
        } else if (function1.invoke(clipDataA.getItemAt(0)).booleanValue()) {
            return null;
        }
        return gVar;
    }

    @b2
    public static final boolean b(@NotNull g gVar, @NotNull a aVar) {
        return gVar.b().a().hasMimeType(aVar.f());
    }

    @Nullable
    public static final String c(@NotNull k1 k1Var) {
        int itemCount = k1Var.a().getItemCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < itemCount; i10++) {
            z10 = z10 || k1Var.a().getItemAt(i10).getText() != null;
        }
        if (!z10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int itemCount2 = k1Var.a().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = k1Var.a().getItemAt(i11).getText();
            if (text != null) {
                if (z11) {
                    sb2.append("\n");
                }
                sb2.append(text);
                z11 = true;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
