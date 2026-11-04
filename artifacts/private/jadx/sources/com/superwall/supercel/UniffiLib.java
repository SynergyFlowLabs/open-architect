package com.superwall.supercel;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import kotlin.f0;
import kotlin.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface UniffiLib extends Library {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final f0<UniffiLib> INSTANCE$delegate = g0.c(UniffiLib$Companion$INSTANCE$2.INSTANCE);

        @NotNull
        private static final f0<UniffiCleaner> CLEANER$delegate = g0.c(UniffiLib$Companion$CLEANER$2.INSTANCE);

        private Companion() {
        }

        @NotNull
        public final UniffiCleaner getCLEANER$supercel_release() {
            return CLEANER$delegate.getValue();
        }

        @NotNull
        public final UniffiLib getINSTANCE$supercel_release() {
            return INSTANCE$delegate.getValue();
        }
    }

    void ffi_cel_eval_rust_future_cancel_f32(long j10);

    void ffi_cel_eval_rust_future_cancel_f64(long j10);

    void ffi_cel_eval_rust_future_cancel_i16(long j10);

    void ffi_cel_eval_rust_future_cancel_i32(long j10);

    void ffi_cel_eval_rust_future_cancel_i64(long j10);

    void ffi_cel_eval_rust_future_cancel_i8(long j10);

    void ffi_cel_eval_rust_future_cancel_pointer(long j10);

    void ffi_cel_eval_rust_future_cancel_rust_buffer(long j10);

    void ffi_cel_eval_rust_future_cancel_u16(long j10);

    void ffi_cel_eval_rust_future_cancel_u32(long j10);

    void ffi_cel_eval_rust_future_cancel_u64(long j10);

    void ffi_cel_eval_rust_future_cancel_u8(long j10);

    void ffi_cel_eval_rust_future_cancel_void(long j10);

    float ffi_cel_eval_rust_future_complete_f32(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    double ffi_cel_eval_rust_future_complete_f64(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    short ffi_cel_eval_rust_future_complete_i16(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    int ffi_cel_eval_rust_future_complete_i32(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    long ffi_cel_eval_rust_future_complete_i64(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    byte ffi_cel_eval_rust_future_complete_i8(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    Pointer ffi_cel_eval_rust_future_complete_pointer(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue ffi_cel_eval_rust_future_complete_rust_buffer(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    short ffi_cel_eval_rust_future_complete_u16(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    int ffi_cel_eval_rust_future_complete_u32(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    long ffi_cel_eval_rust_future_complete_u64(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    byte ffi_cel_eval_rust_future_complete_u8(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cel_eval_rust_future_complete_void(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cel_eval_rust_future_free_f32(long j10);

    void ffi_cel_eval_rust_future_free_f64(long j10);

    void ffi_cel_eval_rust_future_free_i16(long j10);

    void ffi_cel_eval_rust_future_free_i32(long j10);

    void ffi_cel_eval_rust_future_free_i64(long j10);

    void ffi_cel_eval_rust_future_free_i8(long j10);

    void ffi_cel_eval_rust_future_free_pointer(long j10);

    void ffi_cel_eval_rust_future_free_rust_buffer(long j10);

    void ffi_cel_eval_rust_future_free_u16(long j10);

    void ffi_cel_eval_rust_future_free_u32(long j10);

    void ffi_cel_eval_rust_future_free_u64(long j10);

    void ffi_cel_eval_rust_future_free_u8(long j10);

    void ffi_cel_eval_rust_future_free_void(long j10);

    void ffi_cel_eval_rust_future_poll_f32(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_f64(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_i16(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_i32(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_i64(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_i8(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_pointer(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_rust_buffer(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_u16(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_u32(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_u64(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_u8(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    void ffi_cel_eval_rust_future_poll_void(long j10, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j11);

    @NotNull
    RustBuffer.ByValue ffi_cel_eval_rustbuffer_alloc(long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void ffi_cel_eval_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue ffi_cel_eval_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue ffi_cel_eval_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j10, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    Pointer uniffi_cel_eval_fn_clone_hostcontext(@NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    Pointer uniffi_cel_eval_fn_clone_resultcallback(@NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cel_eval_fn_free_hostcontext(@NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cel_eval_fn_free_resultcallback(@NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue uniffi_cel_eval_fn_func_evaluate_ast(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue uniffi_cel_eval_fn_func_evaluate_ast_with_context(@NotNull RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue uniffi_cel_eval_fn_func_evaluate_with_context(@NotNull RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    @NotNull
    RustBuffer.ByValue uniffi_cel_eval_fn_func_parse_to_ast(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cel_eval_fn_init_callback_vtable_hostcontext(@NotNull UniffiVTableCallbackInterfaceHostContext uniffiVTableCallbackInterfaceHostContext);

    void uniffi_cel_eval_fn_method_hostcontext_computed_property(@NotNull Pointer pointer, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull Pointer pointer2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cel_eval_fn_method_hostcontext_device_property(@NotNull Pointer pointer, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull Pointer pointer2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    void uniffi_cel_eval_fn_method_resultcallback_on_result(@NotNull Pointer pointer, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);
}
