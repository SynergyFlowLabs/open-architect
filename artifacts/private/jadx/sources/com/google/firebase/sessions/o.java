package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.settings.SessionConfigs;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@m9.c(modules = {b.class})
@ij.f
public interface o {

    @m9.c.a
    public interface a {
        @m9.b
        @NotNull
        a a(@NotNull com.google.firebase.h hVar);

        @m9.b
        @NotNull
        a b(@NotNull Context context);

        @NotNull
        o build();

        @m9.b
        @NotNull
        a c(@NotNull com.google.firebase.installations.k kVar);

        @m9.b
        @NotNull
        a d(@d8.a @NotNull CoroutineContext coroutineContext);

        @m9.b
        @NotNull
        a e(@NotNull z8.b<com.google.android.datatransport.m> bVar);

        @m9.b
        @NotNull
        a f(@d8.b @NotNull CoroutineContext coroutineContext);
    }

    @m9.e
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f125065a = a.f125066a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f125066a = new a();

            private a() {
            }

            private final <T> androidx.datastore.core.l<T> f(androidx.datastore.core.l0<T> l0Var, v1.b<T> bVar, List<? extends androidx.datastore.core.j<T>> list, kotlinx.coroutines.s0 s0Var, Function0<? extends File> function0) {
                return h() ? androidx.datastore.core.c0.f49488a.c(l0Var, bVar, list, s0Var, function0) : androidx.datastore.core.m.f49533a.c(l0Var, bVar, list, s0Var, function0);
            }

            static /* synthetic */ androidx.datastore.core.l g(a aVar, androidx.datastore.core.l0 l0Var, v1.b bVar, List list, kotlinx.coroutines.s0 s0Var, Function0 function0, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = CollectionsKt.emptyList();
                }
                return aVar.f(l0Var, bVar, list, s0Var, function0);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs j(androidx.datastore.core.g ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                return com.google.firebase.sessions.settings.h.f125127a.K();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File k(Context context) {
                return androidx.datastore.c.a(context, "aqs/sessionConfigsDataStore.data");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData m(o0 o0Var, androidx.datastore.core.g ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                return o0Var.K();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File n(Context context) {
                return androidx.datastore.c.a(context, "aqs/sessionDataStore.data");
            }

            @m9.f
            @ij.f
            @NotNull
            public final com.google.firebase.sessions.b e(@NotNull com.google.firebase.h firebaseApp) {
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                return r0.f125074a.c(firebaseApp);
            }

            @m9.f
            @ij.f
            @NotNull
            public final androidx.datastore.core.l<SessionConfigs> i(@NotNull final Context appContext, @d8.b @NotNull CoroutineContext blockingDispatcher) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                int i10 = 2 | 0;
                return g(this, com.google.firebase.sessions.settings.h.f125127a, new v1.b(new Function1() { // from class: com.google.firebase.sessions.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.b.a.j((androidx.datastore.core.g) obj);
                    }
                }), null, kotlinx.coroutines.t0.a(blockingDispatcher), new Function0() { // from class: com.google.firebase.sessions.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.b.a.k(appContext);
                    }
                }, 4, null);
            }

            @m9.f
            @ij.f
            @NotNull
            public final androidx.datastore.core.l<SessionData> l(@NotNull final Context appContext, @d8.b @NotNull CoroutineContext blockingDispatcher, @NotNull final o0 sessionDataSerializer) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                Intrinsics.checkNotNullParameter(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new v1.b(new Function1() { // from class: com.google.firebase.sessions.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.b.a.m(sessionDataSerializer, (androidx.datastore.core.g) obj);
                    }
                }), null, kotlinx.coroutines.t0.a(blockingDispatcher), new Function0() { // from class: com.google.firebase.sessions.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.b.a.n(appContext);
                    }
                }, 4, null);
            }

            @m9.f
            @ij.f
            @NotNull
            public final d1 o() {
                return e1.f125017a;
            }

            @m9.f
            @ij.f
            @NotNull
            public final f1 p() {
                return g1.f125032a;
            }
        }

        @ij.f
        @m9.a
        @NotNull
        com.google.firebase.sessions.settings.a a(@NotNull com.google.firebase.sessions.settings.e eVar);

        @ij.f
        @m9.a
        @NotNull
        j b(@NotNull i iVar);

        @ij.f
        @m9.a
        @NotNull
        a1 c(@NotNull b1 b1Var);

        @ij.f
        @m9.a
        @NotNull
        com.google.firebase.sessions.settings.k d(@NotNull com.google.firebase.sessions.settings.l lVar);

        @n0
        @m9.a
        @NotNull
        @ij.f
        com.google.firebase.sessions.settings.n e(@NotNull com.google.firebase.sessions.settings.d dVar);

        @c0
        @m9.a
        @NotNull
        @ij.f
        com.google.firebase.sessions.settings.n f(@NotNull com.google.firebase.sessions.settings.b bVar);

        @ij.f
        @m9.a
        @NotNull
        e0 g(@NotNull i0 i0Var);

        @ij.f
        @m9.a
        @NotNull
        s0 h(@NotNull t0 t0Var);
    }

    @NotNull
    com.google.firebase.sessions.settings.i a();

    @NotNull
    n b();

    @NotNull
    v0 c();

    @NotNull
    a1 d();

    @NotNull
    s0 e();
}
