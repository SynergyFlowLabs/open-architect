package io.ktor.serialization.kotlinx;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nExtensionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtensionsJvm.kt\nio/ktor/serialization/kotlinx/ExtensionsJvmKt\n+ 2 ServiceLoader.kt\nio/ktor/util/reflect/ServiceLoaderKt\n*L\n1#1,13:1\n36#2:14\n23#2,2:15\n22#2,4:17\n*S KotlinDebug\n*F\n+ 1 ExtensionsJvm.kt\nio/ktor/serialization/kotlinx/ExtensionsJvmKt\n*L\n12#1:14\n12#1:15,2\n12#1:17,4\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<f> f296402a;

    static {
        Iterator it = ServiceLoader.load(f.class, f.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        f296402a = o.c3(o.e(it));
    }

    @NotNull
    public static final List<f> a() {
        return f296402a;
    }

    public static /* synthetic */ void b() {
    }
}
