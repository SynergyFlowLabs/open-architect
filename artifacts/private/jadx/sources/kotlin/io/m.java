package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
public class m {
    @NotNull
    public static final File a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(c(file));
    }

    private static final int b(String str) {
        int iQ3;
        char c10 = File.separatorChar;
        int iQ4 = StringsKt.q3(str, c10, 0, false, 4, null);
        if (iQ4 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iQ3 = StringsKt.q3(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iQ5 = StringsKt.q3(str, c10, iQ3 + 1, false, 4, null);
            return iQ5 >= 0 ? iQ5 + 1 : str.length();
        }
        if (iQ4 > 0 && str.charAt(iQ4 - 1) == ':') {
            return iQ4 + 1;
        }
        if (iQ4 == -1 && StringsKt.a3(str, AbstractJsonLexerKt.COLON, false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    @NotNull
    public static final String c(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        String strSubstring = path.substring(0, b(path2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean d(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return b(path) > 0;
    }

    @NotNull
    public static final File e(@NotNull File file, int i10, int i11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return f(file).j(i10, i11);
    }

    @NotNull
    public static final i f(@NotNull File file) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNull(path);
        int iB = b(path);
        String strSubstring = path.substring(0, iB);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iB);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List listT4 = StringsKt.T4(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT4, 10));
            Iterator it = listT4.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listEmptyList = arrayList;
        }
        return new i(new File(strSubstring), listEmptyList);
    }
}
