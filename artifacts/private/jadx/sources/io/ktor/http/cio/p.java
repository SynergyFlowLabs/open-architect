package io.ktor.http.cio;

import io.ktor.http.j1;
import io.ktor.http.k1;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpBody.kt\nio/ktor/http/cio/HttpBodyKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1869#2,2:197\n*S KotlinDebug\n*F\n+ 1 HttpBody.kt\nio/ktor/http/cio/HttpBodyKt\n*L\n177#1:197,2\n*E\n"})
public final class p {
    public static final boolean a(@NotNull j1 method, long j10, @Nullable CharSequence charSequence, @Nullable n nVar, @Nullable CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (charSequence != null) {
            e(charSequence);
            return true;
        }
        if (j10 != -1) {
            return j10 > 0;
        }
        j1.a aVar = j1.f295897b;
        return (Intrinsics.areEqual(method, aVar.c()) || Intrinsics.areEqual(method, aVar.d()) || Intrinsics.areEqual(method, aVar.e()) || nVar == null || !nVar.h()) ? false : true;
    }

    public static final boolean b(@NotNull b0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        j1 j1VarB = request.b();
        CharSequence charSequenceF = request.a().f("Content-Length");
        return a(j1VarB, charSequenceF != null ? io.ktor.http.cio.internals.i.n(charSequenceF) : -1L, request.a().f(com.google.common.net.d.M0), n.f295577e.f(request.a().f(com.google.common.net.d.f119523o)), request.a().f("Content-Type"));
    }

    public static final boolean c(@NotNull j1 method, @Nullable CharSequence charSequence, @Nullable n nVar) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, j1.f295897b.c()) && charSequence != null && nVar != null && nVar.k();
    }

    public static final boolean d(@NotNull b0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return c(request.b(), request.a().f(com.google.common.net.d.N), n.f295577e.f(request.a().f(com.google.common.net.d.f119523o)));
    }

    private static final boolean e(CharSequence charSequence) {
        if (io.ktor.http.cio.internals.i.f(charSequence, 0, 0, "chunked", 3, null)) {
            return true;
        }
        boolean z10 = false;
        if (io.ktor.http.cio.internals.i.f(charSequence, 0, 0, "identity", 3, null)) {
            return false;
        }
        Iterator it = StringsKt.split$default(charSequence, new String[]{","}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            String lowerCase = StringsKt.E5((String) it.next()).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "chunked")) {
                if (z10) {
                    throw new IllegalArgumentException("Double-chunked TE is not supported: " + ((Object) charSequence));
                }
                z10 = true;
            } else if (!Intrinsics.areEqual(lowerCase, "identity")) {
                throw new IllegalArgumentException("Unsupported transfer encoding " + lowerCase);
            }
        }
        return z10;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Please use method with version parameter")
    @Nullable
    public static final Object f(long j10, @Nullable CharSequence charSequence, @Nullable n nVar, @NotNull io.ktor.utils.io.h hVar, @NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objG = g(null, j10, charSequence, nVar, hVar, pVar, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Nullable
    public static final Object g(@Nullable k1 k1Var, long j10, @Nullable CharSequence charSequence, @Nullable n nVar, @NotNull io.ktor.utils.io.h hVar, @NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        if (charSequence != null && e(charSequence)) {
            Object objD = i.d(hVar, pVar, dVar);
            return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
        }
        if (j10 != -1) {
            Object objG = io.ktor.utils.io.k.g(hVar, pVar, j10, dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
        if ((nVar == null || !nVar.h()) && !(nVar == null && Intrinsics.areEqual(k1Var, k1.f295916d.b()))) {
            io.ktor.utils.io.t.e(pVar, new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
            return Unit.f312394a;
        }
        Object objG2 = io.ktor.utils.io.k.g(hVar, pVar, Long.MAX_VALUE, dVar);
        return objG2 == kotlin.coroutines.intrinsics.b.l() ? objG2 : Unit.f312394a;
    }

    @Nullable
    public static final Object h(@NotNull q qVar, @NotNull io.ktor.utils.io.h hVar, @NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        CharSequence charSequenceF = qVar.f("Content-Length");
        Object objG = g(null, charSequenceF != null ? io.ktor.http.cio.internals.i.n(charSequenceF) : -1L, qVar.f(com.google.common.net.d.M0), n.f295577e.f(qVar.f(com.google.common.net.d.f119523o)), hVar, pVar, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }
}
