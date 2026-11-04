package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSourceByteReadChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceByteReadChannel.kt\nio/ktor/utils/io/SourceByteReadChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class c1 implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.c0 f296869b;

    @Nullable
    private volatile a0 closed;

    public c1(@NotNull kotlinx.io.c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f296869b = source;
    }

    @o0
    public static /* synthetic */ void a() {
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        String message;
        if (this.closed != null) {
            return;
        }
        this.f296869b.close();
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new a0(new IOException(message, th2));
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        a0 a0Var = this.closed;
        if (a0Var != null) {
            return a0.c(a0Var, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.h
    @Nullable
    public Object f(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
        Throwable thE = e();
        if (thE == null) {
            return kotlin.coroutines.jvm.internal.b.a(this.f296869b.request(i10));
        }
        throw thE;
    }

    @Override // io.ktor.utils.io.h
    @NotNull
    public kotlinx.io.c0 j() throws Throwable {
        Throwable thE = e();
        if (thE == null) {
            return this.f296869b.n();
        }
        throw thE;
    }

    @Override // io.ktor.utils.io.h
    public boolean k() {
        return this.f296869b.y1();
    }
}
