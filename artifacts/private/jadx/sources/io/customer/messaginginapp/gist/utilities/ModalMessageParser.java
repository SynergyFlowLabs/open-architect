package io.customer.messaginginapp.gist.utilities;

import android.content.Intent;
import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ModalMessageParser {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final String EXTRA_IN_APP_MESSAGE = "GIST_MESSAGE";

    @NotNull
    public static final String EXTRA_IN_APP_MODAL_POSITION = "GIST_MODAL_POSITION";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String EXTRA_IN_APP_MESSAGE = "GIST_MESSAGE";

        @NotNull
        public static final String EXTRA_IN_APP_MODAL_POSITION = "GIST_MODAL_POSITION";

        private Companion() {
        }
    }

    public interface JsonParser {
        @Nullable
        Message parseMessageFromJson(@NotNull String str) throws Exception;
    }

    @Nullable
    Object parseExtras(@NotNull Intent intent, @NotNull d<? super ModalMessageExtras> dVar);
}
