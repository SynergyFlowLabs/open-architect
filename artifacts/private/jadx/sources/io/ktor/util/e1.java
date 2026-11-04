package io.ktor.util;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nio/ktor/util/PathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,102:1\n1#2:103\n413#3,4:104\n*S KotlinDebug\n*F\n+ 1 Path.kt\nio/ktor/util/PathKt\n*L\n46#1:104,4\n*E\n"})
public final class e1 {
    private static final File a(File file, File file2) {
        File fileG = g(file2);
        if (kotlin.io.l.p0(fileG, "..")) {
            throw new IllegalArgumentException("Bad relative path " + file2);
        }
        if (!fileG.isAbsolute()) {
            return new File(file, fileG.getPath());
        }
        throw new IllegalStateException(("Bad relative path " + file2).toString());
    }

    @NotNull
    public static final File b(@NotNull File file, @NotNull String relativePath) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        return a(file, new File(relativePath));
    }

    public static final int c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int length = path.length() - 1;
        int i10 = 0;
        while (i10 <= length) {
            char cCharAt = path.charAt(i10);
            if (!e(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                if (i10 == length) {
                    return i10 + 1;
                }
                char cCharAt2 = path.charAt(i10 + 1);
                int i11 = 2;
                if (!e(cCharAt2)) {
                    if (cCharAt2 == '.') {
                        int i12 = i10 + 2;
                        if (i12 != path.length()) {
                            if (!e(path.charAt(i12))) {
                                break;
                            }
                            i11 = 3;
                        }
                    } else {
                        break;
                    }
                }
                i10 += i11;
            } else {
                i10++;
            }
        }
        return i10;
    }

    private static final File d(File file) {
        String path = file.getPath();
        if (path == null) {
            path = "";
        }
        int iC = c(path);
        if (iC == 0) {
            return file;
        }
        if (iC >= file.getPath().length()) {
            return new File(".");
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        String strSubstring = path2.substring(iC);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new File(strSubstring);
    }

    private static final boolean e(char c10) {
        return c10 == '\\' || c10 == '/';
    }

    private static final boolean f(char c10) {
        return c10 == '.' || e(c10);
    }

    @NotNull
    public static final File g(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return d(h(kotlin.io.l.e0(file)));
    }

    private static final File h(File file) {
        String strSubstring;
        if (!kotlin.io.l.d(file)) {
            return file;
        }
        File file2 = file;
        while (true) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                break;
            }
            file2 = parentFile;
        }
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String strA6 = StringsKt.A6(path, file2.getName().length());
        int length = strA6.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strA6.charAt(i10);
            if (cCharAt != '\\' && cCharAt != '/') {
                strSubstring = strA6.substring(i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return new File(strSubstring);
            }
        }
        strSubstring = "";
        return new File(strSubstring);
    }
}
