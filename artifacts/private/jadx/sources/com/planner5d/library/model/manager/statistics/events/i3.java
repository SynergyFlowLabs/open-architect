package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface i3 {

    public enum a {
        chat_open,
        message_send,
        message_get,
        chat_close,
        regenerate_message;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216984g = kotlin.enums.c.c(k());

        static {
            int i10 = 0 & 3;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216984g;
        }
    }

    void V(@NotNull a aVar);
}
