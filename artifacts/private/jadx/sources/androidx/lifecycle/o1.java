package androidx.lifecycle;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CreationExtras.kt\nandroidx/lifecycle/viewmodel/CreationExtras$Companion\n*L\n1#1,240:1\n1#2:241\n68#3:242\n68#3:243\n68#3:244\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n230#1:242\n235#1:243\n239#1:244\n*E\n"})
@oj.i(name = "SavedStateHandleSupport")
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f52456a = "androidx.lifecycle.internal.SavedStateHandlesVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f52457b = "androidx.lifecycle.internal.SavedStateHandlesProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v2.a.c<androidx.savedstate.m> f52458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v2.a.c<m2> f52459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v2.a.c<Bundle> f52460e;

    public static final class a implements j2.c {
        a() {
        }

        @Override // androidx.lifecycle.j2.c
        public <T extends f2> T a(kotlin.reflect.d<T> modelClass, v2.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new s1();
        }
    }

    public static final class b implements v2.a.c<androidx.savedstate.m> {
    }

    public static final class c implements v2.a.c<m2> {
    }

    public static final class d implements v2.a.c<Bundle> {
    }

    static {
        v2.a.C2518a c2518a = v2.a.f381325b;
        f52458c = new b();
        f52459d = new c();
        f52460e = new d();
    }

    private static final l1 a(androidx.savedstate.m mVar, m2 m2Var, String str, Bundle bundle) {
        r1 r1VarD = d(mVar);
        s1 s1VarE = e(m2Var);
        l1 l1Var = s1VarE.U().get(str);
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarA = l1.f52428c.a(r1VarD.c(str), bundle);
        s1VarE.U().put(str, l1VarA);
        return l1VarA;
    }

    @androidx.annotation.l0
    @NotNull
    public static final l1 b(@NotNull v2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        androidx.savedstate.m mVar = (androidx.savedstate.m) aVar.a(f52458c);
        if (mVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        m2 m2Var = (m2) aVar.a(f52459d);
        if (m2Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f52460e);
        String str = (String) aVar.a(j2.f52402c);
        if (str != null) {
            return a(mVar, m2Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.l0
    public static final <T extends androidx.savedstate.m & m2> void c(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        c0.b bVarD = t10.getLifecycle().d();
        if (bVarD != c0.b.INITIALIZED && bVarD != c0.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t10.getSavedStateRegistry().b(f52457b) == null) {
            r1 r1Var = new r1(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().d(f52457b, r1Var);
            t10.getLifecycle().c(new m1(r1Var));
        }
    }

    @NotNull
    public static final r1 d(@NotNull androidx.savedstate.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        androidx.savedstate.j.b bVarB = mVar.getSavedStateRegistry().b(f52457b);
        r1 r1Var = bVarB instanceof r1 ? (r1) bVarB : null;
        if (r1Var != null) {
            return r1Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @NotNull
    public static final s1 e(@NotNull m2 m2Var) {
        Intrinsics.checkNotNullParameter(m2Var, "<this>");
        return (s1) j2.b.d(j2.f52401b, m2Var, new a(), null, 4, null).e(f52456a, kotlin.jvm.internal.j1.d(s1.class));
    }
}
