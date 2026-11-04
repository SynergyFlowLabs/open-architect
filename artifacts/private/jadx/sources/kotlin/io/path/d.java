package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Exception> f312610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Path f312611d;

    public d() {
        this(0, 1, null);
    }

    public final void a(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f312609b++;
        if (this.f312610c.size() < this.f312608a) {
            if (this.f312611d != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f312611d)).initCause(exception);
                Intrinsics.checkNotNull(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = (FileSystemException) thInitCause;
            }
            this.f312610c.add(exception);
        }
    }

    public final void b(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.f312611d;
        this.f312611d = path != null ? path.resolve(name) : null;
    }

    public final void c(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.f312611d;
        if (!Intrinsics.areEqual(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.f312611d;
        this.f312611d = path2 != null ? path2.getParent() : null;
    }

    @NotNull
    public final List<Exception> d() {
        return this.f312610c;
    }

    @Nullable
    public final Path e() {
        return this.f312611d;
    }

    public final int f() {
        return this.f312609b;
    }

    public final void g(@Nullable Path path) {
        this.f312611d = path;
    }

    public d(int i10) {
        this.f312608a = i10;
        this.f312610c = new ArrayList();
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
