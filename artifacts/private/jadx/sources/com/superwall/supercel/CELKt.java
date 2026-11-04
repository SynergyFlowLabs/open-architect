package com.superwall.supercel;

import android.os.Build;
import com.sun.jna.Library;
import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n269#1,4:1830\n309#1:1834\n269#1,4:1835\n309#1:1839\n269#1,4:1840\n309#1:1844\n269#1,4:1845\n309#1:1849\n269#1,4:1850\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n309#1:1830,4\n1793#1:1834\n1793#1:1835,4\n1802#1:1839\n1802#1:1840,4\n1811#1:1844\n1811#1:1845,4\n1820#1:1849\n1820#1:1850,4\n*E\n"})
public final class CELKt {
    public static final int IDX_CALLBACK_FREE = 0;
    public static final int UNIFFI_CALLBACK_ERROR = 1;
    public static final int UNIFFI_CALLBACK_SUCCESS = 0;
    public static final int UNIFFI_CALLBACK_UNEXPECTED_ERROR = 2;
    public static final byte UNIFFI_CALL_ERROR = 1;
    public static final byte UNIFFI_CALL_SUCCESS = 0;
    public static final byte UNIFFI_CALL_UNEXPECTED_ERROR = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniffiCleaner create(UniffiCleaner.Companion companion) {
        return Build.VERSION.SDK_INT >= 34 ? new AndroidSystemCleaner() : new UniffiJnaCleaner();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public static final String evaluateAst(@NotNull String ast) throws E, InternalException {
        Intrinsics.checkNotNullParameter(ast, "ast");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        RustBuffer.ByValue byValueUniffi_cel_eval_fn_func_evaluate_ast = UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_func_evaluate_ast(ffiConverterString.lower(ast), uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return ffiConverterString.lift(byValueUniffi_cel_eval_fn_func_evaluate_ast);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public static final String evaluateAstWithContext(@NotNull String definition, @NotNull HostContext context) throws E, InternalException {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(context, "context");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        RustBuffer.ByValue byValueUniffi_cel_eval_fn_func_evaluate_ast_with_context = UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_func_evaluate_ast_with_context(ffiConverterString.lower(definition), FfiConverterTypeHostContext.INSTANCE.lower(context), uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return ffiConverterString.lift(byValueUniffi_cel_eval_fn_func_evaluate_ast_with_context);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public static final String evaluateWithContext(@NotNull String definition, @NotNull HostContext context) throws E, InternalException {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(context, "context");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        RustBuffer.ByValue byValueUniffi_cel_eval_fn_func_evaluate_with_context = UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_func_evaluate_with_context(ffiConverterString.lower(definition), FfiConverterTypeHostContext.INSTANCE.lower(context), uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return ffiConverterString.lift(byValueUniffi_cel_eval_fn_func_evaluate_with_context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final synchronized String findLibraryName(String str) {
        String property = System.getProperty("uniffi.component." + str + ".libraryOverride");
        return property != null ? property : "uniffi_cel";
    }

    private static final /* synthetic */ <Lib extends Library> Lib loadIndirect(String str) {
        String strFindLibraryName = findLibraryName(str);
        Intrinsics.reifiedOperationMarker(4, "Lib");
        Lib lib = (Lib) Native.load(strFindLibraryName, Library.class);
        Intrinsics.checkNotNullExpressionValue(lib, "load(...)");
        return lib;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public static final String parseToAst(@NotNull String expression) throws E, InternalException {
        Intrinsics.checkNotNullParameter(expression, "expression");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        RustBuffer.ByValue byValueUniffi_cel_eval_fn_func_parse_to_ast = UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_func_parse_to_ast(ffiConverterString.lower(expression), uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return ffiConverterString.lift(byValueUniffi_cel_eval_fn_func_parse_to_ast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uniffiCheckApiChecksums(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_func_evaluate_ast() != -10787) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_func_evaluate_ast_with_context() != 28567) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_func_evaluate_with_context() != -28217) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_func_parse_to_ast() != -25071) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_method_hostcontext_computed_property() != 5366) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_method_hostcontext_device_property() != 7074) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (integrityCheckingUniffiLib.uniffi_cel_eval_checksum_method_resultcallback_on_result() != 27954) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    public static final <E extends Exception> void uniffiCheckCallStatus(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, UniffiRustCallStatus uniffiRustCallStatus) throws E, InternalException {
        if (uniffiRustCallStatus.isSuccess()) {
            return;
        }
        if (uniffiRustCallStatus.isError()) {
            throw uniffiRustCallStatusErrorHandler.lift(uniffiRustCallStatus.error_buf);
        }
        if (uniffiRustCallStatus.isPanic()) {
            if (uniffiRustCallStatus.error_buf.len <= 0) {
                throw new InternalException("Rust panic");
            }
            throw new InternalException(FfiConverterString.INSTANCE.lift(uniffiRustCallStatus.error_buf));
        }
        throw new InternalException("Unknown rust call status: " + uniffiRustCallStatus + ".code");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (29 != integrityCheckingUniffiLib.ffi_cel_eval_uniffi_contract_version()) {
            throw new RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        UniffiLib.Companion.getINSTANCE$supercel_release();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    private static final <U> U uniffiRustCall(Function1<? super UniffiRustCallStatus, ? extends U> function1) throws E, InternalException {
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        U uInvoke = function1.invoke(uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return uInvoke;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    private static final <U, E extends Exception> U uniffiRustCallWithError(UniffiRustCallStatusErrorHandler<E> uniffiRustCallStatusErrorHandler, Function1<? super UniffiRustCallStatus, ? extends U> function1) throws E, InternalException {
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        U uInvoke = function1.invoke(uniffiRustCallStatus);
        uniffiCheckCallStatus(uniffiRustCallStatusErrorHandler, uniffiRustCallStatus);
        return uInvoke;
    }

    public static final <T> void uniffiTraitInterfaceCall(@NotNull UniffiRustCallStatus callStatus, @NotNull Function0<? extends T> makeCall, @NotNull Function1<? super T, Unit> writeReturn) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        Intrinsics.checkNotNullParameter(makeCall, "makeCall");
        Intrinsics.checkNotNullParameter(writeReturn, "writeReturn");
        try {
            writeReturn.invoke(makeCall.invoke());
        } catch (Exception e10) {
            callStatus.code = (byte) 2;
            callStatus.error_buf = FfiConverterString.INSTANCE.lower(e10.toString());
        }
    }

    public static final /* synthetic */ <T, E extends Throwable> void uniffiTraitInterfaceCallWithError(UniffiRustCallStatus callStatus, Function0<? extends T> makeCall, Function1<? super T, Unit> writeReturn, Function1<? super E, RustBuffer.ByValue> lowerError) {
        Intrinsics.checkNotNullParameter(callStatus, "callStatus");
        Intrinsics.checkNotNullParameter(makeCall, "makeCall");
        Intrinsics.checkNotNullParameter(writeReturn, "writeReturn");
        Intrinsics.checkNotNullParameter(lowerError, "lowerError");
        try {
            writeReturn.invoke(makeCall.invoke());
        } catch (Exception e10) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.T4);
            callStatus.code = (byte) 1;
            callStatus.error_buf = lowerError.invoke(e10);
        }
    }

    public static final <T extends Disposable, R> R use(T t10, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            h0.d(1);
            if (t10 != null) {
                try {
                    t10.destroy();
                } catch (Throwable unused) {
                }
            }
            h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            if (t10 != null) {
                try {
                    t10.destroy();
                } catch (Throwable unused2) {
                }
            }
            h0.c(1);
            throw th2;
        }
    }
}
