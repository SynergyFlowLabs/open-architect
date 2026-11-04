package io.ktor.client.statement;

import androidx.core.app.w;
import fi.y;
import io.ktor.client.plugins.q;
import io.ktor.client.utils.i;
import io.sentry.protocol.n;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.p2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 2 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 3 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,188:1\n308#2,4:189\n308#2,2:193\n310#2,2:214\n308#2,2:216\n310#2,2:237\n308#2,4:239\n308#2,4:243\n162#3:195\n162#3:218\n65#4,18:196\n65#4,18:219\n*S KotlinDebug\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n*L\n53#1:189,4\n91#1:193,2\n91#1:214,2\n131#1:216,2\n131#1:237,2\n146#1:239,4\n159#1:243,4\n94#1:195\n134#1:218\n94#1:196,18\n134#1:219,18\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y f295347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.c f295348b;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {182}, m = "cleanup", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295350b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295352d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295350b = obj;
            this.f295352d |= Integer.MIN_VALUE;
            return g.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 1}, l = {54, com.planner5d.library.engine.input.f.b.f160707m, com.planner5d.library.engine.input.f.b.D0, com.planner5d.library.engine.input.f.b.D0}, m = "execute", n = {"block", n.f306405g}, s = {"L$0", "L$0"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295354b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295356d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295354b = obj;
            this.f295356d |= Integer.MIN_VALUE;
            return g.this.e(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {1, 2}, l = {161, 162, 163}, m = "fetchResponse", n = {w.E0, "result"}, s = {"L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295358b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295360d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295358b = obj;
            this.f295360d |= Integer.MIN_VALUE;
            return g.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {150}, m = "fetchStreamingResponse", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295361a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295363c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295361a = obj;
            this.f295363c |= Integer.MIN_VALUE;
            return g.this.g(this);
        }
    }

    public g(@NotNull y builder, @NotNull io.ktor.client.c client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f295347a = builder;
        this.f295348b = client;
    }

    @a1
    public static /* synthetic */ void i() {
    }

    public final /* synthetic */ <T> Object a(kotlin.coroutines.d<? super T> dVar) throws Throwable {
        try {
            h0.e(3);
            h0.e(0);
            boolean z10 = false | false;
            Object objG = g(null);
            h0.e(1);
            io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) objG;
            try {
                h0.e(3);
                io.ktor.client.call.b bVarH = cVar.h();
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                kotlin.reflect.d dVarD = j1.d(Object.class);
                try {
                    Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
                } catch (Throwable unused) {
                }
                ri.b bVar = new ri.b(dVarD, null);
                h0.e(0);
                Object objE = bVarH.e(bVar, null);
                h0.e(1);
                Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
                h0.d(1);
                e.e(cVar);
                h0.c(1);
                return objE;
            } catch (Throwable th2) {
                h0.d(1);
                e.e(cVar);
                h0.c(1);
                throw th2;
            }
        } catch (CancellationException e10) {
            throw i.a(e10);
        }
    }

    public final /* synthetic */ <T, R> Object b(Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super R> dVar) throws Throwable {
        try {
            h0.e(3);
            h0.e(0);
            Object objG = g(null);
            h0.e(1);
            io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) objG;
            try {
                h0.e(3);
                io.ktor.client.call.b bVarH = cVar.h();
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                kotlin.reflect.d dVarD = j1.d(Object.class);
                try {
                    Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
                } catch (Throwable unused) {
                }
                ri.b bVar = new ri.b(dVarD, null);
                h0.e(0);
                Object objE = bVarH.e(bVar, null);
                h0.e(1);
                Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
                h0.e(3);
                Object objInvoke = function2.invoke(objE, null);
                h0.d(1);
                h0.e(3);
                h0.e(0);
                c(cVar, null);
                h0.e(1);
                return objInvoke;
            } finally {
                h0.d(1);
                h0.e(3);
                h0.e(0);
                c(cVar, null);
                h0.e(1);
                h0.c(1);
            }
        } catch (CancellationException e10) {
            throw i.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @a1
    @Nullable
    public final Object c(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f295352d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f295352d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f295350b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f295352d;
        if (i11 == 0) {
            ResultKt.m(obj);
            CoroutineContext.Element element = cVar.getCoroutineContext().get(p2.M2);
            Intrinsics.checkNotNull(element);
            a0 a0Var = (a0) element;
            a0Var.complete();
            try {
                io.ktor.utils.io.i.a(cVar.c());
            } catch (Throwable unused) {
            }
            aVar.f295349a = a0Var;
            aVar.f295352d = 1;
            if (a0Var.d1(aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Nullable
    public final Object d(@NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        return f(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final <T> Object e(@NotNull Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
        b bVar;
        io.ktor.client.statement.c cVar;
        io.ktor.client.statement.c cVar2;
        Throwable th2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f295356d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f295356d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objG = bVar.f295354b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f295356d;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(objG);
                    bVar.f295353a = function2;
                    bVar.f295356d = 1;
                    objG = g(bVar);
                    if (objG == objL) {
                    }
                }
                if (i11 == 1) {
                    function2 = (Function2) bVar.f295353a;
                    ResultKt.m(objG);
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            Object obj = bVar.f295353a;
                            ResultKt.m(objG);
                            return obj;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) bVar.f295353a;
                        ResultKt.m(objG);
                        throw th2;
                    }
                    cVar2 = (io.ktor.client.statement.c) bVar.f295353a;
                    try {
                        ResultKt.m(objG);
                        bVar.f295353a = objG;
                        bVar.f295356d = 3;
                        return c(cVar2, bVar) == objL ? objL : objG;
                    } catch (Throwable th3) {
                        cVar = cVar2;
                        th = th3;
                        bVar.f295353a = th;
                        bVar.f295356d = 4;
                        if (c(cVar, bVar) != objL) {
                            th2 = th;
                            throw th2;
                        }
                    }
                }
                bVar.f295353a = cVar;
                bVar.f295356d = 2;
                Object objInvoke = function2.invoke(cVar, bVar);
                if (objInvoke != objL) {
                    objG = objInvoke;
                    cVar2 = cVar;
                    bVar.f295353a = objG;
                    bVar.f295356d = 3;
                    if (c(cVar2, bVar) == objL) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bVar.f295353a = th;
                bVar.f295356d = 4;
                if (c(cVar, bVar) != objL) {
                    th2 = th;
                    throw th2;
                }
            }
            cVar = (io.ktor.client.statement.c) objG;
        } catch (CancellationException e10) {
            throw i.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @a1
    @Nullable
    public final Object f(@NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws Throwable {
        c cVar;
        io.ktor.client.call.b bVar;
        io.ktor.client.statement.c cVarK;
        io.ktor.client.statement.c cVarK2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f295360d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f295360d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objL = cVar.f295358b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f295360d;
        int i12 = 3 << 2;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                y yVarR = new y().r(this.f295347a);
                io.ktor.client.c cVar2 = this.f295348b;
                cVar.f295360d = 1;
                objL = cVar2.l(yVarR, cVar);
                if (objL == objL2) {
                }
                return objL2;
            }
            if (i11 == 1) {
                ResultKt.m(objL);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    io.ktor.client.statement.c cVar3 = (io.ktor.client.statement.c) cVar.f295357a;
                    ResultKt.m(objL);
                    return cVar3;
                }
                bVar = (io.ktor.client.call.b) cVar.f295357a;
                ResultKt.m(objL);
            }
            cVarK = ((io.ktor.client.call.b) objL).k();
            cVarK2 = bVar.k();
            cVar.f295357a = cVarK;
            cVar.f295360d = 3;
            if (c(cVarK2, cVar) != objL2) {
                return cVarK;
            }
            return objL2;
            bVar = (io.ktor.client.call.b) objL;
            cVar.f295357a = bVar;
            cVar.f295360d = 2;
            objL = io.ktor.client.call.f.a(bVar, cVar);
            if (objL != objL2) {
                cVarK = ((io.ktor.client.call.b) objL).k();
                cVarK2 = bVar.k();
                cVar.f295357a = cVarK;
                cVar.f295360d = 3;
                if (c(cVarK2, cVar) != objL2) {
                    return cVarK;
                }
            }
            return objL2;
        } catch (CancellationException e10) {
            throw i.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @a1
    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f295363c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f295363c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objL = dVar2.f295361a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f295363c;
        try {
            if (i11 == 0) {
                ResultKt.m(objL);
                y yVarR = new y().r(this.f295347a);
                q.h(yVarR);
                io.ktor.client.c cVar = this.f295348b;
                dVar2.f295363c = 1;
                objL = cVar.l(yVarR, dVar2);
                if (objL == objL2) {
                    return objL2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objL);
            }
            return ((io.ktor.client.call.b) objL).k();
        } catch (CancellationException e10) {
            throw i.a(e10);
        }
    }

    @NotNull
    public final io.ktor.client.c h() {
        return this.f295348b;
    }

    @NotNull
    public String toString() {
        return "HttpStatement[" + this.f295347a.i() + AbstractJsonLexerKt.END_LIST;
    }
}
