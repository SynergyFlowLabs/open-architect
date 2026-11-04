package io.ktor.client.statement;

import fi.w;
import io.ktor.http.i1;
import io.ktor.utils.io.o0;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.ResultKt;
import kotlin.a1;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.l;
import kotlin.reflect.s;
import kotlin.text.Charsets;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.p2;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,146:1\n162#2:147\n162#2:166\n162#2:185\n65#3,18:148\n65#3,18:167\n65#3,18:186\n*S KotlinDebug\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n*L\n125#1:147\n135#1:166\n145#1:185\n125#1:148,18\n135#1:167,18\n145#1:186,18\n*E\n"})
public final class e {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "bodyAsBytes", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295334b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295333a = obj;
            this.f295334b |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "bodyAsChannel", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f295335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295336b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295335a = obj;
            this.f295336b |= Integer.MIN_VALUE;
            return e.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f295339c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295338b = obj;
            this.f295339c |= Integer.MIN_VALUE;
            return e.c(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final Object a(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        a aVar;
        s sVarA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f295334b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f295334b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE = aVar.f295333a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f295334b;
        if (i11 == 0) {
            ResultKt.m(objE);
            io.ktor.client.call.b bVarH = cVar.h();
            kotlin.reflect.d dVarD = j1.d(byte[].class);
            try {
                sVarA = j1.A(byte[].class);
            } catch (Throwable unused) {
                sVarA = null;
            }
            ri.b bVar = new ri.b(dVarD, sVarA);
            aVar.f295334b = 1;
            objE = bVarH.e(bVar, aVar);
            if (objE == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objE);
        }
        if (objE != null) {
            return (byte[]) objE;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object b(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super io.ktor.utils.io.h> dVar) {
        b bVar;
        s sVarA;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f295336b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f295336b = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f295335a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f295336b;
        if (i11 == 0) {
            ResultKt.m(objE);
            io.ktor.client.call.b bVarH = cVar.h();
            kotlin.reflect.d dVarD = j1.d(io.ktor.utils.io.h.class);
            try {
                sVarA = j1.A(io.ktor.utils.io.h.class);
            } catch (Throwable unused) {
                sVarA = null;
            }
            ri.b bVar2 = new ri.b(dVarD, sVarA);
            bVar.f295336b = 1;
            objE = bVarH.e(bVar2, bVar);
            if (objE == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objE);
        }
        if (objE != null) {
            return (io.ktor.utils.io.h) objE;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object c(@NotNull io.ktor.client.statement.c cVar, @NotNull Charset charset, @NotNull kotlin.coroutines.d<? super String> dVar) {
        c cVar2;
        s sVarA;
        CharsetDecoder charsetDecoder;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f295339c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f295339c = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object objE = cVar2.f295338b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f295339c;
        if (i11 == 0) {
            ResultKt.m(objE);
            Charset charsetB = i1.b(cVar);
            if (charsetB != null) {
                charset = charsetB;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            io.ktor.client.call.b bVarH = cVar.h();
            kotlin.reflect.d dVarD = j1.d(c0.class);
            try {
                sVarA = j1.A(c0.class);
            } catch (Throwable unused) {
                sVarA = null;
            }
            ri.b bVar = new ri.b(dVarD, sVarA);
            cVar2.f295337a = charsetDecoderNewDecoder;
            cVar2.f295339c = 1;
            objE = bVarH.e(bVar, cVar2);
            if (objE == objL) {
                return objL;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charsetDecoder = (CharsetDecoder) cVar2.f295337a;
            ResultKt.m(objE);
        }
        if (objE == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
        }
        Intrinsics.checkNotNull(charsetDecoder);
        return ti.b.b(charsetDecoder, (c0) objE, 0, 2, null);
    }

    public static /* synthetic */ Object d(io.ktor.client.statement.c cVar, Charset charset, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return c(cVar, charset, dVar);
    }

    @o0
    @a1
    public static final void e(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        CoroutineContext.Element element = cVar.getCoroutineContext().get(p2.M2);
        Intrinsics.checkNotNull(element);
        ((a0) element).complete();
    }

    @NotNull
    public static final io.ktor.utils.io.h f(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.c();
    }

    @o0
    @l(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @b1(expression = "readRawBytes()", imports = {}))
    public static /* synthetic */ void g(io.ktor.client.statement.c cVar) {
    }

    @NotNull
    public static final w h(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.h().j();
    }
}
