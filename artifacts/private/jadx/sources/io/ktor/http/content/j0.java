package io.ktor.http.content;

import io.ktor.http.l1;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends w.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Writer, kotlin.coroutines.d<? super Unit>, Object> f295723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.m f295724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final l1 f295725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f295726e;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f295728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.p f295729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Charset f295730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f295731e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.p pVar, Charset charset, j0 j0Var, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f295729c = pVar;
            this.f295730d = charset;
            this.f295731e = j0Var;
            int i10 = 5 | 1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f295729c, this.f295730d, this.f295731e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Throwable th2;
            Closeable closeable;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295728b;
            if (i10 == 0) {
                ResultKt.m(obj);
                Writer writerC = io.ktor.util.cio.j.c(this.f295729c, this.f295730d);
                try {
                    Function2 function2 = this.f295731e.f295723b;
                    this.f295727a = writerC;
                    this.f295728b = 1;
                    if (function2.invoke(writerC, this) == objL) {
                        return objL;
                    }
                    closeable = writerC;
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = writerC;
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f295727a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        throw th2;
                    } catch (Throwable th5) {
                        kotlin.io.c.a(closeable, th2);
                        throw th5;
                    }
                }
            }
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(closeable, null);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ j0(Function2 function2, io.ktor.http.m mVar, l1 l1Var, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, mVar, (i10 & 4) != 0 ? null : l1Var, (i10 & 8) != 0 ? null : l10);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        return this.f295726e;
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public io.ktor.http.m b() {
        return this.f295724c;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295725d;
    }

    @Override // io.ktor.http.content.w.f
    @Nullable
    public Object h(@NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Charset charsetA = io.ktor.http.o.a(b());
        if (charsetA == null) {
            charsetA = Charsets.UTF_8;
        }
        Object objF = b.f(new a(pVar, charsetA, this, null), dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@NotNull Function2<? super Writer, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> body, @NotNull io.ktor.http.m contentType, @Nullable l1 l1Var, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f295723b = body;
        this.f295724c = contentType;
        this.f295725d = l1Var;
        this.f295726e = l10;
    }
}
