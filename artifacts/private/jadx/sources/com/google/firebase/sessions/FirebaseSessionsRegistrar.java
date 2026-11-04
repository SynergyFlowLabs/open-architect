package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final a Companion = new a(null);

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final com.google.firebase.components.j0<Context> appContext;

    @NotNull
    private static final com.google.firebase.components.j0<kotlinx.coroutines.n0> backgroundDispatcher;

    @NotNull
    private static final com.google.firebase.components.j0<kotlinx.coroutines.n0> blockingDispatcher;

    @NotNull
    private static final com.google.firebase.components.j0<com.google.firebase.h> firebaseApp;

    @NotNull
    private static final com.google.firebase.components.j0<com.google.firebase.installations.k> firebaseInstallationsApi;

    @NotNull
    private static final com.google.firebase.components.j0<o> firebaseSessionsComponent;

    @NotNull
    private static final com.google.firebase.components.j0<com.google.android.datatransport.m> transportFactory;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final com.google.firebase.components.j0<Context> a() {
            return FirebaseSessionsRegistrar.appContext;
        }

        @NotNull
        public final com.google.firebase.components.j0<kotlinx.coroutines.n0> b() {
            return FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        @NotNull
        public final com.google.firebase.components.j0<kotlinx.coroutines.n0> c() {
            return FirebaseSessionsRegistrar.blockingDispatcher;
        }

        @NotNull
        public final com.google.firebase.components.j0<com.google.firebase.h> d() {
            return FirebaseSessionsRegistrar.firebaseApp;
        }

        @NotNull
        public final com.google.firebase.components.j0<com.google.firebase.installations.k> e() {
            return FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        @NotNull
        public final com.google.firebase.components.j0<o> f() {
            return FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        @NotNull
        public final com.google.firebase.components.j0<com.google.android.datatransport.m> g() {
            return FirebaseSessionsRegistrar.transportFactory;
        }

        private a() {
        }
    }

    static {
        com.google.firebase.components.j0<Context> j0VarB = com.google.firebase.components.j0.b(Context.class);
        Intrinsics.checkNotNullExpressionValue(j0VarB, "unqualified(...)");
        appContext = j0VarB;
        com.google.firebase.components.j0<com.google.firebase.h> j0VarB2 = com.google.firebase.components.j0.b(com.google.firebase.h.class);
        Intrinsics.checkNotNullExpressionValue(j0VarB2, "unqualified(...)");
        firebaseApp = j0VarB2;
        com.google.firebase.components.j0<com.google.firebase.installations.k> j0VarB3 = com.google.firebase.components.j0.b(com.google.firebase.installations.k.class);
        Intrinsics.checkNotNullExpressionValue(j0VarB3, "unqualified(...)");
        firebaseInstallationsApi = j0VarB3;
        com.google.firebase.components.j0<kotlinx.coroutines.n0> j0VarA = com.google.firebase.components.j0.a(d8.a.class, kotlinx.coroutines.n0.class);
        Intrinsics.checkNotNullExpressionValue(j0VarA, "qualified(...)");
        backgroundDispatcher = j0VarA;
        com.google.firebase.components.j0<kotlinx.coroutines.n0> j0VarA2 = com.google.firebase.components.j0.a(d8.b.class, kotlinx.coroutines.n0.class);
        Intrinsics.checkNotNullExpressionValue(j0VarA2, "qualified(...)");
        blockingDispatcher = j0VarA2;
        com.google.firebase.components.j0<com.google.android.datatransport.m> j0VarB4 = com.google.firebase.components.j0.b(com.google.android.datatransport.m.class);
        Intrinsics.checkNotNullExpressionValue(j0VarB4, "unqualified(...)");
        transportFactory = j0VarB4;
        com.google.firebase.components.j0<o> j0VarB5 = com.google.firebase.components.j0.b(o.class);
        Intrinsics.checkNotNullExpressionValue(j0VarB5, "unqualified(...)");
        firebaseSessionsComponent = j0VarB5;
        try {
            androidx.datastore.core.c0.f49488a.getClass();
        } catch (NoClassDefFoundError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n getComponents$lambda$0(com.google.firebase.components.h hVar) {
        return ((o) hVar.j(firebaseSessionsComponent)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$1(com.google.firebase.components.h hVar) {
        o.a aVarA = e.a();
        Object objJ = hVar.j(appContext);
        Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
        o.a aVarB = aVarA.b((Context) objJ);
        Object objJ2 = hVar.j(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(objJ2, "get(...)");
        o.a aVarD = aVarB.d((CoroutineContext) objJ2);
        Object objJ3 = hVar.j(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(objJ3, "get(...)");
        o.a aVarF = aVarD.f((CoroutineContext) objJ3);
        Object objJ4 = hVar.j(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(objJ4, "get(...)");
        o.a aVarA2 = aVarF.a((com.google.firebase.h) objJ4);
        Object objJ5 = hVar.j(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(objJ5, "get(...)");
        o.a aVarC = aVarA2.c((com.google.firebase.installations.k) objJ5);
        z8.b<com.google.android.datatransport.m> bVarG = hVar.g(transportFactory);
        Intrinsics.checkNotNullExpressionValue(bVarG, "getProvider(...)");
        return aVarC.e(bVarG).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<com.google.firebase.components.g<? extends Object>> getComponents() {
        return CollectionsKt.listOf((Object[]) new com.google.firebase.components.g[]{com.google.firebase.components.g.h(n.class).h(LIBRARY_NAME).b(com.google.firebase.components.v.l(firebaseSessionsComponent)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.sessions.y
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(hVar);
            }
        }).e().d(), com.google.firebase.components.g.h(o.class).h("fire-sessions-component").b(com.google.firebase.components.v.l(appContext)).b(com.google.firebase.components.v.l(backgroundDispatcher)).b(com.google.firebase.components.v.l(blockingDispatcher)).b(com.google.firebase.components.v.l(firebaseApp)).b(com.google.firebase.components.v.l(firebaseInstallationsApi)).b(com.google.firebase.components.v.n(transportFactory)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.sessions.z
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(hVar);
            }
        }).d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, d.f124971d)});
    }
}
