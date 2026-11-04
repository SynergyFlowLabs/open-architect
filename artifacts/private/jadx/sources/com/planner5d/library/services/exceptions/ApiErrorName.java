package com.planner5d.library.services.exceptions;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public enum ApiErrorName {
    unknown,
    forbidden,
    account_merge_cannot_overwrite_email,
    account_merge_users_deleted,
    account_merge_invalid_source_or_target,
    account_merge_not_found_source_or_target,
    account_merge_conflicting_membership,
    account_merge_users_cannot_sign_in,
    account_merge_conflicting_social,
    account_merge_delete,
    account_merge_log,
    account_merge_value_move,
    account_merge_set_user_id,
    account_merge_clear_user_id,
    account_merge_invalid_operation,
    account_merge_unknown,
    ai_task_not_found,
    ai_invalid_task_type,
    ai_invalid_task_return_reason,
    ai_could_not_create_task,
    ai_bad_data,
    ai_bad_image,
    ai_task_limit_reached,
    ai_missing_id,
    ai_save_input,
    ai_save_output,
    ai_bad_result,
    not_implemented,
    user_deleted,
    purchase_already_owned,
    subscription_already_owned,
    user_authentication_link,
    user_invalid_password_format,
    user_email_confirmed_earlier,
    user_email_confirm_code,
    email_already_exists,
    email_is_invalid,
    this_email_is_not_registered,
    email_not_confirmed_yet,
    invalid_email_or_password,
    user_temporarily_disabled,
    accept_license_agreement,
    user_email_changed_confirmation_needed,
    user_not_found,
    user_current_password_empty_or_invalid,
    user_request_email_change_limit,
    forgot_password_request_limit,
    project_save,
    could_not_create_token,
    invalid_captcha,
    validation,
    fail,
    not_found;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    static {
        int i10 = 2 & 2;
        int i11 = 4 | 4;
    }

    @NotNull
    public static a<ApiErrorName> getEntries() {
        return $ENTRIES;
    }
}
