package io.ktor.client.utils;

import io.ktor.http.d1;
import io.ktor.http.w0;
import io.ktor.utils.io.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHeadersUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadersUtils.kt\nio/ktor/client/utils/HeadersUtilsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,33:1\n21#2:34\n65#3,18:35\n*S KotlinDebug\n*F\n+ 1 HeadersUtils.kt\nio/ktor/client/utils/HeadersUtilsKt\n*L\n11#1:34\n11#1:35,18\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<List<String>> f295417a;

    static {
        s sVarI;
        kotlin.reflect.d dVarD = j1.d(List.class);
        try {
            sVarI = j1.i(j1.B(List.class, KTypeProjection.f312969c.e(j1.A(String.class))));
        } catch (Throwable unused) {
            sVarI = null;
        }
        f295417a = new io.ktor.util.a<>("DecompressionListAttribute", new ri.b(dVarD, sVarI));
    }

    @o0
    public static final void b(@NotNull w0 w0Var, @NotNull io.ktor.http.j1 method, @NotNull io.ktor.util.b attributes, boolean z10) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        io.ktor.http.j1.a aVar = io.ktor.http.j1.f295897b;
        if (Intrinsics.areEqual(method, aVar.d()) || Intrinsics.areEqual(method, aVar.e())) {
            return;
        }
        d1 d1Var = d1.f295782a;
        String str = w0Var.get(d1Var.x());
        if (str != null) {
            ((List) attributes.i(f295417a, new Function0() { // from class: io.ktor.client.utils.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m.d();
                }
            })).add(str);
        } else if (!z10) {
            return;
        }
        w0Var.remove(d1Var.x());
        w0Var.remove(d1Var.z());
    }

    public static /* synthetic */ void c(w0 w0Var, io.ktor.http.j1 j1Var, io.ktor.util.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        b(w0Var, j1Var, bVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return new ArrayList();
    }
}
