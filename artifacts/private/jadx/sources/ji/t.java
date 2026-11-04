package ji;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nParserDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/SequenceGrammar\n+ 2 ParserDsl.kt\nio/ktor/http/parsing/ParserDslKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n57#2,2:64\n59#2,2:67\n61#2:70\n1869#3:66\n1870#3:69\n*S KotlinDebug\n*F\n+ 1 ParserDsl.kt\nio/ktor/http/parsing/SequenceGrammar\n*L\n29#1:64,2\n29#1:67,2\n29#1:70\n29#1:66\n29#1:69\n*E\n"})
public final class t extends e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<e> f307456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull List<? extends e> sourceGrammars) {
        super(null);
        Intrinsics.checkNotNullParameter(sourceGrammars, "sourceGrammars");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sourceGrammars) {
            if (obj instanceof t) {
                CollectionsKt.addAll(arrayList, ((c) obj).a());
            } else {
                arrayList.add(obj);
            }
        }
        this.f307456a = arrayList;
    }

    @Override // ji.c
    @NotNull
    public List<e> a() {
        return this.f307456a;
    }
}
