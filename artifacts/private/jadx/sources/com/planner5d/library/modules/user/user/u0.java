package com.planner5d.library.modules.user.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f223494a = a.f223496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f223495b = 720;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f223496a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f223497b = 720;

        private a() {
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(u0 u0Var, id.a aVar, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPaid");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return u0Var.f(aVar, z10, dVar);
        }
    }

    @androidx.annotation.m1
    boolean a(@Nullable id.a aVar, @NotNull com.planner5d.library.model.payments.a aVar2, @Nullable Long l10);

    boolean b(@Nullable id.a aVar);

    boolean c();

    boolean d(@Nullable id.a aVar);

    @Nullable
    Object f(@Nullable id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super id.a> dVar);

    @Nullable
    Object h(@NotNull com.planner5d.library.model.payments.a aVar, @Nullable id.a aVar2, @NotNull kotlin.coroutines.d<? super Long> dVar);

    @NotNull
    String i(@Nullable id.a aVar);

    boolean j();

    boolean k(@Nullable id.a aVar);

    boolean l();

    boolean m(@Nullable id.a aVar);

    boolean n(@Nullable id.a aVar);

    boolean o(@Nullable id.a aVar);

    int p(@Nullable id.a aVar);

    boolean q(@Nullable id.a aVar);

    boolean r();

    @androidx.annotation.m1
    void t(@Nullable id.a aVar, @NotNull fd.k kVar);

    boolean u(@Nullable id.a aVar);
}
