package io.ktor.utils.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f296881a = a.f296882a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f296882a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final h f296883b = new C2098a();

        /* JADX INFO: renamed from: io.ktor.utils.io.h$a$a, reason: collision with other inner class name */
        public static final class C2098a implements h {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f296884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final kotlinx.io.c0 f296885c = new kotlinx.io.b();

            C2098a() {
            }

            @o0
            public static /* synthetic */ void a() {
            }

            @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
            public void c(Throwable th2) {
            }

            @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
            public Throwable e() {
                return this.f296884b;
            }

            @Override // io.ktor.utils.io.h
            public Object f(int i10, kotlin.coroutines.d<? super Boolean> dVar) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }

            @Override // io.ktor.utils.io.h
            public kotlinx.io.c0 j() {
                return this.f296885c;
            }

            @Override // io.ktor.utils.io.h
            public boolean k() {
                return true;
            }
        }

        private a() {
        }

        @NotNull
        public final h a() {
            return f296883b;
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(h hVar, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return hVar.f(i10, dVar);
        }

        @o0
        public static /* synthetic */ void b() {
        }
    }

    void c(@Nullable Throwable th2);

    @Nullable
    Throwable e();

    @Nullable
    Object f(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @NotNull
    kotlinx.io.c0 j();

    boolean k();
}
