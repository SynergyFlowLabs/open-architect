package com.google.firebase.sessions.settings;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface n {

    public static final class a {
        public static boolean a(@NotNull n nVar) {
            return false;
        }

        @Nullable
        public static Object b(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            return Unit.f312394a;
        }
    }

    @Nullable
    Double a();

    @Nullable
    Object b(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Boolean c();

    @Nullable
    kotlin.time.c d();

    boolean e();
}
