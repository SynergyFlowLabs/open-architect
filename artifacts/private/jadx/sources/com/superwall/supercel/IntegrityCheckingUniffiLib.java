package com.superwall.supercel;

import com.sun.jna.Library;

/* JADX INFO: loaded from: classes13.dex */
public interface IntegrityCheckingUniffiLib extends Library {
    int ffi_cel_eval_uniffi_contract_version();

    short uniffi_cel_eval_checksum_func_evaluate_ast();

    short uniffi_cel_eval_checksum_func_evaluate_ast_with_context();

    short uniffi_cel_eval_checksum_func_evaluate_with_context();

    short uniffi_cel_eval_checksum_func_parse_to_ast();

    short uniffi_cel_eval_checksum_method_hostcontext_computed_property();

    short uniffi_cel_eval_checksum_method_hostcontext_device_property();

    short uniffi_cel_eval_checksum_method_resultcallback_on_result();
}
