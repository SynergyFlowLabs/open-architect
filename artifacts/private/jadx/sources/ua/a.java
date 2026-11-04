package ua;

import com.planner5d.library.aichat.command.AiChatResponseMessage;
import com.planner5d.library.aichat.converter.JSONObjectAdapter;
import com.planner5d.library.model.manager.u1;
import com.squareup.moshi.h;
import com.squareup.moshi.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u1 f381206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f381207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h<AiChatResponseMessage> f381208c;

    @ij.a
    public a(@NotNull u1 logRecordManagerService) {
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        this.f381206a = logRecordManagerService;
        w wVarI = new w.c().b(new JSONObjectAdapter()).i();
        Intrinsics.checkNotNullExpressionValue(wVarI, "build(...)");
        this.f381207b = wVarI;
        this.f381208c = wVarI.c(AiChatResponseMessage.class);
    }

    @Nullable
    public final AiChatResponseMessage a(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            return this.f381208c.c(json);
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            this.f381206a.b("chat_message_json", json, e10);
            return null;
        }
    }

    @NotNull
    public final String b(@NotNull AiChatResponseMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strL = this.f381208c.l(message);
        Intrinsics.checkNotNullExpressionValue(strL, "toJson(...)");
        return strL;
    }
}
