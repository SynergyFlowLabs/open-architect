package com.planner5d.library.services.utility;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class n1 {

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f225335a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f225335a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f225335a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f225335a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final <T> void a(@NotNull androidx.lifecycle.o0 o0Var, @NotNull androidx.lifecycle.w0<T> liveData, @NotNull Function1<? super T, Unit> callback) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        liveData.k(o0Var, new a(callback));
    }
}
