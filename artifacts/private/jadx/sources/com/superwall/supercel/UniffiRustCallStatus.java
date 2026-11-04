package com.superwall.supercel;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"code", "error_buf"})
public class UniffiRustCallStatus extends Structure {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    public byte code;

    @f
    @NotNull
    public RustBuffer.ByValue error_buf = new RustBuffer.ByValue();

    public static final class ByValue extends UniffiRustCallStatus implements Structure.ByValue {
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ByValue create(byte b10, @NotNull RustBuffer.ByValue errorBuf) {
            Intrinsics.checkNotNullParameter(errorBuf, "errorBuf");
            ByValue byValue = new ByValue();
            byValue.code = b10;
            byValue.error_buf = errorBuf;
            return byValue;
        }

        private Companion() {
        }
    }

    public final boolean isError() {
        return this.code == 1;
    }

    public final boolean isPanic() {
        return this.code == 2;
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }
}
