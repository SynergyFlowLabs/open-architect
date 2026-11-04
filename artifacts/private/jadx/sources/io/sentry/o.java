package io.sentry;

/* JADX INFO: loaded from: classes11.dex */
public enum o {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback(io.sentry.protocol.f.f306242h),
    Session(io.sentry.cache.f.f305178k),
    Attachment("attachment"),
    LogItem("log_item"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    o(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
