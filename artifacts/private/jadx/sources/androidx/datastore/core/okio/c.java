package androidx.datastore.core.okio;

import androidx.datastore.core.j0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import okio.l0;
import okio.n;
import okio.r0;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:233\n60#2,10:239\n57#2,2:249\n71#2,2:251\n66#2:253\n52#2,5:255\n60#2,10:261\n57#2,2:271\n71#2,2:273\n67#3:232\n68#3:238\n67#3:254\n68#3:260\n1#4:275\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:231\n177#1:233,5\n177#1:239,10\n177#1:249,2\n177#1:251,2\n187#1:253\n187#1:255,5\n187#1:261,10\n187#1:271,2\n187#1:273,2\n177#1:232\n177#1:238\n187#1:254\n187#1:260\n*E\n"})
public class c<T> implements j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f49717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r0 f49718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d<T> f49719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.okio.a f49720d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1}, l = {180, 187}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c<T> f49724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49725e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49724d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49723c = obj;
            this.f49725e |= Integer.MIN_VALUE;
            return c.j(this.f49724d, this);
        }
    }

    public c(@NotNull v fileSystem, @NotNull r0 path, @NotNull d<T> serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f49717a = fileSystem;
        this.f49718b = path;
        this.f49719c = serializer;
        this.f49720d = new androidx.datastore.core.okio.a(false);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v27 */
    static /* synthetic */ <T> Object j(c<T> cVar, kotlin.coroutines.d<? super T> dVar) throws Throwable {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        Throwable th4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49725e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49725e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, dVar);
            }
        } else {
            aVar = new a(cVar, dVar);
        }
        Object objK = aVar.f49723c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        ?? r10 = aVar.f49725e;
        Throwable th5 = null;
        try {
            if (r10 == 0) {
                ResultKt.m(objK);
                cVar.f();
                try {
                    n nVarE = l0.e(((c) cVar).f49717a.M(((c) cVar).f49718b));
                    try {
                        d<T> dVar2 = ((c) cVar).f49719c;
                        aVar.f49721a = cVar;
                        aVar.f49722b = nVarE;
                        aVar.f49725e = 1;
                        Object objB = dVar2.b(nVarE, aVar);
                        if (objB != objL) {
                            closeable2 = nVarE;
                            objK = objB;
                            if (closeable2 != null) {
                                closeable2.close();
                            }
                            th4 = null;
                        }
                        return objL;
                    } catch (Throwable th6) {
                        r10 = cVar;
                        closeable2 = nVarE;
                        th3 = th6;
                        if (closeable2 != null) {
                            closeable2.close();
                        }
                        th4 = th3;
                        objK = null;
                    }
                } catch (FileNotFoundException unused) {
                    if (((c) cVar).f49717a.w(((c) cVar).f49718b)) {
                        n nVarE2 = l0.e(((c) cVar).f49717a.M(((c) cVar).f49718b));
                        try {
                            d<T> dVar3 = ((c) cVar).f49719c;
                            aVar.f49721a = nVarE2;
                            aVar.f49722b = null;
                            aVar.f49725e = 2;
                            Object objB2 = dVar3.b(nVarE2, aVar);
                            if (objB2 != objL) {
                                objK = objB2;
                                closeable = nVarE2;
                                if (closeable != null) {
                                    closeable.close();
                                }
                                if (th5 == null) {
                                    throw th5;
                                }
                                Intrinsics.checkNotNull(objK);
                            }
                            return objL;
                        } catch (Throwable th7) {
                            th2 = th7;
                            closeable = nVarE2;
                            if (closeable != null) {
                                closeable.close();
                            }
                            th5 = th2;
                            objK = null;
                        }
                    } else {
                        objK = ((c) cVar).f49719c.K();
                    }
                }
            } else {
                if (r10 != 1) {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) aVar.f49721a;
                    try {
                        ResultKt.m(objK);
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th8) {
                                th5 = th8;
                            }
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th10) {
                                p.a(th2, th10);
                            }
                        }
                        th5 = th2;
                        objK = null;
                    }
                    if (th5 == null) {
                        throw th5;
                    }
                    Intrinsics.checkNotNull(objK);
                    return objK;
                }
                closeable2 = (Closeable) aVar.f49722b;
                c cVar2 = (c) aVar.f49721a;
                try {
                    ResultKt.m(objK);
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th11) {
                            th4 = th11;
                        }
                    }
                    th4 = null;
                } catch (Throwable th12) {
                    th3 = th12;
                    r10 = cVar2;
                    if (closeable2 != null) {
                        try {
                            closeable2.close();
                        } catch (Throwable th13) {
                            p.a(th3, th13);
                        }
                    }
                    th4 = th3;
                    objK = null;
                }
            }
            if (th4 != null) {
                throw th4;
            }
            Intrinsics.checkNotNull(objK);
            return objK;
        } catch (FileNotFoundException unused2) {
            cVar = (c<T>) r10;
        }
    }

    @Override // androidx.datastore.core.e
    public void close() {
        this.f49720d.b(true);
    }

    @Override // androidx.datastore.core.j0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(this, dVar);
    }

    protected final void f() {
        if (this.f49720d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    protected final v g() {
        return this.f49717a;
    }

    @NotNull
    protected final r0 h() {
        return this.f49718b;
    }

    @NotNull
    protected final d<T> i() {
        return this.f49719c;
    }
}
