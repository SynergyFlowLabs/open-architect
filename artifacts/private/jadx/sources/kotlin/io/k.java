package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f312575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final FileWalkDirection f312576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<File, Boolean> f312577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<File, Unit> f312578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function2<File, IOException, Unit> f312579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f312580f;

    @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractIterator<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayDeque<c> f312581a;

        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f312583b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private File[] f312584c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f312585d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f312586e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f312587f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f312587f = bVar;
            }

            @Override // kotlin.io.k.c
            @Nullable
            public File b() {
                if (!this.f312586e && this.f312584c == null) {
                    Function1 function1 = k.this.f312577c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f312584c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = k.this.f312579e;
                        if (function2 != null) {
                            function2.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f312586e = true;
                    }
                }
                File[] fileArr = this.f312584c;
                if (fileArr != null) {
                    int i10 = this.f312585d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f312584c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i11 = this.f312585d;
                        this.f312585d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f312583b) {
                    this.f312583b = true;
                    return a();
                }
                Function1 function3 = k.this.f312578d;
                if (function3 != null) {
                    function3.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.k$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        private final class C2257b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f312588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f312589c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2257b(@NotNull b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f312589c = bVar;
            }

            @Override // kotlin.io.k.c
            @Nullable
            public File b() {
                if (this.f312588b) {
                    return null;
                }
                this.f312588b = true;
                return a();
            }
        }

        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f312590b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private File[] f312591c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f312592d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f312593e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f312593e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
            
                if (r0.length == 0) goto L32;
             */
            @Override // kotlin.io.k.c
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    java.lang.String r9 = "Androeed.ru"
                    boolean r0 = r10.f312590b
                    r1 = 0
                    if (r0 != 0) goto L30
                    kotlin.io.k$b r0 = r10.f312593e
                    kotlin.io.k r0 = kotlin.io.k.this
                    r9 = 7
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.k.e(r0)
                    r9 = 0
                    if (r0 == 0) goto L28
                    r9 = 6
                    java.io.File r2 = r10.a()
                    r9 = 5
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    r9 = 3
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L28
                    r9 = 3
                    return r1
                L28:
                    r0 = 1
                    r10.f312590b = r0
                    java.io.File r10 = r10.a()
                    return r10
                L30:
                    java.io.File[] r0 = r10.f312591c
                    r9 = 3
                    if (r0 == 0) goto L51
                    int r2 = r10.f312592d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L3e
                    goto L51
                L3e:
                    kotlin.io.k$b r0 = r10.f312593e
                    kotlin.io.k r0 = kotlin.io.k.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.k.g(r0)
                    if (r0 == 0) goto L50
                    java.io.File r10 = r10.a()
                    r9 = 1
                    r0.invoke(r10)
                L50:
                    return r1
                L51:
                    java.io.File[] r0 = r10.f312591c
                    if (r0 != 0) goto La5
                    r9 = 6
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f312591c = r0
                    r9 = 4
                    if (r0 != 0) goto L86
                    kotlin.io.k$b r0 = r10.f312593e
                    kotlin.io.k r0 = kotlin.io.k.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.k.f(r0)
                    if (r0 == 0) goto L86
                    r9 = 5
                    java.io.File r2 = r10.a()
                    kotlin.io.a r3 = new kotlin.io.a
                    r9 = 1
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    r9 = r5
                    java.lang.String r6 = "Cannot list files in a directory"
                    r9 = 5
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L86:
                    java.io.File[] r0 = r10.f312591c
                    r9 = 3
                    if (r0 == 0) goto L91
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto La5
                L91:
                    kotlin.io.k$b r0 = r10.f312593e
                    kotlin.io.k r0 = kotlin.io.k.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.k.g(r0)
                    r9 = 1
                    if (r0 == 0) goto La4
                    r9 = 4
                    java.io.File r10 = r10.a()
                    r0.invoke(r10)
                La4:
                    return r1
                La5:
                    r9 = 4
                    java.io.File[] r0 = r10.f312591c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    r9 = 2
                    int r1 = r10.f312592d
                    r9 = 7
                    int r2 = r1 + 1
                    r10.f312592d = r2
                    r10 = r0[r1]
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.k.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f312594a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f312594a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f312581a = arrayDeque;
            if (k.this.f312575a.isDirectory()) {
                arrayDeque.push(b(k.this.f312575a));
            } else if (k.this.f312575a.isFile()) {
                arrayDeque.push(new C2257b(this, k.this.f312575a));
            } else {
                done();
            }
        }

        private final a b(File file) {
            int i10 = d.f312594a[k.this.f312576b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new k0();
        }

        private final File c() {
            while (true) {
                c cVarPeek = this.f312581a.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f312581a.pop();
                } else {
                    if (Intrinsics.areEqual(fileB, cVarPeek.a()) || !fileB.isDirectory() || this.f312581a.size() >= k.this.f312580f) {
                        return fileB;
                    }
                    this.f312581a.push(b(fileB));
                }
            }
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            File fileC = c();
            if (fileC != null) {
                setNext(fileC);
            } else {
                done();
            }
        }
    }

    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f312595a;

        public c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f312595a = root;
        }

        @NotNull
        public final File a() {
            return this.f312595a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i10) {
        this.f312575a = file;
        this.f312576b = fileWalkDirection;
        this.f312577c = function1;
        this.f312578d = function2;
        this.f312579e = function3;
        this.f312580f = i10;
    }

    @NotNull
    public final k i(int i10) {
        if (i10 > 0) {
            return new k(this.f312575a, this.f312576b, this.f312577c, this.f312578d, this.f312579e, i10);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i10 + '.');
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }

    @NotNull
    public final k j(@NotNull Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new k(this.f312575a, this.f312576b, function, this.f312578d, this.f312579e, this.f312580f);
    }

    @NotNull
    public final k k(@NotNull Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new k(this.f312575a, this.f312576b, this.f312577c, this.f312578d, function, this.f312580f);
    }

    @NotNull
    public final k l(@NotNull Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new k(this.f312575a, this.f312576b, this.f312577c, function, this.f312579e, this.f312580f);
    }

    /* synthetic */ k(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ k(File file, FileWalkDirection fileWalkDirection, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
