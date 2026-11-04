package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Path f312630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f312631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final k f312632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Iterator<k> f312633d;

    public k(@NotNull Path path, @Nullable Object obj, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f312630a = path;
        this.f312631b = obj;
        this.f312632c = kVar;
    }

    @Nullable
    public final Iterator<k> a() {
        return this.f312633d;
    }

    @Nullable
    public final Object b() {
        return this.f312631b;
    }

    @Nullable
    public final k c() {
        return this.f312632c;
    }

    @NotNull
    public final Path d() {
        return this.f312630a;
    }

    public final void e(@Nullable Iterator<k> it) {
        this.f312633d = it;
    }
}
