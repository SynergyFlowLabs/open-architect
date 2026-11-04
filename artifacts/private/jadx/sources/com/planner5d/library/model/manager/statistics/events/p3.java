package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface p3 {

    public enum a {
        network,
        other;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217312d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f217312d;
        }
    }

    public enum b {
        open,
        submit,
        success,
        error;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f217318f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f217318f;
        }
    }
}
