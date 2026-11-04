package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,157:1\n251#2,2:158\n35#2,3:160\n39#2:167\n253#2:168\n118#3,4:163\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n145#1:158,2\n145#1:160,3\n145#1:167\n145#1:168\n146#1:163,4\n*E\n"})
public final class j0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<f.e<v0>> b(List<f.e<v0>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            f.e<v0> eVar = list.get(i12);
            if (l.z(i10, i11, eVar.i(), eVar.g())) {
                if (!(i10 <= eVar.i() && eVar.g() <= i11)) {
                    x0.a.e("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new f.e(eVar.h(), eVar.i() - i10, eVar.g() - i10));
            }
        }
        return arrayList;
    }
}
