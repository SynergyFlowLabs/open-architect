package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ClassVerificationFailure"})
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n39#1:64\n1#2:63\n1#2:65\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n48#1:64\n48#1:65\n*E\n"})
public final class n {
    @NotNull
    public static final Path a(@NotNull Path path, @NotNull Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @w0(26)
    @NotNull
    public static final Iterable<p> b(@NotNull Path path, float f10) {
        return q.b(path, f10);
    }

    public static /* synthetic */ Iterable c(Path path, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.5f;
        }
        return b(path, f10);
    }

    @NotNull
    public static final Path d(@NotNull Path path, @NotNull Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @NotNull
    public static final Path e(@NotNull Path path, @NotNull Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @NotNull
    public static final Path f(@NotNull Path path, @NotNull Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @NotNull
    public static final Path g(@NotNull Path path, @NotNull Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
