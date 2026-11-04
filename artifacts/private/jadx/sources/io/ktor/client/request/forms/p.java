package io.ktor.client.request.forms;

import io.ktor.http.d1;
import io.ktor.http.u0;
import io.ktor.http.v0;
import io.ktor.http.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n231#1,2:289\n13472#2,2:282\n37#3:284\n36#3,3:285\n1#4:288\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt\n*L\n279#1:289,2\n38#1:282,2\n87#1:284\n87#1:285,3\n*E\n"})
public final class p {

    @SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$1\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,281:1\n21#2,3:282\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormDslKt$append$1\n*L\n231#1:282,3\n*E\n"})
    public static final class a implements Function0<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<x, Unit> f295293a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super x, Unit> function1) {
            this.f295293a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            Function1<x, Unit> function1 = this.f295293a;
            kotlinx.io.b bVar = new kotlinx.io.b();
            function1.invoke(bVar);
            return bVar;
        }
    }

    public static final void i(@NotNull b bVar, @NotNull String key, @NotNull v0 headers, @Nullable Long l10, @NotNull Function1<? super x, Unit> bodyBuilder) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        bVar.a(new q(key, new r(l10, new a(bodyBuilder)), headers));
    }

    public static final void j(@NotNull b bVar, @NotNull String key, @NotNull String filename, @Nullable io.ktor.http.m mVar, @Nullable Long l10, @NotNull Function1<? super x, Unit> bodyBuilder) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        w0 w0Var = new w0(0, 1, null);
        d1 d1Var = d1.f295782a;
        w0Var.a(d1Var.w(), "filename=" + u0.c(filename));
        if (mVar != null) {
            w0Var.a(d1Var.C(), mVar.toString());
        }
        bVar.a(new q(key, new r(l10, new a(bodyBuilder)), w0Var.build()));
    }

    public static /* synthetic */ void k(b bVar, String key, v0 headers, Long l10, Function1 bodyBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            headers = v0.f296123a.b();
        }
        if ((i10 & 4) != 0) {
            l10 = null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        bVar.a(new q(key, new r(l10, new a(bodyBuilder)), headers));
    }

    public static /* synthetic */ void l(b bVar, String str, String str2, io.ktor.http.m mVar, Long l10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        if ((i10 & 8) != 0) {
            l10 = null;
        }
        j(bVar, str, str2, mVar, l10, function1);
    }

    @NotNull
    public static final List<io.ktor.http.content.c0> m(@NotNull Function1<? super b, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        q[] qVarArr = (q[]) bVar.x().toArray(new q[0]);
        return n((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
    }

    @NotNull
    public static final List<io.ktor.http.content.c0> n(@NotNull q<?>... values) {
        io.ktor.http.content.c0 aVar;
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList();
        for (q<?> qVar : values) {
            String strA = qVar.a();
            final Object objB = qVar.b();
            v0 v0VarC = qVar.c();
            w0 w0Var = new w0(0, 1, null);
            d1 d1Var = d1.f295782a;
            w0Var.l(d1Var.w(), "form-data; name=" + u0.c(strA));
            w0Var.j(v0VarC);
            if (objB instanceof String) {
                aVar = new io.ktor.http.content.c0.d((String) objB, new Function0() { // from class: io.ktor.client.request.forms.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.o();
                    }
                }, w0Var.build());
            } else if (objB instanceof Number) {
                aVar = new io.ktor.http.content.c0.d(objB.toString(), new Function0() { // from class: io.ktor.client.request.forms.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.p();
                    }
                }, w0Var.build());
            } else if (objB instanceof Boolean) {
                aVar = new io.ktor.http.content.c0.d(String.valueOf(((Boolean) objB).booleanValue()), new Function0() { // from class: io.ktor.client.request.forms.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.q();
                    }
                }, w0Var.build());
            } else if (objB instanceof byte[]) {
                w0Var.l(d1Var.z(), String.valueOf(((byte[]) objB).length));
                aVar = new io.ktor.http.content.c0.b(new Function0() { // from class: io.ktor.client.request.forms.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.r(objB);
                    }
                }, new Function0() { // from class: io.ktor.client.request.forms.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.s();
                    }
                }, w0Var.build());
            } else if (objB instanceof c0) {
                if (objB instanceof kotlinx.io.b) {
                    w0Var.l(d1Var.z(), String.valueOf(ui.l.j((c0) objB)));
                }
                aVar = new io.ktor.http.content.c0.b(new Function0() { // from class: io.ktor.client.request.forms.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.t(objB);
                    }
                }, new Function0() { // from class: io.ktor.client.request.forms.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.u(objB);
                    }
                }, w0Var.build());
            } else if (objB instanceof r) {
                r rVar = (r) objB;
                Long lB = rVar.b();
                if (lB != null) {
                    w0Var.l(d1Var.z(), lB.toString());
                }
                aVar = new io.ktor.http.content.c0.b(rVar.a(), new Function0() { // from class: io.ktor.client.request.forms.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.v();
                    }
                }, w0Var.build());
            } else {
                if (!(objB instanceof io.ktor.client.request.forms.a)) {
                    throw new IllegalStateException(("Unknown form content type: " + objB).toString());
                }
                io.ktor.client.request.forms.a aVar2 = (io.ktor.client.request.forms.a) objB;
                Long lB2 = aVar2.b();
                if (lB2 != null) {
                    w0Var.l(d1Var.z(), lB2.toString());
                }
                aVar = new io.ktor.http.content.c0.a(aVar2.a(), w0Var.build());
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 r(Object obj) {
        return ui.l.c((byte[]) obj, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 t(Object obj) {
        return ((c0) obj).peek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Object obj) {
        ((c0) obj).close();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v() {
        return Unit.f312394a;
    }
}
