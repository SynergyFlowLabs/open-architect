package io.ktor.utils.io;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f297171a;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0}, l = {42}, m = "awaitAtLeast", n = {"min"}, s = {"I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297173b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f297175d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297173b = obj;
            this.f297175d |= Integer.MIN_VALUE;
            return w0.this.b(0, this);
        }
    }

    public w0(@NotNull h channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f297171a = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteBuffer e(kotlinx.io.c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ByteBuffer.wrap(kotlinx.io.g0.c(it));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object b(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f297175d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f297175d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f297173b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = aVar.f297175d;
        if (i12 == 0) {
            ResultKt.m(obj);
            if (ui.l.j(this.f297171a.j()) >= i10) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            h hVar = this.f297171a;
            aVar.f297172a = i10;
            aVar.f297175d = 1;
            if (hVar.f(i10, aVar) == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = aVar.f297172a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(ui.l.j(this.f297171a.j()) >= ((long) i10));
    }

    public final void c(int i10) throws EOFException {
        ui.l.g(this.f297171a.j(), i10);
    }

    @Nullable
    public final ByteBuffer d(int i10, int i11) {
        if (ui.l.j(this.f297171a.j()) < i11 + i10) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ui.l.m(this.f297171a.j(), new Function1() { // from class: io.ktor.utils.io.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.e((kotlinx.io.c0) obj);
            }
        });
        if (i10 > 0) {
            byteBuffer.position(byteBuffer.position() + i10);
        }
        return byteBuffer;
    }
}
