package okio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,22:166\n52#2,22:188\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,22\n81#1:188,22\n*E\n"})
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f335115a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v f335116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final r0 f335117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v f335118d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @oj.i(name = "get")
        @NotNull
        public final v a(@NotNull FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new j0(fileSystem);
        }

        private a() {
        }
    }

    static {
        v h0Var;
        try {
            Class.forName("java.nio.file.Files");
            h0Var = new k0();
        } catch (ClassNotFoundException unused) {
            h0Var = new h0();
        }
        f335116b = h0Var;
        r0.a aVar = r0.f335070b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f335117c = r0.a.h(aVar, property, false, 1, null);
        ClassLoader classLoader = okio.internal.k.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f335118d = new okio.internal.k(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sequence C(v vVar, r0 r0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return vVar.B(r0Var, z10);
    }

    public static /* synthetic */ t I(v vVar, r0 r0Var, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return vVar.H(r0Var, z10, z11);
    }

    public static /* synthetic */ z0 L(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
            int i11 = 3 | 0;
        }
        return vVar.K(r0Var, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static /* synthetic */ Object c(v vVar, r0 file, boolean z10, Function1 writerAction, int i10, Object obj) throws IOException {
        ?? r10;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        m mVarD = l0.d(vVar.K(file, z10));
        Object th2 = null;
        try {
            Object objInvoke = writerAction.invoke(mVarD);
            kotlin.jvm.internal.h0.d(1);
            if (mVarD != null) {
                try {
                    mVarD.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th2;
            th2 = objInvoke;
        } catch (Throwable th4) {
            kotlin.jvm.internal.h0.d(1);
            if (mVarD != null) {
                try {
                    mVarD.close();
                } catch (Throwable th5) {
                    kotlin.p.a(th4, th5);
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th4;
        }
        if (r10 == 0) {
            return th2;
        }
        throw r10;
    }

    public static /* synthetic */ z0 f(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return vVar.e(r0Var, z10);
    }

    public static /* synthetic */ void l(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vVar.k(r0Var, z10);
    }

    public static /* synthetic */ void o(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vVar.n(r0Var, z10);
    }

    public static /* synthetic */ void s(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vVar.r(r0Var, z10);
    }

    public static /* synthetic */ void v(v vVar, r0 r0Var, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vVar.u(r0Var, z10);
    }

    @oj.n
    @oj.i(name = "get")
    @NotNull
    public static final v x(@NotNull FileSystem fileSystem) {
        return f335115a.a(fileSystem);
    }

    @NotNull
    public final Sequence<r0> A(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return B(dir, false);
    }

    @NotNull
    public Sequence<r0> B(@NotNull r0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return okio.internal.d.f(this, dir, z10);
    }

    @NotNull
    public final u D(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.d.g(this, path);
    }

    @Nullable
    public abstract u E(@NotNull r0 r0Var) throws IOException;

    @NotNull
    public abstract t F(@NotNull r0 r0Var) throws IOException;

    @NotNull
    public final t G(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return H(file, false, false);
    }

    @NotNull
    public abstract t H(@NotNull r0 r0Var, boolean z10, boolean z11) throws IOException;

    @NotNull
    public final z0 J(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return K(file, false);
    }

    @NotNull
    public abstract z0 K(@NotNull r0 r0Var, boolean z10) throws IOException;

    @NotNull
    public abstract b1 M(@NotNull r0 r0Var) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @oj.i(name = "-read")
    public final <T> T a(@NotNull r0 file, @NotNull Function1<? super n, ? extends T> readerAction) throws IOException {
        ?? r10;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        n nVarE = l0.e(M(file));
        T th2 = null;
        try {
            T tInvoke = readerAction.invoke(nVarE);
            kotlin.jvm.internal.h0.d(1);
            if (nVarE != null) {
                try {
                    nVarE.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            T t10 = th2;
            th2 = tInvoke;
            r10 = t10;
        } catch (Throwable th4) {
            kotlin.jvm.internal.h0.d(1);
            if (nVarE != null) {
                try {
                    nVarE.close();
                } catch (Throwable th5) {
                    kotlin.p.a(th4, th5);
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th4;
        }
        if (r10 == 0) {
            return th2;
        }
        throw r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @oj.i(name = "-write")
    public final <T> T b(@NotNull r0 file, boolean z10, @NotNull Function1<? super m, ? extends T> writerAction) throws IOException {
        ?? r10;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        m mVarD = l0.d(K(file, z10));
        T th2 = null;
        try {
            T tInvoke = writerAction.invoke(mVarD);
            kotlin.jvm.internal.h0.d(1);
            if (mVarD != null) {
                try {
                    mVarD.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th2;
            th2 = tInvoke;
        } catch (Throwable th4) {
            kotlin.jvm.internal.h0.d(1);
            if (mVarD != null) {
                try {
                    mVarD.close();
                } catch (Throwable th5) {
                    kotlin.p.a(th4, th5);
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th4;
        }
        if (r10 == 0) {
            return th2;
        }
        throw r10;
    }

    @NotNull
    public final z0 d(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return e(file, false);
    }

    @NotNull
    public abstract z0 e(@NotNull r0 r0Var, boolean z10) throws IOException;

    public abstract void g(@NotNull r0 r0Var, @NotNull r0 r0Var2) throws IOException;

    @NotNull
    public abstract r0 h(@NotNull r0 r0Var) throws IOException;

    public void i(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        okio.internal.d.b(this, source, target);
    }

    public final void j(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        k(dir, false);
    }

    public final void k(@NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        okio.internal.d.c(this, dir, z10);
    }

    public final void m(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        n(dir, false);
    }

    public abstract void n(@NotNull r0 r0Var, boolean z10) throws IOException;

    public abstract void p(@NotNull r0 r0Var, @NotNull r0 r0Var2) throws IOException;

    public final void q(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        r(path, false);
    }

    public abstract void r(@NotNull r0 r0Var, boolean z10) throws IOException;

    public final void t(@NotNull r0 fileOrDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        u(fileOrDirectory, false);
    }

    public void u(@NotNull r0 fileOrDirectory, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        okio.internal.d.d(this, fileOrDirectory, z10);
    }

    public final boolean w(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.d.e(this, path);
    }

    @NotNull
    public abstract List<r0> y(@NotNull r0 r0Var) throws IOException;

    @Nullable
    public abstract List<r0> z(@NotNull r0 r0Var);
}
