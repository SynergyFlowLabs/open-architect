package androidx.datastore.core.okio;

import androidx.datastore.core.j0;
import androidx.datastore.core.r0;
import androidx.datastore.core.w;
import androidx.datastore.core.w0;
import io.sentry.protocol.z;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n38#2,23:231\n38#2,23:262\n120#3,8:254\n129#3:285\n1#4:286\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:231,23\n136#1:262,23\n129#1:254,8\n129#1:285\n*E\n"})
public final class f<T> implements r0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f49737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final okio.r0 f49738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final d<T> f49739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w f49740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f49741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.okio.a f49742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f49743g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0}, l = {113}, m = "readScope", n = {"this", "$this$use$iv", z.b.f306551r}, s = {"L$0", "L$1", "Z$0"})
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f49746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f49747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f<T> f49748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49749f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f49748e = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49747d = obj;
            this.f49749f |= Integer.MIN_VALUE;
            return this.f49748e.e(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {236, androidx.media2.widget.f.i.f59767c0}, m = "writeScope", n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f49752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f49753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f<T> f49755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49756g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f49755f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49754e = obj;
            this.f49756g |= Integer.MIN_VALUE;
            return this.f49755f.b(null, this);
        }
    }

    public f(@NotNull v fileSystem, @NotNull okio.r0 path, @NotNull d<T> serializer, @NotNull w coordinator, @NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f49737a = fileSystem;
        this.f49738b = path;
        this.f49739c = serializer;
        this.f49740d = coordinator;
        this.f49741e = onClose;
        this.f49742f = new androidx.datastore.core.okio.a(false);
        this.f49743g = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f49742f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00eb A[Catch: all -> 0x00fe, IOException -> 0x0102, TRY_ENTER, TryCatch #6 {IOException -> 0x0102, blocks: (B:39:0x00eb, B:41:0x00f5, B:50:0x010f, B:57:0x0120, B:56:0x011c), top: B:73:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[Catch: all -> 0x00fe, IOException -> 0x0102, TRY_LEAVE, TryCatch #6 {IOException -> 0x0102, blocks: (B:39:0x00eb, B:41:0x00f5, B:50:0x010f, B:57:0x0120, B:56:0x011c), top: B:73:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010f A[Catch: all -> 0x00fe, IOException -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0102, blocks: (B:39:0x00eb, B:41:0x00f5, B:50:0x010f, B:57:0x0120, B:56:0x011c), top: B:73:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.core.okio.f] */
    /* JADX WARN: Type inference failed for: r0v4, types: [okio.v] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v1, types: [okio.r0] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [okio.v] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.core.r0
    @Nullable
    public Object b(@NotNull Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        b bVar;
        ?? r12;
        ?? r11;
        ?? r10;
        Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3;
        okio.r0 r0Var;
        kotlinx.coroutines.sync.a aVar;
        okio.r0 r0Var2;
        h hVar;
        Throwable th2;
        androidx.datastore.core.e eVar;
        f<T> fVar;
        kotlinx.coroutines.sync.a aVar2;
        okio.r0 r0Var3;
        if (dVar instanceof b) {
            b bVar2 = (b) dVar;
            int i10 = bVar2.f49756g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f49756g = i10 - Integer.MIN_VALUE;
                bVar = bVar2;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f49754e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f49756g;
        try {
            try {
                try {
                    try {
                        try {
                            if (i11 == 0) {
                                ResultKt.m(obj);
                                f();
                                okio.r0 r0VarX = this.f49738b.x();
                                if (r0VarX == null) {
                                    throw new IllegalStateException("must have a parent path");
                                }
                                this.f49737a.k(r0VarX, false);
                                kotlinx.coroutines.sync.a aVar3 = this.f49743g;
                                bVar.f49750a = this;
                                bVar.f49751b = function2;
                                bVar.f49752c = r0VarX;
                                bVar.f49753d = aVar3;
                                bVar.f49756g = 1;
                                if (aVar3.h(null, bVar) != objL) {
                                    function3 = function2;
                                    r0Var = r0VarX;
                                    aVar = aVar3;
                                }
                                return objL;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                eVar = (androidx.datastore.core.e) bVar.f49753d;
                                okio.r0 r0Var4 = (Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>) ((okio.r0) bVar.f49752c);
                                kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) bVar.f49751b;
                                fVar = (f) bVar.f49750a;
                                try {
                                    ResultKt.m(obj);
                                    aVar2 = aVar4;
                                    r0Var3 = r0Var4;
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
                                    if (fVar.f49737a.w(r0Var3)) {
                                        fVar.f49737a.g(r0Var3, fVar.f49738b);
                                    }
                                    Unit unit2 = Unit.f312394a;
                                    aVar2.i(null);
                                    return unit2;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    try {
                                        eVar.close();
                                        throw th2;
                                    } catch (Throwable th5) {
                                        p.a(th2, th5);
                                        throw th2;
                                    }
                                }
                            }
                            kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) bVar.f49753d;
                            r0Var = (okio.r0) bVar.f49752c;
                            Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function4 = (Function2) bVar.f49751b;
                            f<T> fVar2 = (f) bVar.f49750a;
                            ResultKt.m(obj);
                            aVar = aVar5;
                            this = fVar2;
                            function3 = function4;
                            bVar.f49750a = this;
                            bVar.f49751b = aVar;
                            bVar.f49752c = r0Var2;
                            bVar.f49753d = hVar;
                            bVar.f49756g = 2;
                            if (function3.invoke(hVar, bVar) != objL) {
                                fVar = this;
                                aVar2 = aVar;
                                eVar = hVar;
                                r0Var3 = r0Var2;
                                Unit unit3 = Unit.f312394a;
                                eVar.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (fVar.f49737a.w(r0Var3)) {
                                    fVar.f49737a.g(r0Var3, fVar.f49738b);
                                }
                                Unit unit4 = Unit.f312394a;
                                aVar2.i(null);
                                return unit4;
                            }
                            return objL;
                        } catch (Throwable th6) {
                            th2 = th6;
                            eVar = hVar;
                            eVar.close();
                            throw th2;
                        }
                        this.f49737a.r(r0Var2, false);
                        hVar = new h(this.f49737a, r0Var2, this.f49739c);
                    } catch (IOException e10) {
                        r10 = this;
                        e = e10;
                        r11 = r0Var2;
                        if (!r10.f49737a.w(r11)) {
                            throw e;
                        }
                        try {
                            r10.f49737a.q(r11);
                            throw e;
                        } catch (IOException unused) {
                            throw e;
                        }
                    }
                    r0Var2 = (Function2<? super w0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>) r0Var.D(this.f49738b.t() + ".tmp");
                } catch (Throwable th7) {
                    th = th7;
                    r12 = obj;
                    r12.i(null);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                r10 = bVar;
                r11 = function2;
            }
        } catch (Throwable th8) {
            th = th8;
            r12 = objL;
            r12.i(null);
            throw th;
        }
    }

    @Override // androidx.datastore.core.r0
    @NotNull
    public w c() {
        return this.f49740d;
    }

    @Override // androidx.datastore.core.e
    public void close() {
        this.f49742f.b(true);
        this.f49741e.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    @Override // androidx.datastore.core.r0
    @Nullable
    public <R> Object e(@NotNull n<? super j0<T>, ? super Boolean, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) throws Throwable {
        a aVar;
        Throwable th2;
        androidx.datastore.core.e eVar;
        f<T> fVar;
        boolean z10;
        ?? r12;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f49749f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f49749f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        ?? r13 = aVar.f49747d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f49749f;
        try {
            if (i11 == 0) {
                ResultKt.m(r13);
                f();
                boolean zC = kotlinx.coroutines.sync.a.C2318a.c(this.f49743g, null, 1, null);
                c cVar = new c(this.f49737a, this.f49738b, this.f49739c);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zC);
                    aVar.f49744a = this;
                    aVar.f49745b = cVar;
                    aVar.f49746c = zC;
                    aVar.f49749f = 1;
                    Object objInvoke = nVar.invoke(cVar, boolA, aVar);
                    if (objInvoke == objL) {
                        return objL;
                    }
                    fVar = this;
                    z10 = zC ? 1 : 0;
                    r12 = objInvoke;
                    eVar = cVar;
                    eVar.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z10) {
                        kotlinx.coroutines.sync.a.C2318a.d(fVar.f49743g, null, 1, null);
                    }
                    return r12;
                } catch (Throwable th3) {
                    th2 = th3;
                    eVar = cVar;
                    r13 = zC;
                    eVar.close();
                    throw th2;
                }
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f49746c;
            eVar = (androidx.datastore.core.e) aVar.f49745b;
            fVar = (f) aVar.f49744a;
            try {
                ResultKt.m(r13);
                r12 = r13;
                try {
                    eVar.close();
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (th != null) {
                    if (z10) {
                        kotlinx.coroutines.sync.a.C2318a.d(fVar.f49743g, null, 1, null);
                    }
                    return r12;
                }
                try {
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    r13 = z10;
                    this = fVar;
                }
            } catch (Throwable th6) {
                r13 = z10 ? 1 : 0;
                this = fVar;
                th2 = th6;
                try {
                    eVar.close();
                } catch (Throwable th7) {
                    p.a(th2, th7);
                }
                throw th2;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (r13 != 0) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f49743g, null, 1, null);
        }
        throw th;
    }
}
