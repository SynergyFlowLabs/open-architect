package androidx.media3.datasource.cache;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class u extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f62457g = ".exo";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62458h = ".v3.exo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f62459i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f62460j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f62461k = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private u(String str, long j10, long j11, long j12, @p0 File file) {
        super(str, j10, j11, j12, file);
    }

    @p0
    public static u o(File file, long j10, long j11, l lVar) {
        String strJ;
        String name = file.getName();
        if (!name.endsWith(f62458h)) {
            file = t(file, lVar);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f62461k.matcher(name);
        if (!matcher.matches() || (strJ = lVar.j(Integer.parseInt((String) androidx.media3.common.util.a.g(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file2.length();
        }
        long j12 = j10;
        if (j12 == 0) {
            return null;
        }
        return new u(strJ, Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(2))), j12, j11 == -9223372036854775807L ? Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(3))) : j11, file2);
    }

    @p0
    public static u p(File file, long j10, l lVar) {
        return o(file, j10, -9223372036854775807L, lVar);
    }

    public static u q(String str, long j10, long j11) {
        return new u(str, j10, j11, -9223372036854775807L, null);
    }

    public static u r(String str, long j10) {
        return new u(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File s(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + f62458h);
    }

    @p0
    private static File t(File file, l lVar) {
        String strZ2;
        String name = file.getName();
        Matcher matcher = f62460j.matcher(name);
        if (matcher.matches()) {
            strZ2 = k1.z2((String) androidx.media3.common.util.a.g(matcher.group(1)));
        } else {
            matcher = f62459i.matcher(name);
            strZ2 = matcher.matches() ? (String) androidx.media3.common.util.a.g(matcher.group(1)) : null;
        }
        if (strZ2 == null) {
            return null;
        }
        File fileS = s((File) androidx.media3.common.util.a.k(file.getParentFile()), lVar.e(strZ2), Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(2))), Long.parseLong((String) androidx.media3.common.util.a.g(matcher.group(3))));
        if (file.renameTo(fileS)) {
            return fileS;
        }
        return null;
    }

    public u n(File file, long j10) {
        androidx.media3.common.util.a.i(this.f62373d);
        return new u(this.f62370a, this.f62371b, this.f62372c, j10, file);
    }
}
