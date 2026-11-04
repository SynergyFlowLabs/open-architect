package io.ktor.network.sockets;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<Throwable, Unit> f296353a = new Function1() { // from class: io.ktor.network.sockets.v
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return x.c((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<Throwable, Unit> f296354b = new Function1() { // from class: io.ktor.network.sockets.w
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return x.d((Throwable) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Throwable th2) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Throwable th2) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1<? super Throwable, Unit> function1) {
        String str;
        if (function1 == f296354b) {
            str = "Another handler was already registered and successfully invoked";
        } else {
            str = "Another handler was already registered: " + function1;
        }
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(kotlinx.io.c0 c0Var, ByteBuffer byteBuffer) {
        ui.k.d(c0Var, byteBuffer);
        byteBuffer.flip();
    }
}
