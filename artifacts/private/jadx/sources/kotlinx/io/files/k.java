package kotlinx.io.files;

import java.util.Arrays;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n;
import kotlin.text.StringsKt;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPaths.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paths.kt\nkotlinx/io/files/PathsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,177:1\n13346#2,2:178\n*S KotlinDebug\n*F\n+ 1 Paths.kt\nkotlinx/io/files/PathsKt\n*L\n84#1:178,2\n*E\n"})
public final class k {
    @NotNull
    public static final i a(@NotNull String base, @NotNull String... parts) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(parts, "parts");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(base);
        for (String str : parts) {
            if (sb2.length() > 0) {
                char c10 = j.f315768a;
                if (!StringsKt.a3(sb2, c10, false, 2, null)) {
                    sb2.append(c10);
                }
            }
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return j.a(string);
    }

    @NotNull
    public static final i b(@NotNull i base, @NotNull String... parts) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(parts, "parts");
        return a(base.toString(), (String[]) Arrays.copyOf(parts, parts.length));
    }

    private static final boolean c(String str) {
        if (str.length() < 2) {
            return false;
        }
        return StringsKt.u2(str, "\\\\", false, 2, null) || StringsKt.u2(str, "//", false, 2, null);
    }

    @NotNull
    public static final String d(@NotNull String path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!z10) {
            return f(path);
        }
        int i10 = 1;
        if (path.length() > 1) {
            if (path.charAt(1) == ':') {
                i10 = 3;
            } else if (c(path)) {
                i10 = 2;
            }
        }
        return g(i10, path);
    }

    public static /* synthetic */ String e(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = e.d();
        }
        return d(str, z10);
    }

    private static final String f(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        String strSubstring = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final String g(int i10, String str) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = str.length();
        while (length > i10) {
            char cCharAt = str.charAt(length - 1);
            if (cCharAt != '\\' && cCharAt != '/') {
                break;
            }
            length--;
        }
        String strSubstring = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @kotlin.l(level = n.WARNING, message = "Use FileSystem.sink instead", replaceWith = @b1(expression = "SystemFileSystem.sink(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    @oj.i(name = "sinkDeprecated")
    @NotNull
    public static final x h(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return kotlinx.io.g.a(c.f(e.f315762b, iVar, false, 2, null));
    }

    @kotlin.l(level = n.WARNING, message = "Use FileSystem.source instead", replaceWith = @b1(expression = "SystemFileSystem.source(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    @oj.i(name = "sourceDeprecated")
    @NotNull
    public static final c0 i(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return kotlinx.io.g.b(e.f315762b.h(iVar));
    }
}
