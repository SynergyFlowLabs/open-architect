package io.ktor.client.plugins.sse;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nClientSSESession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientSSESession.kt\nio/ktor/client/plugins/sse/ClientSSESessionKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,237:1\n135#1,2:256\n65#2,18:238\n65#2,18:258\n*S KotlinDebug\n*F\n+ 1 ClientSSESession.kt\nio/ktor/client/plugins/sse/ClientSSESessionKt\n*L\n174#1:256,2\n136#1:238,18\n174#1:258,18\n*E\n"})
public final class c0 {
    public static final /* synthetic */ <T> T a(o0 o0Var, String str) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        if (str == null) {
            return null;
        }
        Function2<ri.b, String, Object> function2T0 = o0Var.T0();
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        T t10 = (T) function2T0.invoke(new ri.b(dVarD, null), str);
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        return t10;
    }

    public static final /* synthetic */ <T> T b(o0 o0Var, li.d<String> event) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        String data = event.getData();
        if (data == null) {
            return null;
        }
        Function2<ri.b, String, Object> function2T0 = o0Var.T0();
        Intrinsics.reifiedOperationMarker(4, "T?");
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, "T?");
        } catch (Throwable unused) {
        }
        T t10 = (T) function2T0.invoke(new ri.b(dVarD, null), data);
        Intrinsics.reifiedOperationMarker(2, "T?");
        return t10;
    }
}
