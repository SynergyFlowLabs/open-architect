package io.ktor.client;

import io.ktor.utils.io.r0;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHttpClientJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientJvm.kt\nio/ktor/client/HttpClientJvmKt\n+ 2 ServiceLoader.kt\nio/ktor/util/reflect/ServiceLoaderKt\n*L\n1#1,48:1\n47#2:49\n23#2,2:50\n22#2,4:52\n*S KotlinDebug\n*F\n+ 1 HttpClientJvm.kt\nio/ktor/client/HttpClientJvmKt\n*L\n44#1:49\n44#1:50,2\n44#1:52,4\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.engine.l<?> f294376a;

    static {
        io.ktor.client.engine.l<?> lVarA;
        Iterator it = ServiceLoader.load(k.class, k.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        k kVar = (k) kotlin.sequences.o.F0(kotlin.sequences.o.e(it));
        if (kVar == null || (lVarA = kVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f294376a = lVarA;
    }

    @r0
    @NotNull
    public static final c b(@NotNull Function1<? super j<?>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return p.d(f294376a, block);
    }

    public static /* synthetic */ c c(Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return m.d((j) obj2);
                }
            };
        }
        return b(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.f312394a;
    }

    private static /* synthetic */ void e() {
    }
}
