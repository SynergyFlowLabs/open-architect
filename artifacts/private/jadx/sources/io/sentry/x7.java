package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public enum x7 implements k2 {
    Session(io.sentry.cache.f.f305178k),
    Event(androidx.core.app.w.I0),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent(o8.f305970i3),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback(io.sentry.protocol.f.f306242h),
    Log("log"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements a2<x7> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x7 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            return x7.valueOfLabel(y3Var.jc().toLowerCase(Locale.ROOT));
        }
    }

    x7(String str) {
        this.itemType = str;
    }

    public static x7 resolve(Object obj) {
        if (obj instanceof o7) {
            return ((o7) obj).E().g() == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.c0) {
            return Transaction;
        }
        if (obj instanceof k9) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static x7 valueOfLabel(String str) {
        for (x7 x7Var : values()) {
            if (x7Var.itemType.equals(str)) {
                return x7Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.b(this.itemType);
    }
}
