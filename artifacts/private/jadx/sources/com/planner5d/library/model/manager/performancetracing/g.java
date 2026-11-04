package com.planner5d.library.model.manager.performancetracing;

import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f193086a = a.f193087a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f193087a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final g f193088b = new C1606a();

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.performancetracing.g$a$a, reason: collision with other inner class name */
        public static final class C1606a implements g {
            C1606a() {
            }

            @Override // com.planner5d.library.model.manager.performancetracing.g
            public void b(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
            }

            @Override // com.planner5d.library.model.manager.performancetracing.g
            public void complete() {
            }
        }

        private a() {
        }

        @n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final g a() {
            return f193088b;
        }
    }

    @NotNull
    static g a() {
        return f193086a.a();
    }

    void b(@NotNull Throwable th2);

    void complete();
}
