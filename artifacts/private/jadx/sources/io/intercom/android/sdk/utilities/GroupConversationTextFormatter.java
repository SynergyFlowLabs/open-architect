package io.intercom.android.sdk.utilities;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;

    @NotNull
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    @n
    @NotNull
    public static final CharSequence groupConversationSubtitle(@NotNull String firstName, int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 == 1) {
            CharSequence charSequence = Phrase.from(context, R.string.intercom_name_and_1_other).put("name", firstName).format();
            Intrinsics.checkNotNull(charSequence);
            return charSequence;
        }
        if (i10 <= 1) {
            return firstName;
        }
        CharSequence charSequence2 = Phrase.from(context, R.string.intercom_name_and_x_others).put("name", firstName).put("count", i10).format();
        Intrinsics.checkNotNull(charSequence2);
        return charSequence2;
    }

    @n
    @NotNull
    public static final CharSequence groupConversationTitle(@NotNull String firstName, int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 == 1) {
            return firstName + context.getString(R.string.intercom_group_conversation_1_other_participant_count_short);
        }
        if (i10 > 1) {
            firstName = firstName + ((Object) Phrase.from(context, R.string.intercom_group_conversation_multiple_other_participant_count_short).put("other_participant_count", i10).format());
        }
        return firstName;
    }
}
