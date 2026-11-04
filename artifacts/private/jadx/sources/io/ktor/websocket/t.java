package io.ktor.websocket;

import io.ktor.util.a1;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSimpleFrameCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFrameCollector.kt\nio/ktor/websocket/SimpleFrameCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f297467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private ByteBuffer f297468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f297469c = ByteBuffer.allocate(4);

    public final boolean a() {
        return this.f297467a > 0;
    }

    public final void b(@NotNull ByteBuffer bb2) {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        int i10 = this.f297467a;
        ByteBuffer byteBuffer = this.f297468b;
        Intrinsics.checkNotNull(byteBuffer);
        this.f297467a = i10 - a1.g(bb2, byteBuffer, this.f297467a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final void c(int i10, @NotNull ByteBuffer bb2) {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        if (this.f297467a != 0) {
            throw new IllegalStateException("remaining should be 0");
        }
        this.f297467a = i10;
        ByteBuffer byteBuffer = this.f297468b;
        if (byteBuffer != null) {
            Intrinsics.checkNotNull(byteBuffer);
            if (byteBuffer.capacity() < i10) {
                this.f297468b = ByteBuffer.allocate(i10);
            }
        } else {
            this.f297468b = ByteBuffer.allocate(i10);
        }
        ByteBuffer byteBuffer2 = this.f297468b;
        Intrinsics.checkNotNull(byteBuffer2);
        byteBuffer2.clear();
        b(bb2);
    }

    @NotNull
    public final ByteBuffer d(@Nullable Integer num) {
        ByteBuffer byteBuffer = this.f297468b;
        Intrinsics.checkNotNull(byteBuffer);
        byteBuffer.flip();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        if (num != null) {
            this.f297469c.clear();
            this.f297469c.asIntBuffer().put(num.intValue());
            this.f297469c.clear();
            Intrinsics.checkNotNull(byteBufferSlice);
            ByteBuffer maskBuffer = this.f297469c;
            Intrinsics.checkNotNullExpressionValue(maskBuffer, "maskBuffer");
            u.d(byteBufferSlice, maskBuffer);
        }
        this.f297468b = null;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferSlice.asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "run(...)");
        return byteBufferAsReadOnlyBuffer;
    }
}
