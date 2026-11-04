package io.ktor.http.parsing.regex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ji.e;
import ji.h;
import ji.i;
import ji.j;
import ji.k;
import ji.n;
import ji.r;
import ji.s;
import ji.u;
import ji.v;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nRegexParserGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1878#2,3:73\n*S KotlinDebug\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n*L\n41#1:73,3\n*E\n"})
public final class c {
    private static final void a(Map<String, List<Integer>> map, String str, int i10) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer numValueOf = Integer.valueOf(i10);
        List<Integer> list = map.get(str);
        Intrinsics.checkNotNull(list);
        list.add(numValueOf);
    }

    @NotNull
    public static final n b(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new b(new Regex(d(eVar, linkedHashMap, 0, false, 6, null).b()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final a c(e eVar, Map<String, List<Integer>> map, int i10, boolean z10) {
        char c10;
        if (eVar instanceof v) {
            return new a(Regex.f313196c.c(((v) eVar).c()), 0, false, 6, null);
        }
        if (eVar instanceof s) {
            return new a(((s) eVar).c(), 0, false, 6, null);
        }
        if (eVar instanceof j) {
            j jVar = (j) eVar;
            a aVarD = d(jVar.b(), map, i10 + 1, false, 4, null);
            a(map, jVar.c(), i10);
            return new a(aVarD.b(), aVarD.a(), true);
        }
        if (eVar instanceof ji.c) {
            StringBuilder sb2 = new StringBuilder();
            int iA = z10 ? i10 + 1 : i10;
            int i11 = 0;
            for (Object obj : ((ji.c) eVar).a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a aVarC = c((e) obj, map, iA, true);
                if (i11 != 0 && (eVar instanceof k)) {
                    sb2.append("|");
                }
                sb2.append(aVarC.b());
                iA += aVarC.a();
                i11 = i12;
            }
            int i13 = iA - i10;
            if (z10) {
                i13--;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return new a(string, i13, z10);
        }
        if (eVar instanceof u) {
            if (eVar instanceof i) {
                c10 = '?';
            } else if (eVar instanceof h) {
                c10 = '*';
            } else {
                if (!(eVar instanceof ji.b)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + eVar).toString());
                }
                c10 = '+';
            }
            a aVarC2 = c(((u) eVar).b(), map, i10, true);
            return new a(aVarC2.b() + c10, aVarC2.a(), false, 4, null);
        }
        if (eVar instanceof ji.a) {
            int i14 = 7 & 0;
            return new a(AbstractJsonLexerKt.BEGIN_LIST + Regex.f313196c.c(((ji.a) eVar).c()) + AbstractJsonLexerKt.END_LIST, 0, false, 6, null);
        }
        if (!(eVar instanceof r)) {
            throw new IllegalStateException(("Unsupported grammar element: " + eVar).toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AbstractJsonLexerKt.BEGIN_LIST);
        r rVar = (r) eVar;
        sb3.append(rVar.c());
        sb3.append(l.f335457d);
        sb3.append(rVar.d());
        sb3.append(AbstractJsonLexerKt.END_LIST);
        return new a(sb3.toString(), 0, false, 6, null);
    }

    static /* synthetic */ a d(e eVar, Map map, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c(eVar, map, i10, z10);
    }
}
