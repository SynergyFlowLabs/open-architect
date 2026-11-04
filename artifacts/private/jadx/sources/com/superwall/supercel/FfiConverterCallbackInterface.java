package com.superwall.supercel;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FfiConverterCallbackInterface<CallbackInterface> implements FfiConverter<CallbackInterface, Long> {

    @NotNull
    private final UniffiHandleMap<CallbackInterface> handleMap = new UniffiHandleMap<>();

    @Override // com.superwall.supercel.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public long mo84allocationSizeI7RO_PI(@NotNull CallbackInterface value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return 8L;
    }

    public final void drop$supercel_release(long j10) throws InternalException {
        this.handleMap.remove(j10);
    }

    @NotNull
    public final UniffiHandleMap<CallbackInterface> getHandleMap$supercel_release() {
        return this.handleMap;
    }

    @Override // com.superwall.supercel.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(Long l10) {
        return lift(l10.longValue());
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public CallbackInterface liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (CallbackInterface) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull CallbackInterface callbackinterface) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, callbackinterface);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public CallbackInterface read(@NotNull ByteBuffer buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        return lift(buf.getLong());
    }

    @Override // com.superwall.supercel.FfiConverter
    public void write(@NotNull CallbackInterface value, @NotNull ByteBuffer buf) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buf, "buf");
        buf.putLong(lower((Object) value).longValue());
    }

    @NotNull
    public CallbackInterface lift(long j10) {
        return this.handleMap.get(j10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public Long lower(@NotNull CallbackInterface value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Long.valueOf(this.handleMap.insert(value));
    }
}
