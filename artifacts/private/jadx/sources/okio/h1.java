package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,144:1\n52#2,4:145\n52#2,22:149\n60#2,10:171\n56#2,3:181\n71#2,3:184\n52#2,22:187\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n57#1:145,4\n58#1:149,22\n57#1:171,10\n57#1:181,3\n57#1:184,3\n101#1:187,22\n*E\n"})
public final class h1 extends v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f334914i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final r0 f334915j = r0.a.h(r0.f335070b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final r0 f334916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final v f334917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<r0, okio.internal.l> f334918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f334919h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final r0 a() {
            return h1.f334915j;
        }

        private a() {
        }
    }

    public h1(@NotNull r0 zipPath, @NotNull v fileSystem, @NotNull Map<r0, okio.internal.l> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f334916e = zipPath;
        this.f334917f = fileSystem;
        this.f334918g = entries;
        this.f334919h = str;
    }

    private final r0 O(r0 r0Var) {
        return f334915j.M(r0Var, true);
    }

    private final List<r0> P(r0 r0Var, boolean z10) throws IOException {
        okio.internal.l lVar = this.f334918g.get(O(r0Var));
        if (lVar != null) {
            return CollectionsKt.toList(lVar.c());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + r0Var);
    }

    @Override // okio.v
    @Nullable
    public u E(@NotNull r0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        Intrinsics.checkNotNullParameter(path, "path");
        okio.internal.l lVarK = this.f334918g.get(O(path));
        if (lVarK == null) {
            return null;
        }
        if (lVarK.s() != -1) {
            t tVarF = this.f334917f.F(this.f334916e);
            try {
                n nVarE = l0.e(tVarF.Y(lVarK.s()));
                try {
                    lVarK = okio.internal.m.k(nVarE, lVarK);
                    if (nVarE != null) {
                        try {
                            nVarE.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (nVarE != null) {
                        try {
                            nVarE.close();
                        } catch (Throwable th6) {
                            kotlin.p.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    lVarK = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (tVarF != null) {
                    try {
                        tVarF.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (tVarF != null) {
                    try {
                        tVarF.close();
                    } catch (Throwable th9) {
                        kotlin.p.a(th8, th9);
                    }
                }
                th2 = th8;
                lVarK = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new u(!lVarK.u(), lVarK.u(), null, lVarK.u() ? null : Long.valueOf(lVarK.t()), lVarK.h(), lVarK.o(), lVarK.n(), null, 128, null);
    }

    @Override // okio.v
    @NotNull
    public t F(@NotNull r0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.v
    @NotNull
    public t H(@NotNull r0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.v
    @NotNull
    public z0 K(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // okio.v
    @NotNull
    public b1 M(@NotNull r0 file) throws IOException {
        ?? r10;
        Intrinsics.checkNotNullParameter(file, "file");
        okio.internal.l lVar = this.f334918g.get(O(file));
        if (lVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        t tVarF = this.f334917f.F(this.f334916e);
        n th2 = null;
        try {
            n nVarE = l0.e(tVarF.Y(lVar.s()));
            if (tVarF != null) {
                try {
                    tVarF.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            r10 = th2;
            th2 = nVarE;
        } catch (Throwable th4) {
            r10 = th4;
            if (tVarF != null) {
                try {
                    tVarF.close();
                    r10 = th4;
                } catch (Throwable th5) {
                    kotlin.p.a(th4, th5);
                    r10 = th4;
                }
            }
        }
        if (r10 != 0) {
            throw r10;
        }
        okio.internal.m.n(th2);
        return lVar.f() == 0 ? new okio.internal.j(th2, lVar.t(), true) : new okio.internal.j(new e0(new okio.internal.j(th2, lVar.e(), true), new Inflater(true)), lVar.t(), false);
    }

    @Override // okio.v
    @NotNull
    public z0 e(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.v
    public void g(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.v
    @NotNull
    public r0 h(@NotNull r0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        r0 r0VarO = O(path);
        if (this.f334918g.containsKey(r0VarO)) {
            return r0VarO;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.v
    public void n(@NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.v
    public void p(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.v
    public void r(@NotNull r0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.v
    @NotNull
    public List<r0> y(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<r0> listP = P(dir, true);
        Intrinsics.checkNotNull(listP);
        return listP;
    }

    @Override // okio.v
    @Nullable
    public List<r0> z(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return P(dir, false);
    }
}
