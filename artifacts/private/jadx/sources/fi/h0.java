package fi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,37:1\n65#2,18:38\n65#2,18:56\n65#2,18:75\n21#3:74\n*S KotlinDebug\n*F\n+ 1 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n*L\n19#1:38,18\n27#1:56,18\n12#1:75,18\n12#1:74\n*E\n"})
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<ri.b> f275245a;

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = j1.d(ri.b.class);
        try {
            sVarA = j1.A(ri.b.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f275245a = new io.ktor.util.a<>("BodyTypeAttributeKey", new ri.b(dVarD, sVarA));
    }

    @NotNull
    public static final io.ktor.util.a<ri.b> a() {
        return f275245a;
    }

    public static final /* synthetic */ <T> void b(y yVar, T t10) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (t10 == null) {
            yVar.k(io.ktor.http.content.v.f295763a);
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            kotlin.reflect.d dVarD = j1.d(Object.class);
            try {
                Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
            } catch (Throwable unused) {
            }
            yVar.l(new ri.b(dVarD, null));
            return;
        }
        if (t10 instanceof io.ktor.http.content.w) {
            yVar.k(t10);
            yVar.l(null);
            return;
        }
        yVar.k(t10);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD2 = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused2) {
        }
        yVar.l(new ri.b(dVarD2, null));
    }

    public static final void c(@NotNull y yVar, @Nullable Object obj, @NotNull ri.b bodyType) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        if (obj == null) {
            obj = io.ktor.http.content.v.f295763a;
        }
        yVar.k(obj);
        yVar.l(bodyType);
    }
}
