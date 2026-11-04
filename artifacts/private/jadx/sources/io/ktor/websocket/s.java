package io.ktor.websocket;

import io.ktor.util.a1;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializer.kt\nio/ktor/websocket/Serializer\n+ 2 Utils.kt\nio/ktor/websocket/UtilsKt__UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n14#2:128\n14#2:129\n14#2:130\n14#2:131\n14#2:132\n1#3:133\n*S KotlinDebug\n*F\n+ 1 Serializer.kt\nio/ktor/websocket/Serializer\n*L\n75#1:128\n76#1:129\n77#1:130\n78#1:131\n82#1:132\n*E\n"})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayBlockingQueue<e> f297454a = new ArrayBlockingQueue<>(1024);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private ByteBuffer f297455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ByteBuffer f297456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private i f297457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f297458e;

    private final int b(e eVar, boolean z10) {
        int i10;
        int iRemaining = eVar.c().remaining();
        if (iRemaining < 126) {
            i10 = 2;
        } else {
            i10 = iRemaining <= 32767 ? 4 : 10;
        }
        return i10 + f(z10);
    }

    private final int f(boolean z10) {
        return z10 ? 4 : 0;
    }

    private final ByteBuffer g(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f297456c;
        if (byteBuffer2 != null) {
            ByteBuffer byteBufferC = a1.c(byteBuffer, 0, 1, null);
            u.d(byteBufferC, byteBuffer2);
            if (byteBufferC != null) {
                return byteBufferC;
            }
        }
        return byteBuffer;
    }

    private final void i(e eVar, ByteBuffer byteBuffer, boolean z10) {
        int iQ;
        ByteBuffer byteBufferDuplicate;
        int iRemaining = eVar.c().remaining();
        if (iRemaining >= 126) {
            iRemaining = iRemaining <= 65535 ? 126 : 127;
        }
        i iVar = this.f297457d;
        if (iVar == null) {
            if (!eVar.f()) {
                this.f297457d = eVar.g();
            }
            iQ = eVar.g().q();
        } else if (iVar == eVar.g()) {
            if (eVar.f()) {
                this.f297457d = null;
            }
            iQ = 0;
        } else {
            if (!eVar.g().o()) {
                throw new IllegalStateException("Can't continue with different data frame opcode");
            }
            iQ = eVar.g().q();
        }
        byteBuffer.put((byte) (iQ | (eVar.f() ? 128 : 0) | (eVar.h() ? 64 : 0) | (eVar.i() ? 32 : 0) | (eVar.j() ? 16 : 0)));
        byteBuffer.put((byte) ((z10 ? 128 : 0) | iRemaining));
        if (iRemaining == 126) {
            byteBuffer.putShort((short) eVar.c().remaining());
        } else if (iRemaining == 127) {
            byteBuffer.putLong(eVar.c().remaining());
        }
        ByteBuffer byteBuffer2 = this.f297456c;
        if (byteBuffer2 != null && (byteBufferDuplicate = byteBuffer2.duplicate()) != null) {
            a1.h(byteBufferDuplicate, byteBuffer, 0, 2, null);
        }
    }

    private final void j(boolean z10) {
        ByteBuffer byteBufferAllocate;
        if (z10) {
            byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.putInt(kotlin.random.f.f312895a.l());
            byteBufferAllocate.clear();
        } else {
            byteBufferAllocate = null;
        }
        this.f297456c = byteBufferAllocate;
    }

    private final boolean l(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f297455b;
        if (byteBuffer2 == null) {
            return true;
        }
        a1.h(byteBuffer2, byteBuffer, 0, 2, null);
        if (byteBuffer2.hasRemaining()) {
            return false;
        }
        this.f297455b = null;
        return true;
    }

    public final void a(@NotNull e f10) throws InterruptedException {
        Intrinsics.checkNotNullParameter(f10, "f");
        this.f297454a.put(f10);
    }

    public final boolean c() {
        return (this.f297454a.isEmpty() && this.f297455b == null) ? false : true;
    }

    public final boolean d() {
        return this.f297458e;
    }

    public final int e() {
        return this.f297454a.remainingCapacity();
    }

    public final void h(@NotNull ByteBuffer buffer) {
        e eVarPeek;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (l(buffer) && (eVarPeek = this.f297454a.peek()) != null) {
            boolean z10 = this.f297458e;
            j(z10);
            if (buffer.remaining() < b(eVarPeek, z10)) {
                return;
            }
            i(eVarPeek, buffer, z10);
            this.f297454a.remove();
            this.f297455b = g(eVarPeek.c());
        }
    }

    public final void k(boolean z10) {
        this.f297458e = z10;
    }
}
