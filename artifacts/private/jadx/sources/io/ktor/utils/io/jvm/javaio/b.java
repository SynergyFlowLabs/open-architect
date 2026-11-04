package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.a0;
import io.ktor.utils.io.h;
import io.ktor.utils.io.o0;
import java.io.EOFException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.io.c0;
import kotlinx.io.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ui.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f296909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f296910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private a0 f296911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.b f296912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f296913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f296914g;

    @f(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "awaitContent", n = {"min"}, s = {"I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296916b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296918d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296916b = obj;
            this.f296918d |= Integer.MIN_VALUE;
            return b.this.f(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.b$b, reason: collision with other inner class name */
    @f(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2103b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296919a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f296921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2103b(int i10, kotlin.coroutines.d<? super C2103b> dVar) {
            super(2, dVar);
            this.f296921c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C2103b(this.f296921c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296919a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            long jHd = 0;
            while (l.j(b.this.f296912e) < this.f296921c && jHd >= 0) {
                try {
                    jHd = b.this.f296909b.hd(b.this.f296912e, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    jHd = -1;
                }
            }
            if (jHd == -1) {
                b.this.f296909b.close();
                b.this.h().complete();
                b.this.f296911d = new a0(null);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2103b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(@NotNull p source, @NotNull CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f296909b = source;
        this.f296910c = parent;
        this.f296912e = new kotlinx.io.b();
        kotlinx.coroutines.a0 a0VarA = s2.a((p2) parent.get(p2.M2));
        this.f296913f = a0VarA;
        this.f296914g = parent.plus(a0VarA).plus(new r0("RawSourceChannel"));
    }

    @o0
    public static /* synthetic */ void i() {
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        String message;
        String message2;
        if (this.f296911d != null) {
            return;
        }
        kotlinx.coroutines.a0 a0Var = this.f296913f;
        String str = "Channel was cancelled";
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        s2.g(a0Var, message, th2);
        this.f296909b.close();
        if (th2 != null && (message2 = th2.getMessage()) != null) {
            str = message2;
        }
        this.f296911d = new a0(new IOException(str, th2));
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        a0 a0Var = this.f296911d;
        if (a0Var != null) {
            return a0.c(a0Var, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // io.ktor.utils.io.h
    @Nullable
    public Object f(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f296918d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f296918d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f296916b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar.f296918d;
        if (i12 == 0) {
            ResultKt.m(obj);
            if (this.f296911d != null) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            CoroutineContext coroutineContext = this.f296914g;
            C2103b c2103b = new C2103b(i10, null);
            aVar.f296915a = i10;
            aVar.f296918d = 1;
            if (i.h(coroutineContext, c2103b, aVar) == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = aVar.f296915a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(l.j(this.f296912e) >= ((long) i10));
    }

    @NotNull
    public final CoroutineContext g() {
        return this.f296914g;
    }

    @NotNull
    public final kotlinx.coroutines.a0 h() {
        return this.f296913f;
    }

    @Override // io.ktor.utils.io.h
    @NotNull
    public c0 j() {
        return this.f296912e;
    }

    @Override // io.ktor.utils.io.h
    public boolean k() {
        if (this.f296911d == null || !this.f296912e.y1()) {
            return false;
        }
        int i10 = 6 | 1;
        return true;
    }
}
