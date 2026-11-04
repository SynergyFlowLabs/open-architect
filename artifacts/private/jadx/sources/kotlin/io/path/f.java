package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e
public final class f implements FileVisitorBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f312612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f312613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function2<? super Path, ? super IOException, ? extends FileVisitResult> f312614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function2<? super Path, ? super IOException, ? extends FileVisitResult> f312615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f312616e;

    private final void f() {
        if (this.f312616e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void a(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        f();
        g(this.f312615d, "onPostVisitDirectory");
        this.f312615d = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void b(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        f();
        g(this.f312613b, "onVisitFile");
        this.f312613b = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void c(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        f();
        g(this.f312612a, "onPreVisitDirectory");
        this.f312612a = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void d(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        f();
        g(this.f312614c, "onVisitFileFailed");
        this.f312614c = function;
    }

    @NotNull
    public final FileVisitor<Path> e() {
        f();
        this.f312616e = true;
        return new g(this.f312612a, this.f312613b, this.f312614c, this.f312615d);
    }
}
