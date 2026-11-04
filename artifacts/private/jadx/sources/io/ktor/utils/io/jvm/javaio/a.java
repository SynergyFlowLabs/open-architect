package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.h;
import io.ktor.utils.io.i;
import io.ktor.utils.io.k;
import io.ktor.utils.io.p;
import io.ktor.utils.io.t;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f296896a;

        /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$b$a, reason: collision with other inner class name */
        @f(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$close$1", f = "Blocking.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        static final class C2101a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f296898b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2101a(p pVar, kotlin.coroutines.d<? super C2101a> dVar) {
                super(2, dVar);
                this.f296898b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2101a(this.f296898b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296897a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    p pVar = this.f296898b;
                    this.f296897a = 1;
                    if (pVar.g(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2101a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$b$b, reason: collision with other inner class name */
        @f(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$flush$1", f = "Blocking.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        static final class C2102b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f296900b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2102b(p pVar, kotlin.coroutines.d<? super C2102b> dVar) {
                super(2, dVar);
                this.f296900b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2102b(this.f296900b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296899a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    p pVar = this.f296900b;
                    this.f296899a = 1;
                    if (pVar.d(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2102b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @f(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$1", f = "Blocking.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f296902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f296903c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(p pVar, int i10, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f296902b = pVar;
                this.f296903c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f296902b, this.f296903c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296901a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    p pVar = this.f296902b;
                    byte b10 = (byte) this.f296903c;
                    this.f296901a = 1;
                    if (t.p(pVar, b10, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @f(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2", f = "Blocking.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f296905b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f296906c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f296907d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f296908e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(p pVar, byte[] bArr, int i10, int i11, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f296905b = pVar;
                this.f296906c = bArr;
                this.f296907d = i10;
                this.f296908e = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new d(this.f296905b, this.f296906c, this.f296907d, this.f296908e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296904a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    p pVar = this.f296905b;
                    byte[] bArr = this.f296906c;
                    int i11 = this.f296907d;
                    int i12 = this.f296908e + i11;
                    this.f296904a = 1;
                    if (t.t(pVar, bArr, i11, i12, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(p pVar) {
            this.f296896a = pVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws InterruptedException {
            j.b(null, new C2101a(this.f296896a, null), 1, null);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws InterruptedException {
            j.b(null, new C2102b(this.f296896a, null), 1, null);
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws InterruptedException {
            j.b(null, new c(this.f296896a, i10, null), 1, null);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b10, int i10, int i11) throws InterruptedException {
            Intrinsics.checkNotNullParameter(b10, "b");
            j.b(null, new d(this.f296896a, b10, i10, i11, null), 1, null);
        }
    }

    @NotNull
    public static final InputStream a(@NotNull h hVar, @Nullable p2 p2Var) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new C2099a(hVar);
    }

    public static /* synthetic */ InputStream b(h hVar, p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p2Var = null;
        }
        return a(hVar, p2Var);
    }

    @NotNull
    public static final OutputStream c(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new b(pVar);
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    public static final class C2099a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f296893a;

        /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.a$a$a, reason: collision with other inner class name */
        @f(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1", f = "Blocking.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        static final class C2100a extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f296894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f296895b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2100a(h hVar, kotlin.coroutines.d<? super C2100a> dVar) {
                super(2, dVar);
                this.f296895b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2100a(this.f296895b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f296894a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                h hVar = this.f296895b;
                this.f296894a = 1;
                Object objA = h.b.a(hVar, 0, this, 1, null);
                return objA == objL ? objL : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C2100a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        C2099a(h hVar) {
            this.f296893a = hVar;
        }

        private final void a() throws InterruptedException {
            j.b(null, new C2100a(this.f296893a, null), 1, null);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i.a(this.f296893a);
        }

        @Override // java.io.InputStream
        public int read() throws InterruptedException {
            if (this.f296893a.k()) {
                return -1;
            }
            if (this.f296893a.j().y1()) {
                a();
            }
            if (this.f296893a.k()) {
                return -1;
            }
            return this.f296893a.j().readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int i10, int i11) throws InterruptedException {
            Intrinsics.checkNotNullParameter(b10, "b");
            if (this.f296893a.k()) {
                return -1;
            }
            if (this.f296893a.j().y1()) {
                a();
            }
            int iRc = this.f296893a.j().Rc(b10, i10, Math.min(k.m(this.f296893a), i11) + i10);
            if (iRc >= 0) {
                return iRc;
            }
            return this.f296893a.k() ? -1 : 0;
        }
    }
}
