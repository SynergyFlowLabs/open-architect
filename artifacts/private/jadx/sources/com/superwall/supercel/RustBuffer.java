package com.superwall.supercel;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y1;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"capacity", "len", "data"})
public class RustBuffer extends Structure {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    public long capacity;

    @f
    @Nullable
    public Pointer data;

    @f
    public long len;

    public static final class ByReference extends RustBuffer implements Structure.ByReference {
    }

    public static final class ByValue extends RustBuffer implements Structure.ByValue {
    }

    @SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/RustBuffer$Companion\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n309#2:1830\n269#2,4:1831\n309#2:1835\n269#2,4:1836\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/RustBuffer$Companion\n*L\n61#1:1830\n61#1:1831,4\n78#1:1835\n78#1:1836,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: alloc-VKZWuLQ$supercel_release$default, reason: not valid java name */
        public static /* synthetic */ ByValue m88allocVKZWuLQ$supercel_release$default(Companion companion, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            return companion.m89allocVKZWuLQ$supercel_release(j10);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        @NotNull
        /* JADX INFO: renamed from: alloc-VKZWuLQ$supercel_release, reason: not valid java name */
        public final ByValue m89allocVKZWuLQ$supercel_release(long j10) throws E, InternalException {
            UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
            UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
            ByValue byValueFfi_cel_eval_rustbuffer_alloc = UniffiLib.Companion.getINSTANCE$supercel_release().ffi_cel_eval_rustbuffer_alloc(j10, uniffiRustCallStatus);
            CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
            if (byValueFfi_cel_eval_rustbuffer_alloc.data != null) {
                return byValueFfi_cel_eval_rustbuffer_alloc;
            }
            throw new RuntimeException("RustBuffer.alloc() returned null data pointer (size=" + ((Object) y1.u0(j10)) + ')');
        }

        @NotNull
        /* JADX INFO: renamed from: create-twO9MuI$supercel_release, reason: not valid java name */
        public final ByValue m90createtwO9MuI$supercel_release(long j10, long j11, @Nullable Pointer pointer) {
            ByValue byValue = new ByValue();
            byValue.capacity = j10;
            byValue.len = j11;
            byValue.data = pointer;
            return byValue;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        public final void free$supercel_release(@NotNull ByValue buf) throws E, InternalException {
            Intrinsics.checkNotNullParameter(buf, "buf");
            UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
            UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
            UniffiLib.Companion.getINSTANCE$supercel_release().ffi_cel_eval_rustbuffer_free(buf, uniffiRustCallStatus);
            Unit unit = Unit.f312394a;
            CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        }

        private Companion() {
        }
    }

    @Nullable
    public final ByteBuffer asByteBuffer() {
        ByteBuffer byteBuffer;
        Pointer pointer = this.data;
        if (pointer == null || (byteBuffer = pointer.getByteBuffer(0L, this.len)) == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    public final void setValue$supercel_release(@NotNull RustBuffer other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.capacity = other.capacity;
        this.len = other.len;
        this.data = other.data;
    }
}
