package com.superwall.supercel;

import com.sun.jna.Pointer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeHostContext implements FfiConverter<HostContext, Pointer> {

    @NotNull
    public static final FfiConverterTypeHostContext INSTANCE = new FfiConverterTypeHostContext();

    @NotNull
    private static final UniffiHandleMap<HostContext> handleMap = new UniffiHandleMap<>();

    private FfiConverterTypeHostContext() {
    }

    @Override // com.superwall.supercel.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public long mo84allocationSizeI7RO_PI(@NotNull HostContext value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return 8L;
    }

    @NotNull
    public final UniffiHandleMap<HostContext> getHandleMap$supercel_release() {
        return handleMap;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public HostContext liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (HostContext) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull HostContext hostContext) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, hostContext);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public HostContext lift(@NotNull Pointer value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new HostContextImpl(value);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public Pointer lower(@NotNull HostContext value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Pointer(handleMap.insert(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public HostContext read(@NotNull ByteBuffer buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        return lift(new Pointer(buf.getLong()));
    }

    @Override // com.superwall.supercel.FfiConverter
    public void write(@NotNull HostContext value, @NotNull ByteBuffer buf) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buf, "buf");
        buf.putLong(Pointer.nativeValue(lower(value)));
    }
}
