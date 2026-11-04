package androidx.datastore.core;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public class q<T> implements j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f49764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0<T> f49765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f49766c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {169, 178}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<T> f49770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49771e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q<T> qVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49770d = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49769c = obj;
            this.f49771e |= Integer.MIN_VALUE;
            return q.i(this.f49770d, this);
        }
    }

    public q(@NotNull File file, @NotNull l0<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f49764a = file;
        this.f49765b = serializer;
        this.f49766c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.q] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v22 */
    static /* synthetic */ <T> Object i(q<T> qVar, kotlin.coroutines.d<? super T> dVar) throws IOException {
        a aVar;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49771e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49771e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(qVar, dVar);
            }
        } else {
            aVar = new a(qVar, dVar);
        }
        Object obj = aVar.f49769c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        ?? r10 = aVar.f49771e;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    closeable2 = (Closeable) aVar.f49768b;
                    r10 = (q) aVar.f49767a;
                    try {
                        ResultKt.m(obj);
                        kotlin.io.c.a(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            kotlin.io.c.a(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f49767a;
                try {
                    ResultKt.m(obj);
                    kotlin.io.c.a(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        kotlin.io.c.a(closeable, th2);
                        throw th7;
                    }
                }
            }
            ResultKt.m(obj);
            qVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((q) qVar).f49764a);
                try {
                    l0<T> l0Var = ((q) qVar).f49765b;
                    aVar.f49767a = qVar;
                    aVar.f49768b = fileInputStream;
                    aVar.f49771e = 1;
                    Object objM = l0Var.M(fileInputStream, aVar);
                    if (objM != objL) {
                        closeable2 = fileInputStream;
                        obj = objM;
                        kotlin.io.c.a(closeable2, null);
                        return obj;
                    }
                    return objL;
                } catch (Throwable th8) {
                    r10 = qVar;
                    closeable2 = fileInputStream;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (!((q) qVar).f49764a.exists()) {
                    return ((q) qVar).f49765b.K();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((q) qVar).f49764a);
                try {
                    l0<T> l0Var2 = ((q) qVar).f49765b;
                    aVar.f49767a = fileInputStream2;
                    aVar.f49768b = null;
                    aVar.f49771e = 2;
                    Object objM2 = l0Var2.M(fileInputStream2, aVar);
                    if (objM2 != objL) {
                        obj = objM2;
                        closeable = fileInputStream2;
                        kotlin.io.c.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream2;
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused2) {
            qVar = (q<T>) r10;
        }
    }

    @Override // androidx.datastore.core.e
    public void close() {
        this.f49766c.set(true);
    }

    @Override // androidx.datastore.core.j0
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return i(this, dVar);
    }

    protected final void f() {
        if (this.f49766c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    protected final File g() {
        return this.f49764a;
    }

    @NotNull
    protected final l0<T> h() {
        return this.f49765b;
    }
}
