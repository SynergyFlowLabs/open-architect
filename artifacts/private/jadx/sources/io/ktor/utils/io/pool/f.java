package io.ktor.utils.io.pool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends d<ByteBuffer> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f297138g;

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.d
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    public final int l() {
        return this.f297138g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.d
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ByteBuffer d() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f297138g);
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.f297138g) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public /* synthetic */ f(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 2000 : i10, (i12 & 2) != 0 ? 4096 : i11);
    }

    public f(int i10, int i11) {
        super(i10);
        this.f297138g = i11;
    }
}
