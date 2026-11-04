package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDataConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConversion.kt\nio/ktor/client/plugins/DataConversion\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,28:1\n21#2:29\n65#3,18:30\n*S KotlinDebug\n*F\n+ 1 DataConversion.kt\nio/ktor/client/plugins/DataConversion\n*L\n17#1:29\n17#1:30,18\n*E\n"})
public final class f implements z<mi.c.a, mi.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f294788a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<mi.c> f294789b;

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(mi.c.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(mi.c.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294789b = new io.ktor.util.a<>("DataConversion", new ri.b(dVarD, sVarA));
    }

    private f() {
    }

    @Override // io.ktor.client.plugins.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull mi.c plugin, @NotNull io.ktor.client.c scope) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(scope, "scope");
    }

    @Override // io.ktor.client.plugins.z
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public mi.c a(@NotNull Function1<? super mi.c.a, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        mi.c.a aVar = new mi.c.a();
        block.invoke(aVar);
        return new mi.c(aVar);
    }

    @Override // io.ktor.client.plugins.z
    @NotNull
    public io.ktor.util.a<mi.c> getKey() {
        return f294789b;
    }
}
