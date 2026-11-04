package ji;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nParserDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1869#2,2:64\n*S KotlinDebug\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n*L\n58#1:64,2\n*E\n"})
public final class p {
    @NotNull
    public static final e b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new a(value);
    }

    @NotNull
    public static final e c(@NotNull e grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new b(grammar);
    }

    public static final /* synthetic */ <T extends c> List<e> d(List<? extends e> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (obj instanceof c) {
                CollectionsKt.addAll(arrayList, ((c) obj).a());
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final e e(@NotNull e grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new h(grammar);
    }

    @NotNull
    public static final e f(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new i(new v(value));
    }

    @NotNull
    public static final e g(@NotNull e grammar) {
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new i(grammar);
    }

    @NotNull
    public static final Function0<e> h(@NotNull final Function1<? super f, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new Function0() { // from class: ji.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.i(block);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e i(Function1 function1) {
        f fVar = new f();
        function1.invoke(fVar);
        return g(fVar.a());
    }

    @NotNull
    public static final e j(@NotNull e eVar, @NotNull String name) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return new j(name, eVar);
    }

    @NotNull
    public static final e k(@NotNull String str, @NotNull e grammar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return m(new v(str), grammar);
    }

    @NotNull
    public static final e l(@NotNull e eVar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return m(eVar, new v(value));
    }

    @NotNull
    public static final e m(@NotNull e eVar, @NotNull e grammar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new k(CollectionsKt.listOf((Object[]) new e[]{eVar, grammar}));
    }

    @NotNull
    public static final e n(@NotNull String str, @NotNull e grammar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return p(new v(str), grammar);
    }

    @NotNull
    public static final e o(@NotNull e eVar, @NotNull String value) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return p(eVar, new v(value));
    }

    @NotNull
    public static final e p(@NotNull e eVar, @NotNull e grammar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        return new t(CollectionsKt.listOf((Object[]) new e[]{eVar, grammar}));
    }

    @NotNull
    public static final e q(char c10, char c11) {
        return new r(c10, c11);
    }
}
