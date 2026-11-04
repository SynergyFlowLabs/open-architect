package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.j0;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    public static final class a<T> implements com.google.firebase.components.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f124419a = new a<>();

        @Override // com.google.firebase.components.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n0 a(com.google.firebase.components.h hVar) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            Object objJ = hVar.j(j0.a(Annotation.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objJ, "get(...)");
            return b2.c((Executor) objJ);
        }
    }

    @NotNull
    public static final h a(@NotNull d dVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        h hVarQ = h.q(name);
        Intrinsics.checkNotNullExpressionValue(hVarQ, "getInstance(...)");
        return hVarQ;
    }

    private static final /* synthetic */ <T extends Annotation> com.google.firebase.components.g<n0> b() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        com.google.firebase.components.g.b bVarF = com.google.firebase.components.g.f(j0.a(Annotation.class, n0.class));
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        com.google.firebase.components.g.b bVarB = bVarF.b(com.google.firebase.components.v.l(j0.a(Annotation.class, Executor.class)));
        Intrinsics.needClassReification();
        com.google.firebase.components.g<n0> gVarD = bVarB.f(a.f124419a).d();
        Intrinsics.checkNotNullExpressionValue(gVarD, "build(...)");
        return gVarD;
    }

    @NotNull
    public static final h c(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        h hVarP = h.p();
        Intrinsics.checkNotNullExpressionValue(hVarP, "getInstance(...)");
        return hVarP;
    }

    @NotNull
    public static final s d(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        s sVarS = c(d.f121972a).s();
        Intrinsics.checkNotNullExpressionValue(sVarS, "getOptions(...)");
        return sVarS;
    }

    @Nullable
    public static final h e(@NotNull d dVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return h.x(context);
    }

    @NotNull
    public static final h f(@NotNull d dVar, @NotNull Context context, @NotNull s options) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        h hVarY = h.y(context, options);
        Intrinsics.checkNotNullExpressionValue(hVarY, "initializeApp(...)");
        return hVarY;
    }

    @NotNull
    public static final h g(@NotNull d dVar, @NotNull Context context, @NotNull s options, @NotNull String name) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(name, "name");
        h hVarZ = h.z(context, options, name);
        Intrinsics.checkNotNullExpressionValue(hVarZ, "initializeApp(...)");
        return hVarZ;
    }
}
