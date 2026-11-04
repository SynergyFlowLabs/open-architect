package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f312570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<File> f312571b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull File root, @NotNull List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f312570a = root;
        this.f312571b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i d(i iVar, File file, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = iVar.f312570a;
        }
        if ((i10 & 2) != 0) {
            list = iVar.f312571b;
        }
        return iVar.c(file, list);
    }

    @NotNull
    public final File a() {
        return this.f312570a;
    }

    @NotNull
    public final List<File> b() {
        return this.f312571b;
    }

    @NotNull
    public final i c(@NotNull File root, @NotNull List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new i(root, segments);
    }

    @NotNull
    public final File e() {
        return this.f312570a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f312570a, iVar.f312570a) && Intrinsics.areEqual(this.f312571b, iVar.f312571b);
    }

    @NotNull
    public final String f() {
        String path = this.f312570a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @NotNull
    public final List<File> g() {
        return this.f312571b;
    }

    public final int h() {
        return this.f312571b.size();
    }

    public int hashCode() {
        return (this.f312570a.hashCode() * 31) + this.f312571b.hashCode();
    }

    public final boolean i() {
        String path = this.f312570a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path.length() > 0;
    }

    @NotNull
    public final File j(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f312571b.subList(i10, i11);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return new File(CollectionsKt.joinToString$default(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.f312570a + ", segments=" + this.f312571b + ')';
    }
}
