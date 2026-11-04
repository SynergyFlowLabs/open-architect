package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements com.google.firebase.components.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f120402a = new a<>();

        @Override // com.google.firebase.components.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n0 a(com.google.firebase.components.h hVar) {
            Object objJ = hVar.j(j0.a(d8.a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
            return b2.c((Executor) objJ);
        }
    }

    public static final class b<T> implements com.google.firebase.components.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f120403a = new b<>();

        @Override // com.google.firebase.components.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n0 a(com.google.firebase.components.h hVar) {
            Object objJ = hVar.j(j0.a(d8.c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
            return b2.c((Executor) objJ);
        }
    }

    public static final class c<T> implements com.google.firebase.components.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f120404a = new c<>();

        @Override // com.google.firebase.components.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n0 a(com.google.firebase.components.h hVar) {
            Object objJ = hVar.j(j0.a(d8.b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
            return b2.c((Executor) objJ);
        }
    }

    public static final class d<T> implements com.google.firebase.components.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f120405a = new d<>();

        @Override // com.google.firebase.components.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n0 a(com.google.firebase.components.h hVar) {
            Object objJ = hVar.j(j0.a(d8.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
            return b2.c((Executor) objJ);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<com.google.firebase.components.g<?>> getComponents() {
        com.google.firebase.components.g gVarD = com.google.firebase.components.g.f(j0.a(d8.a.class, n0.class)).b(com.google.firebase.components.v.l(j0.a(d8.a.class, Executor.class))).f(a.f120402a).d();
        Intrinsics.checkNotNullExpressionValue(gVarD, "build(...)");
        com.google.firebase.components.g gVarD2 = com.google.firebase.components.g.f(j0.a(d8.c.class, n0.class)).b(com.google.firebase.components.v.l(j0.a(d8.c.class, Executor.class))).f(b.f120403a).d();
        Intrinsics.checkNotNullExpressionValue(gVarD2, "build(...)");
        com.google.firebase.components.g gVarD3 = com.google.firebase.components.g.f(j0.a(d8.b.class, n0.class)).b(com.google.firebase.components.v.l(j0.a(d8.b.class, Executor.class))).f(c.f120404a).d();
        Intrinsics.checkNotNullExpressionValue(gVarD3, "build(...)");
        com.google.firebase.components.g gVarD4 = com.google.firebase.components.g.f(j0.a(d8.d.class, n0.class)).b(com.google.firebase.components.v.l(j0.a(d8.d.class, Executor.class))).f(d.f120405a).d();
        Intrinsics.checkNotNullExpressionValue(gVarD4, "build(...)");
        return CollectionsKt.listOf((Object[]) new com.google.firebase.components.g[]{gVarD, gVarD2, gVarD3, gVarD4});
    }
}
