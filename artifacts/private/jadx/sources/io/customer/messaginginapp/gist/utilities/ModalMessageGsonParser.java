package io.customer.messaginginapp.gist.utilities;

import com.google.gson.f;
import io.customer.messaginginapp.gist.data.model.Message;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalMessageGsonParser implements ModalMessageParser.JsonParser {

    @NotNull
    private final f gson;

    public ModalMessageGsonParser(@NotNull f gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.gson = gson;
    }

    @Override // io.customer.messaginginapp.gist.utilities.ModalMessageParser.JsonParser
    @Nullable
    public Message parseMessageFromJson(@NotNull String json) throws Exception {
        Intrinsics.checkNotNullParameter(json, "json");
        return (Message) this.gson.r(json, Message.class);
    }
}
