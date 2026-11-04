package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f312621a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkOption[] f312622b = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final LinkOption[] f312623c = new LinkOption[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Set<FileVisitOption> f312624d = SetsKt.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Set<FileVisitOption> f312625e = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private i() {
    }

    @NotNull
    public final LinkOption[] a(boolean z10) {
        return z10 ? f312623c : f312622b;
    }

    @NotNull
    public final Set<FileVisitOption> b(boolean z10) {
        return z10 ? f312625e : f312624d;
    }
}
