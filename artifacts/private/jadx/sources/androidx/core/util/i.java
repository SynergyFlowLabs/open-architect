package androidx.core.util;

import androidx.annotation.b1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class i {
    private i() {
    }

    public static void a(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
