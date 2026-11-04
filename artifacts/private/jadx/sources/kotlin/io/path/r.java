package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.p1;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,530:1\n376#1,2:534\n384#1:536\n384#1:537\n378#1,4:538\n376#1,2:542\n384#1:544\n378#1,4:545\n384#1:549\n376#1,6:550\n376#1,2:556\n384#1:558\n378#1,4:559\n1#2:531\n1863#3,2:532\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n392#1:534,2\n407#1:536\n410#1:537\n392#1:538,4\n418#1:542,2\n419#1:544\n418#1:545,4\n430#1:549\n438#1:550,6\n461#1:556,2\n462#1:558\n461#1:559,4\n314#1:532,2\n*E\n"})
class r extends q {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f312661b;

        static {
            int[] iArr = new int[kotlin.io.path.a.values().length];
            try {
                iArr[kotlin.io.path.a.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.io.path.a.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.io.path.a.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f312660a = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f312661b = iArr2;
        }
    }

    static final class b extends l0 implements pj.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f312662a = new b();

        b() {
            super(3);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Path path, Path path2, Exception exception) throws Exception {
            Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    static final class c extends l0 implements pj.n<CopyActionContext, Path, Path, kotlin.io.path.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f312663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10) {
            super(3);
            this.f312663a = z10;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final kotlin.io.path.a invoke(CopyActionContext copyToRecursively, Path src, Path dst) throws IOException {
            Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(dst, "dst");
            LinkOption[] linkOptionArrA = i.f312621a.a(this.f312663a);
            boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
            if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                if (zIsDirectory) {
                    r.T(dst);
                }
                p1 p1Var = new p1(2);
                p1Var.b(linkOptionArrA);
                p1Var.a(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) p1Var.d(new CopyOption[p1Var.c()]);
                Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
            }
            return kotlin.io.path.a.CONTINUE;
        }
    }

    static final class d extends l0 implements pj.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f312664a = new d();

        d() {
            super(3);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Path path, Path path2, Exception exception) throws Exception {
            Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    static final class e extends l0 implements pj.n<CopyActionContext, Path, Path, kotlin.io.path.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f312665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10) {
            super(3);
            this.f312665a = z10;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final kotlin.io.path.a invoke(CopyActionContext copyActionContext, Path src, Path dst) {
            Intrinsics.checkNotNullParameter(copyActionContext, "$this$null");
            Intrinsics.checkNotNullParameter(src, "src");
            Intrinsics.checkNotNullParameter(dst, "dst");
            return copyActionContext.a(src, dst, this.f312665a);
        }
    }

    static final class f extends l0 implements Function1<FileVisitorBuilder, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<Path> f312666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<CopyActionContext, Path, Path, kotlin.io.path.a> f312667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Path f312668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Path f312669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Path f312670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<Path, Path, Exception, j> f312671f;

        static final class a extends l0 implements Function2<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList<Path> f312672a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<CopyActionContext, Path, Path, kotlin.io.path.a> f312673b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Path f312674c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Path f312675d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f312676e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ pj.n<Path, Path, Exception, j> f312677f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ArrayList<Path> arrayList, pj.n<? super CopyActionContext, ? super Path, ? super Path, ? extends kotlin.io.path.a> nVar, Path path, Path path2, Path path3, pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar2) {
                super(2);
                this.f312672a = arrayList;
                this.f312673b = nVar;
                this.f312674c = path;
                this.f312675d = path2;
                this.f312676e = path3;
                this.f312677f = nVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(Path directory, BasicFileAttributes attributes) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                FileVisitResult fileVisitResultO = r.O(this.f312672a, this.f312673b, this.f312674c, this.f312675d, this.f312676e, this.f312677f, directory, attributes);
                ArrayList<Path> arrayList = this.f312672a;
                if (fileVisitResultO == FileVisitResult.CONTINUE) {
                    arrayList.add(directory);
                }
                return fileVisitResultO;
            }
        }

        /* synthetic */ class b extends g0 implements Function2<Path, BasicFileAttributes, FileVisitResult> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList<Path> f312678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<CopyActionContext, Path, Path, kotlin.io.path.a> f312679b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Path f312680c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Path f312681d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f312682e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ pj.n<Path, Path, Exception, j> f312683f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ArrayList<Path> arrayList, pj.n<? super CopyActionContext, ? super Path, ? super Path, ? extends kotlin.io.path.a> nVar, Path path, Path path2, Path path3, pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar2) {
                super(2, Intrinsics.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f312678a = arrayList;
                this.f312679b = nVar;
                this.f312680c = path;
                this.f312681d = path2;
                this.f312682e = path3;
                this.f312683f = nVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(Path p10, BasicFileAttributes p11) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                Intrinsics.checkNotNullParameter(p11, "p1");
                return r.O(this.f312678a, this.f312679b, this.f312680c, this.f312681d, this.f312682e, this.f312683f, p10, p11);
            }
        }

        /* synthetic */ class c extends g0 implements Function2<Path, Exception, FileVisitResult> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<Path, Path, Exception, j> f312684a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Path f312685b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Path f312686c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Path f312687d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar, Path path, Path path2, Path path3) {
                super(2, Intrinsics.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.f312684a = nVar;
                this.f312685b = path;
                this.f312686c = path2;
                this.f312687d = path3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(Path p10, Exception p11) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                Intrinsics.checkNotNullParameter(p11, "p1");
                return r.S(this.f312684a, this.f312685b, this.f312686c, this.f312687d, p10, p11);
            }
        }

        static final class d extends l0 implements Function2<Path, IOException, FileVisitResult> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ArrayList<Path> f312688a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<Path, Path, Exception, j> f312689b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Path f312690c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Path f312691d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Path f312692e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(ArrayList<Path> arrayList, pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar, Path path, Path path2, Path path3) {
                super(2);
                this.f312688a = arrayList;
                this.f312689b = nVar;
                this.f312690c = path;
                this.f312691d = path2;
                this.f312692e = path3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final FileVisitResult invoke(Path directory, IOException iOException) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                CollectionsKt.removeLast(this.f312688a);
                return iOException == null ? FileVisitResult.CONTINUE : r.S(this.f312689b, this.f312690c, this.f312691d, this.f312692e, directory, iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ArrayList<Path> arrayList, pj.n<? super CopyActionContext, ? super Path, ? super Path, ? extends kotlin.io.path.a> nVar, Path path, Path path2, Path path3, pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar2) {
            super(1);
            this.f312666a = arrayList;
            this.f312667b = nVar;
            this.f312668c = path;
            this.f312669d = path2;
            this.f312670e = path3;
            this.f312671f = nVar2;
        }

        public final void c(FileVisitorBuilder visitFileTree) {
            Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
            visitFileTree.c(new a(this.f312666a, this.f312667b, this.f312668c, this.f312669d, this.f312670e, this.f312671f));
            visitFileTree.b(new b(this.f312666a, this.f312667b, this.f312668c, this.f312669d, this.f312670e, this.f312671f));
            visitFileTree.d(new c(this.f312671f, this.f312668c, this.f312669d, this.f312670e));
            visitFileTree.a(new d(this.f312666a, this.f312671f, this.f312668c, this.f312669d, this.f312670e));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
            c(fileVisitorBuilder);
            return Unit.f312394a;
        }
    }

    public static final void J(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String strT0 = s.T0(path);
        int iHashCode = strT0.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strT0.equals("./")) {
                                return;
                            }
                        } else if (!strT0.equals("..")) {
                            return;
                        }
                    } else if (!strT0.equals("..\\")) {
                        return;
                    }
                } else if (!strT0.equals("../")) {
                    return;
                }
            } else if (!strT0.equals(".\\")) {
                return;
            }
        } else if (!strT0.equals(".")) {
            return;
        }
        throw new h(path);
    }

    private static final void K(Path path, Path path2) throws FileSystemLoopException {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(path.toString());
        }
    }

    private static final void L(kotlin.io.path.d dVar, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e10) {
            dVar.a(e10);
        }
    }

    @kotlin.io.path.e
    @e1(version = "1.8")
    @NotNull
    public static final Path M(@NotNull Path path, @NotNull Path target, @NotNull pj.n<? super Path, ? super Path, ? super Exception, ? extends j> onError, boolean z10, @NotNull pj.n<? super CopyActionContext, ? super Path, ? super Path, ? extends kotlin.io.path.a> copyAction) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptionArrA = i.f312621a.a(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
            boolean z11 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if (!z11 || !Files.isSameFile(path, target)) {
                if (Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem())) {
                    if (z11) {
                        zStartsWith = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = target.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            zStartsWith = true;
                        }
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        s.E1(path, 0, z10, new f(new ArrayList(), copyAction, path, target, target.normalize(), onError), 1, null);
        return target;
    }

    @kotlin.io.path.e
    @e1(version = "1.8")
    @NotNull
    public static final Path N(@NotNull Path path, @NotNull Path target, @NotNull pj.n<? super Path, ? super Path, ? super Exception, ? extends j> onError, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return z11 ? M(path, target, onError, z10, new c(z10)) : P(path, target, onError, z10, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult O(ArrayList<Path> arrayList, pj.n<? super CopyActionContext, ? super Path, ? super Path, ? extends kotlin.io.path.a> nVar, Path path, Path path2, Path path3, pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                J(path4);
                K(path4, (Path) CollectionsKt.last((List) arrayList));
            }
            return a0(nVar.invoke(kotlin.io.path.b.f312604a, path4, R(path, path2, path3, path4)));
        } catch (Exception e10) {
            return S(nVar2, path, path2, path3, path4, e10);
        }
    }

    public static /* synthetic */ Path P(Path path, Path path2, pj.n nVar, boolean z10, pj.n nVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = d.f312664a;
        }
        if ((i10 & 8) != 0) {
            nVar2 = new e(z10);
        }
        return M(path, path2, nVar, z10, nVar2);
    }

    public static /* synthetic */ Path Q(Path path, Path path2, pj.n nVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = b.f312662a;
        }
        return N(path, path2, nVar, z10, z11);
    }

    private static final Path R(Path path, Path path2, Path path3, Path path4) throws h {
        Path pathResolve = path2.resolve(s.s1(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new h(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        Intrinsics.checkNotNull(pathResolve);
        return pathResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult S(pj.n<? super Path, ? super Path, ? super Exception, ? extends j> nVar, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return b0(nVar.invoke(path4, R(path, path2, path3, path4), exc));
    }

    @kotlin.io.path.e
    @e1(version = "1.8")
    public static final void T(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> listU = U(path);
        if (listU.isEmpty()) {
            return;
        }
        FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = listU.iterator();
        while (it.hasNext()) {
            kotlin.p.a(fileSystemException, (Exception) it.next());
        }
        throw fileSystemException;
    }

    private static final List<Exception> U(Path path) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z10 = false;
        boolean z11 = true;
        kotlin.io.path.d dVar = new kotlin.io.path.d(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        dVar.g(parent);
                        Path fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        W((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, null, dVar);
                    } else {
                        z10 = true;
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
                    z11 = z10;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            }
        }
        if (z11) {
            Y(path, null, dVar);
        }
        return dVar.d();
    }

    private static final void V(SecureDirectoryStream<Path> secureDirectoryStream, Path path, kotlin.io.path.d dVar) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (NoSuchFileException unused) {
                secureDirectoryStreamNewDirectoryStream = null;
            }
            if (secureDirectoryStreamNewDirectoryStream != null) {
                try {
                    Iterator<Path> it = secureDirectoryStreamNewDirectoryStream.iterator();
                    while (it.hasNext()) {
                        Path fileName = it.next().getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        W(secureDirectoryStreamNewDirectoryStream, fileName, dVar.e(), dVar);
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(secureDirectoryStreamNewDirectoryStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(secureDirectoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            }
        } catch (Exception e10) {
            dVar.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[Catch: Exception -> 0x0014, NoSuchFileException -> 0x0045, TRY_ENTER, TryCatch #0 {NoSuchFileException -> 0x0045, blocks: (B:11:0x0034, B:12:0x003b), top: B:19:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x003b A[Catch: Exception -> 0x0014, NoSuchFileException -> 0x0045, TRY_LEAVE, TryCatch #0 {NoSuchFileException -> 0x0045, blocks: (B:11:0x0034, B:12:0x003b), top: B:19:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[Catch: Exception -> 0x0014, TRY_LEAVE, TryCatch #1 {Exception -> 0x0014, blocks: (B:4:0x0005, B:7:0x0016, B:9:0x0025, B:11:0x0034, B:12:0x003b), top: B:21:0x0005 }] */
    private static final void W(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, kotlin.io.path.d dVar) {
        int iF;
        dVar.b(path);
        if (path2 != null) {
            try {
                Path pathE = dVar.e();
                Intrinsics.checkNotNull(pathE);
                J(pathE);
                K(pathE, path2);
                try {
                    if (Z(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                        iF = dVar.f();
                        V(secureDirectoryStream, path, dVar);
                        if (iF == dVar.f()) {
                            secureDirectoryStream.deleteDirectory(path);
                            Unit unit = Unit.f312394a;
                        }
                    } else {
                        secureDirectoryStream.deleteFile(path);
                        Unit unit2 = Unit.f312394a;
                    }
                } catch (NoSuchFileException unused) {
                }
            } catch (Exception e10) {
                dVar.a(e10);
            }
        } else if (Z(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            iF = dVar.f();
            V(secureDirectoryStream, path, dVar);
            if (iF == dVar.f()) {
                secureDirectoryStream.deleteDirectory(path);
                Unit unit3 = Unit.f312394a;
            }
        } else {
            secureDirectoryStream.deleteFile(path);
            Unit unit4 = Unit.f312394a;
        }
        dVar.c(path);
    }

    private static final void X(Path path, kotlin.io.path.d dVar) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    for (Path path2 : directoryStreamNewDirectoryStream) {
                        Intrinsics.checkNotNull(path2);
                        Y(path2, path, dVar);
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(directoryStreamNewDirectoryStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(directoryStreamNewDirectoryStream, th2);
                        throw th3;
                    }
                }
            }
        } catch (Exception e10) {
            dVar.a(e10);
        }
    }

    private static final void Y(Path path, Path path2, kotlin.io.path.d dVar) {
        if (path2 != null) {
            try {
                J(path);
                K(path, path2);
            } catch (Exception e10) {
                dVar.a(e10);
                return;
            }
        }
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Files.deleteIfExists(path);
            return;
        }
        int iF = dVar.f();
        X(path, dVar);
        if (iF == dVar.f()) {
            Files.deleteIfExists(path);
        }
    }

    private static final boolean Z(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @kotlin.io.path.e
    private static final FileVisitResult a0(kotlin.io.path.a aVar) {
        int i10 = a.f312660a[aVar.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i10 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new k0();
    }

    @kotlin.io.path.e
    private static final FileVisitResult b0(j jVar) {
        int i10 = a.f312661b[jVar.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new k0();
    }

    private static final <R> R c0(Function0<? extends R> function0) {
        try {
            return function0.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
