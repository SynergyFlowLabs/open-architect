package io.ktor.client.plugins;

import java.io.IOException;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    public static final class a extends io.ktor.http.content.w.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Long f294913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.ktor.http.m f294914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f294915d;

        a(fi.y yVar, io.ktor.http.m mVar, Object obj) {
            this.f294915d = obj;
            String str = yVar.O().get(io.ktor.http.d1.f295782a.z());
            this.f294913b = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            this.f294914c = mVar == null ? io.ktor.http.m.a.f295985a.l() : mVar;
        }

        @Override // io.ktor.http.content.w
        public Long a() {
            return this.f294913b;
        }

        @Override // io.ktor.http.content.w
        public io.ktor.http.m b() {
            return this.f294914c;
        }

        @Override // io.ktor.http.content.w.e
        public io.ktor.utils.io.h h() {
            return io.ktor.utils.io.jvm.javaio.c.d((InputStream) this.f294915d, null, null, 3, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294918c;

        public static final class a extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InputStream f294919a;

            a(InputStream inputStream) {
                this.f294919a = inputStream;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f294919a.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                this.f294919a.close();
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f294919a.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b10, int i10, int i11) {
                Intrinsics.checkNotNullParameter(b10, "b");
                return this.f294919a.read(b10, i10, i11);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294916a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294917b;
                io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.f294918c;
                ri.b bVarA = dVar.a();
                Object objB = dVar.b();
                if (!(objB instanceof io.ktor.utils.io.h)) {
                    return Unit.f312394a;
                }
                if (Intrinsics.areEqual(bVarA.b(), kotlin.jvm.internal.j1.d(InputStream.class))) {
                    io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(bVarA, new a(io.ktor.utils.io.jvm.javaio.a.a((io.ktor.utils.io.h) objB, (p2) ((io.ktor.client.call.b) eVar.f()).getCoroutineContext().get(p2.M2))));
                    this.f294917b = null;
                    this.f294916a = 1;
                    if (eVar.k(dVar2, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            b bVar = new b(dVar2);
            bVar.f294917b = eVar;
            bVar.f294918c = dVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final io.ktor.http.content.w a(@Nullable io.ktor.http.m mVar, @NotNull fi.y context, @NotNull Object body) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        if (body instanceof InputStream) {
            return new a(context, mVar, body);
        }
        return null;
    }

    public static final void b(@NotNull io.ktor.client.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.y().q(io.ktor.client.statement.f.f295340h.b(), new b(null));
    }
}
