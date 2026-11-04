package io.ktor.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n65#2,18:148\n1869#3,2:166\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n21#1:148,18\n142#1:166,2\n*E\n"})
public final class e {
    public static final /* synthetic */ <T> a<T> a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        return new a<>(name, new ri.b(dVarD, null));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Please use `AttributeKey` class instead", replaceWith = @kotlin.b1(expression = "AttributeKey", imports = {}))
    public static /* synthetic */ void b() {
    }

    public static final void c(@NotNull b bVar, @NotNull b other) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<T> it = other.b().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.a(aVar, other.f(aVar));
        }
    }
}
