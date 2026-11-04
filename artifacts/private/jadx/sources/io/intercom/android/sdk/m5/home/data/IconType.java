package io.intercom.android.sdk.m5.home.data;

import io.intercom.android.sdk.R;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public enum IconType {
    TEAMMATE { // from class: io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_send_message_icon);
        }
    },
    BOT { // from class: io.intercom.android.sdk.m5.home.data.IconType.BOT
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_conversation_card_question);
        }
    },
    FIN { // from class: io.intercom.android.sdk.m5.home.data.IconType.FIN
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        @NotNull
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_chevron);
        }
    },
    FACE_PILE { // from class: io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        @Nullable
        public Integer getIcon() {
            return null;
        }
    };

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    /* synthetic */ IconType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static a<IconType> getEntries() {
        return $ENTRIES;
    }

    @Nullable
    public abstract Integer getIcon();
}
