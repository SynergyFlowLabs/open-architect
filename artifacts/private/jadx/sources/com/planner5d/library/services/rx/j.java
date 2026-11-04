package com.planner5d.library.services.rx;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f224950a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final Throwable a(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return ((error instanceof OnErrorNotImplementedException) || (error instanceof OnErrorFailedException) || (error instanceof VirtualMachineError) || (error instanceof ThreadDeath) || (error instanceof LinkageError)) ? new j(error) : error;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Throwable throwable) {
        super(throwable);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @n
    @NotNull
    public static final Throwable a(@NotNull Throwable th2) {
        return f224950a.a(th2);
    }
}
