package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface s3 {

    public enum a {
        message_impression,
        message_dismiss,
        message_action;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217458e = kotlin.enums.c.c(k());

        static {
            int i10 = 6 & 1;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217458e;
        }
    }

    void a(@NotNull a aVar, @Nullable String str, @Nullable String str2);
}
