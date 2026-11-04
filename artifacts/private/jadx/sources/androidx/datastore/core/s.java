package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n38#2,23:209\n38#2,23:240\n120#3,8:232\n129#3:263\n1#4:264\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:209,23\n117#1:240,23\n114#1:232,8\n114#1:263\n*E\n"})
public final class s<T> implements r0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f49780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0<T> f49781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f49782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f49783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f49784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49785f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0}, l = {101}, m = "readScope", n = {"this", "$this$use$iv", io.sentry.protocol.z.b.f306551r}, s = {"L$0", "L$1", "Z$0"})
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f49788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s<T> f49790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49791f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49790e = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49789d = obj;
            this.f49791f |= Integer.MIN_VALUE;
            return this.f49790e.e(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {214, 118}, m = "writeScope", n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s<T> f49797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49798g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s<T> sVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f49797f = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49796e = obj;
            this.f49798g |= Integer.MIN_VALUE;
            return this.f49797f.b(null, this);
        }
    }

    public s(@NotNull File file, @NotNull l0<T> serializer, @NotNull w coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f49780a = file;
        this.f49781b = serializer;
        this.f49782c = coordinator;
        this.f49783d = onClose;
        this.f49784e = new AtomicBoolean(false);
        this.f49785f = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f49784e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db A[Catch: all -> 0x011a, IOException -> 0x011d, TRY_ENTER, TryCatch #4 {all -> 0x011a, blocks: (B:37:0x00db, B:39:0x00e3, B:42:0x00ed, B:43:0x0119, B:48:0x0122, B:51:0x0129, B:59:0x013b, B:57:0x0136), top: B:77:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0129 A[Catch: all -> 0x011a, IOException -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x011a, blocks: (B:37:0x00db, B:39:0x00e3, B:42:0x00ed, B:43:0x0119, B:48:0x0122, B:51:0x0129, B:59:0x013b, B:57:0x0136), top: B:77:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.File, java.lang.Object] */
    @Override // androidx.datastore.core.r0
    @Nullable
    public Object b(@NotNull Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        b bVar;
        ?? file;
        kotlinx.coroutines.sync.a aVar;
        t tVar;
        Throwable th2;
        e eVar;
        s<T> sVar;
        kotlinx.coroutines.sync.a aVar2;
        ?? r10;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f49798g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f49798g = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        ?? r11 = bVar.f49796e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f49798g;
        int i12 = 2 & 1;
        try {
            try {
                try {
                    try {
                        try {
                            if (i11 == 0) {
                                ResultKt.m(r11);
                                f();
                                g(this.f49780a);
                                aVar = this.f49785f;
                                bVar.f49792a = this;
                                bVar.f49793b = function2;
                                bVar.f49794c = aVar;
                                bVar.f49798g = 1;
                                if (aVar.h(null, bVar) != objL) {
                                }
                                return objL;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                eVar = (e) bVar.f49795d;
                                File file2 = (File) bVar.f49794c;
                                aVar2 = (kotlinx.coroutines.sync.a) bVar.f49793b;
                                sVar = (s) bVar.f49792a;
                                try {
                                    ResultKt.m(r11);
                                    r10 = file2;
                                    Unit unit = Unit.f312394a;
                                    try {
                                        eVar.close();
                                        th = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r10.exists() && !p.a(r10, sVar.f49780a)) {
                                        throw new IOException("Unable to rename " + r10 + " to " + sVar.f49780a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    Unit unit2 = Unit.f312394a;
                                    aVar2.i(null);
                                    return unit2;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    try {
                                        eVar.close();
                                    } catch (Throwable th5) {
                                        kotlin.p.a(th2, th5);
                                    }
                                    throw th2;
                                }
                            }
                            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) bVar.f49794c;
                            function2 = (Function2) bVar.f49793b;
                            s<T> sVar2 = (s) bVar.f49792a;
                            ResultKt.m(r11);
                            aVar = aVar3;
                            this = sVar2;
                            bVar.f49792a = this;
                            bVar.f49793b = aVar;
                            bVar.f49794c = file;
                            bVar.f49795d = tVar;
                            bVar.f49798g = 2;
                            if (function2.invoke(tVar, bVar) != objL) {
                                sVar = this;
                                aVar2 = aVar;
                                r10 = file;
                                eVar = tVar;
                                Unit unit3 = Unit.f312394a;
                                eVar.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r10.exists()) {
                                    throw new IOException("Unable to rename " + r10 + " to " + sVar.f49780a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                Unit unit4 = Unit.f312394a;
                                aVar2.i(null);
                                return unit4;
                            }
                            return objL;
                        } catch (Throwable th6) {
                            th2 = th6;
                            eVar = tVar;
                            eVar.close();
                            throw th2;
                        }
                        tVar = new t(file, this.f49781b);
                    } catch (IOException e10) {
                        e = e10;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(this.f49780a.getAbsolutePath() + ".tmp");
                } catch (Throwable th7) {
                    th = th7;
                    r11 = objL;
                    r11.i(null);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                r11.i(null);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            file = function2;
        }
    }

    @Override // androidx.datastore.core.r0
    @NotNull
    public w c() {
        return this.f49782c;
    }

    @Override // androidx.datastore.core.e
    public void close() {
        this.f49784e.set(true);
        this.f49783d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // androidx.datastore.core.r0
    @Nullable
    public <R> Object e(@NotNull pj.n<? super j0<T>, ? super Boolean, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) throws Throwable {
        a aVar;
        Throwable th2;
        e eVar;
        s<T> sVar;
        boolean z10;
        ?? r11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49791f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49791f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        ?? r12 = aVar.f49789d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f49791f;
        try {
            if (i11 == 0) {
                ResultKt.m(r12);
                f();
                boolean zC = kotlinx.coroutines.sync.a.C2318a.c(this.f49785f, null, 1, null);
                q qVar = new q(this.f49780a, this.f49781b);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zC);
                    aVar.f49786a = this;
                    aVar.f49787b = qVar;
                    aVar.f49788c = zC;
                    aVar.f49791f = 1;
                    Object objInvoke = nVar.invoke(qVar, boolA, aVar);
                    if (objInvoke == objL) {
                        return objL;
                    }
                    sVar = this;
                    z10 = zC ? 1 : 0;
                    r11 = objInvoke;
                    eVar = qVar;
                    eVar.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z10) {
                        kotlinx.coroutines.sync.a.C2318a.d(sVar.f49785f, null, 1, null);
                    }
                    return r11;
                } catch (Throwable th3) {
                    th2 = th3;
                    eVar = qVar;
                    r12 = zC;
                    eVar.close();
                    throw th2;
                }
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f49788c;
            eVar = (e) aVar.f49787b;
            sVar = (s) aVar.f49786a;
            try {
                ResultKt.m(r12);
                r11 = r12;
                try {
                    eVar.close();
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (th != null) {
                    if (z10) {
                        kotlinx.coroutines.sync.a.C2318a.d(sVar.f49785f, null, 1, null);
                    }
                    return r11;
                }
                try {
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    r12 = z10;
                    this = sVar;
                }
            } catch (Throwable th6) {
                r12 = z10 ? 1 : 0;
                this = sVar;
                th2 = th6;
                try {
                    eVar.close();
                } catch (Throwable th7) {
                    kotlin.p.a(th2, th7);
                }
                throw th2;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (r12 != 0) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f49785f, null, 1, null);
        }
        throw th;
    }
}
